package ir.hajitsu.proxy.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;

public class TransactionProxy implements InvocationHandler {
    private DepartmentDAO departmentDAO;

    public TransactionProxy(DepartmentDAO departmentDAO) {
        this.departmentDAO = departmentDAO;
    }

    public static DepartmentDAO createTransaction(DepartmentDAO dao) {
        return (DepartmentDAO) Proxy.newProxyInstance(dao.getClass().getClassLoader(),
                dao.getClass().getInterfaces(),
                new TransactionProxy(dao)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(departmentDAO, args);
        DBConnection dbConnection = departmentDAO.getDBConnection();
        Connection connection = dbConnection.getConnection();
        connection.commit();
        return invoke;
    }
}
