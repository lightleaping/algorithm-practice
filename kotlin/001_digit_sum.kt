# 프로그래머스 kotlin 문제는 Solution 클래스 안에서 작성.

# (n: Int): 입력 파라미터 n은 정수형(Int)
# : Int: 이 함수는 정수형 결과를 반환

# 정수 → 자릿수 나누기 → 각 자릿수 더하기 필요

# n.toString(): 정수 n을 문자열로. 문자열이 되면 각 자릿수를 다룰 수 있음
# map은 컬렉션(여기선 문자열의 문자들)을 순회하며 변환
# it: 각 문자(Char 타입)
# it.toString().toInt(): 문자 하나를 문자열로 바꾼 후 → 숫자로 변환
# sum(): 합계 계산

# Kotlin에서 문자 하나(Char)를 문자열(String)로 바꾸는 이유: Char에는 toInt()가 "문자의 유니코드 정수값"으로 변환
class Solution {
    fun solution(n: Int): Int {
        return n.toString().map { it.toString().toInt() }.sum()
}

    }
