```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 10) // Output: 10
println myMethod(10, 5) // Output: 10

//The issue is that if a and b are not explicitly defined as numbers, the comparision will be lexicographical
println myMethod("10", "5") // Output: "5"
```