package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Bc.C0108e;
import C0.G;
import Pa.C0525w;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.viewmodel.ModelPaymentResultProgress;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.ui.activity.BuyEarlyRefundResultActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p054dd.d;
import p071ef.b;
import p102ge.C1741n;
import p298tf.f;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/buy_early_refund_result_page")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/BuyEarlyRefundResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BuyEarlyRefundResultActivity extends BaseActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34446d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f34448b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0108e f34449c;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String strJ = C0525w.j(this.f34447a, "orderNo");
        Intrinsics.checkNotNullExpressionValue(strJ, "getJsonString(...)");
        this.f34448b = strJ;
        if (TextUtils.isEmpty(strJ)) {
            finish();
            return;
        }
        String str = this.f34448b;
        if (!TextUtils.isEmpty(str)) {
            ((PayApiService) c.f43141a.f14621b).queryBuyEarlyRefundOrderDetail(str).k(f.f42629b).i(b.a()).subscribe(new C1741n(this));
        }
        C0108e c0108e = this.f34449c;
        org.chromium.support_lib_boundary.util.b.c(c0108e != null ? (SingleAdView) c0108e.f688e : null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(Ac.f.main_activity_buy_early_refund_result, (ViewGroup) null, false);
        int i7 = e.bannerAdId;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = e.buttonContainer;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.itemCustomId;
                ModelPreviewItem modelPreviewItem = (ModelPreviewItem) p059e1.a.m(i7, viewInflate);
                if (modelPreviewItem != null) {
                    i7 = e.itemEndTime;
                    ModelPreviewItem modelPreviewItem2 = (ModelPreviewItem) p059e1.a.m(i7, viewInflate);
                    if (modelPreviewItem2 != null) {
                        i7 = e.itemPaymentMethod;
                        ModelPreviewItem modelPreviewItem3 = (ModelPreviewItem) p059e1.a.m(i7, viewInflate);
                        if (modelPreviewItem3 != null) {
                            i7 = e.itemTransId;
                            ModelPreviewItem modelPreviewItem4 = (ModelPreviewItem) p059e1.a.m(i7, viewInflate);
                            if (modelPreviewItem4 != null) {
                                i7 = e.itemTranstype;
                                ModelPreviewItem modelPreviewItem5 = (ModelPreviewItem) p059e1.a.m(i7, viewInflate);
                                if (modelPreviewItem5 != null) {
                                    i7 = e.payProgress;
                                    ModelPaymentResultProgress modelPaymentResultProgress = (ModelPaymentResultProgress) p059e1.a.m(i7, viewInflate);
                                    if (modelPaymentResultProgress != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                        i7 = e.textView1;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = e.textView2;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView2 != null) {
                                                C0108e c0108e = new C0108e(relativeLayout, singleAdView, modelPreviewItem, modelPreviewItem2, modelPreviewItem3, modelPreviewItem4, modelPreviewItem5, modelPaymentResultProgress, textView, textView2);
                                                this.f34449c = c0108e;
                                                return c0108e;
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

    public final void l() {
        C0108e c0108e = this.f34449c;
        if (c0108e != null) {
            c0108e.f685b.setOnClickListener(new d(7));
        }
        Integer numH = C0525w.h(this.f34447a, "payStatus");
        if (Intrinsics.c(numH, 1)) {
            C0108e c0108e2 = this.f34449c;
            if (c0108e2 != null) {
                ((ModelPaymentResultProgress) c0108e2.f694p).g("");
            }
            C0108e c0108e3 = this.f34449c;
            if (c0108e3 != null) {
                final int i7 = 0;
                c0108e3.f686c.setOnClickListener(new View.OnClickListener(this) { // from class: ge.m

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BuyEarlyRefundResultActivity f37223b;

                    {
                        this.f37223b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BuyEarlyRefundResultActivity buyEarlyRefundResultActivity = this.f37223b;
                        switch (i7) {
                            case 0:
                                int i10 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                            case 1:
                                int i11 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                            default:
                                int i12 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (Intrinsics.c(numH, 2)) {
            C0108e c0108e4 = this.f34449c;
            if (c0108e4 != null) {
                ((ModelPaymentResultProgress) c0108e4.f694p).d("");
            }
            C0108e c0108e5 = this.f34449c;
            if (c0108e5 != null) {
                final int i10 = 1;
                c0108e5.f686c.setOnClickListener(new View.OnClickListener(this) { // from class: ge.m

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ BuyEarlyRefundResultActivity f37223b;

                    {
                        this.f37223b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BuyEarlyRefundResultActivity buyEarlyRefundResultActivity = this.f37223b;
                        switch (i10) {
                            case 0:
                                int i11 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                            case 1:
                                int i12 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                            default:
                                int i13 = BuyEarlyRefundResultActivity.f34446d;
                                buyEarlyRefundResultActivity.finish();
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        C0108e c0108e6 = this.f34449c;
        if (c0108e6 != null) {
            ModelPaymentResultProgress modelPaymentResultProgress = (ModelPaymentResultProgress) c0108e6.f694p;
            modelPaymentResultProgress.e(0L, modelPaymentResultProgress.getContext().getString(k.core_msg_pending_get_rewards));
        }
        C0108e c0108e7 = this.f34449c;
        if (c0108e7 != null) {
            final int i11 = 2;
            c0108e7.f686c.setOnClickListener(new View.OnClickListener(this) { // from class: ge.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyEarlyRefundResultActivity f37223b;

                {
                    this.f37223b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyEarlyRefundResultActivity buyEarlyRefundResultActivity = this.f37223b;
                    switch (i11) {
                        case 0:
                            int i12 = BuyEarlyRefundResultActivity.f34446d;
                            buyEarlyRefundResultActivity.finish();
                            break;
                        case 1:
                            int i13 = BuyEarlyRefundResultActivity.f34446d;
                            buyEarlyRefundResultActivity.finish();
                            break;
                        default:
                            int i14 = BuyEarlyRefundResultActivity.f34446d;
                            buyEarlyRefundResultActivity.finish();
                            break;
                    }
                }
            });
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        G.u(MessageEvent.EVENT_BUY_EARLY_REFUND_FINISH_PAY, org.greenrobot.eventbus.c.b());
    }
}
