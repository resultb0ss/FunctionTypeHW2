fun main() {
    println(numToStep(3,10))

}

fun numToStep(step: Int, num: Int):Int {

    return if (step != 0){
            num * numToStep(step - 1, num)
        } else 1
}