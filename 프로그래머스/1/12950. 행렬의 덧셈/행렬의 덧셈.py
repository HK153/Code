def solution(arr1, arr2):
    answer = []
    
    # 행(row) 반복
    for i in range(len(arr1)):
        row = []
        
        # 열(column) 반복
        for j in range(len(arr1[0])):
            sum_value = arr1[i][j] + arr2[i][j]
            row.append(sum_value)

        answer.append(row)
    return answer