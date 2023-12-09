pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Pobierz kod z repozytorium
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Zbuduj i przetestuj aplikację
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                // Zbuduj obraz Dockerowy
                script {
                    sh 'docker build -t pludynia/mirkoserwis_send:latest .'
                }
            }
        }

        stage('Push to DockerHub') {
            steps {
                // Prześlij obraz do DockerHub
                script {
                    withCredentials([usernamePassword(Dockerhub: 'dockerhub-credentials', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
                        sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}"
                        sh 'docker push pludynia/mirkoserwis_send:latest'
                    }
                }
            }
        }
    }
}