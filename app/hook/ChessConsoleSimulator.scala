package hook

import controller.ChessApplicationController

object ChessConsoleSimulator extends App {
  val userInstruction = println("Input chess piece & its position on chessboard e.g. 'Horse E3'")
  val chess = new ChessApplicationController

  chess.getPossibleMovesForSelectedPiece
}
