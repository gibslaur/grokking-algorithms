public int factorial(int n) {
  if (n == 1) { // base case (if n is 1, we're done)
    return 1;
  } else { 
    return n * factorial(n-1); // recursive case
  } 
}