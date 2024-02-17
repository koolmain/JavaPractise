package dsa.string;

public class LongestBalancedParan {

    /*

"""
* Asymptotic complexity in terms of length of \`brackets\` \`n\`:
* Time: O(n).
* Auxiliary space: O(1).
* Total space: O(n).
"""

def find_max_length_of_matching_parentheses(brackets):
    n = len(brackets)

    max_length = 0

    # Scan from left to right.

    left_count = right_count = 0

    for idx in range(n):
        if brackets[idx] == '(':
            left_count += 1
        else:
            right_count += 1

        if left_count < right_count:
            left_count = right_count = 0
        elif left_count == right_count:
            max_length = max(max_length, 2 * left_count)

    """
    Consider '(((()))'.

    First 'left_count' becomes 4, then 'right_count' becomes 3. The "balance" of left_count==right_count
    is never reached, so answer is not found. A scan in the opposite direction is needed.
    """

    # Scan from right to left.

    left_count = right_count = 0

    for idx in range(n - 1, -1, -1):
        if brackets[idx] == '(':
            left_count += 1
        else:
            right_count += 1

        if left_count > right_count:
            left_count = right_count = 0
        elif left_count == right_count:
            max_length = max(max_length, 2 * left_count)

    return max_length


     */
}
