fun main() {
    var array= intArrayOf(1,2,4,5,6,7,8,2,5,78,4)
    var FirstIndex=0
    var SecondIndex=0
    for (index in 1 until array.size){
        for (innerIndex in 0 until index ){
            if(array[index]==array[innerIndex]){
                FirstIndex=innerIndex
                SecondIndex=index
                break
            }

        }

    }
    println("First one index =$FirstIndex Second index= $SecondIndex")


}