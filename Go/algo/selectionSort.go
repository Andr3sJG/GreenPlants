package main

func selectS(arr []int) {
	var size int = len(arr)
	for i := 0; i < size-1; i++ {
		minIndex := i
		for j := i + 1; j < size; j++ {
			if arr[j] < arr[minIndex] {
				minIndex = j
			}
		}
		arr[minIndex], arr[i] = arr[i] , arr[minIndex]
	}
}
