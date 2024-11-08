pipeline {
    agent any
    stages {
        stage("permission") {
            steps {
                sh "chmod +x ./gradlew"
            }
        }
        stage("compile") {
            steps {
                sh "./gradlew compileJava"
            }
        }
        stage("test") {
            steps {
                sh "./gradlew test"
            }
        }
        stage("test coverage") {
            steps {
                sh "./gradlew jacocoTestCoverageVerification" // 수정: test를 제거
                sh "./gradlew jacocoTestReport" // 수정: test를 제거
            }
        }
    }
}
