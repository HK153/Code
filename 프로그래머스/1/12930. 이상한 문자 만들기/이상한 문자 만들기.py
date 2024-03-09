def solution(s):
    words = s.split(" ")
    answer = []

    for word in words:
        transformed_word = ""
        for i, char in enumerate(word):
            if i % 2 == 0:
                transformed_word += char.upper()
            else:
                transformed_word += char.lower()
        answer.append(transformed_word)

    return " ".join(answer)