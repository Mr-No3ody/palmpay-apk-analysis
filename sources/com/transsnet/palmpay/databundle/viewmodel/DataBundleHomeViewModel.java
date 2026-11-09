package com.transsnet.palmpay.databundle.viewmodel;

import C0.G;
import N8.q0;
import Pa.H;
import Wf.AbstractC0780y;
import android.app.Application;
import android.text.TextUtils;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.teller.bean.DataBundleGroupParams;
import com.transsnet.palmpay.teller.bean.DataBundleParams;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p130ic.d;
import p130ic.e;
import p130ic.g;
import p130ic.p;
import p130ic.u;
import p130ic.y;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleHomeViewModel.kt\ncom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel\n+ 2 MvvmExt.kt\ncom/transsnet/palmpay/core/base/ext/MvvmExtKt\n*L\n1#1,291:1\n85#2,13:292\n134#2,13:305\n134#2,13:318\n85#2,13:331\n85#2,13:344\n*S KotlinDebug\n*F\n+ 1 DataBundleHomeViewModel.kt\ncom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel\n*L\n80#1:292,13\n152#1:305,13\n169#1:318,13\n206#1:331,13\n220#1:344,13\n*E\n"})
public final class DataBundleHomeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f31793M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f31794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f31795B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f31796C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f31797H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final l f31798L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f31799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f31800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f31801g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f31802i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f31803j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f31804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f31805p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f31806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f31807w;

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
    public DataBundleHomeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f31799e = new l();
        this.f31800f = new l();
        this.f31801g = new l();
        this.f31802i = new l();
        this.f31803j = new l();
        this.f31804o = new l();
        this.f31805p = new l();
        this.t = new l();
        this.f31806v = new l();
        this.f31807w = new l();
        this.f31794A = new l();
        this.f31795B = new l();
        this.f31796C = new l();
        this.f31797H = new l();
        this.f31798L = new l();
    }

    public final void d(DataBundleWalletItemBean paymentItem, String mobileNumber, long j6, boolean z3, String str, String str2) {
        Intrinsics.checkNotNullParameter(paymentItem, "paymentItem");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        d dVar = new d(paymentItem, mobileNumber, j6, z3, str, str2, null);
        DataBundleParams dataBundleParams = new DataBundleParams(paymentItem, mobileNumber, j6, null, null, str2, 24, null);
        l lVar = this.f31804o;
        lVar.f27356m = dataBundleParams;
        Unit unit = Unit.f38893a;
        f.v(this, dVar, lVar, 0L);
    }

    public final void e(ArrayList list, Function0 function) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(function, "function");
        e eVar = new e(list, null);
        l lVar = this.f31805p;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(this, eVar, lVar, 0L);
    }

    public final void f(String phone, String couponCode) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(couponCode, "couponCode");
        g gVar = new g(phone, couponCode, null);
        l lVar = this.t;
        lVar.f27356m = phone;
        Unit unit = Unit.f38893a;
        f.v(this, gVar, lVar, 0L);
    }

    public final void g(int i7, String billerId, boolean z3) {
        Intrinsics.checkNotNullParameter(billerId, "billerId");
        String strB = H.b("queryCategoryAndBundleListByBillerId" + billerId);
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        DataBundleGroupParams dataBundleGroupParams = new DataBundleGroupParams(i7, Boolean.valueOf(z3));
        l lVar = this.f31799e;
        lVar.f27356m = dataBundleGroupParams;
        AbstractC0780y.m(V.h(this), null, null, new p130ic.l(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, billerId), 3);
    }

    public final void h(String billerName) {
        Intrinsics.checkNotNullParameter(billerName, "billerName");
        if (BaseApplication.hasLogin()) {
            String strO = G.o("queryBundleTipsListV4ByBillerName", billerName);
            l lVar = this.f31800f;
            lVar.f27356m = billerName;
            AbstractC0780y.m(V.h(this), null, null, new p(lVar, q0.y(strO, "_", BaseApplication.getCountryLocale()), null, billerName), 3);
        }
    }

    public final void i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strB = H.b(G.o("queryMobileWalletTypeByPhoneByNew", str));
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(this), null, null, new u(this.f31802i, G.p("Pref_", strB, "_", BaseApplication.getCountryLocale()), null, str), 3);
    }

    public final void j() {
        String strB = H.b("queryTelecomOperatorListByNew");
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        AbstractC0780y.m(V.h(this), null, null, new y(this.f31803j, G.p("Pref_", strB, "_", BaseApplication.getCountryLocale()), null), 3);
    }
}
