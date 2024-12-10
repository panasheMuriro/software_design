# Single Responsibility Principle (SRP)

**Definition**: A class should have only one reason to change, meaning it should have a single responsibility.

This helps in maintaining modularity and reduces the risk of unintentional side effects during modifications.

## Example (Violation):

```
public class Report {
public void generateReport() {
// Logic to generate the report
}

    public void saveToFile(String filename) {
        // Logic to save the report to a file
    }
}
```

## Solution (SRP Applied):

```public class Report {
public void generateReport() {
// Logic to generate the report
}
}

public class ReportSaver {
public void saveToFile(Report report, String filename) {
// Logic to save the report to a file
}
}```

