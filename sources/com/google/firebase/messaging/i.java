package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements SuccessContinuation, RequestDeduplicator.GetTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f23016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Store.Token f23018c;

    public /* synthetic */ i(FirebaseMessaging firebaseMessaging, String str, Store.Token token) {
        this.f23016a = firebaseMessaging;
        this.f23017b = str;
        this.f23018c = token;
    }

    @Override // com.google.firebase.messaging.RequestDeduplicator.GetTokenRequest
    public Task start() {
        return this.f23016a.lambda$blockingGetToken$14(this.f23017b, this.f23018c);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return this.f23016a.lambda$blockingGetToken$13(this.f23017b, this.f23018c, (String) obj);
    }
}
