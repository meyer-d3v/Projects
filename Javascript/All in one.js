let names = ["Nathan", "Jonathan", "Frederick", "Dean", "John"];

let ages = [14, 16, 8, 16, 21];

//Display all names
for (let i=0; i<5; i++) {
  console.log(names[i] + " : " + ages[i]);
}

//Check for specific names
for (let i=0; i<5; i++) {
  if (names[i] == "Dean") {
    console.log("Found person : " + names[i]);
  } /* else {
    console.log("Person not found");
  } */
}

//check for a variable 
let person = "Frederick";

for (let i=0; i<5; i++) {
  if (names[i] == person) {
    console.log("Found person : " + names[i]);
  }
}

//show last person in the Array
console.log(names[names.length-1]);

//add name to "names" array
names.push("Daniel");
//add age to "ages" array
ages.push(12);
console.log(names[5]);
console.log(ages[5]);

//You can add objects to arrays

let cars = [
  {
    "brand" : "BMW",
    "model" : "M4 Competition"
  }, 
  {
    "brand" : "Range Rover",
    "model" : "Velar"
  }, 
  {
    "brand" : "Volkswagen",
    "model" : "GTI"
  }];

//print each car brand

for (let i=0; i < cars.length; i++) {
  console.log(cars[i].brand);
}

//print brand and model together

for (let i=0; i < cars.length; i++) {
  console.log("Brand: " + cars[i].brand + ";  Model: " + cars[i].model);
}