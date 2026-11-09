package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
abstract class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22737c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("dialogShownLock")
    private boolean f22739e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22735a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f22738d = new Object();

    public y(String str, long j6) {
        this.f22736b = str;
        this.f22737c = j6;
    }

    public final Task a(Activity activity, int i7) {
        synchronized (this.f22738d) {
            try {
                if (this.f22739e) {
                    return Tasks.forResult(0);
                }
                this.f22739e = true;
                this.f22735a.a("checkAndShowDialog(%s)", Integer.valueOf(i7));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i7);
                bundle.putString("package.name", this.f22736b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 3);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f22737c);
                return b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Task b(Activity activity, Bundle bundle);
}
