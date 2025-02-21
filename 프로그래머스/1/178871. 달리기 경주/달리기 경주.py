def solution(players, callings):
    rank = {players : i for i, players in enumerate(players)}
    for call in callings:
        call_idx = rank[call]
    
        if call_idx > 0:
            front_name = players[call_idx -1]
            
            players[call_idx -1], players[call_idx] = players[call_idx], players[call_idx -1]
            
            rank[call] -= 1
            rank[front_name] += 1
    return players