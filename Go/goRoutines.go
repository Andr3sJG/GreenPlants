package main

// learn more about goroutines
import (
	"fmt"
	"sync"
)

func trick() {
	var wg sync.WaitGroup
	wg.Add(10)
	for i := 0; i < 10; i++ {
		go printNun(i, &wg)
	}
	wg.Wait()
}

func noStar() {
	fmt.Println("jack")
}

func printNun(i int, wg *sync.WaitGroup) {
	fmt.Println(i)
	noStar()
	wg.Done()
}

func main() {
	arr := []int{2, 3, 4, 5}
	fmt.Println(arr)
	trick()
}
