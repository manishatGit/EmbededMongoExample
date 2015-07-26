name := "mongotest"

version := "0.1"

scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.9.2",
  "org.mongodb" %% "casbah" % "2.6.3",
  "com.github.simplyscala" %% "scalatest-embedmongo" % "0.2.3-SNAPSHOT"
)

