package array_compare;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int[] sum = new int[2];
        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        } else if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                sum[0] += arr1[i];
            }
            for(int j = 0; j < arr2.length; j++){
                sum[1] += arr2[j];
            }
            answer = sum[0] == sum[1] ? 0 : sum[0] > sum[1] ? 1 : -1;
        }
        return answer;
    }
}

// 풀이
// 두 배열 비교하기 위해 길이가 2인 sum 배열을 선언했다.
// 조건문을 이용해서 두 배열의 길이를 비교한다.
// 두 배열의 길이가 같다면 sum 배열에다가 각각 배열의 합을 넣어준다.
// 두 개의 sum 배열을 비교해서 answer 값을 정한다.