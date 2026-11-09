package com.transsnet.palmpay.send_money.ui.activity.st4bu;

import Ed.ViewOnFocusChangeListenerC0235o;
import Kd.C;
import Kd.E;
import Kd.G;
import Kd.H;
import L6.b;
import N8.q0;
import Pa.i0;
import Pa.r0;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.CycleInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.X;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.StateAmountEditText;
import com.transsnet.palmpay.custom_view.model.ModelErrorDivider;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.utils.CvUtils;
import com.transsnet.palmpay.send_money.bean.ScheduleTransferPaymentBean;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoReq;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableOrderReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferForBankUnstableReq;
import com.transsnet.palmpay.send_money.bean.req.TransferBankChannelInfoReq;
import com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferForBankUnstableResp;
import com.transsnet.palmpay.send_money.bean.resp.TransferBankChannelInfoResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableHomeActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmTransferInfoDialog;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import p140j8.f;
import p159kd.d;
import p159kd.e;
import p159kd.h;
import p173ld.j;
import p270rd.C1976t;
import p284sb.C2023v;
import p341wd.n;
import p341wd.o;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_for_bank_unstable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferForBankUnstableViewModel;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferForBankUnstableHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferForBankUnstableHomeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableHomeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,644:1\n1#2:645\n171#3,12:646\n215#3:658\n171#3,12:659\n215#3:671\n152#3:672\n169#3:673\n152#3:674\n169#3:675\n171#3,12:676\n215#3:688\n1869#4,2:689\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferForBankUnstableHomeActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/st4bu/ScheduleTransferForBankUnstableHomeActivity\n*L\n214#1:646,12\n214#1:658\n223#1:659,12\n223#1:671\n235#1:672\n235#1:673\n240#1:674\n240#1:675\n245#1:676,12\n245#1:688\n411#1:689,2\n*E\n"})
public final class ScheduleTransferForBankUnstableHomeActivity extends BaseMvvmActivity<ScheduleTransferForBankUnstableViewModel> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f33441w0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33442A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f33443B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f33444C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f33445H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f33446L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f33447M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f33448Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f33449X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f33450Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33456g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33458j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public VerifyPaymentInfoRsp.DataBean f33459k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33461p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ScheduleTransferPaymentBean f33462p0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ConfirmTransferInfoDialog f33464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public BankInfo f33465s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ScheduleTransferForBankUnstableResp f33466t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TransferBankChannelInfoResp f33467u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33468v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ConfirmDuplicateScheduleTransferDialog f33469v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33470w;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Long f33451Z = 0L;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f33463q0 = C2131j.b(new C1976t(28));

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

    public ScheduleTransferForBankUnstableHomeActivity() {
        final int i7 = 9;
        this.f33452c = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i11 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i12 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i13 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i14 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i10 = 1;
        this.f33453d = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i12 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i13 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i14 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i11 = 2;
        this.f33454e = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i11) {
                    case 0:
                        int i12 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i13 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i14 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i12 = 3;
        this.f33455f = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i12) {
                    case 0:
                        int i13 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i14 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i13 = 4;
        this.f33456g = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i13) {
                    case 0:
                        int i14 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i14 = 5;
        this.f33457i = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i14) {
                    case 0:
                        int i15 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i15 = 6;
        this.f33458j = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i15) {
                    case 0:
                        int i16 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i16 = 7;
        this.f33460o = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i16) {
                    case 0:
                        int i17 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i17 = 8;
        this.f33461p = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i17) {
                    case 0:
                        int i18 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i18 = 10;
        this.t = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i18) {
                    case 0:
                        int i19 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i19 = 11;
        this.f33468v = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i19) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i20 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i20 = 12;
        this.f33470w = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i20) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i21 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i21 = 13;
        this.f33442A = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i21) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i22 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i22 = 14;
        this.f33443B = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i22) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i23 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i23 = 15;
        this.f33444C = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i23) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i24 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i212 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i24 = 16;
        this.f33445H = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i24) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i25 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i212 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i213 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i25 = 17;
        this.f33446L = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i25) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i26 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i212 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i213 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i214 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i26 = 18;
        this.f33447M = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i26) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i27 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i212 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i213 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i214 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i215 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
        final int i27 = 0;
        this.f33448Q = C2131j.b(new Function0(this) { // from class: wd.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43424b;

            {
                this.f43424b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43424b;
                switch (i27) {
                    case 0:
                        int i110 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tvTitle);
                    case 1:
                        int i111 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bottom_tip);
                    case 2:
                        int i112 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (RecyclerView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.rv_payment_method);
                    case 3:
                        int i113 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_amount);
                    case 4:
                        int i114 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (StateAmountEditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_amount);
                    case 5:
                        int i115 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_label);
                    case 6:
                        int i116 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_recipient_name);
                    case 7:
                        int i117 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_query_status);
                    case 8:
                        int i118 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_name);
                    case 9:
                        int i119 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_confirm);
                    case 10:
                        int i28 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_loading_text);
                    case 11:
                        int i29 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_recipient_loading);
                    case 12:
                        int i210 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (LinearLayout) scheduleTransferForBankUnstableHomeActivity.findViewById(e.ll_status);
                    case 13:
                        int i211 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_bank_name);
                    case 14:
                        int i212 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iv_bank);
                    case 15:
                        int i213 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (ModelErrorDivider) scheduleTransferForBankUnstableHomeActivity.findViewById(e.med_account);
                    case 16:
                        int i214 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (IconicsImageView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.iiv_bank_beneficiary);
                    case 17:
                        int i215 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (EditText) scheduleTransferForBankUnstableHomeActivity.findViewById(e.et_bank_account);
                    default:
                        int i216 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        return (TextView) scheduleTransferForBankUnstableHomeActivity.findViewById(e.tv_top_tip);
                }
            }
        });
    }

    public static void m(ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity) {
        BankInfo bankInfo;
        int i7;
        scheduleTransferForBankUnstableHomeActivity.y();
        String strR = scheduleTransferForBankUnstableHomeActivity.r();
        if (strR.length() >= 10 && (bankInfo = scheduleTransferForBankUnstableHomeActivity.f33465s0) != null) {
            String string = scheduleTransferForBankUnstableHomeActivity.getString(h.sm_looking_for_this_user_name);
            Object value = scheduleTransferForBankUnstableHomeActivity.f33468v.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            LinearLayout linearLayout = (LinearLayout) value;
            if (linearLayout != null) {
                p220oa.h.C(linearLayout);
            }
            Object value2 = scheduleTransferForBankUnstableHomeActivity.t.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            TextView textView = (TextView) value2;
            if (textView != null) {
                textView.setText(string);
            }
            LinearLayout linearLayoutV = scheduleTransferForBankUnstableHomeActivity.v();
            if (linearLayoutV != null) {
                p220oa.h.c(linearLayoutV);
            }
            VerifyPaymentInfoReq verifyPaymentInfoReq = new VerifyPaymentInfoReq();
            verifyPaymentInfoReq.accountNo = strR;
            int i10 = bankInfo.accountType;
            verifyPaymentInfoReq.accountType = i10;
            verifyPaymentInfoReq.payeeBankCode = bankInfo.bankCode;
            if (i10 == BankInfo.ACCOUNT_TYPE_PALMPAY) {
                i7 = 2;
            } else {
                i7 = bankInfo.mmo == 1 ? 9 : 3;
            }
            verifyPaymentInfoReq.businessType = i7;
            ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) scheduleTransferForBankUnstableHomeActivity.l();
            scheduleTransferForBankUnstableViewModel.getClass();
            f.s(scheduleTransferForBankUnstableViewModel, new H(verifyPaymentInfoReq, null), scheduleTransferForBankUnstableViewModel.f33998o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void A(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            LinearLayout linearLayoutV = v();
            if (linearLayoutV != null) {
                p220oa.h.c(linearLayoutV);
                return;
            }
            return;
        }
        LinearLayout linearLayoutV2 = v();
        if (linearLayoutV2 != null) {
            p220oa.h.C(linearLayoutV2);
        }
        TextView textViewX = x();
        if (textViewX != null) {
            textViewX.setText(str);
        }
        t tVar = this.f33460o;
        if (!z3) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ImageView imageView = (ImageView) value;
            if (imageView != null) {
                imageView.setImageResource(d.sm_icon_query_recipient_bank_succ);
            }
            TextView textViewX2 = x();
            if (textViewX2 != null) {
                textViewX2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this));
            }
            TextView textViewX3 = x();
            if (textViewX3 != null) {
                textViewX3.setTypeface(Typeface.create("sans-serif-medium", 0));
                return;
            }
            return;
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ImageView imageView2 = (ImageView) value2;
        if (imageView2 != null) {
            imageView2.setImageResource(d.sm_icon_query_recipient_bank_fail);
        }
        TextView textViewX4 = x();
        if (textViewX4 != null) {
            textViewX4.setTextColor(CommonViewExtKt.colorInt(b.ppColorError, this));
        }
        TextView textViewX5 = x();
        if (textViewX5 != null) {
            textViewX5.setTypeface(Typeface.create("sans-serif", 0));
        }
        LinearLayout linearLayoutV3 = v();
        if (linearLayoutV3 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayoutV3, View.TRANSLATION_X.getName(), 0.0f, 8.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(4.0f));
            objectAnimatorOfFloat.start();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p159kd.f.sm_activity_schedule_transfer_for_bank_untable;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferForBankUnstableViewModel) l()).f33994f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new n(this, this, 0), 16));
        }
        l lVar2 = ((ScheduleTransferForBankUnstableViewModel) l()).f33995g;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new n(this, this, 1), 16));
        }
        l lVar3 = ((ScheduleTransferForBankUnstableViewModel) l()).f33998o;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new o(this, 0), 16));
        }
        l lVar4 = ((ScheduleTransferForBankUnstableViewModel) l()).f33999p;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new o(this, 1), 16));
        }
        l lVar5 = ((ScheduleTransferForBankUnstableViewModel) l()).f34000v;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new n(this, this, 2), 16));
        }
        if (TextUtils.isEmpty(this.f33450Y)) {
            p220oa.h.r(t(), new R3.e(this, 25), new ViewOnFocusChangeListenerC0235o(this, 28));
            return;
        }
        t().setText(i0.o(this.f33450Y));
        t().setEnabled(false);
        p220oa.h.c(u());
        t().setAlpha(0.6f);
        Object value = this.f33443B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ImageView) value).setAlpha(0.6f);
        Object value2 = this.f33442A.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setAlpha(0.6f);
        m(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n() {
        ArrayList<ScheduleTransferPaymentBean> paymentList;
        long jG = r0.g(s().getString());
        if (this.f33462p0 != null) {
            this.f33462p0 = null;
        }
        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp = this.f33466t0;
        boolean z3 = false;
        if (scheduleTransferForBankUnstableResp != null && (paymentList = scheduleTransferForBankUnstableResp.getPaymentList()) != null) {
            boolean z8 = false;
            for (ScheduleTransferPaymentBean scheduleTransferPaymentBean : paymentList) {
                scheduleTransferPaymentBean.setBalanceEnough(jG <= scheduleTransferPaymentBean.getBalance());
                z8 = z8 || scheduleTransferPaymentBean.getBalanceEnough();
                scheduleTransferPaymentBean.setDefaultOption(false);
                if (this.f33462p0 == null && scheduleTransferPaymentBean.getBalanceEnough()) {
                    scheduleTransferPaymentBean.setDefaultOption(true);
                    this.f33462p0 = scheduleTransferPaymentBean;
                }
            }
            z3 = z8;
        }
        j jVarQ = q();
        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp2 = this.f33466t0;
        jVarQ.setList(scheduleTransferForBankUnstableResp2 != null ? scheduleTransferForBankUnstableResp2.getPaymentList() : null);
        t tVar = this.f33452c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if (textView != null) {
            textView.setEnabled(z3);
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView2 = (TextView) value2;
        if (textView2 != null) {
            textView2.setText(getString(z3 ? h.sm_book_new_transfer : h.sm_no_available_payment_method));
        }
    }

    public final void o() {
        Long maxAmount;
        Long minAmount;
        Long maxAmount2;
        Long minAmount2;
        if (r().length() < 10) {
            w().setErrorMessage("Please enter 10 digits account number.");
            return;
        }
        w().setErrorMessage("");
        long jG = r0.g(s().getString());
        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp = this.f33466t0;
        long jLongValue = 0;
        long jLongValue2 = (scheduleTransferForBankUnstableResp == null || (minAmount2 = scheduleTransferForBankUnstableResp.getMinAmount()) == null) ? 0L : minAmount2.longValue();
        t tVar = this.f33455f;
        if (jLongValue2 <= jG) {
            ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp2 = this.f33466t0;
            if (((scheduleTransferForBankUnstableResp2 == null || (maxAmount2 = scheduleTransferForBankUnstableResp2.getMaxAmount()) == null) ? 0L : maxAmount2.longValue()) >= jG) {
                Object value = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((ModelErrorDivider) value).setErrorMessage("");
                if (this.f33462p0 == null) {
                    p220oa.h.x(this, "");
                    return;
                }
                if (!t().isEnabled()) {
                    p();
                    return;
                }
                ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) l();
                TransferBankChannelInfoReq req = new TransferBankChannelInfoReq();
                req.setPayeeBankCardNo(r());
                BankInfo bankInfo = this.f33465s0;
                req.setPayeeBankCode(bankInfo != null ? bankInfo.bankCode : null);
                VerifyPaymentInfoRsp.DataBean dataBean = this.f33459k0;
                req.setPayeeAccountName(dataBean != null ? dataBean.accountName : null);
                scheduleTransferForBankUnstableViewModel.getClass();
                Intrinsics.checkNotNullParameter(req, "req");
                f.s(scheduleTransferForBankUnstableViewModel, new G(req, null), scheduleTransferForBankUnstableViewModel.f34000v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                return;
            }
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ModelErrorDivider modelErrorDivider = (ModelErrorDivider) value2;
        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp3 = this.f33466t0;
        String strB = r0.B((scheduleTransferForBankUnstableResp3 == null || (minAmount = scheduleTransferForBankUnstableResp3.getMinAmount()) == null) ? 0L : minAmount.longValue(), false);
        ScheduleTransferForBankUnstableResp scheduleTransferForBankUnstableResp4 = this.f33466t0;
        if (scheduleTransferForBankUnstableResp4 != null && (maxAmount = scheduleTransferForBankUnstableResp4.getMaxAmount()) != null) {
            jLongValue = maxAmount.longValue();
        }
        modelErrorDivider.setErrorMessage("Please enter amount " + strB + " - " + r0.B(jLongValue, false));
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        EditText editTextT;
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1) {
            if (i7 != 102) {
                if (i7 == 103 && intent != null) {
                    String stringExtra = intent.getStringExtra("extra_data");
                    if (TextUtils.isEmpty(stringExtra) || (editTextT = t()) == null) {
                        return;
                    }
                    editTextT.setText(stringExtra);
                    return;
                }
                return;
            }
            ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) l();
            ScheduleTransferForBankUnstableOrderReq req = new ScheduleTransferForBankUnstableOrderReq();
            req.setAmount(r0.g(s().getString()));
            req.setPayeeBankCardNo(r());
            BankInfo bankInfo = this.f33465s0;
            req.setPayeeBankCode(bankInfo != null ? bankInfo.bankCode : null);
            VerifyPaymentInfoRsp.DataBean dataBean = this.f33459k0;
            req.setPayeeAccountName(dataBean != null ? dataBean.accountName : null);
            ScheduleTransferPaymentBean scheduleTransferPaymentBean = this.f33462p0;
            req.setPaymentType(scheduleTransferPaymentBean != null ? scheduleTransferPaymentBean.getPaymentType() : null);
            scheduleTransferForBankUnstableViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(scheduleTransferForBankUnstableViewModel, new C(req, null), scheduleTransferForBankUnstableViewModel.f33995g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final void p() {
        ARouter.getInstance().build("/account/authentication").withBoolean("extra_use_night_mode", true).navigation(this, 102);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) l();
        ScheduleTransferForBankUnstableReq scheduleTransferForBankUnstableReq = new ScheduleTransferForBankUnstableReq();
        scheduleTransferForBankUnstableReq.setAmount(r0.g(s().getString()));
        scheduleTransferForBankUnstableReq.setPayeeBankCardNo(this.f33450Y);
        VerifyPaymentInfoRsp.DataBean dataBean = this.f33459k0;
        scheduleTransferForBankUnstableReq.setPayeeAccountName(dataBean != null ? dataBean.accountName : null);
        BankInfo bankInfo = this.f33465s0;
        scheduleTransferForBankUnstableReq.setPayeeBankCode(bankInfo != null ? bankInfo.bankCode : null);
        scheduleTransferForBankUnstableViewModel.getClass();
        f.s(scheduleTransferForBankUnstableViewModel, new E(scheduleTransferForBankUnstableReq, null), scheduleTransferForBankUnstableViewModel.f33994f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final j q() {
        return (j) this.f33463q0.getValue();
    }

    public final String r() {
        EditText editTextT = t();
        return y.k(String.valueOf(editTextT != null ? editTextT.getText() : null), " ", "");
    }

    public final StateAmountEditText s() {
        Object value = this.f33456g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (StateAmountEditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorDisabled, this), !isDarkMode());
        Object value = this.f33448Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(Html.fromHtml(getString(h.sm_book_transfer_timely_money_delivery), 0));
        t tVar = this.f33454e;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(q());
        q().setOnItemChildClickListener(new p341wd.l(this));
        q().setOnItemClickListener(new p341wd.l(this));
        final int i7 = 0;
        u().setOnClickListener(new View.OnClickListener(this) { // from class: wd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43427b;

            {
                this.f43427b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43427b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_for_bank_unstable_beneficiaries_list");
                        BankInfo bankInfo = scheduleTransferForBankUnstableHomeActivity.f33465s0;
                        postcardBuild.withString("extra_data", bankInfo != null ? bankInfo.bankCode : null).navigation(scheduleTransferForBankUnstableHomeActivity, MsgEvent.MSG_EVENT_STOP_FOREGROUND);
                        break;
                    default:
                        int i11 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.o();
                        break;
                }
            }
        });
        Object value4 = this.f33452c.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        ((TextView) value4).setOnClickListener(new View.OnClickListener(this) { // from class: wd.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferForBankUnstableHomeActivity f43427b;

            {
                this.f43427b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScheduleTransferForBankUnstableHomeActivity scheduleTransferForBankUnstableHomeActivity = this.f43427b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_for_bank_unstable_beneficiaries_list");
                        BankInfo bankInfo = scheduleTransferForBankUnstableHomeActivity.f33465s0;
                        postcardBuild.withString("extra_data", bankInfo != null ? bankInfo.bankCode : null).navigation(scheduleTransferForBankUnstableHomeActivity, MsgEvent.MSG_EVENT_STOP_FOREGROUND);
                        break;
                    default:
                        int i12 = ScheduleTransferForBankUnstableHomeActivity.f33441w0;
                        scheduleTransferForBankUnstableHomeActivity.o();
                        break;
                }
            }
        });
        s().setHint(C0.G.i("").append(getString(h.sm_amount_less_desc, q0.j(BaseApplication.getCurrencySymbol(), " 50"))).setFontFamily("sans-serif").create());
        t().setHint(C0.G.i("").append(getString(h.sm_enter_10_digit_account_number)).setFontFamily("sans-serif").create());
        t().setInputType(2);
        s().setOnTextInputListener(new p341wd.l(this));
        String str = this.f33450Y;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                this.f33450Y = y.k(str, " ", "");
            }
        }
        Long l5 = this.f33451Z;
        if (l5 != null) {
            if (l5.longValue() <= 0) {
                l5 = null;
            }
            if (l5 != null) {
                long jLongValue = l5.longValue();
                StateAmountEditText stateAmountEditTextS = s();
                String strA = r0.A(jLongValue);
                Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
                String thousandsSeparators = CvUtils.getThousandsSeparators(this);
                Intrinsics.checkNotNullExpressionValue(thousandsSeparators, "getThousandsSeparators(...)");
                stateAmountEditTextS.setText(y.k(strA, thousandsSeparators, ""));
            }
        }
        String str2 = this.f33449X;
        if (str2 != null) {
            String str3 = TextUtils.isEmpty(str2) ? null : str2;
            if (str3 != null) {
                BankInfo bankInfo = (BankInfo) d0.l(BankInfo.class, str3);
                this.f33465s0 = bankInfo;
                if (bankInfo != null) {
                    Object value5 = this.f33443B.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    r0.v1(bankInfo.bankUrl, (ImageView) value5);
                    Object value6 = this.f33442A.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    ((TextView) value6).setText(bankInfo.bankName);
                }
            }
        }
    }

    public final EditText t() {
        Object value = this.f33446L.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    public final IconicsImageView u() {
        Object value = this.f33445H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    public final LinearLayout v() {
        Object value = this.f33461p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final ModelErrorDivider w() {
        Object value = this.f33444C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelErrorDivider) value;
    }

    public final TextView x() {
        Object value = this.f33458j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void y() {
        try {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.f(new Fade(1));
            transitionSet.f(new ChangeBounds());
            Object value = this.f33470w.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            LinearLayout linearLayout = (LinearLayout) value;
            if (linearLayout != null) {
                X.a(linearLayout, transitionSet);
            }
        } catch (Exception unused) {
        }
        Object value2 = this.f33468v.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LinearLayout linearLayout2 = (LinearLayout) value2;
        if (linearLayout2 != null) {
            p220oa.h.c(linearLayout2);
        }
        LinearLayout linearLayoutV = v();
        if (linearLayoutV != null) {
            p220oa.h.c(linearLayoutV);
        }
    }

    public final void z(VerifyPaymentInfoRsp verifyPaymentInfoRsp, boolean z3) {
        y();
        ModelErrorDivider modelErrorDividerW = w();
        if (modelErrorDividerW != null) {
            modelErrorDividerW.setErrorMessage("");
        }
        if (!verifyPaymentInfoRsp.isSuccess()) {
            LinearLayout linearLayoutV = v();
            if (linearLayoutV != null) {
                p220oa.h.C(linearLayoutV);
            }
            this.f33459k0 = null;
            A(verifyPaymentInfoRsp.getRespMsg(), true);
            return;
        }
        VerifyPaymentInfoRsp.DataBean dataBean = verifyPaymentInfoRsp.data;
        if (dataBean != null) {
            this.f33459k0 = dataBean;
            if (!TextUtils.isEmpty(dataBean.accountName)) {
                LinearLayout linearLayoutV2 = v();
                if (linearLayoutV2 != null) {
                    p220oa.h.C(linearLayoutV2);
                }
                A(dataBean.accountName, false);
            }
            if (!z3 || this.f33465s0 == null) {
                return;
            }
            o();
        }
    }
}
