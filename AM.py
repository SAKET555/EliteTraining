def ad_mat(A):
    print("Adjacency Matrix: ")
    for row in A:
        print(" ".join(map(str, row)))

import numpy as np

v = int(input("Vertices: "))
e = int(input("Edges: "))
directed = input("Is the graph directed: ")

A = np.zeros((v, v), dtype = int)
ad_mat(A)

for i in range(e):
    sn, en, wt = map(int, input().split())
    A[sn-1][en-1] = wt
    if directed == "no":
        A[en-1][sn-1] = wt

ad_mat(A)