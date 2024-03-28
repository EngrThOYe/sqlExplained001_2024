package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint4 extends SparkBase{

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

      "SELECT hp, wt, am FROM MTcars"

    ).show(false)

  }
  @Test
  def task_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTcars"

    ).show(false)

  }

}