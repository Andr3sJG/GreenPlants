package main

func pivot(arr []int, low int, high int) int { //recieve reference
	p := arr[high]
	i := low - 1
	for j := low; j < high; j++ {
		if arr[j] <= p {
			i++
			arr[i], arr[j] = arr[j], arr[i]
		}
	}
	arr[i+1], arr[high] = arr[high], arr[i+1]
	return i + 1
}

func quickSort(arr []int, low int, high int) {
	if low < high {
		p := pivot(arr, low, high) // pass by refenrnce
		quickSort(arr, low, p-1)
		quickSort(arr, p+1, high)
	}

}
