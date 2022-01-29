fun main() {
    val array = intArrayOf(4, 4, 2, 9, 5, 6, 3, 1, 2, 7)
    var max = Int.MIN_VALUE
    var min = Int.MAX_VALUE
    var indexmax = 0
    var indexmix = 0
    for ((index, item) in array.withIndex()) {
        if (max<item){
            max=item
            indexmax=index
        }
        if (min>item){
            min=item
            indexmix=index
        }

    }
    if (indexmax>indexmix) {
        for (indis in indexmix + 1 until indexmax) array[indis] = 0
    }else{
        for (indis in indexmax+1 until indexmix) array[indis]=0
    }
    println(array.joinToString())


}