package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SynchronizationGuard.CriticalSection, Deferred.DeferredHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f22456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22459d;

    public /* synthetic */ b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j6) {
        this.f22457b = uploader;
        this.f22458c = iterable;
        this.f22459d = transportContext;
        this.f22456a = j6;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f22457b).lambda$logAndUpdateState$4((Iterable) this.f22458c, (TransportContext) this.f22459d, this.f22456a);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.f22457b, (String) this.f22458c, this.f22456a, (StaticSessionData) this.f22459d, provider);
    }

    public /* synthetic */ b(String str, String str2, long j6, StaticSessionData staticSessionData) {
        this.f22457b = str;
        this.f22458c = str2;
        this.f22456a = j6;
        this.f22459d = staticSessionData;
    }
}
