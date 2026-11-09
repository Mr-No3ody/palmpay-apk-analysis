package com.transsnet.palmpay.core.init;

import Ff.h;
import android.app.Application;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.transsnet.palmpay.core.init.CronetInitTask$getTask$1$run$1$1", f = "CronetInitTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CronetInitTask$getTask$1$run$1$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Application $application;
    final /* synthetic */ CronetProvider $provider;
    int label;
    final /* synthetic */ CronetInitTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetInitTask$getTask$1$run$1$1(CronetInitTask cronetInitTask, Application application, CronetProvider cronetProvider, Continuation<? super CronetInitTask$getTask$1$run$1$1> continuation) {
        super(2, continuation);
        this.this$0 = cronetInitTask;
        this.$application = application;
        this.$provider = cronetProvider;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CronetInitTask$getTask$1$run$1$1(this.this$0, this.$application, this.$provider, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        this.this$0.setupCronetEngine(this.$application, this.$provider.createBuilder());
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CronetInitTask$getTask$1$run$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
