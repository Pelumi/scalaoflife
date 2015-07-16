package agoda

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by pasoktummarungsri on 3/30/15.
 */
class ButterflyShapeSpec extends FlatSpec with Matchers {

  val expected2: String = "+       +\n+ + - + +\n+       +"
  val expected4: String = "+               +\n+ +           + +\n+ + +       + + +\n+ + + + - + + + +\n+ + +       + + +\n+ +           + +\n+               +"


  "If n = 2" should "print the right shpae" in {
    val b2 = ButterflyShape(2);
    val result: String = b2.getButterfly

    print("res: \n" + result + "\n")

    result should be (expected2)
  }

  "If n = 4" should "print the right shpae" in {
    val b4 = agoda.ButterflyShape(4);
    val result : String = b4.getButterfly

    result should be (expected2)
  }

}
