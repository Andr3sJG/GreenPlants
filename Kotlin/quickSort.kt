



fun pivot(items : MutableList<Int>,left : Int, right : Int): Int{
    var pivot = items[right]
    var pivotIndex =  left-1
    for(i in left..right-1){
        if(items[i] <= pivot){
            pivotIndex+=1
            items.swap(i,pivotIndex)
        }
    }
    pivotIndex+=1
    items.swap(pivotIndex,right)
    return pivotIndex
}

fun quickSort(items : MutableList<Int>,left : Int, right : Int){
    if(left < right){
        var pivotIndex = pivot(items,left,right)
        quickSort(items,left,pivotIndex-1)
        quickSort(items,pivotIndex+1,right)
    }
}


fun printList(items : MutableList<Int>){
    items.forEach{
        print("$it ")
    }
    print("\n")
}


fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(){
    var list = mutableListOf<Int>()
    for(i in -10..10){
        list.add(i)
    }
    list.shuffle()
    printList(list)
    quickSort(list,0,list.size-1)
    printList(list)
}