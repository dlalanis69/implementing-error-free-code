# Implementing Error-Free Code

This project demonstrates common **runtime exceptions** in Java and shows how they appear when the program encounters invalid operations. It is designed as a learning exercise to understand what causes these errors and how they are displayed in the console.

## 📌 Description

The program:
- Declares and uses a `Student` class.
- Purposely creates situations that lead to common exceptions in Java.
- Prints the exception messages to the console for educational purposes.

Exceptions demonstrated:
1. **NullPointerException** – Attempting to call a method on a null object reference.
2. **ArrayIndexOutOfBoundsException** – Accessing an array index that does not exist.
3. **ArithmeticException** – Division by zero.

## 📂 Structure

| Class         | Type          | Purpose                                                      | Key Fields / Methods                       |
|---------------|--------------|--------------------------------------------------------------|---------------------------------------------|
| `Student`     | Concrete Class| Represents a student with name and age fields                | `name: String`, `age: int`; getters/setters |
| `UseStudent`  | Entry Point   | Demonstrates scenarios that trigger runtime exceptions       | `main(String[] args)`                       |

## ▶️ How to Run

### Using IntelliJ IDEA
1. Open the project in IntelliJ.
2. Ensure JDK 17+ is selected.
3. Run the `UseStudent` class.

### Using Terminal
```bash
javac *.java
java UseStudent
```

## 🧪 Sample Output
```
Cannot invoke "Student.getName()" because "student" is null
Student1 20
Student2 21
Index 2 out of bounds for length 2
/ by zero
```

> Output will always show these exceptions because the code intentionally triggers them.

## ✅ Requirements

- Java 17 or higher (tested with OpenJDK 24)
- IntelliJ IDEA or any Java-compatible IDE

## 💡 Key Concepts Practiced

- Identifying common runtime exceptions in Java.
- Understanding the causes of **NullPointerException**, **ArrayIndexOutOfBoundsException**, and **ArithmeticException**.
- Recognizing exception messages and stack traces.

---

Developed as a lab assignment for the Coursera Java Programming course.
