function solution(n, m, section) {
    let paintCount = 0;
    let currentIndex = 0;
    
    while (currentIndex < section.length) {
        // 현재 롤러로 페인트칠을 시작할 위치
        let startPosition = section[currentIndex];
        
        // 롤러로 칠할 수 있는 마지막 위치
        let endPosition = startPosition + m - 1;
        
        // 롤러를 한번 사용했으므로 카운트를 증가시킴
        paintCount++;
        
        // 롤러가 덮을 수 있는 범위 내에서 다음 페인트칠할 구역을 찾음
        while (currentIndex < section.length && section[currentIndex] <= endPosition) {
            currentIndex++;
        }
    }
    
    return paintCount;
}