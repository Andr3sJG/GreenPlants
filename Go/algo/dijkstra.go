package main

import (
	"fmt"
)

const M int = 10000

func minDist(arrD [9]int, arrB [9]bool) int {
	min := M
	minIndex := -1
	for v := 0; v < 8; v++ {
		if arrB[v] == false && arrD[v] <= min {
			min = arrD[v]
			minIndex = v
		}
	}
	return minIndex
}

//size is 9

func dij(arr [][]int, src int) {
	distArr := [9]int{}
	boolArr := [9]bool{}

	for i := 0; i < 9; i++ {
		distArr[i] = M
		boolArr[i] = false
	}

	distArr[src] = 0

	for count := 0; count < 8; count++ {
		var u int = minDist(distArr, boolArr)
		boolArr[u] = true
		for v := 0; v < 9; v++ {
			if !boolArr[v] && arr[u][v] != 0 && distArr[u] != M && distArr[u]+arr[u][v] < distArr[v] {
				distArr[v] = distArr[u] + arr[u][v]
			}
		}
	}

	fmt.Println(distArr)

}
