pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('代码审查') {
            steps {
                script {
                    scannerHome = tool 'SONAR_SCANNER_HOME'
                }
                withSonarQubeEnv('sonar-8.7.1') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
            }
        }
    }
}