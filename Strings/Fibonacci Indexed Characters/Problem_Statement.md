## 📝 Problem Statement

Given a string `s`, return a new string formed by selecting characters from `s` at indices that belong to the Fibonacci sequence.

The Fibonacci sequence is defined as:

- `F0 = 0`  
- `F1 = 1`  
- `Fn = Fn-1 + Fn-2` for `n ≥ 2`  

Only consider Fibonacci numbers that are less than the length of the string.

If a Fibonacci index appears multiple times (e.g., `1` appears twice in sequence generation), include the character each time.

---

## 📥 Input

- A string `s` consisting of lowercase English letters.

---

## 📤 Output

- Return a string containing characters at Fibonacci indices in order.

---

## 📌 Constraints

- `1 <= s.length <= 10^5`  
- `s` contains only lowercase English letters.

---

## 🧪 Examples

### Example 1

**Input**
s = "abcdefghi"


**Output**
abbcdfi


**Explanation**

Fibonacci indices:
0, 1, 1, 2, 3, 5, 8


Characters:
a b b c d f i