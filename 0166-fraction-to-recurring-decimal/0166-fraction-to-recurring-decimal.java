class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
      // Use long to handle overflow cases
        long n = numerator;
        long d = denominator;

        if (n % d == 0) {
            return String.valueOf(n / d); // safe division with long
        }

        String s = "";

        // Handle sign
        if ((n < 0) ^ (d < 0)) {
            s += "-";
        }
        
         n = Math.abs(n);
        d = Math.abs(d);

        s += n / d + ".";
        int v = s.length();
        long remainder = n % d;

        HashMap<Long, Integer> h = new HashMap<>();
        h.put(remainder, v);

        while(remainder!=0){
            remainder=remainder*10;
            long digit=remainder/d;
            s=s+String.valueOf(digit);
            remainder=remainder%d;
             if(h.containsKey(remainder)){
                // Repeat detected
                int index = h.get(remainder);
                StringBuilder sb = new StringBuilder(s);
                sb.insert(index, '(');
                sb.append(')');
                return sb.toString();
            }
            h.put(remainder,s.length());

        }
      
        return s;
        
    }
}