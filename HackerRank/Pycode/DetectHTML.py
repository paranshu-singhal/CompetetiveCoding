t=input()
print t
for _ in range(0,t):
    case=raw_input().strip().split()
    #print case
    x=0
    if case[0][x]=='<' and (case[0][x+1]=='!' or case[0][x+1]=='/'):
        continue
    else:
        while x<len(case):
            #print 'x',x
            samp=''
            y=0
            while y<len(case[x]) and case[x][y]!='>':
                #print 'y',y
                if case[x][y]=='=':
                    samp='-> '+samp+' > '
                elif case[x][y]!='"' and case[x][y]!='<' and case[x][y]!='>':
                    if case[x][y]!='/' or case[x][y+1]!='>':
                        samp+=case[x][y]
                y+=1
            print samp
            x+=1
