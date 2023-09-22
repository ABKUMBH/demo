pipeline {
    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }
    agent any
    tools {
        maven 'maven_3.8.8'
    }

    stages {
        stage ('Code Compilation') {
            steps {
                echo 'Code start compiling...'
                sh 'mvn clean compile'
                echo 'Code Compilation Done'
            }
        }

        stage ('Code Packaging') {
            steps {
                echo 'Code start packaging...'
                sh 'mvn clean package -DskipTests'
                echo 'Code Packaging Done.'
            }
        }
    }
}