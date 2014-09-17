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

object WhileContinue extends App {

  // WhileContinue
  // Deals with exception if continue found
  def while_c(x: => Boolean)(block: => Unit) : Unit = {
    while (x)
      try {
        block
      } catch {
        case e: Exception => {}
      }
  }

  // Continue
  // Throws an exception if called
  def continue = throw new Exception

  var i = -1

  while_c (i < 9) {
      i += 1
      if ( (i % 2) != 0 )
          continue
      println(i)
  }
}