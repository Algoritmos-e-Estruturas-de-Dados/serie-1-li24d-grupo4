package serie1.problema


/** Usage Example
 *  File "ints.txt" must be on the project Directory.
 *  This example shows how to generate a file containing random integers
 */
fun main() {
    val SIZE = 1000
    val MAX = 10000
    val pw = createWriter("ints.txt")

    pw.use { f ->
        for (i in 0..< SIZE) {
            f.println((1..MAX).random())
        }
    }
    // Close file
    pw.close()
}

















