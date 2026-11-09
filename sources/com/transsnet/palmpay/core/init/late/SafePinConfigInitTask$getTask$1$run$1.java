package com.transsnet.palmpay.core.init.late;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.transsnet.palmpay.core.init.late.SafePinConfigInitTask$getTask$1$run$1", f = "SafePinConfigInitTask.kt", i = {}, l = {ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK}, m = "invokeSuspend", n = {}, s = {})
public final class SafePinConfigInitTask$getTask$1$run$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SafePinConfigInitTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafePinConfigInitTask$getTask$1$run$1(SafePinConfigInitTask safePinConfigInitTask, Continuation<? super SafePinConfigInitTask$getTask$1$run$1> continuation) {
        super(2, continuation);
        this.this$0 = safePinConfigInitTask;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SafePinConfigInitTask$getTask$1$run$1(this.this$0, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.label;
        if (i7 == 0) {
            g.M(obj);
            SafePinConfigInitTask safePinConfigInitTask = this.this$0;
            this.label = 1;
            if (safePinConfigInitTask.initSafeConfig(this) == aVar) {
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SafePinConfigInitTask$getTask$1$run$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
