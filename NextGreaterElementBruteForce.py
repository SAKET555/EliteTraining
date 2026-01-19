def next_greater_bruteforce(arr):
    result = [-1] * len(arr)
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[j] > arr[i]:
                result[i] = arr[j]
                break
    return result