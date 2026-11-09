package com.transsnet.palmpay.core.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.ExpressageInfoBean;
import com.transsnet.palmpay.core.bean.rsp.ExpressInfo;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/coreImpl/expressage_infomation")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/ExpressageInfoActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressageInfoActivity extends BaseActivity {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f27618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f27619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p355xf.t f27620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p355xf.t f27621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f27622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f27623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p355xf.t f27624g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p052da.M f27625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f27626j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27627o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f27628p;

    public ExpressageInfoActivity() {
        final int i7 = 0;
        this.f27618a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i7) {
                    case 0:
                        int i10 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i11 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i12 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i13 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i14 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i15 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i16 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i10 = 1;
        this.f27619b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i10) {
                    case 0:
                        int i11 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i12 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i13 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i14 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i15 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i16 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i17 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i11 = 2;
        this.f27620c = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i11) {
                    case 0:
                        int i12 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i13 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i14 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i15 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i16 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i17 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i18 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i12 = 3;
        this.f27621d = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i12) {
                    case 0:
                        int i13 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i14 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i15 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i16 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i17 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i18 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i19 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i13 = 4;
        this.f27622e = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i13) {
                    case 0:
                        int i14 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i15 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i16 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i17 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i18 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i19 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i110 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i14 = 5;
        this.f27623f = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i14) {
                    case 0:
                        int i15 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i16 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i17 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i18 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i19 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i110 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i111 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
        final int i15 = 6;
        this.f27624g = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpressageInfoActivity f27705b;

            {
                this.f27705b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ExpressageInfoActivity expressageInfoActivity = this.f27705b;
                switch (i15) {
                    case 0:
                        int i16 = ExpressageInfoActivity.t;
                        return (RecyclerView) expressageInfoActivity.findViewById(L9.a.gaeiRcv);
                    case 1:
                        int i17 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.shippingToTv);
                    case 2:
                        int i18 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.shippingToView);
                    case 3:
                        int i19 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiOrderNoTv);
                    case 4:
                        int i110 = ExpressageInfoActivity.t;
                        return (TextView) expressageInfoActivity.findViewById(L9.a.gaeiCompanyTv);
                    case 5:
                        int i111 = ExpressageInfoActivity.t;
                        return (LinearLayout) expressageInfoActivity.findViewById(L9.a.cae_content);
                    default:
                        int i112 = ExpressageInfoActivity.t;
                        return (ModelEmptyView) expressageInfoActivity.findViewById(L9.a.cae_empty_view);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(ExpressageInfoActivity expressageInfoActivity, CommonBeanResult commonBeanResult) {
        T t3 = commonBeanResult.data;
        if (t3 == 0) {
            ((LinearLayout) expressageInfoActivity.f27623f.getValue()).setVisibility(8);
            ((ModelEmptyView) expressageInfoActivity.f27624g.getValue()).setVisibility(0);
            return;
        }
        ExpressInfo expressInfo = (ExpressInfo) t3;
        ((TextView) expressageInfoActivity.f27622e.getValue()).setText(expressInfo.shippingCompany);
        ((TextView) expressageInfoActivity.f27621d.getValue()).setText(expressInfo.shippingNo);
        if (expressInfo.shoppingAddress != null) {
            ((LinearLayout) expressageInfoActivity.f27620c.getValue()).setVisibility(0);
            ((TextView) expressageInfoActivity.f27619b.getValue()).setText(expressInfo.shoppingAddress.fullAddressInfo);
        }
        if (expressInfo.trackList != null) {
            ArrayList arrayList = expressageInfoActivity.f27626j;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList arrayList2 = expressageInfoActivity.f27626j;
            if (arrayList2 != null) {
                List<ExpressageInfoBean> list = expressInfo.trackList;
                Intrinsics.f(list, "null cannot be cast to non-null type java.util.ArrayList<com.transsnet.palmpay.core.bean.ExpressageInfoBean>");
                arrayList2.addAll((ArrayList) list);
            }
            p052da.M m7 = expressageInfoActivity.f27625i;
            if (m7 != null) {
                m7.notifyDataSetChanged();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return L9.b.core_activity_expressage_info;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ARouter.getInstance().inject(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        int i7 = this.f27628p;
        if (i7 == 0) {
            if (TextUtils.isEmpty(this.f27627o)) {
                ToastUtils.showShort("No order number", new Object[0]);
                return;
            }
            PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
            String str = this.f27627o;
            Intrinsics.e(str);
            payApiService.queryGroupBuyExpressInfo(str).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new S(this, 1));
            return;
        }
        if (1 == i7) {
            if (TextUtils.isEmpty(this.f27627o)) {
                ToastUtils.showShort("No order number", new Object[0]);
                return;
            }
            PayApiService payApiService2 = (PayApiService) p324va.c.f43141a.f14621b;
            String str2 = this.f27627o;
            Intrinsics.e(str2);
            payApiService2.queryMallExpressInfo(str2).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new S(this, 2));
            return;
        }
        if (TextUtils.isEmpty(this.f27627o)) {
            ToastUtils.showShort("No order number", new Object[0]);
            return;
        }
        PayApiService payApiService3 = (PayApiService) p324va.c.f43141a.f14621b;
        String str3 = this.f27627o;
        Intrinsics.e(str3);
        payApiService3.queryCoinExpressInfo(str3).i(p071ef.b.a()).k(p298tf.f.f42629b).subscribe(new S(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        BarUtils.setStatusBarLightMode((Activity) this, true);
        this.f27625i = new p052da.M(this);
        p355xf.t tVar = this.f27618a;
        ((RecyclerView) tVar.getValue()).setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((RecyclerView) tVar.getValue()).setAdapter(this.f27625i);
        ArrayList arrayList = new ArrayList();
        this.f27626j = arrayList;
        p052da.M m7 = this.f27625i;
        if (m7 != null) {
            m7.f4985b = arrayList;
        }
        p355xf.t tVar2 = this.f27624g;
        ((ModelEmptyView) tVar2.getValue()).f31511b.setImageResource(com.transsnet.palmpay.custom_view.r.cv_empty_no_shop);
        ((ModelEmptyView) tVar2.getValue()).f31512c.setText(p025ba.k.core_shipping_empty_hint);
    }
}
