package array_length_other_calculate;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        for(int i = 0; i < arr.length; i = i + 2){
            if(arr.length % 2 == 0)
                answer[i + 1] = arr[i + 1] + n;
            else
                answer[i] = arr[i] + n;
        }
        return answer;
    }
}

// 풀이
// answer에다가 각각 arr의 인덱스 값을 일일이 집어 넣는 것을 안하기 위해서
// answer을 arr로 초기화를 했다.
// if문을 이용해서 arr의 길이가 홀수, 짝수 판별
// arr의 길이가 홀수는 i, 짝수는 i + 1로 짝수 인덱스, 홀수 인덱스에 n 값을 더해주도록 했다.