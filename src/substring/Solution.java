package substring;

class Solution {
    public int solution(String str1, String str2) {
        return str2.toLowerCase().contains(str1.toLowerCase()) ? 1 : 0;
    }
}