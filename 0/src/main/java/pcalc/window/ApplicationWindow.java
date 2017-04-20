
public class ApplicationWindow extends JFrame {
  public JTextField uInput;
  public JTextField mInput;
  
  public ApplicationWindow() {
    uInput = new JTextField();
    mInput = new JTextField();
    uInput.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        mInput.setText(Integer.parseInt(uInput.getText()));
      }
    });
    uInput.addChangeListener(new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent e) {
        uInput.setText(Integer.parseInt(mInput.getText()));
      }
    });
    JPanel panel = new JPanel();
    panel.add(uInput);
    panel.add(mInput);
    add(panel);
  }
}
