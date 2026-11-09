package com.transsnet.palmpay.cash_in.ui.activity;

import C9.C0143j;
import C9.C0144k;
import J9.r;
import J9.s;
import L6.b;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.cash_in.ui.activity.CashInReceiptActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/trans_receipt")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/CashInReceiptActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawDetailViewModel;", "<init>", "()V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashInReceiptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashInReceiptActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/CashInReceiptActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,333:1\n171#2,12:334\n215#2:346\n171#2,12:347\n215#2:359\n171#2,12:360\n215#2:372\n*S KotlinDebug\n*F\n+ 1 CashInReceiptActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/CashInReceiptActivity\n*L\n125#1:334,12\n125#1:346\n190#1:347,12\n190#1:359\n273#1:360,12\n273#1:372\n*E\n"})
public final class CashInReceiptActivity extends BaseMvvmActivity<WithdrawDetailViewModel> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f26800w0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f26801A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f26802B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f26803C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f26804H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f26805L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f26806M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f26807Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f26808X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f26809Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f26810Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26815g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26817j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f26818k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f26820p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f26821p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f26822q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f26823r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f26824s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f26825t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f26826u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26827v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f26828v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f26829w;

    public CashInReceiptActivity() {
        final int i7 = 20;
        this.f26811c = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i7) {
                    case 0:
                        int i10 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i11 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i12 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i13 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i14 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i10 = 3;
        this.f26812d = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i10) {
                    case 0:
                        int i11 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i12 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i13 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i14 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i11 = 12;
        this.f26813e = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i11) {
                    case 0:
                        int i12 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i13 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i14 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i12 = 13;
        this.f26814f = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i12) {
                    case 0:
                        int i13 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i14 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i13 = 14;
        this.f26815g = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i13) {
                    case 0:
                        int i14 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i14 = 15;
        this.f26816i = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i14) {
                    case 0:
                        int i15 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i15 = 16;
        this.f26817j = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i15) {
                    case 0:
                        int i16 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i16 = 17;
        this.f26819o = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i16) {
                    case 0:
                        int i17 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i17 = 18;
        this.f26820p = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i17) {
                    case 0:
                        int i18 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i18 = 19;
        this.t = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i18) {
                    case 0:
                        int i19 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i19 = 21;
        this.f26827v = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i19) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i20 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i20 = 22;
        this.f26829w = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i20) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i21 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i21 = 23;
        this.f26801A = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i21) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i22 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i22 = 24;
        this.f26802B = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i22) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i23 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i23 = 25;
        this.f26803C = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i23) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i24 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i24 = 26;
        this.f26804H = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i24) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i25 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i25 = 27;
        this.f26805L = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i25) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i26 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i26 = 0;
        this.f26806M = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i26) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i27 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i27 = 1;
        this.f26807Q = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i27) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i28 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i28 = 2;
        this.f26808X = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i28) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i29 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i29 = 4;
        this.f26809Y = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i29) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i30 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i30 = 5;
        this.f26810Z = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i30) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i31 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i31 = 6;
        this.f26818k0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i31) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i32 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i32 = 7;
        this.f26821p0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i32) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i33 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i310 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i33 = 8;
        this.f26822q0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i33) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i34 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i310 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i311 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i34 = 9;
        this.f26823r0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i34) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i35 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i311 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i312 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i35 = 10;
        this.f26824s0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i35) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i36 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i310 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i312 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i313 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
        final int i36 = 11;
        this.f26825t0 = C2131j.b(new Function0(this) { // from class: C9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1307b;

            {
                this.f1307b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CashInReceiptActivity cashInReceiptActivity = this.f1307b;
                switch (i36) {
                    case 0:
                        int i110 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutBankName);
                    case 1:
                        int i111 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutMidInfo);
                    case 2:
                        int i112 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_account);
                    case 3:
                        int i113 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.shareTv);
                    case 4:
                        int i114 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_sender_name);
                    case 5:
                        int i115 = CashInReceiptActivity.f26800w0;
                        return (RelativeLayout) cashInReceiptActivity.findViewById(p366y9.b.rl_sender);
                    case 6:
                        int i116 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_account);
                    case 7:
                        int i117 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_name);
                    case 8:
                        int i118 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_date);
                    case 9:
                        int i119 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_recipient_desc);
                    case 10:
                        int i210 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.str_amount);
                    case 11:
                        int i211 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.receiptView);
                    case 12:
                        int i212 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBottomTips);
                    case 13:
                        int i213 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupportEmail);
                    case 14:
                        int i214 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvSupport);
                    case 15:
                        int i215 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id);
                    case 16:
                        int i216 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_session_id_title);
                    case 17:
                        int i217 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id);
                    case 18:
                        int i218 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_transaction_id_title);
                    case 19:
                        int i219 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark);
                    case 20:
                        int i37 = CashInReceiptActivity.f26800w0;
                        return (IconicsTextView) cashInReceiptActivity.findViewById(p366y9.b.saveTv);
                    case 21:
                        int i38 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tv_remark_title);
                    case 22:
                        int i39 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvFundMethod);
                    case 23:
                        int i310 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutFundMethod);
                    case 24:
                        int i311 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumber);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvCardNumberTitle);
                    case 26:
                        int i313 = CashInReceiptActivity.f26800w0;
                        return (LinearLayout) cashInReceiptActivity.findViewById(p366y9.b.layoutAccountNumber);
                    default:
                        int i314 = CashInReceiptActivity.f26800w0;
                        return (TextView) cashInReceiptActivity.findViewById(p366y9.b.tvBankName);
                }
            }
        });
    }

    public static final TextView m(CashInReceiptActivity cashInReceiptActivity) {
        Object value = cashInReceiptActivity.f26829w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final TextView n(CashInReceiptActivity cashInReceiptActivity) {
        Object value = cashInReceiptActivity.f26821p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final TextView o(CashInReceiptActivity cashInReceiptActivity) {
        Object value = cashInReceiptActivity.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final TextView p(CashInReceiptActivity cashInReceiptActivity) {
        Object value = cashInReceiptActivity.f26816i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public static final TextView q(CashInReceiptActivity cashInReceiptActivity) {
        Object value = cashInReceiptActivity.f26819o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_trans_receipt_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((WithdrawDetailViewModel) l()).f27106f;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0143j(this, this, 0), 0));
        }
        l lVar2 = ((WithdrawDetailViewModel) l()).f27107g;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0143j(this, this, 1), 0));
        }
        l lVar3 = ((WithdrawDetailViewModel) l()).f27108i;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new C0143j(this, this, 2), 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (TextUtils.equals(TransType.TRANS_TYPE_WITHDRAW_TO_AGENT, this.f26828v0)) {
            ((WithdrawDetailViewModel) l()).d(this.f26826u0);
            return;
        }
        if (TextUtils.equals("01", this.f26828v0)) {
            WithdrawDetailViewModel withdrawDetailViewModel = (WithdrawDetailViewModel) l();
            String str = this.f26826u0;
            withdrawDetailViewModel.getClass();
            f.s(withdrawDetailViewModel, new s(str, null), withdrawDetailViewModel.f27107g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            return;
        }
        if (TextUtils.equals(TransType.TRANS_TYPE_BIND_BANK_CARD, this.f26828v0)) {
            WithdrawDetailViewModel withdrawDetailViewModel2 = (WithdrawDetailViewModel) l();
            String str2 = this.f26826u0;
            withdrawDetailViewModel2.getClass();
            f.s(withdrawDetailViewModel2, new r(str2, null), withdrawDetailViewModel2.f27108i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        Object value = this.f26812d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        ((IconicsTextView) value).setOnClickListener(new View.OnClickListener(this) { // from class: C9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1305b;

            {
                this.f1305b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashInReceiptActivity cashInReceiptActivity = this.f1305b;
                int i10 = 0;
                switch (i7) {
                    case 0:
                        String str = cashInReceiptActivity.f26826u0;
                        C0142i c0142i = new C0142i(cashInReceiptActivity, i10);
                        Object value2 = cashInReceiptActivity.f26825t0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        r0.M1(str, 685, c0142i, (LinearLayout) value2);
                        break;
                    default:
                        int i11 = CashInReceiptActivity.f26800w0;
                        Object value3 = cashInReceiptActivity.f26825t0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        r0.J1(null, (LinearLayout) value3);
                        break;
                }
            }
        });
        Object value2 = this.f26811c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        ((IconicsTextView) value2).setOnClickListener(new View.OnClickListener(this) { // from class: C9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashInReceiptActivity f1305b;

            {
                this.f1305b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CashInReceiptActivity cashInReceiptActivity = this.f1305b;
                int i11 = 0;
                switch (i10) {
                    case 0:
                        String str = cashInReceiptActivity.f26826u0;
                        C0142i c0142i = new C0142i(cashInReceiptActivity, i11);
                        Object value3 = cashInReceiptActivity.f26825t0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        r0.M1(str, 685, c0142i, (LinearLayout) value3);
                        break;
                    default:
                        int i12 = CashInReceiptActivity.f26800w0;
                        Object value4 = cashInReceiptActivity.f26825t0.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        r0.J1(null, (LinearLayout) value4);
                        break;
                }
            }
        });
    }
}
