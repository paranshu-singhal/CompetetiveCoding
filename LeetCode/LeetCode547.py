class Solution:
    def findCircleNum(self, M: List[List[int]]) -> int:
        class DSU:
            def __init__(self, n):
                self.par = list(range(n))
                self.rnk = [0] * n

            def find(self, x):
                if self.par[x] != x:
                    self.par[x] = self.find(self.par[x])
                return self.par[x]

            def union(self, x, y):
                xr, yr = self.find(x), self.find(y)
                if xr == yr:
                    return False
                if self.rnk[xr] < self.rnk[yr]:
                    xr, yr = yr, xr
                if self.rnk[xr] == self.rnk[yr]:
                    self.rnk[xr] += 1

                self.par[yr] = xr
                return True
        
        n = len(M)
        dsu = DSU(n)
        
        result = 0
        
        for i in range(n):
            for j in range(n):
                if M[i][j]==1:
                    dsu.union(i,j)
        
        result = set()
        for x in range(n):
            result.add(dsu.find(x))
        return len(result)