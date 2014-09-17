package internal
// Modified by Sarah Gilkinson

/**
 * the loop body should execute 10 times and print:
 * 0
 * 2
 * 4
 * 6
 * 8
 */
object LoopUntil extends App {

  // loop_until
  // Takes in a boolean as a first parameter
  // Takes block to be executed as second parameter
  // To have x and block evaluated each time, use => between name and type
  def loop_until (x: => Boolean)(block: => Unit) :Unit  = {
    while (!x) {block}
    println("done")
  }

  var i = 0
  
  loop_until (i > 9) {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  }

}
