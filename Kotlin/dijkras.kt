fun minDistance(dist : IntArray , seen : MutableSet<Int>) : Int{
    var min =  10000
    var minIndex = -1
    for(i in 0..8){
        if(seen.contains(i) == false && dist[i] <= min){
            min = dist[i]
            minIndex = i
        }
    }
    return minIndex
}
fun dijiskras(graph : Array<IntArray>, src : Int){
    var dist = IntArray(9)
    var seen = mutableSetOf<Int>()
    dist.forEachIndexed{ k, v ->
        dist[k] = 100000
    }
    dist[src] = 0
    for(i in 0..7){
        var u = minDistance(dist, seen)
        seen.add(u)
        for(ii in 0..8){
            if(seen.contains(ii)==false && graph[u][ii] != 0 && dist[u] != 100000 && dist[u] + graph[u][ii] < dist[ii]){
                dist[ii] = dist[u] + graph[u][ii]
            }
        }
    }
    dist.pr()
}

fun IntArray.pr(){
    this.forEachIndexed{ k, v ->
        println("${k} ${v} ")
    }
}
fun Array<IntArray>.show(){
    this.forEach{ it ->
        it.forEach{ l ->
            print("${l} ")
        }
        println("")
    }
}
fun main(args: Array<String>) {
    var graph: Array<IntArray> =  arrayOf(
        intArrayOf( 0, 4, 0, 0, 0, 0, 0, 8, 0 ),
        intArrayOf( 4, 0, 8, 0, 0, 0, 0, 11, 0 ),
        intArrayOf(0, 8, 0, 7, 0, 4, 0, 0, 2 ),
        intArrayOf( 0, 0, 7, 0, 9, 14, 0, 0, 0 ),
        intArrayOf( 0, 0, 0, 9, 0, 10, 0, 0, 0 ),
        intArrayOf( 0, 0, 4, 14, 10, 0, 2, 0, 0 ),
        intArrayOf( 0, 0, 0, 0, 0, 2, 0, 1, 6 ),
        intArrayOf(8, 11, 0, 0, 0, 0, 1, 0, 7 ),
        intArrayOf( 0, 0, 2, 0, 0, 0, 6, 7, 0) 
    ) 
    //number of nodes = 9
    //graph.show()
    dijiskras(graph,1)

}