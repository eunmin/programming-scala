import progscala2.traits.observer._
import progscala2.traits.ui._

class ButtonCountObserver extends Observer[Button] {
  var count = 0

  override def receiveUpdate(state: Button): Unit = count += 1
}

val button = new ObservableButton("Click Me")
val bco1 = new ButtonCountObserver
val bco2 = new ButtonCountObserver

button addObserver bco1
button addObserver bco2

(1 to 5) foreach (_ => button.click())

bco1.count
bco2.count