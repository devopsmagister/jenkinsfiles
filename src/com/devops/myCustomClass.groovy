package src.com.devops
class myCustomClass {
    String name
    String test
    
    myCustomClass(String name, String test) {
        this.name = name
        this.test = test
    }
    
    String greet() {
        println("Hello, ${this.name} ${this.test}!")
        def myEnvVar = System.getenv("JAVA_HOME")
        println "The value of MY_ENV_VAR is: ${myEnvVar}"
    }
}