pipeline {
	agent any
	
	stages{
		stage('Build'){
			steps{
				sh 'ant -f build.xml -v'
			}
		}
		stage('Test'){
			steps{
				sh 'echo "Hello Guyzz"'
			}
		}
		stage('deploy'){
			steps{
				sh 'sudo cp /home/user/Desktop/My-CICD-Pipeline---Java/dist/addition.jar /var/www/html/project/'	
				}
			}
	}
	post{
		success{
			archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
		}
	}
}
