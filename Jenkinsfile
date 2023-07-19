pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
                sh 'mvn test'
            }
        }
        stage('Sonarqube') {
            steps {
                echo 'SonarQube'
            }
        }
    
        stage('Deploy to QA') {
            steps {
                echo 'Deploy to QA'
            }
        }
        stage('Artifacts') {
            steps {
                echo 'Artifacts'
            }
        }
         stage('Deploy to Prod') {
            steps {
                echo 'Deploy to Prod'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
        failure {
            echo ('failed')
        }
        success {
            echo ('success')
        }
        aborted {
            echo ('aborted')
        }
    }
}