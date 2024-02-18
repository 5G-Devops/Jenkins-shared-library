def call(){
    sh """
     docker build -t radhagowthamhub/javaapp .
     docker image tag radhagowthamhub/javaapp radhagowthamhub/javaapp:v1
     docker image tag radhagowthamhub/javaapp:latest

    """
}