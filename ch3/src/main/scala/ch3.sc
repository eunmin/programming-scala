def findSmallest(arr : Array[Int]) : Int = {
  var smallest = arr(0)
  var smallestIndex = 0

  for (i <- 1 until arr.size) {
    if (arr(i) < smallest) {
      smallest = arr(i)
      smallestIndex = i
    }
  }
  smallestIndex
}

def selectionSort(arr : Array[Int]) : Array[Int] = {
  var newArr : Array[Int] = Array()
  var copiedArr = arr.toBuffer
  for (i <- 0 until copiedArr.size) {
    var smallest = findSmallest(copiedArr.toArray)
    newArr :+= copiedArr.remove(smallest)
  }
  newArr
}

selectionSort(Array(10, 2, 3, 1, 100))