package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f23010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f23011c;

    public /* synthetic */ f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i7) {
        this.f23009a = i7;
        this.f23010b = firebaseMessaging;
        this.f23011c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23009a) {
            case 0:
                this.f23010b.lambda$deleteToken$9(this.f23011c);
                break;
            case 1:
                this.f23010b.lambda$getToken$7(this.f23011c);
                break;
            default:
                this.f23010b.lambda$deleteToken$8(this.f23011c);
                break;
        }
    }
}
