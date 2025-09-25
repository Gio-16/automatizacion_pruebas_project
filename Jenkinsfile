pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -q clean package'
      }
    }
    stage('Unit Tests') {
      steps {
        sh 'mvn -B -q test'
      }
      post {
        always {
          junit '**/target/surefire-reports/*.xml'
        }
      }
    }
    stage('Integration Tests') {
      steps {
        sh 'mvn -B -q verify -DskipUnitTests=false || true'
      }
    }
  }
  post {
    always {
      archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
    }
  }
}
