fun main(args: Array<String>) {
    class Fizzbuzz(maxNum: Int) {
        var maxNum: Int
        init {
            this.maxNum = maxNum
        }
        fun compare() {
            for (i in 1..this.maxNum) {
                if (i % 15 == 0) {
                    println("Fizzbuzz")
                } else if (i % 3 == 0) {
                    println("Fizz")
                } else if (i % 5 == 0) {
                    println("Buzz")
                } else {
                    println(i)
                }
            }
        }
    }
    var fizzbuzz = Fizzbuzz(100)
   fizzbuzz.compare()

}