# Open Cart E-commerce Testing Project

## Overview
This project is an automated testing suite for the Open Cart e-commerce website. It uses **Java**, **Selenium WebDriver**, and **TestNG** to perform functional and data-driven testing. The testing framework is designed following the **Page Object Model (POM)** for better scalability and maintainability. 

## Features
The test suite includes automated test cases for the following scenarios:
1. **Account Registration**:
   - Valid registration scenarios.
   - Invalid registration scenarios (e.g., missing or incorrect data).
2. **Login**:
   - Valid login scenarios.
   - Invalid login scenarios (e.g., incorrect credentials).
3. **Forgot Password**:
   - Multiple email addresses tested using Data Providers.
4. **Search**:
   - Valid and invalid search data.
5. **Currency Selection**:
   - Selecting a currency from **Euro**, **Pound Sterling**, and **USD**.
6. **Cart Management**:
   - Adding featured products to the shopping cart.
7. **Wishlist Management**:
   - Adding featured products to the wishlist.
8. **Product Comparison**:
   - Comparing featured products.

The suite also generates **Extent Reports** with screenshots for a detailed summary of test execution.

---

## Technologies and Tools Used
- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: For test management and execution.
- **Page Object Model (POM)**: Design pattern for test scripts.
- **Data Providers**: To test multiple sets of data using Excel sheets.
- **Extent Reports**: For generating test execution reports.
- **Apache POI**: For reading data from Excel files.

---

## Project Structure
The project is structured as follows:
- **src/test/java**: Contains the Page Object Model classes along with test cases and Data Provider methods.
- **test-data**: Excel sheets used for data-driven testing.
- **reports**: Contains Extent Reports generated after test execution.

---

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/ahmedsadek12/opencartautomation.git
   cd open-cart-testing
   mvn install
   ```

2. Run all tests:
   ```bash
   mvn test
   ```

---

## Reports
The **Extent Reports** are generated after test execution and can be found in the `reports` folder. Each report includes:
- Test case execution results.
- Screenshots for failed test cases (if configured).
- Execution time and other metrics.

---

## Author
**Ahmed Sadek**  
Feel free to reach out for collaborations or queries.

---

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.
```