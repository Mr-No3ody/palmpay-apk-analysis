package com.google.firebase.remoteconfig;

import Wf.AbstractC0777v;
import com.flexibank.sdk.g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/google/firebase/remoteconfig/RemoteConfigKt$configUpdates$1$registration$1", "Lcom/google/firebase/remoteconfig/ConfigUpdateListener;", "onUpdate", "", "configUpdate", "Lcom/google/firebase/remoteconfig/ConfigUpdate;", "onError", "error", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigException;", "com.google.firebase-firebase-config"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ ProducerScope<ConfigUpdate> $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, ProducerScope<? super ConfigUpdate> producerScope) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = producerScope;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(FirebaseRemoteConfigException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ProducerScope<ConfigUpdate> producerScope = this.$$this$callbackFlow;
        CancellationException cancellationException = new CancellationException("Error listening for config updates.");
        cancellationException.initCause(error);
        AbstractC0777v.c(producerScope, cancellationException);
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(ConfigUpdate configUpdate) {
        Intrinsics.checkNotNullParameter(configUpdate, "configUpdate");
        this.$this_configUpdates.schedule(new g(7, this.$$this$callbackFlow, configUpdate));
    }
}
