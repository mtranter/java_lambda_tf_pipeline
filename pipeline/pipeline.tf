variable "github_oauth_token" {
  value = "test"
}

module "pipeline" {
  source = "./../../../modules/code_pipeline"

  build_steps        = ""
  github_oauth_token = var.github_oauth_token
  project_name       = ""
  target_branch      = ""
  target_github_repo = ""
}
