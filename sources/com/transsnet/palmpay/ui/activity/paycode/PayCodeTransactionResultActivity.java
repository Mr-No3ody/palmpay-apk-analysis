package com.transsnet.palmpay.ui.activity.paycode;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.q;
import C0.G;
import L6.g;
import Pa.i0;
import Pa.r0;
import V8.w;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.analysis.utils.GsonUtil;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.main.export.bean.rsp.PayCodeOrderDetailBean;
import com.transsnet.palmpay.ui.activity.thirdpartymerchant.MerchantPaymentActivity;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.IntentUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.viewmodule.PayCodeTransctionResultViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p051d9.C1605b;
import p059e1.a;
import p068ec.d;
import p141j9.s;
import p238pe.b;
import p355xf.C2131j;
import p355xf.t;
import p377z5.j;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/paycode_result")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/paycode/PayCodeTransactionResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/PayCodeTransctionResultViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayCodeTransactionResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayCodeTransactionResultActivity.kt\ncom/transsnet/palmpay/ui/activity/paycode/PayCodeTransactionResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,591:1\n1#2:592\n260#3,10:593\n296#3:603\n*S KotlinDebug\n*F\n+ 1 PayCodeTransactionResultActivity.kt\ncom/transsnet/palmpay/ui/activity/paycode/PayCodeTransactionResultActivity\n*L\n196#1:593,10\n196#1:603\n*E\n"})
public final class PayCodeTransactionResultActivity extends BaseMvvmActivity<PayCodeTransctionResultViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f34792A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34796f = C2131j.b(new d(this, 10));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34797g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f34798i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34799j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f34800o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f34801p;
    public PayCodeOrderDetailBean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f34802v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f34803w;

    public PayCodeTransactionResultActivity() {
        new Handler(Looper.getMainLooper());
        this.f34803w = new b(this, 1);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        q qVar = this.f34802v;
        if (qVar != null) {
            ((TransactionResultHeaderModel) qVar.f823o).c(r0.B(this.f34801p, true));
        }
        l lVar = ((PayCodeTransctionResultViewModel) l()).f35400e;
        if (lVar != null) {
            lVar.e(this, new s(new w(19, this, this), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_pay_code_transaction_result, (ViewGroup) null, false);
        int i7 = e.ivDetail;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
        if (iconicsImageView != null) {
            i7 = e.llBottom;
            if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                i7 = e.llOrderInfo;
                LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                if (linearLayout != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                    i7 = e.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                    if (ppTitleBar != null && (viewM = a.m((i7 = e.titleBarBg), viewInflate)) != null) {
                        i7 = e.tvComplete;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = e.tvDetail;
                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = e.viewDetail;
                                LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                                if (linearLayout2 != null) {
                                    i7 = e.viewHeader;
                                    TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) a.m(i7, viewInflate);
                                    if (transactionResultHeaderModel != null) {
                                        q qVar = new q(relativeLayout, iconicsImageView, linearLayout, ppTitleBar, viewM, textView, textView2, linearLayout2, transactionResultHeaderModel);
                                        this.f34802v = qVar;
                                        return qVar;
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

    public final void m() {
        String str;
        Intent intentU;
        if (TextUtils.isEmpty(this.f34795e)) {
            i0.H(null);
            return;
        }
        try {
            String str2 = this.f34795e;
            if ((str2 == null || !y.m(str2, "https://", false)) && ((str = this.f34795e) == null || !y.m(str, "http://", false))) {
                intentU = i0.u(this.f34795e);
            } else {
                intentU = IntentUtils.getOpenUrlIntent(this.f34795e, true);
                MerchantPaymentActivity.a aVar = MerchantPaymentActivity.f34976c;
                if (!TextUtils.isEmpty(aVar.getLauncher())) {
                    F6.d.h(this.TAG, 3, "backToCaller: " + aVar.getLauncher());
                    intentU.setPackage(aVar.getLauncher());
                    if (getPackageManager().resolveActivity(intentU, 65536) == null) {
                        intentU.setPackage(null);
                    }
                }
            }
            if (intentU != null) {
                intentU.addFlags(268435456);
                startActivity(intentU);
            } else {
                i0.H(null);
            }
            String str3 = this.f34795e;
            if (str3 == null || !y.m(str3, "palmpay://", false)) {
                ActivityUtils.finishOtherActivities(PayCodeTransactionResultActivity.class);
                finishAndRemoveTask();
            } else {
                ActivityUtils.finishOtherActivities(PayCodeTransactionResultActivity.class);
                finish();
            }
        } catch (Exception unused) {
            i0.H(null);
        }
    }

    public final void n(String str) {
        PayCodeOrderDetailBean payCodeOrderDetailBean;
        TextView orderStatusTv;
        q qVar;
        q qVar2;
        Long l5;
        Long l6;
        q qVar3;
        Long l8;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    PayCodeOrderDetailBean payCodeOrderDetailBean2 = (PayCodeOrderDetailBean) GsonUtil.get().fromJson(str, PayCodeOrderDetailBean.class);
                    this.t = payCodeOrderDetailBean2;
                    this.f34801p = (payCodeOrderDetailBean2 == null || (l8 = payCodeOrderDetailBean2.payAmount) == null) ? 0L : l8.longValue();
                } catch (Exception unused) {
                }
            }
        }
        if (i0.W(this) && (payCodeOrderDetailBean = this.t) != null) {
            q qVar4 = this.f34802v;
            if (qVar4 != null) {
                ((LinearLayout) qVar4.f818e).removeAllViews();
            }
            q qVar5 = this.f34802v;
            if (qVar5 != null) {
                LinearLayout linearLayout = (LinearLayout) qVar5.f818e;
                int i7 = h.main_merchant_name;
                String str2 = payCodeOrderDetailBean.payeeMerchantName;
                if (str2 == null) {
                    str2 = "";
                }
                linearLayout.addView(new OrderResultItemModel(this, i7, str2));
            }
            q qVar6 = this.f34802v;
            if (qVar6 != null) {
                LinearLayout linearLayout2 = (LinearLayout) qVar6.f818e;
                int i10 = h.main_goods_name;
                String str3 = payCodeOrderDetailBean.goodsName;
                if (str3 == null) {
                    str3 = "";
                }
                linearLayout2.addView(new OrderResultItemModel(this, i10, str3));
            }
            if (Intrinsics.c(this.f34794d, "74")) {
                q qVar7 = this.f34802v;
                if (qVar7 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) qVar7.f818e;
                    int i11 = k.core_amount;
                    Long l10 = payCodeOrderDetailBean.amount;
                    linearLayout3.addView(new OrderResultItemModel(this, i11, r0.B(l10 != null ? l10.longValue() : 0L, false)));
                }
                q qVar8 = this.f34802v;
                if (qVar8 != null) {
                    p220oa.h.s((LinearLayout) qVar8.f819f, false);
                }
            }
            Long l11 = payCodeOrderDetailBean.discountAmount;
            if (l11 != null) {
                if (l11.longValue() <= 0) {
                    l11 = null;
                }
                if (l11 != null) {
                    String strO = G.o("- ", r0.B(l11.longValue(), true));
                    q qVar9 = this.f34802v;
                    if (qVar9 != null) {
                        ((LinearLayout) qVar9.f818e).addView(new OrderResultItemModel(this, 1002, getString(v.cv_discount), strO));
                    }
                }
            }
            Long l12 = payCodeOrderDetailBean.loyaltyPoint;
            if (l12 != null) {
                if (l12.longValue() <= 0) {
                    l12 = null;
                }
                if (l12 != null) {
                    String strI = u.i(l12.longValue(), "- ");
                    q qVar10 = this.f34802v;
                    if (qVar10 != null) {
                        ((LinearLayout) qVar10.f818e).addView(new OrderResultItemModel(this, 1002, getString(k.core_palm_points_used), strI));
                    }
                }
            }
            Long l13 = payCodeOrderDetailBean.couponAmount;
            if (l13 != null) {
                if (l13.longValue() <= 0) {
                    l13 = null;
                }
                if (l13 != null) {
                    String strO2 = G.o("- ", r0.B(l13.longValue(), false));
                    q qVar11 = this.f34802v;
                    if (qVar11 != null) {
                        ((LinearLayout) qVar11.f818e).addView(new OrderResultItemModel(this, 1002, getString(k.core_coupon_amount), strO2));
                    }
                }
            }
            Long l14 = payCodeOrderDetailBean.paymentMethodDiscount;
            if (l14 != null) {
                if (l14.longValue() <= 0) {
                    l14 = null;
                }
                if (l14 != null) {
                    String strO3 = G.o("- ", r0.B(l14.longValue(), true));
                    q qVar12 = this.f34802v;
                    if (qVar12 != null) {
                        ((LinearLayout) qVar12.f818e).addView(new OrderResultItemModel(this, 1002, getString(k.core_flexi_discount), strO3));
                    }
                }
            }
            Long l15 = payCodeOrderDetailBean.discountAmount;
            if (l15 != null && l15.longValue() == 0 && (l5 = payCodeOrderDetailBean.couponAmount) != null && l5.longValue() == 0 && (l6 = payCodeOrderDetailBean.loyaltyPoint) != null && l6.longValue() == 0 && !TextUtils.isEmpty(payCodeOrderDetailBean.payTypeDesc) && (qVar3 = this.f34802v) != null) {
                ((LinearLayout) qVar3.f818e).addView(new OrderResultItemModel(this, 1002, getString(k.core_payment_method), payCodeOrderDetailBean.payTypeDesc));
            }
            if (Intrinsics.c(this.f34794d, "74") && (qVar2 = this.f34802v) != null) {
                ((LinearLayout) qVar2.f818e).addView(new OrderResultItemModel(this, "Merchant Order ID", payCodeOrderDetailBean.merchantOrderNo));
            }
            Integer num = payCodeOrderDetailBean.payStatus;
            if (Intrinsics.c(num, 1)) {
                if (Intrinsics.c(this.f34794d, "74") && (qVar = this.f34802v) != null) {
                    ((LinearLayout) qVar.f818e).addView(new OrderResultItemModel(this, k.core_receipt_transaction_id, payCodeOrderDetailBean.orderNo));
                }
                q qVar13 = this.f34802v;
                if (qVar13 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) qVar13.f818e;
                    int i12 = k.core_completion_time;
                    Long l16 = payCodeOrderDetailBean.orderSuccessTime;
                    linearLayout4.addView(new OrderResultItemModel(this, i12, r0.N(l16 != null ? l16.longValue() : 0L)));
                }
                q qVar14 = this.f34802v;
                if (qVar14 != null) {
                    ((TransactionResultHeaderModel) qVar14.f823o).j();
                }
                q qVar15 = this.f34802v;
                if (qVar15 != null) {
                    ((TransactionResultHeaderModel) qVar15.f823o).e(getString(k.core_successful));
                }
                q qVar16 = this.f34802v;
                if (qVar16 != null) {
                    ((TransactionResultHeaderModel) qVar16.f823o).h("");
                }
                q qVar17 = this.f34802v;
                if (qVar17 != null) {
                    ((TransactionResultHeaderModel) qVar17.f823o).g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                }
                Long l17 = payCodeOrderDetailBean.returnPoint;
                if (l17 != null) {
                    Long l18 = l17.longValue() > 0 ? l17 : null;
                    if (l18 != null) {
                        long jLongValue = l18.longValue();
                        SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("+ " + jLongValue).setForegroundColor(getColor(L6.b.ppColorWarning)).create();
                        q qVar18 = this.f34802v;
                        if (qVar18 != null) {
                            ((LinearLayout) qVar18.f818e).addView(new OrderResultItemModel(this, 1002, getString(k.core_cashback_earned), spannableStringBuilderCreate));
                        }
                    }
                }
            } else if (Intrinsics.c(num, 2)) {
                q qVar19 = this.f34802v;
                if (qVar19 != null) {
                    ((TransactionResultHeaderModel) qVar19.f823o).j();
                }
                q qVar20 = this.f34802v;
                if (qVar20 != null) {
                    ((TransactionResultHeaderModel) qVar20.f823o).e(getString(k.core_transaction_failed));
                }
                q qVar21 = this.f34802v;
                if (qVar21 != null) {
                    ((TransactionResultHeaderModel) qVar21.f823o).g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                }
                if (TextUtils.isEmpty(this.f34800o)) {
                    q qVar22 = this.f34802v;
                    if (qVar22 != null) {
                        ((TransactionResultHeaderModel) qVar22.f823o).h(getString(k.core_transaction_failed));
                    }
                } else {
                    q qVar23 = this.f34802v;
                    if (qVar23 != null) {
                        ((TransactionResultHeaderModel) qVar23.f823o).h(this.f34800o);
                    }
                }
            } else {
                String str4 = this.f34798i;
                String str5 = this.f34797g;
                q qVar24 = this.f34802v;
                if (qVar24 != null) {
                    TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) qVar24.f823o;
                    C1605b c1605b = new C1605b(14, this, str4);
                    p238pe.d dVar = new p238pe.d(this, str5, null);
                    transactionResultHeaderModel.f31657g = c1605b;
                    transactionResultHeaderModel.f31656f = dVar;
                }
                long jCurrentTimeMillis = this.f34799j - System.currentTimeMillis();
                if (jCurrentTimeMillis > 0) {
                    q qVar25 = this.f34802v;
                    if (qVar25 != null) {
                        ((TransactionResultHeaderModel) qVar25.f823o).i(jCurrentTimeMillis, V.f(this));
                    }
                } else {
                    q qVar26 = this.f34802v;
                    if (qVar26 != null) {
                        ((TransactionResultHeaderModel) qVar26.f823o).g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                    }
                    q qVar27 = this.f34802v;
                    if (qVar27 != null && (orderStatusTv = ((TransactionResultHeaderModel) qVar27.f823o).getOrderStatusTv()) != null) {
                        orderStatusTv.setText(getString(v.cv_processing));
                    }
                    q qVar28 = this.f34802v;
                    if (qVar28 != null) {
                        ((TransactionResultHeaderModel) qVar28.f823o).h(str5);
                    }
                }
                c.b().f(new MessageEvent(MessageEvent.EVENT_BILL_PENDING));
                AbstractC0780y.m(V.f(this), null, null, new p238pe.c(this, null), 3);
            }
            q qVar29 = this.f34802v;
            if (qVar29 != null) {
                ((TransactionResultHeaderModel) qVar29.f823o).c(r0.B(this.f34801p, true));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        if (Intrinsics.c(this.f34794d, "73")) {
            i0.I("/coreImpl/rn_host");
            finish();
        } else {
            m();
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AbstractC0780y.m(V.f(this), null, null, new p238pe.c(this, null), 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        c.b().j(this);
        initStatusBar(-1);
        ARouter.getInstance().inject(this);
        PayByOrderResp.DataBean dataBean = (PayByOrderResp.DataBean) this.f34796f.getValue();
        if (dataBean != null) {
            n(dataBean.orderData);
            if (this.t == null) {
                String string = getString(k.core_data_error);
                j jVar = new j();
                jVar.f44470a = string;
                jVar.f44472c = new N2.b(g.lib_ui_toast_fail);
                p377z5.l.I(jVar);
            }
            this.f34797g = dataBean.pendingAcTips;
            this.f34798i = dataBean.pendingCountdownAcTips;
            this.f34799j = dataBean.pendingAcTime;
            this.f34800o = dataBean.errorMsg;
        }
        if (Intrinsics.c(this.f34794d, "73")) {
            q qVar = this.f34802v;
            if (qVar != null) {
                ((PpTitleBar) qVar.f820g).setTitle(getString(k.core_palmpay_code));
            }
        } else {
            q qVar2 = this.f34802v;
            if (qVar2 != null) {
                p220oa.h.s((PpTitleBar) qVar2.f820g, false);
            }
            q qVar3 = this.f34802v;
            if (qVar3 != null) {
                p220oa.h.s((View) qVar3.f821i, true);
            }
        }
        q qVar4 = this.f34802v;
        if (qVar4 != null) {
            ((PpTitleBar) qVar4.f820g).setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        q qVar5 = this.f34802v;
        if (qVar5 != null) {
            ((PpTitleBar) qVar5.f820g).setRightImageView1ClickListener(new b(this, 0));
        }
        q qVar6 = this.f34802v;
        b bVar = this.f34803w;
        if (qVar6 != null) {
            qVar6.f816c.setOnClickListener(bVar);
        }
        q qVar7 = this.f34802v;
        if (qVar7 != null) {
            qVar7.f822j.setOnClickListener(bVar);
        }
        q qVar8 = this.f34802v;
        if (qVar8 != null) {
            ((IconicsImageView) qVar8.f815b).setOnClickListener(bVar);
        }
    }
}
