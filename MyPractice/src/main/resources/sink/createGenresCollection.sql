db.createCollection( "genresRated", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "genre" ],
      properties: {
         genre: {
            bsonType: "string",
            description: "genre"
         },
         rating: {
            bsonType : "double",
            description: "rating"
         }
      }
   } }
} )