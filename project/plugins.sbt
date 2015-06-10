// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += "iBiblio Maven" at "http://mirrors.ibiblio.org/maven2/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version", "2.4.0"))

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")