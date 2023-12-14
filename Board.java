public class Board {
    public static void main(String[] args) {

        // short
        short[] values = {(short)34, (short)45, (short)65, (short)21, (short)12};
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }

        short[] values1 = {(short)34, (short)45, (short)65, (short)21, (short)12};
        for (int i = (values1.length - 1) / 2; i >= 0; i--) {
            System.out.println(" middle to left side " + values1[i]);
        }

        short[] values2 = {(short)34, (short)45, (short)65, (short)21, (short)12};
        for (int i = (values2.length - 1) / 2; i < values2.length; i++) {
            System.out.println(" middle to right side " + values2[i]);
        }

        short[] values3 = {(short)34, (short)45, (short)65, (short)21, (short)12};
        int sum = 0;
        for (int i = 0; i < values3.length; i++)
            sum = sum + values3[i];
        System.out.println(" sum " + sum);

        short[] values4 = {(short)34, (short)45, (short)65, (short)21, (short)12};
        for (int i = 0; i < values4.length; i++)
            if (values4[i] % 2 == 0) {
                System.out.println("even " + values4[i]);
            }

        short[] values5 = {(short)34, (short)45, (short)65, (short)21, (short)12};
        for (int i = 0; i < values5.length; i++)
            if (values5[i] % 2 != 0) {
                System.out.println("odd " + values5[i]);
            }

        // int
        int[] num = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

        int[] num1 = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        for (int i = (num1.length - 1) / 2; i >= 0; i--) {
            System.out.println(" middle to left side " + num1[i]);
        }

        int[] num2 = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        for (int i = (num2.length - 1) / 2; i < num2.length; i++) {
            System.out.println(" middle to right side " + num2[i]);
        }

        int[] num3 = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        int sum2 = 0;
        for (int i = 0; i < num3.length; i++)
            sum2 = sum2 + num3[i];
        System.out.println(" sum " + sum2);

        int[] num4 = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        for (int i = 0; i < num4.length; i++)
            if (num4[i] % 2 == 0) {
                System.out.println("even " + num4[i]);
            }

        int[] num5 = {819, 935, 1023, 1089, 2000, 2553, 2787, 3000};
        for (int i = 0; i < num5.length; i++)
            if (num5[i] % 2 != 0) {
                System.out.println("odd " + num5[i]);
            }

        // float
        float[] values6 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        for (int i = values6.length - 1; i >= 0; i--) {
            System.out.println(values6[i]);
        }

        float[] values7 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        for (int i = (values7.length - 1) / 2; i >= 0; i--) {
            System.out.println(" middle to left side " + values7[i]);
        }

        float[] values8 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        for (int i = (values8.length - 1) / 2; i < values8.length; i++) {
            System.out.println(" middle to right side " + values8[i]);
        }

        float[] values9 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        float sum3 = 0;
        for (int i = 0; i < values9.length; i++)
            sum3 = sum3 + values9[i];
        System.out.println(" sum " + sum3);

        float[] values10 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        for (int i = 0; i < values10.length; i++)
            if (values10[i] % 2 == 0) {
                System.out.println("even " + values10[i]);
            }

        float[] values11 = {22.32f, 35.56f, 45.78f, 56.47f, 68.45f, 78.56f, 89.45f, 97.34f};
        for (int i = 0; i < values11.length; i++)
            if (values11[i] % 2 != 0) {
                System.out.println("odd " + values11[i]);
            }

        // long
        long[] number = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }

        long[] number1 = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        for (int i = (number1.length - 1) / 2; i >= 0; i--) {
            System.out.println(" middle to left side " + number1[i]);
        }

        long[] number2 = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        for (int i = (number2.length - 1) / 2; i < number2.length; i++) {
            System.out.println(" middle to right side " + number2[i]);
        }

        long[] number3 = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        long sum4 = 0;
        for (int i = 0; i < number3.length; i++) {
            sum4 = sum4 + number3[i];
        }
        System.out.println(" sum " + sum4);

        long[] number4 = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        for (int i = 0; i < number4.length; i++)
            if (number4[i] % 2 == 0) {
                System.out.println("even " + number4[i]);
            }

        long[] number5 = {1203213232L, 2034562798L, 40847376332L, 46736736234L, 4354364228L, 19637629L, 6574735332L, 3726662572L};
        for (int i = 0; i < number5.length; i++)
            if (number5[i] % 2 != 0) {
                System.out.println("odd " + number5[i]);
            }
			
		byte[]arr={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
		for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
		
		byte[]arr1={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
		for (int i = (arr1.length - 1) / 2; i >= 0; i--) {
            System.out.println(" middle to left side " + arr1[i]);
        }
		
		byte[]arr2={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
		for (int i = (arr2.length - 1) / 2; i < arr2.length; i++) {
            System.out.println(" middle to right side " + arr2[i]);
        }
		
		byte[]arr3={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
		int sum5 = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum5 = sum5 + arr3[i];
        }
        System.out.println(" sum " + sum5);
		
		byte[]arr4={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
		for (int i = 0; i < arr4.length; i++)
            if (arr4[i] % 2 == 0) {
                System.out.println("even " + arr4[i]);
            }
			
		byte[]arr5={(byte)12,(byte)13,(byte)14,(byte)15,(byte)17,(byte)18,(byte)29,(byte)58};
        for (int i = 0; i < arr5.length; i++)
            if (arr5[i] % 2 != 0) {
                System.out.println("odd " + arr5[i]);
            }
	}
}
