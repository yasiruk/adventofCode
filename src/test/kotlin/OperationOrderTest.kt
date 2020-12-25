import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

private const val sampleTest = """1 + 2 * 3 + 4 * 5 + 6
1 + (2 * 3) + (4 * (5 + 6))"""
private const val testCase1 = """4 * (7 + 5 + 7) + 9 + 2 * ((5 * 6) * 9 + 6 + 3) + 3
5 + (4 * (3 + 2 + 5 + 9 * 3))
4 + 5 + 9 * 9 * (7 * (7 + 7 * 3) * (9 + 3) * 5 + (2 * 8 * 3)) * 4
(6 * 6 * 3 * (7 * 3 * 3 * 5) * 5 + 7) * (2 * 3 * 3 + 2) + 2
2 + 6 * 5 * 4 + ((3 * 3 * 6 * 5 + 2) * 2 * 2) + 9
(3 * 4 + 3 * 6 * 7) + ((6 * 8 * 8 * 2 + 9 * 8) + 5 + 5 * 4 * 5 + 9) + (8 + 4) * 5
3 + 7 + 4 + (4 + (9 + 2 + 4 + 7 + 4)) + 6
2 * 2 * (9 * 5 * (9 + 4 * 8 * 4 * 5 * 8) + 9) * 2
5 + (7 + (9 * 3 * 8) * 4 * 2) * (4 + 2 * 8 + 4) * 4 + 9
(9 + 4 * 8 * 7 * 8) * ((3 * 5 * 4 + 2 * 6 + 7) * 7 * 3 + 2 + 3 * 6) + (7 * 7 * 6 * 8 * (9 + 9 * 9 * 9 + 9 + 8) + 3) + 4 * 9 + (6 + 9 * 5)
9 * (9 + 6 * 2) + 8
(7 * 9 * 6 + 9) + 6 * 6 + (8 + 4 * (9 * 9) * 4 * 3) + 6
(4 + 2) * 7
(3 * 7 + 3) + 7 * 5 * (4 + 9 * 8) + 4 + 3
(7 + (9 * 6 + 7 * 8 + 6 * 3) + 8 * 3) + 8
(8 * 2 + 8) + (8 * 5 * 8 * 7 * 8 * (3 * 3 + 9)) + 6 + 9 * (4 * 7 + 3 + 2)
6 + 7 * (3 * 2 + (3 * 8 + 9) * (4 + 2 + 5 + 7) + 8) + 7 + 5 * (6 * (7 + 6 + 5) + 3 + 4 * (8 + 4 + 9 + 3))
3 + 5 + (5 * (9 * 8 * 4) * 7 + 2 * 8) * (4 + 6) + (3 * 7 + 7 * 9 + (6 + 6 * 8 + 7 * 5 * 6)) * 4
5 * (6 * 7 * 3) + 3 + 2 * 7 + ((9 * 6 + 5 + 3 + 8) * 4 * 5 * 7 * 7)
(2 * 4 + 6 + 5) + (6 + 3 + 4 + 6 * 9 + 4) + (6 * 7 * 5)
2 + ((9 + 9 + 5 + 8) + 2 * 6) * 7 * 3 * 4 + 6
6 * 4 + 9 * (5 + 5) + ((8 * 5 * 3 * 4 * 2) * 8) * 7
3 + (9 * 6 + 2 + 5 + 3) * (3 + 7 * 7 * 6 * 5) * (4 + (2 * 6 * 3 + 4 * 3 * 5) + 5 * 8 * 4 + (5 * 2 * 4 + 5 + 7))
(8 * 4 + 7 + 9 + 5 + 2) + 3 * 9 + (3 + 7 + 3 * 6 + 3) + 7 * 9
8 * 7 * (6 * 2) * 2 * 7
(2 + 6 + 3 + 8 * 4) + (3 + 4) + 5 * 9
(2 * 6 + (8 + 8 + 9) + 7 + 7) + 9 * ((7 * 9 * 9) + 5 * 3 * 8 + (5 * 4 + 4 * 7) * 9) + 8 + 8
(4 + (6 + 6 + 4 * 6 + 5 * 8) * 4) * 3 + (7 + 9 * 8 + 6 * (8 * 6 + 3 + 7 * 2 * 8) + 8) * 7 + 7
(6 * 2 + 5) * (2 * (6 + 2 + 2 + 5 * 7 * 9) + 8 * 4) * 7 + 6 + ((4 * 6 + 5 * 4 + 2) * (7 + 9 * 7 + 8) + 4 * (5 * 4 * 9 + 3 + 6 + 7) * 5) + 6
6 * ((3 * 5 * 3 + 4 + 7 + 8) * 7 + 6)
2 + 8 + 8 * 6 + (8 * 2 + 8) + 7
(7 * 6) * 3 + 7 + 2 + 6 + 9
2 * 2 * 3 + (2 * 2 * 4) * 2 + 4
3 * (3 + (4 * 8) + 8 + 2 + 3 + 6)
(3 + 2 + 2) + 3 + (2 * 7 + (8 * 4) * 9 * 2) + 8 + 2
9 * ((8 + 6 * 4) * 7) * 8 + (9 + 6) * 6 * (2 * 7 * 6 + (4 * 5 * 4) + 4)
3 + 2 * 3 * 9
(9 + 9 + 6 * 9 + 7) * (7 * 2 * 8) + ((2 * 3 * 7) * 3 + 9 + 9 * 6) + (8 + 8 + (7 + 9 * 2) * 4)
((8 + 8 * 5) + 6 * 4 + 9 + 4 + 5) + 7 + 7 + 6 + (5 + 8 + 9)
(3 + 9 + 2 + 5 * 7 * 6) * 2
3 + 3 * ((2 * 3) + 3 * 6 * (4 * 3)) + 4 * (3 + 5 * 2 + 9 * 3)
4 * 2 * 7 * ((4 * 5 + 9 + 8 * 6) + 8 + 9) + 7
(5 * 2 + 3 * 9 * 5) + 5 + 8 * (9 + 3) + (4 * 4 * 5)
2 * 4 + 3 + 9 + 7 + (3 * 4 * 3 * 7 + 7 + 5)
((2 * 4) * 3 * 3 * 7) + 7 * 3 + 2
9 * 4 * 4 * (6 + 5) + 9 * 5
7 * 5 * (5 * 2 * 7 * 8 + 5) + (2 * 4 + 7 + 3 * 5) + 7
5 * 2 * (7 + (8 + 9 * 2 + 3) * 3 + 3)
(5 + 6 * 9 * 8 * 8) * (7 + 4 * 4 + (9 + 9 * 7 + 2 * 8) * 4) * (5 * 6 + 9 + 8 * (8 * 2 + 2 * 7)) * 9
8 + 6 + (8 * 6) + 7 * (4 * 6) + 8
9 + (4 * 8 * 4 * 5 + 8) * 3
5 + 5 * 7 + (6 * (8 + 6 * 4) + 4 + 8 + 5) + 3
3 * 7 + (5 + 8 * 2 * 4 + (8 + 5 + 6 * 4 * 9) * 9) * 6 * 3
((6 * 5) + 8 * 4 * 2 + (3 * 5)) + (4 * 5 + 2 * (5 + 9 * 6 + 2) + (8 + 3 * 5 + 4) * 4) * (3 + 6)
8 * 8 + 8 * (6 + 7 * 2 + 2 * 7 * (5 * 9 * 3)) + 4
(5 + 7 + 7) + 6 + 7 * (3 + (9 * 3)) + 7 * ((9 + 3 + 2 + 6 * 4 * 4) + 2 + 2 * 8 + 9 + 5)
5 + 3 * 8 * 6 + (4 * 4 * 7 * 3 + 8 + 9)
(9 * (8 * 6 * 6 + 8) + 5) * 3 + 5 * 5 + 9 + 8
3 + (8 + (7 + 2 + 6 + 5 * 7 + 3) + 6 + (9 * 3) + 5) + ((2 * 6 * 2 + 7 + 6) + 9 + 8) + 5 + 8 + 6
8 * 6 + (2 * 5 + 7) * (3 + 6)
(8 * 4) + 5 + (4 * (8 + 9) * 3 + 8) * 5 * 8
4 * (3 + 9 * (8 * 5 + 8 + 9 * 7 * 5)) + 9
9 * 7 * 8 + (5 + 3) + (4 + 5 + 5 * 5 * 7) * 2
8 * (5 + 8 + 3 + 6 * (4 * 7 * 6 * 3 * 9)) + 4 * 6 * 6 + 6
(9 * (8 + 4 * 2 + 9 + 6 * 5) + 8 + 3 * 7) + 5 * 2 * 6 + 4 * 4
6 + 7 * 4 + (9 + 5 * 9 + 4 + 6) + 3
7 * 2 + (6 * 9) + 5 * 5 + 3
(5 * 2 + (5 + 3 + 4 * 4 * 8 + 5) * 2 * 3 * 7) * 9 * 2
2 + (3 * 2 + 5) + (9 * 9 + 6 * 8)
(4 + 4 + 3 + 5 + 5 * 2) * 2 * 5 + 9 + (7 * 5 + 5 * 5 + 3) + 3
9 * (8 + 4) + 7 + 5 + 7 * 9
4 * (8 + 2 + 7)
9 + 3 * 6 * 4 + (2 * 6 + (7 * 8 * 7 * 8) + 6 * 3)
8 + ((3 * 7 * 7 + 8 * 2) * 5 * 8) * (9 + 3 + 7 + 6)
7 * 2 + 4 * (6 + 4 * 8 * (8 * 9 + 8 * 3 * 6 * 6) * (5 + 7 * 6 * 3 + 6) * 6)
2 * (7 + 2 + (3 * 6 + 5 + 3 + 7) * 8 + (4 * 2 + 9 + 9 + 4 + 2)) * 9
8 + (8 * 6 * 6 + (4 * 4 * 4 + 4) + 7 + 7) * 8 * 5 + 5
(9 + 2) + 6 * (5 * 7 * 6 + 7)
8 * 3 + (6 * 2 * (8 * 2) * 5 + 9 + 9) + 4
4 * 9 + (6 + 2 * 9 * 9 * 5 + 5) * 3 * 7 + 4
(5 + (2 * 2 * 2) * 6 + 3 * (9 * 5 * 5 + 8 + 6 + 9) + 9) + (5 + 8 * 2 * (7 * 4 + 6 * 5) * 3) + 2 * 5
7 + 4 + 6 * 5 + 7 * (5 + 9 * 6)
(2 + 7 * (4 * 8 + 8 + 9 + 6 + 9) * 2) + 8 + 2
(2 * (6 * 8) * 8 * 5 * (9 * 4 + 3 * 7)) + 4 + (8 + 5 * 6 * (5 + 9 * 3 * 7))
4 + (8 * (2 * 6) + 4 * 5 + (7 * 2 * 3 + 9 * 6 * 2) + 5) + 2 + 2 * 7
9 * (7 * 4) + 7 * ((6 * 9 + 9 * 6 * 8) + 2 * 2 * 5)
9 + (3 + 9 * 3 * 9 * 9) + (8 * 2 + 9) * 7
(5 + 6 + 8 * 7 + (4 * 3)) * 6 + 6
4 * 7 * 7 + (4 * 5 * 2)
(3 * 8 * 8 + 6 * 9 + 3) * (5 * 6 * 4)
(4 + 2) * 4 * (4 + 9 + 2 * 9 * 8 + 8) + (8 * (8 * 3 + 8 * 5) + 6 + 4) * 3
(3 + 8 * 5 * 5 + (2 * 4 + 3)) + 2 * 7
5 + 4 * (6 + 6 * 4 * (5 * 8 + 9 + 6 * 8 * 7) + 4 + 5) * 8 + 8 + (8 + (3 * 5 * 4 + 4 + 8 * 3) * 6 + 4 + 2 * 2)
((5 * 6) + 3 + 4 * (6 + 5) + 6 + 6) * 2 + 9 + (4 + 3 + 5 * (6 + 3 * 8))
6 + (4 * 5 * 9 * (4 * 4 * 9 * 7)) + 6 * 2 + (6 + 6 + 2 * 2 + 8 + 3) * 5
8 + (2 + 6) * 7 + (3 + 6) * 6
5 * (7 * 9 * 9 + 7 + 3) + (9 + 4 * 6 * 6 * 9)
6 + 5 + 2 + (2 + 2 * 3 * 5 * 9 + 6)
8 + 9 * (7 + 9 * 6) * (6 + 7 * 6) + 2
5 * 9 + 4 + ((9 + 8 * 4) * 7) + 4
(7 + 6 * (2 + 8 + 6 * 3) + 4) + 5 * 9 + 9 * (2 * 6) * ((4 + 6 + 2) * 6 * (6 * 8 * 8 + 3) + (2 + 3 * 2 * 8 * 8 * 3) * 3)
7 * 5 + 5 * ((4 * 4 + 4 * 3 + 6 * 9) * 9 + 7 + (2 * 4) + (8 * 8 * 6 * 6 * 9 * 4) * 5) * (7 * 2) + 4
2 * 4 + (3 * 8 + 8) + (8 + 9 + (4 * 5) * 8 * 9) + (8 + (8 + 5 * 7 + 8) + (8 + 9 + 4) + 7)
5 + 3 + 4 + 2 * 3
((4 + 2) * 3 + 3 * 2 + 4 * (7 + 3 * 7 + 6 + 8 * 5)) * 3 * 9
8 + (8 * 8 * 6) + 4 * 7
(4 * (8 + 4 + 4 + 9 * 4) + 4 + (6 * 9 * 4 * 6 * 4 + 5)) * 7 + 2 + 3
(2 + 4) + 3 + 8 + (7 * 6 * (9 + 8 + 8 * 9 + 5)) + 7 * 9
8 + 9 * 5 + 9 + 7 * 9
(9 * 7) + 2 + 7 + 9
6 * 5
7 + 2 * (5 * 7 * (4 + 5 * 7 + 2)) * 6 * (6 + 7 * 5 * 5 * 5 + (9 + 4))
5 + 7 * 6 * 8 * (3 * 5 + 9 * 4 * (7 + 4 + 7 * 3)) * 8
(7 + 4 * 8 * 2 * (5 + 2 + 2) + 5) * 7 * 7 * (7 * 9)
2 * ((4 + 2 + 9 * 5 * 4) + 9 * 7 + 2) + 4
(9 + 2 + 2 + 7 * 2) + 5 * 8 * 3
(6 + 9 + 5 + 4 + 8) * 8 * (9 + 8) + 5
((7 + 5 + 8 + 5 * 8 + 9) * 6 * 7 + 8 + (7 * 3)) + (3 + 2 * 7 + (4 * 7 * 4 + 7 + 4 + 5) * 9 * (9 + 2 * 2 * 2)) * 4 * (6 + (7 * 4) * 7) * 4 * 5
(9 + 8) * 2 + 5 * ((6 + 4 * 6 + 6 * 8 * 7) * (5 + 9 + 8 * 6 * 7 * 4) + 6) * 8 * 7
8 + 3 + 2 + ((6 * 7) * 6 + 5 * 4 + 9) * 2
2 + ((3 + 8 + 8) + 8) + 3 + 2
6 + ((7 * 3 + 6 * 7) + 2 * 7 * 4)
7 * 4 + 9 + 6 + (5 + 2 * (8 * 2 * 7 * 2 * 4) + 2 + 7 * 7)
(4 * (9 + 2)) * 5 * 8
2 * ((4 * 5) * (8 * 4 * 8 + 6) * 6) * 6 + 7
4 + 7 * 3 + (8 + 7 * 2 + 8 * (8 * 9 + 5 + 4)) * 3
5 * 6 * 3 + 9 * 2 * 4
7 + (6 * (6 * 8 * 5 * 9) + (3 * 9 + 6 * 6 + 4) * (8 * 8 * 9 + 8) + (4 * 7 + 6)) * 5
9 + (8 * 4 + 5 + 6 + 2 + 4) * (5 + (8 * 8)) + 4 + 6
3 * (3 + 7 * 7) * 8 + (3 * 3 * (2 * 8 + 4 + 3 * 7 * 2)) * 3
2 + (9 * (9 + 5) + 8) + (8 * 9 + 6 * 6) * (3 + 6 * 4 * 5 * 9 + 9) + 2 + (8 + 5 * 5 * 2 * (2 + 3 + 3 * 4) * 5)
7 * 2 * (3 * 2 + 4 * 9 * 3)
(2 + 9 * (4 * 8 * 3 * 6) * 7 + (2 * 7 * 5 * 6 * 8 + 8)) + (5 + 9 + (6 + 8) + 8) * 5 * (2 + 3 + 2 + 6)
2 + (4 * (2 * 6 * 4 * 8) * 5 * 3 * 8 + 7) + (8 + 8 * 3 + 6 + (5 * 7)) * 6 + 2 + 7
(7 * 6 + 4 * 3 + 8 + 5) + ((7 + 3) + 7 + 4 + (4 * 9 * 2 + 6 * 2 + 8) * 5)
4 * 5 + 5 + 8 + (8 + 3 + 6 * 2 * 3 * 8) * 9
6 + 7 + (3 * 8 + 3 + 5 * 5 + (4 * 8 * 6 + 9 * 7 + 8)) + 8
((2 * 3 + 3 * 9 * 8 + 3) * (7 + 2 * 2 * 3 + 3 * 7) + 5 + (8 * 9 + 4 * 9 + 9) * 6) * 9
7 * 4 * 5 * 7 + ((4 + 5 + 3 + 3 * 5 * 7) * (8 + 7 + 9 + 9 + 2 + 4))
(3 * 2 * 8 * 4 * 4) * 4 + (4 + 8 + 7 + 4 + (5 * 9 * 5)) + ((5 + 2 + 6 + 3 * 3 * 9) + 4) * 9 * 3
6 + 8 * 8 + 4
8 * (4 * 4 * 4 + 8 * 3 + 4) * 4
6 * 4 * 8
(2 + 7 + 9 * (5 + 6) * 6) * 8 + 8 + 6 + 7
7 + 8 + 5 + 6 + 6
(2 * 2 * 6) * (7 + 3) * 4 + 4 * 9 * 4
3 + (6 * 6 + 5 + 5 + 7) * 7 * (5 + 3) + 5
(7 * 2 + (5 * 3 + 7 * 4 * 3) * 7 * 2) * 6 * 4 * 3 * 3 + 5
5 * ((9 * 8 + 8 * 7 * 7) + 4 * 3 * 9) + (2 * 9 + 9) * 9 * (5 + 2 + (4 * 8 * 4 + 8 * 5 + 8) * 7) * 4
((8 + 6 + 2 + 4 * 5) + 7 + 8 * 5) * 9 + 4 + 6 + 4 * 6
5 + (6 * 4 * (5 * 4 + 7 + 2) + 4) + (7 + 3 * 9 + 7) + ((8 * 3 + 8) + 5 * 4 * 7 + 7 * (8 + 4))
((7 + 9) + 5 + 8 * 4) + 4 + 3
9 + 6 * (3 * 9 + 2 * 2) * 8 * 6
5 + ((7 + 5 + 3) * (9 + 5 * 6 * 7 + 4 + 2) + 9 * 2 * 7 + (4 + 7 + 7 + 8 + 5 + 9)) + 5 * 9
6 + (4 * 8 * (6 * 9)) + 9
9 + 6 + ((9 + 6 + 3 * 3 * 4 * 2) + 9 + 7 + 8 + 5) + ((3 + 7 * 7) * 9 * 9 + 9) + (4 + 6) * 3
9 + (2 * 3 + (5 * 5 * 8 * 4 * 9 * 2) * 9 + (3 + 2 * 7 + 9) * 2) * 2
3 + (2 + 3 * 4 + 4) * (5 + 6 + 9 * 3) + 3
(8 * 4 + 5) + 4
5 + ((3 + 3 * 7 * 3) + 7 * 2) + 4 + ((9 + 6 + 9 + 7 * 7 * 9) + 5 * 4 + 7 * (7 * 3) + (5 * 9 + 8 * 3 * 2))
4 + (3 * 8 * 7 * 5 + 2 + 8)
2 * 8 + (5 * 9 * 9 * (9 * 9 + 6) * 9)
(5 * 3 * (3 + 7 + 2 + 3 + 8)) + 9
2 + 3 + 8 + (3 + 5 * 4 * 6 + 4)
5 + 5 + (9 * (6 * 3 + 3 * 3 + 6 * 8))
2 + 2 + 7 + (6 * 8 * (4 * 4 + 2) + 4)
3 * 8 * (4 * 2) + (5 * (4 * 7 * 2 + 6))
((2 * 3 + 7 + 5) * 8 + 8 * 2 + 5 * 9) + 4 + 8 + 4 * 6
7 * 3 + 6 + (8 + 8 * 6 + 9) * 9
3 + 7 + 8 * 7
2 * 6 + ((3 * 4) + 9 + 6) + 2
(4 * 7 + 4) * (2 * (9 * 2 + 7 * 2) + 8 * 7) + 7 * 6 * 4
2 * 8 + (9 + (4 * 6 + 4 + 8 * 7 * 5) * 2 * 4 + 5) * 9
8 + 6 + 3 * ((4 + 9) * 3 + 3 * 2 * 2) * 7 + 7
5 * 4 * ((7 + 2 + 6) * 5 + 6 + 2 + 9) * 5 + 7 * 3
7 * (9 * 9 * (3 + 3)) * 8 * 7
7 * ((9 + 8 * 4 + 4) + 3 * (9 * 5 * 4)) * 6
(4 + 6) * (4 + 7 * 2) * 5 * 2 + 8
6 + 8 * (3 + 8 * 3 + 4 + 9 + 8) + 3 + 2
5 + 2 * 5 * 7 * ((9 + 5) + 8 + 2)
4 * (3 + 4) * (8 * 3) * 5 + 7 * ((5 * 5 * 4 + 5 + 2) + 4)
(9 * (9 + 2) + 7 * 4 + (7 * 8 * 3) + (7 * 7 * 3)) + (2 + 5 * (9 * 9 + 6 + 3) + 6) + 2 * 4 + ((4 + 5 + 8 * 6 * 3) + (5 * 5 + 2 * 2 * 2) + 2 + 4 * 3 * 8) * 7
6 + 2 + 6 + ((3 * 9 + 7 + 7) + 3 + 6 + (6 + 2 * 6 + 3) + 8) * 5
(5 * (6 * 2 * 5 * 2 + 6 + 6)) * 3 * 8
5 * (4 + 8 + 2 + (5 * 6 * 9) + (8 * 3)) * (8 * (6 + 3 + 6 * 2) + 9 + 8) + 2 + 6 + 3
2 + 3 + 6 + (3 * (2 + 2 * 8) * 7 + 4 * 8 * 7)
(4 * 8 + 8 + 8) * 5
8 * 4 * (5 + 8 * 8 * 2) + 4 * 8 * 5
4 * (7 * (5 + 5 + 5 * 6 * 7) * 2) * ((8 * 9 * 6 * 2) + 7 + 9) * (3 * 6 + 5 * (8 + 9))
5 + 2 * 4 * 8 * 4 * 4
(6 + 5 * (2 + 7 * 5 * 5 + 4)) * 5 + ((6 + 2) + 7 * 6 * 3 * 8 + 5) + 6 * 2
(3 + 4 * 5 * 6) + 6 + (5 + (5 + 9 + 5 * 3 + 4) * 2 + (5 + 2 * 4 * 3 + 3 * 4) * 8) + 4 + (6 + 8)
9 * 3 + 4 * 3 + (9 + 7)
(7 * 4) + (4 * 8 * 2) * (6 + 5 * 7 * 7 * 2) * ((3 * 4 * 9 + 2) + 7 + 3 * 5 + 6 * 5) * 2
3 + 3 * (9 * 2 + 4 + 6)
(8 + 9 * 6 * 5) * (3 + 4 * (7 + 5 + 3) + 4) * 3 + 5
2 + 8 * 6 + 8 + (9 * 4 * 2 * 7) + 9
3 + 4 * (3 * 5 * (4 * 7 * 9 + 8 * 2) * 9 + (6 * 3 + 4 + 6 * 5) * (2 + 8 + 2 + 2)) + (6 * 2 * 5 * 5 + 3 + 4) + 6 * 8
3 + 5 + 3 + 5 + 7
(8 * 4 * 6 + 3 * 6) + 6
3 + (4 + 7 + 5 + 3)
(2 * 9 + 9 + 7 * 9) * (4 + 3 + 3 * 4) * 2 + (3 * 5 * 9 + 4 * 6) + 2
(4 + 2) * 6 * ((2 * 6 + 2 * 3 * 5) * 6) + 9 * 2
5 * 3 + (4 + 5 * (7 * 2 + 9 + 3 + 3)) * 5 + 2
2 * 3 * 4 + 9 + (4 * 6) * 6
7 + 2 * 9 * ((2 + 5 * 9 * 2) + 9 + 4 + 3) * 9
7 * (6 * (8 * 7) * 5 * 6 + (4 * 3 + 9 * 6 + 8 + 6) + 8) * 2
3 + (8 * (2 + 2) * 3 + 6)
3 + (8 * 6) * ((4 * 3 * 7 + 5 * 9) + 8 * 5) * (6 * 5)
6 + 2 + (4 + 6 + 3 * 7 * 8) + 5 + 4
(9 * 3 * 5) * 9 + 7
(9 * 6) * 3 + ((2 + 9) * (7 + 3 + 9 + 7)) * 6 * 6
3 * 4 + 2
5 * 2 * (7 + (6 + 3 * 4) * (3 * 4 + 4 * 3 + 5) + 3) + 6
(4 + 8 + 4 + (6 * 5 + 4 + 5) * 7) + 3 * 4 * 7
8 + (6 + 4) + 4
(4 + 2 + (4 * 4 * 8) * 5) + 7 * (7 * (3 + 6 * 3 * 9 + 9 * 5) + (9 + 8 + 6 * 5 + 3)) * 9 * 9 * 2
8 + ((4 * 9 + 7 * 2) + 6 + (4 * 9 * 5 + 3 * 9 * 5) + 2 * 7 + 6) * (5 * 9) + 4
6 * (9 * 3 * 6 + 4 + (2 * 2 + 6 * 5 + 3)) + 5
(8 + 8 + 4 * 4 * 8 + 6) + 7 * 7 + (7 * 3 * 8 * 2)
5 + (4 * 4 * 7 + 5) + (3 * 7) * 4 + 3
3 + (5 + 7 + 5 * (5 + 9 + 5 * 6 * 8) * 9 + 9) + 3
(3 + 5 + 6 * 2 * 8 + (9 * 2 + 8 * 5 + 3 * 6)) * 6 + 5
3 * (7 * 4 + 7 + (4 + 2 + 8) + (4 + 4 + 5 * 2) + 5) * 6
4 + ((7 + 3 + 7 + 3) + (8 * 2 + 3 + 3)) * (8 + 2) + 3 + 9
9 + 7 * (5 + 2 + (3 + 7 * 2 * 6 + 7 * 6) + (3 * 8 * 6 * 9) + 7 + (7 + 7 + 7)) * (7 * 2) * 4 * (8 + 5 * (5 * 7 + 7 * 3 * 6 + 4) * (8 + 2 * 6 + 3 * 2 + 8))
5 + 2 * (5 + 9 + 5) + 5 * 8
9 * 4 * (4 + (8 * 7 * 8 * 5 + 2 + 7) + 7 * 8) + 2
5 * (7 + 6 * 2 * 9 * (2 * 2 * 8 + 7)) * 3 * 3
6 + 6 * 9 + (2 + (4 * 3 * 8 * 3 * 9) + 5)
9 + 3 * 2 * 3 + (9 * 4 * (4 * 9 * 3) * 8 + 7)
(8 + (3 * 5 * 9 * 7 * 8) + 7 + 3) + 5
(6 * 6 * 5 * 6 * 3) + 5 * 8 * 6 * 8 + 6
2 * (4 + (8 * 7) * 7) + 7 + 8
2 + (2 + 5 + (3 + 8 + 4)) + 2
(5 * 6) * 9 + 4 + 3 + (9 * 3 * 7 * 8) + (2 + 9)
8 + ((8 * 2 + 9 * 3 * 7 + 2) * 4 + (2 * 6 + 6 + 4)) + 4 + 5 + 8 + 3
7 * 2 * 8 * 9 * ((2 + 7 * 2 * 4) * 6 + 4 + 9 + 2) + 5
7 * (5 + 3 + 2 + 6) + 4 * 3
9 + ((7 * 6 + 4 * 7 + 6 + 9) * 5 + 4 * 8) + 2 * (6 * 8 + 6 + 4 + 8 + 3) * 7
8 * (8 * (8 * 5 * 8)) + 6
2 + 2 * 9 + 6 * 4 * 6
4 * (5 + 9 * (8 * 4 + 9 + 9 + 7 * 2) * 4 * 2 * (5 * 9)) * 9 + 5 * 9 + 5
8 * (2 + 9) + 7 + 8 * (7 * 3 * 3) + 3
8 * 3 * 5 * 8 + 5
9 + 3 * (4 * 6 * 7 * 4 + 6 + (2 * 3 * 9 * 9 + 7)) * (7 + 3 + 9) + 9 * 4
(3 * 5 + (9 * 4 + 8 + 7) + 9 + 2) + 4
(6 * 3 * 6 + 6) * ((5 + 3 * 2 * 7 * 6 * 5) + (5 * 2 + 7 + 2) * 3 + 6) * 6
((3 + 9 * 2) * 2) * 2 + (3 + 6) + 9
4 + 2 * 8 + 8 + (8 * 3) + ((3 + 9 * 3 + 2 * 5 * 2) * 3 + (9 * 5 + 9) * (6 * 3 + 4 * 7 + 3) * 3 * 5)
5 + (4 * 7 * 4 * (2 + 2)) + 9 + 2 * 2
5 + 4
((9 + 3 + 3) + 6 + 2 * 4) * (3 + 6)
(7 * 6 * 5 + 7) * 3 + (6 + 4) + 2
7 * 7 * (9 * 4 * 8 + 4 * (2 + 8) * 4) + 6 * 8 * (6 * 7 + 8 + 6 * 7 + 8)
(8 + 4 + 9) + 7 * (5 + 9 * 7) * 4
2 + 6 * (3 + 8) * 3
3 + ((8 * 6 + 2 * 4 + 9 + 4) * 8 * (3 + 3 + 2 * 7 * 8)) + (3 * 6 * 6 + 2) + 5
(2 + 9 * 3) * 2 * 6 * 7
5 + 8 * (7 + 4 * (9 + 3 + 7 * 5 * 9 * 5) + 8 + (2 + 2)) * 3 + ((6 + 2 + 9 + 8 * 2 * 3) * 7 + (6 + 2 * 3 + 6 + 5) + 9 + 7 * 5) + 3
((8 * 2 + 2) * 6 + 2 * (2 + 7)) + (7 + 2 + (2 * 8 + 8 + 9) + 8) * 5 * 7 * 5
6 + 7 * 8 + 3 * (2 * 8 * 9)
8 * 8 + (3 + 8 + 3 + 6 * 9 + (8 * 7 * 4)) * 2 + 6 + (8 * 7 * (8 + 5 * 5) + 7 * (3 * 8 * 4 * 9 + 7) + 3)
4 * (3 * 8 + 9 * 4 + 5) + 2 * 8
(7 * 5 + (3 + 6) * (3 * 3 * 2 + 2) + 7 + 3) * 7
7 + 2 * ((9 * 4 * 3) + (9 * 5 + 6 * 2) + (3 + 9 + 4) + (2 * 8) + 8 * (4 * 4 * 2 * 4 + 7)) + 7
4 + 4 + (5 * (7 * 8 + 2) + 3 + 6) * 6 * 5
((9 * 4 * 2 * 7) + (9 + 5 * 6) * 7 * 8) * 2 * 2 * (7 + (4 + 6 * 7)) + 5 * 7
7 + 5 * 3
(6 + 8 + 9 * (6 * 3 + 3 + 8 * 6 + 8) + (7 + 7)) + 4 * 6
6 + 8 + 5 * ((2 * 4 + 2 + 2 + 3 + 8) + (9 + 7 + 6 + 8 + 6))
5 + 3 + 9 * 2 * 2 + (8 + 4 * (5 + 6 * 9 * 4) * 2)
(9 * 7 * 3 * 6 * 7 * (7 + 2 * 4 * 6 * 4 + 8)) * (9 + 6 + 4 + (4 + 2 + 4 * 3) + 9 + 9) + 3 + 7
7 * 3 * 9 + (7 + 4 + (9 * 3 * 6 + 3 * 5) + (9 * 8) * 3 * (3 * 6 + 8))
(2 * (4 * 3 * 3 + 3 * 2) + 4) + 2
(6 * (2 + 5) * 4) * 8 + 3 + 5 * 2 + 3
(9 + 7 * 9 * 2 + 2 * 9) + 3 * 5 * 6
7 * 8 + (7 * 3 + (8 * 5 * 6))
4 * (6 + 5 * 8 + 4 * 4 + 5) * 5 * 6
4 + (4 * 4 + (9 * 4 * 7) * (7 + 8 + 9 + 8 + 4 * 7) * 9 * 2) + 4 + 7 * (9 * 8 * 4 + 2 * 9 + 3) * (9 + 5 * 3)
4 + 7 * (3 + 5 * 3 * 7) + 7
5 + 4 + (6 + 5 + (7 + 3 + 5) + 7 * 5) * 3 + 7
2 * ((9 * 7 * 2 * 7) + (5 + 2 + 3 * 2)) * (7 + 8) * 8 * (9 * 2)
2 * 5 * (5 * 3 * 2 * 7 + 4) + 3
4 + 5 * 3 * (4 + 9 + 3 + 8 + 2 * 3) + 6
4 * 4 + ((2 + 8 * 2 * 6 + 2 * 2) + 7)
3 + (2 + (7 * 9 + 3 + 6 * 8 + 9) + 5 * 4 + 7 * 7)
((4 * 8 + 3 * 8) * 9) * ((4 + 4 * 6 + 5 * 8 + 6) * (7 + 7) * 8) + 6 * 4 + 4 * 3
(3 * 9 * 8 + (5 + 9 * 8 * 2 * 5 * 7) + (4 * 3 + 2 + 9 + 2 * 8) * 6) * 5 * (7 + 2 + 2 * 2 + 5) + 8 * 5
(3 * 3) * (2 + 6 * 7 * 9)
(7 * 8 * 9 + (7 + 8) * 5) + 7 + 9 * 3 * 4 + 2
(3 * 3 + 7 * 7) * 6 + 2
(4 + 2 + (6 + 6 * 6 + 9) + 8) + 7
8 * 8 + 7 * (2 * (7 + 3) + 2 + (8 * 8 + 5 * 4 + 9) + 6 * 8) + (7 * 8 * 8)
9 * 2
9 * 5 * 5 * 8
6 * 3 * 4 + ((6 * 6 * 4 * 2 * 2 * 5) + 2 * 6 + 5) + 3 * 2
3 * 5 + 5 + (3 * (3 + 4 * 5 * 5 + 3 * 7))
(3 + 9) + 2 * 8
5 * (5 + (8 * 8 + 8 * 5 + 2)) * 6 * (3 * 6 * 2 * 6) * 2 + 9
(9 + 5 * 9 + 3 + 3) * 9 + 3 + (2 * 8 * (4 + 4 * 4 * 6 * 6) + 4)
8 + (2 + 9 + (4 + 5 + 7) * 2) + 3
7 + 9 + 9 + 3 * 7
2 + (7 * 6 * 2 + 7 + 8 * 2) + 3 * 4 + 9 * 2
(3 * (8 * 9 * 2 + 9 + 6) * 5) * 9 + 6 * 6 + 8
3 * 6 + (5 + 4 * 6 * 6 + (7 + 7)) * 4
4 + (8 + 9 + 9 + 3 + 6 + (5 + 5)) * 6 + 6 + 3
(7 * 5 * 7 + 2 + 2) * 5 + (3 * 8 * 7 * 8 * (3 * 6 + 9 + 8) * 4) + 8 + (7 + (7 * 7 + 5 + 6 + 7) + 2 + (8 + 3) * 7) + 9
(8 * 3) + 8 + 9 * 3 + 5
(6 + 8 * 4 + 2) * 2 * (7 * (6 + 2 * 2 + 2 * 4 + 8) * 6 * 8 * 7) + 6 + 4 * 9
8 * ((6 + 6 * 7 + 9) + 3) + 6 + 4 + 2
7 + 7 + 7 * 6 * 2 + (5 + (4 * 6 + 3 * 5 + 8 + 4))
5 + (5 + (5 + 7 * 7) + (8 + 6 + 2 + 4 * 9 * 6) + (9 + 5 + 2)) * 7 * 3
3 + 4 + (3 * 6 + 6 + 4) + 9 * ((9 * 2 * 8) * 2) * 6
8 * 7 * (8 * 8 * 5)
(4 * (3 + 2) * 8 * 4 * 9) * 7 + 7 + 6 + 2
7 + 9 * (9 * 8 * 9) + 8 + (3 + 2 + 7 + 2 * 4 + 8)
(3 + 9 + 4 + 2 + 8 + 4) + (7 + 5 + (2 * 6 + 4 * 5 + 4)) * 9 * 3 + 4 + 8
7 * 3 * 8
((2 * 3) + 4 + 4 * (7 * 8) + (3 + 8)) + 2 * 4 + 5 + 5 + 7
2 + (9 * 3 * (3 * 4 * 6 * 8 + 7 * 9) * 2 * 2) + (8 * (4 * 9 * 9) + (5 * 8) + 9 * 9 + 5)
6 + 8 + (3 * 3 + (4 * 6 + 8 * 8))
7 * 3 + 7
3 + 5 * 5 + 6 * 4 * (2 * (3 * 2 + 6 + 2) + (6 * 2 * 3 + 6 + 8 * 6))
3 * 5 * 7 + ((4 * 8 + 2 * 6 * 8) * 5) * (6 * 6 + 3 + 5 + 8 + 7) + 3
(4 + 2) * 9 + 5 * (8 + 5 + 8 + 5 * (9 + 3 * 8 * 9)) * 7 * (3 + 5 + (4 + 2 * 8 + 3 + 5 * 8) * 2 * (4 * 4 + 9 * 6 + 9) * 5)
((4 * 7 * 4 * 5) + 3 + (9 + 8 + 7 * 2 * 2 + 6) * 6) * 5
4 * (5 * 2 * 8 * 4 + 2) * 2 + (5 + 6 + (3 + 2 * 8 * 5 * 2))
9 * ((2 + 6 + 6 * 6 * 7 + 2) * 5) * 2 * 3 + 7
((4 + 3 + 6 * 4) * 5 + 3 + 3 + 8 * (8 + 2 * 6 * 6)) + (5 + (8 + 7) * 2 * 2 + (9 * 3 + 9 + 3 * 3) * 5) + 2 + 6 * ((4 * 3) + 5 * 3 * 2 + (4 + 2 * 6 + 8 + 5)) + 7
(4 * 8) * 7 * 3 * 2 + (3 * 4 * 7 + 4)
(8 + 7) * 9 + 7 + 9 + (6 + 3)
7 * 4 + (7 * (5 * 6 + 7 * 9 + 3 + 4)) * 8
2 * (4 * (7 * 3 * 7 * 9) + 9 + 8 + 9 * 6) * 3 + 9 * 6
2 + (9 + 3 + 2 + 7 + (7 * 7 * 4 + 2) + 8) * 5 + 3 * 4 * 4
6 + 5 * 7 + 5 + (4 * 8 + 6) * (4 + 3 * 3)
8 + (7 + 4 * 7 * 3) * 2 * 7 * 3
2 * (9 + 3 + 2 * 6) + 6 + 6 * (4 * 6 + 7 + 9 * 9 + (2 * 6 + 5 * 3 + 4))
3 + 8 + (5 + 6 * 4 + (6 * 9) + 2)
(4 + 5 * 4 * 9) * 7 * (9 + 3) * 7 * 4 + 7
(6 * 6 + 8 + 5 * 3) * (3 + 3 + 5 + 8 * 2 * 6)
(5 + (8 * 5 + 6) * (6 + 4 * 4 * 7) + 4) + (7 * 3 + 8) * 4 * (3 + 6 * (9 * 3)) + 6 * 9
6 + (6 * 7 * 2 * (2 + 9 + 2)) + 3 + (6 * 4 + 6 * 8 * 4) + 3 * 2
((8 * 3) + 2 + 4 * 7 + 7 + 6) + 4 + (8 * 4 * 5 + (9 * 2) * (7 + 6)) * 7
(3 * 8 + (9 + 4 + 2 + 7)) + 7
4 * 4 * (7 + 2 + 3 * 4 + 2 + (7 + 5 * 6 + 7 * 6 * 4)) * 2 * 4
7 + (2 + 7 + 5 + 8 * 8 * 8) + 5 + 9 + 2
(8 + 9 * 9) + (5 + (9 + 4 + 2) * 8) * 7 * 4 * 4 * 3
(3 * 3 * (9 + 7 + 4 + 8 * 8) + 2 + 6) + 2 * 4
7 * ((6 + 3 + 2 * 9 + 7) + 5 + 6 + 3 * 4 + 2)
7 + (7 + 9 + 6 + 8) * 3 * (2 * 5 + 2 + 3 * 8) * (8 + 4 + (8 + 5) * 4) + 6
6 + (9 + 7 + (9 * 3 * 3 + 7 + 7)) * (2 * 3 * 2 * 2 * 2) * ((7 * 5 * 7 * 2 * 6 * 7) * 5 * 6 + (4 * 7)) * 9 + 8
(3 * 4 + 7 + 7) + 6 + 9 * 2 + ((2 * 3) * 2 + 7 + (6 * 9 + 5 + 2) + 6) + 2
8 + 5 * 5 * 2 + 9 * 2
(6 * (7 + 7 * 9 * 9 * 3) + 3) * 5 * (6 + 7 * 7 * (2 + 9 + 2)) + 5 + 4 * 5
4 * 4 + 7 + (7 * 3) + 2
4 + 6 + 2 + (7 * 5 * 5 * (3 * 5 * 3 * 6 * 9 * 2) * 4 * (6 + 7 * 6 + 7)) * 6 * 9
9 * 6
((5 + 9 * 6 + 9 * 2) + (2 * 5 + 3 * 6 + 3) + (7 * 7)) + (9 * 8 * 6) * 3 + 2 + (6 + (6 + 6 * 4) + 7) * 5
(3 + 9 + 7 + 6) + 3 * 9 * 9 + 9
5 * 8 * 2 + 9
9 * (4 * (7 * 5 * 4) + 6 * 8 + 5) * (7 + (3 + 9) + (5 + 2 * 7 * 4 * 9 + 7) * 4 + 8 + 2) * 3
4 + (3 * 8 * 4 + (5 + 8) * 7)
9 * 3 + (5 + 7 + 8) + 2 + (7 + 4 * 6) * (8 + (4 * 2 + 8) * 9 * 8)
5 * (4 * 3 * 4 * 2) + 8
3 * ((8 + 4) * (2 * 5 + 2) + 4 * 6 * 6 + (6 * 5 * 9 + 3)) + 9 * 2 * 3
3 * 8 + (8 * 6 + 6 * 9 * 8 * 7)
5 * (5 * 7) * 5 * 8 + 2
((5 * 4 * 5 + 2 * 3) * (3 * 5 * 5 + 2 + 7 * 6)) + 8 + 7 + 4 * 9 + 5
8 + (5 * 6 + 5 * 6 + 2) + 9 * 4 + 8 * 3
8 * 9 + (6 + 3 * 3 + 9 + 4) * 2 + ((5 * 3 + 5 + 7 * 6) + 7) * 4
7 * 4 * (2 + 9)
7 + 7"""

