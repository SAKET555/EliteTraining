arr = [3, 3, 3, 1, 1]
seen = set()
result = []
for num in arr:
    if num not in seen:
        seen.add(num)
        result.append(num)

result.sort()
print(result)