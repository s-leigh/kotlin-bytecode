fun sumOfInts(limit: Int, runningTotal: Int): Int {
    return if (limit == 1) {
        runningTotal + limit
    } else {
        sumOfInts(limit - 1, limit + runningTotal)
    }
}

tailrec fun sumOfIntsTailRec(limit: Int, runningTotal: Int): Int {
    return if (limit == 1) {
        runningTotal + limit
    } else {
        sumOfIntsTailRec(limit - 1, limit + runningTotal)
    }
}
