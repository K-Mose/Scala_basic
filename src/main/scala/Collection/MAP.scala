package Collection

object MAP extends App {
  val map1 = Map(1->2, 2->3, 3->4, 4->1)
  val map2 = Map("foo"->"bar")
  println(map1(1))
  println(map1(2))
  println(map1(3))
  println(map1(4))
  println(map2("foo"))
}
