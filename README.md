# Serialization
### Serialization, what is serialization? We understood a little bit of serialization.
### Most of the system, whatever you are seeing, entire system, entire world works based on serializes.
### So, whatever technology you're seeing, databases or whatever it is,
### this works based on Serialization.
### hatever data missions you are seeing.
### Whatever distributed system you're seeing, whatever network you're seeing.
### Everywhere, serialization is the core technology.

<img width="900" height="341" alt="image" src="https://github.com/user-attachments/assets/6d1d0d36-3d3f-4448-82ec-c249cd677d97" />


 >. Two or three steps you have to perform to serialize the object. object we are serializing.
So I'll write this object to file system.
And whoever wants the object back, they will read their file system.
And convert that the object.

<img width="831" height="252" alt="image" src="https://github.com/user-attachments/assets/dbecbaf9-ee2e-4164-942f-fb76d6d7c825" />

### here we Deserializing the same file that we have Serialized before. 
<img width="1460" height="627" alt="image" src="https://github.com/user-attachments/assets/6c482d7f-6a29-452e-a755-0cb6be7f46f7" />

# What Transient is doing?
In case you have some privacy concern, let's say you don't want to send… you are sending user object, and you don't want to send the user ID and password over the network, right?
Okay, you can mark those as a… transient. So, transient will skip, The particular field form.
Serialization. So, integer transient, not getting serialized



<img width="674" height="164" alt="image" src="https://github.com/user-attachments/assets/3047ccee-bf00-4aab-92c8-b6a75b3f5194" />

## result
<img width="358" height="116" alt="image" src="https://github.com/user-attachments/assets/08a7f822-1442-449e-8734-9fd7fbc79c03" />


# serialVersionUID

## Overview

`serialVersionUID` is a unique version identifier for a class that implements the `Serializable` interface. It is used by the Java Virtual Machine (JVM) during deserialization to verify that the serialized object is compatible with the current version of the class.

## Why is it Important?

* Ensures compatibility between serialized and deserialized objects.
* Prevents `InvalidClassException` when class versions differ.
* Gives developers control over serialization versioning.

## Syntax

```java
private static final long serialVersionUID = 1L;
```

## Key Points

* Used only with classes that implement `Serializable`.
* Should be declared as `private static final long`.
* If not declared, the JVM generates one automatically.
* Changing the class structure without maintaining a compatible `serialVersionUID` may cause deserialization to fail.

## Best Practice

Always declare an explicit `serialVersionUID` in every serializable class to ensure predictable and reliable serialization behavior.

<img width="1288" height="604" alt="image" src="https://github.com/user-attachments/assets/8e27fdba-afc3-48e8-bd1d-797b034136ef" />



