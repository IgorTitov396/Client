name := "Client"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.5.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.4" % "test",
  "com.typesafe.akka" %% "akka-stream" % "2.5.4",
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.4" % "test",
  "com.typesafe.akka" %% "akka-remote" % "2.5.4",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "com.my_db" %% "my_db" % "0.0.1-SNAPSHOT"
)