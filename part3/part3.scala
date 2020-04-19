val hand = 24

if (hand > 12) {
    println("This hand busts!")
}


// if else
val handA: Int = 26
val handB: Int = 10
val aBust: Boolean = bust(handA)
val bBust: Boolean = bust(handB)

def bust(hand: Int): Boolean = {
  hand > 21
}

if (aBust & bBust) println(0)
else if (aBust) println(handB)
else if (bBust) println(handA)
else if (handA > handB) println(handA)
else println(handB)

// while loop
var i: Int = 0
val number_iteration: Int = 3
while (i < number_iteration){
  println("Hip hip hooray!")
  i += 1
}

println(i)
i = 0

