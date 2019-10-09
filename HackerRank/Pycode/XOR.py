n = input()
m = input()
p=0
t=0
for x in range(n,m+1):
    for y in range(x,m+1):
        t = x^y
        print t
        if t>p:
            p=t
print p

