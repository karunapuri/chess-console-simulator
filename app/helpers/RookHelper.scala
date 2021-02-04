package helpers

import config.Properties
import models.pieces.Rook

class RookHelper(properties: Properties) {

  val rook = new Rook
  var row = rook.rowPosition
  var col = rook.colPosition
  var moves = rook.possibleMoves

  def getRookMoves(p: Int, q: Int) = {
    // Rook possible moves (i+1,j) (i-1,j) (i,j+1) (i,j-1)
    for (i <- 1 until 8)
      yield {
        row = p + i
        col = q
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }
        row = p - i
        col = q
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }
        row = p
        col = q + i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }
        row = p
        col = q - i
        if (row > 0 && col > 0 && row <= properties.chessboardGrid && col <= properties.chessboardGrid) {
          moves = moves:+ (s"${properties.chessboardCellsLabel(row)}$col")
        }
      }
    moves.sorted.mkString(", ")
  }
}
