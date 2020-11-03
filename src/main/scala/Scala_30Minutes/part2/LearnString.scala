package Scala_30Minutes.part2

object LearnString extends App {
  // 뒤집기
  val reverse = "Scala".reverse
  println(reverse)
  println()

  // 첫 글자를 대문자로
  val cap = "scala".capitalize
  println(cap)
  println()

  // 반복
  val multi = "SCALA RULES!!!\n"*4
  println(multi)
  println()

  // 정수 변환
  val int = "234".toInt
  println(int+100, int, "234"+100)
}
