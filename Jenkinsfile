pipeline {
    agent any
    
    tools {
        maven 'myMaven'  // 젠킨스에서 설치한 이름
    }

    stages {
        stage('0. 연결 확인') { steps { echo '스테이지 출발' } }
        
        stage('1. Build1') {
            steps {
                echo 'Maven으로 빌드 시작'
                sh 'mvn clean package'
            }
        }
        
        stage('2. Docker 버전 확인1') {
            steps {
                echo 'Docker version check'
                sh 'docker version'
            }
        }
        
        stage('3. Docker build') {
            steps {
                echo 'Docker build(이미지 생성)'
                sh 'docker build -t ex03-app:latest'
            }
        }
                
    }
}