package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(this.password) && isValid(newPassword)) {
            this.password = newPassword;
        }
    }

    private boolean isValid(String password) {
        return hasAtLeast8Chars(password) && hasOneUpperCase(password) && hasOneLowerCase(password) && hasOneDigit(password) && hasOneSpecialChar(password);
    }

    private boolean hasAtLeast8Chars(String password) {
        return password.length() >= 8;
    }

    private boolean hasOneUpperCase(String password) {
        int n = password.length();
        for(int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)) return true;
        }
        return false;
    }

    private boolean hasOneLowerCase(String password) {
        int n = password.length();
        for(int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if(Character.isLowerCase(ch)) return true;
        }
        return false;
    }

    private boolean hasOneDigit(String password) {
        int n = password.length();
        for(int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)) return true;
        }
        return false;
    }

    private boolean hasOneSpecialChar(String password) {
        int n = password.length();
        for(int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if(!Character.isDigit(ch) && !Character.isLetter(ch)) return true;
        }
        return false;
    }
}
