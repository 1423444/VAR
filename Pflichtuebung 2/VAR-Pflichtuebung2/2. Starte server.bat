@cd %~dp0
java -Djava.rmi.server.codebase="%cd%" -Djava.security.policy="%cd%\java.policy" ComputePiServerStartup localhost
pause