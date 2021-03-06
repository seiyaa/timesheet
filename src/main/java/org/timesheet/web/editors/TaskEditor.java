package org.timesheet.web.editors;

import org.timesheet.dao.TaskDao;
import org.timesheet.domain.Task;

import java.beans.PropertyEditorSupport;

/**
 * User: seiyaa
 * Date: 14-1-11
 * Time: 下午3:10
 * Git: https://github.com/seiyaa
 */
public class TaskEditor extends PropertyEditorSupport {
    private TaskDao taskDao;

    public TaskEditor(TaskDao tasdDao) {
        this.taskDao = tasdDao;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        long id = Long.parseLong(text);
        Task task = taskDao.find(id);
        setValue(task);
    }
}
