from collections import deque
def solution(people, limit):
    people.sort()
    pList = deque(people)
    answer = 0
    while len(pList) != 0:
        sum = pList.pop()
        if len(pList) != 0 and sum + pList[0] <= limit:
            pList.popleft()
        answer += 1
    return answer