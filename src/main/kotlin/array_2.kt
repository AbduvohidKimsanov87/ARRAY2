fun main() {

    var array=IntArray(10,{n ->(n+1)*(n+1)  })
    println(array.joinToString ())
}