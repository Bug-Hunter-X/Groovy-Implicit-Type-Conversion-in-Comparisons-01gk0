```groovy
def myMethod(a, b) {
  int numA = a.toInteger()
  int numB = b.toInteger()
  if (numA > numB) {
    return numA
  } else {
    return numB
  }
}

println myMethod(5, 10) // Output: 10
println myMethod(10, 5) // Output: 10

// Now handles strings correctly
println myMethod("10", "5") // Output: 10
println myMethod("5", "10") // Output: 10
```