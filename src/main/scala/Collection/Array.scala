package Collection

object Array_ extends App{
  val array1 = Array(1,2,3)
  //데이터 접근 및 변경
  println(array1(0))
  array1(1) = 100
  println(array1(1))

  for(a <- array1)
    print(a+" ")
  println()
  val array2 = Array(3,4,5)
  for(a <- array2)
    print(a+" ")
  println()
  // 배열 연결
  val array3 = array1 ++ array2
  for(a <- array3)
    print(a+" ")
  println()
  // 앞에 데이터 추가
  val array4 = 0 +: array3
  for(a <- array4)
    print(a+" ")
  println()
  // 뒤에 데이터 추가
  val array5 = array3 :+ 99+10
  for(a <- array5)
    print(a+" ")
}
