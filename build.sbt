ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scala-slick-example"
  )

lazy val slickVersion = "3.3.3"
lazy val h2databaseVersion = "2.1.210"
lazy val postgresqlVersion = "42.3.3"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % slickVersion,
  "com.typesafe.slick" %% "slick-testkit" % slickVersion % "test",
  "org.slf4j" % "slf4j-nop" % "1.7.36",
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
  "org.postgresql" % "postgresql" % postgresqlVersion
)