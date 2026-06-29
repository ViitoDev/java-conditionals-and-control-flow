# Exercise 09 - Access Permission Check

## Objective

Read an access code and a permission value, then print whether access is granted or denied.

## Concepts Practiced

- User input with `Scanner`
- Integer variables
- Boolean expressions
- Equality comparison (`==`)
- Greater-than comparison (`>`)
- Less-than comparison (`<`)
- Logical OR operator (`||`)
- Logical AND operator (`&&`)
- Logical NOT operator (`!`)
- Nested `if` statements

## How It Works

The program stores `2023` as the valid access code and reads two values from the user. It checks whether the entered code matches the stored code, then evaluates a permission condition. If both boolean values are true, it prints that access is granted. Otherwise, it prints a denial message and uses nested conditions to show which validation failed.

## Example

```text
Input:
2023
2

Output:
Please enter your acess code:
Please enter your permission:
Acess granted
```

## Source Code

[Main.java](Main.java)
