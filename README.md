# Set1 Q2 MyHashMap (Java)

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


# Set1 Q1 LRUCache

This is a custom implementation of an **LRU Cache** in Java — built without using built-in cache classes like `LinkedHashMap`.

| Method         | Description                                                                 |
|----------------|-----------------------------------------------------------------------------|
| `put(key, value)` | Adds or updates a key-value pair. If full, removes least recently used entry. |
| `get(key)`     | Returns the value for a key, or `-1` if the key is not found.              |

The cache automatically removes the **least recently used** item when it reaches its capacity.

## 📊 Constraints

| Rule                            | Value                        |
|----------------------------------|------------------------------|
| Capacity Range                   | 1 to 3000                    |
| Key and Value Range              | 0 to 10,000                  |
| Max Number of Operations         | 100,000                      |
| Time Complexity (for all ops)    | O(1)                         |

