package org.engrthoye

abstract class SparkBase extends SparkConfig {

  def readParquetTable(tableName: String) = {
    val dataFrame = spark.read.parquet(s"/Users/mo_baller_g/IdeaProjects/sqlExplained001_2024/src/test/resources/tableserver/parquet/$tableName.parquet")
    dataFrame.createOrReplaceTempView(tableName)
    dataFrame.show(false)
  }
}
