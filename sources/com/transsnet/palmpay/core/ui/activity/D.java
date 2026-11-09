package com.transsnet.palmpay.core.ui.activity;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.network.PayApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class D extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f27613b = str;
        this.f27614c = str2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new D(this.f27613b, this.f27614c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f27612a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                String str = this.f27613b;
                String memberId = BaseApplication.get().getUser().getMemberId();
                if (memberId == null) {
                    memberId = "";
                }
                String str2 = this.f27614c;
                this.f27612a = 1;
                if (payApiService.noticeCashierClose(str, memberId, str2, this) == aVar) {
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
            F6.d.c("noticeCashierClose", message != null ? message : "");
        }
        return Unit.f38893a;
    }
}
