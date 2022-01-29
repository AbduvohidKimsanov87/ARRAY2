fun main() {
    val array = intArrayOf(5, 7, 8, 10, 9, 8, 7, 4, 2, 4, 6, 9, 13, 6, 19, 17, 14, 13, 12, 11, 9, 5)
    var check = false
    for ((index,item) in array.withIndex()){
        loop@for ((innerIndex,innerItem) in array.withIndex()){
            if(item == innerItem){
                if (index == innerIndex){
                    continue
                }
                check =true
                break@loop
            }
        }
        if (check){
            println("$index -> $item")
        }
        check = false
    }
}

