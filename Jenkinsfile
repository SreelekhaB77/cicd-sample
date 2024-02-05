pipeline{
    agent any

   
    stages{
        stage('MVN PACKAGE'){
            steps{
                sh ''' export M2_HOME=/opt/maven
                export MAVEN_HOME=/opt/maven
                export PATH=${M2_HOME}/bin:${PATH}
                mvn clean install
                sleep 10
                cd target/
                java -jar cicddemo-0.0.1-SNAPSHOT.jar  '''
            }
        }
        stage('DEPLOYMENT IS SUCCESS'){
            steps{
               sh 'sleep 10'
            }
        }
    }
}
