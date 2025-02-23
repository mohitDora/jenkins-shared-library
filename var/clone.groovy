def call(string url, string branch){
  echo "cloning the code"
  git url:"${url}", branch :"${branch}"
  echo "code cloning successful"
}
