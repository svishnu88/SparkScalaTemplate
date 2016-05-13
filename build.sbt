name := "SparkScalaTemplate"

version := "1.0"

scalaVersion := "2.10.4"

sparkVersion := "1.6.0"

sparkComponents ++= Seq("core", "streaming", "hive-thriftserver", "mllib")

javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:MaxPermSize=2048M", "-XX:+CMSClassUnloadingEnabled")
    