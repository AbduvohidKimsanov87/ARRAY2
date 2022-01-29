fun main() {
    val arraya = intArrayOf(9, 8, 7, 4, 5, 6, 1, 2, 3)
    val arrayb = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    if (arraya.size==arrayb.size){
        for (item in arraya.indices){
            var temp=arraya[item]
            arraya[item]=arrayb[item]
            arrayb[item]=temp
            println("${arraya[item]} ${arrayb[item]}")

        }

    }






}