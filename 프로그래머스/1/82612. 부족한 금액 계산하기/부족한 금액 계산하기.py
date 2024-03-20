def solution(price, money, count):
    totalCost = sum([price * i for i in range(1, count + 1)])
    shortage = totalCost - money
    if shortage > 0:
        return shortage
    else:
        return 0