ThisBuild / organization := "com.github.avandendaele"

ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := "2.13.1"

lazy val root = project.in(file("."))
  .enablePlugins(PlayScala)
  .disablePlugins(PlayLayoutPlugin)
  .settings(
    libraryDependencies += Dependencies.PlayJson,
    name := "play-28-template"
  )