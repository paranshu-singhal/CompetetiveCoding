k,m = map(int,raw_input().split())
case=[]
for _ in range(0,k):
    case.append(sorted(map(int,raw_input().split())))
ans=0
y=0
x=0
while x<k:
    ans+=pow(case[x][-1-y],2)
    if ans>=m:
        ans-=pow(case[x][-1-y],2)
        y+=1
    else:
        x+=1
print ans    
