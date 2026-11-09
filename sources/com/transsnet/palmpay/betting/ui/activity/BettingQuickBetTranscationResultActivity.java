package com.transsnet.palmpay.betting.ui.activity;

import L6.b;
import Pa.C0525w;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0603t;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.u;
import androidx.camera.core.impl.utils.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.betting.ui.activity.BettingQuickBetTranscationResultActivity;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.viewmodel.BillerTransctionResultViewModel;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p059e1.a;
import p141j9.C1798f;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "博彩/快捷投注结果", path = "/quick_teller/quick_betting_result", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingQuickBetTranscationResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillerTransctionResultViewModel;", "LRd/t;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingQuickBetTranscationResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingQuickBetTranscationResultActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingQuickBetTranscationResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
public final class BettingQuickBetTranscationResultActivity extends BaseMvvmVBActivity<BillerTransctionResultViewModel, C0603t> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26690f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BillPaymentOrderDetailRsp f26691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PayByOrderResp.DataBean f26692e;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_qucikbet_transcation, (ViewGroup) null, false);
        int i7 = c.copyIv;
        if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
            i7 = c.gpNumber;
            Group group = (Group) a.m(i7, viewInflate);
            if (group != null) {
                i7 = c.ivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = c.ivLogo;
                    ImageView imageView = (ImageView) a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = c.tvAmount;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = c.tvComplete;
                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                            if (textView2 != null) {
                                i7 = c.tvContent;
                                TextView textView3 = (TextView) a.m(i7, viewInflate);
                                if (textView3 != null) {
                                    i7 = c.tvNumberTitle;
                                    TextView textView4 = (TextView) a.m(i7, viewInflate);
                                    if (textView4 != null) {
                                        i7 = c.tvNumberValue;
                                        TextView textView5 = (TextView) a.m(i7, viewInflate);
                                        if (textView5 != null) {
                                            i7 = c.tvTitle;
                                            TextView textView6 = (TextView) a.m(i7, viewInflate);
                                            if (textView6 != null && (viewM = a.m((i7 = c.viewBg), viewInflate)) != null) {
                                                C0603t c0603t = new C0603t((ConstraintLayout) viewInflate, group, iconicsImageView, imageView, textView, textView2, textView3, textView4, textView5, textView6, viewM);
                                                Intrinsics.checkNotNullExpressionValue(c0603t, "inflate(...)");
                                                return c0603t;
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

    public final void n() {
        BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity;
        C0603t c0603t = (C0603t) this.f27334c;
        if (c0603t != null) {
            bettingQuickBetTranscationResultActivity = this;
            c0603t.f8490d.setImageDrawable(G8.a.x(bettingQuickBetTranscationResultActivity, S6.a.pay_CloseOutline, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorError, this)), null, 48.0f, 116));
        } else {
            bettingQuickBetTranscationResultActivity = this;
        }
        C0603t c0603t2 = (C0603t) bettingQuickBetTranscationResultActivity.f27334c;
        if (c0603t2 != null) {
            c0603t2.f8496o.setText(getString(k.core_failed));
        }
    }

    public final void o() {
        BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity;
        C0603t c0603t = (C0603t) this.f27334c;
        if (c0603t != null) {
            bettingQuickBetTranscationResultActivity = this;
            c0603t.f8490d.setImageDrawable(G8.a.x(bettingQuickBetTranscationResultActivity, S6.a.pay_ScheduleOutline, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorWarning, this)), null, 48.0f, 116));
        } else {
            bettingQuickBetTranscationResultActivity = this;
        }
        C0603t c0603t2 = (C0603t) bettingQuickBetTranscationResultActivity.f27334c;
        if (c0603t2 != null) {
            c0603t2.f8496o.setText(getString(k.core_processing));
        }
    }

    public final void p() {
        BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity;
        C0603t c0603t = (C0603t) this.f27334c;
        if (c0603t != null) {
            bettingQuickBetTranscationResultActivity = this;
            c0603t.f8490d.setImageDrawable(G8.a.x(bettingQuickBetTranscationResultActivity, S6.a.pay_SelectedOutline, Integer.valueOf(CommonViewExtKt.colorInt(b.ppColorSuccess, this)), null, 48.0f, 116));
        } else {
            bettingQuickBetTranscationResultActivity = this;
        }
        C0603t c0603t2 = (C0603t) bettingQuickBetTranscationResultActivity.f27334c;
        if (c0603t2 != null) {
            c0603t2.f8496o.setText(getString(k.core_success));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String str;
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 14));
        initStatusBar(getColor(b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        PayByOrderResp.DataBean dataBean = this.f26692e;
        if (dataBean != null && (str = dataBean.orderData) != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    C0525w.f().getClass();
                    BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) C0525w.d(str, BillPaymentOrderDetailRsp.class);
                    this.f26691d = billPaymentOrderDetailRsp;
                    if (billPaymentOrderDetailRsp == null) {
                        Intrinsics.n("mBillOrderDetail");
                        throw null;
                    }
                    C0603t c0603t = (C0603t) this.f27334c;
                    if (c0603t != null) {
                        TextView textView = c0603t.f8495j;
                        PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                        String customerId = billPaymentOrderDetailRsp.getCustomerId();
                        if (customerId == null) {
                            customerId = "";
                        }
                        textView.setText(phoneBaseNumberUtils.formatMobileNumber(customerId, false));
                    }
                    C0603t c0603t2 = (C0603t) this.f27334c;
                    if (c0603t2 != null) {
                        TextView textView2 = c0603t2.f8491e;
                        Long payAmount = billPaymentOrderDetailRsp.getPayAmount();
                        textView2.setText(r0.B(payAmount != null ? payAmount.longValue() : 0L, true));
                    }
                    PayByOrderResp.DataBean dataBean2 = this.f26692e;
                    Integer numValueOf = dataBean2 != null ? Integer.valueOf(dataBean2.payStatus) : null;
                    if (Intrinsics.c(numValueOf, 1)) {
                        p();
                    } else if (Intrinsics.c(numValueOf, 2)) {
                        n();
                    } else {
                        o();
                    }
                    Unit unit = Unit.f38893a;
                } catch (Exception unused) {
                    Unit unit2 = Unit.f38893a;
                }
            }
        }
        C0603t c0603t3 = (C0603t) this.f27334c;
        if (c0603t3 != null) {
            c0603t3.f8488b.setOnClickListener(new View.OnClickListener(this) { // from class: s9.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingQuickBetTranscationResultActivity f42089b;

                {
                    this.f42089b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity = this.f42089b;
                    switch (i11) {
                        case 0:
                            int i12 = BettingQuickBetTranscationResultActivity.f26690f;
                            if (r0.U0()) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp2 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            if (TextUtils.isEmpty(billPaymentOrderDetailRsp2.getCustomerId())) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp3 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            ClipboardUtils.copyText(billPaymentOrderDetailRsp3.getCustomerId());
                            n.v(k.core_copy_success);
                            return;
                        case 1:
                            int i13 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                        default:
                            int i14 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                    }
                }
            });
        }
        C0603t c0603t4 = (C0603t) this.f27334c;
        if (c0603t4 != null) {
            c0603t4.f8489c.setOnClickListener(new View.OnClickListener(this) { // from class: s9.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingQuickBetTranscationResultActivity f42089b;

                {
                    this.f42089b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity = this.f42089b;
                    switch (i10) {
                        case 0:
                            int i12 = BettingQuickBetTranscationResultActivity.f26690f;
                            if (r0.U0()) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp2 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            if (TextUtils.isEmpty(billPaymentOrderDetailRsp2.getCustomerId())) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp3 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            ClipboardUtils.copyText(billPaymentOrderDetailRsp3.getCustomerId());
                            n.v(k.core_copy_success);
                            return;
                        case 1:
                            int i13 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                        default:
                            int i14 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                    }
                }
            });
        }
        C0603t c0603t5 = (C0603t) this.f27334c;
        if (c0603t5 != null) {
            c0603t5.f8492f.setOnClickListener(new View.OnClickListener(this) { // from class: s9.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingQuickBetTranscationResultActivity f42089b;

                {
                    this.f42089b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BettingQuickBetTranscationResultActivity bettingQuickBetTranscationResultActivity = this.f42089b;
                    switch (i7) {
                        case 0:
                            int i12 = BettingQuickBetTranscationResultActivity.f26690f;
                            if (r0.U0()) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp2 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            if (TextUtils.isEmpty(billPaymentOrderDetailRsp2.getCustomerId())) {
                                return;
                            }
                            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = bettingQuickBetTranscationResultActivity.f26691d;
                            if (billPaymentOrderDetailRsp3 == null) {
                                Intrinsics.n("mBillOrderDetail");
                                throw null;
                            }
                            ClipboardUtils.copyText(billPaymentOrderDetailRsp3.getCustomerId());
                            n.v(k.core_copy_success);
                            return;
                        case 1:
                            int i13 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                        default:
                            int i14 = BettingQuickBetTranscationResultActivity.f26690f;
                            bettingQuickBetTranscationResultActivity.getOnBackPressedDispatcher().d();
                            return;
                    }
                }
            });
        }
    }
}
