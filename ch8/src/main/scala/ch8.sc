case class Address(street: String, city: String, state: String, zip: String) {
  def this(zip: String) =
    this("[unknown]", Address.zipToCity(zip), Address.zipToState(zip), zip)
}

object Address {
  def zipToCity(zip: String) = "Anytown"
  def zipToState(zip: String) = "CA"
}

case class Person(
                 name: String,
                 age: Option[Int] = None,
                 address: Option[Address] = None
                 )

class Employee(
              name: String,
              age: Option[Int] = None,
              address: Option[Address] = None,
              val title: String = "[unknown]",
              val manager: Option[Employee] = None
              ) extends Person(name, age, address) {
  override def toString =
    s"Employee($name, $address, $title, $manager)"
}

val a1 = new Address("1 Scala Lane", "Anytown", "CA", "90939")
val a2 = new Address("983993")

val ceo = new Employee("Joe CEO", title = "CEO")
new Employee("Buck Trends1")
new Employee("Buck Trends2", Some(20), Some(a1))
new Employee("Buck Trends3", Some(20), Some(a1), "Zombie Dev")
new Employee("Buck Trends4", Some(20), Some(a1), "Zombie Dev", Some(ceo))
