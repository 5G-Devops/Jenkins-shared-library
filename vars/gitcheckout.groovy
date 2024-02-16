
def call(MAP stageparams){
    checkout scmGit(
         branches: [[name:stageparams.branch ]],
         userRemoteConfigs: [[url: stageparams.url]]
         )

}
