pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'mvn build'
            }
        }
        
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
