package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.activation.FileDataSource;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

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
	private Label vornameout;
	private Label nachnameout;
	private Label hausnummerout;
	private Label PLZout;
	private Label ortout;
	private Label straﬂeout;
	private Button btnLoad;

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
				//
				getVornameout().setText(getVornameTF().getText());
				getNachnameout().setText(getNachnameTF().getText());
				getStraﬂeout().setText(getStraﬂeTF().getText());
				getHausnummerout().setText(getHausnummerTF().getText());
				getPLZout().setText(getPLZTF().getText());
				getOrtout().setText(getOrtTF().getText());
				//
				Person p1;
				p1 = new Person();
				p1.setVorname(getVornameTF().getText());
				p1.setNachname(getNachnameTF().getText());
				p1.setStraﬂe(getStraﬂeTF().getText());
				p1.setHausnummer(getHausnummerTF().getText());
				p1.setPLZ(getPLZTF().getText());
				p1.setOrt(getOrtTF().getText());
				//
				System.out.println(p1);
				//
				Person.getListe().add(p1);
				//
				System.out.println(Person.getListe());
				//
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getStraﬂeTF().setText("");
				getHausnummerTF().setText("");
				getPLZTF().setText("");
				getOrtTF().setText("");
				
			
				
			}
		});
		btnNewButton.setBounds(74, 85, 75, 25);
		btnNewButton.setText("MyButton");
		
		Label vornameL = new Label(shlFrWindow, SWT.NONE);
		vornameL.setBounds(54, 143, 83, 21);
		vornameL.setText("Vorname");
		
		vornameTF = new Text(shlFrWindow, SWT.BORDER);
		vornameTF.setBounds(143, 143, 76, 21);
		
		nachnameL = new Label(shlFrWindow, SWT.NONE);
		nachnameL.setBounds(54, 168, 83, 18);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlFrWindow, SWT.BORDER);
		nachnameTF.setBounds(143, 168, 76, 18);
		
		StraﬂeL = new Label(shlFrWindow, SWT.NONE);
		StraﬂeL.setBounds(54, 192, 83, 18);
		StraﬂeL.setText("Stra\u00DFe");
		
		StraﬂeTF = new Text(shlFrWindow, SWT.BORDER);
		StraﬂeTF.setBounds(143, 192, 76, 18);
		
		HausnummerL = new Label(shlFrWindow, SWT.NONE);
		HausnummerL.setBounds(54, 216, 83, 18);
		HausnummerL.setText("Hausnummer");
		
		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(143, 216, 76, 18);
		
		PLZL = new Label(shlFrWindow, SWT.NONE);
		PLZL.setBounds(54, 240, 83, 21);
		PLZL.setText("PLZ");
		
		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(143, 240, 76, 21);
		
		OrtL = new Label(shlFrWindow, SWT.NONE);
		OrtL.setBounds(54, 267, 83, 21);
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
		
		vornameout = new Label(shlFrWindow, SWT.NONE);
		vornameout.setBounds(264, 143, 75, 21);
		
		nachnameout = new Label(shlFrWindow, SWT.NONE);
		nachnameout.setBounds(264, 168, 75, 18);
		
		hausnummerout = new Label(shlFrWindow, SWT.NONE);
		hausnummerout.setBounds(264, 216, 75, 18);
		
		PLZout = new Label(shlFrWindow, SWT.NONE);
		PLZout.setBounds(264, 240, 75, 21);
		
		ortout = new Label(shlFrWindow, SWT.NONE);
		ortout.setBounds(264, 267, 75, 21);
		
		straﬂeout = new Label(shlFrWindow, SWT.NONE);
		straﬂeout.setBounds(264, 192, 75, 18);
		
		Button btnJson = new Button(shlFrWindow, SWT.NONE);
		btnJson.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//
				//System.out.println(gson.toJson(Person.getListe()));
				//
				try {
					File jsonFile = File.createTempFile("wpfinf-json", ".humptydumpty");
					FileWriter fw = new FileWriter(jsonFile);
					//
					gson.toJson(Person.getListe(), fw);
					//
					fw.flush();
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnJson.setBounds(384, 85, 75, 25);
		btnJson.setText("JSON");
		
		btnLoad = new Button(shlFrWindow, SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				org.eclipse.swt.widgets.FileDialog fdDialog = new org.eclipse.swt.widgets.FileDialog(shlFrWindow, SWT.OPEN);
				//
				fdDialog.setFilterExtensions(new String[] {"*.humptydumpty"});
				fdDialog.setFilterPath("%TEMP%");
				//
				String filename = fdDialog.open();
				//
				System.out.println(filename);
				//
				if (filename != null) {
					try {
						FileReader fr = new FileReader(filename);
						//
						Gson gson = new GsonBuilder().setPrettyPrinting().create();
						//
						Person[] personen = gson.fromJson(fr, Person[].class);
						//
						ArrayList<Person> personenListe =
								new ArrayList<Person>(Arrays.asList(personen));
						//
						System.out.println(personenListe);
						//
						Person.setListe(personenListe);
						//
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			
				
				
			}
		});
		
		btnLoad.setBounds(514, 85, 75, 25);
		btnLoad.setText("LOAD");
		shlFrWindow.setTabList(new Control[]{vornameTF, nachnameTF, StraﬂeTF, HausnummerTF, PLZTF, OrtTF, btnNewButton});

	}
	protected org.eclipse.swt.widgets.FileDialog FileDialog(Shell shlFrWindow2, int open) {
		// TODO Auto-generated method stub
		return null;
	}

	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Label getVornameout() {
		return vornameout;
	}
	public Label getNachnameout() {
		return nachnameout;
	}
	public Label getStraﬂeout() {
		return straﬂeout;
	}
	public Label getHausnummerout() {
		return hausnummerout;
	}
	public Label getPLZout() {
		return PLZout;
	}
	public Label getOrtout() {
		return ortout;
	}
	public Text getStraﬂeTF() {
		return StraﬂeTF;
	}
	public Text getHausnummerTF() {
		return HausnummerTF;
	}
	public Text getPLZTF() {
		return PLZTF;
	}
	public Text getOrtTF() {
		return OrtTF;
	}
}
