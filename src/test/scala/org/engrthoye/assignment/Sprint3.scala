package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def task_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp FROM MTCars"

    ).show(false)

  }

  @Test
  def task_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT hp, wt, am FROM MTCars"

    ).show(false)

  }

  @Test
  def task_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTCars"

    ).show(false)

  }

}
