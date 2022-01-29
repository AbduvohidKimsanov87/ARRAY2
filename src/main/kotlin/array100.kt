fun main() {
    var array= intArrayOf(4,8,6,4,2,3,8,9,6,5,7,2,7,6)
    var arrayA=IntArray(array.size)
    var count=0
    for (index in 2 until array.size){
        if (array[index]<array[index-1] && array[index]>array[index-2]){
            val temp=array[index]
            array[index]=array[index-1]
            array[index-1]=temp
        }
        if (array[index]>array[index-2] && array[index]>array[index-1]){
            continue
        }
        else{
            val temp=array[index]
            array[index]=array[index-1]
            array[index-1]=temp
            array[index-2]=temp
            array[index-1]=array[index-2]
        }
    }

}