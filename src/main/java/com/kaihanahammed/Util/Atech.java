package com.kaihanahammed.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaihan_Ahammed
 * @version 1
 */
public class Atech {

    public int version = 1;

    public String dblink = "";
    public String username = "kaihanahammed";
    public String password = "kaihanahammed";

    private Mydb mydb;

    public Atech() {
        mydb = new Mydb(dblink, username, password);
    }

    
    
    public User getuserbyid(String id) {
        return this.getuser(Atechdblabel.user_user_id, id);
    }

    
    
    public User getuserbyemail(String email) {
        return this.getuser(Atechdblabel.user_user_id, email);
    }

    
    
    public User getuser(String label, String value) {
        String sql = "SELECT * FROM Profile\n" + "WHERE " + label + "=\'" + value + "\';";

        User user = new User();
        ResultSet profileresultset;

        profileresultset = mydb.runsql(sql);

        try {
            user.user_id = profileresultset.getString(Atechdblabel.user_user_id);
            user.user_name = profileresultset.getString(Atechdblabel.user_user_name);
            user.password = profileresultset.getString(Atechdblabel.user_password);
            user.mobile_number = profileresultset.getString(Atechdblabel.user_mobile_number);
            user.email = profileresultset.getString(Atechdblabel.user_email);
            user.date_of_birth = profileresultset.getString(Atechdblabel.user_date_of_birth);
            user.gender = profileresultset.getString(Atechdblabel.user_gender);
            user.present_address = profileresultset.getString(Atechdblabel.user_present_address);
            user.permanent_address = profileresultset.getString(Atechdblabel.user_permanent_address);
            user.nationality = profileresultset.getString(Atechdblabel.user_nationality);
            user.user_image_link = profileresultset.getString(Atechdblabel.user_user_image_link);
            user.profile_status = profileresultset.getString(Atechdblabel.user_profile_status);
        } catch (SQLException ex) {
            Logger.getLogger(Atech.class.getName()).log(Level.SEVERE, null, ex);
        }

        return user;
    }

    
    
    public Product getproduct(String label, String value) {
        String sql = "SELECT * FROM Profile\n" + "WHERE " + label + "=\'" + value + "\';";

        Product product = new Product();
        ResultSet profileresultset;

        profileresultset = mydb.runsql(sql);

        try {
            product.product_id = profileresultset.getString(Atechdblabel.product_product_id);
            product.name = profileresultset.getString(Atechdblabel.product_name);
            product.group = profileresultset.getString(Atechdblabel.product_group);
            product.sub_group = profileresultset.getString(Atechdblabel.product_sub_group);
            product.company_name = profileresultset.getString(Atechdblabel.product_company_name);
            product.product_image_link = profileresultset.getString(Atechdblabel.product_product_image_link);
            product.supplier_id = profileresultset.getString(Atechdblabel.product_supplier_id);
            product.product_color = profileresultset.getString(Atechdblabel.product_product_color);
            product.price = Integer.parseInt(profileresultset.getString(Atechdblabel.product_price));
            product.quantity = Integer.parseInt(profileresultset.getString(Atechdblabel.product_quantity));
            product.delivery_charge = Integer.parseInt(profileresultset.getString(Atechdblabel.product_delivery_charge));
            product.warranty_in_month = Integer.parseInt(profileresultset.getString(Atechdblabel.product_warranty_in_month));
            product.gurrantte_in_month = Integer.parseInt(profileresultset.getString(Atechdblabel.product_gurrantte_in_month));
        } catch (SQLException ex) {
            Logger.getLogger(Atech.class.getName()).log(Level.SEVERE, null, ex);
        }

        return product;
    }
    
    
    
    public Order getorder(String label, String value) {
        String sql = "SELECT * FROM Profile\n" + "WHERE " + label + "=\'" + value + "\';";

        Order order = new Order();
        ResultSet profileresultset;

        profileresultset = mydb.runsql(sql);

        try {
            order.order_id = profileresultset.getString(Atechdblabel.order_order_id);
            order.user_id = profileresultset.getString(Atechdblabel.order_user_id);
            order.product_id = profileresultset.getString(Atechdblabel.order_product_id);
            order.order_date = profileresultset.getString(Atechdblabel.order_order_date);
            order.order_color = profileresultset.getString(Atechdblabel.order_order_color);
            order.payment_status = profileresultset.getString(Atechdblabel.order_payment_status);
            order.payment_medium = profileresultset.getString(Atechdblabel.order_payment_medium);
            order.payment_info = profileresultset.getString(Atechdblabel.order_payment_info);
            order.delivery_address = profileresultset.getString(Atechdblabel.order_delivery_address);
            order.delivery_employee = profileresultset.getString(Atechdblabel.order_delivery_employee);
            order.order_status = profileresultset.getString(Atechdblabel.order_order_status);
            order.order_receiver = profileresultset.getString(Atechdblabel.order_order_receiver);
            order.is_refunded = profileresultset.getString(Atechdblabel.order_is_refunded);
            order.is_deliveried = profileresultset.getString(Atechdblabel.order_is_deliveried);
            order.is_ready = profileresultset.getString(Atechdblabel.order_is_ready);
            order.is_confirmed = profileresultset.getString(Atechdblabel.order_is_confirmed);
            order.delivery_charge = Integer.parseInt(profileresultset.getString(Atechdblabel.order_delivery_charge));
            order.order_amount = Integer.parseInt(profileresultset.getString(Atechdblabel.order_order_amount));
        } catch (SQLException ex) {
            Logger.getLogger(Atech.class.getName()).log(Level.SEVERE, null, ex);
        }

        return order;
    }
    
    
    
