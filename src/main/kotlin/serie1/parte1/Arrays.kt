package parte1

import serie1.problema.createReader
import java.io.BufferedReader
import java.io.FileReader

fun abs(n: Int): Int = if (n < 0) -n else n

fun findMinDifference(elem1: IntArray, elem2: IntArray): Int {
    //    throw UnsupportedOperationException()

    if (elem1.isEmpty() || elem2.isEmpty()) {
        return -1
    }

    var result = abs(elem1[0] - elem2[0])

    for (i in elem1.indices) {
        for (j in elem2.indices) {
            if (i > 0 && (elem2[j]) > (elem1[i - 1])) {
                val temp = abs(elem1[i] - elem2[j])
                if (temp < result) {
                    result = temp
                }
            }
            if (elem2[j] > elem1[i]) {
                break
            }
        }
    }
    return result
}

fun counter(array: IntArray, k: Int, lower: Int, upper: Int): Pair<Int, Int> {
    throw UnsupportedOperationException()
}
