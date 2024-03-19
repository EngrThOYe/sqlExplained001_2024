package org.engrthoye.illustration

import org.engrthoye.SparkBase
import org.junit.Test


class Sprint3 extends SparkBase{

  @Test
  def examplle_1(): Unit = {
    readParquetTable("MTcars")
    spark.sql(

      ""

    ).show(false)

  }

}
