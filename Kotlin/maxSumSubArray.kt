fun maxSum(arr : IntArray): Int{
    var maxSoFar = arr[0]
    var currMax = arr[0]
    for(i in 1..arr.size-1){
        currMax = maxOf(arr[i], currMax+arr[i])
        maxSoFar = maxOf(maxSoFar, currMax)
    }
    return maxSoFar
}




fun main(){
    var arr = intArrayOf(-2,-3,4,-1,-2,1,5,-3)
    print(maxSum(arr))
}