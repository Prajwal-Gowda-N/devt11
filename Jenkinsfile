pipeline {
    agent any

    stages {
        stage('Clone Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Prajwal-Gowda-N/devt11.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t myp .'
            }
        }

        stage('Run Docker Image') {
            steps {
                bat 'docker run -d -p 6001:6001 myp'
            }
        }
    }
}
