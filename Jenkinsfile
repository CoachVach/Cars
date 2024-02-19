pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    sh 'mvn clean test'  // Puedes ajustar esto según tu entorno de construcción
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'  // Configura la ubicación de tus informes de pruebas
        }
    }
}
