package com.google.firebase.sessions.settings;

import Ff.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCacheImpl", f = "SettingsCache.kt", i = {}, l = {107}, m = "removeConfigs$com_google_firebase_firebase_sessions", n = {}, s = {})
public final class SettingsCacheImpl$removeConfigs$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCacheImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$removeConfigs$1(SettingsCacheImpl settingsCacheImpl, Continuation<? super SettingsCacheImpl$removeConfigs$1> continuation) {
        super(continuation);
        this.this$0 = settingsCacheImpl;
    }

    @Override // Ff.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
