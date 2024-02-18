def call(string hubuser, string imagename, string imagetag){
    sh """
     docker build -t ${hubuser}/${imagename} .
     docker image tag ${hubuser}/${imagename} ${hubuser}/${imagename}:${imagetag}
     docker image tag ${hubuser}/${imagename}:latest
    """
}