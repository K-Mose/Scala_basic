package Collection

object FOR extends App {
  for(num <- 0 to 5)
    println(num)
println()
  for(num <- 0 until 5)
    println(num)
println()
  val strs = Array("A","B","C","D")
  for(str<-strs)
    println(str)
println()
  for(index <- 0 until strs.length)
    println(index,strs(index))
println()
  for((value, index) <- strs.zipWithIndex)
    println(value, index)
println()

  for (num<-0 to 7;if num % 2==1)
    println(num)
println()

  def fives(n:Int)={
    for(x<- 0 to n ; if x % 5 == 0)
      yield x
  }
  for(num <- fives(100))
    println(num)
  // yield : vector 타입의 인스턴스로 리턴함.
  println(fives(30))

  def checkSum(num:Int , sum:Int) = {
    for(
      start <- 0 until num;
      inner <- start until num if start + inner == sum
    ) yield (start, inner) // vector 값으로 반환
  }
  println(checkSum(20,32))
  checkSum(20, 32) foreach{
    case(i,j) =>
    print(s"($i, $j)")
  } // IndexedSeq 를 반환하기 때문에 foreach 사용하여 처리 가능

  var i = 0;
  do{
    print(i + " ")
    i += 1
  }while(i < 3)
  println()
  i = 0
  while(i<3){
    print(i + " ")
    i+=1
  }
}
