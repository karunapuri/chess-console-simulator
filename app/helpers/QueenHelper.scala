package helpers

import config.Properties

class QueenHelper(properties: Properties) {

  def getQueenMoves(p: Int, q: Int) = {
    val moves = for {
      i <- 1 until 9
      j <- 1 until 9
      if(i!=p || j!=q)
    }
      yield {
        s"${properties.chessboardCellsLabel(i)}$j"
      }
    moves.mkString(", ")
  }
}
