# Problem 00462 - Bridge Hand Evaluator

In the card game "Bridge", players must assess the strength of their
hands prior to bidding against one another. Most players use a
point-count scheme which employs the following rules:
1. Each ace counts 4 points. Each king counts 3 points. Each queen
counts 2 points. Each jack counts one point.
2. Subtract a point for any king of a suit in which the hand holds no
other cards. 
3. Subtract a point for any queen in a suit in which the hand holds 
only zero or one other cards. 
4. Subtract a point for any jack in a suit in which the hand holds only zero, one, or two other cards. 
5. Add a point for each suit in which the hand contains exactly two cards. 
6. Add two points for each suit in which the hand contains exactly one card.
7. Add two points for each suit in which the hand contains no cards.

A suit is *stopped* if it contains an ace, or if it contains a king and
at least one other card, or if it contains a queen and at least two
other cards.

During the opening assessment, the three most common possibilities
are:
* If the hand evaluates to fewer than 14 points, then the player must pass.
* One may open bidding in a suit if the hand evaluates to 14 or more points. Bidding is always opened in one of the suits with the most
cards.
* One may open bidding in "no trump" if the hand evaluates to 16 or
more points *ignoring rules 5, 6, and 7* and if all four suits are
stopped. A no trump bid is always preferred over a suit bid when both
are possible.

## Input

Input to your program consists of a series of lines, each line
containing 13 cards. Each card consists of two characters. The first
represents the rank of the card: 'A', '2', '3', '4', '5', '6', '7', '8',
'9', 'T','J', 'Q', 'K'. The second represents the suit of the card: 'S',
'H', 'D', 'C', standing for "spades", "hearts","diamonds", and "clubs",
respectively.

## Output

For each line of the input, print one line containing the recommended
bid, either 'PASS', the first 'BID *suit*', where *suit* is 'S', 'H',
'D', or 'C' (sorted in this natural way if two or more are possible), or
'BID NO-TRUMP'.

**Note:** For the first example below, the evaluation starts with 6
points for the two kings, 4 for the ace, 6 for the three queens, and one
for the jack. To this tally of 17 points, we add 1 point for having only
two cards in spades, and subtract 1 for having a queen in spaces with
only one other card in spades. The resulting 17 points is enough to
justify opening in a suit.

The evaluation for *no-trump* is 16 points, since we cannot count the
one point for having only two spades. We cannot open in no-trump,
however, because the hearts suit is not stopped.

Hence we must open bidding in a suit. The two longest suits are clubs
and diamonds, with four cards each, so the possible outputs are 'BID C',
or 'BID D'.

## Sample Input

```
KS QS TH 8H 4H AC QC TC 5C KD QD JD 8D
AC 3C 4C AS 7S 4S AD TD 7D 5D AH 7H 5H
```

## Sample Output

```
BID D
BID NO-TRUMP
```
