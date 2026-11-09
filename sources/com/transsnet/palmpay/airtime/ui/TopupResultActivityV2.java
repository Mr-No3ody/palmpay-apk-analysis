package com.transsnet.palmpay.airtime.ui;

import Bc.k;
import C0.G;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.J;
import Wf.AbstractC0780y;
import Z4.e;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.core.LogisticsCenter;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeScheduleTopUpBean;
import com.transsnet.palmpay.airtime.ui.TopupResultActivityV2;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeResultViewModel;
import com.transsnet.palmpay.common.export.bean.req.DialogConfigSettingsReq;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.F;
import kotlin.text.StringsKt;
import o9.C1900e;
import o9.C1902g;
import o9.C1903h;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p051d9.C1605b;
import p054dd.q;
import p131id.a;
import p141j9.C1794b;
import p141j9.C1798f;
import p141j9.H;
import p141j9.K;
import p141j9.N;
import p141j9.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "充值订单结果页", path = "/airtime/result_page", remark = "ignore")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/TopupResultActivityV2;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeResultViewModel;", "LRd/J;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTopupResultActivityV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopupResultActivityV2.kt\ncom/transsnet/palmpay/airtime/ui/TopupResultActivityV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,865:1\n1#2:866\n260#3,10:867\n296#3:877\n260#3,10:878\n296#3:888\n260#3,10:889\n296#3:899\n260#3,10:900\n296#3:910\n13472#4,2:911\n*S KotlinDebug\n*F\n+ 1 TopupResultActivityV2.kt\ncom/transsnet/palmpay/airtime/ui/TopupResultActivityV2\n*L\n285#1:867,10\n285#1:877\n297#1:878,10\n297#1:888\n312#1:889,10\n312#1:899\n322#1:900,10\n322#1:910\n617#1:911,2\n*E\n"})
public final class TopupResultActivityV2 extends BaseMvvmVBActivity<AirTimeResultViewModel, J> {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f26521k0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AirtimeDetailData f26522A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f26524C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterstitialAdView f26525H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f26526L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public a f26527M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public b f26528Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public OrderResultRewardModel f26529X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f26530Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PayByOrderResp.DataBean f26534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26535g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f26536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26537j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f26538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26539p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f26540v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f26541w;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f26523B = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final H f26531Z = new H(this, 1);

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((AirTimeResultViewModel) l()).f26609e;
        if (lVar != null) {
            lVar.e(this, new q(new t(this, this, 3), 9));
        }
        l lVar2 = ((AirTimeResultViewModel) l()).f26610f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new K(this, this, 0), 9));
        }
        if (this.f26532d) {
            i0.k0();
        }
        J j6 = (J) this.f27334c;
        if (j6 != null) {
            j6.f8083b.c(r0.B(this.f26540v, true));
        }
        l lVar3 = ((AirTimeResultViewModel) l()).f26611g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new K(this, this, 1), 9));
        }
        l lVar4 = ((AirTimeResultViewModel) l()).f26612i;
        if (lVar4 != null) {
            lVar4.e(this, new q(new K(this, this, 2), 9));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_activity_top_up_result_v2, (ViewGroup) null, false);
        int i7 = c.aaturv2_two_btn_area;
        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = c.aaturv_result_progress_view;
            TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) p059e1.a.m(i7, viewInflate);
            if (transactionResultHeaderModel != null) {
                i7 = c.actur_ad;
                SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
                if (singleAdView != null) {
                    i7 = c.actur_topup_again_btn;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = c.fail_okcard_ad;
                        FailResultPageAdView failResultPageAdView = (FailResultPageAdView) p059e1.a.m(i7, viewInflate);
                        if (failResultPageAdView != null && (viewM = p059e1.a.m((i7 = c.result_info_card), viewInflate)) != null) {
                            int i10 = c.iv_view_detail;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewM);
                            if (iconicsImageView != null) {
                                i10 = c.ll_order_info;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewM);
                                if (linearLayout != null) {
                                    i10 = c.tv_view_detail;
                                    TextView textView2 = (TextView) p059e1.a.m(i10, viewM);
                                    if (textView2 != null) {
                                        i10 = c.view_detail_row;
                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, viewM);
                                        if (linearLayout2 != null) {
                                            k kVar = new k((LinearLayout) viewM, iconicsImageView, linearLayout, textView2, linearLayout2);
                                            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                            i7 = c.title_bar;
                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                            if (ppTitleBar != null) {
                                                i7 = c.vs_payment_rewards;
                                                if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                    J j6 = new J(relativeLayout, transactionResultHeaderModel, singleAdView, textView, failResultPageAdView, kVar, ppTitleBar);
                                                    Intrinsics.checkNotNullExpressionValue(j6, "inflate(...)");
                                                    return j6;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final OrderResultItemModel n(String str, CharSequence charSequence) {
        k kVar;
        LinearLayout linearLayout;
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, 1002, str, charSequence, 0.0f, 0.0f, CommonViewExtKt.getDp(20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        J j6 = (J) this.f27334c;
        if (j6 == null || (kVar = j6.f8087f) == null || (linearLayout = (LinearLayout) kVar.f752f) == null || linearLayout.getChildCount() != 0) {
            layoutParams.topMargin = CommonViewExtKt.getDp(12);
        }
        orderResultItemModel.setLayoutParams(layoutParams);
        return orderResultItemModel;
    }

    /* JADX WARN: Code duplicated, block: B:282:0x0544  */
    /* JADX WARN: Code duplicated, block: B:284:0x054a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0555  */
    /* JADX WARN: Code duplicated, block: B:290:0x0566  */
    /* JADX WARN: Code duplicated, block: B:293:0x0579  */
    /* JADX WARN: Code duplicated, block: B:295:0x057f  */
    /* JADX WARN: Code duplicated, block: B:296:0x0587  */
    /* JADX WARN: Code duplicated, block: B:298:0x058d  */
    /* JADX WARN: Code duplicated, block: B:301:0x059e  */
    /* JADX WARN: Code duplicated, block: B:304:0x05a9  */
    public final void o() {
        AirtimeDetailData airtimeDetailData;
        J j6;
        J j10;
        J j11;
        J j12;
        J j13;
        J j14;
        J j15;
        TextView orderStatusTv;
        Boolean active;
        J j16;
        Long couponAmount;
        Long loyaltyPoint;
        String strQ0;
        J j17;
        if (i0.W(this) && (airtimeDetailData = this.f26522A) != null) {
            J j18 = (J) this.f27334c;
            if (j18 != null) {
                ((LinearLayout) j18.f8087f.f752f).removeAllViews();
            }
            OrderResultItemModel orderResultItemModelN = n(getString(p025ba.k.core_recipient), i0.D(airtimeDetailData.getPhone()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(CommonExtKt.formatHtmlText(airtimeDetailData.getSubscribeTips()));
            while (spannableStringBuilder.length() > 0 && CharsKt.b(F.y(spannableStringBuilder))) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            boolean zBooleanValue = false;
            Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof StyleSpan) || (obj instanceof TypefaceSpan)) {
                    spannableStringBuilder.removeSpan(obj);
                }
            }
            Integer orderStatus = airtimeDetailData.getOrderStatus();
            int iIntValue = orderStatus != null ? orderStatus.intValue() : 0;
            if (iIntValue == 1 || iIntValue == 7 || iIntValue == 21) {
                String string = spannableStringBuilder.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (!StringsKt.F(string)) {
                    orderResultItemModelN.m(1009);
                    orderResultItemModelN.n(CommonExtKt.formatHtmlText(spannableStringBuilder.toString()), getString(f.qt_low_balance_set), new H(this, 0));
                }
            }
            J j19 = (J) this.f27334c;
            if (j19 != null) {
                ((LinearLayout) j19.f8087f.f752f).addView(orderResultItemModelN);
            }
            Long discountAmount = airtimeDetailData.getDiscountAmount();
            if ((discountAmount != null ? discountAmount.longValue() : 0L) > 0) {
                Long discountAmount2 = airtimeDetailData.getDiscountAmount();
                String strO = G.o("- ", r0.B(discountAmount2 != null ? discountAmount2.longValue() : 0L, true));
                J j20 = (J) this.f27334c;
                if (j20 != null) {
                    ((LinearLayout) j20.f8087f.f752f).addView(n(getString(v.cv_discount), strO));
                }
            }
            Long loyaltyPoint2 = airtimeDetailData.getLoyaltyPoint();
            if ((loyaltyPoint2 != null ? loyaltyPoint2.longValue() : 0L) > 0) {
                Long loyaltyPoint3 = airtimeDetailData.getLoyaltyPoint();
                String strO2 = G.o("- ", r0.x0(loyaltyPoint3 != null ? loyaltyPoint3.longValue() : 0L));
                J j21 = (J) this.f27334c;
                if (j21 != null) {
                    ((LinearLayout) j21.f8087f.f752f).addView(n(getString(p025ba.k.core_palm_points_used), strO2));
                }
            }
            Long couponAmount2 = airtimeDetailData.getCouponAmount();
            if ((couponAmount2 != null ? couponAmount2.longValue() : 0L) > 0) {
                Long couponAmount3 = airtimeDetailData.getCouponAmount();
                String strO3 = G.o("- ", r0.B(couponAmount3 != null ? couponAmount3.longValue() : 0L, false));
                J j22 = (J) this.f27334c;
                if (j22 != null) {
                    ((LinearLayout) j22.f8087f.f752f).addView(n(getString(p025ba.k.core_coupon_amount), strO3));
                }
            }
            Long flexiDiscount = airtimeDetailData.getFlexiDiscount();
            if (flexiDiscount != null) {
                if (flexiDiscount.longValue() <= 0) {
                    flexiDiscount = null;
                }
                if (flexiDiscount != null) {
                    String strO4 = G.o("- ", r0.B(flexiDiscount.longValue(), true));
                    J j23 = (J) this.f27334c;
                    if (j23 != null) {
                        ((LinearLayout) j23.f8087f.f752f).addView(n(getString(p025ba.k.core_flexi_discount), strO4));
                    }
                }
            }
            Long discountAmount3 = airtimeDetailData.getDiscountAmount();
            if (discountAmount3 != null && discountAmount3.longValue() == 0 && (couponAmount = airtimeDetailData.getCouponAmount()) != null && couponAmount.longValue() == 0 && (loyaltyPoint = airtimeDetailData.getLoyaltyPoint()) != null && loyaltyPoint.longValue() == 0) {
                if (TextUtils.isEmpty(airtimeDetailData.getPaymentMethod())) {
                    Integer payerAccountType = airtimeDetailData.getPayerAccountType();
                    strQ0 = r0.q0(payerAccountType != null ? payerAccountType.intValue() : 0, airtimeDetailData.getBankName(), airtimeDetailData.getPayerCardNo());
                    Intrinsics.e(strQ0);
                } else {
                    strQ0 = airtimeDetailData.getPaymentMethod();
                    if (strQ0 == null) {
                        strQ0 = "";
                    }
                }
                if (!TextUtils.isEmpty(strQ0) && (j17 = (J) this.f27334c) != null) {
                    ((LinearLayout) j17.f8087f.f752f).addView(n(getString(p025ba.k.core_payment_method), strQ0));
                }
            }
            Integer orderStatus2 = airtimeDetailData.getOrderStatus();
            int iIntValue2 = orderStatus2 != null ? orderStatus2.intValue() : 0;
            if (iIntValue2 == 1 || iIntValue2 == 7) {
                J j24 = (J) this.f27334c;
                if (j24 != null) {
                    j24.f8083b.j();
                }
                F6.d.h("resultSuccessUpdateUI", 3, new Object[0]);
                J j25 = (J) this.f27334c;
                if (j25 != null) {
                    j25.f8083b.e(getString(p025ba.k.core_successful));
                }
                J j26 = (J) this.f27334c;
                if (j26 != null) {
                    j26.f8083b.h("");
                }
                J j27 = (J) this.f27334c;
                if (j27 != null) {
                    j27.f8083b.g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                }
                Long returnPoint = airtimeDetailData.getReturnPoint();
                if (returnPoint != null) {
                    if (returnPoint.longValue() <= 0) {
                        returnPoint = null;
                    }
                    if (returnPoint != null) {
                        SpannableStringBuilder spannableStringBuilderCreate = d0.j("+ ", r0.x0(returnPoint.longValue()), new SpanUtils()).setForegroundColor(getColor(L6.b.ppColorWarning)).create();
                        J j28 = (J) this.f27334c;
                        if (j28 != null) {
                            ((LinearLayout) j28.f8087f.f752f).addView(n(getString(p025ba.k.core_cashback_earned), spannableStringBuilderCreate));
                        }
                    }
                }
                if (airtimeDetailData.isAgent()) {
                    SpanUtils spanUtils = new SpanUtils();
                    Long commissionAmount = airtimeDetailData.getCommissionAmount();
                    SpannableStringBuilder spannableStringBuilderCreate2 = d0.j("+ ", r0.B(commissionAmount != null ? commissionAmount.longValue() : 0L, true), spanUtils).setForegroundColor(getColor(L6.b.ppColorWarning)).create();
                    J j29 = (J) this.f27334c;
                    if (j29 != null) {
                        ((LinearLayout) j29.f8087f.f752f).addView(n(getString(p025ba.k.core_commission_earned), spannableStringBuilderCreate2));
                    }
                }
                if (TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY.equals(this.f26535g) && (j16 = (J) this.f27334c) != null) {
                    j16.f8083b.h(getResources().getString(f.qt_airtime_msg_be_patient));
                }
                J j30 = (J) this.f27334c;
                if (j30 != null) {
                    j30.f8084c.setVisibility(0);
                }
                J j31 = (J) this.f27334c;
                if (j31 != null) {
                    j31.f8084c.setSlotId(e.r("04"));
                }
                J j32 = (J) this.f27334c;
                if (j32 != null) {
                    SingleAdView singleAdView = j32.f8084c;
                    J j33 = (J) this.f27334c;
                    singleAdView.setAdListener(new com.chuanyi.ad.a(j33 != null ? j33.f8084c : null, "AirTime"));
                }
                if (this.f26526L) {
                    this.f26526L = false;
                    if (this.f26527M == null) {
                        this.f26527M = new a(this);
                    }
                    AirtimeScheduleTopUpBean autoRenewalOrderFields = airtimeDetailData.getAutoRenewalOrderFields();
                    if (autoRenewalOrderFields != null && (active = autoRenewalOrderFields.getActive()) != null) {
                        zBooleanValue = active.booleanValue();
                    }
                    AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) l();
                    a aVar = this.f26527M;
                    DialogConfigSettingsReq req = new DialogConfigSettingsReq(aVar != null ? Boolean.valueOf(aVar.W()) : null, Boolean.valueOf(n.x()), null, null, Boolean.valueOf(BaseApplication.get().getUser().isLoginPswSet()), 1, null, Boolean.valueOf(zBooleanValue), null, null, null, 1868, null);
                    airTimeResultViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    p140j8.f.v(airTimeResultViewModel, new C1902g(req, null), airTimeResultViewModel.f26612i, 0L);
                }
                org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_TOP_UP_AIRTIME_SUCCESS));
                if (!this.f26524C) {
                    if (this.f26529X == null) {
                        ViewStub viewStub = (ViewStub) findViewById(c.vs_payment_rewards);
                        View viewInflate = viewStub != null ? viewStub.inflate() : null;
                        OrderResultRewardModel orderResultRewardModel = viewInflate != null ? (OrderResultRewardModel) viewInflate.findViewById(c.vReward) : null;
                        this.f26529X = orderResultRewardModel;
                        if (orderResultRewardModel != null) {
                            orderResultRewardModel.setOnClaimRewardListener(new C1794b(this, 3));
                        }
                    }
                    OrderResultRewardModel orderResultRewardModel2 = this.f26529X;
                    if (orderResultRewardModel2 != null) {
                        orderResultRewardModel2.a(this.f26535g, airtimeDetailData.getPayId(), airtimeDetailData.getOrderNo());
                    }
                    this.f26524C = true;
                }
            } else {
                Integer orderStatus3 = airtimeDetailData.getOrderStatus();
                int iIntValue3 = orderStatus3 != null ? orderStatus3.intValue() : 0;
                if (iIntValue3 == 12 || iIntValue3 == 14 || iIntValue3 == 23) {
                    j6 = (J) this.f27334c;
                    if (j6 != null) {
                        j6.f8083b.j();
                    }
                    j10 = (J) this.f27334c;
                    if (j10 != null) {
                        j10.f8083b.e(getString(p025ba.k.core_transaction_failed));
                    }
                    j11 = (J) this.f27334c;
                    if (j11 != null) {
                        j11.f8083b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                    }
                    if (TextUtils.isEmpty(this.t)) {
                        j12 = (J) this.f27334c;
                        if (j12 != null) {
                            j12.f8083b.h(getString(f.qt_msg_fail_and_check_payment_method));
                        }
                    } else {
                        j15 = (J) this.f27334c;
                        if (j15 != null) {
                            j15.f8083b.h(this.t);
                        }
                    }
                    j13 = (J) this.f27334c;
                    if (j13 != null) {
                        j13.f8084c.setVisibility(8);
                    }
                    j14 = (J) this.f27334c;
                    if (j14 != null) {
                        j14.f8086e.s(this.f26523B);
                    }
                } else {
                    Integer orderStatus4 = airtimeDetailData.getOrderStatus();
                    int iIntValue4 = orderStatus4 != null ? orderStatus4.intValue() : 0;
                    if (iIntValue4 == 0 || iIntValue4 == 5 || iIntValue4 == 11 || iIntValue4 == 22 || iIntValue4 == 8 || iIntValue4 == 9) {
                        j6 = (J) this.f27334c;
                        if (j6 != null) {
                            j6.f8083b.j();
                        }
                        j10 = (J) this.f27334c;
                        if (j10 != null) {
                            j10.f8083b.e(getString(p025ba.k.core_transaction_failed));
                        }
                        j11 = (J) this.f27334c;
                        if (j11 != null) {
                            j11.f8083b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                        }
                        if (TextUtils.isEmpty(this.t)) {
                            j15 = (J) this.f27334c;
                            if (j15 != null) {
                                j15.f8083b.h(this.t);
                            }
                        } else {
                            j12 = (J) this.f27334c;
                            if (j12 != null) {
                                j12.f8083b.h(getString(f.qt_msg_fail_and_check_payment_method));
                            }
                        }
                        j13 = (J) this.f27334c;
                        if (j13 != null) {
                            j13.f8084c.setVisibility(8);
                        }
                        j14 = (J) this.f27334c;
                        if (j14 != null) {
                            j14.f8086e.s(this.f26523B);
                        }
                    } else {
                        Integer orderStatus5 = airtimeDetailData.getOrderStatus();
                        if ((orderStatus5 != null ? orderStatus5.intValue() : 0) == 10) {
                            j6 = (J) this.f27334c;
                            if (j6 != null) {
                                j6.f8083b.j();
                            }
                            j10 = (J) this.f27334c;
                            if (j10 != null) {
                                j10.f8083b.e(getString(p025ba.k.core_transaction_failed));
                            }
                            j11 = (J) this.f27334c;
                            if (j11 != null) {
                                j11.f8083b.g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                            }
                            if (TextUtils.isEmpty(this.t)) {
                                j15 = (J) this.f27334c;
                                if (j15 != null) {
                                    j15.f8083b.h(this.t);
                                }
                            } else {
                                j12 = (J) this.f27334c;
                                if (j12 != null) {
                                    j12.f8083b.h(getString(f.qt_msg_fail_and_check_payment_method));
                                }
                            }
                            j13 = (J) this.f27334c;
                            if (j13 != null) {
                                j13.f8084c.setVisibility(8);
                            }
                            j14 = (J) this.f27334c;
                            if (j14 != null) {
                                j14.f8086e.s(this.f26523B);
                            }
                        } else {
                            String string2 = TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY.equals(this.f26535g) ? getString(f.qt_airtime_msg_be_patient) : this.f26538o;
                            String string3 = TransType.TRANS_TYPE_ONELOOP_AIRTIME_BUY.equals(this.f26535g) ? getString(f.qt_airtime_msg_be_patient) : this.f26537j;
                            J j34 = (J) this.f27334c;
                            if (j34 != null) {
                                TransactionResultHeaderModel transactionResultHeaderModel = j34.f8083b;
                                C1605b c1605b = new C1605b(8, this, string2);
                                N n10 = new N(this, string3, null);
                                transactionResultHeaderModel.f31657g = c1605b;
                                transactionResultHeaderModel.f31656f = n10;
                            }
                            long jCurrentTimeMillis = this.f26539p - System.currentTimeMillis();
                            if (jCurrentTimeMillis > 0) {
                                J j35 = (J) this.f27334c;
                                if (j35 != null) {
                                    j35.f8083b.i(jCurrentTimeMillis, V.f(this));
                                }
                            } else {
                                J j36 = (J) this.f27334c;
                                if (j36 != null) {
                                    j36.f8083b.g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                                }
                                J j37 = (J) this.f27334c;
                                if (j37 != null && (orderStatusTv = j37.f8083b.getOrderStatusTv()) != null) {
                                    orderStatusTv.setText(getString(v.cv_processing));
                                }
                                J j38 = (J) this.f27334c;
                                if (j38 != null) {
                                    j38.f8083b.h(string3);
                                }
                            }
                            J j39 = (J) this.f27334c;
                            if (j39 != null) {
                                j39.f8084c.setVisibility(8);
                            }
                            AbstractC0780y.m(V.f(this), null, null, new p141j9.J(this, null), 3);
                        }
                    }
                }
            }
            J j40 = (J) this.f27334c;
            if (j40 != null) {
                j40.f8083b.c(r0.B(this.f26540v, true));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdManager.clearPreloadSingleAd();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(pushMessage.content.messageType) || "1000".equals(pushMessage.content.messageType) || "1036".equals(pushMessage.content.messageType)) {
            AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) l();
            String str = this.f26541w;
            airTimeResultViewModel.getClass();
            p140j8.f.s(airTimeResultViewModel, new C1900e(str, null), airTimeResultViewModel.f26611g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f26530Y) {
            this.f26530Y = false;
            AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) l();
            airTimeResultViewModel.getClass();
            p140j8.f.s(airTimeResultViewModel, new C1903h(1, null), airTimeResultViewModel.f26610f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void p() {
        J j6 = (J) this.f27334c;
        View childAt = j6 != null ? ((LinearLayout) j6.f8087f.f752f).getChildAt(0) : null;
        OrderResultItemModel orderResultItemModel = childAt instanceof OrderResultItemModel ? (OrderResultItemModel) childAt : null;
        if (orderResultItemModel != null) {
            orderResultItemModel.n(null, null, null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AbstractC0780y.m(V.f(this), null, null, new p141j9.J(this, null), 3);
    }

    public final void q() {
        if (i0.W(this)) {
            int i7 = f.qt_low_balance_setup_failed;
            AirtimeDetailData airtimeDetailData = this.f26522A;
            String network = airtimeDetailData != null ? airtimeDetailData.getNetwork() : null;
            if (network == null) {
                network = "";
            }
            ToastUtils.showLong(getString(i7, network), new Object[0]);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String transType;
        ImageView rightImageView1;
        Integer orderStatus;
        Long payAmount;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 3));
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        PayByOrderResp.DataBean dataBean = this.f26534f;
        if (dataBean != null) {
            this.f26536i = dataBean.orderData;
            this.f26537j = dataBean.pendingAcTips;
            this.f26538o = dataBean.pendingCountdownAcTips;
            this.f26539p = dataBean.pendingAcTime;
            this.t = dataBean.errorMsg;
        }
        TextUtils.isEmpty(this.f26536i);
        try {
            C0525w c0525wF = C0525w.f();
            String str = this.f26536i;
            c0525wF.getClass();
            AirtimeDetailData airtimeDetailData = (AirtimeDetailData) C0525w.d(str, AirtimeDetailData.class);
            this.f26522A = airtimeDetailData;
            this.f26541w = airtimeDetailData != null ? airtimeDetailData.getOrderNo() : null;
            AirtimeDetailData airtimeDetailData2 = this.f26522A;
            if (airtimeDetailData2 != null) {
                airtimeDetailData2.getAmount();
            }
            AirtimeDetailData airtimeDetailData3 = this.f26522A;
            this.f26523B = airtimeDetailData3 != null ? airtimeDetailData3.getPayId() : null;
            AirtimeDetailData airtimeDetailData4 = this.f26522A;
            this.f26540v = (airtimeDetailData4 == null || (payAmount = airtimeDetailData4.getPayAmount()) == null) ? 0L : payAmount.longValue();
            AirtimeDetailData airtimeDetailData5 = this.f26522A;
            this.f26535g = airtimeDetailData5 != null ? airtimeDetailData5.getTransType() : null;
            AirtimeDetailData airtimeDetailData6 = this.f26522A;
            if (airtimeDetailData6 != null) {
                airtimeDetailData6.getPayerAccountType();
            }
        } catch (Exception unused) {
        }
        AirtimeDetailData airtimeDetailData7 = this.f26522A;
        if (airtimeDetailData7 != null && (orderStatus = airtimeDetailData7.getOrderStatus()) != null) {
            int iIntValue = orderStatus.intValue();
            if (iIntValue == 1 || iIntValue == 7) {
                AutoTrackUtil.trackTransactionResult(this, 1);
                n0.g().u((ViewEvent) G.g("PalmPay_Airtime_View_Success", true));
            } else if (iIntValue == 12 || iIntValue == 14 || iIntValue == 23 || iIntValue == 0 || iIntValue == 5 || iIntValue == 11 || iIntValue == 22 || iIntValue == 8 || iIntValue == 9 || iIntValue == 10) {
                AutoTrackUtil.trackTransactionResult(this, 3);
                n0.g().u((ViewEvent) G.g("PalmPay_Airtime_View_Fail", true));
            } else {
                AutoTrackUtil.trackTransactionResult(this, 2);
                n0.g().u((ViewEvent) G.g("PalmPay_Airtime_View_Pending", true));
            }
        }
        o();
        AirtimeDetailData airtimeDetailData8 = this.f26522A;
        if (airtimeDetailData8 == null || (transType = airtimeDetailData8.getTransType()) == null) {
            transType = "04";
        }
        this.f26535g = transType;
        J j6 = (J) this.f27334c;
        if (j6 != null) {
            j6.f8088g.setBackButtonClickListener(new H(this, 3));
        }
        J j10 = (J) this.f27334c;
        if (j10 != null) {
            j10.f8088g.setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        J j11 = (J) this.f27334c;
        if (j11 != null && (rightImageView1 = j11.f8088g.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new H(this, 4));
        }
        J j12 = (J) this.f27334c;
        H h7 = this.f26531Z;
        if (j12 != null) {
            j12.f8085d.setOnClickListener(h7);
        }
        J j13 = (J) this.f27334c;
        if (j13 != null) {
            ((TextView) j13.f8087f.f749c).setOnClickListener(h7);
        }
        J j14 = (J) this.f27334c;
        if (j14 != null) {
            ((IconicsImageView) j14.f8087f.f751e).setOnClickListener(h7);
        }
        J j15 = (J) this.f27334c;
        if (j15 != null) {
            k kVar = j15.f8087f;
            ((LinearLayout) kVar.f750d).setOnClickListener(new p054dd.n(12, this, kVar));
        }
        J j16 = (J) this.f27334c;
        if (j16 != null) {
            j16.f8085d.setOnClickListener(h7);
        }
        try {
            Postcard postcardBuild = ARouter.getInstance().build("/operating_active/pk_home_activity_v2");
            Intrinsics.checkNotNullExpressionValue(postcardBuild, "build(...)");
            LogisticsCenter.completion(postcardBuild);
            final Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack(postcardBuild.getDestination().getName());
            if (activityIsActivityExistsInStack != null) {
                J j17 = (J) this.f27334c;
                if (j17 != null) {
                    j17.f8085d.setText(getString(f.qt_airtime_back_to_activity));
                }
                J j18 = (J) this.f27334c;
                if (j18 != null) {
                    final int i7 = 0;
                    j18.f8085d.setOnClickListener(new View.OnClickListener() { // from class: j9.I
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Activity activity = activityIsActivityExistsInStack;
                            switch (i7) {
                                case 0:
                                    int i10 = TopupResultActivityV2.f26521k0;
                                    ActivityUtils.finishToActivity(activity, false);
                                    break;
                                default:
                                    int i11 = TopupResultActivityV2.f26521k0;
                                    ActivityUtils.finishToActivity(activity, false);
                                    break;
                            }
                        }
                    });
                }
            } else {
                Postcard postcardBuild2 = ARouter.getInstance().build("/operating_active/anniversary_home_activity_v2");
                Intrinsics.checkNotNullExpressionValue(postcardBuild2, "build(...)");
                LogisticsCenter.completion(postcardBuild2);
                final Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack(postcardBuild2.getDestination().getName());
                if (activityIsActivityExistsInStack2 != null) {
                    J j19 = (J) this.f27334c;
                    if (j19 != null) {
                        j19.f8085d.setText(getString(f.qt_airtime_back_to_activity));
                    }
                    J j20 = (J) this.f27334c;
                    if (j20 != null) {
                        final int i10 = 1;
                        j20.f8085d.setOnClickListener(new View.OnClickListener() { // from class: j9.I
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Activity activity = activityIsActivityExistsInStack2;
                                switch (i10) {
                                    case 0:
                                        int i11 = TopupResultActivityV2.f26521k0;
                                        ActivityUtils.finishToActivity(activity, false);
                                        break;
                                    default:
                                        int i12 = TopupResultActivityV2.f26521k0;
                                        ActivityUtils.finishToActivity(activity, false);
                                        break;
                                }
                            }
                        });
                    }
                }
            }
        } catch (Exception unused2) {
        }
        J j21 = (J) this.f27334c;
        if (j21 != null) {
            FailResultPageAdView failResultPageAdView = j21.f8086e;
            J j22 = (J) this.f27334c;
            failResultPageAdView.setAdListener(new com.chuanyi.ad.a(j22 != null ? j22.f8086e : null, "AirTime"));
        }
        this.f26525H = new InterstitialAdView(e.p("04"), new Ab.k(26));
    }
}
