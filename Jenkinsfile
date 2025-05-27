pipeline {
    agent any
    stages {
        stage ('checkout') {
            steps {
                git branch : 'main', url : "https://github.com/Akhilakki9966/project.git"
            }
        }
        stage ('compile') {
            steps {
                sh 'javac Months.java'
            }
        }
                stage ('run') {
                    steps {
                        sh 'java Months'
                    }
                }
    }
}
