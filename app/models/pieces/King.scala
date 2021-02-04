package models.pieces

case class King(rowPosition: Array[Int] = Array(1, 1, -1, -1, 1, 0, -1, 0),
                colPosition: Array[Int] = Array(1, -1, 1, -1, 0, 1, 0, -1))
