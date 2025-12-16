data "aws_iam_role" "lab_role" {
  name = var.role_name
}

data "aws_vpc" "default" {
  default = true
}

data "aws_subnets" "default" {
  filter {
    name   = "vpc-id"
    values = [data.aws_vpc.default.id]
  }
}

data "aws_secretsmanager_secret" "rds" {
  name = var.db_secret_name
}