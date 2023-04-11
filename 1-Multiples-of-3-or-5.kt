// 20230412 Created by Tommy Han
// 1. Multiples of 3 or 5

fun main() {
    // init the sum as 0
    var sum = 0
    // loop from 1 to 999
    for (i in 1..999) {
        // if i is divisible by 3 or 5, add it to sum
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    // print the sum
    println(sum)
}