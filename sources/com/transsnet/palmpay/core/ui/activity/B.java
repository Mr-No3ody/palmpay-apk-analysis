package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.core.bean.payment.CancelPaymentRetryReq;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class B extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27450d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f27448b = str;
        this.f27449c = str2;
        this.f27450d = str3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new B(this.f27448b, this.f27449c, this.f27450d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27447a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                CancelPaymentRetryReq cancelPaymentRetryReq = new CancelPaymentRetryReq(this.f27448b, null, this.f27449c, this.f27450d);
                this.f27447a = 1;
                if (payApiService.cancelPaymentRetry(cancelPaymentRetryReq, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            F6.d.c("cancelPaymentRetry", message);
        }
        return Unit.f38893a;
    }
}
