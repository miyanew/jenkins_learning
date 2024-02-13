pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                script {
                    docker.image('ruby:3.3.0-alpine3.19').inside {
                        sh 'ruby --version'
                    }
                }
            }
        }
    }
}
