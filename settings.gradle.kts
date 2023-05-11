rootProject.name = "master"
include("git")
include("git:logger")
findProject(":git:logger")?.name = "logger"
include("logger")
include("user")
include("user:util")
findProject(":user:util")?.name = "util"
include("util")
