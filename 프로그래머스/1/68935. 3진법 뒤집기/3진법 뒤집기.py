def solution(n):
    a_reversed = ''
    while n > 0:
        n, mod = divmod(n, 3)
        a_reversed += str(mod)
    
    return int(a_reversed, 3)
