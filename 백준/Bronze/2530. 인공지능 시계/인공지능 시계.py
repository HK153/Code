h, m, s = map(int, input().split())
time = int(input())

hour = h
minute = m
sec = s

if time >= 3600:
    hour += time // 3600
    time = time % 3600

if time >= 60:
    minute += time // 60
    time = time % 60

sec += time

if sec >= 60:
    minute += sec // 60
    sec %= 60

if minute >= 60:
    hour += minute // 60
    minute %= 60

hour %= 24

print(hour, minute, sec)