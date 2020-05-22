lazy val IntellijPluginInScala = project.in(file("."))
  .enablePlugins(SbtIdeaPlugin)

lazy val pluginRunner = createRunnerProject(IntellijPluginInScala)