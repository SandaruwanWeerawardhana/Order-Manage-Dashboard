package Controller;

import DBconnection.DBConnection;
import Model.Order;
import Model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {

    public static boolean placeOrder(Order order) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("Insert into Orders values(?,?,?)");
        stm.setObject(1, order.getId());
        stm.setObject(2, order.getDate());
        stm.setObject(3, order.getCustomerId());
        boolean isAddedOrder = stm.executeUpdate() > 0;
        if (isAddedOrder) {
            System.out.println("Placed oder");
            return true;
        }
        return false;
    }

    public static boolean addOrderDetail(ArrayList<OrderDetail> orderDetailList) throws ClassNotFoundException, SQLException {
        for (OrderDetail orderDetail : orderDetailList) {
            boolean isAdded = addOrderDetail(orderDetail);
            if (!isAdded) {
                return false;
            }
        }
        return !orderDetailList.isEmpty();
    }

    public static boolean addOrderDetail(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Insert into orderdetail values(?,?,?,?)");
        stm.setObject(1, orderDetail.getOderId());
        stm.setObject(2, orderDetail.getItemCode());
        stm.setObject(3, orderDetail.getQty());
        stm.setObject(4, orderDetail.getUnitPrice());
        boolean isAddedOrderDetail = stm.executeUpdate() > 0;

        if (isAddedOrderDetail) {
            System.out.println("Placed order Detail");
            return true;
        }
        return false;
    }

    public static boolean updateStock(ArrayList<OrderDetail> orderDetails) throws ClassNotFoundException, SQLException {
        for (OrderDetail orderDetail : orderDetails) {
            boolean updateStock = updateStock(orderDetail);
            if (!updateStock) {
                return false;
            }
        }
        return !orderDetails.isEmpty(); //Not empty
    }

    public static boolean updateStock(OrderDetail orderDetail) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("Update Item set qtyOnHand=qtyOnHand-? where code=?");
        stm.setObject(1, orderDetail.getQty());
        stm.setObject(2, orderDetail.getItemCode());
        boolean isUpdate = stm.executeUpdate() > 0;

        if (isUpdate) {
            System.out.println("Updeted");
            return true;
        }
        return false;
    }
}
