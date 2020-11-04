package Scala_30Minutes.part3Method

object Closure {
  class Demo{
    var number = 10
    val add = (x:Int) =>{
      x+number
    }
  }

  def main(args: Array[String]): Unit = {
    val demo = new Demo
    println(demo.add(10))
    println(demo.number)
    demo.number = 100
    println(demo.add(10))
    println()
    val demo2 = new Demo
    println(demo2.add(10))
    println(demo2.number)
    demo2.number = 200
    println(demo2.add(10))
  }
}
