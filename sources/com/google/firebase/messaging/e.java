package com.google.firebase.messaging;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements SuccessContinuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23008b;

    public /* synthetic */ e(String str, int i7) {
        this.f23007a = i7;
        this.f23008b = str;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        switch (this.f23007a) {
            case 0:
                return FirebaseMessaging.lambda$subscribeToTopic$10(this.f23008b, (TopicsSubscriber) obj);
            default:
                return FirebaseMessaging.lambda$unsubscribeFromTopic$11(this.f23008b, (TopicsSubscriber) obj);
        }
    }
}
