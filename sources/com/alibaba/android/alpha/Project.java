package com.alibaba.android.alpha;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Project extends Task implements OnProjectExecuteListener {
    private static final String DEFAULT_NAME = "AlphaProject";
    private List<OnProjectExecuteListener> mExecuteListeners;
    private h mFinishTask;
    private OnGetMonitorRecordCallback mOnGetMonitorRecordCallback;
    private f mProjectExecuteMonitor;
    private Task mStartTask;

    public Project() {
        super(DEFAULT_NAME);
        this.mExecuteListeners = new ArrayList();
    }

    public void addOnProjectExecuteListener(OnProjectExecuteListener onProjectExecuteListener) {
        this.mExecuteListeners.add(onProjectExecuteListener);
    }

    @Override // com.alibaba.android.alpha.Task
    public void addOnTaskFinishListener(Task.OnTaskFinishListener onTaskFinishListener) {
        this.mFinishTask.addOnTaskFinishListener(new g(this, onTaskFinishListener));
    }

    @Override // com.alibaba.android.alpha.Task
    public synchronized void addSuccessor(Task task) {
        this.mFinishTask.addSuccessor(task);
    }

    @Override // com.alibaba.android.alpha.Task
    public int getCurrentState() {
        if (this.mStartTask.getCurrentState() == 0) {
            return 0;
        }
        return this.mFinishTask.getCurrentState() == 2 ? 2 : 1;
    }

    @Override // com.alibaba.android.alpha.Task
    public boolean isFinished() {
        return getCurrentState() == 2;
    }

    @Override // com.alibaba.android.alpha.Task
    public boolean isRunning() {
        return getCurrentState() == 1;
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public void onProjectFinish() {
        HashMap map;
        f fVar = this.mProjectExecuteMonitor;
        fVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - fVar.f20342b;
        fVar.f20343c = jCurrentTimeMillis;
        AlphaLog.d(AlphaLog.GLOBAL_TAG, "tm start up cost time: %s ms", Long.valueOf(jCurrentTimeMillis));
        recordTime(this.mProjectExecuteMonitor.f20343c);
        List<OnProjectExecuteListener> list = this.mExecuteListeners;
        if (list != null && !list.isEmpty()) {
            Iterator<OnProjectExecuteListener> it = this.mExecuteListeners.iterator();
            while (it.hasNext()) {
                it.next().onProjectFinish();
            }
        }
        OnGetMonitorRecordCallback onGetMonitorRecordCallback = this.mOnGetMonitorRecordCallback;
        if (onGetMonitorRecordCallback != null) {
            onGetMonitorRecordCallback.onGetProjectExecuteTime(this.mProjectExecuteMonitor.f20343c);
            OnGetMonitorRecordCallback onGetMonitorRecordCallback2 = this.mOnGetMonitorRecordCallback;
            f fVar2 = this.mProjectExecuteMonitor;
            synchronized (fVar2) {
                map = fVar2.f20341a;
            }
            onGetMonitorRecordCallback2.onGetTaskExecuteRecord(map);
        }
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public void onProjectStart() {
        f fVar = this.mProjectExecuteMonitor;
        fVar.getClass();
        fVar.f20342b = System.currentTimeMillis();
        List<OnProjectExecuteListener> list = this.mExecuteListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<OnProjectExecuteListener> it = this.mExecuteListeners.iterator();
        while (it.hasNext()) {
            it.next().onProjectStart();
        }
    }

    @Override // com.alibaba.android.alpha.OnProjectExecuteListener
    public void onTaskFinish(String str) {
        List<OnProjectExecuteListener> list = this.mExecuteListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<OnProjectExecuteListener> it = this.mExecuteListeners.iterator();
        while (it.hasNext()) {
            it.next().onTaskFinish(str);
        }
    }

    @Override // com.alibaba.android.alpha.Task
    public void recycle() {
        super.recycle();
        this.mExecuteListeners.clear();
    }

    @Override // com.alibaba.android.alpha.Task
    public void run() {
    }

    public void setFinishTask(h hVar) {
        this.mFinishTask = hVar;
    }

    public void setOnGetMonitorRecordCallback(OnGetMonitorRecordCallback onGetMonitorRecordCallback) {
        this.mOnGetMonitorRecordCallback = onGetMonitorRecordCallback;
    }

    public void setProjectExecuteMonitor(f fVar) {
        this.mProjectExecuteMonitor = fVar;
    }

    public void setStartTask(Task task) {
        this.mStartTask = task;
    }

    @Override // com.alibaba.android.alpha.Task
    public void start() {
        this.mStartTask.start();
    }

    public Project(String str) {
        super(str);
        this.mExecuteListeners = new ArrayList();
    }

    public static class Builder {
        private Task mCacheTask;
        private h mFinishTask;
        private boolean mIsSetPosition;
        private f mMonitor;
        private Project mProject;
        private h mStartTask;
        private TaskFactory mTaskFactory;

        public Builder() {
            init();
        }

        private void addToRootIfNeed() {
            Task task;
            if (this.mIsSetPosition || (task = this.mCacheTask) == null) {
                return;
            }
            this.mStartTask.addSuccessor(task);
        }

        private void init() {
            this.mCacheTask = null;
            this.mIsSetPosition = true;
            this.mProject = new Project();
            h hVar = new h(false, "==AlphaDefaultFinishTask==");
            this.mFinishTask = hVar;
            hVar.f20348b = this.mProject;
            h hVar2 = new h(true, "==AlphaDefaultStartTask==");
            this.mStartTask = hVar2;
            Project project = this.mProject;
            hVar2.f20348b = project;
            project.setStartTask(hVar2);
            this.mProject.setFinishTask(this.mFinishTask);
            f fVar = new f();
            fVar.f20341a = new HashMap();
            this.mMonitor = fVar;
            this.mProject.setProjectExecuteMonitor(fVar);
        }

        public Builder add(String str) {
            TaskFactory taskFactory = this.mTaskFactory;
            if (taskFactory == null) {
                throw new IllegalAccessError("You should set a ITaskCreator with withTaskCreator(), and then you can call add() and after() with task name.");
            }
            add(taskFactory.getTask(str));
            return this;
        }

        public Builder after(String str) {
            TaskFactory taskFactory = this.mTaskFactory;
            if (taskFactory == null) {
                throw new IllegalAccessError("You should set a ITaskCreator with withTaskCreator(), and then you can call add() and after() with task name.");
            }
            after(taskFactory.getTask(str));
            return this;
        }

        public Project create() {
            addToRootIfNeed();
            Project project = this.mProject;
            init();
            return project;
        }

        public Builder setOnGetMonitorRecordCallback(OnGetMonitorRecordCallback onGetMonitorRecordCallback) {
            this.mProject.setOnGetMonitorRecordCallback(onGetMonitorRecordCallback);
            return this;
        }

        public Builder setOnProjectExecuteListener(OnProjectExecuteListener onProjectExecuteListener) {
            this.mProject.addOnProjectExecuteListener(onProjectExecuteListener);
            return this;
        }

        public Builder setProjectName(String str) {
            this.mProject.setName(str);
            return this;
        }

        public Builder withTaskCreator(ITaskCreator iTaskCreator) {
            this.mTaskFactory = new TaskFactory(iTaskCreator);
            return this;
        }

        public Builder add(Task task) {
            addToRootIfNeed();
            this.mCacheTask = task;
            task.setExecuteMonitor(this.mMonitor);
            this.mIsSetPosition = false;
            Task task2 = this.mCacheTask;
            Project project = this.mProject;
            i iVar = new i();
            iVar.f20349a = project;
            task2.addOnTaskFinishListener(iVar);
            this.mCacheTask.addSuccessor(this.mFinishTask);
            return this;
        }

        public Builder after(String... strArr) {
            if (this.mTaskFactory != null) {
                Task[] taskArr = new Task[strArr.length];
                int length = strArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    taskArr[i7] = this.mTaskFactory.getTask(strArr[i7]);
                }
                after(taskArr);
                return this;
            }
            throw new IllegalAccessError("You should set a ITaskCreator with withTaskCreator(), and then you can call add() and after() with task name.");
        }

        public Builder after(Task task) {
            task.addSuccessor(this.mCacheTask);
            this.mFinishTask.removePredecessor(task);
            this.mIsSetPosition = true;
            return this;
        }

        public Builder after(Task... taskArr) {
            for (Task task : taskArr) {
                task.addSuccessor(this.mCacheTask);
                this.mFinishTask.removePredecessor(task);
            }
            this.mIsSetPosition = true;
            return this;
        }
    }
}
