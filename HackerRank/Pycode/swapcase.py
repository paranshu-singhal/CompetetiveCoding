t=input()
print t
for _ in range(0,t):
    case=raw_input().strip()
    print case
    x=0
    if case[x]=='<' and (case[x+1]=='!' or case[x+1]=='/'):
        #print 1
        continue
    else: 
        samp=''
        while case[x]!='>' and x<len(case)-1:
            if case[x]==' ':
                print samp
                samp=''
            elif case[x]=='=':
                samp='-> '+samp+' > '
            elif case[x]!='"' and case[x]!='<':
                if case[x]!='/' or case[x+1]!='>':
                    samp+=case[x]
            x+=1
        print samp 
    
    
