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
                sh 'javac Weekdays.java'
            }
        }
                stage ('run') {
                    steps {
                        sh 'java Weekdays'
                    }
                }
    }
}
