package org.engrthoye.illustration

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def example_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp FROM MTcars"

    ).show(false)
  }

  @Test
  def example_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def example_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def example_4(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear, disp, gear, drat, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def example_5(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTcars"

    ).show(false)
  }

}
