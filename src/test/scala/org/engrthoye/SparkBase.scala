package org.engrthoye

abstract class SparkBase extends SparkConfig {

  def readParquetTable(tableName: String) = {
    val dataFrame = spark.read.parquet(getClass.getResource(s"/tableserver/parquet/$tableName.parquet").getPath.replace("%20"," "))
    dataFrame.createOrReplaceTempView(tableName)
    dataFrame.show(false)
  }
}
