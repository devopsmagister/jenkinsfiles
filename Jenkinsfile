import sample.example.MyCustomClass

pipeline {
  agent any

  stages {
    stage('Call Groovy Class') {
      steps {
          script {
            // // def classpath = "${env.WORKSPACE}/sample/example"

            // sh "ls ${classpath}"

            // env.CLASSPATH = classpath
            
            // import sample.example.MyCustomClass
            
            // Create an instance of the class and call its methods
            def myInstance = new MyCustomClass("Chiranjit", "Ghosh")
            myInstance.greet()
          }
      }
    }
  }
}
