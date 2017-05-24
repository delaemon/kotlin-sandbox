fun main(args: Array<String>) {
    val h: String = "Hello"
    val w = "World"
    println(h + w)
    
    var g = "Great"
    g = "Goodbye"
    println(g + w)
    
    val i: Int = 1
    println(g + w + i.toString())
    
    val b: Boolean = true
        
    val v = if (!b) {
        "true"
    } else {
        "false"
    }
    println(v)
    
    for (i in 0..10 step 2) {
		println(i)
        val s = when (i) {
  			0 -> "zero"
  			1, 2 -> "one,two"
  			else -> "else"
		}
        println(s)
    }
    
    val nums = intArrayOf(2, 3, 5)
    for (n in nums) {
		println(n)
	}

    val sq = nums.map({ i -> i * i })
    sq.map{ println(i) }
}
