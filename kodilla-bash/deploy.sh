#!/bin/bash

# Definiujemy katalog projektu
PROJECT_DIR=""

# Sprawdzamy system operacyjny
if [[ "$OSTYPE" == "darwin"* ]]; then
    PROJECT_DIR="$HOME/project"
elif [[ "$OSTYPE" == "linux-gnu"* ]]; then
    PROJECT_DIR="$HOME/project"
elif [[ "$OSTYPE" == "msys" ]]; then
    PROJECT_DIR="C:/project"
fi

# Usuwamy istniejące pliki *.jar z katalogu build/libs
rm -f build/libs/*.jar

# Wywołujemy gradlew build
./gradlew build

# Sprawdzamy, czy istnieje plik *.jar w katalogu build/libs
if [ -f "build/libs/*.jar" ]; then
    # Kopiujemy plik *.jar do katalogu projektu
    cp build/libs/*.jar "$PROJECT_DIR"
else
    # Wyświetlamy komunikat o błędzie kompilacji
    echo "Błąd: Nie wygenerowano pliku *.jar."
fi
