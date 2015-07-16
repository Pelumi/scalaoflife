package agoda

import scala.collection.mutable.Stack

/**
 *
 * Created by pasoktummarungsri on 3/30/15.
 */
case class ButterflyShape(size: Int) {

  def getButterfly: String = {
    var butterfly = "";
    val lines = Stack[String]()
    var i = 0;
    var line ="";
    for (i <- 1 to size) {
      if (i < size) {
        line = createLine(i);
        lines.push(line);
      }
      else {
        line = "+ " * (size) + "- " + "+ " * size + "\n";
      }
      butterfly += line
    }
    //get mirror image
    for (i <- 1 to size - 1) {
      val line = lines.pop();
      butterfly += line;
    }

    butterfly.trim
  }

  def printButterfly: Unit = {
    print(getButterfly)
  }

  def createLine(index: Int): String = {
    "+ " * index + " " * 2 * ((size * 2) - (index * 2) + 1) + "+ " * index + "\n";
  }
}