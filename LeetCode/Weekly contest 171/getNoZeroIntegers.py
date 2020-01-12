def getNoZeroIntegers(n: int):
    def checkzero(n):
        n = str(n)
        for x in n:
            if x == '0':
                return False
        return True
    i=1
    j=n-1
    while (not checkzero(i) or not checkzero(j)):
        i+=1
        j-=1
    return [i,j]