// Your sbt build file. Guides on how to write one can be found at
// http://www.scala-sbt.org/0.13/docs/index.html

scalaVersion := "2.10.4"

sparkVersion := "1.2.1"

sparkPackageName := "$$packageName$$"

// Don't forget to set the version
version := "0.0.1"

// All Spark Packages need a license
$$license$$

// Add Spark components this package depends on, e.g, "mllib", ....
// sparkComponents ++= Seq("sql", "mllib")

// uncomment and change the value below to change the directory where your zip artifact will be created
// spDistDirectory := target.value

// add any sparkPackageDependencies using sparkPackageDependencies.
// e.g. sparkPackageDependencies += "databricks/spark-avro:0.1"
