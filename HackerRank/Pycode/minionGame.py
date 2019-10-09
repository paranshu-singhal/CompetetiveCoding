temp=['A','E','I','O','U']
st=0
ke=0
case=raw_input()
l=len(case)
for x in range(0,l):
    if case[x] in temp:
        ke+=l-x
    else:
        st+=l-x
if st>ke:
    print 'Stuart',st
elif ke>st:
    print 'Kevin',ke
else:
    print 'Draw'
