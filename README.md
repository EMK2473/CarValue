# Car Value
![Github license](https://img.shields.io/badge/mit-blue.svg)
 
 Licensing: [mit](https://choosealicense.com/licenses/mit/)

## Table of Contents
- [Description](#description)
- [Installation Requirements](#installation-requirements)
- [Application Usage](#application-usage)
- [License](#licensing-information)
- [Contributions](#contributions)
- [Tests Commands](#tests-commands)
- [Questions](#questions)
## Description
A Java program that calculates the current value of a car based on its model year, purchase price, and the current year. The program uses a depreciation formula to determine how much the car's value decreases over time. It prints the car's model year, purchase price, and its current estimated value. 

Depreciation Formula: The car's value decreases by 15% each year. The formula used to calculate the current value is:  
```Java
currentValue = purchasePrice * (1 - depreciationRate)^carAge 
```

```Java
public void calcCurrentValue(int currentYear) {
       double depreciationRate = 0.15;
       int carAge = currentYear - modelYear;
       
       // Car depreciation formula
       currentValue = (int) 
          Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }
```

Where:  depreciationRate is 0.15 (15%) carAge is the difference between the current year and the model year

## Installation Requirements
Ensure you have Java Development Kit (JDK) installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/downloads/) or use a package manager like Homebrew for macOS or apt-get for Linux. 

- Clone or download the repository: 
```Java 
- git clone https://github.com/EMK2473/CarValue.git 
```

- Navigate to the project directory: 
```Java
- cd CarValue 
```
- Compile the CarValue.java file: 
```Java
- javac CarValue.java 
```
- Run the program: 
```Java
- java CarValue
```

## Application Usage
The program prompts the user to input three values: the car’s model year, its purchase price, and the current year. It then calculates the car's depreciation and outputs the model year, original purchase price, and current value of the car.  Example: 

Input:  
```Java
2015 
20000 
2023 
```
Output: 
```Java
Car's information:   
  Model year: 2015   
  Purchase price: $20000   
  Current value: $13019
```


## Contributions
Eric Keeton

## Test Commands
To test the program, provide different model years, purchase prices, and current years to verify that the depreciation is calculated correctly.

## Questions
For Questions, contact me at emk2473@gmail.com or visit My Github: [EMK2473](https://github.com/EMK2473)