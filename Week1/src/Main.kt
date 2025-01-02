fun main() {
    welcome()
    userInfor()
    departmentDetails()
}


fun welcome() {
    println("Welcome to VKU")
}
fun userInfor()  {
    print("Enter your name: ")
    val name = readLine()


    print("Enter your age: ")
    val age = readLine()

    print("Enter your gpa: ")
    val GPA = readLine()

    println("\n--- User Information ---")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")
}
fun departmentDetails(){
    println("1. Computer Science")
    println("2. Information Technology")
    println("3. Software Engineering")
    println("4. Cybersecurity")
    println("Enter a number: ")
    val x = readLine()
    if(x == "1") {
        println("Your department is: Computer Science ")
    }else if( x == "2"){
        println("Your department is: Information Technology")
    }else if( x == "3"){
        println("Your department is: Software Engineering")
    }else if (x == "4"){
        println("Your department is: Cybersecurity")
    }
}