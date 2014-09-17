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

object RepeatUntil extends App {

  // Creates an "Until" object and passes it block
  def repeat(block: => Unit): Until = {
    new Until(block)

  }

  var i = 0
  repeat  {
      if ( (i % 2) == 0 )
          println(i)
      i += 1
  } until(i > 9)
}

class Until(body: => Unit) {
  def until(x: => Boolean): Unit = {
    body
    while(!x) {
      body
    }
  }
}
