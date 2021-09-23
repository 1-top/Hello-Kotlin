class Member(var b: Int) {
    fun sum(vararg nums: Int): Int {
        var sum: Int = 0
        for (num in nums) {
            sum += num
        }
        return sum
    }
}


fun main() {
    val member1 = Member(10)
    val b = member1.b
    println(b)
    println(member1.sum(1,1,1,1,1))
}
