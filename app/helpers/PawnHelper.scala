package helpers

import config.Properties

class PawnHelper(properties: Properties) {

  def getPawnMoves(p: Int, q: Int) = {
    val x = p + 1 // +ve as only forward direction allowed as per assumptions
    val y = q
    if (x >= 0 && y >= 0 && x < properties.chessboardGrid && y < properties.chessboardGrid)
      s"${properties.chessboardCellsLabel(x)}$y"
  }
}
