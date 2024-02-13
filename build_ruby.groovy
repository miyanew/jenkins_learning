pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                // sh 'ruby --version'
                sh 'uname -a;id;pwd'
                sh 'ls -l'
                sh 'docker -v'
                sh 'which which'
            }
        }
    }
}
