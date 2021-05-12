// vars/evenOrOdd.groovy
def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    return "The build number is even"
  } else {
    return "The build number is odd"
  }
}
