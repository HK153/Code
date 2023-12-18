from collections import Counter

word1 = input().strip()
word2 = input().strip()

counter1 = Counter(word1)
counter2 = Counter(word2)

# 두 단어의 차이를 계산하여 최소 개수의 제거가 필요한 문자 수를 구함
remove = sum((counter1 - counter2).values()) + sum((counter2 - counter1).values())
print(remove)