    public Employee getemployee(String label, String value) {
        String sql = "SELECT * FROM Profile\n" + "WHERE " + label + "=\'" + value + "\';";

        Employee employee = new Employee();
        ResultSet profileresultset;

        profileresultset = mydb.runsql(sql);

        try {
            employee.user_id = profileresultset.getString(Atechdblabel.employee_user_id);
            employee.user_name = profileresultset.getString(Atechdblabel.employee_user_name);
            employee.password = profileresultset.getString(Atechdblabel.employee_password);
            employee.mobile_number = profileresultset.getString(Atechdblabel.employee_mobile_number);
            employee.email = profileresultset.getString(Atechdblabel.employee_email);
            employee.date_of_birth = profileresultset.getString(Atechdblabel.employee_date_of_birth);
            employee.gender = profileresultset.getString(Atechdblabel.employee_gender);
            employee.present_address = profileresultset.getString(Atechdblabel.employee_present_address);
            employee.permanent_address = profileresultset.getString(Atechdblabel.employee_permanent_address);
            employee.nationality = profileresultset.getString(Atechdblabel.employee_nationality);
            employee.user_image_link = profileresultset.getString(Atechdblabel.employee_user_image);
            employee.profile_status = profileresultset.getString(Atechdblabel.employee_profile_status);
            
            employee.branch_name = profileresultset.getString(Atechdblabel.employee_branch_name);
            employee.employer_name = profileresultset.getString(Atechdblabel.employee_employer_name);
            employee.fathers_name = profileresultset.getString(Atechdblabel.employee_fathers_name);
            employee.mothers_name = profileresultset.getString(Atechdblabel.employee_mothers_name);
            employee.id_type = profileresultset.getString(Atechdblabel.employee_id_type);
            employee.id = profileresultset.getString(Atechdblabel.employee_id);
            employee.blood_group = profileresultset.getString(Atechdblabel.employee_blood_group);
            employee.emergency_contact = profileresultset.getString(Atechdblabel.employee_emergency_contact);
            employee.bank_name = profileresultset.getString(Atechdblabel.employee_bank_name);
            employee.bank_account_number = profileresultset.getString(Atechdblabel.employee_bank_account_number);
            employee.employee_type = profileresultset.getString(Atechdblabel.employee_employee_type);
        } catch (SQLException ex) {
            Logger.getLogger(Atech.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employee;
    }
    
    
    
    public void setuser(User user) {
        String sql = "INSERT INTO "
                + Atechdblabel.user_table_name
                + " (" + Atechdblabel.user_user_id
                + ", " + Atechdblabel.user_user_name
                + ", " + Atechdblabel.user_password
                + ", " + Atechdblabel.user_mobile_number
                + ", " + Atechdblabel.user_email
                + ", " + Atechdblabel.user_date_of_birth
                + ", " + Atechdblabel.user_gender
                + ", " + Atechdblabel.user_present_address
                + ", " + Atechdblabel.user_permanent_address
                + ", " + Atechdblabel.user_nationality
                + ", " + Atechdblabel.user_user_image_link
                + ", " + Atechdblabel.user_profile_status
                + ")\n" 
                + "VALUES (" + user.user_id
                + ", " + user.user_name
                + ", " + user.password
                + ", " + user.mobile_number
                + ", " + user.email
                + ", " + user.date_of_birth
                + ", " + user.gender
                + ", " + user.present_address
                + ", " + user.permanent_address
                + ", " + user.nationality
                + ", " + user.user_image_link
                + ", " + user.profile_status
                + ");";
        mydb.runsql(sql);
    }

    
    
    public void setproduct(Product product) {
        String sql = "INSERT INTO "
                + Atechdblabel.product_table_name
                + " (" + Atechdblabel.product_product_id
                + ", " + Atechdblabel.product_name
                + ", " + Atechdblabel.product_group
                + ", " + Atechdblabel.product_sub_group
                + ", " + Atechdblabel.product_company_name
                + ", " + Atechdblabel.product_product_image_link
                + ", " + Atechdblabel.product_supplier_id
                + ", " + Atechdblabel.product_product_color
                + ", " + Atechdblabel.product_price
                + ", " + Atechdblabel.product_quantity
                + ", " + Atechdblabel.product_delivery_charge
                + ", " + Atechdblabel.product_warranty_in_month
                + ", " + Atechdblabel.product_gurrantte_in_month
                + ")\n" 
                + "VALUES"
                + " (" + product.product_id
                + ", " + product.name
                + ", " + product.group
                + ", " + product.sub_group
                + ", " + product.company_name
                + ", " + product.product_image_link
                + ", " + product.supplier_id
                + ", " + product.product_color
                + ", " + product.price
                + ", " + product.quantity
                + ", " + product.delivery_charge
                + ", " + product.warranty_in_month
                + ", " + product.gurrantte_in_month
                + ");";
        mydb.runsql(sql);
    }
    
    
    
    public void setorder(Order order) {
        String sql = "INSERT INTO "
                + Atechdblabel.product_table_name
                + " (" + Atechdblabel.order_order_id
                + ", " + Atechdblabel.order_user_id
                + ", " + Atechdblabel.order_product_id
                + ", " + Atechdblabel.order_order_date
                + ", " + Atechdblabel.order_order_color
                + ", " + Atechdblabel.order_payment_status
                + ", " + Atechdblabel.order_payment_medium
                + ", " + Atechdblabel.order_payment_info
                + ", " + Atechdblabel.order_delivery_address
                + ", " + Atechdblabel.order_delivery_employee
                + ", " + Atechdblabel.order_order_status
                + ", " + Atechdblabel.order_order_receiver
                + ", " + Atechdblabel.order_is_refunded
                + ", " + Atechdblabel.order_is_deliveried
                + ", " + Atechdblabel.order_is_ready
                + ", " + Atechdblabel.order_is_confirmed
                + ", " + Atechdblabel.order_delivery_charge
                + ", " + Atechdblabel.order_order_amount
                + ")\n" 
                + "VALUES"
                + " (" + order.order_id
                + ", " + order.user_id
                + ", " + order.product_id
                + ", " + order.order_date
                + ", " + order.order_color
                + ", " + order.payment_status
                + ", " + order.payment_medium
                + ", " + order.payment_info
                + ", " + order.delivery_address
                + ", " + order.delivery_employee
                + ", " + order.order_status
                + ", " + order.order_receiver
                + ", " + order.is_refunded
                + ", " + order.is_deliveried
                + ", " + order.is_ready
                + ", " + order.is_confirmed
                + ", " + order.delivery_charge
                + ", " + order.order_amount
                + ");";
        mydb.runsql(sql);
    }
    
    
    
    public void setemployee(Employee employee) {
        String sql = "INSERT INTO "
                + Atechdblabel.product_table_name
                + " (" + Atechdblabel.employee_user_id
                + ", " + Atechdblabel.employee_user_name
                + ", " + Atechdblabel.employee_password
                + ", " + Atechdblabel.employee_mobile_number
                + ", " + Atechdblabel.employee_email
                + ", " + Atechdblabel.employee_date_of_birth
                + ", " + Atechdblabel.employee_gender
                + ", " + Atechdblabel.employee_present_address
                + ", " + Atechdblabel.employee_permanent_address
                + ", " + Atechdblabel.employee_nationality
                + ", " + Atechdblabel.employee_user_image
                + ", " + Atechdblabel.employee_profile_status
                
                + ", " + Atechdblabel.employee_branch_name
                + ", " + Atechdblabel.employee_employer_name
                + ", " + Atechdblabel.employee_fathers_name
                + ", " + Atechdblabel.employee_mothers_name
                + ", " + Atechdblabel.employee_id_type
                + ", " + Atechdblabel.employee_id
                + ", " + Atechdblabel.employee_blood_group
                + ", " + Atechdblabel.employee_emergency_contact
                + ", " + Atechdblabel.employee_bank_name
                + ", " + Atechdblabel.employee_bank_account_number
                + ", " + Atechdblabel.employee_employee_type
                + ")\n" 
                + "VALUES"
                + " (" + employee.user_id
                + ", " + employee.user_name
                + ", " + employee.password
                + ", " + employee.mobile_number
                + ", " + employee.email
                + ", " + employee.date_of_birth
                + ", " + employee.gender
                + ", " + employee.present_address
                + ", " + employee.permanent_address
                + ", " + employee.nationality
                + ", " + employee.user_image_link
                + ", " + employee.profile_status
                
                + ", " + employee.branch_name
                + ", " + employee.employer_name
                + ", " + employee.fathers_name
                + ", " + employee.mothers_name
                + ", " + employee.id_type
                + ", " + employee.id
                + ", " + employee.blood_group
                + ", " + employee.emergency_contact
                + ", " + employee.bank_name
                + ", " + employee.bank_account_number
                + ", " + employee.employee_type
                + ");";
        mydb.runsql(sql);
    }
}
