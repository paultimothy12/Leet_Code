class solution{
	public static String intToRoman(int num)
	{
			String I[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
			String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
			String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
			String M[] = {"", "M", "MM", "MMM"};
			return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];  //From Left to right Approach
	}
	public static Integer romanToInt(String s)
	{
		int sum = 0;
        int prev = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            int cur = 0;
            switch (s.charAt(i))
            {
            case 'I':
                cur = 1;
                break;
            case 'V':
                cur = 5;
                break;
            case 'X':
                cur = 10;
                break;
            case 'L':
                cur = 50;
                break;
            case 'C':
                cur = 100;
                break;
            case 'D':
                cur = 500;
                break;
            case 'M':
                cur = 1000;
                break;
            }
            if (cur > prev)
            {
                sum += cur;
            }
            else
            {
                sum -= cur;
            }
            prev = cur;
        }
        return sum;    
    }

	public static void main(String[] args) {
			 System.out.println(intToRoman(3678)); //op=MMMDCLXXVIII
			 System.out.println(romanToInt("CDLXVII")); //op=467
	}
}
