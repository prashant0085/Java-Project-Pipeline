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
				sh 'sudo cp /var/lib/jenkins/workspace/test/dist/addition.jar /var/www/html/project/'	
				}
			}
	}
	post{
		success{
			archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
		}
	}
}
