import src.com.devops.myCustomClass
def call(String message) {

    pipeline {
        agent any

        parameters {
            string(name: 'FirstName', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
            string(name: 'LastName', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
      }

      stages {
        stage('Example') {
          steps {
            script {
                def myInstance = new myCustomClass("${params.FirstName}", "${params.LastName}")
                myInstance.greet()
                // output = myInstance.greet()
                // println("Output is")
                // println(output)
                // sh """
                //   echo "staus is  ${output}" > file.txt
                //   """
                //  archiveArtifacts artifacts: 'file.txt'
                }

          }
        }
      }
    }

}