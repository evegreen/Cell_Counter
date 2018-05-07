public class MagnetChecker {
  public int getAjacent(List<int> scalePointsList, int pressedCoord) {
    for (int i = 0; i < scalePointsList.size(); i++) {
      int point = scalePointsList.get(i);
      if (pressedCoord > point) {
        int lowIndex = i;
        break;
      }
    }

    int lowCoord = scalePointsList[lowIndex];
    int highCoord = scalePointsList[lowIndex + 1];

    int lowDelta = pressedCoord - lowCoord;
    int highDelta = highCoord - pressedCoord;

    // TODO: test with <=
    return lowDelta < highDelta ? lowCoord : highCoord;
  }
}
