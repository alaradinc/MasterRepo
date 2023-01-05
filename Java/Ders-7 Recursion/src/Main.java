public class Main {
    public static void main(String[] args) {
        System.out.println(recFactorial(7));

    }
//static functions are tied directly to the class while non-static functions require the creation of an object to be called

    // the keyword static means that the particular member belongs to a type itself, rather than to an instance of that type.
//    static int recFibo(int termNo) { // to be able to call a method from static context (e.g. main function) you have to define that function as static also!
//        // fibo(n) = fibo(n-1) + fibo(n-2)
//        if (termNo == 1 || termNo == 0) { // you are adding termNo - 1 and termNo -2' which is why you must also define 0!!
//            return termNo;
//        }
//        return recFibo(termNo - 1) + recFibo(termNo - 2);
//    }

//    static int fibo(int termNo) {
//        // exp: 1,1,2,3,5,8,13,21,34,55
//
//        int term1 = 1;
//        int term2 = 1;
//        int term3 = 0;
//
//        for(int i = 0; i < termNo-2; i++){
//            term3 = term1 + term2;
//            term1 = term2;
//            term2 = term3;
//        }
//
//        return term3;
//    }


//    static int recSum(int num) {
//        if (num == 1) {
//            return num;
//        }
//        return num + sum(num - 1);
//    }


//    static int sum(int num) {
//        // while n = 5, ans will be 5 + 4 + 3 + 2 + 1
//        int sum = 0;
//        for (int i = 0; i <= num; i++) {
//            sum += i;
//        }
//        return sum;
//    }
//
//    static int recFactorial(int num) {
//        // num! = num x (num-1)!
//        if (num == 1) {
//            return num;
//        }
//        return num * recFactorial(num - 1);
//    }


    static int factorial(int num) {
        // 5! = 5x4x3x2x1
        int product = 1;
        for (int i = 1; i <= num; i++) {
            product *= i;
        }
        return product;
    }

    

    static int recPower(int base, int exp) {
        if (exp == 1) {
            return base;
        }
        return base * recPower(base, exp - 1);
    }

    static int power(int base, int exp) {
        // 3^4 => 3x3x3x3
        int ans = 1;
        for (int i = 0; i < exp; i++) {
            ans *= base; // ans = ans * base;
        }
        return ans;
    }
}