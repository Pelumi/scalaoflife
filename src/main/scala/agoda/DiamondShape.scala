package agoda

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class DiamondShape(size: Int) {

  def getDiamond: String = {
    var diamond = ""
    if (size == 1) {
      diamond = "+\n"
    }
    else {
      var a = 1
      var n = 0
      var d = 2
      var i = 0

      for (i <- 1 to size) {

        n = n + 1;
        val current: Int = arithmeticProgression(a, n, d)
        //an alternative approach is to use a stack to hold the lines halfway then print the mirror image
        //this resets the sequence giving it a common diff of -2 and making it's first term the current value
        if ((size + 1) / 2 == i) {
          a = current
          n = 1
          d = -2
        }
        diamond += createString(((size - current) / 2), current)
      }
    }
    diamond
  }

  def printDiamond: Unit = {
    print(getDiamond)
  }

  def arithmeticProgression(a: Int, n: Int, d: Int): Int = {
    a + (n - 1) * d
  }

  def createString(spaceCount: Int, plusCount: Int): String = {
    " " * (2 * spaceCount) + "+ " * (plusCount - 1) + "+" + "\n"
  }
}