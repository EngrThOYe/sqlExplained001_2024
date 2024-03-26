package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint5 extends SparkBase{

  @Test
  def task_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT DISTINCT disp FROM MTcars"

    ).show(false)

  }

  @Test
  def task_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (DISTINCT disp) FROM MTcars"

    ).show(false)

  }

  @Test
  def task_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (DISTINCT disp) AS disp_count FROM MTcars"

    ).show(false)

  }

  @Test
  def task_4(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (DISTINCT disp) AS disp_count FROM MTcars WHERE gear >= 4"

    ).show(false)

  }

  @Test
  def task_5(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (*) AS disp_count FROM (SELECT DISTINCT disp FROM MTcars WHERE gear >= 4 ) "

    ).show(false)

  }


}
