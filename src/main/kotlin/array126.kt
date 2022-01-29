fun main() {
    val array= intArrayOf(4,4,4,6,6,1,1,1,1,8,8,6,9)
    val k=4
    var count=0
    var currentindex=0   // current-oqim, borish
    while (currentindex<array.size){
        count=1
        for (index in currentindex+1 until array.size){
            if (array[currentindex]==array[index]){
                count++
            }else{
                break
            }

        }
        if (count==k){
            for (i in currentindex until currentindex+k){
                array[i]=0
            }
        }
        currentindex+=count
    }
    println(array.joinToString())



}