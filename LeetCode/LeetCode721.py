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
class Solution(object):
    def accountsMerge(self, accounts):
        em_to_id={}
        em_to_name={}

        size = len(accounts)
        dsu = DSU(10001)
        i = 0
        for account in accounts:
            name = account[0]
            for email in account[1:]:
                em_to_name[email] = name
                if email not in em_to_id:
                    em_to_id[email] = i
                    i += 1
                dsu.union(em_to_id[account[1]], em_to_id[email])
        # print (em_to_id)
        # print (em_to_name)
        ans = collections.defaultdict(list)
        for email in em_to_name:
                ans[dsu.find(em_to_id[email])].append(email)

        return [[em_to_name[v[0]]] + sorted(v) for v in ans.values()]
        