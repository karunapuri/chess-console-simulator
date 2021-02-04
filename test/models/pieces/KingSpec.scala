package models.pieces

import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class KingSpec extends FunSpec with Matchers {

  describe("King Piece") {

    it("should check for king construct initial values"){
      Assert.assertEquals(8, King.apply().rowPosition.size)
      Assert.assertEquals(8, King.apply().colPosition.size)
    }
  }
}
