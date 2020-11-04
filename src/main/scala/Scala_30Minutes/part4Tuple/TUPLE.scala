package Scala_30Minutes.part4Tuple

object TUPLE {
  def main(args: Array[String]): Unit = {
    val t1 = new Tuple3(0.001, "hi", false)
    val t2 = (0.001, "hi", false)
    println(t1)
    println(t2)

    val number = (1,2,3,4)
    val sum = number._1 + number._2 + number._3 + number._4
    println(sum)

    def swap(x:String , y:String)=(y,x)
    var (a,b) = swap("hello", "world")
    println(a,b)

    var (x, y, z, c, python, java) = (1,2,3,true,false,"what?")
    println(x,y,z,c,python,java)
  }
}
