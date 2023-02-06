package me.vrnsky.tictactoe.model

class Board(val board: Array<Array<String>>) {

    fun isEmptyCell(x: Int, y: Int): Boolean {
        return board[x][y] == "empty"
    }

    fun isMovePossible(enemy: Player, x: Int, y: Int): Boolean {
        return isEmptyCell(x, y) && board[x][y] != enemy.shape
    }
}