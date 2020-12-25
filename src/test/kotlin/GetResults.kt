infix fun Number.pp(other: Number): Long = (this.toLong() + other.toLong())
infix fun Number.mm(other: Number): Long = (this.toLong() * other.toLong())

fun kotlinCantHaveBigMethods0(l: MutableList<Long>) {
    l.add(4 mm (7 pp 5 pp 7) pp 9 pp 2 mm ((5 mm 6) mm 9 pp 6 pp 3) pp 3)
    l.add(5 pp (4 mm (3 pp 2 pp 5 pp 9 mm 3)))
    l.add(4 pp 5 pp 9 mm 9 mm (7 mm (7 pp 7 mm 3) mm (9 pp 3) mm 5 pp (2 mm 8 mm 3)) mm 4)
    l.add((6 mm 6 mm 3 mm (7 mm 3 mm 3 mm 5) mm 5 pp 7) mm (2 mm 3 mm 3 pp 2) pp 2)
    l.add(2 pp 6 mm 5 mm 4 pp ((3 mm 3 mm 6 mm 5 pp 2) mm 2 mm 2) pp 9)
    l.add((3 mm 4 pp 3 mm 6 mm 7) pp ((6 mm 8 mm 8 mm 2 pp 9 mm 8) pp 5 pp 5 mm 4 mm 5 pp 9) pp (8 pp 4) mm 5)
    l.add(3 pp 7 pp 4 pp (4 pp (9 pp 2 pp 4 pp 7 pp 4)) pp 6)
    l.add(2 mm 2 mm (9 mm 5 mm (9 pp 4 mm 8 mm 4 mm 5 mm 8) pp 9) mm 2)
    l.add(5 pp (7 pp (9 mm 3 mm 8) mm 4 mm 2) mm (4 pp 2 mm 8 pp 4) mm 4 pp 9)
    l.add((9 pp 4 mm 8 mm 7 mm 8) mm ((3 mm 5 mm 4 pp 2 mm 6 pp 7) mm 7 mm 3 pp 2 pp 3 mm 6) pp (7 mm 7 mm 6 mm 8 mm (9 pp 9 mm 9 mm 9 pp 9 pp 8) pp 3) pp 4 mm 9 pp (6 pp 9 mm 5))
    l.add(9 mm (9 pp 6 mm 2) pp 8)
    l.add((7 mm 9 mm 6 pp 9) pp 6 mm 6 pp (8 pp 4 mm (9 mm 9) mm 4 mm 3) pp 6)
    l.add((4 pp 2) mm 7)
    l.add((3 mm 7 pp 3) pp 7 mm 5 mm (4 pp 9 mm 8) pp 4 pp 3)
    l.add((7 pp (9 mm 6 pp 7 mm 8 pp 6 mm 3) pp 8 mm 3) pp 8)
    l.add((8 mm 2 pp 8) pp (8 mm 5 mm 8 mm 7 mm 8 mm (3 mm 3 pp 9)) pp 6 pp 9 mm (4 mm 7 pp 3 pp 2))
    l.add(6 pp 7 mm (3 mm 2 pp (3 mm 8 pp 9) mm (4 pp 2 pp 5 pp 7) pp 8) pp 7 pp 5 mm (6 mm (7 pp 6 pp 5) pp 3 pp 4 mm (8 pp 4 pp 9 pp 3)))
    l.add(3 pp 5 pp (5 mm (9 mm 8 mm 4) mm 7 pp 2 mm 8) mm (4 pp 6) pp (3 mm 7 pp 7 mm 9 pp (6 pp 6 mm 8 pp 7 mm 5 mm 6)) mm 4)
    l.add(5 mm (6 mm 7 mm 3) pp 3 pp 2 mm 7 pp ((9 mm 6 pp 5 pp 3 pp 8) mm 4 mm 5 mm 7 mm 7))
    l.add((2 mm 4 pp 6 pp 5) pp (6 pp 3 pp 4 pp 6 mm 9 pp 4) pp (6 mm 7 mm 5))
    l.add(2 pp ((9 pp 9 pp 5 pp 8) pp 2 mm 6) mm 7 mm 3 mm 4 pp 6)
    l.add(6 mm 4 pp 9 mm (5 pp 5) pp ((8 mm 5 mm 3 mm 4 mm 2) mm 8) mm 7)
    l.add(3 pp (9 mm 6 pp 2 pp 5 pp 3) mm (3 pp 7 mm 7 mm 6 mm 5) mm (4 pp (2 mm 6 mm 3 pp 4 mm 3 mm 5) pp 5 mm 8 mm 4 pp (5 mm 2 mm 4 pp 5 pp 7)))
    l.add((8 mm 4 pp 7 pp 9 pp 5 pp 2) pp 3 mm 9 pp (3 pp 7 pp 3 mm 6 pp 3) pp 7 mm 9)
    l.add(8 mm 7 mm (6 mm 2) mm 2 mm 7)
    l.add((2 pp 6 pp 3 pp 8 mm 4) pp (3 pp 4) pp 5 mm 9)
    l.add((2 mm 6 pp (8 pp 8 pp 9) pp 7 pp 7) pp 9 mm ((7 mm 9 mm 9) pp 5 mm 3 mm 8 pp (5 mm 4 pp 4 mm 7) mm 9) pp 8 pp 8)
    l.add((4 pp (6 pp 6 pp 4 mm 6 pp 5 mm 8) mm 4) mm 3 pp (7 pp 9 mm 8 pp 6 mm (8 mm 6 pp 3 pp 7 mm 2 mm 8) pp 8) mm 7 pp 7)
    l.add((6 mm 2 pp 5) mm (2 mm (6 pp 2 pp 2 pp 5 mm 7 mm 9) pp 8 mm 4) mm 7 pp 6 pp ((4 mm 6 pp 5 mm 4 pp 2) mm (7 pp 9 mm 7 pp 8) pp 4 mm (5 mm 4 mm 9 pp 3 pp 6 pp 7) mm 5) pp 6)
    l.add(6 mm ((3 mm 5 mm 3 pp 4 pp 7 pp 8) mm 7 pp 6))
    l.add(2 pp 8 pp 8 mm 6 pp (8 mm 2 pp 8) pp 7)
    l.add((7 mm 6) mm 3 pp 7 pp 2 pp 6 pp 9)
    l.add(2 mm 2 mm 3 pp (2 mm 2 mm 4) mm 2 pp 4)
    l.add(3 mm (3 pp (4 mm 8) pp 8 pp 2 pp 3 pp 6))
    l.add((3 pp 2 pp 2) pp 3 pp (2 mm 7 pp (8 mm 4) mm 9 mm 2) pp 8 pp 2)
    l.add(9 mm ((8 pp 6 mm 4) mm 7) mm 8 pp (9 pp 6) mm 6 mm (2 mm 7 mm 6 pp (4 mm 5 mm 4) pp 4))
    l.add(3 pp 2 mm 3 mm 9)
    l.add((9 pp 9 pp 6 mm 9 pp 7) mm (7 mm 2 mm 8) pp ((2 mm 3 mm 7) mm 3 pp 9 pp 9 mm 6) pp (8 pp 8 pp (7 pp 9 mm 2) mm 4))
    l.add(((8 pp 8 mm 5) pp 6 mm 4 pp 9 pp 4 pp 5) pp 7 pp 7 pp 6 pp (5 pp 8 pp 9))
    l.add((3 pp 9 pp 2 pp 5 mm 7 mm 6) mm 2)
    l.add(3 pp 3 mm ((2 mm 3) pp 3 mm 6 mm (4 mm 3)) pp 4 mm (3 pp 5 mm 2 pp 9 mm 3))
    l.add(4 mm 2 mm 7 mm ((4 mm 5 pp 9 pp 8 mm 6) pp 8 pp 9) pp 7)
    l.add((5 mm 2 pp 3 mm 9 mm 5) pp 5 pp 8 mm (9 pp 3) pp (4 mm 4 mm 5))
    l.add(2 mm 4 pp 3 pp 9 pp 7 pp (3 mm 4 mm 3 mm 7 pp 7 pp 5))
    l.add(((2 mm 4) mm 3 mm 3 mm 7) pp 7 mm 3 pp 2)
    l.add(9 mm 4 mm 4 mm (6 pp 5) pp 9 mm 5)
    l.add(7 mm 5 mm (5 mm 2 mm 7 mm 8 pp 5) pp (2 mm 4 pp 7 pp 3 mm 5) pp 7)
    l.add(5 mm 2 mm (7 pp (8 pp 9 mm 2 pp 3) mm 3 pp 3))
    l.add((5 pp 6 mm 9 mm 8 mm 8) mm (7 pp 4 mm 4 pp (9 pp 9 mm 7 pp 2 mm 8) mm 4) mm (5 mm 6 pp 9 pp 8 mm (8 mm 2 pp 2 mm 7)) mm 9)
    l.add(8 pp 6 pp (8 mm 6) pp 7 mm (4 mm 6) pp 8)
    l.add(9 pp (4 mm 8 mm 4 mm 5 pp 8) mm 3)
    l.add(5 pp 5 mm 7 pp (6 mm (8 pp 6 mm 4) pp 4 pp 8 pp 5) pp 3)
    l.add(3 mm 7 pp (5 pp 8 mm 2 mm 4 pp (8 pp 5 pp 6 mm 4 mm 9) mm 9) mm 6 mm 3)
    l.add(((6 mm 5) pp 8 mm 4 mm 2 pp (3 mm 5)) pp (4 mm 5 pp 2 mm (5 pp 9 mm 6 pp 2) pp (8 pp 3 mm 5 pp 4) mm 4) mm (3 pp 6))
    l.add(8 mm 8 pp 8 mm (6 pp 7 mm 2 pp 2 mm 7 mm (5 mm 9 mm 3)) pp 4)
    l.add((5 pp 7 pp 7) pp 6 pp 7 mm (3 pp (9 mm 3)) pp 7 mm ((9 pp 3 pp 2 pp 6 mm 4 mm 4) pp 2 pp 2 mm 8 pp 9 pp 5))
    l.add(5 pp 3 mm 8 mm 6 pp (4 mm 4 mm 7 mm 3 pp 8 pp 9))
    l.add((9 mm (8 mm 6 mm 6 pp 8) pp 5) mm 3 pp 5 mm 5 pp 9 pp 8)
    l.add(3 pp (8 pp (7 pp 2 pp 6 pp 5 mm 7 pp 3) pp 6 pp (9 mm 3) pp 5) pp ((2 mm 6 mm 2 pp 7 pp 6) pp 9 pp 8) pp 5 pp 8 pp 6)
    l.add(8 mm 6 pp (2 mm 5 pp 7) mm (3 pp 6))
    l.add((8 mm 4) pp 5 pp (4 mm (8 pp 9) mm 3 pp 8) mm 5 mm 8)
    l.add(4 mm (3 pp 9 mm (8 mm 5 pp 8 pp 9 mm 7 mm 5)) pp 9)
    l.add(9 mm 7 mm 8 pp (5 pp 3) pp (4 pp 5 pp 5 mm 5 mm 7) mm 2)
    l.add(8 mm (5 pp 8 pp 3 pp 6 mm (4 mm 7 mm 6 mm 3 mm 9)) pp 4 mm 6 mm 6 pp 6)
    l.add((9 mm (8 pp 4 mm 2 pp 9 pp 6 mm 5) pp 8 pp 3 mm 7) pp 5 mm 2 mm 6 pp 4 mm 4)
    l.add(6 pp 7 mm 4 pp (9 pp 5 mm 9 pp 4 pp 6) pp 3)
    l.add(7 mm 2 pp (6 mm 9) pp 5 mm 5 pp 3)
    l.add((5 mm 2 pp (5 pp 3 pp 4 mm 4 mm 8 pp 5) mm 2 mm 3 mm 7) mm 9 mm 2)
    l.add(2 pp (3 mm 2 pp 5) pp (9 mm 9 pp 6 mm 8))
    l.add((4 pp 4 pp 3 pp 5 pp 5 mm 2) mm 2 mm 5 pp 9 pp (7 mm 5 pp 5 mm 5 pp 3) pp 3)
    l.add(9 mm (8 pp 4) pp 7 pp 5 pp 7 mm 9)
    l.add(4 mm (8 pp 2 pp 7))
    l.add(9 pp 3 mm 6 mm 4 pp (2 mm 6 pp (7 mm 8 mm 7 mm 8) pp 6 mm 3))
    l.add(8 pp ((3 mm 7 mm 7 pp 8 mm 2) mm 5 mm 8) mm (9 pp 3 pp 7 pp 6))
    l.add(7 mm 2 pp 4 mm (6 pp 4 mm 8 mm (8 mm 9 pp 8 mm 3 mm 6 mm 6) mm (5 pp 7 mm 6 mm 3 pp 6) mm 6))
    l.add(2 mm (7 pp 2 pp (3 mm 6 pp 5 pp 3 pp 7) mm 8 pp (4 mm 2 pp 9 pp 9 pp 4 pp 2)) mm 9)
    l.add(8 pp (8 mm 6 mm 6 pp (4 mm 4 mm 4 pp 4) pp 7 pp 7) mm 8 mm 5 pp 5)
    l.add((9 pp 2) pp 6 mm (5 mm 7 mm 6 pp 7))
    l.add(8 mm 3 pp (6 mm 2 mm (8 mm 2) mm 5 pp 9 pp 9) pp 4)
    l.add(4 mm 9 pp (6 pp 2 mm 9 mm 9 mm 5 pp 5) mm 3 mm 7 pp 4)
    l.add((5 pp (2 mm 2 mm 2) mm 6 pp 3 mm (9 mm 5 mm 5 pp 8 pp 6 pp 9) pp 9) pp (5 pp 8 mm 2 mm (7 mm 4 pp 6 mm 5) mm 3) pp 2 mm 5)
    l.add(7 pp 4 pp 6 mm 5 pp 7 mm (5 pp 9 mm 6))
    l.add((2 pp 7 mm (4 mm 8 pp 8 pp 9 pp 6 pp 9) mm 2) pp 8 pp 2)
    l.add((2 mm (6 mm 8) mm 8 mm 5 mm (9 mm 4 pp 3 mm 7)) pp 4 pp (8 pp 5 mm 6 mm (5 pp 9 mm 3 mm 7)))
    l.add(4 pp (8 mm (2 mm 6) pp 4 mm 5 pp (7 mm 2 mm 3 pp 9 mm 6 mm 2) pp 5) pp 2 pp 2 mm 7)
    l.add(9 mm (7 mm 4) pp 7 mm ((6 mm 9 pp 9 mm 6 mm 8) pp 2 mm 2 mm 5))
    l.add(9 pp (3 pp 9 mm 3 mm 9 mm 9) pp (8 mm 2 pp 9) mm 7)
    l.add((5 pp 6 pp 8 mm 7 pp (4 mm 3)) mm 6 pp 6)
    l.add(4 mm 7 mm 7 pp (4 mm 5 mm 2))
    l.add((3 mm 8 mm 8 pp 6 mm 9 pp 3) mm (5 mm 6 mm 4))
    l.add((4 pp 2) mm 4 mm (4 pp 9 pp 2 mm 9 mm 8 pp 8) pp (8 mm (8 mm 3 pp 8 mm 5) pp 6 pp 4) mm 3)
    l.add((3 pp 8 mm 5 mm 5 pp (2 mm 4 pp 3)) pp 2 mm 7)
    l.add(5 pp 4 mm (6 pp 6 mm 4 mm (5 mm 8 pp 9 pp 6 mm 8 mm 7) pp 4 pp 5) mm 8 pp 8 pp (8 pp (3 mm 5 mm 4 pp 4 pp 8 mm 3) mm 6 pp 4 pp 2 mm 2))
    l.add(((5 mm 6) pp 3 pp 4 mm (6 pp 5) pp 6 pp 6) mm 2 pp 9 pp (4 pp 3 pp 5 mm (6 pp 3 mm 8)))
    l.add(6 pp (4 mm 5 mm 9 mm (4 mm 4 mm 9 mm 7)) pp 6 mm 2 pp (6 pp 6 pp 2 mm 2 pp 8 pp 3) mm 5)
    l.add(8 pp (2 pp 6) mm 7 pp (3 pp 6) mm 6)
    l.add(5 mm (7 mm 9 mm 9 pp 7 pp 3) pp (9 pp 4 mm 6 mm 6 mm 9))
    l.add(6 pp 5 pp 2 pp (2 pp 2 mm 3 mm 5 mm 9 pp 6))
    l.add(8 pp 9 mm (7 pp 9 mm 6) mm (6 pp 7 mm 6) pp 2)
    l.add(5 mm 9 pp 4 pp ((9 pp 8 mm 4) mm 7) pp 4)
}

