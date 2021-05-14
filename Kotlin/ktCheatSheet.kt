//need for queues
import java.util.Queue
import java.util.LinkedList
import java.util.ArrayDeque // to use stacks and stufff
////////////////////////////////////////
fun MutableList<Int>.swap(index1: Int, index2: Int) {//swap in a Muatable List, very useful
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}
fun MutableList<Int>.look(index: Int){
    println(this[index])
}

//// how to print and do cool stuff with this and stuff and stuff 
fun testFunList(list: MutableList<Int>){
    println("list stuff")
    //initialize list with size
    var size = 5
    val arrayOfZeros = IntArray(size) //equivalent in Java: new int[size] all zeros
    val numbersFromOne = IntArray(size) { it + 1} // makes it  1-> 5
    //val myInts = intArrayOf(1, 1, 2, 3, 5, 8, 13, 21)

    numbersFromOne.forEach{ it ->
        print("${it} ")
        list.add(it)
    }
    list.look(0)
    arrayOfZeros.forEach{
        print(it)
    }
}

fun testFunSet(set: MutableSet<Int>){
    println("set stuff")
    set.add(1)
    set.add(2)
    set.add(1)
    var a = set.count{ e-> e == 1} // can also use  .contains
    set.remove(2)
    println(a)
    println(set)
}
fun HashMap<Int, Int>.pri(){
    for((k,v) in  this){
        println("${k} ${v} ")
    }
}
fun testFunMap(map:  HashMap<Int, Int>){
    println("map stufff")
    map[1] = 90
    map[6] = 69
    map.pri()
}
fun testFunQ(nums: Queue<Int>){//queuese QQQQQQQQQQQQQQQQQ
    println("Queueueue stuff")
    nums.add(781)
    println(nums)
    nums.remove()
    if(nums.contains(1)) print(nums.peek())
    println(nums)
}
fun testFunStack(stack: ArrayDeque<Int>){
    println(" Stack studffffff")
    stack.push(1)
    stack.push(2)
    stack.push(3)
    stack.push(4)
    println(stack)           // --> [4, 3, 2, 1]
    println(stack.isEmpty()) // ----> false
    println(stack.peek()) // check stufffffffff
    println(stack.pop())     // --> 4 remove stuff
    println(stack)
}


fun main(args: Array<String>) {
    //empty List
    var list = mutableListOf<Int>()// edit and swap
    testFunList(list)


    //empty set
    val set = mutableSetOf<Int>()
    testFunSet(set)


    //empty map
    val items = HashMap<Int, Int>()
    testFunMap(items)

    //empty queueu sort of
    var nums: Queue<Int> = LinkedList<Int>(listOf(1, 2, 3))//list of doesnt have to be there
    testFunQ(nums)

    //ArrayDeque or Stack
    var stack = ArrayDeque<Int>()
    testFunStack(stack)

    //String
    var str = "asdasda"
    str.replace("as", "ji")

}