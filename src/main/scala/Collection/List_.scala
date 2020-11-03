package Collection

object List_{
  def main(args: Array[String]): Unit = {
    val array = Array(1,2,3,4,5)
    val list = List(10,20,30,40,50)
    val list1 = array.toList
    val list2 = (10 to 20).toList
    val list3 = (10 until 20).toList
    println(list)
    println(list1)
    println(list2)
    println(list3)
  }
}
