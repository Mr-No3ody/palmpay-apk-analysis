package com.transsnet.palmpay.airtime.viewmodel;

import C0.G;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.C1905j;
import o9.C1909n;
import o9.C1916v;
import o9.C1917w;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeTopupViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirTimeTopupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirTimeTopupViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/AirTimeTopupViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n85#2,13:330\n85#2,13:343\n85#2,13:357\n85#2,13:370\n1#3:356\n*S KotlinDebug\n*F\n+ 1 AirTimeTopupViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/AirTimeTopupViewModel\n*L\n89#1:330,13\n193#1:343,13\n220#1:357,13\n235#1:370,13\n*E\n"})
public final class AirTimeTopupViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f26614A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f26615B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f26616C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f26617H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final l f26618L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final l f26619M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final l f26620Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final l f26621X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final l f26622Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final l f26623Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26626g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26628j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26629o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26630p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f26631v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0 f26632w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirTimeTopupViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26624e = new l();
        this.f26625f = new l();
        this.f26626g = new l();
        this.f26627i = new l();
        this.f26628j = new l();
        this.f26629o = new l();
        this.f26630p = new l();
        this.t = new l();
        this.f26631v = new l();
        this.f26614A = new l();
        this.f26615B = new l();
        this.f26616C = new l();
        this.f26617H = new l();
        this.f26618L = new l();
        this.f26619M = new l();
        this.f26620Q = new l();
        this.f26621X = new l();
        this.f26622Y = new l();
        this.f26623Z = new l();
    }

    public final void d() {
        Intrinsics.checkNotNullParameter("04", "transType");
        f.s(this, new C1905j(10, null), this.f26627i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void e(ArrayList list, Function0 function) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(function, "function");
        C1909n c1909n = new C1909n(list, null);
        l lVar = this.f26620Q;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(this, c1909n, lVar, 0L);
    }

    public final void f() {
        t0 t0Var = this.f26632w;
        if (t0Var == null || !t0Var.isActive()) {
            this.f26632w = AbstractC0780y.m(V.h(this), null, null, new C1916v(this.f26614A, G.o("Pref_queryAirtimeItemV4_", BaseApplication.getCountryLocale()), null), 3);
        }
    }

    public final void g(String phone, String couponCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        C1917w c1917w = new C1917w(phone, couponCode, null);
        l lVar = this.f26616C;
        lVar.f27356m = phone;
        Unit unit = Unit.f38893a;
        f.v(this, c1917w, lVar, 0L);
    }
}
