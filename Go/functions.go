package main

type pew struct {
	num int
}

func (p pew) printArr(c int, b []int) string {
	print(p.num)
	print(c)
	for a := 0; a < len(b)-1; a++ {
		println(a, b[a])
	}
	return "a[[le"
}

func main() {
	p := pew{
		num: 1,
	}
	m := []int{1, 2, 3, 4, 5}
	println(p.printArr(4, m))

}
