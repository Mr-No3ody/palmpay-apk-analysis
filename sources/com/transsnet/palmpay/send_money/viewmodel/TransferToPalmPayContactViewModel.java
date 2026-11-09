package com.transsnet.palmpay.send_money.viewmodel;

import Kd.I1;
import Kd.J1;
import Kd.M1;
import Kd.Q1;
import N8.q0;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.req.ToPalmPayBeneficiaryReq;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;
import p367ya.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayContactViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayContactViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,134:1\n134#2,13:135\n134#2,13:148\n134#2,13:161\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayContactViewModel.kt\ncom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayContactViewModel\n*L\n33#1:135,13\n49#1:148,13\n63#1:161,13\n*E\n"})
public final class TransferToPalmPayContactViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34074g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34075i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34076j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f34077o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferToPalmPayContactViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34072e = new l();
        this.f34073f = new l();
        new l();
        this.f34074g = new l();
        this.f34075i = new l();
        new l();
        this.f34076j = new l();
        this.f34077o = new l();
    }

    public final void d(String str, boolean z3) {
        I1 i7 = new I1(str, z3, null);
        if (str == null) {
            str = "";
        }
        l lVar = this.f34075i;
        lVar.f27356m = str;
        Unit unit = Unit.f38893a;
        f.v(this, i7, lVar, 0L);
    }

    public final void e(Integer num, RecipientBeanV2 recipientBeanV2) {
        J1 j1 = new J1(num, recipientBeanV2, null);
        l lVar = this.f34077o;
        lVar.f27356m = recipientBeanV2;
        Unit unit = Unit.f38893a;
        f.v(this, j1, lVar, 0L);
    }

    public final void f(ToPalmPayBeneficiaryReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        AbstractC0780y.m(V.h(this), null, null, new M1(this.f34072e, q0.y(a.d().i(), "_queryContactAll_", BaseApplication.getCountryLocale()), null, req), 3);
    }

    public final void g(String str) {
        Q1 q10 = new Q1(str, null);
        if (str == null) {
            str = "";
        }
        l lVar = this.f34074g;
        lVar.f27356m = str;
        Unit unit = Unit.f38893a;
        f.v(this, q10, lVar, 0L);
    }
}
