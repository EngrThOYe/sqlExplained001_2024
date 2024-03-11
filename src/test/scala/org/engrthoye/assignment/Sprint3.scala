package org.engrthoye.assignment

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def task_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      ""

    ).show(false)

  }

}
