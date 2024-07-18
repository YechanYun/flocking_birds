ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "flocking_boids",
    libraryDependencies ++= Seq(
      "org.scalafx" %% "scalafx" % "20.0.0-R31",
      "org.openjfx" % "javafx-base" % "22.0.1" classifier "linux",
      "org.openjfx" % "javafx-controls" % "22.0.1" classifier "linux",
      "org.openjfx" % "javafx-fxml" % "22.0.1" classifier "linux",
      "org.openjfx" % "javafx-graphics" % "20" classifier "linux",
    )
  )
