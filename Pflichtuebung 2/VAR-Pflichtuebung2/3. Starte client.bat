@cd %~dp0
@:nochmal
@set /p anzahl=Anzahl eingeben:
@if "%anzahl%"=="" goto nochmal
java -Djava.security.policy="%cd%\java.policy" ComputePiClient localhost %anzahl%
pause