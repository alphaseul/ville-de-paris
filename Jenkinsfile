pipeline {
    agent any

    stages {

        stage('clean'){
            steps {
                sh "mvn clean"
            }
        }
        stage('Build') {
            steps {
                sh "mvn compile"
            }
        }
        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('package'){
            steps{
                sh "mvn package"
            }
        }
        stage('deploy') {
            steps {
                sh "mvn deploy"
            }
        }
    }
 }