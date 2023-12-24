pipeline {
	agent any
	tools {
  ant 'Ant installation' 
	}
	stages {
		stage ('GIT checkout') {
			steps {
				echo This is a git checkout stage
				git branch: 'main', url: 'https://github.com/prajwal-raju/pipeline_test'  --> Declarative Directive Generator
			      }
				  }
		stage ('build') {
			steps {
				echo This is a build stage
				sh ''' cd /var/lib/jenkins/workspace/Pipeline_test
				ant clean
				ant
				'''
				}
				}
		stage ('deploy') {
			steps {
				echo This is a Deploy stage
				sh sleep 10
				}
			}
			}
}
