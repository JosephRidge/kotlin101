//  single-line  comment
/*
 * This is a multi-line comment
 * 
 * */

 const val DOB = 2020 // defines a compile time constant
 const val API_URL = "https://rickandmortyapi.com/api/character/165"
 
 // entry point ot your entire kotlin program
 fun main() {
     /*
      * Variable: 
      * key word:
      * 	- var => mutable variable 
      * 	- val => immutable variable (use it for runtime constants)
      * 
      * */ 
     // mutable variable
     var name = "John Doe" // mutable variable
     name = "Doe John"
     
     var ageOne: Int
     ageOne = 10
     
     // immutable variable
     val yob = 2010
 //     yob = 2013 // returns an error:'val' cannot be reassigned. since val is immutable
     
     // data types: string, integer, long, double, boolean
     // declared variables with annotations
     var firstName:String  = "Michael"
     var age: Int = 10
     var yearOfBirth: Int = 2016
     var weight: Double =45.55
     var isInSchool: Boolean = true 
     var population: Long = 20L // very large number i.e larger than an integer
     var amount:Int = 10_000_000 // kotlin allows you to write large number and space then using underscores
     
     var output = "My first name is $firstName" 
 //     output = "My first Name is " + firstName // concatenation
     output = "My first name is $firstName, I am ${2026 - yearOfBirth} yrs old." 
     var secondName: String? // nullability 
     secondName = null 
     
 //      println(secondName)
     
     
     /*
      * FUNCTION: 
      * 	- mini-program that does one thing
      * part of a functions:
      * 		- key word: fun
      * 		- function name
      * 		- parenthesis: ()
      * 		- curly braces: {} => inside the curly is where our login rests
      * */
     
 //      define function
     fun greetings(){
         println("Hello World!")
     }
     
     //      call the function
     greetings()
     
     fun welcomePerson(name:String){ // name:String => parameter
         println("Welcome $name")
     }
     
     welcomePerson("Harry Porter") // "Harry Porter" becomes => argument
     
     fun welcomePersonTwo(name:String):String {
         return "Welcome home $name"
     }
     
     var greeting = welcomePersonTwo("Peter Parker") // caling the function
     println(greeting)
     
    fun welcomePersonThree(name:String):String = "Welcome home $name"
    
     println(welcomePersonThree("Johnes"))
     
     /*
      * LOGICAL OPERATORS: 
      * 	and, or, not
      * and => &&
      * or => ||
      * not => !
      * 
      * */
     fun checkVoterReadiness(age: Int, name:String, yob:Int){
         if (age > 18 && ((2026 - yob) == age)){ 
             println("$name is ready to vote!!")
         }else{
             println("You cannot vote!")
         }
      }
        
        checkVoterReadiness(18, "Vanessa", 2018)
        
 }