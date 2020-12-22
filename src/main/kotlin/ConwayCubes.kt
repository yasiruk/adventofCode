data class Point(val x: Int, val y: Int, val z: Int)

class ConwayCubes {
    fun run(input: String): Int {
        val points = hashSetOf<Point>()
        val lines = input.split("\n")
        for (y in lines.indices) {
            for (x in lines[y].indices) {
                if (lines[y][x] == '#') {
                    points.add(Point(x, y, 0))
                }
            }
        }
        val toAdd = mutableSetOf<Point>()
        val toRemove = mutableSetOf<Point>()
        for (step in 1..6) {
            for (point in points) {
                val n = neighbours(point)
                if (points.intersect(n).size !in 2..3) {
                    toRemove.add(point)
                }
                for (neighbour in n) {
                    if (points.intersect(neighbours(neighbour)).size == 3) {
                        toAdd.add(neighbour)
                    }
                }
            }
            points.removeAll(toRemove)
            points.addAll(toAdd)
            toRemove.clear()
            toAdd.clear()
        }
        return points.size
    }


    fun codeGen(): String {
        val k = listOf(-1, 0, 1)
        val s = StringBuilder()
        for (i in k) {
            for (j in k) {
                for (l in k) {
                    if (!(i == 0 && j == 0 && l == 0)) {
                        s.append("Point(p.x + $i, p.y + $j, p.z + $l),\n")
                    }
                }
            }
        }
        return s.toString()
    }

    fun codeGenV2(): String {
        val k = listOf(-1, 0, 1)
        val s = StringBuilder()
        for (i in k) {
            for (j in k) {
                for (l in k) {
                    for (m in k) {
                        if (!(i == 0 && j == 0 && l == 0 && m == 0)) {
                            s.append("Point(p.x + $i, p.y + $j, p.z + $l),\n")
                        }
                    }
                }
            }
        }
        return s.toString()
    }

    private fun neighbours(p: Point) = setOf(
        Point(p.x + -1, p.y + -1, p.z + -1),
        Point(p.x + -1, p.y + -1, p.z + 0),
        Point(p.x + -1, p.y + -1, p.z + 1),
        Point(p.x + -1, p.y + 0, p.z + -1),
        Point(p.x + -1, p.y + 0, p.z + 0),
        Point(p.x + -1, p.y + 0, p.z + 1),
        Point(p.x + -1, p.y + 1, p.z + -1),
        Point(p.x + -1, p.y + 1, p.z + 0),
        Point(p.x + -1, p.y + 1, p.z + 1),
        Point(p.x + 0, p.y + -1, p.z + -1),
        Point(p.x + 0, p.y + -1, p.z + 0),
        Point(p.x + 0, p.y + -1, p.z + 1),
        Point(p.x + 0, p.y + 0, p.z + -1),
        Point(p.x + 0, p.y + 0, p.z + 1),
        Point(p.x + 0, p.y + 1, p.z + -1),
        Point(p.x + 0, p.y + 1, p.z + 0),
        Point(p.x + 0, p.y + 1, p.z + 1),
        Point(p.x + 1, p.y + -1, p.z + -1),
        Point(p.x + 1, p.y + -1, p.z + 0),
        Point(p.x + 1, p.y + -1, p.z + 1),
        Point(p.x + 1, p.y + 0, p.z + -1),
        Point(p.x + 1, p.y + 0, p.z + 0),
        Point(p.x + 1, p.y + 0, p.z + 1),
        Point(p.x + 1, p.y + 1, p.z + -1),
        Point(p.x + 1, p.y + 1, p.z + 0),
        Point(p.x + 1, p.y + 1, p.z + 1)
    )

}