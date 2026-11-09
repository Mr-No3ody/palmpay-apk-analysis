package com.google.firebase.messaging;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements OnSuccessListener, FirebaseInstanceIdInternal.NewTokenListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f23015b;

    public /* synthetic */ h(FirebaseMessaging firebaseMessaging, int i7) {
        this.f23014a = i7;
        this.f23015b = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public void onNewToken(String str) {
        this.f23015b.lambda$new$1(str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f23014a) {
            case 0:
                this.f23015b.lambda$new$3((TopicsSubscriber) obj);
                break;
            case 1:
            default:
                this.f23015b.lambda$handleProxiedNotificationData$5((CloudMessage) obj);
                break;
            case 2:
                this.f23015b.lambda$setNotificationDelegationEnabled$6((Void) obj);
                break;
        }
    }
}
