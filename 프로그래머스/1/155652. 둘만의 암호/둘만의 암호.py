def solution(s, skip, index):
    alphabet = [chr(i) for i in range(ord('a'), ord('z') + 1) if chr(i) not in skip]
    result = ""
    
    for char in s:
        current_idx = alphabet.index(char)
        new_idx = (current_idx + index) % len(alphabet)
        result += alphabet[new_idx]
    
    return result