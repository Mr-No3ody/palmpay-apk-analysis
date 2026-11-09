package com.alibaba.android.alpha;

import C0.G;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class AlphaManager {
    public static final int ALL_PROCESS_MODE = 3;
    public static final int MAIN_PROCESS_MODE = 1;
    public static final int SECONDARY_PROCESS_MODE = 2;
    private static AlphaManager sInstance;
    private Context mContext;
    private Task mProjectForCurrentProcess;
    private static byte[] sExtraTaskListLock = new byte[0];
    private static byte[] sExtraTaskMapLock = new byte[0];
    private static byte[] sWaitFinishLock = new byte[0];
    private SparseArray<Task> mProjectArray = new SparseArray<>();
    private volatile boolean mIsStartupFinished = false;
    private OnProjectExecuteListener mProjectExecuteListener = new b(this);
    private List<String> mFinishedTask = new ArrayList();
    private ListMultiMap<String, Task> mExtraTaskMap = new ListMultiMap<>();
    private List<Task> mExtraTaskList = new ArrayList();

    private AlphaManager(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Context is null. ");
        }
        this.mContext = context;
    }

    private void addListeners(Project project) {
        project.addOnTaskFinishListener(new a(this));
        project.addOnProjectExecuteListener(this.mProjectExecuteListener);
    }

    private void addProjectBindTask(Task task) {
        synchronized (sExtraTaskListLock) {
            this.mExtraTaskList.add(task);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeProjectBindRunnables() {
        AlphaUtils.sort(this.mExtraTaskList);
        Iterator<Task> it = this.mExtraTaskList.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        this.mExtraTaskList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void executeTaskBindRunnable(String str) {
        List<Task> list = this.mExtraTaskMap.get(str);
        AlphaUtils.sort(list);
        Iterator<Task> it = list.iterator();
        while (it.hasNext()) {
            it.next().start();
        }
        this.mExtraTaskMap.remove(str);
    }

    public static synchronized AlphaManager getInstance(Context context) {
        try {
            if (sInstance == null) {
                sInstance = new AlphaManager(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recycle() {
        this.mProjectForCurrentProcess = null;
        this.mProjectArray.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseWaitFinishLock() {
        synchronized (sWaitFinishLock) {
            sWaitFinishLock.notifyAll();
        }
    }

    public void addProject(Task task) {
        addProject(task, 3);
    }

    public void addProjectsViaFile(InputStream inputStream) {
        ArrayList<ConfigParser$ProjectInfo> arrayList = null;
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            xmlPullParserNewPullParser.setInput(inputStream, null);
            xmlPullParserNewPullParser.nextTag();
            ArrayList arrayListB = e.b(xmlPullParserNewPullParser);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList2.add(e.a((c) it.next()));
            }
            arrayList = arrayList2;
        } catch (FileNotFoundException e10) {
            AlphaLog.w(e10);
        } catch (IOException e11) {
            AlphaLog.w(e11);
        } catch (XmlPullParserException e12) {
            AlphaLog.w(e12);
        }
        if (arrayList == null) {
            throw new RuntimeException("Parse alpha config file fail.");
        }
        for (ConfigParser$ProjectInfo configParser$ProjectInfo : arrayList) {
            if (TextUtils.isEmpty(configParser$ProjectInfo.processName)) {
                addProject(configParser$ProjectInfo.project, configParser$ProjectInfo.mode);
            } else {
                addProject(configParser$ProjectInfo.project, configParser$ProjectInfo.processName);
            }
        }
    }

    public void executeAfterStartup(Task task) {
        executeAfterStartup(task, 3);
    }

    public void executeAfterTask(Task task, String str) {
        executeAfterTask(task, str, 3);
    }

    public boolean isStartupFinished() {
        return this.mIsStartupFinished;
    }

    public void start() {
        Project project;
        Task task = this.mProjectForCurrentProcess;
        if (task != null) {
            project = (Project) task;
        } else if (AlphaUtils.isInMainProcess(this.mContext) && this.mProjectArray.indexOfKey(1) >= 0) {
            project = (Project) this.mProjectArray.get(1);
        } else if (AlphaUtils.isInMainProcess(this.mContext) || this.mProjectArray.indexOfKey(2) < 0) {
            project = this.mProjectArray.indexOfKey(3) >= 0 ? (Project) this.mProjectArray.get(3) : null;
        } else {
            project = (Project) this.mProjectArray.get(2);
        }
        if (project == null) {
            AlphaLog.e(AlphaLog.GLOBAL_TAG, "No startup project for current process.");
        } else {
            addListeners(project);
            project.start();
        }
    }

    public void waitUntilFinish() {
        synchronized (sWaitFinishLock) {
            while (!this.mIsStartupFinished) {
                try {
                    sWaitFinishLock.wait();
                } catch (InterruptedException e10) {
                    AlphaLog.w(e10);
                }
            }
        }
    }

    public void addProject(Task task, String str) {
        if (AlphaUtils.isMatchProcess(this.mContext, str)) {
            this.mProjectForCurrentProcess = task;
        }
    }

    public void executeAfterStartup(Task task, int i7) {
        executeAfterStartup(task, i7, 0);
    }

    public void executeAfterTask(Task task, String str, int i7, int i10) {
        if (AlphaUtils.isMatchMode(this.mContext, i7)) {
            synchronized (sExtraTaskMapLock) {
                try {
                    if (isStartupFinished() || this.mFinishedTask.contains(str)) {
                        task.start();
                    } else {
                        task.setExecutePriority(i10);
                        this.mExtraTaskMap.put(str, task);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void executeAfterStartup(Task task, int i7, int i10) {
        if (AlphaUtils.isMatchMode(this.mContext, i7)) {
            if (isStartupFinished()) {
                task.start();
            } else {
                task.setExecutePriority(i10);
                addProjectBindTask(task);
            }
        }
    }

    public void addProject(Task task, int i7) {
        if (task == null) {
            throw new IllegalArgumentException("project is null");
        }
        if (i7 >= 1 && i7 <= 3) {
            if (AlphaUtils.isMatchMode(this.mContext, i7)) {
                this.mProjectArray.put(i7, task);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(G.m(i7, "No such mode: "));
    }

    public boolean waitUntilFinish(long j6) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (sWaitFinishLock) {
            jCurrentTimeMillis = 0;
            while (!this.mIsStartupFinished && jCurrentTimeMillis < j6) {
                try {
                    sWaitFinishLock.wait(j6);
                } catch (InterruptedException e10) {
                    AlphaLog.w(e10);
                }
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
            }
        }
        return jCurrentTimeMillis > j6;
    }

    public void executeAfterStartup(Task task, String str, int i7) {
        if (AlphaUtils.isMatchProcess(this.mContext, str)) {
            if (isStartupFinished()) {
                task.start();
            } else {
                task.setExecutePriority(i7);
                addProjectBindTask(task);
            }
        }
    }

    public void executeAfterTask(Task task, String str, int i7) {
        executeAfterTask(task, str, i7, 0);
    }

    public void executeAfterTask(Task task, String str, String str2, int i7) {
        if (AlphaUtils.isMatchProcess(this.mContext, str2)) {
            synchronized (sExtraTaskMapLock) {
                try {
                    if (!isStartupFinished() && !this.mFinishedTask.contains(str)) {
                        task.setExecutePriority(i7);
                        this.mExtraTaskMap.put(str, task);
                    } else {
                        task.start();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void executeAfterStartup(Task task, String str) {
        executeAfterStartup(task, str, 0);
    }

    public void executeAfterTask(Task task, String str, String str2) {
        executeAfterTask(task, str, str2, 0);
    }

    public void addProjectsViaFile(String str) throws Throwable {
        addProjectsViaFile(new File(str));
    }

    public void addProjectsViaFile(File file) throws Throwable {
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        addProjectsViaFile(fileInputStream2);
                        AlphaUtils.closeSafely(fileInputStream2);
                    } catch (IOException e10) {
                        e = e10;
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        AlphaUtils.closeSafely(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e11) {
                e = e11;
            }
        } else {
            throw new RuntimeException("Alpha config file " + file + " is not exist!");
        }
    }
}
