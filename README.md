## CAT-Backend-Task

A repo that has the solution for the registration system, SQL challenge and problem-solving.
### Folder Structure

```plaintext
CAT-Backend-Task/
|--- src/
|    |--- Main.java      # Registeration system
|--- .gitignore          # Ignored files and folders
|--- Problem Solving     # Problem solution
|--- README.md
|--- SQL challenge       # Challenge solution
```

### Registration and Authentication System

This Java program implements a simple registration and authentication system with the following features:

1. **Registration:**
    - Validates user email using regex.
    - Ensures passwords meet security criteria (e.g., at least one uppercase, one lowercase, one number, one special character, and 8-20 characters in length).
    - Prevents duplicate email registrations.

2. **Login:**
    - Verifies email and password.
    - Provides feedback for incorrect credentials.

3. **Menu Navigation:**
    - Offers a menu for users to choose between registration and login.

---

### Scope of Future Improvements

- [ ] Use secure libraries like `javax.crypto` to hash passwords before storing them in the HashMap.

- [ ] Replace the HashMap with a database for storing user data persistently.

- [ ] Add input sanitization to prevent invalid inputs.

- [ ] Add features such as password reset or account recovery.

---

### Running the Program
1. Go to the src directory
    ```bash
    cd src/
   ```
2. Compile and Run the program:
   ```bash
   javac Main.java
   java Main
   ```

