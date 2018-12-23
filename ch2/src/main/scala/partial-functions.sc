val pf1: PartialFunction[Any, String] = { case s:String => "YES" }

pf1("str")

case class Point(x: Double, y: Double)

abstract class Shape() {
  def draw(offset: Point = Point(0.0, 0.0))(f: String => Unit): Unit =
    f(s"draw(offset = $offset), ${this.toString}")


}

case class Circle(center: Point, radius: Double) extends Shape

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shape

val c = Circle(Point(1.0, 1.0), 2.0)

c.draw(Point(1.0, 1.0)){
  str => println(str)
}

c.draw(){
  str => println(str)
}

def m1[A](a: A, f: A => String) = f(a)
def m2[A](a: A)(f: A => String) = f(a)

// m1(100, i => s"$i + $i")
// missing parameter type
m1(100, (i: Int) => s"$i + $i")
m2(100)(i => s"$i + $i")

