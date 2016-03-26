package com.todolist.app.DAO;

import com.todolist.app.common.Task;

/**
 * Created by Hila on 3/6/16.
 */
public interface IDataAccess {
    public int insertTask(Task task);
    public int updateTask(Task task);
    public int removeTask(int idTask);
    public void insertUser (String user);
    public void updateUser (String user);
    public void removeUser (String user);

}
