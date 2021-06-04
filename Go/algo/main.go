package main

import (
	"fmt"
	"math/rand"
	"time"
)

func randArr() []int {
	r := rand.New(rand.NewSource(time.Now().Unix()))
	arr := []int{}
	for i := 0; i < 10; i++ {
		rand := r.Intn(20)
		arr = append(arr, rand)
	}

	return arr
}
func print2D(arrArr [][]int) {
	for _, v := range arrArr {
		fmt.Println(v)
	}
	print("\n")
}
func main() {

	arr := randArr()
	fmt.Println(arr)
	quickSort(arr, 0, 9)
	fmt.Println(arr)

	arr = randArr()
	fmt.Println(arr)
	selectS(arr)
	fmt.Println(arr)

	///////////////
	bin := binary(arr, 5)
	fmt.Println(bin)
	//////////////
	var arrArr = [][]int{
		{0, 4, 0, 0, 0, 0, 0, 8, 0},
		{4, 0, 8, 0, 0, 0, 0, 11, 0},
		{0, 8, 0, 7, 0, 4, 0, 0, 2},
		{0, 0, 7, 0, 9, 14, 0, 0, 0},
		{0, 0, 0, 9, 0, 10, 0, 0, 0},
		{0, 0, 4, 14, 10, 0, 2, 0, 0},
		{0, 0, 0, 0, 0, 2, 0, 1, 6},
		{8, 11, 0, 0, 0, 0, 1, 0, 7},
		{0, 0, 2, 0, 0, 0, 6, 7, 0},
	}
	print2D(arrArr)
	dij(arrArr,0)
}
