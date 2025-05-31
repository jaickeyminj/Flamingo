# Set1 Q3 MyHashMap (Java)

Created my own version of a HashMap in Java — without using Java's built-in `HashMap` or `Map`.

This file has a custom `MyHashMap` class that supports the following operations:

| Method            | Description                                      |
|-------------------|--------------------------------------------------|
| `put(key, value)` | Add a new key with value, or update if it exists|
| `get(key)`        | Returns the value for the key, or `-1` if not found |
| `remove(key)`     | Deletes the key and its value from the map      |

📌 All keys and values are integers.

## 🔒 Constraints

| Constraint                             | Description                                        |
|----------------------------------------|----------------------------------------------------|
| Data Type                              | All keys and values are integers                   |
| Range                                  | `0 <= key, value <= 10^6`                         |
| Uniqueness                             | Keys are unique within the map                     |
| Maximum Operations                     | Up to `10^5` operations supported                  |
| Library Restriction                    | Do **not** use built-in hash maps or dictionaries  |
