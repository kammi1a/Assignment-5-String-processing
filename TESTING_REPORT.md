# Testing Report for StringProcessor Class

## Overview
This report summarizes the testing process conducted on the `StringProcessor` class, focusing on its methods: `isStrongPassword`, `calculateDigits`, `calculateWords`, and `calculateExpression`. Each method was tested with multiple test cases to ensure functionality and correctness.

## Testing Process

### 1. Method: `isStrongPassword`
**Purpose:** To validate if a password is strong based on the presence of uppercase letters, lowercase letters, digits, and special characters.

**Test Cases:**
| Test Case                                | Expected Result | Actual Result | Status  |
|------------------------------------------|-----------------|---------------|---------|
| "MyP@ssw0rd!"                            | true            | true          | Pass    |
| "kamilaspass"                            | false           | false         | Pass    |
| "12345!@#"                               | false           | false         | Pass    |
| "PASSWORD$"                              | false           | false         | Pass    |
| "Valid123$Password"                      | true            | true          | Pass    |

**Issues Encountered:** None. All test cases passed as expected.

---

### 2. Method: `calculateDigits`
**Purpose:** To count the number of digit characters in a given string.

**Test Cases:**
| Test Case                                | Expected Result | Actual Result | Status  |
|------------------------------------------|-----------------|---------------|---------|
| "I have 1 sister and 1 brother."         | 2               | 2             | Pass    |
| "No numbers"                             | 0               | 0             | Pass    |
| "2024 is the year."                      | 4               | 4             | Pass    |
| "Total: 45, Items: 12."                  | 4               | 4             | Pass    |
| "Call me at 555-1234."                   | 7               | 7             | Pass    |

**Issues Encountered:** None. All test cases passed as expected.

---

### 3. Method: `calculateWords`
**Purpose:** To count the number of words in a given string, defined by sequences of non-space characters.

**Test Cases:**
| Test Case                                | Expected Result | Actual Result | Status  |
|------------------------------------------|-----------------|---------------|---------|
| "Hello there! How are you?"              | 6               | 6             | Pass    |
| "    "                                   | 0               | 0             | Pass    |
| "This is a single sentence."             | 5               | 5             | Pass    |
| "Word1, word2, word3!"                   | 3               | 3             | Pass    |
| "One. Two? Three!"                       | 3               | 3             | Pass    |

**Issues Encountered:** None. All test cases passed as expected.

---

### 4. Method: `calculateExpression`
**Purpose:** To evaluate a simple arithmetic expression containing addition and subtraction.

**Test Cases:**
| Test Case                                | Expected Result | Actual Result | Status  |
|------------------------------------------|-----------------|---------------|---------|
| "4 + 5 - 2"                              | 7.0             | 7.0           | Pass    |
| "10 - 3 + 2"                             | 9.0             | 9.0           | Pass    |
| "5 + 10 - 3"                             | 12.0            | 12.0          | Pass    |
| "8 - 2 + 6"                              | 12.0            | 12.0          | Pass    |
| "10 + 5 + 5 - 10"                        | 10.0            | 10.0          | Pass    |

**Issues Encountered:** None. All test cases passed as expected.

---

## Summary of Results
All test cases for the methods in the `StringProcessor` class passed successfully.

## Conclusion
The `StringProcessor` class has been thoroughly tested, and all tests passed without issues. The class is ready for deployment in its current form, and it meets the requirements specified for its methods.