private val codeGenResults = getResults()

class OperationOrderTest : StringSpec({
    val o = OperationOrder()

    "sample test 1" {
        o.run(sampleTest) shouldBe (51 + 71)
    }

    "simple expression test" {
        o.run("9 + 9") shouldBe 18
    }

    "simple brackets" {
        o.run("(9 + 9)") shouldBe 18
    }

    "simple expressions" {
        o.run("9") shouldBe 9
        o.run("(0)") shouldBe 0
        o.run("(1)") shouldBe 1
        o.run("((9))") shouldBe 9
    }

    "more than one operations" {
        o.run("9 + 9 + 9") shouldBe 27
        o.run("9 * 9 * 9") shouldBe 9 * 9 * 9
        o.run("(9 * 9 * 9 + 9)") shouldBe ((9 * 9 * 9) + 9)
    }

    "nested brackets" {
        o.run("(9 * 9 * (9 + 9))") shouldBe (9 * 9 * (9 + 9))
    }

    "sample test cases" {
        o.run("2 * 3 + (4 * 5)") shouldBe 26
        o.run("5 + (8 * 3 + 9 + 3 * 4 * 3)") shouldBe 437
        o.run("5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4))") shouldBe 12240
        o.run("((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2") shouldBe 13632
        o.run("8 + 5 * 5 * 2 + 9 * 2") shouldBe (((((8 + 5) * 5) * 2) + 9) * 2)
    }

    "test cases" {
        o.run("4 * (7 + 5 + 7) * 9 + 2 * ((5 * 6) * 9 + 6 + 3) + 3") shouldBe
                (((((4 * (7 + 5 + 7)) * 9) + 2) * ((((5 * 6) * 9) + 6) + 3)) + 3)

        //        9223372036854775808L
    }

    "tricky case" {
        o.run("(8 * 2 + 8) + (8 * 5 * 8 * 7 * 8 * (3 * 3 + 9)) + 6 + 9 * (4 * 7 + 3 + 2)") shouldBe
                (((24) + (17920 * ((3 * 3) + 9)) + 6 + 9) * ((((4 * 7) + 3) + 2)))
    }

    "test case 1 codegen lmao"  {
        o.codeGen(testCase1)
    }

    "codegen test case lmao" {
        codeGenResults.sum() shouldNotBe o.run(testCase1)
    }

    "plus test 1" {
        o.run("1 + 2 * 3 + 4 * 5 + 6", true) shouldBe 231
        o.run("1 + 2 * 3 + 4 * 5 + 6", false) shouldNotBe 231
    }

    "plus test 2" {
        o.run("5 + (8 * 3 + 9 + 3 * 4 * 3)", true) shouldBe 1445
        o.run("1 + (2 * 3) + (4 * (5 + 6))", true) shouldBe 51
        o.run("2 * 3 + (4 * 5)", true) shouldBe 46
        o.run("5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4))", true) shouldBe 669060
        o.run("((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2", true) shouldBe 23340
    }

    "plus test data" {
        o.run(testCase1, true) shouldBe 290726428573651
    }
})
