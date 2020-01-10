package Game;

public interface IButtonPressedObserver {

    void onPausePressed();
    void onZoomInPressed();
    void onZoomOutPressed();
    void onToggleTraces();
    void onToggleDraw();
    void onColorButtonClicked(CellColor color);
    void onClearBoard();
    void onSliderChanged(int value);
}
