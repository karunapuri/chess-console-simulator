package models.pieces

import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class RookSpec extends FunSpec with Matchers {

  describe("Rook Piece") {
    val rookExpected = new Rook()

    it("should check for rook construct initial values"){
      Assert.assertEquals(1, rookExpected.rowPosition)
      Assert.assertEquals(1, rookExpected.colPosition)
      Assert.assertEquals(Seq.empty[String], rookExpected.possibleMoves)
    }
  }
}
