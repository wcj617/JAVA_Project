class StringEx6 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal =String.valueOf(iVal);

        double dval = 200.0;
        String strVal2 = dval + "";

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);

        double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);

        System.out.println(String.join("", strVal, "+", strVal2,"=") + sum);
        System.out.println(strVal + "+" + strVal2 + "=" + sum2);
    }    
}
