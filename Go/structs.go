package main

type person struct {
	name string
	age  int
}

func main() {
	p1 := person{
		name: "jackal",
		age:  4,
	}
	println(p1.name)
}
