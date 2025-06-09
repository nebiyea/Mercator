ThisBuild / scalaVersion := "2.13.16"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "SeleniumChromeScala",
    libraryDependencies ++= Seq(
      "org.seleniumhq.selenium" % "selenium-java" % "4.20.0",
      "org.seleniumhq.selenium" % "selenium-support" % "4.20.0"

    )
  )
