package Scala_30Minutes.part3Method

// Currying is the technique of transforming a function
// that takes multiple arguments into a function
// that takes a single argument
object Currying extends App {
  def add(x:Int,y:Int) = x+y
  // -> Currying function
  def add2(x:Int) = (y:Int) => x+y
  val sum40 = add2(40)
  // scala
  def add3(x:Int)(y:Int) = x+y
  val sum50 = add3(50)_  // X add(50)
  println(add(10, 20))
  println(add2(10)(20))
  println(sum40(-10))
  println(add3(10)(20))
}
