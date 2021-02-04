package helpers

import config.Properties
import models.pieces.King

class KingHelper(properties: Properties) {
  val row = King.apply().rowPosition
  val col = King.apply().colPosition

  def getKingMoves(p: Int, q: Int) = {
    val moves = for (i <- 0 until 8)
      yield {
        val x = p + row(i)
        val y = q + col(i)
        if (x >= 0 && y >= 0 && x < properties.chessboardGrid && y < properties.chessboardGrid)
          s"${properties.chessboardCellsLabel(x)}$y"
      }
    moves.mkString(", ")
  }
}
