def minFlips(a: int, b: int, c: int) -> int:
    a = bin(a)[2:]
    b = bin(b)[2:]
    c = bin(c)[2:]
    
    max_len = max(len(a), max(len(b), len(c)))
    
    diff = max_len - len(a)
    a = '0'*diff + a
    
    diff = max_len - len(b)
    b = '0'*diff + b
    
    diff = max_len - len(c)
    c = '0'*diff + c
    
#     print(a)
#     print(b)
#     print(c)
    
    result=0
    
    for x in range(0,len(a)):
        if (int(a[x]) or int(b[x])) != int(c[x]):
            if c[x] == '1':
                result +=1
            else:
                if a[x]=='0' or b[x]=='0':
                    result +=1
                else:
                    result +=2
    return result