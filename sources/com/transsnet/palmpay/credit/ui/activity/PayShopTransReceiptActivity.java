package com.transsnet.palmpay.credit.ui.activity;

import C9.C0142i;
import L6.b;
import Pa.r0;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTransReceiptActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PayShopPaymentViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p141j9.s;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/trans_receipt")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopTransReceiptActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/PayShopPaymentViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayShopTransReceiptActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayShopTransReceiptActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopTransReceiptActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,168:1\n171#2,12:169\n215#2:181\n*S KotlinDebug\n*F\n+ 1 PayShopTransReceiptActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopTransReceiptActivity\n*L\n104#1:169,12\n104#1:181\n*E\n"})
public final class PayShopTransReceiptActivity extends CreditBaseMvvmActivity<PayShopPaymentViewModel> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f28760Z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28761A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28762B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28763C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28764H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28765L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28766M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28767Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28768X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f28769Y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28771g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28773j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28774o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28775p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28776v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28777w;

    public PayShopTransReceiptActivity() {
        final int i7 = 0;
        this.f28770f = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i11 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i12 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i13 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i14 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i10 = 15;
        this.f28771g = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i12 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i13 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i14 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i11 = 16;
        this.f28772i = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i13 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i14 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i12 = 1;
        this.f28773j = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i12) {
                    case 0:
                        int i13 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i14 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i13 = 2;
        this.f28774o = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i13) {
                    case 0:
                        int i14 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i14 = 3;
        this.f28775p = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i14) {
                    case 0:
                        int i15 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i15 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i15) {
                    case 0:
                        int i16 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i16 = 5;
        this.f28776v = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i16) {
                    case 0:
                        int i17 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i17 = 6;
        this.f28777w = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i17) {
                    case 0:
                        int i18 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i18 = 7;
        this.f28761A = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i18) {
                    case 0:
                        int i19 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i19 = 8;
        this.f28762B = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i19) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i20 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i20 = 9;
        this.f28763C = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i20) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i21 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i21 = 10;
        this.f28764H = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i21) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i22 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i28 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i22 = 11;
        this.f28765L = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i22) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i23 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i28 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i29 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i23 = 12;
        this.f28766M = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i23) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i24 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i28 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i29 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i210 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i24 = 13;
        this.f28767Q = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i24) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i25 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i28 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i29 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i210 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i211 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
        final int i25 = 14;
        this.f28768X = C2131j.b(new Function0(this) { // from class: sb.J

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42127b;

            {
                this.f42127b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42127b;
                switch (i25) {
                    case 0:
                        int i110 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.saveTv);
                    case 1:
                        int i111 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id_title);
                    case 2:
                        int i112 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id);
                    case 3:
                        int i113 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_id_title);
                    case 4:
                        int i114 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark);
                    case 5:
                        int i115 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_remark_title);
                    case 6:
                        int i116 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_transaction_type);
                    case 7:
                        int i117 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_account);
                    case 8:
                        int i118 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_sender_name);
                    case 9:
                        int i119 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_account);
                    case 10:
                        int i26 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_name);
                    case 11:
                        int i27 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_date);
                    case 12:
                        int i28 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_recipient_desc);
                    case 13:
                        int i29 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.str_amount);
                    case 14:
                        int i210 = PayShopTransReceiptActivity.f28760Z;
                        return (LinearLayout) payShopTransReceiptActivity.findViewById(e.receiptView);
                    case 15:
                        int i211 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.shareTv);
                    default:
                        int i212 = PayShopTransReceiptActivity.f28760Z;
                        return (TextView) payShopTransReceiptActivity.findViewById(e.tv_session_id);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_trans_receipt_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PayShopPaymentViewModel) l()).f30704e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 17), (char) 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((PayShopPaymentViewModel) l()).d(this.f28769Y);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        Object value = this.f28771g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: sb.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42129b;

            {
                this.f42129b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42129b;
                switch (i7) {
                    case 0:
                        String str = payShopTransReceiptActivity.f28769Y;
                        C0142i c0142i = new C0142i(payShopTransReceiptActivity, 19);
                        Object value2 = payShopTransReceiptActivity.f28768X.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        r0.M1(str, 685, c0142i, (LinearLayout) value2);
                        break;
                    default:
                        int i10 = PayShopTransReceiptActivity.f28760Z;
                        Object value3 = payShopTransReceiptActivity.f28768X.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        r0.J1(null, (LinearLayout) value3);
                        break;
                }
            }
        }, (TextView) value);
        Object value2 = this.f28770f.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: sb.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTransReceiptActivity f42129b;

            {
                this.f42129b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayShopTransReceiptActivity payShopTransReceiptActivity = this.f42129b;
                switch (i10) {
                    case 0:
                        String str = payShopTransReceiptActivity.f28769Y;
                        C0142i c0142i = new C0142i(payShopTransReceiptActivity, 19);
                        Object value3 = payShopTransReceiptActivity.f28768X.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        r0.M1(str, 685, c0142i, (LinearLayout) value3);
                        break;
                    default:
                        int i11 = PayShopTransReceiptActivity.f28760Z;
                        Object value4 = payShopTransReceiptActivity.f28768X.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        r0.J1(null, (LinearLayout) value4);
                        break;
                }
            }
        }, (TextView) value2);
    }
}
