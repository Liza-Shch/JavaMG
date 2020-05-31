import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object LR10 {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("CounterDemo").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val spark = SparkSession.builder().appName(name = "TestApp").getOrCreate()
    val dataFile = spark.read
      .format("com.databricks.spark.csv")
      .option("header", true)
      .load("./russian_demography.csv")
    dataFile.createOrReplaceTempView("Demography")
    // Вывод года и spg по Самарской области
    spark.sql("SELECT year, npg FROM Demography WHERE region='Samara oblast'").show()
    // Вывод регионов и их урбанизации за 1990 год
    spark.sql("SELECT region, urbanization FROM Demography WHERE year='1990'").show()
    
    spark.stop()
  }

}
    
