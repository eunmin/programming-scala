case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val alice = Person("Alice", 25, Address("1 Scala Lane", "Chicago", "USA"))
val bob = Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA"))

for { person <- Seq(alice, bob)} {
  person match {
    case Person(name, _, Address(_, _, "USA")) => println(name)
    case unexpected => println(unexpected)
  }
}

case class With[A, B](a: A, b: B)

With("A", 1)

val with2 : String With Int = With("A", 1)
