package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f23037a;

    public /* synthetic */ a(RemoteConfigManager remoteConfigManager) {
        this.f23037a = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        this.f23037a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        this.f23037a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
