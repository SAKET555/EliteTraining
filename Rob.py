def maxLootRec(hval, n, memo):
    if n <= 0:
        return 0
    if n == 1:
        return hval[0]
    if memo[n] != -1:
        return memo[n]
    pick = hval[n-1] + maxLootRec(hval, n-2, memo)
    notpick = maxLootRec(hval, n-1, memo)
    return memo[n]
def maxloot(hval):
    n = len(hval)
    memo = [-1] * (n + 1)
    return maxLootRec(hval, n, memo)
hval = list(map(int, input().split()))
print(maxloot(hval))