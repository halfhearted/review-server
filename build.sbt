import Dependencies._

ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

val AkkaVersion = "2.6.5"

lazy val root = (project in file("."))
  .settings(
    name := "halfhearted",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion,
    libraryDependencies += "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
