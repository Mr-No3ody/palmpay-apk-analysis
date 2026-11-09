package com.transsnet.palmpay.core.ui.activity;

import N8.q0;
import Pa.i0;
import Pa.r0;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CorePaymentExtra;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.bean.rsp.QueryLimitAmountResp;
import com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.core.viewmodel.ModelCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelDiscountItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelPreviewPaymentMethodItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewPageItemContainer;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CorePaymentPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/m;", "LLa/x;", "Lcom/transsnet/palmpay/core/ui/mvp/contract/CorePaymentPreviewContract$View;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCorePaymentPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CorePaymentPreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CorePaymentPreviewActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,796:1\n1869#2,2:797\n1#3:799\n*S KotlinDebug\n*F\n+ 1 CorePaymentPreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CorePaymentPreviewActivity\n*L\n544#1:797,2\n*E\n"})
public class CorePaymentPreviewActivity extends AbstractActivityC1479m implements CorePaymentPreviewContract.View {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final /* synthetic */ int f27549M0 = 0;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public String f27550A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f27551B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f27552C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public String f27553D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public long f27554E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f27555F0 = true;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ArrayList f27556G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public String f27557H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public long f27558I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f27559J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f27560K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public PreviewPayInfoResp.PaymentAvailableBean f27561L0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p355xf.t f27562Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p355xf.t f27563Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p355xf.t f27564k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p355xf.t f27565p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final p355xf.t f27566q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final p355xf.t f27567r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final p355xf.t f27568s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final p355xf.t f27569t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final p355xf.t f27570u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final p355xf.t f27571v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p355xf.t f27572w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final p355xf.t f27573x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final p355xf.t f27574y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final p355xf.t f27575z0;

