# chess-console-simulator

## Chessboard:
```
The	chessboard is an 8x8 grid with 64 cells in it.
With 8 rows (A,	B, C….H) and 8 columns (1, 2, 3…. 8), each cell	can	be uniquely	identified with its cell number.
```

## controllers.Chess models.pieces and their movements:
``` 6 unique types of models.pieces of chess with unique types	of movements are:
1. King – Can move only 1 step at a time in	all	8 directions	(horizontal, vertical	
and	diagonal)
2. Queen – Can move across the board in	all	8 directions
3. Bishop – Can	move across	the	board only diagonally
4. Horse – Can move across the board only in 2.5 steps (2 vertical steps and 1 horizontal step)
5. Rook – Can move across the board	only vertically	and	horizontally
```
## Sample inputs and outputs:
```
Input	– “King	D5”
Output	– “E5, E6, D6, C6, C5, C4, D4, E4”
```

## Assumption:
```
Assume that the	board is empty.	This	means	that	the	pawn	cannot	move	
diagonally
```

## Folder Structure for Source Code & Output File
```
app
  config
  controller
  helpers
  hook - With main Method Definition in ChessConsoleSimulator
  models
test
  config
  controller
  models
```

### Run Application 
```
    1. Deploy appliaction from directory hook obj. with main defintion i.e. ChessConsoleSimulator.scala 
```

### Console sample Output
```
Input chess piece & its position on chessboard e.g. 'Horse E3'
<user input entered> 'queen d5' or 'Queen D5'
<console output> 'Possible moves for selected piece queen: A1, A2, A3, A4, A5, A6, A7, A8, B1, B2, B3, B4, B5, B6, B7, B8, C1, C2, C3, C4, C5, C6, C7, C8, D1, D2, D3, D4, D6, D7, D8, E1, E2, E3, E4, E5, E6, E7, E8, F1, F2, F3, F4, F5, F6, F7, F8, G1, G2, G3, G4, G5, G6, G7, G8, H1, H2, H3, H4, H5, H6, H7, H8'

Process finished with exit code 0
```