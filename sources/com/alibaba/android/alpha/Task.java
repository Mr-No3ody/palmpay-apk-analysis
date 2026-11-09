package com.alibaba.android.alpha;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class Task {
    public static final int DEFAULT_EXECUTE_PRIORITY = 0;
    public static final int STATE_FINISHED = 2;
    public static final int STATE_IDLE = 0;
    public static final int STATE_RUNNING = 1;
    public static final int STATE_WAIT = 3;
    private static ExecutorService sExecutor = AlphaConfig.getExecutor();
    private static Handler sHandler = new Handler(Looper.getMainLooper());
    private volatile int mCurrentState;
    private int mExecutePriority;
    private Runnable mInternalRunnable;
    private boolean mIsInUiThread;
    protected String mName;
    protected Set<Task> mPredecessorSet;
    private List<Task> mSuccessorList;
    private f mTaskExecuteMonitor;
    private List<OnTaskFinishListener> mTaskFinishListeners;
    private int mThreadPriority;

    public interface OnTaskFinishListener {
        void onTaskFinish(String str);
    }

    public Task(String str) {
        this(str, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void switchState(int i7) {
        this.mCurrentState = i7;
    }

    public void addOnTaskFinishListener(OnTaskFinishListener onTaskFinishListener) {
        if (this.mTaskFinishListeners.contains(onTaskFinishListener)) {
            return;
        }
        this.mTaskFinishListeners.add(onTaskFinishListener);
    }

    public void addPredecessor(Task task) {
        this.mPredecessorSet.add(task);
    }

    public void addSuccessor(Task task) {
        if (task == this) {
            throw new RuntimeException("A task should not after itself.");
        }
        task.addPredecessor(this);
        this.mSuccessorList.add(task);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public int getExecutePriority() {
        return this.mExecutePriority;
    }

    public boolean isFinished() {
        return this.mCurrentState == 2;
    }

    public boolean isRunning() {
        return this.mCurrentState == 1;
    }

    public void notifyFinished() {
        if (!this.mSuccessorList.isEmpty()) {
            AlphaUtils.sort(this.mSuccessorList);
            Iterator<Task> it = this.mSuccessorList.iterator();
            while (it.hasNext()) {
                it.next().onPredecessorFinished(this);
            }
        }
        if (this.mTaskFinishListeners.isEmpty()) {
            return;
        }
        Iterator<OnTaskFinishListener> it2 = this.mTaskFinishListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onTaskFinish(this.mName);
        }
        this.mTaskFinishListeners.clear();
    }

    public synchronized void onPredecessorFinished(Task task) {
        if (this.mPredecessorSet.isEmpty()) {
            return;
        }
        this.mPredecessorSet.remove(task);
        if (this.mPredecessorSet.isEmpty()) {
            start();
        }
    }

    public void recordTime(long j6) {
        f fVar = this.mTaskExecuteMonitor;
        if (fVar != null) {
            String str = this.mName;
            synchronized (fVar) {
                try {
                    AlphaLog.d(AlphaLog.GLOBAL_TAG, "AlphaTask-->Startup task %s cost time: %s ms, in thread: %s", str, Long.valueOf(j6), Thread.currentThread().getName());
                    if (j6 >= AlphaConfig.getWarmingTime()) {
                        Object[] objArr = {str, Long.valueOf(j6)};
                        if (AlphaConfig.shouldShowToastToAlarm()) {
                            if (fVar.f20344d == null) {
                                fVar.f20344d = new Handler(Looper.getMainLooper());
                            }
                            fVar.f20344d.post(new androidx.customview.widget.e(objArr, 7));
                        }
                    }
                    fVar.f20341a.put(str, Long.valueOf(j6));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void recycle() {
        this.mSuccessorList.clear();
        this.mTaskFinishListeners.clear();
    }

    public void removePredecessor(Task task) {
        this.mPredecessorSet.remove(task);
    }

    public abstract void run();

    public void setExecuteMonitor(f fVar) {
        this.mTaskExecuteMonitor = fVar;
    }

    public void setExecutePriority(int i7) {
        this.mExecutePriority = i7;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setThreadPriority(int i7) {
        this.mThreadPriority = i7;
    }

    public synchronized void start() {
        try {
            if (this.mCurrentState != 0) {
                throw new RuntimeException("You try to run task " + this.mName + " twice, is there a circular dependency?");
            }
            switchState(3);
            if (this.mInternalRunnable == null) {
                this.mInternalRunnable = new androidx.customview.widget.e(this, 8);
            }
            if (this.mIsInUiThread) {
                sHandler.post(this.mInternalRunnable);
            } else {
                sExecutor.execute(this.mInternalRunnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Task(String str, int i7) {
        this.mExecutePriority = 0;
        this.mTaskFinishListeners = new ArrayList();
        this.mCurrentState = 0;
        this.mSuccessorList = new ArrayList();
        this.mPredecessorSet = new HashSet();
        this.mName = str;
        this.mThreadPriority = i7;
    }

    public Task(String str, boolean z3) {
        this.mExecutePriority = 0;
        this.mTaskFinishListeners = new ArrayList();
        this.mCurrentState = 0;
        this.mSuccessorList = new ArrayList();
        this.mPredecessorSet = new HashSet();
        this.mName = str;
        this.mIsInUiThread = z3;
    }
}
