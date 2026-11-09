package com.google.firebase.sessions.settings;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsCacheImpl$removeConfigs$2 extends h implements Function2<SessionConfigs, Continuation<? super SessionConfigs>, Object> {
    int label;

    public SettingsCacheImpl$removeConfigs$2(Continuation<? super SettingsCacheImpl$removeConfigs$2> continuation) {
        super(2, continuation);
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsCacheImpl$removeConfigs$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(SessionConfigs sessionConfigs, Continuation<? super SessionConfigs> continuation) {
        return ((SettingsCacheImpl$removeConfigs$2) create(sessionConfigs, continuation)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        return SessionConfigsSerializer.INSTANCE.getDefaultValue();
    }
}
