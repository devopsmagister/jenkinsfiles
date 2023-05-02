package src.example
class MyCustomClass {
    String name
    String test
    
    MyCustomClass(String name, String test) {
        this.name = name
        this.test = test
    }
    
    void greet() {
        println("Hello, ${this.name} ${this.test}!")
        def myEnvVar = System.getenv("JAVA_HOME")
        println "The value of MY_ENV_VAR is: ${myEnvVar}"
    }
}