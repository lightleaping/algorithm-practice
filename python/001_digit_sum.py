# 숫자 n을 문자열로 변환 → 각 자릿수를 리스트로 만듦
# 각 자릿수를 int로 바꾼 후 sum으로 합산
# 파이썬의 map() 함수는 반복 가능한 객체의 각 요소에 함수를 적용하여 새로운 iterator(반복자)를 반환
# 문자열 입력 시 map()은 문자 단위로 iterable을 처리, 문자열 숫자를 각 자리수 정수 리스트로 바꾸는 방법
def solution(n):
    return sum(map(int, str(n)))