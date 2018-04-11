# Answers to Lab 5 Questions:

# Malka Bracha

**1.** LinkedStack does not need a specific constructor because you could just use the default one. LinkedStack constructs a node called top and the stack is constructed from there.

**2.** Push(), Peek(), and Pop() are all O(1). AsList() is O(n) because the bigger the stack is, the bigger the array is. It is based on how many items are in the stack. ReverseLines() in main is also O(n) because technically, it would be 2 O(n), but the 2 is insignificant.

**3.** 

**4.** If Push() and Pop() return the whole stack, the user would be able to access each value in the stack after only pushing or popping once. This saves time and space. But it allows the user to see what is beyond the top thing. But, if they only return the top value, then the other values are still hidden and can still be controlled by the program. Once the whole stack is returned, it cannot be taken back. The down side of returning each element separately, is that it takes more time and space.