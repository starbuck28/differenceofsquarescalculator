import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

  public int computeSquareOfSumTo(int number) {
    int summedNumbers = IntStream.rangeClosed(1, number).sum();
    return summedNumbers * summedNumbers;
  }

  public int computeSumOfSquaresTo(int number) {
    return IntStream.rangeClosed(1, number).map(n -> n * n).sum();
  }

  public int computeDifferenceOfSquares(int number) {
    return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
  }
}
