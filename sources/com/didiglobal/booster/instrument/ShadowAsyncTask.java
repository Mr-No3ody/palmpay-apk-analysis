package com.didiglobal.booster.instrument;

import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class ShadowAsyncTask {
    public static void optimizeAsyncTaskExecutor() {
        try {
            ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).allowCoreThreadTimeOut(true);
        } catch (Throwable th) {
            Log.e(Constants.TAG, "Optimize AsyncTask executor error: allowCoreThreadTimeOut = true", th);
        }
    }
}
