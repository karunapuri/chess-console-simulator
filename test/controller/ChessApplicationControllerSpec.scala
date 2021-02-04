package controller

import config.Properties
import helpers.{BishopHelper, KingHelper, KnightHelper}
import org.scalatest.{FunSpec, Matchers}
import org.specs2.mock.Mockito

class ChessApplicationControllerSpec extends FunSpec with Matchers with Mockito{
  describe("Chess Application Controller"){

    it("should test all params set for Application Controller") {
      new SetUp {
        mockKingMoves.row.size should be (8)
        mockKingMoves.col.size should be (8)

        mockKnightMoves.row.length should be (8)
        mockKnightMoves.col.length should be (8)

        mockBishopMoves.row should be (1)
        mockBishopMoves.col should be (1)
      }
    }
  }

  trait SetUp {
    val properties = new Properties
    val mockChessApplicationController = mock[ChessApplicationController]
    val mockKingMoves = new KingHelper(properties)
    val mockKnightMoves = new KnightHelper(properties)
    val mockBishopMoves = new BishopHelper(properties)
  }
}
