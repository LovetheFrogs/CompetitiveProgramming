# Problem 10646 - What is the card?

Kowshik and Tafsir are two brilliant students of Chittagong College, the
best college for a century at Chittagong in Bangladesh. Their days begin
with lots of classes and soon they become loaded. That is why, to give
their brains rest, they like to play a card game "What is the card?"
when they get free time between the classes. The game is described
below:\
In this game, the value of a card is defined as the value of the card
face if the card face shows a number between 2 and 9, otherwise the
value is 10. Initially there is a pile consisting of 52 cards with card
faces down. Take the top 25 cards of the pile in the hand. Set *Y* = 0.
Then execute three times the following steps together:

* Take the top card of the cards of the pile and determine its value.
* Let the card value be *X*. Add *X* to *Y* .
* Put this card and the top (10 *− X*) cards of the pile away.

At last put the 25 remaining cards in your hand on top of the pile. The
task is to determine the *Y* -th card from the pile, counted from the
bottom.

Tafsir and Kowshik know the initial order of the cards, so they think
they can tell the *Y* -th card without looking in the pile, but they
fail to detect the right card most of the time and think themselves to
be dull. Please help them to increase their self-confidence.

## Input

The first line in the input file contains an integer representing the
number of test cases. Each of the test cases follows below. Each case
consists of 52 cards given in the order of the initial pile, from bottom
to top. The format for each card is a string with 2 characters, first
character is the value, second character is the suit.

## Output

For each test case, first print the serial number of the case and then
print the target card separated by an space from the serial number.
Check the sample input & output. You are guaranteed that there is always
a solution.

## Sample Input

```
2
AC KC QC JC TC 9C 8C 7C 6C 5C 4C 3C 2C AD KD QD JD TD 9D 8D 7D 6D 5D 4D
3D 2D AH KH QH JH TH 9H 8H 7H 6H 5H 4H 3H 2H AS KS QS JS TS 9S 8S 7S 6S
5S 4S 3S 2S
AC KC QC JC TC 9C 8C 7C 6C 5C 4C 3C 2C AD KD QD JD TD 9D 8D 7D 6D 5D 4D
3D 2D AH KH QH JH TH 9H 8H 7H 6H 5H 4H 3H 2H AS KS QS JS TS 9S 8S 7S 6S
5S 4S 3S 2S
```

# Sample Output

```
Case 1: 8H
Case 2: 8H
```
