package helpers

import config.Properties
import models.pieces.Knight

class KnightHelper(properties: Properties) {

  val row = Knight.apply().rowPosition
  val col = Knight.apply().colPosition

  def getKnightMoves(p: Int, q: Int) = {
    val moves = for (i <- 0 until 8)
      yield {
        val x = p + row(i)
        val y = q + col(i)
        if (x >= 0 && y >= 0 && x < properties.chessboardGrid && y < properties.chessboardGrid )
          s"${properties.chessboardCellsLabel(x)}$y"
      }
    moves.mkString(", ")
  }
}
