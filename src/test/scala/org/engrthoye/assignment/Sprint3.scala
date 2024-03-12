package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def examplle_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp from MTcars"

    )

  }

  @Test
  def examplle_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT hp, wt, am from MTcars"

    )

  }

  @Test
  def examplle_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * from MTcars"

    )

  }

}
