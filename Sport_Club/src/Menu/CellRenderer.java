
package Menu;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Vitalik
 */
public class CellRenderer implements TableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,boolean hasFocus,int row, int column) {
            ImageIcon imageicon = new ImageIcon(new ImageIcon(value.toString()).getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT));
            return new JLabel(imageicon);
        }
    }
