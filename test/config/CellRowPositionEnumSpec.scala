package config

import org.scalatest.{FunSpec, Matchers}

class CellRowPositionEnumSpec extends FunSpec with Matchers {
  describe("Cell Row Position Enumerations"){

    it("should check all possible enumerations") {
      CellRowPositionEnum.RowA should be ("A")
      CellRowPositionEnum.RowB should be ("B")
      CellRowPositionEnum.RowC should be ("C")
      CellRowPositionEnum.RowD should be ("D")
      CellRowPositionEnum.RowE should be ("E")
      CellRowPositionEnum.RowF should be ("F")
      CellRowPositionEnum.RowG should be ("G")
      CellRowPositionEnum.RowH should be ("H")
    }
  }
}
