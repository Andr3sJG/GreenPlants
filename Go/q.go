package main

import "container/list"
import "fmt"

func q() {
	la := list.New()

	la.PushBack(4)
	la.PushBack(7)
	la.PushBack(9)
	la.PushBack(10)
	la.PushBack(9)
	
	fmt.Println(la.Front().Value)
	la.Remove(la.Front())
	fmt.Println(la.Front().Value)
	fmt.Println(la.Back().Value)

}

func main() {
	q()
}