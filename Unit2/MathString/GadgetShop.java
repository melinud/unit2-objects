/**
 * GadgetShop - STARTER
 * Lesson: The Math class and the String class in Java
 *
 * Complete every 
 *
 * Part A: the Math class. Math methods are static: call them on the class
 *         name, like Math.sqrt(16). Do NOT create a Math object.
 * Part B: the String class. A String is an object with many methods.
 *         Strings are immutable: every method returns a NEW String.
 */
public class GadgetShop {

    public static void main(String[] args) {

        // ---------------- PART A: The Math class ----------------
        // A tablet screen is 9 inches wide and 12 inches tall.
        double width = 9.0;
        double height = 12.0;

        double diagonal = Math.sqrt(Math.pow(width,2)+Math.pow(height,2));
        System.out.println("A1 Screen diagonal: " + diagonal);

        // A2. Two stores sell the same headphones.
        double priceA = 349.99;
        double priceB = 299.50;
        double lower = Math.min(priceA, priceB);
        System.out.println("A2 Lower price: " + lower);

        // A3.
        double savings = Math.abs(priceA - priceB);
        System.out.println("A3 Savings (raw): " + savings);

        // A4. 
        //     Multiply by 100, use Math.round, then divide by 100.0
        double savingsCents = Math.round(savings * 100) / 100.0;
        System.out.println("A4 Savings (rounded): " + savingsCents);

        // A5. 
        int ticket = (int) (Math.random()*100) + 1;
        System.out.println("A5 Raffle ticket: " + ticket);

        // ---------------- PART B: The String class ----------------
        String code = "tab-2026-blue";

        // B1. 
        int len = code.length();
        System.out.println("B1 Length: " + len);

        // B2. 
        int dash = code.indexOf("-");
        System.out.println("B2 First dash at index: " + dash);

        // B3. 
        String type = code.substring(0, dash);
        System.out.println("B3 Type: " + type);

        // B4. 
        String color = code.substring(9);
        System.out.println("B4 Color: " + color);

        // B5. Run this line as written. Predict the output BEFORE you run it.
        code.toUpperCase();
        System.out.println("B5 After code.toUpperCase(): " + code);

        // B6. 
        code = code.toUpperCase();
        System.out.println("B6 After code = code.toUpperCase(): " + code);

        // B7. 
        String scanned = "TAB-2026-BLUE";
        boolean match = code.equals(scanned);
        System.out.println("B7 Codes match: " + match);
    }
}
