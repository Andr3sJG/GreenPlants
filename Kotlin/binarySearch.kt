



fun binarySearch(list : MutableList<Int>,x : Int):Boolean{
    var right = list.size-1
    var left = 0
    while(right >= left){
        var mid = (right + left)/2
        if(list[mid] == x){
            return true
        }

        if(list[mid] > x) right = mid-1
        else left = mid+1

    }
    return false
}


fun main(){
    var list = mutableListOf<Int>()

    for(i in 0..10){
        list.add(i*2)
    }

    if(binarySearch(list,16)){
        println("found")
    }else{
        println("not found")
    }

    // list.forEach{it->
    //     println(it)
    // }

}