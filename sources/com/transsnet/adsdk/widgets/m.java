package com.transsnet.adsdk.widgets;

import com.transsnet.adsdk.data.bean.resp.AdCommonResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SingleAdView f25651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdCommonResult f25652c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SingleAdView singleAdView, AdCommonResult adCommonResult, Continuation continuation) {
        super(2, continuation);
        this.f25651b = singleAdView;
        this.f25652c = adCommonResult;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new m(this.f25651b, this.f25652c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f25650a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            this.f25650a = 1;
            if (this.f25651b.handleAdData(this.f25652c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
