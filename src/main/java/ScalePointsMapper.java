import ij.gui.ImageCanvas;

import java.util.List;
import java.util.stream.Collectors;

public class ScalePointsMapper {
  private ImageCanvas imageCanvas;

  public ScalePointsMapper(ImageCanvas imageCanvas) {
    this.imageCanvas = imageCanvas;
  }

  public List<Integer> getOffscreenXCoordsList(List<Double> coordsList) {
    return coordsList.stream()
      .map(screenCoord -> imageCanvas.offScreenX(screenCoord.intValue()))
      .collect(Collectors.toList());
  }

  public List<Integer> getOffscreenYCoordsList(List<Double> coordsList) {
    return coordsList.stream()
      .map(screenCoord -> imageCanvas.offScreenY(screenCoord.intValue()))
      .collect(Collectors.toList());
  }
}
