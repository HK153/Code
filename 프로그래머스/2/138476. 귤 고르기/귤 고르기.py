from collections import Counter

def solution(k, tangerine):

    counter = Counter(tangerine)

    sorted_counts = sorted(counter.values(), reverse=True)

    count = 0
    total = 0
    for freq in sorted_counts:
        total += freq
        count += 1
        if total >= k:
            break
    
    return count