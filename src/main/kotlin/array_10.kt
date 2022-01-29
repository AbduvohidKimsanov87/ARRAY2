fun main() {
    var errey= intArrayOf(4,5,7,8,6,9)
    for (index in errey){
        if (index%2!=0){
            continue
        }


        println("$index   ")
    }
    for (index in errey.size-1 downTo 0){
        if (errey[index]%2==0){
            continue
        }


        println(errey[index])
    }
}