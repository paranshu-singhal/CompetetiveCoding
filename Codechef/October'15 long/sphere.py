a=[1,2,3,4,5]
r=[0,0,0,0,0]
x=1
r[0]=1
for i in range(1,5):
    r[i]=r[i-1]*a[i-1]
print r
for i in range(4,0,-1):
    x=x*a[i]
    r[i-1]=x*r[i-1]
    print r
#print r
#for i in range(0,len(r)):
#    print r[i]
