package org.engrthoye

import org.apache.spark.sql.SparkSession

trait SparkConfig {
  val spark :SparkSession = SparkSession
    .builder()
    .master("local[4]")
    .appName("test")
    .config("spark.ui.enable", "true")
    .getOrCreate()
}
