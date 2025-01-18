# TASK-1-FILE-HANDLING-UTILITY

**COMPANY** : CODTECH IT SOLUTIONS

**NAME** :ROHIT KISHOR PAWAR

**INTERN ID** : CT08HJD

**DOMAIN** : JAVA PROGRAMMING

**BATCH DURATION** : December 30th,2024 to January 30th,2025

**MENTOR NAME** : NEELA SANTHOSH

**DESCRIPTION** :
     File handling is a crucial aspect of programming, enabling applications to read, write, and manipulate files. In Java, file handling is facilitated by classes in the java.io package, such as File, FileWriter, FileReader, BufferedReader, and Scanner. The following description outlines the key concepts and methods used in the provided Java program to demonstrate file operations.

OVERVIEW OF THE PROGRAM
The program demonstrates basic file handling operations: writing to a file, reading from a file, and modifying a file. It uses the FileWriter and Scanner classes to achieve these tasks.

WRITING TO A FILE
The writeFile method is responsible for writing content to a file. It uses the FileWriter class, which provides methods to write text to files. The FileWriter constructor takes the file path as an argument and creates a new file if it doesn't exist. The write method of FileWriter is used to write the specified content to the file. The try-with-resources statement ensures that the FileWriter is closed automatically after the operation, preventing resource leaks.

READING FROM A FILE
The readFile method reads the content of a file and prints it to the console. It uses the Scanner class, which can read input from various sources, including files. The Scanner constructor takes a File object as an argument. The hasNextLine method checks if there is another line in the file, and the nextLine method reads the next line. The try-with-resources statement ensures that the Scanner is closed automatically after the operation.

MODIFYING A FILE
The modifyFile method appends new content to an existing file. It uses the FileWriter class with the second argument set to true, which enables append mode. The write method is used to add the new content to the file. The try-with-resources statement ensures that the FileWriter is closed automatically after the operation.

MAIN METHOD
The main method serves as the entry point of the program. It defines the file path and calls the writeFile, readFile, and modifyFile methods to demonstrate file operations. The program first writes initial content to the file, reads and prints the content, appends new content, and reads and prints the modified content.

CONCLUSION
This program demonstrates the fundamental file handling operations in Java, including writing to a file, reading from a file, and modifying a file. By using classes like FileWriter and Scanner, Java provides a straightforward and efficient way to perform these operations. Proper file handling is essential for developing robust applications that interact with the file system.

**oupput**
ge](https:/![Ima/github.com/user-attachments/assets/bef8f7e4-9f40-4509-be55-98507a64cbd8)
