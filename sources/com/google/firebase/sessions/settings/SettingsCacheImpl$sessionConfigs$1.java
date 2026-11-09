package com.google.firebase.sessions.settings;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl$sessionConfigs$1", f = "SettingsCache.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
public final class SettingsCacheImpl$sessionConfigs$1 extends h implements Function2<CoroutineScope, Continuation<? super SessionConfigs>, Object> {
    int label;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$sessionConfigs$1(SettingsCacheImpl settingsCacheImpl, Continuation<? super SettingsCacheImpl$sessionConfigs$1> continuation) {
        super(2, continuation);
        this.this$0 = settingsCacheImpl;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsCacheImpl$sessionConfigs$1(this.this$0, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.label;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        Flow data = this.this$0.sessionConfigsDataStore.getData();
        this.label = 1;
        Object objK = X.k(data, this);
        return objK == aVar ? aVar : objK;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SessionConfigs> continuation) {
        return ((SettingsCacheImpl$sessionConfigs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
