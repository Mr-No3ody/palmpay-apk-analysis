package com.google.firebase.sessions;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23078b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f23077a = i7;
        this.f23078b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23077a) {
            case 0:
                return FirebaseSessionsComponent.MainModule.Companion.sessionConfigsDataStore$lambda$2((Context) this.f23078b);
            case 1:
                return FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$5((Context) this.f23078b);
            default:
                return ProcessDataManagerImpl.myUuid_delegate$lambda$1((UuidGenerator) this.f23078b);
        }
    }
}
