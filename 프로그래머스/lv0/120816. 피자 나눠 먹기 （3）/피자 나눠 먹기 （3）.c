#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
    int answer = 0;
    while(true){
        if(n <= slice*answer){
        break;
        }
        else answer++;
    }
    
    return answer;
}