    public CorePaymentPreviewActivity() {
        final int i7 = 9;
        this.f27562Y = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i7) {
                    case 0:
                        int i10 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i11 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i12 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i10 = 0;
        this.f27563Z = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i10) {
                    case 0:
                        int i11 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i12 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i11 = 1;
        this.f27564k0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i11) {
                    case 0:
                        int i12 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i12 = 2;
        this.f27565p0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i12) {
                    case 0:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i13 = 3;
        this.f27566q0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i13) {
                    case 0:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i14 = 4;
        this.f27567r0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i14) {
                    case 0:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i15 = 5;
        this.f27568s0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i15) {
                    case 0:
                        int i16 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i16 = 6;
        this.f27569t0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i16) {
                    case 0:
                        int i17 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i17 = 7;
        this.f27570u0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i17) {
                    case 0:
                        int i18 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i18 = 8;
        this.f27571v0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i18) {
                    case 0:
                        int i19 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i118 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i19 = 10;
        this.f27572w0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i19) {
                    case 0:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i118 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i119 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i20 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i20 = 11;
        this.f27573x0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i20) {
                    case 0:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i118 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i119 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i21 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i24 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i21 = 12;
        this.f27574y0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i21) {
                    case 0:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i118 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i119 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i22 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i24 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i25 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
        final int i22 = 13;
        this.f27575z0 = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27637b;

            {
                this.f27637b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27637b;
                switch (i22) {
                    case 0:
                        int i110 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelApplyOkCard) corePaymentPreviewActivity.findViewById(p025ba.e.viewApplyOkCard);
                    case 1:
                        int i111 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelPreviewPaymentMethodItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemPaymentMethod);
                    case 2:
                        int i112 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCommissionToEarn);
                    case 3:
                        int i113 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToEarn);
                    case 4:
                        int i114 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemDataBonusEarn);
                    case 5:
                        int i115 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelCouponItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoupon);
                    case 6:
                        int i116 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelDiscountItem) corePaymentPreviewActivity.findViewById(p025ba.e.itemDiscount);
                    case 7:
                        int i117 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelUsePointsWithSwitch) corePaymentPreviewActivity.findViewById(p025ba.e.itemPointToUse);
                    case 8:
                        int i118 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemCoins);
                    case 9:
                        int i119 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.textViewNext);
                    case 10:
                        int i23 = CorePaymentPreviewActivity.f27549M0;
                        return (TextView) corePaymentPreviewActivity.findViewById(p025ba.e.itemFeeRemark);
                    case 11:
                        int i24 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemFee);
                    case 12:
                        int i25 = CorePaymentPreviewActivity.f27549M0;
                        return (ModelItemFee) corePaymentPreviewActivity.findViewById(p025ba.e.itemAmount);
                    default:
                        int i26 = CorePaymentPreviewActivity.f27549M0;
                        return (PreviewPageItemContainer) corePaymentPreviewActivity.findViewById(p025ba.e.itemContainer);
                }
            }
        });
    }

    public static String a0(PaymentMethod paymentMethod) {
        String string;
        return (paymentMethod == null || (string = Integer.valueOf(paymentMethod.senderAccountType).toString()) == null) ? "1" : string;
    }

    public static boolean d0(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        if (paymentMethod == null || dataBean == null) {
            return false;
        }
        int i7 = paymentMethod.senderAccountType;
        if (i7 != 1 || paymentMethod.availableBalance >= dataBean.payAmount) {
            return !(i7 == 20 || i7 == 22 || i7 == 27 || i7 == 28 || i7 == 26) || paymentMethod.availableBalance >= dataBean.payAmount;
        }
        return false;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: B, reason: from getter */
    public boolean getF27555F0() {
        return this.f27555F0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void N() {
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void O(PreviewPayInfoResp.DataBean dataBean) {
        if (Y() == null) {
            return;
        }
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItemY = Y();
        if (modelPreviewPaymentMethodItemY != null) {
            modelPreviewPaymentMethodItemY.setPaymentMethod(this.f27789d);
        }
        if (dataBean != null) {
            showPreviewPayInfo(this.f27789d, dataBean);
            return;
        }
        La.x xVar = (La.x) this.f27350a;
        if (xVar != null) {
            xVar.queryPreviewInfo(R(a0(this.f27789d), Z().f28430j.isChecked(), W().f28339f.isChecked()));
        }
    }

    public void Q(PreviewPayInfoV2Req params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public final PreviewPayInfoV2Req R(String str, boolean z3, boolean z8) {
        PreviewPayInfoV2Req previewPayInfoV2Req = new PreviewPayInfoV2Req();
        previewPayInfoV2Req.orderAmount = this.f27554E0;
        previewPayInfoV2Req.orderType = getF27552C0();
        previewPayInfoV2Req.isRedeemPoint = z3;
        previewPayInfoV2Req.useDiscount = z8;
        previewPayInfoV2Req.payerAccountType = str;
        previewPayInfoV2Req.orderNo = this.f27793i;
        previewPayInfoV2Req.transType = getF27551B0();
        previewPayInfoV2Req.coins = this.f27558I0;
        CouponItem couponItem = this.f27790e;
        if (couponItem != null) {
            previewPayInfoV2Req.couponId = Long.valueOf(couponItem.couponId);
            previewPayInfoV2Req.couponAmount = this.f27790e.nominaValue;
        }
        previewPayInfoV2Req.businessPhone = z();
        previewPayInfoV2Req.isUseCoupon = (z3 || z8 || !C()) ? false : true;
        previewPayInfoV2Req.usePayDiscount = true;
        Q(previewPayInfoV2Req);
        return previewPayInfoV2Req;
    }

    public final void S() {
        String f27551b0;
        La.x xVar;
        if (r0.U0()) {
            return;
        }
        if (!d0(this.f27789d, this.f27559J0)) {
            L();
            return;
        }
        if (this.f27559J0 == null) {
            La.x xVar2 = (La.x) this.f27350a;
            if (xVar2 != null) {
                xVar2.queryPreviewInfo(v());
                return;
            }
            return;
        }
        if (this instanceof H5CorePreviewActivity) {
            E();
            return;
        }
        String strU = u();
        String strValueOf = String.valueOf(this.f27789d.senderAccountType);
        if (strU == null || strValueOf == null || (f27551b0 = getF27551B0()) == null || (xVar = (La.x) this.f27350a) == null) {
            return;
        }
        xVar.queryLimitAmount(f27551b0, strU, strValueOf);
    }

    public final ModelItemFee T() {
        Object value = this.f27565p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelItemFee) value;
    }

    public final ModelCouponItem U() {
        Object value = this.f27568s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelCouponItem) value;
    }

    public final ModelItemFee V() {
        Object value = this.f27567r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelItemFee) value;
    }

    public final ModelDiscountItem W() {
        Object value = this.f27569t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelDiscountItem) value;
    }

    public final ModelItemFee X() {
        Object value = this.f27573x0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelItemFee) value;
    }

    public final ModelPreviewPaymentMethodItem Y() {
        Object value = this.f27564k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelPreviewPaymentMethodItem) value;
    }

    public final ModelUsePointsWithSwitch Z() {
        Object value = this.f27570u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelUsePointsWithSwitch) value;
    }

    public final TextView b0() {
        Object value = this.f27562Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void c0() {
        ModelDiscountItem modelDiscountItemW = W();
        if (modelDiscountItemW != null) {
            modelDiscountItemW.setVisibility(8);
        }
        ModelItemFee modelItemFeeX = X();
        if (modelItemFeeX != null) {
            modelItemFeeX.e(0L, 0L);
        }
        ModelUsePointsWithSwitch modelUsePointsWithSwitchZ = Z();
        if (modelUsePointsWithSwitchZ != null) {
            modelUsePointsWithSwitchZ.setVisibility(8);
        }
        Object value = this.f27566q0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ModelItemFee modelItemFee = (ModelItemFee) value;
        if (modelItemFee != null) {
            modelItemFee.setVisibility(8);
        }
        ModelItemFee modelItemFeeT = T();
        if (modelItemFeeT != null) {
            modelItemFeeT.setVisibility(8);
        }
        ModelItemFee modelItemFeeV = V();
        if (modelItemFeeV != null) {
            modelItemFeeV.setVisibility(8);
        }
        ModelCouponItem modelCouponItemU = U();
        if (modelCouponItemU != null) {
            modelCouponItemU.setVisibility(8);
        }
        TextView textViewB0 = b0();
        if (textViewB0 != null) {
            textViewB0.setText(e0(null));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.dialog.ConfirmPaymentFeeDialog.IConfirmPay
    public final void confirmPay() {
        S();
    }

    public final String e0(PreviewPayInfoResp.DataBean dataBean) {
        if (dataBean == null) {
            String string = getString(p025ba.k.core_pay);
            Intrinsics.e(string);
            return string;
        }
        String string2 = getString(p025ba.k.core_pay_amount, BaseApplication.getCurrencySymbol(), r0.A(dataBean.payAmount));
        Intrinsics.e(string2);
        return string2;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public int getLayoutId() {
        return p025ba.g.core_activity_payment_preview;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getOrderAmount, reason: from getter */
    public final long getF27554E0() {
        return this.f27554E0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getPalmPointsAmount, reason: from getter */
    public final long getF27558I0() {
        return this.f27558I0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType, reason: from getter */
    public String getF27551B0() {
        return this.f27551B0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
        super.initData();
        Intent intent = getIntent();
        if (intent != null) {
            this.f27550A0 = intent.getStringExtra("mOrderNo");
            this.f27551B0 = intent.getStringExtra("mTransType");
            this.f27552C0 = intent.getStringExtra("mOrderType");
            this.f27557H0 = intent.getStringExtra("mCustomerId");
            this.f27555F0 = intent.getBooleanExtra("mUseCoupon", false);
            long longExtra = intent.getLongExtra("mOrderAmount", 0L);
            this.f27554E0 = longExtra;
            if (longExtra <= 0) {
                this.f27554E0 = intent.getIntExtra("mOrderAmount", 0);
            }
            this.f27553D0 = intent.getStringExtra("mDisplayOrderAmount");
            long longExtra2 = intent.getLongExtra("mPalmCoinsAmount", 0L);
            this.f27558I0 = longExtra2;
            if (longExtra2 <= 0) {
                this.f27558I0 = intent.getIntExtra("mPalmCoinsAmount", 0);
            }
            String stringExtra = getIntent().getStringExtra("mCalculationExtInfo");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.f27782H = stringExtra;
            }
            try {
                this.f27556G0 = (ArrayList) intent.getSerializableExtra("mExtras");
            } catch (Exception unused) {
            }
        }
        this.f27795o = this.f27557H0;
        this.f27793i = this.f27550A0;
        boolean zIsEmpty = TextUtils.isEmpty(this.f27553D0);
        p355xf.t tVar = this.f27574y0;
        if (zIsEmpty) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ModelItemFee) value).setAmount(r0.A(this.f27554E0));
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ModelItemFee) value2).setAmount(this.f27553D0);
        }
        final int i7 = 0;
        Z().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27635b;

            {
                this.f27635b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27635b;
                switch (i7) {
                    case 0:
                        int i10 = CorePaymentPreviewActivity.f27549M0;
                        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                        if (buttonView.isPressed()) {
                            if (z3) {
                                corePaymentPreviewActivity.f27790e = null;
                                ModelCouponItem modelCouponItemU = corePaymentPreviewActivity.U();
                                if (modelCouponItemU != null) {
                                    modelCouponItemU.setCoupon(null);
                                }
                                ModelDiscountItem modelDiscountItemW = corePaymentPreviewActivity.W();
                                if (modelDiscountItemW != null) {
                                    modelDiscountItemW.d(false, corePaymentPreviewActivity.f27560K0);
                                }
                            } else {
                                ModelCouponItem modelCouponItemU2 = corePaymentPreviewActivity.U();
                                corePaymentPreviewActivity.f27790e = modelCouponItemU2 != null ? modelCouponItemU2.getCoupon() : null;
                            }
                            ModelCouponItem modelCouponItemU3 = corePaymentPreviewActivity.U();
                            if (modelCouponItemU3 != null) {
                                modelCouponItemU3.d();
                            }
                            La.x xVar = (La.x) corePaymentPreviewActivity.f27350a;
                            if (xVar != null) {
                                xVar.queryPreviewInfo(corePaymentPreviewActivity.R(CorePaymentPreviewActivity.a0(corePaymentPreviewActivity.f27789d), z3, corePaymentPreviewActivity.W().f28339f.isChecked()));
                            }
                            break;
                        }
                        break;
                    default:
                        int i11 = CorePaymentPreviewActivity.f27549M0;
                        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                        if (buttonView.isPressed()) {
                            if (z3) {
                                corePaymentPreviewActivity.f27790e = null;
                                ModelCouponItem modelCouponItemU4 = corePaymentPreviewActivity.U();
                                if (modelCouponItemU4 != null) {
                                    modelCouponItemU4.setCoupon(null);
                                }
                                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ = corePaymentPreviewActivity.Z();
                                if (modelUsePointsWithSwitchZ != null) {
                                    modelUsePointsWithSwitchZ.e(false, corePaymentPreviewActivity.f27560K0);
                                }
                            } else {
                                ModelCouponItem modelCouponItemU5 = corePaymentPreviewActivity.U();
                                corePaymentPreviewActivity.f27790e = modelCouponItemU5 != null ? modelCouponItemU5.getCoupon() : null;
                            }
                            ModelCouponItem modelCouponItemU6 = corePaymentPreviewActivity.U();
                            if (modelCouponItemU6 != null) {
                                modelCouponItemU6.d();
                            }
                            La.x xVar2 = (La.x) corePaymentPreviewActivity.f27350a;
                            if (xVar2 != null) {
                                xVar2.queryPreviewInfo(corePaymentPreviewActivity.R(CorePaymentPreviewActivity.a0(corePaymentPreviewActivity.f27789d), corePaymentPreviewActivity.Z().f28430j.isChecked(), z3));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        W().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27635b;

            {
                this.f27635b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z3) {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27635b;
                switch (i10) {
                    case 0:
                        int i11 = CorePaymentPreviewActivity.f27549M0;
                        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                        if (buttonView.isPressed()) {
                            if (z3) {
                                corePaymentPreviewActivity.f27790e = null;
                                ModelCouponItem modelCouponItemU = corePaymentPreviewActivity.U();
                                if (modelCouponItemU != null) {
                                    modelCouponItemU.setCoupon(null);
                                }
                                ModelDiscountItem modelDiscountItemW = corePaymentPreviewActivity.W();
                                if (modelDiscountItemW != null) {
                                    modelDiscountItemW.d(false, corePaymentPreviewActivity.f27560K0);
                                }
                            } else {
                                ModelCouponItem modelCouponItemU2 = corePaymentPreviewActivity.U();
                                corePaymentPreviewActivity.f27790e = modelCouponItemU2 != null ? modelCouponItemU2.getCoupon() : null;
                            }
                            ModelCouponItem modelCouponItemU3 = corePaymentPreviewActivity.U();
                            if (modelCouponItemU3 != null) {
                                modelCouponItemU3.d();
                            }
                            La.x xVar = (La.x) corePaymentPreviewActivity.f27350a;
                            if (xVar != null) {
                                xVar.queryPreviewInfo(corePaymentPreviewActivity.R(CorePaymentPreviewActivity.a0(corePaymentPreviewActivity.f27789d), z3, corePaymentPreviewActivity.W().f28339f.isChecked()));
                            }
                            break;
                        }
                        break;
                    default:
                        int i12 = CorePaymentPreviewActivity.f27549M0;
                        Intrinsics.checkNotNullParameter(buttonView, "buttonView");
                        if (buttonView.isPressed()) {
                            if (z3) {
                                corePaymentPreviewActivity.f27790e = null;
                                ModelCouponItem modelCouponItemU4 = corePaymentPreviewActivity.U();
                                if (modelCouponItemU4 != null) {
                                    modelCouponItemU4.setCoupon(null);
                                }
                                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ = corePaymentPreviewActivity.Z();
                                if (modelUsePointsWithSwitchZ != null) {
                                    modelUsePointsWithSwitchZ.e(false, corePaymentPreviewActivity.f27560K0);
                                }
                            } else {
                                ModelCouponItem modelCouponItemU5 = corePaymentPreviewActivity.U();
                                corePaymentPreviewActivity.f27790e = modelCouponItemU5 != null ? modelCouponItemU5.getCoupon() : null;
                            }
                            ModelCouponItem modelCouponItemU6 = corePaymentPreviewActivity.U();
                            if (modelCouponItemU6 != null) {
                                modelCouponItemU6.d();
                            }
                            La.x xVar2 = (La.x) corePaymentPreviewActivity.f27350a;
                            if (xVar2 != null) {
                                xVar2.queryPreviewInfo(corePaymentPreviewActivity.R(CorePaymentPreviewActivity.a0(corePaymentPreviewActivity.f27789d), corePaymentPreviewActivity.Z().f28430j.isChecked(), z3));
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final int i11 = 0;
        U().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27653b;

            {
                this.f27653b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27653b;
                switch (i11) {
                    case 0:
                        corePaymentPreviewActivity.F(corePaymentPreviewActivity.f27559J0);
                        return;
                    case 1:
                        int i12 = CorePaymentPreviewActivity.f27549M0;
                        try {
                            PreviewPayInfoResp.DataBean dataBean = corePaymentPreviewActivity.f27559J0;
                            if (corePaymentPreviewActivity.m(dataBean != null ? dataBean.feeTips : null)) {
                                return;
                            }
                        } catch (Exception unused2) {
                        } catch (Throwable th) {
                            corePaymentPreviewActivity.S();
                            throw th;
                        }
                        corePaymentPreviewActivity.S();
                        return;
                    default:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        corePaymentPreviewActivity.L();
                        return;
                }
            }
        });
        final int i12 = 1;
        b0().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27653b;

            {
                this.f27653b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27653b;
                switch (i12) {
                    case 0:
                        corePaymentPreviewActivity.F(corePaymentPreviewActivity.f27559J0);
                        return;
                    case 1:
                        int i13 = CorePaymentPreviewActivity.f27549M0;
                        try {
                            PreviewPayInfoResp.DataBean dataBean = corePaymentPreviewActivity.f27559J0;
                            if (corePaymentPreviewActivity.m(dataBean != null ? dataBean.feeTips : null)) {
                                return;
                            }
                        } catch (Exception unused2) {
                        } catch (Throwable th) {
                            corePaymentPreviewActivity.S();
                            throw th;
                        }
                        corePaymentPreviewActivity.S();
                        return;
                    default:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        corePaymentPreviewActivity.L();
                        return;
                }
            }
        });
        final int i13 = 2;
        Y().setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.I

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CorePaymentPreviewActivity f27653b;

            {
                this.f27653b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorePaymentPreviewActivity corePaymentPreviewActivity = this.f27653b;
                switch (i13) {
                    case 0:
                        corePaymentPreviewActivity.F(corePaymentPreviewActivity.f27559J0);
                        return;
                    case 1:
                        int i14 = CorePaymentPreviewActivity.f27549M0;
                        try {
                            PreviewPayInfoResp.DataBean dataBean = corePaymentPreviewActivity.f27559J0;
                            if (corePaymentPreviewActivity.m(dataBean != null ? dataBean.feeTips : null)) {
                                return;
                            }
                        } catch (Exception unused2) {
                        } catch (Throwable th) {
                            corePaymentPreviewActivity.S();
                            throw th;
                        }
                        corePaymentPreviewActivity.S();
                        return;
                    default:
                        int i15 = CorePaymentPreviewActivity.f27549M0;
                        corePaymentPreviewActivity.L();
                        return;
                }
            }
        });
        c0();
        ArrayList<CorePaymentExtra> arrayList = this.f27556G0;
        if (arrayList != null) {
            for (CorePaymentExtra corePaymentExtra : arrayList) {
                ModelItemFee modelItemFee = new ModelItemFee(this);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(com.transsnet.palmpay.custom_view.q.cv_preview_item_height));
                layoutParams.setMarginStart(getResources().getDimensionPixelSize(com.transsnet.palmpay.custom_view.q.cv_preview_item_margin));
                layoutParams.setMarginEnd(layoutParams.getMarginStart());
                Object value3 = this.f27575z0.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                PreviewPageItemContainer previewPageItemContainer = (PreviewPageItemContainer) value3;
                if (previewPageItemContainer != null) {
                    previewPageItemContainer.addView(modelItemFee, 0, layoutParams);
                }
                CharSequence key = corePaymentExtra.getKey();
                CharSequence value4 = corePaymentExtra.getValue();
                modelItemFee.f28361b.setText(key);
                modelItemFee.setContent(value4);
                modelItemFee.setValueMaxLine(2);
            }
        }
        AutoTrackUtil.trackViewProperties(b0(), LogConstants.Autotrack.ELEMENT_TRANS_TYPE, getF27551B0());
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new La.x();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.dialog.CoreSelectCouponForPaymentDialog.CallBack
    public final void onCouponClick(CouponItem couponItem) {
        this.f27790e = couponItem;
        if (i0.W(this)) {
            U().setCoupon(couponItem);
            if (couponItem == null) {
                La.x xVar = (La.x) this.f27350a;
                if (xVar != null) {
                    xVar.queryPreviewInfo(R(a0(this.f27789d), Z().f28430j.isChecked(), W().f28339f.isChecked()));
                    return;
                }
                return;
            }
            if (Z().f28430j.isChecked() || W().f28339f.isChecked()) {
                Z().e(false, this.f27560K0);
                W().d(false, this.f27560K0);
            }
            ((La.x) this.f27350a).queryPreviewInfo(R(a0(this.f27789d), Z().f28430j.isChecked(), W().f28339f.isChecked()));
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void queryLimitAmountOK(QueryLimitAmountResp queryLimitAmountResp) {
        QueryLimitAmountResp.DataBean dataBean;
        if (queryLimitAmountResp == null || !queryLimitAmountResp.isSuccess() || (dataBean = queryLimitAmountResp.data) == null) {
            return;
        }
        long j6 = this.f27554E0;
        if (j6 > dataBean.getMaxAmount()) {
            ToastUtils.showLong(getString(p025ba.k.core_msg_amount_below_desc, r0.B(queryLimitAmountResp.data.getMaxAmount(), true)), new Object[0]);
            showLoadingDialog(false);
        } else if (j6 >= queryLimitAmountResp.data.getMinAmount()) {
            E();
        } else {
            ToastUtils.showLong(getString(p025ba.k.core_msg_amount_above_desc, r0.B(queryLimitAmountResp.data.getMinAmount(), true)), new Object[0]);
            showLoadingDialog(false);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public ModelApplyOkCard s() {
        Object value = this.f27563Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelApplyOkCard) value;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void setDefaultMethod(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            L();
            return;
        }
        this.f27789d = paymentMethod;
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItemY = Y();
        if (modelPreviewPaymentMethodItemY != null) {
            modelPreviewPaymentMethodItemY.setPaymentMethod(this.f27789d);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        Object value = this.f27575z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Intrinsics.checkNotNullParameter((PreviewPageItemContainer) value, "<set-?>");
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    public final void showPreviewPayInfo(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        if (paymentMethod != null) {
            updatePreviewInfo(String.valueOf(paymentMethod.senderAccountType), dataBean);
        }
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t, reason: from getter */
    public String getF27552C0() {
        return this.f27552C0;
    }

    @Override // com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract.View
    public void updatePreviewInfo(String str, PreviewPayInfoResp.DataBean bean) {
        ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItemY;
        ModelDiscountItem modelDiscountItemW;
        ModelUsePointsWithSwitch modelUsePointsWithSwitchZ;
        String str2;
        ModelItemFee modelItemFeeX;
        if (bean == null) {
            c0();
            return;
        }
        I(bean);
        this.f27559J0 = bean;
        PreviewPayInfoResp.PaymentAvailableBean paymentAvailableBean = bean.availableItem;
        if (paymentAvailableBean != null) {
            this.f27561L0 = paymentAvailableBean;
            this.f27560K0 = paymentAvailableBean.showAvailable;
        }
        setPayAmount(bean.payAmount);
        ModelItemFee modelItemFeeX2 = X();
        long j6 = 0;
        if (modelItemFeeX2 != null) {
            long j10 = bean.fee;
            long j11 = bean.vat;
            long j12 = bean.platformFee;
            long j13 = bean.platformVat;
            if (j11 <= 0) {
                modelItemFeeX2.t = false;
                modelItemFeeX2.f28371v.setVisibility(8);
            } else {
                modelItemFeeX2.t = true;
                modelItemFeeX2.f28371v.setVisibility(0);
                modelItemFeeX2.f28368j = r0.W(modelItemFeeX2.f31419a, j11);
            }
            long j14 = j10 + j11;
            modelItemFeeX2.setContent(r0.A(j14));
            long j15 = j12 + j13;
            if (j15 > j6) {
                modelItemFeeX2.f28363d.setVisibility(0);
                modelItemFeeX2.f28363d.setText(r0.B(j14 + j15, false));
                modelItemFeeX2.f28363d.getPaint().setFlags(17);
            } else {
                modelItemFeeX2.f28363d.setText(r0.B(j14 + j15, false));
                modelItemFeeX2.f28363d.setVisibility(8);
            }
        } else {
            j6 = 0;
        }
        ModelItemFee modelItemFeeX3 = X();
        if (modelItemFeeX3 != null) {
            modelItemFeeX3.setVisibility(bean.fee + bean.vat > j6 ? 0 : 8);
        }
        if (bean.feeDetail != null && (modelItemFeeX = X()) != null) {
            modelItemFeeX.setFeeDetails(bean.feeDetail);
        }
        p355xf.t tVar = this.f27572w0;
        TextView textView = (TextView) tVar.getValue();
        if (textView != null) {
            PreviewPayInfoResp.FeeTips feeTips = bean.feeTips;
            textView.setVisibility((feeTips == null || TextUtils.isEmpty(feeTips.tipsText)) ? 8 : 0);
        }
        TextView textView2 = (TextView) tVar.getValue();
        if (textView2 != null) {
            PreviewPayInfoResp.FeeTips feeTips2 = bean.feeTips;
            if (feeTips2 == null || (str2 = feeTips2.tipsText) == null) {
                str2 = "";
            }
            textView2.setText(str2);
        }
        TextView textViewB0 = b0();
        if (textViewB0 != null) {
            textViewB0.setText(e0(bean));
        }
        ModelUsePointsWithSwitch modelUsePointsWithSwitchZ2 = Z();
        if (modelUsePointsWithSwitchZ2 != null) {
            modelUsePointsWithSwitchZ2.setPointExchangeRate(bean.exchangeRate);
        }
        if (bean.deductionPoint > 0) {
            ModelUsePointsWithSwitch modelUsePointsWithSwitchZ3 = Z();
            if (modelUsePointsWithSwitchZ3 != null) {
                modelUsePointsWithSwitchZ3.setVisibility(0);
            }
            if (this.f27561L0 != null && this.f27560K0 && (modelUsePointsWithSwitchZ = Z()) != null) {
                PreviewPayInfoResp.PaymentAvailableBean paymentAvailableBean2 = this.f27561L0;
                modelUsePointsWithSwitchZ.f28426e.setText(q0.y(r0.x0(paymentAvailableBean2 != null ? paymentAvailableBean2.deductionPoint : j6), " ", getString(p025ba.k.core_available)));
            }
            if (bean.usePoint) {
                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ4 = Z();
                if (modelUsePointsWithSwitchZ4 != null) {
                    modelUsePointsWithSwitchZ4.e(true, this.f27560K0);
                }
                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ5 = Z();
                if (modelUsePointsWithSwitchZ5 != null) {
                    modelUsePointsWithSwitchZ5.f(bean.deductionPoint, r0.A(bean.deductionPointAmount));
                }
            } else {
                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ6 = Z();
                if (modelUsePointsWithSwitchZ6 != null) {
                    modelUsePointsWithSwitchZ6.e(false, this.f27560K0);
                }
                ModelUsePointsWithSwitch modelUsePointsWithSwitchZ7 = Z();
                if (modelUsePointsWithSwitchZ7 != null) {
                    modelUsePointsWithSwitchZ7.f(j6, r0.A(j6));
                }
            }
        } else {
            ModelUsePointsWithSwitch modelUsePointsWithSwitchZ8 = Z();
            if (modelUsePointsWithSwitchZ8 != null) {
                modelUsePointsWithSwitchZ8.setVisibility(8);
            }
        }
        p355xf.t tVar2 = this.f27566q0;
        Object value = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ModelItemFee modelItemFee = (ModelItemFee) value;
        if (modelItemFee != null) {
            modelItemFee.setAmount(String.valueOf(bean.returnPoint));
        }
        Object value2 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ModelItemFee modelItemFee2 = (ModelItemFee) value2;
        if (modelItemFee2 != null) {
            modelItemFee2.setVisibility(bean.returnPoint > 0 ? 0 : 8);
        }
        ModelItemFee modelItemFeeT = T();
        if (modelItemFeeT != null) {
            PreviewPayInfoResp.CommissionEarnBean commissionEarnBean = bean.commissionEarn;
            modelItemFeeT.setAmount(r0.A(commissionEarnBean != null ? commissionEarnBean.amount : 0L));
        }
        PreviewPayInfoResp.CommissionEarnBean commissionEarnBean2 = bean.commissionEarn;
        if (commissionEarnBean2 == null || commissionEarnBean2.amount != 0) {
            T().setTips("");
        } else {
            ModelItemFee modelItemFeeT2 = T();
            PreviewPayInfoResp.CommissionEarnBean commissionEarnBean3 = bean.commissionEarn;
            modelItemFeeT2.setTips(commissionEarnBean3 != null ? commissionEarnBean3.tips : null);
        }
        ModelItemFee modelItemFeeT3 = T();
        if (modelItemFeeT3 != null) {
            PreviewPayInfoResp.CommissionEarnBean commissionEarnBean4 = bean.commissionEarn;
            modelItemFeeT3.setVisibility((commissionEarnBean4 == null || !commissionEarnBean4.isShow()) ? 8 : 0);
        }
        if (bean.returnBonus > 0) {
            ModelItemFee modelItemFeeV = V();
            if (modelItemFeeV != null) {
                modelItemFeeV.setAmount(i0.t(bean.returnBonus));
            }
            ModelItemFee modelItemFeeV2 = V();
            if (modelItemFeeV2 != null) {
                modelItemFeeV2.setVisibility(0);
            }
        } else {
            ModelItemFee modelItemFeeV3 = V();
            if (modelItemFeeV3 != null) {
                modelItemFeeV3.setVisibility(8);
            }
        }
        if (d0(this.f27789d, bean)) {
            ModelPreviewPaymentMethodItem modelPreviewPaymentMethodItemY2 = Y();
            if (modelPreviewPaymentMethodItemY2 != null) {
                modelPreviewPaymentMethodItemY2.d(true);
            }
        } else if (this.f27789d != null && (modelPreviewPaymentMethodItemY = Y()) != null) {
            modelPreviewPaymentMethodItemY.d(false);
        }
        if (bean.discountAmount <= 0) {
            ModelDiscountItem modelDiscountItemW2 = W();
            if (modelDiscountItemW2 != null) {
                modelDiscountItemW2.setVisibility(8);
            }
        } else {
            ModelDiscountItem modelDiscountItemW3 = W();
            if (modelDiscountItemW3 != null) {
                modelDiscountItemW3.setVisibility(0);
            }
            if (this.f27561L0 != null && this.f27560K0 && (modelDiscountItemW = W()) != null) {
                PreviewPayInfoResp.PaymentAvailableBean paymentAvailableBean3 = this.f27561L0;
                modelDiscountItemW.f28338e.setText(q0.y(r0.B(paymentAvailableBean3 != null ? paymentAvailableBean3.discountAmount : 0L, true), " ", getString(p025ba.k.core_available)));
            }
            ModelDiscountItem modelDiscountItemW4 = W();
            if (modelDiscountItemW4 != null) {
                modelDiscountItemW4.setDiscountAmount(bean.discountAmount);
            }
            ModelDiscountItem modelDiscountItemW5 = W();
            if (modelDiscountItemW5 != null) {
                modelDiscountItemW5.setDiscountTariffName(bean.discountTariffName);
            }
            ModelDiscountItem modelDiscountItemW6 = W();
            if (modelDiscountItemW6 != null) {
                modelDiscountItemW6.d(bean.useDiscount, this.f27560K0);
            }
        }
        long j16 = this.f27558I0;
        p355xf.t tVar3 = this.f27571v0;
        if (j16 > 0) {
            Object value3 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ModelItemFee modelItemFee3 = (ModelItemFee) value3;
            if (modelItemFee3 != null) {
                modelItemFee3.setContent(String.valueOf(this.f27558I0));
            }
            Object value4 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ModelItemFee modelItemFee4 = (ModelItemFee) value4;
            if (modelItemFee4 != null) {
                modelItemFee4.setVisibility(0);
            }
        } else {
            Object value5 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ModelItemFee modelItemFee5 = (ModelItemFee) value5;
            if (modelItemFee5 != null) {
                modelItemFee5.setVisibility(8);
            }
        }
        q(bean.couponId, bean.couponAmount);
        ModelCouponItem modelCouponItemU = U();
        if (modelCouponItemU != null) {
            p220oa.h.s(modelCouponItemU, true);
        }
        ModelCouponItem modelCouponItemU2 = U();
        if (modelCouponItemU2 != null) {
            modelCouponItemU2.setAvailableCouponCount(this.f27779A);
        }
        ModelCouponItem modelCouponItemU3 = U();
        if (modelCouponItemU3 != null) {
            modelCouponItemU3.setCoupon(this.f27790e);
        }
        ModelCouponItem modelCouponItemU4 = U();
        if (modelCouponItemU4 != null) {
            modelCouponItemU4.setCouponDeductAmount(bean.couponAmount);
        }
        Object value6 = this.f27575z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        PreviewPageItemContainer previewPageItemContainer = (PreviewPageItemContainer) value6;
        if (previewPageItemContainer != null) {
            previewPageItemContainer.a(bean.earlyRefundEnable);
        }
        Intrinsics.checkNotNullParameter(bean, "bean");
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final PreviewPayInfoV2Req v() {
        ModelUsePointsWithSwitch modelUsePointsWithSwitchZ = Z();
        boolean zIsChecked = modelUsePointsWithSwitchZ != null ? modelUsePointsWithSwitchZ.f28430j.isChecked() : false;
        ModelDiscountItem modelDiscountItemW = W();
        return R(a0(this.f27789d), zIsChecked, modelDiscountItemW != null ? modelDiscountItemW.f28339f.isChecked() : false);
    }
}
