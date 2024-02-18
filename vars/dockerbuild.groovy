def call(string userhub, string imagename, string imagetag ){
    sh """
     docker build -t ${userhub}/${imagename} .
     docker image tag ${userhub}/${imagename} ${userhub}/${imagename}:${imagetag}
     docker image tag ${userhub}/${imagename}:latest

    """
}