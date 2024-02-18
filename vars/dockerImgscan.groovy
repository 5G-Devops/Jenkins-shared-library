def call(){
    sh """
     trivy radhagowthamhub/javaapp:latest > scan.txt
     cat scan.txt
    """
}