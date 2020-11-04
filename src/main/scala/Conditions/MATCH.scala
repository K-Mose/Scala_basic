package Conditions

object MATCH  extends App {
  class Person(val name:String,val age:Int)
  val me = new Person("나", 27)
  val you = new Person("너", 20)
  val friend = new Person("친구", 27)
  val who = new Person("누구?", 27)
  val dontKnow = new Person("몰라", 99)

  def getAge(p:Person):Unit = {
    p.name match {
      case "나" => println(s"내 나이 ${p.age}")
      case "너" => println(s"네 나이 ${p.age}")
      case "몰라" => println(s"몰라 ${p.age}")
      case "친구" =>println(s"친구 나이 ${p.age}")
      case _ => println(s"${p.name}의 나이 ${p.age}")
    }
  }
  getAge(you)
  getAge(friend)
  getAge(who)
  getAge(dontKnow)

  val list = (1 to 11).toList
  list.foreach({ _ match {
    case 1|3|5|7|9 => println("odd")
    case 2|4|6|8|10 => println("even")
    case _ => println("I don't know")
  }})

}
