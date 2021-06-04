package main

func binary(arr []int, find int) string {
	low := 0
	high := len(arr)

	for low < high {
		mid := (low + high) / 2
		if arr[mid] == find {
			return "fnd"
		}

		if arr[mid] > find {
			high = mid - 1
		}

		if arr[mid] < find {
			low = mid + 1
		}

	}
	return "ntfnd"
}
