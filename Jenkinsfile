pipeline{
    agent any
   stages{
      stage("Clone Code"){
        steps{
               git ''
        }
       
      }

      stage("Build"){
        steps{
           sh 'mvn clean package'
        }
      }
      stage("Test"){
        steps{
            sh 'mvn test'
        }
      }

      stage("Build Docker Image"){
        steps{
            sh 'docker build -t myp .'
        }
      }
      stage("Run Docker Image"){
        steps{
            sh 'docker run -d myp'
        }
      }

   }
}