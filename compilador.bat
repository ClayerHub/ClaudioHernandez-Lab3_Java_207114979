@echo off
setlocal

REM Ruta del JDK
set "JDK_DIR=C:\Program Files\Eclipse Adoptium\jdk-11.0.20.8-hotspot"

REM Ruta donde estan los archivos .java
set "SOURCE_DIR=C:\Users\Claudio\Desktop\Java\Codigo_Fuente_207114979_Hernandez_Hernandez

REM Ruta donde se guardan los archivos .class
set "OUTPUT_DIR=C:\Users\Claudio\Desktop\Java\Codigo_Fuente_207114979_Hernandez_Hernandez

REM Compilar los archivos .java
echo Compilando archivos java...
for %%f in ("%SOURCE_DIR%\*.java") do (
	"%JDK_DIR%\bin\javac" -d "%OUTPUT_DIR%" "%%f"
)

if %errorlevel% neq 0 (
	echo Error: La compilacion ha fallado.
) else (
	echo Compilacion exitosa.
)

pause