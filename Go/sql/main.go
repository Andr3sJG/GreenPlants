package main

import (
	"fmt"
	"database/sql"
	_ "github.com/go-sql-driver/mysql"
)

type User struct{
	Name string `json:"name"`
}

func main(){
	fmt.Println("sql")
	db, err  := sql.Open("mysql","root:red@tcp(127.0.0.1:3306)/Test")
	if err != nil {
		panic(err.Error())
	}
	defer db.Close()

	//insert, err := db.Query("INSERT INTO users VALUES('jack')")
	results, err := db.Query("SELECT names FROM users")

	if err != nil {
		panic(err.Error())
	}
	defer results.Close()//insert

	for results.Next() {
		var user User
		err = results.Scan(&user.Name)
		if err != nil{
			panic(err.Error())
		}
		fmt.Println(user.Name)
	}

}