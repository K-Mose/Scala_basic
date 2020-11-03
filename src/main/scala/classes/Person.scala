package classes

class Person (var name:String, var age:Int){
  var pName = name
  println(s"$name 생성")
  def aging(): Unit ={
    println(s"${age + 1} 한살 먹었습니다. ")
  }
}

class Animal(var name:String){
  //클래스의 메소드는 함수의 선언과 동일하게 def로 선언합니다.
  def saying(what:String): Unit ={
    println(what)
  }
}

class Dog(name:String) extends Animal(name) {
  println(s"$name 멍멍")

  //override 선언자를 이용하여 메소드를 오버라이드 할 수 있습니다.
  override def saying(what: String): Unit ={
    var bark = ""
    for(i <- 0 until what.length){
      bark += "멍"
    }
    println(bark, what.length, bark.length)
  }
}

class Cat(var name:String = "no_name", age:Int){
  println(s"$name, $age")
}

object cls extends App{
  val p = new Person("Name", age = 25)
  println(p.pName)
  var dog = new Dog("DOG")
  dog.name = "doggy"
  println(dog.name)
  println(dog.saying("hey jude"))
  var cat = new Cat(age=33)
  // 클래스 생성시 메소드 오버라이드. public 변수를 사용하는 메소드만 오버라이드 가능
  val p2 = new Person("데이빗", 23){
    override def aging(): Unit = println(s"$name 의 나이는 $age 입니다. ")
  }
  p2.aging()

  val sCar = new Sports("차차", "제조사")
}

// 상속과 추상 클래스
abstract class Car(name:String, manufacture:String){
  def create
  def status(str:String)
  def done() = println(s"${manufacture}에서 ${name}를 만들었습니다.")
}
class Sports(name:String, manufacture:String)extends Car(name, manufacture){
  def create = {println("차를 생성 합니다. ")
  this.status("만드는")}
  def status(str:String) = {
    println(s"$str 중 입니다.")
    super.done()
  }
  create
}