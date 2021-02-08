db.createCollection( "principalsRated", {
   validator: { $jsonSchema: {
      bsonType: "object",
      required: [ "name" ],
      properties: {
         name: {
            bsonType: "string",
            description: "name"
         },
         title: {
            bsonType : "string",
            description: "title"
         },
         birthYear: {
            bsonType : "string",
            description: "birthday year"
         }
      }
   } }
} )