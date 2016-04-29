name := "scala-abt"

organization := "com.slamdata"

scalaVersion := "2.11.8"

// Resolvers
resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

// Compile options
// http://tpolecat.github.io/2014/04/11/scalac-flags.html
scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Xfuture",
  "-Yno-imports"
)

// Compile Dependencies
libraryDependencies ++= Seq(
  "org.scalaz"     %% "scalaz-core" % "7.2.2",
  "org.scalacheck" %% "scalacheck"  % "1.12.5" % "test"
)

// Wartremover
wartremoverErrors ++= Warts.allBut(Wart.Throw)

// Kind Projector
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.7.1")
