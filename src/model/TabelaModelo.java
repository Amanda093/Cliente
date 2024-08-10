package model;

import javax.swing.table.AbstractTableModel;

public class TabelaModelo extends AbstractTableModel{
    private static final String[] columns = {
        "Cod", "Nome", "RG", "Email", "Telefone", "Endereco" 
    };
            
    @Override
    public int getRowCount() {
        // TODO
        return 0;
    }
    
    @Override 
    public int getColumnCount() {
        // TODO
        return 0;
    }
    
    @Override 
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO
        return null;
    }
}
