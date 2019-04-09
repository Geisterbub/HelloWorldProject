package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyNewGUIWindow {

	protected Shell shlFrWindow;
	private Text vornameTF;
	private Label nachnameL;
	private Text nachnameTF;
	private Label StraﬂeL;
	private Text StraﬂeTF;
	private Label HausnummerL;
	private Text HausnummerTF;
	private Label PLZL;
	private Text PLZTF;
	private Label OrtL;
	private Text OrtTF;
	private Button btnAbbrechen;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyNewGUIWindow window = new MyNewGUIWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		shlFrWindow.setSize(743, 522);
		shlFrWindow.setText("FR Window");
		
		Button btnNewButton = new Button(shlFrWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedr¸ckt");
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(StraﬂeTF.getText());
				System.out.println(HausnummerTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				
			}
		});
		btnNewButton.setBounds(74, 85, 75, 25);
		btnNewButton.setText("MyButton");
		
		Label vornameL = new Label(shlFrWindow, SWT.NONE);
		vornameL.setBounds(54, 146, 70, 15);
		vornameL.setText("Vorname");
		
		vornameTF = new Text(shlFrWindow, SWT.BORDER);
		vornameTF.setBounds(143, 143, 76, 21);
		
		nachnameL = new Label(shlFrWindow, SWT.NONE);
		nachnameL.setBounds(54, 168, 70, 15);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlFrWindow, SWT.BORDER);
		nachnameTF.setBounds(143, 165, 76, 21);
		
		StraﬂeL = new Label(shlFrWindow, SWT.NONE);
		StraﬂeL.setBounds(54, 195, 70, 15);
		StraﬂeL.setText("Stra\u00DFe");
		
		StraﬂeTF = new Text(shlFrWindow, SWT.BORDER);
		StraﬂeTF.setBounds(143, 189, 76, 21);
		
		HausnummerL = new Label(shlFrWindow, SWT.NONE);
		HausnummerL.setBounds(54, 216, 75, 15);
		HausnummerL.setText("Hausnummer");
		
		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(143, 213, 76, 21);
		
		PLZL = new Label(shlFrWindow, SWT.NONE);
		PLZL.setBounds(54, 243, 70, 15);
		PLZL.setText("PLZ");
		
		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(143, 240, 76, 21);
		
		OrtL = new Label(shlFrWindow, SWT.NONE);
		OrtL.setBounds(54, 270, 70, 15);
		OrtL.setText("Ort");
		
		OrtTF = new Text(shlFrWindow, SWT.BORDER);
		OrtTF.setBounds(143, 267, 76, 21);
		
		btnAbbrechen = new Button(shlFrWindow, SWT.NONE);
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(244, 85, 75, 25);
		btnAbbrechen.setText("abbrechen");
		
		Composite composite = new Composite(shlFrWindow, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + " / " + me.y);
			}
		});
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		composite.setBounds(74, 338, 251, 99);
		shlFrWindow.setTabList(new Control[]{vornameTF, nachnameTF, StraﬂeTF, HausnummerTF, PLZTF, OrtTF, btnNewButton});

	}
}
