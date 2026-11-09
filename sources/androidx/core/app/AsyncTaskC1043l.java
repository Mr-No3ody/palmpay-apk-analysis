package androidx.core.app;

import android.os.AsyncTask;

/* JADX INFO: renamed from: androidx.core.app.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1043l extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f15979a;

    public AsyncTaskC1043l(O o10) {
        this.f15979a = o10;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        JobIntentService$GenericWorkItem jobIntentService$GenericWorkItemDequeueWork;
        while (true) {
            O o10 = this.f15979a;
            o10.getClass();
            try {
                JobIntentService$CompatJobEngine jobIntentService$CompatJobEngine = o10.f15947a;
                if (jobIntentService$CompatJobEngine != null) {
                    jobIntentService$GenericWorkItemDequeueWork = jobIntentService$CompatJobEngine.dequeueWork();
                } else {
                    synchronized (o10.f15951e) {
                        try {
                            jobIntentService$GenericWorkItemDequeueWork = o10.f15951e.size() > 0 ? (JobIntentService$GenericWorkItem) o10.f15951e.remove(0) : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (SecurityException e10) {
                e10.printStackTrace();
            }
            if (jobIntentService$GenericWorkItemDequeueWork == null) {
                return null;
            }
            this.f15979a.e(jobIntentService$GenericWorkItemDequeueWork.getIntent());
            jobIntentService$GenericWorkItemDequeueWork.complete();
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        this.f15979a.f();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        this.f15979a.f();
    }
}
