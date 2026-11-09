package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Continuation, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23022b;

    public /* synthetic */ l(Object obj, int i7) {
        this.f23021a = i7;
        this.f23022b = obj;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f23021a) {
            case 1:
                WakeLockHolder.completeWakefulIntent((Intent) this.f23022b);
                break;
            case 2:
                ((WithinAppServiceConnection.BindRequest) this.f23022b).finish();
                break;
            default:
                ((ScheduledFuture) this.f23022b).cancel(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((GmsRpc) this.f23022b).lambda$extractResponseWhenComplete$0(task);
    }
}
