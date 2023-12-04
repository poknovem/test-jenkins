pipeline {
    agent any

    environment {
        NAME = 'Nattapol'
        LASTNAME = 'Tassaneeyakul'
        secret = credentials('SECRET_TEXT')
    }

    stages {
        stage('Build') {
            steps {
                sh 'echo $NAME $LASTNAME $secret'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying..'
            }
        }
    }
}