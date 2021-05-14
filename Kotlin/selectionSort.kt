
fun selectSort(items : MutableList<Int>){
    for(i in 0..items.size-2){
        var min = i
        for(j in i+1..items.size-1){
            if(items[j] < items[min]) min = j
        }
        items.swap(min,i)
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
    selectSort(list)
    printList(list)
}