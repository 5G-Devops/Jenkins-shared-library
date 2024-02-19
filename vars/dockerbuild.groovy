def call(Sting project, String ImageTag, String hubuser){
    sh """
     docker build -t ${hubuser}/${project} .
     docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}
     docker image tag ${hubuser}/${project} ${hubuser}/${project}:${ImageTag}:latest
    """
}