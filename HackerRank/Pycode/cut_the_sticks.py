n= input()
case = []
for _ in range (0,n):
    case.append(list(raw_input()))
print ''.join(case[0])    
for x in range(1, n-1):
    for y in range(1, n-1):
        if case[x][y]>case[x][y+1] and case[x][y]>case[x][y-1]:
            case[x][y]='X'
    if n>1:
        print ''.join(case[x])
print ''.join(case[n-1])
