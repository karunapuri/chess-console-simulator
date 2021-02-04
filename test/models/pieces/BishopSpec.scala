package models.pieces

import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class BishopSpec extends FunSpec with Matchers {

  describe("Bishop Piece") {
    val bishopExpected = new Bishop()

    it("should check for bishop construct initial values"){
      Assert.assertEquals(1, bishopExpected.rowPosition)
      Assert.assertEquals(1, bishopExpected.colPosition)
      Assert.assertEquals(Seq.empty[String], bishopExpected.possibleMoves)
    }
  }
}
