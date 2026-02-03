## 🧠 Approach

### 🔍 Understanding the Problem

We are given a string `s`.  
We need to create a new string by selecting characters from indices that follow the **Fibonacci sequence**.

The Fibonacci sequence is defined as:

F0 = 0
F1 = 1
Fn = Fn-1 + Fn-2


Example Fibonacci indices:
0, 1, 1, 2, 3, 5, 8, 13, ...


We only consider Fibonacci numbers **less than the length of the string**.

If a Fibonacci index repeats (like `1`), we include the character multiple times.

---

### 📌 Core Logic

#### Step 1 — Initialize Fibonacci Numbers
Start with:
F0 = 0
F1 = 1


---

#### Step 2 — Add Characters Using Fibonacci Indices

- Add character at index `F0` if valid  
- Add character at index `F1` if valid  
- Generate next Fibonacci numbers:
F2 = F0 + F1

- Continue until Fibonacci index ≥ string length

---

#### Step 3 — Update Fibonacci Values
After each step:
F0 = F1
F1 = F2


---

#### Step 4 — Return Final String
Join all collected characters and return.

---

## ⏱ Complexity

### Time Complexity
O(K)

Where:
- `K = number of Fibonacci indices less than N`
- Worst case ≈ `O(N)`

---

### Space Complexity
O(N)

For storing result characters.

---

## 🧾 Pseudocode

FUNCTION fibonacciIndexedString(s):

n ← length(s)
result ← empty list

f0 ← 0
f1 ← 1

IF f0 < n:
    ADD s[f0] TO result

IF f1 < n:
    ADD s[f1] TO result

WHILE TRUE:

    f2 ← f0 + f1

    IF f2 >= n:
        BREAK

    ADD s[f2] TO result

    f0 ← f1
    f1 ← f2

RETURN result as string