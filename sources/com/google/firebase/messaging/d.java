package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23006c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f23004a = i7;
        this.f23005b = obj;
        this.f23006c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23004a) {
            case 0:
                ((FcmLifecycleCallbacks) this.f23005b).lambda$onActivityCreated$0((Intent) this.f23006c);
                break;
            default:
                ((ImageDownload) this.f23005b).lambda$start$0((TaskCompletionSource) this.f23006c);
                break;
        }
    }
}
