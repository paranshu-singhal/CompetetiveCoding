t=input()
for _ in range(0,t):
    [n,k]=map(int, raw_input().split())
    cas1 = map(int, raw_input().split())
    cas2 = map(int, raw_input().split())
    f=0
    x=0
    while x<n:
        r = k-cas1[x]
        y=0
        while y<len(cas2):
            if cas2[y]>=r:
                del cas2[y]
                break
            else:
                y+=1
                if y==len(cas2):
                    print 'NO'
                    f=1
                    break
        if f:
            break
        x+=1
        if x>=n:
            print 'YES'
            


    
    
