@Library('test@main') _

pipeline {
  agent any

  stages {
    stage('Call Groovy Class') {
      steps {
          script {
            def myInstance = new MyCustomClass("Chiranjit", "Ghosh")
            // myInstance.greet()
            def result = myInstance.greet()
            echo "staus is  ${result}"
          }
      }
    }
  }
}
