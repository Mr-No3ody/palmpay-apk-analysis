package com.transsnet.palmpay.airtime.viewmodel;

import C0.G;
import Wf.AbstractC0780y;
import Wf.t0;
import android.app.Application;
import androidx.lifecycle.V;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.req.EditScheduleTopUpTaskReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.M;
import o9.O;
import o9.Q;
import o9.a0;
import o9.b0;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTopUpViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTopUpViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,233:1\n134#2,13:234\n85#2,13:247\n85#2,13:260\n*S KotlinDebug\n*F\n+ 1 ScheduleTopUpViewModel.kt\ncom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel\n*L\n89#1:234,13\n107#1:247,13\n122#1:260,13\n*E\n"})
public final class ScheduleTopUpViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f26633A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f26634B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f26635C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f26636H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final l f26637L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final l f26638M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final l f26639Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final l f26640X;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t0 f26641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26643g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26644i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26645j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26646o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26647p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f26648v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f26649w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduleTopUpViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26642f = new l();
        this.f26643g = new l();
        this.f26644i = new l();
        this.f26645j = new l();
        this.f26646o = new l();
        this.f26647p = new l();
        this.t = new l();
        this.f26648v = new l();
        this.f26649w = new l();
        this.f26633A = new l();
        this.f26634B = new l();
        this.f26635C = new l();
        this.f26636H = new l();
        this.f26637L = new l();
        this.f26638M = new l();
        this.f26639Q = new l();
        this.f26640X = new l();
    }

    public final void d(AddScheduleTopUpTaskReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
        if (BaseApplication.hasLogin()) {
            M m7 = new M(req, null);
            l lVar = this.f26633A;
            lVar.f27356m = req;
            Unit unit = Unit.f38893a;
            f.v(this, m7, lVar, 0L);
        }
    }

    public final void e(ArrayList list, Function0 function) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(function, "function");
        O o10 = new O(list, null);
        l lVar = this.f26642f;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(this, o10, lVar, 0L);
    }

    public final void f(EditScheduleTopUpTaskReq req, Function0 function) {
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(function, "function");
        if (BaseApplication.hasLogin()) {
            Q q10 = new Q(req, null);
            l lVar = this.f26634B;
            lVar.f27356m = function;
            Unit unit = Unit.f38893a;
            f.v(this, q10, lVar, 0L);
        }
    }

    public final void g(String billerId) {
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        AbstractC0780y.m(V.h(this), null, null, new a0(this.f26648v, G.p("Pref_", "queryScheduleItemByOperatorId_".concat(billerId), "_", BaseApplication.getCountryLocale()), null, billerId), 3);
    }

    public final void h() {
        if (BaseApplication.hasLogin()) {
            f.s(this, new b0(G.k(), null), this.f26645j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
