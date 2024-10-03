package modul7.hw3

data class Point(val x: Double = 0.0, val y: Double = 0.0) {

    infix fun isAbove(point: Point): Boolean{
        return y > point.y
    }

    infix fun isRightOf(point: Point): Boolean{
        return x > point.x
    }
}