/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
	val test : String = toCamelCase("the_stealth_warrior")
    val test2 : String = toCamelCase("The_stealth_warrior")
    println(test)
    println(test2)
}

fun toCamelCase(str:String):String {
  val chars : CharArray = str.toCharArray()
  for (index in 0..chars.size-1) {
  	if ((chars[index] == '-' || chars[index] == '_') && index+1 < chars.size) {
    	chars[index+1] = chars[index+1].toUpperCase()
    }
  }
  var result : String = chars.joinToString("")
  result = result.replace("-", "").replace("_", "")
  return result
}
