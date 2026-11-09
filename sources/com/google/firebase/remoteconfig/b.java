package com.google.firebase.remoteconfig;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23059b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f23058a = i7;
        this.f23059b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23058a) {
            case 0:
                return ((FirebaseRemoteConfig) this.f23059b).lambda$reset$6();
            case 1:
                return ((FirebaseRemoteConfig) this.f23059b).getInfo();
            default:
                return ((RemoteConfigComponent) this.f23059b).getDefault();
        }
    }
}
