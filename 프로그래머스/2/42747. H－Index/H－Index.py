def solution(citations):
    citations.sort()
    for i in range(len(citations)):
        count = len(citations) - i
        if citations[i] >= count:
            return count
    return 0
