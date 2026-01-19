def nth_fib(n, memo):  # Added 'memo' here
    if n <= 1:
        return n
    
    # If we already calculated it, return the saved value
    if memo[n] != -1:
        return memo[n]
    
    # Save the result in memo before returning
    memo[n] = nth_fib(n-1, memo) + nth_fib(n-2, memo)
    return memo[n]

def fib(n):
    memo = [-1] * (n + 1)
    return nth_fib(n, memo)

n = int(input("Enter a number: "))
print(fib(n))