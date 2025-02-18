# Groovy Implicit Type Conversion Bug

This example demonstrates a subtle bug in Groovy related to implicit type conversion during comparisons.  When comparing values without explicitly defining their type, Groovy's default behavior might not be what you expect, especially when comparing strings that look like numbers.

The `myMethod` function intends to return the larger of two numbers. However, when passed strings, it performs a lexicographical comparison, leading to incorrect results.

**Solution:** Explicitly type-cast the inputs to integers before comparison to resolve the unexpected behavior.