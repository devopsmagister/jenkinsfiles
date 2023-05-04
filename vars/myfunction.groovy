import com.devops.myCustomClass
def call(String message) {
    def String LastName

    pipeline {
        agent any

        parameters {
            string(name: 'FirstName', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
      }

      stages {
        stage('Example') {
          steps {
            script {
                def myInstance = new myCustomClass("${params.FirstName}", "${LastName}")
                myInstance.greet()

            }

          }
        }
      }
    }

}