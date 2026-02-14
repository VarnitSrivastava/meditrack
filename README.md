
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
