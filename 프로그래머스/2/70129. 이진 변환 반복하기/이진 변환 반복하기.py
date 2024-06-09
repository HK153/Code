def solution(s):
    transform_count = 0
    remove_count = 0

    while s != "1":
        # 0을 제거하고 남은 문자 길이를 구한다.
        zero_count = s.count('0')
        remove_count += zero_count
        s = s.replace('0', '')

        # 남은 문자 길이를 2진수로 변환한다.
        s = bin(len(s))[2:]
        transform_count += 1

    return [transform_count, remove_count]