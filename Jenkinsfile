pipeline {
    agent any
    stages {
        stage('代码审查') {
            steps {
                script {
                    scannerHome = tool 'SONAR_SCANNER_HOME'
                }
                withSonarQubeEnv('sonar-8.9.5') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }

    post {
        always {
            emailext(
                subject: "Succeed Pipeline: ${currentBuild.fullDisplayName}",
                from: "865147306@qq.com",
                to: "siqi0802@163.com",
                body: "Succeed with ${env.BUILD_URL}"
            )
        }
    }
}
