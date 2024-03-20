def solution(price, money, count):
    totalCost = sum([price * i for i in range(1, count + 1)])
    shortage = totalCost - money
    return shortage if shortage > 0 else 0