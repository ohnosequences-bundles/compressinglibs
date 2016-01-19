package ohnosequencesBundles.statika

import ohnosequences.statika._


case object compressinglibs extends Bundle() {

  def instructions: AnyInstructions =
		cmd("yum")("install", "-y", "gzip", "libzip", "zip", "unzip", "zlib*", "bzip2", "lzo", "lzop")
}
