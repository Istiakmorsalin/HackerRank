import java.util.*
import kotlin.collections.*

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var colors = HashSet<Int>()
    var pairs = 0

    for(i in ar.indices) {
        if(!colors.contains(ar[i])) {
            colors.add(ar[i])
        } else {
            pairs ++
            colors.remove(ar[i])
        }
    }

    return pairs
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
