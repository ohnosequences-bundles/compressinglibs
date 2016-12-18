name := "compressinglibs"
organization := "ohnosequences-bundles"
description := "A bundle for compressinglibs tool"

publishBucketSuffix := "era7.com"

releaseOnlyTestTag := "ohnosequencesBundles.test.ReleaseOnlyTest"

resolvers += "Era7 public maven releases" at s3("releases.era7.com").toHttps(s3region.value.toString)

libraryDependencies += "ohnosequences" %% "statika" % "2.0.0"
