package models.pieces

import org.junit.Assert
import org.scalatest.{FunSpec, Matchers}

class KnightSpec extends FunSpec with Matchers {

  describe("Knight Piece") {

    it("should check for Knight construct initial values"){
      Assert.assertEquals(8, Knight.apply().rowPosition.size)
      Assert.assertEquals(8, Knight.apply().colPosition.size)
    }
  }
}
