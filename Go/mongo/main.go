package main

//U2RbRiTj8QyLCFjX mongoPassword
import (
	"context"
	"fmt"
	"log"
	"time"

	"go.mongodb.org/mongo-driver/bson"
	"go.mongodb.org/mongo-driver/mongo"
	"go.mongodb.org/mongo-driver/mongo/options"
	//"go.mongodb.org/mongo-driver/mongo/readpref"
)

func main() {
	client, err := mongo.NewClient(options.Client().ApplyURI(
		"mongodb+srv://redUser:U2RbRiTj8QyLCFjX@andred0.2ygvo.mongodb.net/andred0?retryWrites=true&w=majority"))
	if err != nil {
		log.Fatal(err)
	}
	ctx, _ := context.WithTimeout(context.Background(), 10*time.Second)

	err = client.Connect(ctx)
	if err != nil {
		log.Fatal(err)
	}

	defer client.Disconnect(ctx)
	/////////////// make documents
	qS := client.Database("qS")
	randomData := qS.Collection("humans")
	otherData := qS.Collection("sharks")
	randomResults, err := randomData.InsertOne(ctx, bson.D{
		{Key: "title", Value: "the apple king"},
		{Key: "author", Value: "red red"},
		{"tags", bson.A{"jack", "red", "apple"}},
	})
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(randomResults.InsertedID)
	otherResult, err := otherData.InsertMany(ctx, []interface{}{
		bson.D{
			{"random", randomResults.InsertedID},
			{"title", "one"},
			{"description", "la la la la la "},
		},
		bson.D{
			{"random", randomResults.InsertedID},
			{"title", "two"},
			{"description", "i was seventeen"},
		},
	})

	if err != nil {
		log.Fatal(err)
	}

	fmt.Println(otherResult.InsertedIDs...)
	////////////
	/* //ping the database, cluster
	err = client.Ping(ctx, readpref.Primary())
	if err != nil {
		log.Fatal(err)
	}

	databases , err := client.ListDatabaseNames(ctx, bson.M{})
	if err != nil {
		log.Fatal(err)
	}
	fmt.Println(databases)
	*/
	//quickStartDatabase := client.Database("sample_airbnb")
	//places := quickStartDatabase.Collection("listingsAndReviews")

	cursor, err := otherData.Find(ctx, bson.M{})

	if err != nil {
		log.Fatal(err)
	}

	defer cursor.Close(ctx)

	for cursor.Next(ctx) {
		var abode bson.M
		if err = cursor.Decode(&abode); err != nil {
			log.Fatal(err)
		}
		fmt.Println(abode)
		//fmt.Println(abode["name"])
	}

}
