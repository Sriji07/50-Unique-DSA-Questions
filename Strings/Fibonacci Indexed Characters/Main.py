def fibonacci_indexed_string(s):
    n = len(s)
    result = []

    # Fibonacci start
    f0 = 0
    f1 = 1

    # Add F0 if valid
    if f0 < n:
        result.append(s[f0])

    # Add F1 if valid
    if f1 < n:
        result.append(s[f1])

    # Generate remaining Fibonacci indices
    while True:
        f2 = f0 + f1
        if f2 >= n:
            break

        result.append(s[f2])

        f0, f1 = f1, f2

    return "".join(result)


# Input handling
s = input().strip()
print(fibonacci_indexed_string(s))
