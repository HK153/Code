N = int(input())

for i in range(N):
    x, y = map(int, input().split())
    distance = y - x
    speed = 1
    move = 0
    
    while distance != 0:
        if distance >= speed*2:
            distance -= speed*2
            move += 2
            speed += 1
        elif distance >= speed:
            distance -= speed
            move += 1
            speed += 1
        else:
            distance = 0
            move += 1
    print(move)