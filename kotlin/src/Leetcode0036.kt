fun main(args: Array<String>) {
    val board = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    val result = Leetcode0036().isValidSudoku(board)
    print(result)
}

class Leetcode0036 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // rows
        for (i in board.indices) {
            val row = mutableSetOf<Char>()
            for (j in board[i].indices) {
                if (board[i][j] == '.')
                    continue
                else if (board[i][j] < '1' || board[i][j] > '9')
                    return false
                else if (row.contains(board[i][j]))
                    return false
                else
                    row.add(board[i][j])
            }
        }

        // cols
        for (i in board[0].indices) {
            val col = mutableSetOf<Char>()
            for (j in board.indices) {
                if (board[j][i] == '.')
                    continue
                else if (board[j][i] < '1' || board[j][i] > '9')
                    return false
                else if (col.contains(board[j][i]))
                    return false
                else
                    col.add(board[j][i])
            }
        }

        // boxes
        for (mr in 0..2) { // multiplierRow
            for (mc in 0..2) { //multiplierCol
                // single box
                val box = mutableSetOf<Char>()
                for (i in 0..2) {
                    for (j in 0..2) {
                        val cur = board[i + 3 * mr][j + 3 * mc]
                        if (cur == '.')
                            continue
                        else if (cur < '1' || cur > '9' && cur != '.')
                            return false
                        else if (box.contains(cur))
                            return false
                        else
                            box.add(cur)
                    }
                }
            }
        }

        return true
    }
}