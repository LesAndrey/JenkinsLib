// vars/evenOrOdd.groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      triggers {
        cron('*/5 * * * 0-7')
      }
      stages {
        stage('Even Stage') {
          steps {
            echo 'The build number is even'
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      triggers {
        cron('*/5 * * * 0-7')
      }
      stages {
        stage('Odd Stage') {
          steps {
            echo 'The build number is odd'
          }
        }
      }
    }
  }
}
