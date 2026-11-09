package com.google.android.play.integrity.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final TaskCompletionSource f22772a;

    public t() {
        this.f22772a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f22772a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    @Nullable
    public final TaskCompletionSource c() {
        return this.f22772a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public t(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f22772a = taskCompletionSource;
    }
}
