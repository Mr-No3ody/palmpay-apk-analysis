package com.alibaba.android.alpha;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class TaskFactory {
    private ITaskCreator mTaskCreator;
    private Map<String, Task> mTasks = new HashMap();

    public TaskFactory(ITaskCreator iTaskCreator) {
        this.mTaskCreator = iTaskCreator;
    }

    public synchronized Task getTask(String str) {
        Task task = this.mTasks.get(str);
        if (task != null) {
            return task;
        }
        Task taskCreateTask = this.mTaskCreator.createTask(str);
        if (taskCreateTask == null) {
            throw new IllegalArgumentException("Create task fail, there is no task corresponding to the task name. Make sure you have create a task instance in TaskCreator.");
        }
        this.mTasks.put(str, taskCreateTask);
        return taskCreateTask;
    }
}
