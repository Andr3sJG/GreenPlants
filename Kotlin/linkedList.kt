

class OurLinkedList{
    var first: Node? = null

    val lastNode: Node?
        get(){
            var curr:Node? = first
            while(curr?.next != null) curr = curr.next
            return curr
        }



    fun add(value : Int){
        val newNode = Node(value, null)
        if(first == null) first = newNode
        else{
            lastNode!!.next = newNode
        }
    }

    fun printNode(){
        var temp = first
        while(temp!!.next != null){
            println(temp.value)
            temp = temp.next
        }
    }

}
data class Node(val value : Int, var next : Node?)


fun main(){
    var ll =  OurLinkedList()
    ll.add(3)
    ll.add(6)
    ll.add(9)
    ll.add(1)
    ll.printNode()

}