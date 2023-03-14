package com.example.kotlindemo.collection.map

/**
 * Print the numbers which is repeated in given array till given time.
 * @Author: Archana Kumari
 * @Date: 14-03-2023
 */
class RepeatingNumbers {
    companion object {
        fun repeatedNumbers(arr: IntArray, freq: Int): HashMap<Int, Int> {
            var map: HashMap<Int, Int> = HashMap();
            for (i in 0..arr.size - 1) {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                } else {
                    if (map.get(arr[i])!! <= 2) {
                        map.put(arr[i], arr.get(arr[i]) + 1);
                    }
                }
            }
            return map;
        }
    }
}

fun main(args: Array<String>) {
    val array: IntArray = intArrayOf(3, 1, 4, 4, 5, 2, 6, 1)
    var map: HashMap<Int, Int> = RepeatingNumbers.repeatedNumbers(array, 2)
    val keysValue = map.filterValues { it == 2 }
    for (key in keysValue) {
        println(keysValue)
    }

}