# PrototypeDesignPattern
In this repository, we are using the iPhone Example, where we have four prototypes of 
iPhones: iPhone 14, iPhone 14 Max, iPhone 15, and iPhone 15 Max.
We utilize the prototype design pattern to clone the objects and customize their features based on requirements.
Additionally, we have a iphone prototype registry from which we can retrieve the prototype of each model with the help of the model name.
# Ipmortant Classes.
- **IPhone14** - Prototype
- **IPhone14Max** - Prototype
- **IPhone15** - Prototype
- **IPhone15Max** - Prototype
- **IPhonePrototypeRegistry** - Prototype Registry (Singelton)
# Test Classes.
- **TestIPhone14** - This class contains test cases for the IPhone14 class, to test its cloning functionality.
- **TestIPhone14Max** - This class contains test cases for the IPhone14 Max class, to test its cloning functionality.
- **TestIPhone15** - This class contains test cases for the IPhone15 class, to test its cloning functionality.
- **TestIPhone15Max** - This class contains test cases for the IPhone15 Max class, to test its cloning functionality.
- **IPhoneClientTest** - This class contains test cases for the IPhoneClientTest class.
# Prerequisite
- Java 8 or above.
# Dependencies
- junit
- junit-jupiter-api
