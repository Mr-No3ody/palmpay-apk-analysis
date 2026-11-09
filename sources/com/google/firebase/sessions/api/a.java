package com.google.firebase.sessions.api;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseSessionsDependencies.Dependency f23075a;

    public /* synthetic */ a(FirebaseSessionsDependencies.Dependency dependency) {
        this.f23075a = dependency;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return FirebaseSessionsDependencies.getRegisteredSubscribers$lambda$2$lambda$1(this.f23075a);
    }
}
