pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            steps{
                checkout scmGit(
                    branches: [[name: 'master']],
                    userRemoteConfigs: [[url: 'https://github.com/NilsB98/JenkinsTest.git']])
            }
        }

        stage('Build') {
            steps {
                echo "${WORKSPACE}"
                sh "./mvnw compile"
            }
        }
        stage('Test') {
            steps {
                echo 'Test!'
                sh "./mvnw test"

                // sh "./mvnw test"
            }
        }
        stage('Package') {
            steps {
                echo 'Package!'
                sh "./mvnw package"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy!'
                // stop current jar demon
                // mv prev jar to different location
                // cp *.jar dir/for/jar
                // start demon again
            }
        }

    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
//             mail bcc: '', body: "<b>Example</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "foo@foomail.com";
            echo 'Build failure'
        }
        unstable {
            echo 'This will run only if the run was marked as unstable'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'For example, if the Pipeline was previously failing but is now successful'
        }
    }
}