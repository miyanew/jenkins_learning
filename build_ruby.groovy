pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'ruby --version'
                sh 'which docker'
                sh 'uname -a;id;pwd'
                sh 'ls -l'
                    }
            }
        }
    }
