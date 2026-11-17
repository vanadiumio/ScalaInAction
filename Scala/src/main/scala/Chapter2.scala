import scala.io.*

class Chapter2 {
  private val x:Int=10
  val s: Int =if x>0 then 1 else -1
  print(s)
  print(x)
  private val x0:Int=0
  private val y:Int=15
  private val y0:Int=0
  var distance: Double = {
    val dx = x - x0
    val dy = y - y0; scala.math.sqrt(dx * dx + dy * dy)
  }
  val name: String = StdIn.readLine("Your name: ")
  print("Your age: ")
  private val age: Int = StdIn.readInt()
  println(s"Hello, $name! Next year, you will be ${age + 1}.")
  private var n: Int = 10
  private var r: Int = 10
  while n>0 do {
    r=r*n
    n-=1
  }
  for i <- 1 to n do
    r = r * i

  for
    i <- 1 to 3
    j <- 1 to 3
  do
    print(f"${10 * i + j}%3d")

  // A guard
  for
    i <- 1 to 3
    j <- 1 to 3
    if i!=j
  do
    print(f"${10 * i + j}%3d")

  // Introducing variables
  for
    i <- 1 to 3
    from=4-i
    j <- 1 to from
  do
    print(f"${10 * i + j}%3d")

  private val result: Seq[Int] = for i <- 1 to 10 yield i % 3
  print(result)
}

def abs(x:Double): Double = if x>=0 then x else -x
def fac(n:Int):Int =
  var r=1
  for i<-1 to n do r=r*i
  r
end fac //optional

//Default arguments
def decorate(str:String,left:String="[",right:String="]"): String =
  left+str+right
// decorate(left = "<<<", str = "Hello", right = ">>>")
@main def hello(): Unit =
  printf("Hello World")

@main def hello2(args:String*): Unit =
  println(s"Hello, ${args(1)}!")

@main def hello3(repetition: Int, name: String): Unit =
  println("Hello " * repetition + name)

// If function is idempotent then do not add parenthesis
def words: String = scala.io.Source.fromFile("/usr/share/dict/words").mkString
// if added lazy keyword then initialization si deferred until the value is accessed.
lazy val words2: String = scala.io.Source.fromFile("/usr/share/dict/words").mkString
