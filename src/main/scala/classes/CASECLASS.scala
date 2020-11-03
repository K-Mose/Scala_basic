package classes

// 케이스 클래스는 멤버변수를 기본적으로 불변 데이터로 선언
case class CASECLASS(name:String, age:Int)

object ce extends App{
  // new를 사용하지 않고 초기화
  var p1 = CASECLASS("철수",10)
  var p2 = CASECLASS("찰스",10)
  var p3 = CASECLASS("철수",10)

  // 비교는 멤버변수의 데이터를 이용해서
  println(p1==p2)
  println(p3==p2)
  println(p1==p3)
  println()
  // 자동 코드 생성
  println(p1.toString)
  println(p1.hashCode())

}
