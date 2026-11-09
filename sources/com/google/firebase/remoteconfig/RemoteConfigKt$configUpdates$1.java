package com.google.firebase.remoteconfig;

import Ff.h;
import Yf.C;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/firebase/remoteconfig/ConfigUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class RemoteConfigKt$configUpdates$1 extends h implements Function2<ProducerScope<? super ConfigUpdate>, Continuation<? super Unit>, Object> {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, Continuation<? super RemoteConfigKt$configUpdates$1> continuation) {
        super(2, continuation);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
        configUpdateListenerRegistration.remove();
        return Unit.f38893a;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, continuation);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.label;
        if (i7 == 0) {
            g.M(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            final ConfigUpdateListenerRegistration configUpdateListenerRegistrationAddOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, producerScope));
            Intrinsics.checkNotNullExpressionValue(configUpdateListenerRegistrationAddOnConfigUpdateListener, "addOnConfigUpdateListener(...)");
            Function0 function0 = new Function0() { // from class: com.google.firebase.remoteconfig.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RemoteConfigKt$configUpdates$1.invokeSuspend$lambda$0(configUpdateListenerRegistrationAddOnConfigUpdateListener);
                }
            };
            this.label = 1;
            if (C.a(producerScope, function0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProducerScope<? super ConfigUpdate> producerScope, Continuation<? super Unit> continuation) {
        return ((RemoteConfigKt$configUpdates$1) create(producerScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
