package com.adjust.sdk.scheduler;

import Ce.H;
import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.ShadowExecutors;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {
    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.adjust.sdk.scheduler.AsyncTaskExecutor").execute(new H(this, paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}
