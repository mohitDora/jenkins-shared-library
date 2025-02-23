def call(String CredName, String Project, String ImageTag){
  withCredentials([usernamePassword("credentialsId":"${CredName}",usernameVariable:"dockerHubUser",passwordVariable:"dockerHubPass")]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker push ${env.dockerHubUser}/"${Project}":"${ImageTag}""
  }
}
