from collections import Counter

def solution(array):
    counter = Counter(array)
    max_count = max(counter.values(), default=0)
    answer = 0
    mode = 0
    for key, value in counter.items():
        if value == max_count:
            mode += 1
            answer = key
    if mode > 1:
        return -1
    else:
        return answer