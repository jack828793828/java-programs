#!/bin/bash

# Find all Java files in the current folder
java_files=$(find . -name "*.java")

# Compile and run each Java file
for file in $java_files; do
    # Extract the file name without the extension
    filename=$(basename "$file" .java)
    
    # Compile the Java file
    javac "$file"
    
    # Check if compilation was successful
    if [[ $? -eq 0 ]]; then
        echo "Compiled $file successfully."
        
        # Run the compiled Java program
        java "$filename"
    else
        echo "Failed to compile $file."
    fi
    
    echo
done

