package helpers

import config.Properties
import models.pieces.Bishop

class BishopHelper(properties: Properties) {

  val bishop = new Bishop
  var row = bishop.rowPosition
  var col = bishop.colPosition
  var moves = bishop.possibleMoves

  def getBishopMoves(p: Int, q: Int) = {
    // Possible bishop moves (i+1,j-1) (i+1,j+1) (i-1,j+1) (i-1,j-1)
    for (i <- 1 until 8)
      yield {
        row = p + i
        col = q - i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }

        row = p + i
        col = q + i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }

        row = p - i
        col = q + i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }

        row = p - i
        col = q - i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }
      }
    moves.sorted.mkString(", ")
  }

}
