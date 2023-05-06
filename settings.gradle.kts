rootProject.name = "master"
include("git")
include("git:logger")
findProject(":git:logger")?.name = "logger"
include("logger")
