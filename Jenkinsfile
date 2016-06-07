node{
	stage "first stage"
	sh "echo hello jenkins"

	stage "deploy to staging"
	sh 'ssh ubuntu@ec2-54-213-251-190.us-west-2.compute.amazonaws.com "./bin/home_api_staging_deploy"'
}
