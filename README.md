# HailstoneHunter

A small Java program that finds which starting number below 10,000 takes the most steps to reach 1 under the Collatz (hailstone) rule.

## The Collatz Rule
Start with any positive integer `n`:
- If `n` is even, divide it by 2.
- If `n` is odd, replace it with `3n + 1`.
- Repeat until `n` becomes 1.

## Prerequisites
- JDK 8 or higher
- A terminal or command prompt

## How to Run
```bash
javac HailstoneHunter.java
java HailstoneHunter
```

## Expected Output
```
Longest hailstone under 10000 starts at 6171 and takes 261 steps to fall to 1.
```

## How It Works
1. An outer loop tries every starting number from 1 to 9,999.
2. An inner loop applies the Collatz rule and counts steps until the number reaches 1.
3. The program keeps track of the start with the highest step count.
4. The winner is printed at the end.

A `long` is used for `n` because intermediate values can exceed the `int` range.

## Customize
Change `10000` in the outer `for` loop to search a larger or smaller range.

## Result
| Quantity | Value |
|---|---|
| Range searched | 1 to 9,999 |
| Longest chain starts at | 6171 |
| Steps to reach 1 | 261 |

## Note
Every number tested reaches 1, which supports the Collatz conjecture for this range. The conjecture is still unproven for all numbers.

## Files
- `HailstoneHunter.java` - the source code
- `README.md` - this file
