# Number System Converter

A Java Swing application that converts numbers between different number systems (Decimal, Binary, Octal, and Hexadecimal).

## Features

- Convert numbers between different number systems:
  - Decimal
  - Binary
  - Octal
  - Hexadecimal
- User-friendly GUI interface
- Real-time conversion
- Input validation

![image](https://github.com/user-attachments/assets/9c2fbcb7-333f-4a76-b582-bfce868314e1)


## Project Structure

The project follows the MVC (Model-View-Controller) architecture:

- `src/Main.java` - Application entry point
- `src/view/calcForm.java` - GUI implementation
- `src/controller/calcCont.java` - Handles user interactions
- `src/model/calcModel.java` - Contains conversion logic
- `src/model/conversion/` - Contains specific conversion implementations

## Requirements

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, etc.)

## How to Run

1. Clone the repository
2. Open the project in your preferred Java IDE
3. Build the project
4. Run the `Main.java` file

## Usage

1. Select the source number system from the first dropdown
2. Select the target number system from the second dropdown
3. Enter the number you want to convert in the input field
4. Click the "Convert" button
5. The converted number will appear in the output field
