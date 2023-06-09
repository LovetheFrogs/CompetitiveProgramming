# Problem 11459 - Snakes and Ladders

Snakes and Ladders is a board game played on a 10 by 10 grid. The squares of the grid are numbered
1 to 100. Each player has a token which is placed on the square numbered 1 at the beginning of the
game. Players take turns rolling a die which provides a random number between 1 and 6. After rolling,
the player advances his or her token the number of squares shown on the die. If this would put the
token past the square numbered 100, the token is advanced to 100. After advancing, if the token is on
a square containing the bottom of a ladder, the token must be moved to the square containing the top
of the ladder. Similarly, if the token is on a square containing the mouth of a snake, the token must be
moved to the square containing the tail of the snake. No square contains more than one endpoint of
any snake or ladder. The square numbered 100 does not contain the mouth of a snake or the bottom
of a ladder. A player wins when his or her token reached the square numbered 100. At that point, the
game ends.

Given the configuration of the snakes and ladders on a game board and a sequence of die rolls, you
are to determine the positions of all the tokens on the game board. The sequence of die rolls need not
be complete (i.e. it need not lead to any player winning). The sequence of die rolls may also continue
after the game is over; in this case, the die rolls after the end of the game should be ignored.

## Input

The first line is the number of test cases to follow. The test cases follow, one after another; the format
of each test case is the following:

The first line contains three positive integers: the number *a* of players, the number *b* of snakes or
ladders, and the number *c* of die rolls. There will be no more than *1000000* players and no more than
*1000000* die rolls. Each of the next *b* lines contains two integers specifying a snake or ladder. The first
integer indicates the square containing the mouth of the snake or the bottom of the ladder. The second
integer indicates the square containing the tail of the snake or the top of the ladder. The following *c*
lines each contain one integer giving number rolled on the die.

## Output

For each player, output a single line containing a string of the form *Position of player **N** is **P**.*,
where *N* is replaced with the number of the player and *P* is replaced with the final position of the
player.

## Sample Input

```
1
3 1 3
4 20
3
4
5
```

## Sample Output

```
Position of player 1 is 20.
Position of player 2 is 5.
Position of player 3 is 6.
```
