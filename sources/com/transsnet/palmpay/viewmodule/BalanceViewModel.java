package com.transsnet.palmpay.viewmodule;

import C0.G;
import Pe.C0536h;
import Pe.C0537i;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.camera.camera2.internal.F;
import androidx.lifecycle.V;
import com.transsnet.palmpay.bean.QueryOrderNoParamReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/viewmodule/BalanceViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBalanceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BalanceViewModel.kt\ncom/transsnet/palmpay/viewmodule/BalanceViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n85#2,13:89\n1#3:102\n*S KotlinDebug\n*F\n+ 1 BalanceViewModel.kt\ncom/transsnet/palmpay/viewmodule/BalanceViewModel\n*L\n36#1:89,13\n*E\n"})
public final class BalanceViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f35351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f35352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f35353g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f35354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f35355j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalanceViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f35351e = new l();
        this.f35352f = new l();
        this.f35353g = new l();
        this.f35354i = new l();
        this.f35355j = new l();
    }

    public final void d(AccountFlowReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        String strO = G.o("queryBalanceData", req.getDcType());
        String strI = a.d().i();
        String countryLocale = BaseApplication.getCountryLocale();
        StringBuilder sbF = F.f("Pref_", strI, "_", strO, "_");
        sbF.append(countryLocale);
        AbstractC0780y.m(V.h(this), null, null, new C0536h(this.f35352f, sbF.toString(), null, req), 3);
    }

    public final void e(String payIdReq, long j6, long j10) {
        Intrinsics.checkNotNullParameter(payIdReq, "payIdReq");
        C0537i c0537i = new C0537i(payIdReq, null);
        QueryOrderNoParamReq queryOrderNoParamReq = new QueryOrderNoParamReq();
        queryOrderNoParamReq.payId = payIdReq;
        queryOrderNoParamReq.amount = j6;
        queryOrderNoParamReq.create = j10;
        l lVar = this.f35353g;
        lVar.f27356m = queryOrderNoParamReq;
        Unit unit = Unit.f38893a;
        f.v(this, c0537i, lVar, 0L);
    }
}
