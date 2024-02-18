def call(){
    sh """
     docker build -t radhagowthamhub/javaapp .
     docker image tag radhagowthamhub/javaapp radhagowthamhub/javaapp:v1

    """
}