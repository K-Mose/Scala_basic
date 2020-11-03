package Scala_30Minutes.part2

object RangeANDList extends App {
  val range1 = 1 to 10
  val range2 = 10 until 20
  val range3 = 1 until 100 by 3 // by 만큼 건너뛰며 생성
  println(range1)
  println(range2)
  println(range3)
  println(range1.toList)
  println(range2.toList)
  println(range3.toList)

  // filter 조건에 맞는것만 모으기
  val moreThan4 = range1.filter(_ > 4)
  println(moreThan4.toList)

  // map 각 아이템의 값 변경
  println(range3.map(_ + 2).toList)


}
