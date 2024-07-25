package Liam.week6;public class passwordValidation2 {
    public static void main(String args[]) {
        String password1 = "Java2blog@";

        boolean validPassword = isValidPassword(password1);
        System.out.println("Java2blog@ is valid password:" +validPassword);

        String password2 = "helloword#123";

        boolean validPassword1 = isValidPassword(password2);
        // No upper case
        System.out.println("helloword#123 is valid password:" +validPassword1);
    }

    /**
     * Method to check if password is valid or not.
     * @param password
     * @return boolean
     */
    public static boolean isValidPassword(String password)
    {
        boolean isValid = true;
        if (password.length() > 15 || password.length() < 8)
        {
            System.out.println("Password must be less than 20 and more than 8 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have atleast one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have atleast one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have atleast one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have atleast one special character among @#$%");
            isValid = false;
        }
        return isValid;
    }
}
