pipeline {
    agent any 
    
    tools {
        maven 'M3'
        
    }
    
    stages {
        stage('checkout') {
            steps {
               git url: 'https://github.com/rijaandrianivo/simple-boot.git'
            }
   
        }
        stage('compile') {
            steps {
                sh 'mvn clean compile'
            }
        }
        
        stage('test') {
            steps {
                sh 'mvn test'
            }
        } 
        
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }
    }
}