package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object compressinglibs extends Bundle() {

  def install: Results = {

		Seq("yum", "install", "-y", "gzip", "libzip", "zip", "unzip", "zlib*", "bzip2", "lzo", "lzop") ->-
    success(s"${bundleName} is installed")
  }

}
