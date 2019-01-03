import progscala2.traits.observer._
import progscala2.traits.ui2._

val button = new Button("Click Me") with ObservableClicks

class ClickCountObserver extends Observer[Clickable] {
  var count = 0

  override def receiveUpdate(state: Clickable): Unit = count += 1
}

val bco1 = new ClickCountObserver
val bco2 = new ClickCountObserver

button addObserver bco1
button addObserver bco2

(1 to 5) foreach (_ => button.click())

bco1.count
bco2.count