## 🧠 Approach

### 🔍 Understanding the Pattern

We are given two strings:

- **str1** → Primary string (always iterated fully unless early break)  
- **str2** → Secondary string (characters picked using special index rule)  

---

### 📌 Core Logic

For each index `i` in `str1`:

---

#### Step 1 — Add Character from str1

Always append:
str1[i]


---

#### Step 2 — Compute Index for str2

Index is generated using Fibonacci-like pattern:

bIndex = current_index + previous_index


Where:

For first iteration:
bIndex = 0


Then pattern becomes:
0
1 = 1 + 0
3 = 2 + 1
5 = 3 + 2
...


---

#### Step 3 — Add Character from str2

If:
bIndex < length of str2


→ Append:
str2[bIndex]


Else:
- Append remaining unused part of `str2`
- Stop process

---

#### Step 4 — Track Last Used Index of str2

This helps in appending remaining characters later.

---

#### Step 5 — After Loop Ends

If some characters in `str2` are unused → Append them.

---

## ⏱ Complexity

### Time Complexity
O(N + M)


Where:
- `N = length of str1`
- `M = length of str2`

---

### Space Complexity
O(N + M)


(Result storage)

---

## 🧾 Pseudocode

FUNCTION starkString(str1, str2):

result ← empty list
prevAIndex ← 0
lastBUsed ← -1

FOR currAIndex FROM 0 TO length(str1) - 1:

    ADD str1[currAIndex] TO result

    IF currAIndex == 0:
        bIndex ← 0
    ELSE:
        bIndex ← currAIndex + prevAIndex

    IF bIndex < length(str2):
        ADD str2[bIndex] TO result
        lastBUsed ← MAX(lastBUsed, bIndex)

    ELSE:
        IF lastBUsed + 1 < length(str2):
            ADD substring str2[lastBUsed+1 to end] TO result
        RETURN result as string

    prevAIndex ← currAIndex

IF lastBUsed + 1 < length(str2):
    ADD substring str2[lastBUsed+1 to end] TO result

RETURN result as string