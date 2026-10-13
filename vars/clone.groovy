def call(String url, String branch){
  sh "docker system prune -a -f"
  echo "cloning the code"
  git url: "${url}", branch:"${branch}"
  echo " code clone success"
            
}
