package com.transsnet.palmpay.r2c.ui.activity;

import L6.b;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pd.c;
import Pd.d;
import Rd.C0606w;
import Wf.AbstractC0780y;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.bean.rsp.R2COrderDetailResp;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.GetCustomerServiceUrlReq;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashResultActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashResultViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.collections.G;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p054dd.o;
import p054dd.p;
import p054dd.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "话费/换现金结果", path = "/airtime/recharge_2_cash_result", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/Recharge2CashResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/r2c/viewmodel/Recharge2CashResultViewModel;", "LRd/w;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecharge2CashResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recharge2CashResultActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n260#2,10:350\n296#2:360\n260#2,10:361\n296#2:371\n1869#3,2:372\n1#4:374\n*S KotlinDebug\n*F\n+ 1 Recharge2CashResultActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashResultActivity\n*L\n149#1:350,10\n149#1:360\n161#1:361,10\n161#1:371\n339#1:372,2\n*E\n"})
public final class Recharge2CashResultActivity extends BaseMvvmVBActivity<Recharge2CashResultViewModel, C0606w> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ArrayList f33131i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f33132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public R2COrderDetailResp f33134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33135g = 100;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33131i = C1850q.e(Recharge2CashHomeActivity.class);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((Recharge2CashResultViewModel) l()).f33138e;
        if (lVar != null) {
            lVar.e(this, new q(new p(this, this, 0), 0));
        }
        l lVar2 = ((Recharge2CashResultViewModel) l()).f33140g;
        if (lVar2 != null) {
            lVar2.e(this, new q(new p(this, this, 1), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_recharge_2_cash_result, (ViewGroup) null, false);
        int i7 = c.adSuccess;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = c.iv_view_detail;
            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = c.llBottom;
                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = c.ll_order_info;
                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout != null) {
                        i7 = c.ll_view_detail;
                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout2 != null) {
                            i7 = c.model_r2c_result_header_view;
                            TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) p059e1.a.m(i7, viewInflate);
                            if (transactionResultHeaderModel != null) {
                                i7 = c.title_bar;
                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = c.tv_btn_again;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = c.tvChangePlan;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = c.tv_complete_btn;
                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView3 != null) {
                                                i7 = c.tv_view_detail;
                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView4 != null) {
                                                    C0606w c0606w = new C0606w((RelativeLayout) viewInflate, singleAdView, linearLayout, linearLayout2, transactionResultHeaderModel, textView, textView2, textView3, textView4);
                                                    Intrinsics.checkNotNullExpressionValue(c0606w, "inflate(...)");
                                                    return c0606w;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final OrderResultItemModel n(CharSequence charSequence, int i7, String str) {
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, i7, str, charSequence);
        orderResultItemModel.setMinimumHeight(0);
        orderResultItemModel.setPadding(ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f), ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f));
        if (i7 == 1003) {
            orderResultItemModel.setOnCopyListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(26));
        }
        C0606w c0606w = (C0606w) this.f27334c;
        if (c0606w != null) {
            c0606w.f8534c.addView(orderResultItemModel);
        }
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AbstractC0780y.m(V.f(this), null, null, new o(this, null), 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        C0606w c0606w = (C0606w) this.f27334c;
        if (c0606w != null) {
            final int i7 = 0;
            c0606w.f8539i.setOnClickListener(new View.OnClickListener(this) { // from class: dd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashResultActivity f35892b;

                {
                    this.f35892b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashResultActivity recharge2CashResultActivity = this.f35892b;
                    switch (i7) {
                        case 0:
                            ArrayList arrayList = Recharge2CashResultActivity.f33131i;
                            i0.H(null);
                            n0 n0VarG = n0.g();
                            R2COrderDetailResp r2COrderDetailResp = recharge2CashResultActivity.f33134f;
                            Pair pair = new Pair("orderStatus", r2COrderDetailResp != null ? Integer.valueOf(r2COrderDetailResp.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp2 = recharge2CashResultActivity.f33134f;
                            n0VarG.n("RechargeToCashResultPage_CompleteButton", G.g(pair, new Pair("orderNo", r2COrderDetailResp2 != null ? r2COrderDetailResp2.orderNo : null)));
                            break;
                        case 1:
                            R2COrderDetailResp r2COrderDetailResp3 = recharge2CashResultActivity.f33134f;
                            if (r2COrderDetailResp3 != null) {
                                if (r2COrderDetailResp3.orderStatus == 1) {
                                    Iterator it = Recharge2CashResultActivity.f33131i.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Class cls = (Class) it.next();
                                            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                                                ActivityUtils.finishToActivity((Class<?>) cls, false);
                                                recharge2CashResultActivity.finish();
                                            }
                                        } else {
                                            i0.H(null);
                                        }
                                    }
                                    n0 n0VarG2 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp4 = recharge2CashResultActivity.f33134f;
                                    Pair pair2 = new Pair("orderStatus", r2COrderDetailResp4 != null ? Integer.valueOf(r2COrderDetailResp4.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp5 = recharge2CashResultActivity.f33134f;
                                    n0VarG2.n("RechargeToCashResultPage_SellAgainButton", G.g(pair2, new Pair("orderNo", r2COrderDetailResp5 != null ? r2COrderDetailResp5.orderNo : null)));
                                } else {
                                    i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
                                    n0 n0VarG3 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp6 = recharge2CashResultActivity.f33134f;
                                    Pair pair3 = new Pair("orderStatus", r2COrderDetailResp6 != null ? Integer.valueOf(r2COrderDetailResp6.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp7 = recharge2CashResultActivity.f33134f;
                                    n0VarG3.n("RechargeToCashResultPage_CustomerServiceButton", G.g(pair3, new Pair("orderNo", r2COrderDetailResp7 != null ? r2COrderDetailResp7.orderNo : null)));
                                }
                            }
                            break;
                        default:
                            String str = recharge2CashResultActivity.f33132d;
                            if (str != null) {
                                if (TextUtils.isEmpty(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    q0.v("/airtime/recharge_2_cash_detail", "orderNo", str);
                                }
                            }
                            n0 n0VarG4 = n0.g();
                            R2COrderDetailResp r2COrderDetailResp8 = recharge2CashResultActivity.f33134f;
                            Pair pair4 = new Pair("orderStatus", r2COrderDetailResp8 != null ? Integer.valueOf(r2COrderDetailResp8.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp9 = recharge2CashResultActivity.f33134f;
                            n0VarG4.n("RechargeToCashResultPage_ViewDetailButton", G.g(pair4, new Pair("orderNo", r2COrderDetailResp9 != null ? r2COrderDetailResp9.orderNo : null)));
                            break;
                    }
                }
            });
        }
        C0606w c0606w2 = (C0606w) this.f27334c;
        if (c0606w2 != null) {
            final int i10 = 1;
            c0606w2.f8537f.setOnClickListener(new View.OnClickListener(this) { // from class: dd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashResultActivity f35892b;

                {
                    this.f35892b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashResultActivity recharge2CashResultActivity = this.f35892b;
                    switch (i10) {
                        case 0:
                            ArrayList arrayList = Recharge2CashResultActivity.f33131i;
                            i0.H(null);
                            n0 n0VarG = n0.g();
                            R2COrderDetailResp r2COrderDetailResp = recharge2CashResultActivity.f33134f;
                            Pair pair = new Pair("orderStatus", r2COrderDetailResp != null ? Integer.valueOf(r2COrderDetailResp.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp2 = recharge2CashResultActivity.f33134f;
                            n0VarG.n("RechargeToCashResultPage_CompleteButton", G.g(pair, new Pair("orderNo", r2COrderDetailResp2 != null ? r2COrderDetailResp2.orderNo : null)));
                            break;
                        case 1:
                            R2COrderDetailResp r2COrderDetailResp3 = recharge2CashResultActivity.f33134f;
                            if (r2COrderDetailResp3 != null) {
                                if (r2COrderDetailResp3.orderStatus == 1) {
                                    Iterator it = Recharge2CashResultActivity.f33131i.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Class cls = (Class) it.next();
                                            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                                                ActivityUtils.finishToActivity((Class<?>) cls, false);
                                                recharge2CashResultActivity.finish();
                                            }
                                        } else {
                                            i0.H(null);
                                        }
                                    }
                                    n0 n0VarG2 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp4 = recharge2CashResultActivity.f33134f;
                                    Pair pair2 = new Pair("orderStatus", r2COrderDetailResp4 != null ? Integer.valueOf(r2COrderDetailResp4.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp5 = recharge2CashResultActivity.f33134f;
                                    n0VarG2.n("RechargeToCashResultPage_SellAgainButton", G.g(pair2, new Pair("orderNo", r2COrderDetailResp5 != null ? r2COrderDetailResp5.orderNo : null)));
                                } else {
                                    i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
                                    n0 n0VarG3 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp6 = recharge2CashResultActivity.f33134f;
                                    Pair pair3 = new Pair("orderStatus", r2COrderDetailResp6 != null ? Integer.valueOf(r2COrderDetailResp6.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp7 = recharge2CashResultActivity.f33134f;
                                    n0VarG3.n("RechargeToCashResultPage_CustomerServiceButton", G.g(pair3, new Pair("orderNo", r2COrderDetailResp7 != null ? r2COrderDetailResp7.orderNo : null)));
                                }
                            }
                            break;
                        default:
                            String str = recharge2CashResultActivity.f33132d;
                            if (str != null) {
                                if (TextUtils.isEmpty(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    q0.v("/airtime/recharge_2_cash_detail", "orderNo", str);
                                }
                            }
                            n0 n0VarG4 = n0.g();
                            R2COrderDetailResp r2COrderDetailResp8 = recharge2CashResultActivity.f33134f;
                            Pair pair4 = new Pair("orderStatus", r2COrderDetailResp8 != null ? Integer.valueOf(r2COrderDetailResp8.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp9 = recharge2CashResultActivity.f33134f;
                            n0VarG4.n("RechargeToCashResultPage_ViewDetailButton", G.g(pair4, new Pair("orderNo", r2COrderDetailResp9 != null ? r2COrderDetailResp9.orderNo : null)));
                            break;
                    }
                }
            });
        }
        C0606w c0606w3 = (C0606w) this.f27334c;
        if (c0606w3 != null) {
            final int i11 = 2;
            c0606w3.f8535d.setOnClickListener(new View.OnClickListener(this) { // from class: dd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashResultActivity f35892b;

                {
                    this.f35892b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashResultActivity recharge2CashResultActivity = this.f35892b;
                    switch (i11) {
                        case 0:
                            ArrayList arrayList = Recharge2CashResultActivity.f33131i;
                            i0.H(null);
                            n0 n0VarG = n0.g();
                            R2COrderDetailResp r2COrderDetailResp = recharge2CashResultActivity.f33134f;
                            Pair pair = new Pair("orderStatus", r2COrderDetailResp != null ? Integer.valueOf(r2COrderDetailResp.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp2 = recharge2CashResultActivity.f33134f;
                            n0VarG.n("RechargeToCashResultPage_CompleteButton", G.g(pair, new Pair("orderNo", r2COrderDetailResp2 != null ? r2COrderDetailResp2.orderNo : null)));
                            break;
                        case 1:
                            R2COrderDetailResp r2COrderDetailResp3 = recharge2CashResultActivity.f33134f;
                            if (r2COrderDetailResp3 != null) {
                                if (r2COrderDetailResp3.orderStatus == 1) {
                                    Iterator it = Recharge2CashResultActivity.f33131i.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            Class cls = (Class) it.next();
                                            if (ActivityUtils.isActivityExistsInStack((Class<?>) cls)) {
                                                ActivityUtils.finishToActivity((Class<?>) cls, false);
                                                recharge2CashResultActivity.finish();
                                            }
                                        } else {
                                            i0.H(null);
                                        }
                                    }
                                    n0 n0VarG2 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp4 = recharge2CashResultActivity.f33134f;
                                    Pair pair2 = new Pair("orderStatus", r2COrderDetailResp4 != null ? Integer.valueOf(r2COrderDetailResp4.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp5 = recharge2CashResultActivity.f33134f;
                                    n0VarG2.n("RechargeToCashResultPage_SellAgainButton", G.g(pair2, new Pair("orderNo", r2COrderDetailResp5 != null ? r2COrderDetailResp5.orderNo : null)));
                                } else {
                                    i0.c0(com.transsnet.palmpay.core.config.d.c(GetCustomerServiceUrlReq.ENTER_TYPE_ORDER_DETAIL));
                                    n0 n0VarG3 = n0.g();
                                    R2COrderDetailResp r2COrderDetailResp6 = recharge2CashResultActivity.f33134f;
                                    Pair pair3 = new Pair("orderStatus", r2COrderDetailResp6 != null ? Integer.valueOf(r2COrderDetailResp6.orderStatus) : null);
                                    R2COrderDetailResp r2COrderDetailResp7 = recharge2CashResultActivity.f33134f;
                                    n0VarG3.n("RechargeToCashResultPage_CustomerServiceButton", G.g(pair3, new Pair("orderNo", r2COrderDetailResp7 != null ? r2COrderDetailResp7.orderNo : null)));
                                }
                            }
                            break;
                        default:
                            String str = recharge2CashResultActivity.f33132d;
                            if (str != null) {
                                if (TextUtils.isEmpty(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    q0.v("/airtime/recharge_2_cash_detail", "orderNo", str);
                                }
                            }
                            n0 n0VarG4 = n0.g();
                            R2COrderDetailResp r2COrderDetailResp8 = recharge2CashResultActivity.f33134f;
                            Pair pair4 = new Pair("orderStatus", r2COrderDetailResp8 != null ? Integer.valueOf(r2COrderDetailResp8.orderStatus) : null);
                            R2COrderDetailResp r2COrderDetailResp9 = recharge2CashResultActivity.f33134f;
                            n0VarG4.n("RechargeToCashResultPage_ViewDetailButton", G.g(pair4, new Pair("orderNo", r2COrderDetailResp9 != null ? r2COrderDetailResp9.orderNo : null)));
                            break;
                    }
                }
            });
        }
    }
}
