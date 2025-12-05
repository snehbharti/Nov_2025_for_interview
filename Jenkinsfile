pipeline {
    agent any

    parameters {
        choice(name: 'ENV', choices: ['qa', 'uat', 'prod'], description: 'Select environment')
        choice(name: 'SUITE', choices: ['smoke.xml', 'sanity.xml', 'regression.xml'], description: 'Select TestNG Suite')
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: "main", url: 'https://github.com/snehbharti/Nov_2025_for_interview.git'
            }
        }

        stage('Setup Environment') {
            steps {
                script {
                    if (params.ENV == 'qa') {
                        env.BASE_URL = "https://google.com"
                    }
                    if (params.ENV == 'uat') {
                        env.BASE_URL = "https://yahoo.com"
                    }
                    if (params.ENV == 'prod') {
                        env.BASE_URL = "https://facebook.com"
                    }
                }
            }
        }

        stage('Run Tests') {
            steps {
                bat "mvn clean test -DsuiteXmlFile=testng/${params.SUITE} -Denv=${params.ENV}"
            }
        }

        stage('Archive Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
                archiveArtifacts allowEmptyArchive: true, artifacts: 'screenshots/**/*.png'
            }
        }
    }
}
