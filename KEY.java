class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> map = new HashMap<>();
        int len = key.length();
        int lan = message.length();
        int u = 0;
        for(int i = 0;i<len;i++){
            if(key.charAt(i) == ' ' || map.containsKey(key.charAt(i))){
                continue;
            }
            int ii = 97 + u;
            char temp = (char)ii;
            map.put(key.charAt(i),temp);
            u++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<lan;i++){
            if(message.charAt(i) == ' '){
                sb.append(' ');
            }
            else {
                sb.append(map.get(message.charAt(i)));
            }
        }
        String ans = sb.toString();
        return ans;
    }
}