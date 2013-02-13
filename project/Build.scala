import sbt._
import Keys._

object ApplicationBuild extends Build {

    lazy val simplespecProject = RootProject(uri("git://github.com/randhindi/simplespec.git"))
   
    //The main project
    val main = Project(id = "jerkson", base = file(".")).settings(

    ).dependsOn(simplespecProject)

}