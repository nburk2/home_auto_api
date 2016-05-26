node{
	stage "first stage"
	sh "echo hello jenkins"

	stage "deploy to staging"
	sh 'ssh ubuntu@ec2-54-213-251-190.us-west-2.compute.amazonaws.com "git clone https://github.com/nburk2/home_auto_api.git; cd home_auto_api; git checkout develop; ./gradlew war;sudo ~/home_auto_server/tomcat/bin/shutdown.sh; sudo rm -r ~/home_auto_server/tomcat/webapps/ROOT;sudo rm -r ~/home_auto_server/tomcat/webapps/ROOT.war; sudo mv build/libs/*.war ~/home_auto_server/tomcat/webapps/ROOT.war;sudo ~/home_auto_server/tomcat/bin/shutdown.sh;cd ..;sudo rm -rf home_auto_api"'
}
