pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Para Windows, utiliza 'bat' en lugar de 'sh'
                    bat 'git clone <URL_DEL_REPOSITORIO>'
                }
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Usa 'bat' para comandos de construcción y prueba en Windows
                    bat 'mvn clean test'
                }
            }
        }
    }

    post {
        always {
            // Usa 'junit' en lugar de 'junit' para la recopilación de informes en Windows
            junit '**\\target\\surefire-reports\\*.xml'
        }
    }
}
