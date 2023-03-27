fun main(){

    for (i in 0..10) {
        var fatorial = 1
        for (j in 1..i) {
            fatorial *= j
        }
        println("Fatorial de $i = $fatorial")
    }
}