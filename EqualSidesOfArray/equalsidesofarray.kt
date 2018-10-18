/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

import org.junit.Assert.*
import java.util.ArrayList
import org.junit.Test

fun main() {
    EqualSidesOfAnArray.test()
}

object EqualSidesOfAnArray {
  fun findEvenIndex(arr:IntArray):Int {
    var left : Int
    var right : Int
    for (index in 0..arr.size-1) {
        left  = arr.slice(0..index-1).sum()
    	  right = arr.slice(index+1..arr.size-1).sum()
        if (left == right) return index
    }
    return -1
  }

  @Test
  fun test() {
    assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 3, 2, 1)))
    assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 100, 50, -51, 1, 1)))
    assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(1, 2, 3, 4, 5, 6)))
    assertEquals(3, EqualSidesOfAnArray.findEvenIndex(intArrayOf(20, 10, 30, 10, 10, 15, 35)))
    assertEquals(-1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(-8505, -5130, 1926, -9026)))
    assertEquals(1, EqualSidesOfAnArray.findEvenIndex(intArrayOf(2824, 1774, -1490, -9084, -9696, 23094)))
    assertEquals(6, EqualSidesOfAnArray.findEvenIndex(intArrayOf(4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4)))
  }
}