fun kotlinCantHaveBigMethods1(l: MutableList<Long>) {
    l.add(7 mm 5 pp 5 mm ((4 mm 4 pp 4 mm 3 pp 6 mm 9) mm 9 pp 7 pp (2 mm 4) pp (8 mm 8 mm 6 mm 6 mm 9 mm 4) mm 5) mm (7 mm 2) pp 4)
    l.add(2 mm 4 pp (3 mm 8 pp 8) pp (8 pp 9 pp (4 mm 5) mm 8 mm 9) pp (8 pp (8 pp 5 mm 7 pp 8) pp (8 pp 9 pp 4) pp 7))
    l.add(5 pp 3 pp 4 pp 2 mm 3)
    l.add(((4 pp 2) mm 3 pp 3 mm 2 pp 4 mm (7 pp 3 mm 7 pp 6 pp 8 mm 5)) mm 3 mm 9)
    l.add(8 pp (8 mm 8 mm 6) pp 4 mm 7)
    l.add((4 mm (8 pp 4 pp 4 pp 9 mm 4) pp 4 pp (6 mm 9 mm 4 mm 6 mm 4 pp 5)) mm 7 pp 2 pp 3)
    l.add((2 pp 4) pp 3 pp 8 pp (7 mm 6 mm (9 pp 8 pp 8 mm 9 pp 5)) pp 7 mm 9)
    l.add(8 pp 9 mm 5 pp 9 pp 7 mm 9)
    l.add((9 mm 7) pp 2 pp 7 pp 9)
    l.add(6 mm 5)
    l.add(7 pp 2 mm (5 mm 7 mm (4 pp 5 mm 7 pp 2)) mm 6 mm (6 pp 7 mm 5 mm 5 mm 5 pp (9 pp 4)))
    l.add(5 pp 7 mm 6 mm 8 mm (3 mm 5 pp 9 mm 4 mm (7 pp 4 pp 7 mm 3)) mm 8)
    l.add((7 pp 4 mm 8 mm 2 mm (5 pp 2 pp 2) pp 5) mm 7 mm 7 mm (7 mm 9))
    l.add(2 mm ((4 pp 2 pp 9 mm 5 mm 4) pp 9 mm 7 pp 2) pp 4)
    l.add((9 pp 2 pp 2 pp 7 mm 2) pp 5 mm 8 mm 3)
    l.add((6 pp 9 pp 5 pp 4 pp 8) mm 8 mm (9 pp 8) pp 5)
    l.add(((7 pp 5 pp 8 pp 5 mm 8 pp 9) mm 6 mm 7 pp 8 pp (7 mm 3)) pp (3 pp 2 mm 7 pp (4 mm 7 mm 4 pp 7 pp 4 pp 5) mm 9 mm (9 pp 2 mm 2 mm 2)) mm 4 mm (6 pp (7 mm 4) mm 7) mm 4 mm 5)
    l.add((9 pp 8) mm 2 pp 5 mm ((6 pp 4 mm 6 pp 6 mm 8 mm 7) mm (5 pp 9 pp 8 mm 6 mm 7 mm 4) pp 6) mm 8 mm 7)
    l.add(8 pp 3 pp 2 pp ((6 mm 7) mm 6 pp 5 mm 4 pp 9) mm 2)
    l.add(2 pp ((3 pp 8 pp 8) pp 8) pp 3 pp 2)
    l.add(6 pp ((7 mm 3 pp 6 mm 7) pp 2 mm 7 mm 4))
    l.add(7 mm 4 pp 9 pp 6 pp (5 pp 2 mm (8 mm 2 mm 7 mm 2 mm 4) pp 2 pp 7 mm 7))
    l.add((4 mm (9 pp 2)) mm 5 mm 8)
    l.add(2 mm ((4 mm 5) mm (8 mm 4 mm 8 pp 6) mm 6) mm 6 pp 7)
    l.add(4 pp 7 mm 3 pp (8 pp 7 mm 2 pp 8 mm (8 mm 9 pp 5 pp 4)) mm 3)
    l.add(5 mm 6 mm 3 pp 9 mm 2 mm 4)
    l.add(7 pp (6 mm (6 mm 8 mm 5 mm 9) pp (3 mm 9 pp 6 mm 6 pp 4) mm (8 mm 8 mm 9 pp 8) pp (4 mm 7 pp 6)) mm 5)
    l.add(9 pp (8 mm 4 pp 5 pp 6 pp 2 pp 4) mm (5 pp (8 mm 8)) pp 4 pp 6)
    l.add(3 mm (3 pp 7 mm 7) mm 8 pp (3 mm 3 mm (2 mm 8 pp 4 pp 3 mm 7 mm 2)) mm 3)
    l.add(2 pp (9 mm (9 pp 5) pp 8) pp (8 mm 9 pp 6 mm 6) mm (3 pp 6 mm 4 mm 5 mm 9 pp 9) pp 2 pp (8 pp 5 mm 5 mm 2 mm (2 pp 3 pp 3 mm 4) mm 5))
    l.add(7 mm 2 mm (3 mm 2 pp 4 mm 9 mm 3))
    l.add((2 pp 9 mm (4 mm 8 mm 3 mm 6) mm 7 pp (2 mm 7 mm 5 mm 6 mm 8 pp 8)) pp (5 pp 9 pp (6 pp 8) pp 8) mm 5 mm (2 pp 3 pp 2 pp 6))
    l.add(2 pp (4 mm (2 mm 6 mm 4 mm 8) mm 5 mm 3 mm 8 pp 7) pp (8 pp 8 mm 3 pp 6 pp (5 mm 7)) mm 6 pp 2 pp 7)
    l.add((7 mm 6 pp 4 mm 3 pp 8 pp 5) pp ((7 pp 3) pp 7 pp 4 pp (4 mm 9 mm 2 pp 6 mm 2 pp 8) mm 5))
    l.add(4 mm 5 pp 5 pp 8 pp (8 pp 3 pp 6 mm 2 mm 3 mm 8) mm 9)
    l.add(6 pp 7 pp (3 mm 8 pp 3 pp 5 mm 5 pp (4 mm 8 mm 6 pp 9 mm 7 pp 8)) pp 8)
    l.add(((2 mm 3 pp 3 mm 9 mm 8 pp 3) mm (7 pp 2 mm 2 mm 3 pp 3 mm 7) pp 5 pp (8 mm 9 pp 4 mm 9 pp 9) mm 6) mm 9)
    l.add(7 mm 4 mm 5 mm 7 pp ((4 pp 5 pp 3 pp 3 mm 5 mm 7) mm (8 pp 7 pp 9 pp 9 pp 2 pp 4)))
    l.add((3 mm 2 mm 8 mm 4 mm 4) mm 4 pp (4 pp 8 pp 7 pp 4 pp (5 mm 9 mm 5)) pp ((5 pp 2 pp 6 pp 3 mm 3 mm 9) pp 4) mm 9 mm 3)
    l.add(6 pp 8 mm 8 pp 4)
    l.add(8 mm (4 mm 4 mm 4 pp 8 mm 3 pp 4) mm 4)
    l.add(6 mm 4 mm 8)
    l.add((2 pp 7 pp 9 mm (5 pp 6) mm 6) mm 8 pp 8 pp 6 pp 7)
    l.add(7 pp 8 pp 5 pp 6 pp 6)
    l.add((2 mm 2 mm 6) mm (7 pp 3) mm 4 pp 4 mm 9 mm 4)
    l.add(3 pp (6 mm 6 pp 5 pp 5 pp 7) mm 7 mm (5 pp 3) pp 5)
    l.add((7 mm 2 pp (5 mm 3 pp 7 mm 4 mm 3) mm 7 mm 2) mm 6 mm 4 mm 3 mm 3 pp 5)
    l.add(5 mm ((9 mm 8 pp 8 mm 7 mm 7) pp 4 mm 3 mm 9) pp (2 mm 9 pp 9) mm 9 mm (5 pp 2 pp (4 mm 8 mm 4 pp 8 mm 5 pp 8) mm 7) mm 4)
    l.add(((8 pp 6 pp 2 pp 4 mm 5) pp 7 pp 8 mm 5) mm 9 pp 4 pp 6 pp 4 mm 6)
    l.add(5 pp (6 mm 4 mm (5 mm 4 pp 7 pp 2) pp 4) pp (7 pp 3 mm 9 pp 7) pp ((8 mm 3 pp 8) pp 5 mm 4 mm 7 pp 7 mm (8 pp 4)))
    l.add(((7 pp 9) pp 5 pp 8 mm 4) pp 4 pp 3)
    l.add(9 pp 6 mm (3 mm 9 pp 2 mm 2) mm 8 mm 6)
    l.add(5 pp ((7 pp 5 pp 3) mm (9 pp 5 mm 6 mm 7 pp 4 pp 2) pp 9 mm 2 mm 7 pp (4 pp 7 pp 7 pp 8 pp 5 pp 9)) pp 5 mm 9)
    l.add(6 pp (4 mm 8 mm (6 mm 9)) pp 9)
    l.add(9 pp 6 pp ((9 pp 6 pp 3 mm 3 mm 4 mm 2) pp 9 pp 7 pp 8 pp 5) pp ((3 pp 7 mm 7) mm 9 mm 9 pp 9) pp (4 pp 6) mm 3)
    l.add(9 pp (2 mm 3 pp (5 mm 5 mm 8 mm 4 mm 9 mm 2) mm 9 pp (3 pp 2 mm 7 pp 9) mm 2) mm 2)
    l.add(3 pp (2 pp 3 mm 4 pp 4) mm (5 pp 6 pp 9 mm 3) pp 3)
    l.add((8 mm 4 pp 5) pp 4)
    l.add(5 pp ((3 pp 3 mm 7 mm 3) pp 7 mm 2) pp 4 pp ((9 pp 6 pp 9 pp 7 mm 7 mm 9) pp 5 mm 4 pp 7 mm (7 mm 3) pp (5 mm 9 pp 8 mm 3 mm 2)))
    l.add(4 pp (3 mm 8 mm 7 mm 5 pp 2 pp 8))
    l.add(2 mm 8 pp (5 mm 9 mm 9 mm (9 mm 9 pp 6) mm 9))
    l.add((5 mm 3 mm (3 pp 7 pp 2 pp 3 pp 8)) pp 9)
    l.add(2 pp 3 pp 8 pp (3 pp 5 mm 4 mm 6 pp 4))
    l.add(5 pp 5 pp (9 mm (6 mm 3 pp 3 mm 3 pp 6 mm 8)))
    l.add(2 pp 2 pp 7 pp (6 mm 8 mm (4 mm 4 pp 2) pp 4))
    l.add(3 mm 8 mm (4 mm 2) pp (5 mm (4 mm 7 mm 2 pp 6)))
    l.add(((2 mm 3 pp 7 pp 5) mm 8 pp 8 mm 2 pp 5 mm 9) pp 4 pp 8 pp 4 mm 6)
    l.add(7 mm 3 pp 6 pp (8 pp 8 mm 6 pp 9) mm 9)
    l.add(3 pp 7 pp 8 mm 7)
    l.add(2 mm 6 pp ((3 mm 4) pp 9 pp 6) pp 2)
    l.add((4 mm 7 pp 4) mm (2 mm (9 mm 2 pp 7 mm 2) pp 8 mm 7) pp 7 mm 6 mm 4)
    l.add(2 mm 8 pp (9 pp (4 mm 6 pp 4 pp 8 mm 7 mm 5) mm 2 mm 4 pp 5) mm 9)
    l.add(8 pp 6 pp 3 mm ((4 pp 9) mm 3 pp 3 mm 2 mm 2) mm 7 pp 7)
    l.add(5 mm 4 mm ((7 pp 2 pp 6) mm 5 pp 6 pp 2 pp 9) mm 5 pp 7 mm 3)
    l.add(7 mm (9 mm 9 mm (3 pp 3)) mm 8 mm 7)
    l.add(7 mm ((9 pp 8 mm 4 pp 4) pp 3 mm (9 mm 5 mm 4)) mm 6)
    l.add((4 pp 6) mm (4 pp 7 mm 2) mm 5 mm 2 pp 8)
    l.add(6 pp 8 mm (3 pp 8 mm 3 pp 4 pp 9 pp 8) pp 3 pp 2)
    l.add(5 pp 2 mm 5 mm 7 mm ((9 pp 5) pp 8 pp 2))
    l.add(4 mm (3 pp 4) mm (8 mm 3) mm 5 pp 7 mm ((5 mm 5 mm 4 pp 5 pp 2) pp 4))
    l.add((9 mm (9 pp 2) pp 7 mm 4 pp (7 mm 8 mm 3) pp (7 mm 7 mm 3)) pp (2 pp 5 mm (9 mm 9 pp 6 pp 3) pp 6) pp 2 mm 4 pp ((4 pp 5 pp 8 mm 6 mm 3) pp (5 mm 5 pp 2 mm 2 mm 2) pp 2 pp 4 mm 3 mm 8) mm 7)
    l.add(6 pp 2 pp 6 pp ((3 mm 9 pp 7 pp 7) pp 3 pp 6 pp (6 pp 2 mm 6 pp 3) pp 8) mm 5)
    l.add((5 mm (6 mm 2 mm 5 mm 2 pp 6 pp 6)) mm 3 mm 8)
    l.add(5 mm (4 pp 8 pp 2 pp (5 mm 6 mm 9) pp (8 mm 3)) mm (8 mm (6 pp 3 pp 6 mm 2) pp 9 pp 8) pp 2 pp 6 pp 3)
    l.add(2 pp 3 pp 6 pp (3 mm (2 pp 2 mm 8) mm 7 pp 4 mm 8 mm 7))
    l.add((4 mm 8 pp 8 pp 8) mm 5)
    l.add(8 mm 4 mm (5 pp 8 mm 8 mm 2) pp 4 mm 8 mm 5)
    l.add(4 mm (7 mm (5 pp 5 pp 5 mm 6 mm 7) mm 2) mm ((8 mm 9 mm 6 mm 2) pp 7 pp 9) mm (3 mm 6 pp 5 mm (8 pp 9)))
    l.add(5 pp 2 mm 4 mm 8 mm 4 mm 4)
    l.add((6 pp 5 mm (2 pp 7 mm 5 mm 5 pp 4)) mm 5 pp ((6 pp 2) pp 7 mm 6 mm 3 mm 8 pp 5) pp 6 mm 2)
    l.add((3 pp 4 mm 5 mm 6) pp 6 pp (5 pp (5 pp 9 pp 5 mm 3 pp 4) mm 2 pp (5 pp 2 mm 4 mm 3 pp 3 mm 4) mm 8) pp 4 pp (6 pp 8))
    l.add(9 mm 3 pp 4 mm 3 pp (9 pp 7))
    l.add((7 mm 4) pp (4 mm 8 mm 2) mm (6 pp 5 mm 7 mm 7 mm 2) mm ((3 mm 4 mm 9 pp 2) pp 7 pp 3 mm 5 pp 6 mm 5) mm 2)
    l.add(3 pp 3 mm (9 mm 2 pp 4 pp 6))
    l.add((8 pp 9 mm 6 mm 5) mm (3 pp 4 mm (7 pp 5 pp 3) pp 4) mm 3 pp 5)
    l.add(2 pp 8 mm 6 pp 8 pp (9 mm 4 mm 2 mm 7) pp 9)
    l.add(3 pp 4 mm (3 mm 5 mm (4 mm 7 mm 9 pp 8 mm 2) mm 9 pp (6 mm 3 pp 4 pp 6 mm 5) mm (2 pp 8 pp 2 pp 2)) pp (6 mm 2 mm 5 mm 5 pp 3 pp 4) pp 6 mm 8)
    l.add(3 pp 5 pp 3 pp 5 pp 7)
    l.add((8 mm 4 mm 6 pp 3 mm 6) pp 6)
    l.add(3 pp (4 pp 7 pp 5 pp 3))
}

