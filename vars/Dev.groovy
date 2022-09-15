def.Git()
{
git${git}
}
def.Maven()
{
sh "mvn package"
}
def.Deploy()
{

}
def.runSelenium()
{
jenkins.jar {"home/ubuntu/.jenkins/workspace/pipeline/${ip}/${path}
}
