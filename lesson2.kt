fun main(){
    //     array list
        /*
         * fixed size
         * to make changes to it a new copy must be remade
         * we access element susing indexes
         *   * */
        var missingStudents = arrayListOf("Nicole","Natalie", "Adrian", "Derrick", "Shine" ,"Ian")
      
        missingStudents += "John" // this recreates a new instance of an array list
        
      /*
       * COLLECTIONS: 
       * - not fixed in nature
       * - they can either be mutable or immutable by default they are immutable
       * - types: 
       * 	- list (a collection of items ) => listOf() ,  mutableListOf()  doc:https://kotlinlang.org/docs/list-operations.html
       * 	- set (a collection of unique items ) => setOf() , mutableSetOf() doc:https://kotlinlang.org/docs/set-operations.html
       * 	- map (dictionary) => mapOf(), mutableMapOf() doc:https://kotlinlang.org/docs/map-operations.html
       * */  
        
        println("============================================")
        val colors = listOf("red", "green", "blue") // immutable 
        for (color in colors){
            println(color)
        }
        
        println("============================================")
        var fruits = mutableListOf("mango","banana","apples")
        fruits.add("watermelon")
        fruits = mutableListOf("apple","pear","kiwi","pineapple","kiwi" ,"pineapple", "oranges", "oranges", "oranges")
        for (fruit in fruits){
            println(fruit)
        }
        println("============================================")
        
        val uniqueFruits = setOf("apple","pear","kiwi","pineapple","kiwi" ,"pineapple", "oranges", "oranges", "oranges")
        println(uniqueFruits)
        
        var uniqueFruitsToChange = mutableSetOf("apple","pear","kiwi","pineapple","kiwi" ,"pineapple", "oranges", "oranges", "oranges")
        println(uniqueFruitsToChange)
        
        println("============================================")
          
        
        var student = mapOf(
            "name" to "JOhn DOe",
             "age" to 17,
              "course" to "programming")
        println(student["name"])
        
        println("============================================")
    }