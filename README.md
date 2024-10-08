# STUDENT PERCENTAGE CALCULATOR

This repository contains a simple Java program called Student Percentage Calculator. This program calculates the percentage of marks obtained by a student based on the total marks and marks obtained in various subjects.

## Features
1. Input marks for different subjects.
2. Calculate total marks obtained.
3. Calculate the percentage of marks.
4. Display the result.

## Installation
To run this program, ensure that you have Java installed on your system.
1. Clone the repository:

       git clone https://github.com/someshsingh-7251/Student-Percentage-Calculator.git
2. Navigate to the project directory:

       cd StudentPercentageCalculator
4. Compile the Java program:

       javac StudentPercentageCalculator.java
5. Run the program:
 
       java StudentPercentageCalculator

## Usage

After running the program, you will be prompted to enter the marks for various subjects. The program will then calculate and display the percentage of marks obtained.

Example:

Enter marks for Subject 1: 85

Enter marks for Subject 2: 90

Enter marks for Subject 3: 78

Enter marks for Subject 4: 88

Enter marks for Subject 5: 92

Total Marks Obtained: 433

Percentage: 86.60%

## Code


    import java.util.Scanner;

    public class StudentPercentageCalculator {

        public static void main(String[] args) {
    
            Scanner scanner = new Scanner(System.in);
        
            int totalMarks = 0;
        
            int numberOfSubjects = 5;
        
            for (int i = 1; i <= numberOfSubjects; i++) {
        
                System.out.print("Enter marks for Subject " + i + ": ");
            
                int marks = scanner.nextInt();
            
                totalMarks += marks;
        
            }
        
            double percentage = (double) totalMarks / (numberOfSubjects * 100) * 100;
        
            System.out.println("\nTotal Marks Obtained: " + totalMarks);
        
            System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
        
            scanner.close();
    
       }

    }

## Contributing

Contributions are welcome! If you would like to improve this program or add new features, feel free to fork the repository and submit a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

To create the PDF:

1. Copy the content above.
2. Paste it into your preferred text editor or Markdown editor.
3. Use an online Markdown-to-PDF converter or a tool like Pandoc to generate the PDF file.

## DIsclaimer

This README may include affiliate links, supporting the creator at no extra cost to you. The links allow for better optimization of this repository and related tools. Check out these tools for advanced content creation and detection:
1. Undetectable.ai
2. WriteHuman.ai
3. StealthWriter.ai
4. Phrasly
For advanced AI detection tools:
1. CopyLeaks
2. GPTZero

---

*Note: Feel Free to Contact at Instagram: https://www.instagram.com/officialsomeshchinkusingh?igsh=MW1vdTZwbDdmMTZxbw==*
