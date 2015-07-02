package ohnosequencesBundles.statika

import ohnosequences.statika._, bundles._, instructions._


case object compressinglibs extends Bundle() {

  def install: Results = {
    // do someting here
    success(s"${bundleName} is installed")
  }

}
