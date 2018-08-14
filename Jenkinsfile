pipeline {
	agent any
	
	stages{
		stage('Test'){
			steps{
				echo "This is Test stage of my CICD pipeline"
			}
		}
		stage('Build'){
			steps{
				sh 'echo "Hello Guyzz"'
				sh 'ant -f build.xml -v'
			}
		}
		stage('deploy'){
			steps{
				sh 'sudo cp /home/user/Desktop/My-CICD-Pipeline---Java/dist/addition.jar /var/www/html/project/jar'	
				}
			}
	}
	post{
		success{
			archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
		}
	}
}
