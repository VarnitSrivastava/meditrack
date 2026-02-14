
# MediTrack - Environment Setup & Configuration

## 1. System Prerequisites
To develop and run the MediTrack application, the following environment must be configured:
* **Hardware:** A computer running Windows, macOS, or Linux.
* **Software:** Java Development Kit (JDK) and an Integrated Development Environment (IDE).

---

## 2. Java Development Kit (JDK) Installation
The project requires the JDK to compile source code and the JRE (included in JDK) to execute it.

### Step 1: Download & Install
1.  Navigate to the official Oracle or OpenJDK website.
2.  Download the installer for **JDK 25** (or JDK 21) corresponding to your operating system.
3.  Run the installer and follow the on-screen prompts.

### Step 2: Verification
1.  Open your terminal or command prompt.
2.  Execute the following command to verify the version:
    `java -version`
3.  Ensure the output displays the correct version number.

> **<img width="954" height="146" alt="image" src="https://github.com/user-attachments/assets/7230057e-6bfe-4215-a2c6-671df20d5cd9" />
)**

---

## 3. IDE Setup (IntelliJ IDEA)
IntelliJ IDEA is the recommended IDE for managing the project structure and dependencies.

### Step 1: Installation
1.  Download **IntelliJ IDEA Community Edition** from the JetBrains website.
2.  Complete the installation process using default settings.

### Step 2: Workspace Initialization
1.  Launch IntelliJ IDEA.
2.  Select **New Project**.
3.  Configure the project as follows:
    * **Name:** `MediTrack`
    * **Language:** Java
    * **Build System:** IntelliJ
    * **JDK:** Select the installed JDK version.

---

## 4. Project Structure Configuration
Configure the package hierarchy to match the project requirements.

### Step 1: Base Package
Navigate to the `src` directory and create the base package:
`com.airtribe.meditrack`

### Step 2: Sub-packages
Create the following sub-packages within the base package:
* `constants`
* `entity`
* `exception`
* `interface`
* `service`
* `test`
* `util`

### Step 3: Verification
Ensure the project explorer reflects the correct hierarchy.

> **<img width="179" height="202" alt="image" src="https://github.com/user-attachments/assets/ccdacd85-1249-434f-bc2c-a474cdabc845" />
**









**#JVM REPORT**


# JVM Architecture & Runtime Environment Report

## 1. Introduction
This document outlines the architecture of the Java Virtual Machine (JVM) and its role in executing the MediTrack application. It covers the Class Loader, Runtime Data Areas, and the Execution Engine .

## 2. "Write Once, Run Anywhere" (WORA)
Java achieves platform independence through **Bytecode**.
* **Compilation:** The Java Compiler (`javac`) translates source code (`.java`) into bytecode (`.class`).
* **Execution:** The JVM, specific to each operating system, interprets this bytecode.
* **Benefit:** This allows MediTrack to run on any device with a compatible JVM without recompilation.

---

## 3. JVM Subsystems

The JVM architecture comprises three primary subsystems responsible for loading, managing, and executing code.

### A. Class Loader Subsystem
The Class Loader is responsible for loading class files into memory dynamically.
* **Loading:** Locates and imports the binary data for classes (e.g., `Doctor.class`).
* **Linking:** Verifies bytecode integrity and allocates memory for static variables.
* **Initialization:** Executes static initialization blocks and assigns default values to static fields.

### B. Runtime Data Areas
The JVM partitions memory into distinct areas to manage application data.

| Memory Area | Description | Usage in MediTrack |
| :--- | :--- | :--- |
| **Heap** | The runtime data area for allocating class instances and arrays. | Stores all objects (e.g., `new Doctor()`, `new ArrayList()`). |
| **Stack** | Stores frames for method execution, including local variables and partial results. | Manages primitive variables (e.g., `int age`) and object references within methods. |
| **Method Area** | Stores per-class structures such as the runtime constant pool, field and method data, and the code for methods. | Stores static variables and class-level constants (e.g., file paths). |
| **PC Register** | Contains the address of the JVM instruction currently being executed. | Tracks the execution flow of the current thread. |

### C. Execution Engine
The Execution Engine executes the bytecode contained in the loaded classes.
* **Interpreter:** Reads and executes bytecode instructions line-by-line.
* **JIT (Just-In-Time) Compiler:** Improves performance by compiling frequently executed bytecode sequences into native machine code.
* **Garbage Collector:** Automatically reclaims memory used by objects that are no longer reachable, preventing memory leaks in the Heap.

---

## 4. JIT Compiler vs. Interpreter

| Feature | Interpreter | JIT Compiler |
| :--- | :--- | :--- |
| **Execution Mode** | Interprets bytecode line-by-line. | Compiles blocks of bytecode into native code. |
| **Performance** | Fast startup, but slower execution for repeated code. | Slower startup due to compilation, but faster execution. |
| **Optimization** | Minimal optimization. | Performs extensive optimization (e.g., removing redundant checks). |

## 5. Conclusion
Effective memory management in MediTrack requires understanding the distinction between the **Stack** and the **Heap**. References and primitive local variables are managed in the Stack, while the actual object instances reside in the Heap, managed by the Garbage Collector.






**SUBMITED BY- VARNIT SRIVASTAVA**
