data class Node(val value : Int, var left : Node?, var right : Node?)



class tree(value : Int){
    var root: Node? = null
    init{
        root = Node(value,null,null)
    }

    private fun addHelper(temp : Node?, rootTemp : Node?){
        
        if(rootTemp!!.value > temp!!.value){
            if(rootTemp.left == null) rootTemp.left = temp
            else addHelper(temp,rootTemp.left)
        }else{
            if(rootTemp.right == null) rootTemp.right = temp
            else addHelper(temp,rootTemp.right)
        }
    }
    fun add(value : Int){
        addHelper(Node(value,null,null), root)
    }
    private fun inOrderHelp(temp : Node?){
        if(temp == null) return 
        inOrderHelp(temp.left)
        println(temp.value)
        inOrderHelp(temp.right)
        
    }
    private fun preOrderHelper(temp : Node?){
        if(temp == null) return
        println(temp.value)
        inOrderHelp(temp.left)
        inOrderHelp(temp.right)
    }
    private fun postOrderHelper(temp : Node?){
        if(temp == null) return
        inOrderHelp(temp.left)
        inOrderHelp(temp.right)
        println(temp.value)       
    }

    fun inOrder(){
        inOrderHelp(root)
    }
    fun preOrder(){ preOrderHelper(root) }
    fun postOrder(){ postOrderHelper(root) }

    fun invertTreeHelper(temp : Node?){
        if(temp == null) return
        var t: Node? = temp.left
        temp.left = temp.right
        temp.right = t        
        invertTreeHelper(temp.left)
        invertTreeHelper(temp.right)       
    }
    fun invertTree(){
        invertTreeHelper(root)
    }
}


fun main(args: Array<String>) {
    var t = tree(69)
    t.add(7)
    t.add(90)
    t.add(200)
    t.add(89)
    t.add(89)
    t.inOrder()
    print("\n")
    t.preOrder()
    print("\n")
    t.postOrder()
    print("\n")
    t.invertTree()
    t.inOrder()
    
}