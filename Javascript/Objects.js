let persons = [ {
  "name" : "Dean",
  "age" : 16,
  "isProgrammer" : true
}, {
  "name" : "John",
  "age" : 19,
  "isProgrammer" : false
}];

//printing name of the object "persons" at index 0
console.log(persons[0].name);
console.log(persons[1].isProgrammer);

for (let i=0; i<2; i++) {
  console.log(persons[i].name + " : " + persons[i].age);
}