package com.marcos.vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
 



public class MiTable extends JFrame {
	private JTable table;
	private MiModeloTabla modelo;
 
	public MiTable() {
		// TODO Auto-generated constructor stub
 
		table = new JTable();
		JScrollPane scroll = new JScrollPane(table);
 
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(scroll, BorderLayout.CENTER);
 
		JButton btn = new JButton("Cargar");
		btn.addActionListener(new ActionListener() {
 
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
 
				//Aqui Carga los datos
				ExampleJTable.MiModeloDatos datos;
				ArrayList<MiModeloDatos> data = new ArrayList<ExampleJTable.MiModeloDatos>();
 
				datos = new MiModeloDatos();
				datos.campo = "Campo1";
				datos.tipo = "Tipo1";
				data.add(datos);
 
				datos = new MiModeloDatos();
				datos.campo = "Campo2";
				datos.tipo = "Tipo2";
				data.add(datos);
 
				datos = new MiModeloDatos();
				datos.campo = "Campo3";
				datos.tipo = "Tipo3";
				data.add(datos);
 
 
				modelo = new MiModeloTabla(data);
				table.setModel(modelo);
 
 
			}
		});
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(btn);
		getContentPane().add(panel, BorderLayout.SOUTH);
 
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Example");
		setVisible(true);
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExampleJTable();
 
	}
 
 
 
 
 
 
    class MiModeloDatos {
    	String campo, tipo;
    }
 
	/**
	 *
	 * @author Juan
	 */
	class MiModeloTabla extends  AbstractTableModel {
 
	final Class tiposColumnas[] = {String.class, String.class};
    final String nombreColumnas[] = {"Campo", "Tipo"};
    private  ArrayList<ExampleJTable.MiModeloDatos> data;
 
    public MiModeloTabla(ArrayList<ExampleJTable.MiModeloDatos> data) {
        this.data = data;
 
    }
 
 
    @Override
    public int getColumnCount() {
         return nombreColumnas.length;
    }
 
    @Override
    public int getRowCount() {
        return data.size();
    }
    //retornamos el elemento indicado
    @Override
    public String getColumnName(int col) {
        return nombreColumnas[col];
    }
     //y lo mismo para las celdas
    @Override
    public Object getValueAt(int row, int col) {
    	//System.out.println("Row = " + row + " Col = " + col);
 
    	ExampleJTable.MiModeloDatos datos = (ExampleJTable.MiModeloDatos) data.get(row);
 
    	switch(col) {
    		case 0 :
    			return datos.campo;
 
    		case 1 :
    			return datos.tipo;
 
    		default :
    			return "";
    	}
    }
     /*
    * Este metodo sirve para determinar el editor predeterminado
    * para cada columna de celdas
    */
    @Override
    public Class getColumnClass(int c) {
        return tiposColumnas[c];
    }
     /*
    * No tienes que implementar este m»todo a menos que
    * las celdas de tu tabla sean Editables
    */
    @Override
    public boolean isCellEditable(int row, int col) {
        return true;
    }
     /*
    * No tienes que implementar este m»todo a menos que
    * los datos de tu tabla cambien
    */
    @Override
    public void setValueAt(Object value, int row, int col) {
    	ExampleJTable.MiModeloDatos datos = (ExampleJTable.MiModeloDatos) data.get(row);
    	switch(col) {
		case 0 :
			datos.campo = value.toString();
			this.fireTableCellUpdated(row, col);
			break;
 
		case 1 :
			datos.tipo = value.toString();
			this.fireTableCellUpdated(row, col);
			break;
 
	}
    }
}
 
}