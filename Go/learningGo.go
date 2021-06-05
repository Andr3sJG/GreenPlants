package main

func arrays() {

	a := [5]int{2, 3, 4, 5, 6}
	println("a", a[1])
	println("a", a[2:4])
	s := []int{} // initializ empty array

	s = append(s, 56, 11)
	println("s:", s[1])

	println(len(s))

	for k, v := range s {
		println(k, v)
	}

}

func maps() {
	var sampleMap map[int]string

	sampleMap = map[int]string{
		2: "asdasd",
		4: "asdasfggggggg",
	}

	sampleMap[5] = "ring"
	delete(sampleMap, 2)

	for k, v := range sampleMap {
		println(k, v)
	}
}

func main() {
	arrays()
	println()
	maps()
}
