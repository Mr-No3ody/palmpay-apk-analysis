package com.google.firebase.sessions.settings;

import Ef.a;
import Ff.h;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import com.google.firebase.sessions.FirebaseSessions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "msg", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RemoteSettings$updateSettings$2$2 extends h implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public RemoteSettings$updateSettings$2$2(Continuation<? super RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        Log.e(FirebaseSessions.TAG, "Error failed to fetch the remote configs: " + ((String) this.L$0));
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(Unit.f38893a);
    }
}
