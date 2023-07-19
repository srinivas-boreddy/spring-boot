pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
        stage('Sonarqube') {
            steps {
                echo 'SonarQube'
            }
        }
        stage('Push to artifactory') {
            steps {
                echo 'artifactory'
            }
        }
        stage('Deploy to QA') {
            steps {
                echo 'Deploy to QA'
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