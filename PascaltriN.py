# Pascals Triangle using Dynamic Programming
def printpascal(n):
    mat = []
    for i in range(n):
        arr = []
        for j in range(i+1):
            if j == 0 or i == j:
                arr.append(1)
            else:
                arr.append(mat[i-1][j-1]+mat[i-1][j])
        mat.append(arr) # Note: This line was cut off but is necessary to return the matrix
    return mat

n = int(input())
mat = printpascal(n)

