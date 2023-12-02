import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


private const val sampleTest = """.#.
..#
###"""

private const val testCase1 = """####.#..
.......#
#..#####
.....##.
##...###
#..#.#.#
.##...#.
#...##.."""

class ConwayCubesTest : StringSpec({
    val c = ConwayCubes()

    "sample test case" {
        c.run(sampleTest) shouldBe 848
    }

    "test case 1" {
        c.run(testCase1) shouldBe 2340
    }
    "code gen lol" {
        c.codeGen() shouldBe
                """Point(p.x + -1, p.y + -1, p.z + -1, p.h + -1),
Point(p.x + -1, p.y + -1, p.z + -1, p.h + 0),
Point(p.x + -1, p.y + -1, p.z + -1, p.h + 1),
Point(p.x + -1, p.y + -1, p.z + 0, p.h + -1),
Point(p.x + -1, p.y + -1, p.z + 0, p.h + 0),
Point(p.x + -1, p.y + -1, p.z + 0, p.h + 1),
Point(p.x + -1, p.y + -1, p.z + 1, p.h + -1),
Point(p.x + -1, p.y + -1, p.z + 1, p.h + 0),
Point(p.x + -1, p.y + -1, p.z + 1, p.h + 1),
Point(p.x + -1, p.y + 0, p.z + -1, p.h + -1),
Point(p.x + -1, p.y + 0, p.z + -1, p.h + 0),
Point(p.x + -1, p.y + 0, p.z + -1, p.h + 1),
Point(p.x + -1, p.y + 0, p.z + 0, p.h + -1),
Point(p.x + -1, p.y + 0, p.z + 0, p.h + 0),
Point(p.x + -1, p.y + 0, p.z + 0, p.h + 1),
Point(p.x + -1, p.y + 0, p.z + 1, p.h + -1),
Point(p.x + -1, p.y + 0, p.z + 1, p.h + 0),
Point(p.x + -1, p.y + 0, p.z + 1, p.h + 1),
Point(p.x + -1, p.y + 1, p.z + -1, p.h + -1),
Point(p.x + -1, p.y + 1, p.z + -1, p.h + 0),
Point(p.x + -1, p.y + 1, p.z + -1, p.h + 1),
Point(p.x + -1, p.y + 1, p.z + 0, p.h + -1),
Point(p.x + -1, p.y + 1, p.z + 0, p.h + 0),
Point(p.x + -1, p.y + 1, p.z + 0, p.h + 1),
Point(p.x + -1, p.y + 1, p.z + 1, p.h + -1),
Point(p.x + -1, p.y + 1, p.z + 1, p.h + 0),
Point(p.x + -1, p.y + 1, p.z + 1, p.h + 1),
Point(p.x + 0, p.y + -1, p.z + -1, p.h + -1),
Point(p.x + 0, p.y + -1, p.z + -1, p.h + 0),
Point(p.x + 0, p.y + -1, p.z + -1, p.h + 1),
Point(p.x + 0, p.y + -1, p.z + 0, p.h + -1),
Point(p.x + 0, p.y + -1, p.z + 0, p.h + 0),
Point(p.x + 0, p.y + -1, p.z + 0, p.h + 1),
Point(p.x + 0, p.y + -1, p.z + 1, p.h + -1),
Point(p.x + 0, p.y + -1, p.z + 1, p.h + 0),
Point(p.x + 0, p.y + -1, p.z + 1, p.h + 1),
Point(p.x + 0, p.y + 0, p.z + -1, p.h + -1),
Point(p.x + 0, p.y + 0, p.z + -1, p.h + 0),
Point(p.x + 0, p.y + 0, p.z + -1, p.h + 1),
Point(p.x + 0, p.y + 0, p.z + 0, p.h + -1),
Point(p.x + 0, p.y + 0, p.z + 0, p.h + 1),
Point(p.x + 0, p.y + 0, p.z + 1, p.h + -1),
Point(p.x + 0, p.y + 0, p.z + 1, p.h + 0),
Point(p.x + 0, p.y + 0, p.z + 1, p.h + 1),
Point(p.x + 0, p.y + 1, p.z + -1, p.h + -1),
Point(p.x + 0, p.y + 1, p.z + -1, p.h + 0),
Point(p.x + 0, p.y + 1, p.z + -1, p.h + 1),
Point(p.x + 0, p.y + 1, p.z + 0, p.h + -1),
Point(p.x + 0, p.y + 1, p.z + 0, p.h + 0),
Point(p.x + 0, p.y + 1, p.z + 0, p.h + 1),
Point(p.x + 0, p.y + 1, p.z + 1, p.h + -1),
Point(p.x + 0, p.y + 1, p.z + 1, p.h + 0),
Point(p.x + 0, p.y + 1, p.z + 1, p.h + 1),
Point(p.x + 1, p.y + -1, p.z + -1, p.h + -1),
Point(p.x + 1, p.y + -1, p.z + -1, p.h + 0),
Point(p.x + 1, p.y + -1, p.z + -1, p.h + 1),
Point(p.x + 1, p.y + -1, p.z + 0, p.h + -1),
Point(p.x + 1, p.y + -1, p.z + 0, p.h + 0),
Point(p.x + 1, p.y + -1, p.z + 0, p.h + 1),
Point(p.x + 1, p.y + -1, p.z + 1, p.h + -1),
Point(p.x + 1, p.y + -1, p.z + 1, p.h + 0),
Point(p.x + 1, p.y + -1, p.z + 1, p.h + 1),
Point(p.x + 1, p.y + 0, p.z + -1, p.h + -1),
Point(p.x + 1, p.y + 0, p.z + -1, p.h + 0),
Point(p.x + 1, p.y + 0, p.z + -1, p.h + 1),
Point(p.x + 1, p.y + 0, p.z + 0, p.h + -1),
Point(p.x + 1, p.y + 0, p.z + 0, p.h + 0),
Point(p.x + 1, p.y + 0, p.z + 0, p.h + 1),
Point(p.x + 1, p.y + 0, p.z + 1, p.h + -1),
Point(p.x + 1, p.y + 0, p.z + 1, p.h + 0),
Point(p.x + 1, p.y + 0, p.z + 1, p.h + 1),
Point(p.x + 1, p.y + 1, p.z + -1, p.h + -1),
Point(p.x + 1, p.y + 1, p.z + -1, p.h + 0),
Point(p.x + 1, p.y + 1, p.z + -1, p.h + 1),
Point(p.x + 1, p.y + 1, p.z + 0, p.h + -1),
Point(p.x + 1, p.y + 1, p.z + 0, p.h + 0),
Point(p.x + 1, p.y + 1, p.z + 0, p.h + 1),
Point(p.x + 1, p.y + 1, p.z + 1, p.h + -1),
Point(p.x + 1, p.y + 1, p.z + 1, p.h + 0),
Point(p.x + 1, p.y + 1, p.z + 1, p.h + 1),
"""
    }

})
