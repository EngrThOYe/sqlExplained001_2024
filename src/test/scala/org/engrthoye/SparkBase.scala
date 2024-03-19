package org.engrthoye

abstract class SparkBase extends SparkConfig {

  def readParquetTable(tableName: String) = {
    val dataFrame = spark.read.parquet(s"/Users/apple/Downloads/ProjectFolder/sqlExplained001_2024/src/test/resources/tableserver/parquet/$tableName.parquet")
    dataFrame.createOrReplaceTempView(tableName)
    dataFrame.show(false)
  }
}


