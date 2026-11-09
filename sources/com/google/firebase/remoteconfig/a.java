package com.google.firebase.remoteconfig;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Continuation, SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23057b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f23056a = i7;
        this.f23057b = obj;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ((FirebaseRemoteConfig) this.f23057b).lambda$fetchAndActivate$1((Void) obj);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f23056a) {
            case 0:
                return Boolean.valueOf(((FirebaseRemoteConfig) this.f23057b).processActivatePutTask(task));
            default:
                return FirebaseRemoteConfig.lambda$ensureInitialized$0((Task) this.f23057b, task);
        }
    }
}
