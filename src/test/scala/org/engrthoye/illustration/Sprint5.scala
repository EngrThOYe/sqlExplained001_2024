package org.engrthoye.illustration

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint5 extends SparkBase{

  @Test
  def examplle_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT DISTINCT model FROM MTcars"

    ).show(false)
  }

  @Test
  def examplle_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT DISTINCT gear FROM MTcars"

    ).show(false)
  }

  @Test
  def examplle_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT DISTINCT carb FROM MTcars"

    ).show(false)
  }

  @Test
  def examplle_4(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT DISTINCT carb, gear FROM MTcars"

    ).show(false)
  }
  @Test
  def examplle_5(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (DISTINCT carb, gear) FROM MTcars"

    ).show(false)
  }

  @Test
  def examplle_6(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (DISTINCT carb, gear) AS mycount_col FROM MTcars"

    ).show(false)
  }

  @Test
  def examplle_7(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT COUNT (*) AS mycount_col FROM (SELECT DISTINCT carb, gear FROM MTcars)"

    ).show(false)
  }

  @Test
  def examplle_8(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * FROM MTcars WHERE gear = 4"

    ).show(false)
  }

  @Test
  def examplle_9(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model FROM MTcars WHERE gear = 4"

    ).show(false)
  }

  @Test
  def examplle_10(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, qsec FROM MTcars WHERE am < 1"

    ).show(false)
  }

  @Test
  def examplle_11(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT model, qsec FROM MTcars WHERE model = 'Mazda RX4 Wag'"

    ).show(false)
  }



}
