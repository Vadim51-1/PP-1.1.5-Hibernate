package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
//        UserDao userDao = new UserDaoJDBCImpl();
//        userDao.createUsersTable();
//        userDao.saveUser("Алёна", "Шиленкова", (byte) 4);
//        userDao.saveUser("Матвей", "Шиленков", (byte) 2);
//        userDao.getAllUsers();
//        userDao.cleanUsersTable();
//        userDao.dropUsersTable();
        UserDao userDao1 = new UserDaoHibernateImpl();
        userDao1.createUsersTable();
        userDao1.saveUser("Вадим", "Шd", (byte) 86);
        userDao1.saveUser("Алена", "Шиленкова", (byte) 6);
        userDao1.saveUser("Матвей", "Шиленков", (byte) 2);
        userDao1.removeUserById(2);
        userDao1.getAllUsers();
        userDao1.cleanUsersTable();
        userDao1.dropUsersTable();

    }
}