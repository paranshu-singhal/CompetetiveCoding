[a,b,n]=map(int, raw_input().split())
arr=[a,b]
for x in range(2,n):
    arr.append(pow(arr[x-1],2)+arr[x-2])
print arr[n-1]