fun kotlinCantHaveBigMethods2(l: MutableList<Long>) {
    l.add((4 pp 2) mm 6 mm ((2 mm 6 pp 2 mm 3 mm 5) mm 6) pp 9 mm 2)
    l.add(5 mm 3 pp (4 pp 5 mm (7 mm 2 pp 9 pp 3 pp 3)) mm 5 pp 2)
    l.add(2 mm 3 mm 4 pp 9 pp (4 mm 6) mm 6)
    l.add(7 pp 2 mm 9 mm ((2 pp 5 mm 9 mm 2) pp 9 pp 4 pp 3) mm 9)
    l.add(7 mm (6 mm (8 mm 7) mm 5 mm 6 pp (4 mm 3 pp 9 mm 6 pp 8 pp 6) pp 8) mm 2)
    l.add(3 pp (8 mm (2 pp 2) mm 3 pp 6))
    l.add(3 pp (8 mm 6) mm ((4 mm 3 mm 7 pp 5 mm 9) pp 8 mm 5) mm (6 mm 5))
    l.add(6 pp 2 pp (4 pp 6 pp 3 mm 7 mm 8) pp 5 pp 4)
    l.add((9 mm 3 mm 5) mm 9 pp 7)
    l.add((9 mm 6) mm 3 pp ((2 pp 9) mm (7 pp 3 pp 9 pp 7)) mm 6 mm 6)
    l.add(3 mm 4 pp 2)
    l.add(5 mm 2 mm (7 pp (6 pp 3 mm 4) mm (3 mm 4 pp 4 mm 3 pp 5) pp 3) pp 6)
    l.add((4 pp 8 pp 4 pp (6 mm 5 pp 4 pp 5) mm 7) pp 3 mm 4 mm 7)
    l.add(8 pp (6 pp 4) pp 4)
    l.add((4 pp 2 pp (4 mm 4 mm 8) mm 5) pp 7 mm (7 mm (3 pp 6 mm 3 mm 9 pp 9 mm 5) pp (9 pp 8 pp 6 mm 5 pp 3)) mm 9 mm 9 mm 2)
    l.add(8 pp ((4 mm 9 pp 7 mm 2) pp 6 pp (4 mm 9 mm 5 pp 3 mm 9 mm 5) pp 2 mm 7 pp 6) mm (5 mm 9) pp 4)
    l.add(6 mm (9 mm 3 mm 6 pp 4 pp (2 mm 2 pp 6 mm 5 pp 3)) pp 5)
    l.add((8 pp 8 pp 4 mm 4 mm 8 pp 6) pp 7 mm 7 pp (7 mm 3 mm 8 mm 2))
    l.add(5 pp (4 mm 4 mm 7 pp 5) pp (3 mm 7) mm 4 pp 3)
    l.add(3 pp (5 pp 7 pp 5 mm (5 pp 9 pp 5 mm 6 mm 8) mm 9 pp 9) pp 3)
    l.add((3 pp 5 pp 6 mm 2 mm 8 pp (9 mm 2 pp 8 mm 5 pp 3 mm 6)) mm 6 pp 5)
    l.add(3 mm (7 mm 4 pp 7 pp (4 pp 2 pp 8) pp (4 pp 4 pp 5 mm 2) pp 5) mm 6)
    l.add(4 pp ((7 pp 3 pp 7 pp 3) pp (8 mm 2 pp 3 pp 3)) mm (8 pp 2) pp 3 pp 9)
    l.add(9 pp 7 mm (5 pp 2 pp (3 pp 7 mm 2 mm 6 pp 7 mm 6) pp (3 mm 8 mm 6 mm 9) pp 7 pp (7 pp 7 pp 7)) mm (7 mm 2) mm 4 mm (8 pp 5 mm (5 mm 7 pp 7 mm 3 mm 6 pp 4) mm (8 pp 2 mm 6 pp 3 mm 2 pp 8)))
    l.add(5 pp 2 mm (5 pp 9 pp 5) pp 5 mm 8)
    l.add(9 mm 4 mm (4 pp (8 mm 7 mm 8 mm 5 pp 2 pp 7) pp 7 mm 8) pp 2)
    l.add(5 mm (7 pp 6 mm 2 mm 9 mm (2 mm 2 mm 8 pp 7)) mm 3 mm 3)
    l.add(6 pp 6 mm 9 pp (2 pp (4 mm 3 mm 8 mm 3 mm 9) pp 5))
    l.add(9 pp 3 mm 2 mm 3 pp (9 mm 4 mm (4 mm 9 mm 3) mm 8 pp 7))
    l.add((8 pp (3 mm 5 mm 9 mm 7 mm 8) pp 7 pp 3) pp 5)
    l.add((6 mm 6 mm 5 mm 6 mm 3) pp 5 mm 8 mm 6 mm 8 pp 6)
    l.add(2 mm (4 pp (8 mm 7) mm 7) pp 7 pp 8)
    l.add(2 pp (2 pp 5 pp (3 pp 8 pp 4)) pp 2)
    l.add((5 mm 6) mm 9 pp 4 pp 3 pp (9 mm 3 mm 7 mm 8) pp (2 pp 9))
    l.add(8 pp ((8 mm 2 pp 9 mm 3 mm 7 pp 2) mm 4 pp (2 mm 6 pp 6 pp 4)) pp 4 pp 5 pp 8 pp 3)
    l.add(7 mm 2 mm 8 mm 9 mm ((2 pp 7 mm 2 mm 4) mm 6 pp 4 pp 9 pp 2) pp 5)
    l.add(7 mm (5 pp 3 pp 2 pp 6) pp 4 mm 3)
    l.add(9 pp ((7 mm 6 pp 4 mm 7 pp 6 pp 9) mm 5 pp 4 mm 8) pp 2 mm (6 mm 8 pp 6 pp 4 pp 8 pp 3) mm 7)
    l.add(8 mm (8 mm (8 mm 5 mm 8)) pp 6)
    l.add(2 pp 2 mm 9 pp 6 mm 4 mm 6)
    l.add(4 mm (5 pp 9 mm (8 mm 4 pp 9 pp 9 pp 7 mm 2) mm 4 mm 2 mm (5 mm 9)) mm 9 pp 5 mm 9 pp 5)
    l.add(8 mm (2 pp 9) pp 7 pp 8 mm (7 mm 3 mm 3) pp 3)
    l.add(8 mm 3 mm 5 mm 8 pp 5)
    l.add(9 pp 3 mm (4 mm 6 mm 7 mm 4 pp 6 pp (2 mm 3 mm 9 mm 9 pp 7)) mm (7 pp 3 pp 9) pp 9 mm 4)
    l.add((3 mm 5 pp (9 mm 4 pp 8 pp 7) pp 9 pp 2) pp 4)
    l.add((6 mm 3 mm 6 pp 6) mm ((5 pp 3 mm 2 mm 7 mm 6 mm 5) pp (5 mm 2 pp 7 pp 2) mm 3 pp 6) mm 6)
    l.add(((3 pp 9 mm 2) mm 2) mm 2 pp (3 pp 6) pp 9)
    l.add(4 pp 2 mm 8 pp 8 pp (8 mm 3) pp ((3 pp 9 mm 3 pp 2 mm 5 mm 2) mm 3 pp (9 mm 5 pp 9) mm (6 mm 3 pp 4 mm 7 pp 3) mm 3 mm 5))
    l.add(5 pp (4 mm 7 mm 4 mm (2 pp 2)) pp 9 pp 2 mm 2)
    l.add(5 pp 4)
    l.add(((9 pp 3 pp 3) pp 6 pp 2 mm 4) mm (3 pp 6))
    l.add((7 mm 6 mm 5 pp 7) mm 3 pp (6 pp 4) pp 2)
    l.add(7 mm 7 mm (9 mm 4 mm 8 pp 4 mm (2 pp 8) mm 4) pp 6 mm 8 mm (6 mm 7 pp 8 pp 6 mm 7 pp 8))
    l.add((8 pp 4 pp 9) pp 7 mm (5 pp 9 mm 7) mm 4)
    l.add(2 pp 6 mm (3 pp 8) mm 3)
    l.add(3 pp ((8 mm 6 pp 2 mm 4 pp 9 pp 4) mm 8 mm (3 pp 3 pp 2 mm 7 mm 8)) pp (3 mm 6 mm 6 pp 2) pp 5)
    l.add((2 pp 9 mm 3) mm 2 mm 6 mm 7)
    l.add(5 pp 8 mm (7 pp 4 mm (9 pp 3 pp 7 mm 5 mm 9 mm 5) pp 8 pp (2 pp 2)) mm 3 pp ((6 pp 2 pp 9 pp 8 mm 2 mm 3) mm 7 pp (6 pp 2 mm 3 pp 6 pp 5) pp 9 pp 7 mm 5) pp 3)
    l.add(((8 mm 2 pp 2) mm 6 pp 2 mm (2 pp 7)) pp (7 pp 2 pp (2 mm 8 pp 8 pp 9) pp 8) mm 5 mm 7 mm 5)
    l.add(6 pp 7 mm 8 pp 3 mm (2 mm 8 mm 9))
    l.add(8 mm 8 pp (3 pp 8 pp 3 pp 6 mm 9 pp (8 mm 7 mm 4)) mm 2 pp 6 pp (8 mm 7 mm (8 pp 5 mm 5) pp 7 mm (3 mm 8 mm 4 mm 9 pp 7) pp 3))
    l.add(4 mm (3 mm 8 pp 9 mm 4 pp 5) pp 2 mm 8)
    l.add((7 mm 5 pp (3 pp 6) mm (3 mm 3 mm 2 pp 2) pp 7 pp 3) mm 7)
    l.add(7 pp 2 mm ((9 mm 4 mm 3) pp (9 mm 5 pp 6 mm 2) pp (3 pp 9 pp 4) pp (2 mm 8) pp 8 mm (4 mm 4 mm 2 mm 4 pp 7)) pp 7)
    l.add(4 pp 4 pp (5 mm (7 mm 8 pp 2) pp 3 pp 6) mm 6 mm 5)
    l.add(((9 mm 4 mm 2 mm 7) pp (9 pp 5 mm 6) mm 7 mm 8) mm 2 mm 2 mm (7 pp (4 pp 6 mm 7)) pp 5 mm 7)
    l.add(7 pp 5 mm 3)
    l.add((6 pp 8 pp 9 mm (6 mm 3 pp 3 pp 8 mm 6 pp 8) pp (7 pp 7)) pp 4 mm 6)
    l.add(6 pp 8 pp 5 mm ((2 mm 4 pp 2 pp 2 pp 3 pp 8) pp (9 pp 7 pp 6 pp 8 pp 6)))
    l.add(5 pp 3 pp 9 mm 2 mm 2 pp (8 pp 4 mm (5 pp 6 mm 9 mm 4) mm 2))
    l.add((9 mm 7 mm 3 mm 6 mm 7 mm (7 pp 2 mm 4 mm 6 mm 4 pp 8)) mm (9 pp 6 pp 4 pp (4 pp 2 pp 4 mm 3) pp 9 pp 9) pp 3 pp 7)
    l.add(7 mm 3 mm 9 pp (7 pp 4 pp (9 mm 3 mm 6 pp 3 mm 5) pp (9 mm 8) mm 3 mm (3 mm 6 pp 8)))
    l.add((2 mm (4 mm 3 mm 3 pp 3 mm 2) pp 4) pp 2)
    l.add((6 mm (2 pp 5) mm 4) mm 8 pp 3 pp 5 mm 2 pp 3)
    l.add((9 pp 7 mm 9 mm 2 pp 2 mm 9) pp 3 mm 5 mm 6)
    l.add(7 mm 8 pp (7 mm 3 pp (8 mm 5 mm 6)))
    l.add(4 mm (6 pp 5 mm 8 pp 4 mm 4 pp 5) mm 5 mm 6)
    l.add(4 pp (4 mm 4 pp (9 mm 4 mm 7) mm (7 pp 8 pp 9 pp 8 pp 4 mm 7) mm 9 mm 2) pp 4 pp 7 mm (9 mm 8 mm 4 pp 2 mm 9 pp 3) mm (9 pp 5 mm 3))
    l.add(4 pp 7 mm (3 pp 5 mm 3 mm 7) pp 7)
    l.add(5 pp 4 pp (6 pp 5 pp (7 pp 3 pp 5) pp 7 mm 5) mm 3 pp 7)
    l.add(2 mm ((9 mm 7 mm 2 mm 7) pp (5 pp 2 pp 3 mm 2)) mm (7 pp 8) mm 8 mm (9 mm 2))
    l.add(2 mm 5 mm (5 mm 3 mm 2 mm 7 pp 4) pp 3)
    l.add(4 pp 5 mm 3 mm (4 pp 9 pp 3 pp 8 pp 2 mm 3) pp 6)
    l.add(4 mm 4 pp ((2 pp 8 mm 2 mm 6 pp 2 mm 2) pp 7))
    l.add(3 pp (2 pp (7 mm 9 pp 3 pp 6 mm 8 pp 9) pp 5 mm 4 pp 7 mm 7))
    l.add(((4 mm 8 pp 3 mm 8) mm 9) mm ((4 pp 4 mm 6 pp 5 mm 8 pp 6) mm (7 pp 7) mm 8) pp 6 mm 4 pp 4 mm 3)
    l.add((3 mm 9 mm 8 pp (5 pp 9 mm 8 mm 2 mm 5 mm 7) pp (4 mm 3 pp 2 pp 9 pp 2 mm 8) mm 6) mm 5 mm (7 pp 2 pp 2 mm 2 pp 5) pp 8 mm 5)
    l.add((3 mm 3) mm (2 pp 6 mm 7 mm 9))
    l.add((7 mm 8 mm 9 pp (7 pp 8) mm 5) pp 7 pp 9 mm 3 mm 4 pp 2)
    l.add((3 mm 3 pp 7 mm 7) mm 6 pp 2)
    l.add((4 pp 2 pp (6 pp 6 mm 6 pp 9) pp 8) pp 7)
    l.add(8 mm 8 pp 7 mm (2 mm (7 pp 3) pp 2 pp (8 mm 8 pp 5 mm 4 pp 9) pp 6 mm 8) pp (7 mm 8 mm 8))
    l.add(9 mm 2)
    l.add(9 mm 5 mm 5 mm 8)
    l.add(6 mm 3 mm 4 pp ((6 mm 6 mm 4 mm 2 mm 2 mm 5) pp 2 mm 6 pp 5) pp 3 mm 2)
    l.add(3 mm 5 pp 5 pp (3 mm (3 pp 4 mm 5 mm 5 pp 3 mm 7)))
    l.add((3 pp 9) pp 2 mm 8)
    l.add(5 mm (5 pp (8 mm 8 pp 8 mm 5 pp 2)) mm 6 mm (3 mm 6 mm 2 mm 6) mm 2 pp 9)
    l.add((9 pp 5 mm 9 pp 3 pp 3) mm 9 pp 3 pp (2 mm 8 mm (4 pp 4 mm 4 mm 6 mm 6) pp 4))
    l.add(8 pp (2 pp 9 pp (4 pp 5 pp 7) mm 2) pp 3)
}

