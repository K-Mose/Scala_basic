package SingleTon

// 싱글톤 객체 생성, 싱글톤 객체는 메소드 전역에서 접근, 참조 가능
object Bread{
  val name:String = "빵"
  def cooking() = println("빵만드는 중")
}

object Singleton extends App{
  // import 이용
  import Bread.cooking
  cooking

  // 직접 접근
  Bread.cooking()

  val scalaCenterEmail = Email.fromString("scala.center@epfl.ch")
  scalaCenterEmail match {
    case Some(email) => println(
      s"""
         |Registered an email
         |UserName : ${email.userName}
         |DomainName : ${email.domainName}
         |""".stripMargin
    )
    case None => println("Error : could not parse email")
  }

  Dog.bark
}
// 컴패니언
// 싱글톤 객체와 클래스가 같은 이름을 사용하면 컴패니언 이라고 함
/*
컴페니언은 정적 메소드의 보관 장소를 제공함.
자바의 static을 이용한 정적 데이터는 스칼라에서 컴패니언을 이용하여
처리하는 것을 추천함.
팩토리 메소드같은 정적 메소드는 컴패니언을 이용하여 작성하고,
일반적인 데이터 클래스를 이용하여 정적 데이터와 일반 데이터를 분리하여 관리 가능
*/
class Dog
object Dog{
  def bark = println("bark")
}

// 컴패니언을 이용한 팩토리 예제
class Email(val userName: String, val domainName: String)

object Email{
  def fromString(emailString:String):Option[Email]={
    emailString.split('@') match {
      case Array(a,b)=> Some(new Email(a,b))
      case _ => None
    }
  }
}