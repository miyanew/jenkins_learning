pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script {
                    sh 'uname -a;id;pwd'
                    sh 'ls -l'
                    sh 'docker -v'
                // sh "ls ${env.WORKSPACE}"
                    docker.image('ruby:3.3.0-alpine3.19').inside {
                        sh 'ruby --version'
                    }
                }
            }
        }
    }
}
