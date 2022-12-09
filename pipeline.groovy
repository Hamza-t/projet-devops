def clonegit(){
	echo "Getting Project from Git";
	git 'https://github.com/Hamza-t/projet-devops';
}
def mmvn_clean(){
	echo "Maven Clean";
	sh 'mvn clean';
}
def unit_test(){
	echo "Maven Test JUnit";
	sh 'mvn test';
}
def sonar(){
	sh "mvn sonar:sonar -Dsonar.login=admin -Dsonar.password=devops"
}
return this