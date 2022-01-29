fun main() {
    var arraya= intArrayOf(1,5,3,2,4,8,9,2,1,4,5,4,3,2)
    var arrayb=IntArray(arraya.size)
    println(arraya.joinToString ())
    var sum=0
    for (i in 0 until arraya.size){
        for (item in 0..i){
            sum+=arraya[item]

        }
        if (i==0){
            arrayb[i]=sum
        }else{
            arrayb[i]=sum/i
        }
        sum=0
    }
    println(arrayb.joinToString())

}