package Scala_30Minutes.part3Method

object Method1 extends App{
  // 일만적인 메소드
  def add(x:Int, y:Int):Int = {
    return x+y
  }

  // return 생략한 메소드
  def addWithoutReturn(x:Int, y:Int):Int={
    x+y // return 없으면 마지막 값이 return 값.
  }

  // 한 줄 메소드
  def addWithBlock(x:Int, y:Int) = x+y

  println(add(1,3))
  println(addWithoutReturn(3,6))
  println(addWithBlock(9,11))
}
