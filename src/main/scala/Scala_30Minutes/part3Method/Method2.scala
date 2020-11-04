package Scala_30Minutes.part3Method

object Method2 extends App {
  def add1(x:Int , y:Int) = x+y
  val add2 = (x:Int , y:Int) => x+y
  val add3:(Int, Int)=>Int = _ + _
  val add4 = (_+_):(Int,Int)=>Int
  println(s"${add1(10,55)}")
  println(s"${add2(10,55)}")
  println(s"${add3(10,55)}")
  println(s"${add4(10,55)}")
}
