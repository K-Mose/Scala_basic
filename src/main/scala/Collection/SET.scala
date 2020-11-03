package Collection

object SET extends App {
  // 중복 허용 안하고 값 존재 여부만 반환
  val s1 = Set(1,2,3,1,2,2,3,4,5,6)
  println(s1)

  println(s1(1))
  println(s1(2))
  println(s1(10))
}
