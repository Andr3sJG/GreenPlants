package main

func main() {
	var b string = "hellow qwerty" //bool, int, float, string // dont have to set it to something
	println(b)

	a := "" // set it to something
	a = "dooke"
	println(a)

	if b == " " {
		println("mada")
	} else {
		println("dasda")
	}

	for i := 0; i < 10; i++ {
		println(i)
	}

	n := 1
	for n < 12 {// GO deosnt have a while loop
		n *= 3
	}
}
