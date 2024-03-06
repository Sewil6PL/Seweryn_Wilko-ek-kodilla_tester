@echo off
REM Usuń wszystkie pliki *.jar z katalogu build/libs
del /Q "build\libs\*.jar"

REM Wywołaj gradlew build
gradlew build

REM Sprawdź czy istnieje plik *.jar w katalogu build/libs
if exist "build\libs\*.jar" (
    REM Skopiuj plik *.jar do katalogu project
    copy "build\libs\*.jar" "C:\project"
) else (
    REM Wyświetl komunikat o błędzie kompilacji
    echo Błąd: Nie udało się skompilować projektu.
)