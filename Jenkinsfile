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
	}
	post{
		success{
			archiveArtifacts artifacts: 'dist/*.jar', fingerprint: true
		}
	}
}
