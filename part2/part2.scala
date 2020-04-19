// Defining function

def bust(hand: Int): Boolean = {
    hand > 21
}

println(bust(20))
println(bust(22))

def maxHand(handA: Int, handB: Int): Int = {
    if (handA > handB) handA else handB
}



// Define the cards shown
val queenDiamonds: Int = 10
val threeClubs: Int = 3
var aceHearts: Int = 1
val fiveSpades: Int = 5
val kingHearts: Int = 10
val jackHearts: Int = 10

var handPlayerA: Int = (queenDiamonds + threeClubs + aceHearts + fiveSpades)
var handPlayerB: Int = kingHearts + jackHearts

println(handPlayerA)
println(handPlayerB)

println(maxHand(handPlayerA, handPlayerB))

// Create an array
//
// Parameterise
val players: Array[String] = new Array[String](3)
players(0) = "Alex"
players(1) = "Chen"
players(2) = "Marta"
println(players)
println(players(0))

// You can update the elements of an array as collections are mutable,
// but must be the same type. It is recommended to use val with Array.

// You can also create array of Any type.
val mixedTypeArray: Array[Any] = new Array[Any](10)
println(mixedTypeArray)

// parameterise the hands
val hands: Array[Int] = new Array[Int](3)


// Define the value of the cards
val tenClubs: Int = 10
val fourDiamonds: Int = 4
val nineSpades: Int = 9
val nineHearts: Int = 9
val twoClubs: Int = 2
val threeSpades: Int = 3

hands(0) = tenClubs + fourDiamonds
hands(1) = nineSpades + nineHearts
hands(2) = twoClubs + threeSpades

val newHands: Array[Int] = Array(
    tenClubs + fourDiamonds,
    nineSpades + nineHearts,
    twoClubs + threeSpades)

//Define new cards
val fiveClubs: Int = 5
val queenSpades: Int = 10
val kingClubs: Int = 10

newHands.foreach(println)

newHands(0) = newHands(0) + fiveClubs
newHands(1) = newHands(1) + queenSpades
newHands(2) = newHands(2) + kingClubs

newHands.foreach(println)

// Elements in an Array is mutable but not List
//
//
// Create a list, since list is immutable, if we want to add new
//players, we have to create a new list based on the old list.
//
// This can be done using the :: operator called "cons"

val listPlayers: List[String] = List("Alex", "Chen", "Marta")
val newListPlayers = "Sindhu" :: listPlayers
println(listPlayers)
println(newListPlayers)

// "Nil" is empty list
//

// Initialize a list with an element for each round's prize
val prizes: List[Int] = List(10, 15, 20, 25, 30)
println(prizes)

// Prepend to prizes to add another round and prize
val newPrizes = 5 :: prizes
println(newPrizes)