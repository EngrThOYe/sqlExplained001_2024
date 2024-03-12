package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{
  //TODO
  // change example_1 _2 and _3 to task_1 _2 _3
  // apply .show(false) at the end of the query to display your query output Line 19, 30, 43
  // optional, implement the Illustration in the video under the illustration.sprint3 yo can copy it from engrthoye branch
  @Test
  def task_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT disp from MTcars"

    ).show(false)

  }

  @Test
  def task_2(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT hp, wt, am from MTcars"

    ).show(false)

  }

  @Test
  def task_3(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      "SELECT * from MTcars"

    ).show(false)

  }

}
