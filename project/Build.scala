import sbt._
import Keys._
import com.github.retronym.SbtOneJar

object ApplicationBuild extends Build {
   
    //The main project
    val main = Project(id = "jerkson", base = file(".")).settings(
    	(Seq(exportJars := true) ++ Defaults.defaultSettings ++ SbtOneJar.oneJarSettings):_*
    )

}