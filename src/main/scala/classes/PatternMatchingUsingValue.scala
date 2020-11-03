package classes

object PatternMatchingUsingValue extends App{
  val VALID_GRADES = Set("A","B","C","D","F")

  def letterGrade(value:Any):String = value match{
    case x if (90 to 100).contains(x) => "A"
    case x if (80 to 90).contains(x) => "B"
    case x if (70 to 80).contains(x) => "C"
    case x if (60 to 70).contains(x) => "D"
    case x if (0 to 60).contains(x) => "F"
    case x : String if VALID_GRADES(x.toUpperCase()) => x.toUpperCase()
  }

  println(letterGrade(91))
  println(letterGrade(22))
  println(letterGrade(82))
  println(letterGrade(77))
  println(letterGrade("a"))
  // set 안에 있는 값만 받음
  //println(letterGrade("e"))
}
