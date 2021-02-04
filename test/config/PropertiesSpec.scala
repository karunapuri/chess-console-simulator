package config

import org.scalatest.{FunSpec, Matchers}

class PropertiesSpec extends FunSpec with Matchers {
  describe("Properties configuration's"){

    it("should check for all variables set in properties file") {
      new Properties {
        chessboardGrid should be (8)
        chessboardCellsLabel.size should be (9)
      }
    }
  }
}
