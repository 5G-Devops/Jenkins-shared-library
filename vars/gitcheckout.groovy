
def call(MAP stageparams){
    checkout scmGit(
         $class: 'GitSCM'
         branches: [[name: stageparams.branch ]],
         userRemoteConfigs: [[url: stageparams.url]]
         )

}
