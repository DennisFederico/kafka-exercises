db.createCollection( "moviesRated", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "title" ],
      properties: {
         title: {
            bsonType: "string",
            description: "title"
         },
         year: {
            bsonType : "string",
            description: "year"
         },
         genres: {
            bsonType : "string",
            description: "genres"
         },
         rating: {
            bsonType : "double",
            description: "rating"
         }
      }
   } }
} )