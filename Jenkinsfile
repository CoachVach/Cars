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
                    // Crear directorio target si no existe
                    bat 'mkdir target 2>nul'

                    // Compilar el código fuente y las pruebas
                    bat 'javac -d target src/Main/java/*.java src/Test/java/*.java'

                    // Ejecutar las pruebas
                    bat 'java -cp target;src/Test/java org.junit.runner.JUnitCore AutoTest'
                }
            }
        }
    }

    post {
        always {
            // Configurar la recopilación de informes de pruebas según tu estructura de informes
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
