class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){
            return 0;
        }
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        String str = String.valueOf(n);

        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i) != '0'){
                sb.append(str.charAt(i));
            }
            sum += str.charAt(i)-'0';
        }
        return sum* Integer.parseInt(sb.toString());


        
    }
}