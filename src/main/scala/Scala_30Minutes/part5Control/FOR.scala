package Scala_30Minutes.part5Control

object FOR extends App{
  // 중첩 반복문
  for(a<- 1 to 9){
    for(b <- 1 to 9)
      print(a,b)
    println()
  }
  println("아래와 같이 사용 가능")
  for(a<-1 to 9; b<- 1 to 9){
    print(a,b)
    if(b==9)
      println()
  }
}
