pipeline {
	agent any
	stages {
		stage (git checkout){
			steps {
				echo "This is a git checkout stage"
			      }
				  }
		stage (build) {
			steps {
				echo "This is a build stage"
				cd /var/lib/jenkins/workspace/pipeline_test
				mvn clean install
				}
				}
		stage (deploy) {
			steps {
				echo "This is a Deploy stage"
				}
			}
			}
}
