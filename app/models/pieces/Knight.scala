package models.pieces

case class Knight(rowPosition: Array[Int] = Array(2, 1, -1, -2, -2, -1, 1, 2),
                  colPosition: Array[Int] = Array(1, 2, 2, 1, -1, -2, -2, -1))
