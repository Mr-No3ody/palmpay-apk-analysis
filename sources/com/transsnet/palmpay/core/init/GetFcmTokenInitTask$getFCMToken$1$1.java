package com.transsnet.palmpay.core.init;

import C0.G;
import F6.d;
import Ff.h;
import Pa.i0;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.google.android.gms.tasks.Task;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.transsnet.palmpay.core.init.GetFcmTokenInitTask$getFCMToken$1$1", f = "GetFcmTokenInitTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetFcmTokenInitTask$getFCMToken$1$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Task<String> $appInstanceIdTask;
    final /* synthetic */ Task<String> $fcmTokenTask;
    final /* synthetic */ String $spKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFcmTokenInitTask$getFCMToken$1$1(Task<String> task, Task<String> task2, String str, Continuation<? super GetFcmTokenInitTask$getFCMToken$1$1> continuation) {
        super(2, continuation);
        this.$appInstanceIdTask = task;
        this.$fcmTokenTask = task2;
        this.$spKey = str;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetFcmTokenInitTask$getFCMToken$1$1(this.$appInstanceIdTask, this.$fcmTokenTask, this.$spKey, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        Task<String> task = this.$appInstanceIdTask;
        String result = task != null ? task.getResult() : null;
        if (!TextUtils.isEmpty(result)) {
            d.h(BaseInitTask.TAG, 3, G.o("appInstanceIdTask: ", result));
            Intrinsics.e(result);
            p059e1.a.W("firebase_sp_firebase_analytics_instance_id", result);
        }
        Task<String> task2 = this.$fcmTokenTask;
        String result2 = task2 != null ? task2.getResult() : null;
        if (!TextUtils.isEmpty(result2)) {
            d.h(BaseInitTask.TAG, 3, G.o("fcmTokenTask: ", result2));
            p059e1.a.V(System.currentTimeMillis(), this.$spKey);
        }
        i0.Q(result2);
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GetFcmTokenInitTask$getFCMToken$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
