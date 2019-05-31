name := "sphinx_play"
 
version := "1.0" 
      
lazy val `sphinx_play` = (project in file(".")).enablePlugins(PlayScala)
      
scalaVersion := "2.12.8"

libraryDependencies += guice

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.0" % "test"
)
