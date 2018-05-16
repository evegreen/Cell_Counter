import java.util.List;

public class MagnetChecker {
  public int getAjacent(List<Integer> scalePointsList, int pressedCoord) {
    int lowIndex = 0;
    // if right edge
    if (scalePointsList.get(scalePointsList.size() - 1) <= pressedCoord) {
        return scalePointsList.size() - 1;
    }

    for (int i = 0; i < scalePointsList.size(); i++) {
      int crossPoint = scalePointsList.get(i);
      if (crossPoint > pressedCoord) {
        // if left edge
        if (i == 0) {
          return 0;
        }

        lowIndex = i - 1;
        break;
      }
    }

    int lowCoord = scalePointsList.get(lowIndex);
    int highCoord = scalePointsList.get(lowIndex + 1);

    int lowDelta = pressedCoord - lowCoord;
    int highDelta = highCoord - pressedCoord;

    return lowDelta < highDelta ? lowIndex : lowIndex + 1;
  }
}
