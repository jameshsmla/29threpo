pipeline {
         agent any
             stages {
	          
                 stage('Source') {
                    steps {
                       checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url:'https://github.com/jameshsmla/29threpo.git']]])
	            }        
                 }
                  stage('ServiceBuild') {
                    tools{
                      jdk 'jdk8'
                      maven 'Maven'
                    }
                            steps { 
                              script{
                                sh label: '', script: 'mvn install'
				                sh label: '', script: 'mvn clean package'
                               }
                           }
		  }
		     stage('Archiving Artifacts') { 
                         steps{ 
                             archiveArtifacts 'discoveri-heartihealth-webapp/target/*.jar' 
                         } 
                 } 
                
	}
}
