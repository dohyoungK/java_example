public class listPrimes_18 {
    public static void main(String[] args) {
        System.out.println(listPrimes(6));
    }

    public static String listPrimes(int num) {
        // TODO:for (2~num)
        //        for (2~ i)
        String result = "";


        for (int i = 2; i <= num; i++) { // 2,3,4,5,6
            boolean chk = true;
            for (int j = 2; j < i; j++) { //i로 가져온 2,3,4... 소수인지 판별하기위해서 j= 2,3,4
                if (i % j == 0) chk = false;
            }
            if (chk)    result += Integer.toString(i) + "-";
        }

        result = result.substring(0, result.length()-1);
        return result;
    }
}
