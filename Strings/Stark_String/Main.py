def stark_string(str1, str2):
    result = []

    prev_a_index = 0
    last_b_used = -1

    for curr_a_index in range(len(str1)):

        # Add character from A
        result.append(str1[curr_a_index])

        # Calculate B index
        if curr_a_index == 0:
            b_index = 0
        else:
            b_index = curr_a_index + prev_a_index

        # Add character from B if valid
        if b_index < len(str2):
            result.append(str2[b_index])
            last_b_used = max(last_b_used, b_index)
        else:
            # If B index exceeds, append remaining B and return
            if last_b_used + 1 < len(str2):
                result.append(str2[last_b_used + 1 :])
            return "".join(result)

        prev_a_index = curr_a_index

    # Append remaining B after finishing A
    if last_b_used + 1 < len(str2):
        result.append(str2[last_b_used + 1 :])

    return "".join(result)


# Input handling (like Java Scanner)
str1 = input()
str2 = input()

print(stark_string(str1, str2))
