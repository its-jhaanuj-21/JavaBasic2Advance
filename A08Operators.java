public class A08Operators {
    public static void main(String[] args) {
        /*
         * 
         * 4 + 6 - 8 * 4 / 2
         * operand -> 2, 4, 6, 8
         * operator -> + - * /
         * 
         * 
         * Operators: used on operand to perform any operation
         * 1. Arithmetic operator
         * + Addition
         * - Subtraction
         * * Multiplication
         * / Division (Quotient)
         * % Modulo (Remainder)
         * 
         * 2. Unary Operator:
         * Unary Minus: -
         * Increment Operator: ++
         * ++x (PreIncrement)
         * x++ (PostIncrement)
         * Decrement Operator: --
         * --x (PreDecrement)
         * x-- (PostDecrement)
         * Not Operator: !
         * Bitwise Complement: ~
         * 
         * 3. Assignment Operator: use to assign value to a variable
         * = => a = 9
         * += => a = a+9
         * -= => a = a-9
         * *= => a = a*9
         * /= => a = a/9
         * 
         * 4. Relational Operator: return true or false
         * == (equal to)
         * < (less than)
         * > (greater than)
         * <= (less than equal to)
         * >= (greater than eqaul to)
         * != (not equal to)
         * 
         * 
         * 5. Logical Operator
         * && (AND) => all true than true
         * || (OR) => if one true than true
         * ! (NOT) => false if true / true if flase
         * 
         * 
         * 6. Bitwise Operator
         * 
         * 7. Ternary Operator
         *
         * 
         * 
         */

        // Arithemetic
        int a = 13;
        int b = 2;
        float fval = 2.0f;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subraction: " + (a - b));
        System.out.println("Multiplication: " + a * b);
        System.out.println("Division(Quotient): " + a / b); // -> 6
        System.out.println("Division: " + a / fval); // -> 6.5
        System.out.println("Remainder: " + a % b);
        System.out.println(10 % 7); // 3

        System.out.println(4 % 8); // 4
        System.out.println(3 % 12); // 3

        /*
         * In more general terms, for any integer a and a positive integer b, the result
         * of a % b is the remainder when a is divided by b. If a is less than b, the
         * result is simply a because b cannot fit into a even once, leaving a as the
         * remainder.
         * 
         *  8 % 3 = ?
         *      |-------> 3 x __ <= 8
         *       therefore:  3 x 2 = 6 <= 8
         *              =>   8 - 6 = 2 => result  
         * 
         *  1 % 5 = ? 
         *         |-------> 5 x __ <= 1
         *       therefore:  5 x 0 = 0 <= 1
         *              =>   1 - 0 = 1 => result
         * 
         * 
         */

        System.out.println("---------------------------------------------------");
        // Increment & Decrement
        int a1 = 9;
        int b1 = ++a1; // 1stly a1 becomes 10 then, 10 assigend to b1
        System.out.println(b1); // 10
        System.out.println(a1); // 10
        int a2 = 9;
        int b2 = a2++; // 1stly 9 is assigned to b2 then, a2 becomes 10;
        System.out.println(b2); // 9
        System.out.println(a2); // 10

        int a3 = 9;
        int b3 = --a3; // 1stly a3 becomes 8 then, 8 assigend to b3
        System.out.println(b3); // 8
        System.out.println(a3); // 8
        int a4 = 9;
        int b4 = a4--; // 1stly 9 is assigned to b4 then, a4 becomes 8;
        System.out.println(b4);// 9
        System.out.println(a4);// 8

        int c = 9;
        int d = c++ + ++c + --c;
        // 9 + 11 + 10 = 30
        System.out.println(d); // 30

        int e = 4;
        int f = e++ + ++e + --e - e++ + e-- - e++ + e;
        // 4 + 6 + 5 - 5 + 6 - 5 + 6 = 17
        System.out.println(f);

        // ----------------------------------------------------------------------------------
        System.out.println("-------------------------------------------------");

        // Assignment Operator:
        int num;
        num = 9;
        System.out.println(num);

        int m1, m2, m3, m4;
        m1 = m2 = m3 = m4 = 10; // Assigning same value to multiple variable at once.
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);

        // Compound Assignment Operator:
        int x1 = 10;
        x1 += 5; // x1 = x1 + 5
        System.out.println(x1);

        int x2 = 10;
        x2 -= 6; // x2 = x2 - 6
        System.out.println(x2);

        int x3 = 10;
        x3 *= 3; // x3 = x3 * 3;
        System.out.println(x3);

        int x4 = 10;
        x4 /= 5; // x4 = x4 / 5;
        System.out.println(x4);

        int x5 = 10;
        x5 %= 3; // x5 = x5 % 3;
        System.out.println(x5);

        // ------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------");

        int y1 = 10;
        int y2 = 10;
        int y3 = 20;

        boolean res = y3 > y1;
        System.out.println(res);

        System.out.println(y3 > y1);
        System.out.println(y3 < y1);
        System.out.println(y2 <= y1);
        System.out.println(y2 >= y1);
        System.out.println(y3 >= y2);
        System.out.println(y1 != y2);
        System.out.println(y1 != y3);

        // ---------------------------------------------------------------------
        System.out.println("---------------------------------------------------------");

        // Logical operator
        int z1 = 10;
        int z2 = 2;
        int z3 = 6;
        System.out.println(z1 > z2 && z1 > z3);
        System.out.println(z1 > z2 && z2 > z3);
        System.out.println(z1 > z2 || z2 < z3);
        System.out.println(z1 > z2 || z2 > z3);
        System.out.println(!true);

    }
}
