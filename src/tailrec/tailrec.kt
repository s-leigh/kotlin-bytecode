fun sumOfInts(limit: Int): Int {
    if (limit == 1) return limit
    return limit + sumOfInts(limit - 1)
}

tailrec fun sumOfIntsTailRec(limit: Int, runningTotal: Int): Int {
    if (limit == 1) return runningTotal + limit
    return sumOfIntsTailRec(limit - 1, limit + runningTotal)
}

tailrec fun sumOfIntsTailRecWithDefaultParam(limit: Int, runningTotal: Int = 0): Int {
    if (limit == 1) return runningTotal + limit
    return sumOfIntsTailRecWithDefaultParam(limit - 1, limit + runningTotal)
}

fun main() {
    print(sumOfInts(99999))
}
