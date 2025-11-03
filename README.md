# CurrencyExchangeCLI

A simple console-based currency exchange application written in Java.  
It uses the [Frankfurter API](https://www.frankfurter.dev) to fetch real-time exchange rates and demonstrates basic API communication.

## How to run

### Using Maven
Make sure you have Java and Maven installed.

#### On Linux or macOS (bash)
bash  
mvn exec:java -Dexec.mainClass=com.currency.Main  

#### On Windows (PowerShell)
powershell  
mvn exec:java "-Dexec.mainClass=com.currency.Main"  

### Example output
==== Currency Exchange CLI | frankfurter.dev ====
From (provide currency, e.g., "USD"):
usd
To (provide currency, e.g., "PLN"):
pln
Provide amount:
100
Current rate: 3.6946
100,00 USD = 369,46 PLN

## License
This project is licensed under the MIT License.
