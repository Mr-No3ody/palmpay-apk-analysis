package com.transsnet.palmpay.ui.activity.coupon;

import Bc.f;
import C0.G;
import D6.a;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import V8.w;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.provider.m;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.bean.CouponPackageOrderBean;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.viewmodule.CouponPackageViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p025ba.k;
import p042cg.e;
import p068ec.d;
import p141j9.s;
import p146je.c;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/coupon_package_result")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/coupon/CouponPackageResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/CouponPackageViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCouponPackageResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponPackageResultActivity.kt\ncom/transsnet/palmpay/ui/activity/coupon/CouponPackageResultActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n562#2,10:357\n115#3,8:367\n145#3:375\n1869#4,2:376\n*S KotlinDebug\n*F\n+ 1 CouponPackageResultActivity.kt\ncom/transsnet/palmpay/ui/activity/coupon/CouponPackageResultActivity\n*L\n99#1:357,10\n106#1:367,8\n106#1:375\n320#1:376,2\n*E\n"})
public final class CouponPackageResultActivity extends BaseMvvmActivity<CouponPackageViewModel> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f34663o = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PayByOrderResp.DataBean f34664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CouponPackageOrderBean f34665d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f34668g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f34670j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f34666e = C1850q.e("com.transsnet.palmpay.core.ui.activity.PPRNActivity");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f34667f = 100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f34669i = C2131j.b(new d(this, 5));

    public static final void m(CouponPackageResultActivity couponPackageResultActivity) {
        TextView orderResultStatusTipsTv;
        TextView orderResultStatusTipsTv2;
        Long l5;
        f fVar;
        TextView orderResultStatusTipsTv3;
        int i7 = 1;
        PayByOrderResp.DataBean dataBean = couponPackageResultActivity.f34664c;
        if (dataBean != null) {
            C0525w c0525wF = C0525w.f();
            String str = dataBean.orderData;
            c0525wF.getClass();
            couponPackageResultActivity.f34665d = (CouponPackageOrderBean) C0525w.d(str, CouponPackageOrderBean.class);
            PayByOrderResp.DataBean dataBean2 = couponPackageResultActivity.f34664c;
            if (dataBean2 != null) {
                int i10 = dataBean2.payStatus;
                if (i10 == 1) {
                    TransactionResultHeaderModel transactionResultHeaderModelO = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO != null) {
                        transactionResultHeaderModelO.j();
                    }
                    TransactionResultHeaderModel transactionResultHeaderModelO2 = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO2 != null) {
                        transactionResultHeaderModelO2.g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, couponPackageResultActivity, 0.0f, 2, null));
                    }
                    if (TextUtils.isEmpty(dataBean2.successfulDesc)) {
                        TransactionResultHeaderModel transactionResultHeaderModelO3 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO3 != null && (orderResultStatusTipsTv3 = transactionResultHeaderModelO3.getOrderResultStatusTipsTv()) != null) {
                            h.c(orderResultStatusTipsTv3);
                        }
                    } else {
                        TransactionResultHeaderModel transactionResultHeaderModelO4 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO4 != null) {
                            transactionResultHeaderModelO4.h(dataBean2.successfulDesc);
                        }
                    }
                    CouponPackageOrderBean couponPackageOrderBean = couponPackageResultActivity.f34665d;
                    if (couponPackageOrderBean != null) {
                        String str2 = couponPackageOrderBean.payResultLinkUrl;
                        String str3 = couponPackageOrderBean.payResultBanner;
                        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && (fVar = couponPackageResultActivity.f34670j) != null) {
                            AsyncViewStub asyncViewStub = (AsyncViewStub) fVar.f700f;
                            a aVar = new a(couponPackageResultActivity, 4, str3, str2);
                            int i11 = AsyncViewStub.f31184d;
                            asyncViewStub.b(true, aVar);
                        }
                    }
                    f fVar2 = couponPackageResultActivity.f34670j;
                    if (fVar2 != null) {
                        h.C((Button) fVar2.f702i);
                    }
                    f fVar3 = couponPackageResultActivity.f34670j;
                    if (fVar3 != null) {
                        ((Button) fVar3.f702i).setText(couponPackageResultActivity.getString(Ac.h.main_view_coupon));
                    }
                    f fVar4 = couponPackageResultActivity.f34670j;
                    if (fVar4 != null) {
                        ((Button) fVar4.f702i).setOnClickListener(new p054dd.d(22));
                    }
                } else if (i10 == 0) {
                    if (TextUtils.isEmpty(dataBean2.pendingDesc)) {
                        TransactionResultHeaderModel transactionResultHeaderModelO5 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO5 != null && (orderResultStatusTipsTv2 = transactionResultHeaderModelO5.getOrderResultStatusTipsTv()) != null) {
                            h.c(orderResultStatusTipsTv2);
                        }
                    } else {
                        TransactionResultHeaderModel transactionResultHeaderModelO6 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO6 != null) {
                            transactionResultHeaderModelO6.h(dataBean2.pendingDesc);
                        }
                    }
                    TransactionResultHeaderModel transactionResultHeaderModelO7 = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO7 != null) {
                        transactionResultHeaderModelO7.g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, couponPackageResultActivity, 0.0f, 2, null));
                    }
                    TransactionResultHeaderModel transactionResultHeaderModelO8 = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO8 != null) {
                        transactionResultHeaderModelO8.i(dataBean2.pendingAcTime - System.currentTimeMillis(), V.f(couponPackageResultActivity));
                    }
                    CoroutineScope coroutineScopeH = V.h(couponPackageResultActivity.l());
                    p042cg.f fVar5 = I.f10809a;
                    AbstractC0780y.m(coroutineScopeH, e.f19009c, null, new c(couponPackageResultActivity, null), 2);
                    long j6 = couponPackageResultActivity.f34667f;
                    if (j6 < 5000) {
                        couponPackageResultActivity.f34667f = j6 + ((long) 1500);
                    }
                } else {
                    TransactionResultHeaderModel transactionResultHeaderModelO9 = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO9 != null) {
                        transactionResultHeaderModelO9.j();
                    }
                    TransactionResultHeaderModel transactionResultHeaderModelO10 = couponPackageResultActivity.o();
                    if (transactionResultHeaderModelO10 != null) {
                        transactionResultHeaderModelO10.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, couponPackageResultActivity, 0.0f, 2, null));
                    }
                    if (TextUtils.isEmpty(dataBean2.errorMsg)) {
                        TransactionResultHeaderModel transactionResultHeaderModelO11 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO11 != null && (orderResultStatusTipsTv = transactionResultHeaderModelO11.getOrderResultStatusTipsTv()) != null) {
                            h.c(orderResultStatusTipsTv);
                        }
                    } else {
                        TransactionResultHeaderModel transactionResultHeaderModelO12 = couponPackageResultActivity.o();
                        if (transactionResultHeaderModelO12 != null) {
                            transactionResultHeaderModelO12.h(dataBean2.errorMsg);
                        }
                    }
                    f fVar6 = couponPackageResultActivity.f34670j;
                    if (fVar6 != null) {
                        ((Button) fVar6.f702i).setText(couponPackageResultActivity.getString(k.core_try_again));
                    }
                    f fVar7 = couponPackageResultActivity.f34670j;
                    if (fVar7 != null) {
                        h.C((Button) fVar7.f702i);
                    }
                    f fVar8 = couponPackageResultActivity.f34670j;
                    if (fVar8 != null) {
                        ((Button) fVar8.f702i).setOnClickListener(new p146je.a(couponPackageResultActivity, 0));
                    }
                }
                TransactionResultHeaderModel transactionResultHeaderModelO13 = couponPackageResultActivity.o();
                if (transactionResultHeaderModelO13 != null) {
                    transactionResultHeaderModelO13.e(dataBean2.payStatusDesc);
                }
                TransactionResultHeaderModel transactionResultHeaderModelO14 = couponPackageResultActivity.o();
                if (transactionResultHeaderModelO14 != null) {
                    CouponPackageOrderBean couponPackageOrderBean2 = couponPackageResultActivity.f34665d;
                    transactionResultHeaderModelO14.c(r0.B((couponPackageOrderBean2 == null || (l5 = couponPackageOrderBean2.payAmount) == null) ? 0L : l5.longValue(), true));
                }
                f fVar9 = couponPackageResultActivity.f34670j;
                if (fVar9 != null) {
                    h.s((LinearLayout) fVar9.f699e, true);
                }
                f fVar10 = couponPackageResultActivity.f34670j;
                if (fVar10 != null) {
                    ((Button) fVar10.f701g).setOnClickListener(new p146je.a(couponPackageResultActivity, i7));
                }
                CouponPackageOrderBean couponPackageOrderBean3 = couponPackageResultActivity.f34665d;
                if (couponPackageOrderBean3 != null) {
                    SpanUtils spanUtils = new SpanUtils();
                    String str4 = couponPackageOrderBean3.beneficiaryName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    SpanUtils spanUtilsAppendLine = spanUtils.appendLine(str4);
                    String str5 = couponPackageOrderBean3.beneficiaryAccount;
                    n(couponPackageResultActivity, "Beneficiary Account", spanUtilsAppendLine.append(str5 != null ? str5 : "").setForegroundColor(couponPackageResultActivity.getColor(b.ppColorTextDisable)).setFontSize(12, true).create());
                    n(couponPackageResultActivity, "Item Name", couponPackageOrderBean3.couponName);
                    TextView textView = new TextView(couponPackageResultActivity);
                    textView.setText(G.i("View Detail").appendImage(r.cv_purple_arrow_right_bold).create());
                    textView.setGravity(17);
                    textView.setTextColor(couponPackageResultActivity.getColor(b.ppColorPrimary));
                    textView.setTextSize(12.0f);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ScreenUtils.dip2px(42.0f)));
                    textView.setOnClickListener(new p146je.a(couponPackageResultActivity, 3));
                    f fVar11 = couponPackageResultActivity.f34670j;
                    if (fVar11 != null) {
                        ((LinearLayout) fVar11.f698d).addView(textView);
                    }
                }
            }
        }
    }

    public static void n(CouponPackageResultActivity couponPackageResultActivity, String str, CharSequence charSequence) {
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(couponPackageResultActivity, 1002, str, charSequence);
        orderResultItemModel.setMinimumHeight(0);
        orderResultItemModel.setPadding(ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f), ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f));
        f fVar = couponPackageResultActivity.f34670j;
        if (fVar != null) {
            ((LinearLayout) fVar.f698d).addView(orderResultItemModel);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new m(23, uIHandler, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(Ac.f.main_activity_coupon_package_result, (ViewGroup) null, false);
        int i7 = Ac.e.asyncSingleAd;
        AsyncViewStub asyncViewStub = (AsyncViewStub) p059e1.a.m(i7, viewInflate);
        if (asyncViewStub != null) {
            i7 = Ac.e.llOrderInfo;
            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
            if (linearLayout != null) {
                i7 = Ac.e.result_left_btn;
                Button button = (Button) p059e1.a.m(i7, viewInflate);
                if (button != null) {
                    i7 = Ac.e.result_right_btn;
                    Button button2 = (Button) p059e1.a.m(i7, viewInflate);
                    if (button2 != null) {
                        i7 = Ac.e.result_two_btn_view;
                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                            i7 = Ac.e.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = Ac.e.vs_header;
                                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                if (viewStub != null) {
                                    f fVar = new f(linearLayout3, asyncViewStub, linearLayout, button, button2, linearLayout2, ppTitleBar, viewStub);
                                    this.f34670j = fVar;
                                    return fVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final TransactionResultHeaderModel o() {
        return (TransactionResultHeaderModel) this.f34669i.getValue();
    }

    public final void p() {
        Iterator it = this.f34666e.iterator();
        while (it.hasNext()) {
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack((String) it.next());
            if (activityIsActivityExistsInStack != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                finish();
                return;
            }
        }
        i0.H(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((CouponPackageViewModel) l()).f35362e;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 16), (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(-1);
        ARouter.getInstance().inject(this);
    }
}
