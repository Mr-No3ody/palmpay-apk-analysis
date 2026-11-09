package com.transsnet.palmpay.cash_in.ui.viewmodel;

import C0.G;
import J9.J;
import Wf.AbstractC0780y;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p367ya.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawViewModel.kt\ncom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,133:1\n85#2,13:134\n85#2,13:147\n*S KotlinDebug\n*F\n+ 1 WithdrawViewModel.kt\ncom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel\n*L\n50#1:134,13\n65#1:147,13\n*E\n"})
public final class WithdrawViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f27110A;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f27111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f27112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f27113g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f27114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f27115j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f27116o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f27117p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f27118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f27119w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f27111e = new l();
        this.f27112f = new l();
        this.f27113g = new l();
        this.f27114i = new l();
        this.f27115j = new l();
        this.f27116o = new l();
        this.f27117p = new l();
        this.t = new l();
        this.f27118v = new l();
        this.f27119w = new l();
        this.f27110A = new l();
    }

    public final void d() {
        AbstractC0780y.m(V.h(this), null, null, new J(this.f27113g, G.p("Pref_", a.d().i(), "_queryWithdrawBankAccount_", BaseApplication.getCountryLocale()), null), 3);
    }
}
