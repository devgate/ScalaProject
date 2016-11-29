name := "ScalaProject"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "1.6.1"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "1.6.1"

resolvers += Resolver.mavenLocal