package agoda

import org.scalatest.{Matchers, FlatSpec}

/**
  * Created by pasoktummarungsri on 3/30/15.
  */
class DiamondShapeSpec extends FlatSpec with Matchers {

  val expected3 = "  +\n+ + +\n  +"

  val expected5 = "    +\n  + + +\n+ + + + +\n  + + +\n    +"

  "If n = 3" should "print the right shpae" in {
    val d3 = DiamondShape(3);
    val result = d3.getDiamond;

    result should be (expected3)
  }

  "If n = 5" should "print the right shpae" in {
    val d5 = DiamondShape(5);
    val result = d5.getDiamond;

    result should be (expected5)
  }
}
