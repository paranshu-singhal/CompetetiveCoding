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

class Solution:
    def equationsPossible(self, equations: List[str]) -> bool:
        dsu = DSU(26)
        
        for eq in equations:
            if eq[1] == '=':
                dsu.union(ord(eq[0])-97, ord(eq[3])-97)
        
        for eq in equations:
            if eq[1] == '!':
                if dsu.find(ord(eq[0])-97) == dsu.find(ord(eq[3])-97):
                    return False
        return True