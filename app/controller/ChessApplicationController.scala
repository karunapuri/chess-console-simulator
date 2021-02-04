package controller

import config.{CellRowPositionEnum, Properties}
import helpers._
import scala.io.StdIn.readLine

class ChessApplicationController {

  val inputPiece = readLine()
  val parsedInput = inputPiece.split(" ")
  val pieceTypeFromInput = parsedInput.head.toLowerCase
  val piecePositionFromInput = parsedInput.last.split("")

  val properties = new Properties
  val knightMoves = new KnightHelper(properties)
  val kingMoves = new KingHelper(properties)
  val pawnMoves = new PawnHelper(properties)
  val rookMoves = new RookHelper(properties)
  val bishopMoves = new BishopHelper(properties)
  val queenMoves = new QueenHelper(properties)

  def getPossibleMovesForSelectedPiece = {

    val rowPosition = piecePositionFromInput.head.toUpperCase match {
      case CellRowPositionEnum.RowA => 1
      case CellRowPositionEnum.RowB => 2
      case CellRowPositionEnum.RowC => 3
      case CellRowPositionEnum.RowD => 4
      case CellRowPositionEnum.RowE => 5
      case CellRowPositionEnum.RowF => 6
      case CellRowPositionEnum.RowG => 7
      case CellRowPositionEnum.RowH => 8
    }
    val colPosition = piecePositionFromInput.last.toInt

    val possibleMovesForSelectedPiece = pieceTypeFromInput match {
      case "king" => kingMoves.getKingMoves(rowPosition, colPosition)
      case "queen" => queenMoves.getQueenMoves(rowPosition, colPosition)
      case "bishop" => bishopMoves.getBishopMoves(rowPosition, colPosition)
      case "knight" => knightMoves.getKnightMoves(rowPosition, colPosition)
      case "rook" => rookMoves.getRookMoves(rowPosition, colPosition)
      case "pawn" => pawnMoves.getPawnMoves(rowPosition, colPosition)
    }
    possibleMovesForSelectedPiece
  }

  println(s"Possible moves for selected piece ${parsedInput.head}: "+getPossibleMovesForSelectedPiece)
}
