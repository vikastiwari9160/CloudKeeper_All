// 1. Convert to Arrow Function
// Rewrite the following function using an arrow function:
// function add(a, b) {
//     return a + b;
// }

let add = (a,b)=>{
    return a+b;
}

// 2. Default Parameters
// Create a function greet that takes two parameters, name and message. If the message is not provided, it should default to "Welcome!". Use default parameters in your implementation.


let greet = (name,message="Welcome!") =>{
    console.log(`${message}+${name}`);
}


// 3. Template Literals
// Write a function formatString that takes a name and an age and returns a sentence in the format:
// "Hello, my name is [name] and I am [age] years old."
let mess = (name,age)=>{
    console.log(`Hello, my name is ${name} and I am ${age} years old.`)
}

// 4. Object Destructuring
// Given the following object:
// const person = {
//     name: 'Alice',
//     age: 25,
//     address: {
//         city: 'New York',
//         country: 'NY'
//     }
// };
// Write a function that extracts the name and city properties and logs the sentence: "Alice lives in New York." It should also access and log the address object.
const person = {
    name: 'Alice',
    age: 25,
    address: {
        city: 'New York',
        country: 'NY'
    }
};

let ObjDis = (person) =>{;
    const {name,age,address:{city,country}} = person; 
    console.log(`${name} lives in ${city}`)
}

ObjDis(person);

// 5. Rest Operator
// Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.

let restFunction = function(...all){
    let sum=0;
    all.forEach( ele => {
        sum+=ele;
    });
    return sum;
}

// 6. Filter Even Numbers
// Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
// Example:
// filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]

const filterEvens = (arr) =>{
    return arr.filter( ele =>{
        if(ele%2==0){
            return true
        }
        return false;
    })
}

// 7. Array Mapping
// Write a function doubleValues that takes an array of numbers and returns a new array where each number is doubled. Use the map method.
// Example:
// doubleValues([1, 2, 3]); // Output: [2, 4, 6]

let doubleValues=(arr)=>{
    return arr.map( ele =>{
        return ele*2;
    })
}

// 8. Find the Maximum
// Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
// Example:
// findMax([3, 5, 7, 2, 8]); // Output: 8

let findMax = (arr) =>{
    return Math.max(...arr);
}

// 9. Object and Array Destructuring
// Given the following data:
// const data =[
//   {
//     name: "Bob",
//     age: 24
//   },
//   {
//     name: "Alice",
//     age: 21
//   }
// ]
// Write a function that extracts the age as  “24”  and name as “Alice” and returns a sentence: "Alice’s age is 24."

const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]
let mess2 =(data)=>{
    let [person1,person2] = [...data];
    console.log(`${person2.name}'s age is ${person1.age}`);
}

// 10. Data Manipulation using Array functions
// Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
// Input:
// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "price": 109.95,
// "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
// "category": "men's clothing",
// "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
// "rating": {
// "rate": 3.9,
// "count": 120
// }
// }]

// Output: 
// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "rate": 3.9,
// "count": 120
// }]

var objarr = [{
"id": 1,
"title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
"price": 109.95,
"description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
"category": "men's clothing",
"image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
"rating": {
"rate": 3.9,
"count": 120
}
}]

// Dynamic approch

let manipulateArrar2 = (objarr,arr) =>{
    return objarr.map(obj=>{
        let newobj={};
        findInObj(obj,newobj,arr);
        return newobj;
    })
}

let findInObj = (obj,newobj,arr)=>{
    for(let key in obj){
        if(typeof(obj[key])=='object'){
            findInObj(obj[key],newobj,arr);
        }
        if(arr.includes(key)){
            newobj[key]= obj[key];
        }
    }
}

// Concrete approch

let manipulateArrar = (objarr,arr) =>{
    return objarr.map(obj=>{
        return {
            id:obj.id,
            title:obj.title,
            rate:obj.rating.rate,
            count:obj.rating.count
        }
    })
}



// 11. Default Parameter
//  const fun = (name = "abc") => {
//         if (name) {
//           console.log("if", name);
//         } else {
//           console.log("else", name);
//         }
//       };
	  
// fun(""); 
// Output ?

console.log("Empty sting is consider as false so the output will be else . ex- ",""==false);

// 12. Deep Clone Objects
// Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
// Example:
// const obj = { a: 1, b: { c: 2 } };
// const clonedObj = deepClone(obj);
// clonedObj.b.c = 42;
// console.log(obj.b.c); // Output: 2

// let deepClone = (obj)=>{
//     return JSON.parse(JSON.stringify(obj));
// }

let deepClone = (obj)=>{
    let newobj = {};
    for(let key in obj){
        if(obj.hasOwnProperty(key)){
            if(typeof(obj.key)==Object){
                newobj[key]= deepClone(obj.key);
            }else{
                newobj[key] = obj[key];
            }
        }
    }
    return newobj;
}

const obj = { a: 1, b: { c: 2 } };
const clonedObj = deepClone(obj);
clonedObj.b.c = 42;
console.log(obj.b.c); // Output: 2


// 13. Flatten Nested Arrays
// Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
// Example:
// flattenArray([1, [2, [3, [4, 5]]]]); // Output: [1, 2, 3, 4, 5]

let flattenArray = (arr) =>{
    return arr.reduce((acc,cur)=>{
        if(Array.isArray(cur)){
            acc.push(...flattenArray(cur));
        }else{
            acc.push(cur);
        }
        return acc;
    },[])
}

