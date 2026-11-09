package com.transsnet.palmpay.account.init;

import Ef.a;
import Ff.h;
import android.content.Intent;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.transsnet.palmpay.account.init.BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1", f = "BaseAppsFlyerInitTask.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1 extends h implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $intent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1(Intent intent, Continuation<? super BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1> continuation) {
        super(2, continuation);
        this.$intent = intent;
    }

    @Override // Ff.a
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1(this.$intent, continuation);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.M(obj);
        ActivityUtils.startActivity(this.$intent);
        return Unit.f38893a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseAppsFlyerInitTask$Companion$initAppsFlyerLib$3$onDeepLinking$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f38893a);
    }
}
