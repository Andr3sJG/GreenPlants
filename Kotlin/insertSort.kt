
fun insertSort(items : MutableList<Int>){
    for(i in 1..items.size-1){
        var  value = items[i]
        var j = i
        while(j > 0 && items[j-1] > value){
            items[j] = items[j-1]
            j--
        }
        items[j] = value
    }
}

fun printList(items : MutableList<Int>){
    items.forEach{
        print("$it ")
    }
    print("\n")
}

fun main(){
    var list = mutableListOf<Int>()
    for(i in -10..10){
        list.add(i)
    }
    list.shuffle()
    printList(list)
    insertSort(list)
    printList(list)

}