package com.google.firebase.concurrent;

import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22936a;

    public /* synthetic */ g(int i7) {
        this.f22936a = i7;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f22936a) {
            case 0:
                return ExecutorsRegistrar.lambda$static$0();
            case 1:
                return ExecutorsRegistrar.lambda$static$1();
            case 2:
                return ExecutorsRegistrar.lambda$static$2();
            case 3:
                return ExecutorsRegistrar.lambda$static$3();
            case 4:
                return FirebaseMessaging.lambda$clearTransportFactoryForTest$12();
            case 5:
                return FirebaseMessaging.lambda$static$0();
            case 6:
                return Executors.newSingleThreadScheduledExecutor();
            case 7:
                return GaugeManager.lambda$new$0();
            case 8:
                return GaugeManager.lambda$new$1();
            default:
                return RemoteConfigComponent.lambda$getFetchHandler$0();
        }
    }
}
