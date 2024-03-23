package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def task_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp FROM MTcars"

    ).show(false)
  }

  @Test
  def task_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def task_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def task_4(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, gear, disp, gear, drat, gear FROM MTcars"

    ).show(false)
  }

  @Test
  def task_5(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTcars"

    ).show(false)
  }

}