fun kotlinCantHaveBigMethods3(l: MutableList<Long>) {
    l.add(2 pp (7 mm 6 mm 2 pp 7 pp 8 mm 2) pp 3 mm 4 pp 9 mm 2)
    l.add((3 mm (8 mm 9 mm 2 pp 9 pp 6) mm 5) mm 9 pp 6 mm 6 pp 8)
    l.add(3 mm 6 pp (5 pp 4 mm 6 mm 6 pp (7 pp 7)) mm 4)
    l.add(4 pp (8 pp 9 pp 9 pp 3 pp 6 pp (5 pp 5)) mm 6 pp 6 pp 3)
    l.add((7 mm 5 mm 7 pp 2 pp 2) mm 5 pp (3 mm 8 mm 7 mm 8 mm (3 mm 6 pp 9 pp 8) mm 4) pp 8 pp (7 pp (7 mm 7 pp 5 pp 6 pp 7) pp 2 pp (8 pp 3) mm 7) pp 9)
    l.add((8 mm 3) pp 8 pp 9 mm 3 pp 5)
    l.add((6 pp 8 mm 4 pp 2) mm 2 mm (7 mm (6 pp 2 mm 2 pp 2 mm 4 pp 8) mm 6 mm 8 mm 7) pp 6 pp 4 mm 9)
    l.add(8 mm ((6 pp 6 mm 7 pp 9) pp 3) pp 6 pp 4 pp 2)
    l.add(7 pp 7 pp 7 mm 6 mm 2 pp (5 pp (4 mm 6 pp 3 mm 5 pp 8 pp 4)))
    l.add(5 pp (5 pp (5 pp 7 mm 7) pp (8 pp 6 pp 2 pp 4 mm 9 mm 6) pp (9 pp 5 pp 2)) mm 7 mm 3)
    l.add(3 pp 4 pp (3 mm 6 pp 6 pp 4) pp 9 mm ((9 mm 2 mm 8) mm 2) mm 6)
    l.add(8 mm 7 mm (8 mm 8 mm 5))
    l.add((4 mm (3 pp 2) mm 8 mm 4 mm 9) mm 7 pp 7 pp 6 pp 2)
    l.add(7 pp 9 mm (9 mm 8 mm 9) pp 8 pp (3 pp 2 pp 7 pp 2 mm 4 pp 8))
    l.add((3 pp 9 pp 4 pp 2 pp 8 pp 4) pp (7 pp 5 pp (2 mm 6 pp 4 mm 5 pp 4)) mm 9 mm 3 pp 4 pp 8)
    l.add(7 mm 3 mm 8)
    l.add(((2 mm 3) pp 4 pp 4 mm (7 mm 8) pp (3 pp 8)) pp 2 mm 4 pp 5 pp 5 pp 7)
    l.add(2 pp (9 mm 3 mm (3 mm 4 mm 6 mm 8 pp 7 mm 9) mm 2 mm 2) pp (8 mm (4 mm 9 mm 9) pp (5 mm 8) pp 9 mm 9 pp 5))
    l.add(6 pp 8 pp (3 mm 3 pp (4 mm 6 pp 8 mm 8)))
    l.add(7 mm 3 pp 7)
    l.add(3 pp 5 mm 5 pp 6 mm 4 mm (2 mm (3 mm 2 pp 6 pp 2) pp (6 mm 2 mm 3 pp 6 pp 8 mm 6)))
    l.add(3 mm 5 mm 7 pp ((4 mm 8 pp 2 mm 6 mm 8) mm 5) mm (6 mm 6 pp 3 pp 5 pp 8 pp 7) pp 3)
    l.add((4 pp 2) mm 9 pp 5 mm (8 pp 5 pp 8 pp 5 mm (9 pp 3 mm 8 mm 9)) mm 7 mm (3 pp 5 pp (4 pp 2 mm 8 pp 3 pp 5 mm 8) mm 2 mm (4 mm 4 pp 9 mm 6 pp 9) mm 5))
    l.add(((4 mm 7 mm 4 mm 5) pp 3 pp (9 pp 8 pp 7 mm 2 mm 2 pp 6) mm 6) mm 5)
    l.add(4 mm (5 mm 2 mm 8 mm 4 pp 2) mm 2 pp (5 pp 6 pp (3 pp 2 mm 8 mm 5 mm 2)))
    l.add(9 mm ((2 pp 6 pp 6 mm 6 mm 7 pp 2) mm 5) mm 2 mm 3 pp 7)
    l.add(((4 pp 3 pp 6 mm 4) mm 5 pp 3 pp 3 pp 8 mm (8 pp 2 mm 6 mm 6)) pp (5 pp (8 pp 7) mm 2 mm 2 pp (9 mm 3 pp 9 pp 3 mm 3) mm 5) pp 2 pp 6 mm ((4 mm 3) pp 5 mm 3 mm 2 pp (4 pp 2 mm 6 pp 8 pp 5)) pp 7)
    l.add((4 mm 8) mm 7 mm 3 mm 2 pp (3 mm 4 mm 7 pp 4))
    l.add((8 pp 7) mm 9 pp 7 pp 9 pp (6 pp 3))
    l.add(7 mm 4 pp (7 mm (5 mm 6 pp 7 mm 9 pp 3 pp 4)) mm 8)
    l.add(2 mm (4 mm (7 mm 3 mm 7 mm 9) pp 9 pp 8 pp 9 mm 6) mm 3 pp 9 mm 6)
    l.add(2 pp (9 pp 3 pp 2 pp 7 pp (7 mm 7 mm 4 pp 2) pp 8) mm 5 pp 3 mm 4 mm 4)
    l.add(6 pp 5 mm 7 pp 5 pp (4 mm 8 pp 6) mm (4 pp 3 mm 3))
    l.add(8 pp (7 pp 4 mm 7 mm 3) mm 2 mm 7 mm 3)
    l.add(2 mm (9 pp 3 pp 2 mm 6) pp 6 pp 6 mm (4 mm 6 pp 7 pp 9 mm 9 pp (2 mm 6 pp 5 mm 3 pp 4)))
    l.add(3 pp 8 pp (5 pp 6 mm 4 pp (6 mm 9) pp 2))
    l.add((4 pp 5 mm 4 mm 9) mm 7 mm (9 pp 3) mm 7 mm 4 pp 7)
    l.add((6 mm 6 pp 8 pp 5 mm 3) mm (3 pp 3 pp 5 pp 8 mm 2 mm 6))
    l.add((5 pp (8 mm 5 pp 6) mm (6 pp 4 mm 4 mm 7) pp 4) pp (7 mm 3 pp 8) mm 4 mm (3 pp 6 mm (9 mm 3)) pp 6 mm 9)
    l.add(6 pp (6 mm 7 mm 2 mm (2 pp 9 pp 2)) pp 3 pp (6 mm 4 pp 6 mm 8 mm 4) pp 3 mm 2)
    l.add(((8 mm 3) pp 2 pp 4 mm 7 pp 7 pp 6) pp 4 pp (8 mm 4 mm 5 pp (9 mm 2) mm (7 pp 6)) mm 7)
    l.add((3 mm 8 pp (9 pp 4 pp 2 pp 7)) pp 7)
    l.add(4 mm 4 mm (7 pp 2 pp 3 mm 4 pp 2 pp (7 pp 5 mm 6 pp 7 mm 6 mm 4)) mm 2 mm 4)
    l.add(7 pp (2 pp 7 pp 5 pp 8 mm 8 mm 8) pp 5 pp 9 pp 2)
    l.add((8 pp 9 mm 9) pp (5 pp (9 pp 4 pp 2) mm 8) mm 7 mm 4 mm 4 mm 3)
    l.add((3 mm 3 mm (9 pp 7 pp 4 pp 8 mm 8) pp 2 pp 6) pp 2 mm 4)
    l.add(7 mm ((6 pp 3 pp 2 mm 9 pp 7) pp 5 pp 6 pp 3 mm 4 pp 2))
    l.add(7 pp (7 pp 9 pp 6 pp 8) mm 3 mm (2 mm 5 pp 2 pp 3 mm 8) mm (8 pp 4 pp (8 pp 5) mm 4) pp 6)
    l.add(6 pp (9 pp 7 pp (9 mm 3 mm 3 pp 7 pp 7)) mm (2 mm 3 mm 2 mm 2 mm 2) mm ((7 mm 5 mm 7 mm 2 mm 6 mm 7) mm 5 mm 6 pp (4 mm 7)) mm 9 pp 8)
    l.add((3 mm 4 pp 7 pp 7) pp 6 pp 9 mm 2 pp ((2 mm 3) mm 2 pp 7 pp (6 mm 9 pp 5 pp 2) pp 6) pp 2)
    l.add(8 pp 5 mm 5 mm 2 pp 9 mm 2)
    l.add((6 mm (7 pp 7 mm 9 mm 9 mm 3) pp 3) mm 5 mm (6 pp 7 mm 7 mm (2 pp 9 pp 2)) pp 5 pp 4 mm 5)
    l.add(4 mm 4 pp 7 pp (7 mm 3) pp 2)
    l.add(4 pp 6 pp 2 pp (7 mm 5 mm 5 mm (3 mm 5 mm 3 mm 6 mm 9 mm 2) mm 4 mm (6 pp 7 mm 6 pp 7)) mm 6 mm 9)
    l.add(9 mm 6)
    l.add(((5 pp 9 mm 6 pp 9 mm 2) pp (2 mm 5 pp 3 mm 6 pp 3) pp (7 mm 7)) pp (9 mm 8 mm 6) mm 3 pp 2 pp (6 pp (6 pp 6 mm 4) pp 7) mm 5)
    l.add((3 pp 9 pp 7 pp 6) pp 3 mm 9 mm 9 pp 9)
    l.add(5 mm 8 mm 2 pp 9)
    l.add(9 mm (4 mm (7 mm 5 mm 4) pp 6 mm 8 pp 5) mm (7 pp (3 pp 9) pp (5 pp 2 mm 7 mm 4 mm 9 pp 7) mm 4 pp 8 pp 2) mm 3)
    l.add(4 pp (3 mm 8 mm 4 pp (5 pp 8) mm 7))
    l.add(9 mm 3 pp (5 pp 7 pp 8) pp 2 pp (7 pp 4 mm 6) mm (8 pp (4 mm 2 pp 8) mm 9 mm 8))
    l.add(5 mm (4 mm 3 mm 4 mm 2) pp 8)
    l.add(3 mm ((8 pp 4) mm (2 mm 5 pp 2) pp 4 mm 6 mm 6 pp (6 mm 5 mm 9 pp 3)) pp 9 mm 2 mm 3)
    l.add(3 mm 8 pp (8 mm 6 pp 6 mm 9 mm 8 mm 7))
    l.add(5 mm (5 mm 7) mm 5 mm 8 pp 2)
    l.add(((5 mm 4 mm 5 pp 2 mm 3) mm (3 mm 5 mm 5 pp 2 pp 7 mm 6)) pp 8 pp 7 pp 4 mm 9 pp 5)
    l.add(8 pp (5 mm 6 pp 5 mm 6 pp 2) pp 9 mm 4 pp 8 mm 3)
    l.add(8 mm 9 pp (6 pp 3 mm 3 pp 9 pp 4) mm 2 pp ((5 mm 3 pp 5 pp 7 mm 6) pp 7) mm 4)
    l.add(7 mm 4 mm (2 pp 9))
    l.add(7 pp 7)
}

fun getResults():List<Long> {
    val m = mutableListOf<Long>()
    kotlinCantHaveBigMethods0(m)
    kotlinCantHaveBigMethods1(m)
    kotlinCantHaveBigMethods2(m)
    kotlinCantHaveBigMethods3(m)
    return m
}