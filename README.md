# TMC Setup for MOOC.fi (Java 1 Course)

Follow these steps to set up the **TMC extension** in **VS Code** for the Java 1 course.

## Steps

### 1. Install the TMC Extension
- Download and install the **TMC** extension in **VS Code**.
- Log in using your **MOOC.fi** account.
- Select the course (in this case, **"Java 1"**).
- Download all items by clicking the **Download** button.

### 2. Locate the Downloaded Files
- After downloading, locate the folder where **TMC** saved the downloaded files.
- Right-click on any folder in your workspace and click on **"Open in File Explorer"** or something similar.

### 3. Delete Folders (But Keep the Root Folder)
- Inside the downloaded folder, delete all the **items** (in this case, the subfolders).
- **IMPORTANT**: **DO NOT delete the root folder!**
  - In my tests, the root folder is named **`mooc-java-programming-i`**.
- You **MUST** use `git clone` **inside this root folder** so that **TMC** can run the tests normally.

### 4. Upload to Your Repository
- Once you're ready, use either the **terminal** or a **Git GUI** to upload it to your repository.
- **Do not modify any files**; simply create a `README.md` (in HTML format or markdown) without changing the content.
- Make sure to **keep the phrases and wording unchanged** as specified.

---

## Notes:
- Ensure that your setup matches the exact directory structure for **TMC** to function properly.
- If you encounter any issues, verify that you haven't accidentally deleted the root folder or altered any critical files.

