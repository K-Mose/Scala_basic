package Scala_30Minutes.part3Method

/*
* 익명함수의 형태
* (x:Int) => x * x
* (x:Int, y:Int) => x / y
* */
object Anonymous1 extends App{
  // 익명 함수를 매개변수로 받는 함수
 def doWithOneAndTwo(f:(Int, Int)=>Int) =
 {
   // 받은 익명 함수에 값을 넣어 실행.
   f(20,10)
 }
  println(doWithOneAndTwo((x:Int,y:Int)=>x+y))
  println(doWithOneAndTwo((a:Int, b:Int)=>a*b))

  val cal1 = doWithOneAndTwo((x:Int, y:Int)=>x+y)
  println(cal1)

  val cal2 = doWithOneAndTwo((x,y) => x - y)
  println(cal2)

  val cal3 = doWithOneAndTwo(_/_)
  println(cal3)
}
