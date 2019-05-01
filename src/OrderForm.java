
import JavaCourseworkUP918631.*;
import JavaCourseworkUP918631.pizza_attributes.PizzaCrust;
import JavaCourseworkUP918631.pizza_attributes.PizzaSauce;
import JavaCourseworkUP918631.pizza_attributes.PizzaSize;
import JavaCourseworkUP918631.pizza_attributes.PizzaTopping;
import JavaCourseworkUP918631.Order;
import javax.swing.JOptionPane;

public class OrderForm extends javax.swing.JFrame {

    private Order order;

    private void updateInvoice() {
        jTextArea1.setText(order.getInvoice());
    }

    private void updateTotalCost() {
        order_cost_tf.setText("£" + order.getTotalCost());
    }
    
    private void updateEditButton() {
        
        edit_pizza_btn.setEnabled(order.getPizzaCount() > 0);
    }
    
    public Order getOrder(){
        return order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    public void update(){
        updateInvoice();
        updateTotalCost();
        updateEditButton();
    }

    public OrderForm(Order order) {
        
        this.order = order;
        
        initComponents();
        updateTotalCost();
        updateInvoice();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        new_pizza = new javax.swing.JButton();
        edit_pizza_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        order_cost_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        new_pizza.setText("New Pizza");
        new_pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_pizzaActionPerformed(evt);
            }
        });

        edit_pizza_btn.setText("Edit/Delete Pizza");
        edit_pizza_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_pizza_btnActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Total Order Cost:");

        order_cost_tf.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_pizza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edit_pizza_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(order_cost_tf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_pizza)
                    .addComponent(edit_pizza_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(order_cost_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_pizzaActionPerformed
        NewPizzaForm newPizzaDialog = new NewPizzaForm(this);
        
        newPizzaDialog.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_new_pizzaActionPerformed

    private void edit_pizza_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_pizza_btnActionPerformed
        EditPizzaForm editPizzaDialog = new EditPizzaForm(this);
        
        editPizzaDialog.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_edit_pizza_btnActionPerformed

    private static void addExampleOrders(Order order){
        order.addPizza(new Pizza(PizzaSize.MEDIUM, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.EXTRA_CHEESE, PizzaTopping.CHILLI));
        order.addPizza(new Pizza(PizzaSize.MEDIUM, PizzaCrust.STUFFED, PizzaSauce.PESTO, PizzaTopping.OLIVES, PizzaTopping.ONION));
        order.addPizza(new Pizza(PizzaSize.SMALL, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.CHILLI, PizzaTopping.PEPPERONI));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Order order = new Order();
                
                addExampleOrders(order);
                
                new OrderForm(order).setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit_pizza_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton new_pizza;
    private javax.swing.JTextField order_cost_tf;
    // End of variables declaration//GEN-END:variables
}
