package org.engrthoye.illustration

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def example_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp FROM MTCars"

    ).show(false)

  }

  @Test
  def example_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT hp, wt, am FROM MTCars"

    ).show(false)

  }

  @Test
  def example_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTCars"

    ).show(false)

  }

}
