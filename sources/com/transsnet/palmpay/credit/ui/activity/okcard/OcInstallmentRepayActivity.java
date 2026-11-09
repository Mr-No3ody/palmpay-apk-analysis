package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import C9.C0155w;
import N8.r;
import O6.c;
import Pa.C0525w;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.g;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.bean.other.OcInstallmentRepayExtensionBean;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.resp.OcInsRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.SpreadInfoDto;
import com.transsnet.palmpay.credit.bean.resp.SpreadRepaymentPlan;
import com.transsnet.palmpay.credit.bean.resp.StampDutyPromptInfo;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcInstallmentRepayActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRepaymentPlanDialog;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p071ef.b;
import p284sb.A;
import p294tb.C2055q;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;
import p368yb.D;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC分期还款页", path = "/credit_score/oc_install_repay_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcInstallmentRepayActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcInstallmentRepayActivity extends Za.b {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f29525t0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29527B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29528C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29529H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29530L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29531M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29532Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29533X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29534Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public String f29535Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29539g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29541j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f29542k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29543o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29544p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public OcInsRepaymentPlanData f29545p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f29546q0 = -1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f29547r0 = new ArrayList();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public D f29548s0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29550w;

    public OcInstallmentRepayActivity() {
        final int i7 = 17;
        this.f29536d = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i7) {
                    case 0:
                        int i10 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i11 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i12 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i10 = 8;
        this.f29537e = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i10) {
                    case 0:
                        int i11 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i12 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i11 = 9;
        this.f29538f = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i11) {
                    case 0:
                        int i12 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i12 = 10;
        this.f29539g = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i12) {
                    case 0:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i13 = 11;
        this.f29540i = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i13) {
                    case 0:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i14 = 12;
        this.f29541j = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i14) {
                    case 0:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i15 = 13;
        this.f29543o = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i15) {
                    case 0:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i16 = 14;
        this.f29544p = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i16) {
                    case 0:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i17 = 15;
        this.t = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i17) {
                    case 0:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i18 = 16;
        this.f29549v = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i18) {
                    case 0:
                        int i19 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i19 = 18;
        this.f29550w = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i19) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i20 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i20 = 19;
        this.f29526A = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i20) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i21 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i21 = 0;
        this.f29527B = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i21) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i22 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i22 = 1;
        this.f29528C = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i22) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i23 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i23 = 2;
        this.f29529H = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i23) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i24 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i24 = 3;
        this.f29530L = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i24) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i25 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i214 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i25 = 4;
        this.f29531M = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i25) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i26 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i214 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i215 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i26 = 5;
        this.f29532Q = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i26) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i27 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i214 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i215 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i216 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i27 = 6;
        this.f29533X = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i27) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i28 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i214 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i215 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i216 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i217 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
        final int i28 = 7;
        this.f29534Y = C2131j.b(new Function0(this) { // from class: ub.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42831b;

            {
                this.f42831b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42831b;
                switch (i28) {
                    case 0:
                        int i110 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.oc_ins_detail_ll);
                    case 1:
                        int i111 = OcInstallmentRepayActivity.f29525t0;
                        return (AmountEditText) ocInstallmentRepayActivity.findViewById(e.oc_ins_input_amount_et);
                    case 2:
                        int i112 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_symbol_tv);
                    case 3:
                        int i113 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_title_tv);
                    case 4:
                        int i114 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.server_img);
                    case 5:
                        int i115 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_bill_date_tv);
                    case 6:
                        int i116 = OcInstallmentRepayActivity.f29525t0;
                        return (ImageView) ocInstallmentRepayActivity.findViewById(e.repay_ins_back_siv);
                    case 7:
                        int i117 = OcInstallmentRepayActivity.f29525t0;
                        return (RepayStampDutyView) ocInstallmentRepayActivity.findViewById(e.repayStampDutyView);
                    case 8:
                        int i118 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.spread_proto_tv);
                    case 9:
                        int i119 = OcInstallmentRepayActivity.f29525t0;
                        return (CheckBox) ocInstallmentRepayActivity.findViewById(e.oc_ins_proto_cb);
                    case 10:
                        int i29 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.oc_ins_cur_repay_amount);
                    case 11:
                        int i210 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.overdue_interest_tv);
                    case 12:
                        int i211 = OcInstallmentRepayActivity.f29525t0;
                        return (LinearLayout) ocInstallmentRepayActivity.findViewById(e.overdue_item_ll);
                    case 13:
                        int i212 = OcInstallmentRepayActivity.f29525t0;
                        return ocInstallmentRepayActivity.findViewById(e.repayment_date_divider_view);
                    case 14:
                        int i213 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_interest_tv);
                    case 15:
                        int i214 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.cur_plan_content_tv);
                    case 16:
                        int i215 = OcInstallmentRepayActivity.f29525t0;
                        return (ConstraintLayout) ocInstallmentRepayActivity.findViewById(e.repayment_plan_cl);
                    case 17:
                        int i216 = OcInstallmentRepayActivity.f29525t0;
                        return (Button) ocInstallmentRepayActivity.findViewById(e.oc_ins_next_bt);
                    case 18:
                        int i217 = OcInstallmentRepayActivity.f29525t0;
                        return (RecyclerView) ocInstallmentRepayActivity.findViewById(e.oc_ins_count_rv);
                    default:
                        int i218 = OcInstallmentRepayActivity.f29525t0;
                        return (TextView) ocInstallmentRepayActivity.findViewById(e.selected_pay_in_tv);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:88:0x024b  */
    public static final void m(OcInstallmentRepayActivity ocInstallmentRepayActivity) {
        boolean z3;
        List<SpreadRepaymentPlan> spreadRepaymentPlanList;
        List<SpreadRepaymentPlan> spreadRepaymentPlanList2;
        Long currentServiceFee;
        Long currentAmountSum;
        OcInsRepaymentPlanData ocInsRepaymentPlanData = ocInstallmentRepayActivity.f29545p0;
        ArrayList arrayList = ocInstallmentRepayActivity.f29547r0;
        if (ocInsRepaymentPlanData != null) {
            boolean zC = Intrinsics.c(ocInsRepaymentPlanData.getOverDueStatus(), Boolean.TRUE);
            t tVar = ocInstallmentRepayActivity.f29541j;
            t tVar2 = ocInstallmentRepayActivity.f29543o;
            if (zC) {
                Object value = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((View) value).setVisibility(0);
                Object value2 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((LinearLayout) value2).setVisibility(0);
            } else {
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((View) value3).setVisibility(8);
                Object value4 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((LinearLayout) value4).setVisibility(8);
            }
            Object value5 = ocInstallmentRepayActivity.f29528C.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            AmountEditText amountEditText = (AmountEditText) value5;
            Long unpaidPrincipal = ocInsRepaymentPlanData.getUnpaidPrincipal();
            amountEditText.setText(new SpannableStringBuilder(r0.A(unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L)));
            StampDutyPromptInfo stampDutyPromptInfo = ocInsRepaymentPlanData.getStampDutyPromptInfo();
            if (stampDutyPromptInfo != null) {
                Long unpaidPrincipal2 = ocInsRepaymentPlanData.getUnpaidPrincipal();
                long jLongValue = unpaidPrincipal2 != null ? unpaidPrincipal2.longValue() : 0L;
                F6.d.h(ocInstallmentRepayActivity.TAG, 3, u.i(jLongValue, "repayAmount >>> "));
                Long thresholdAmount = stampDutyPromptInfo.getThresholdAmount();
                boolean z8 = jLongValue >= (thresholdAmount != null ? thresholdAmount.longValue() : 1000000L);
                Object value6 = ocInstallmentRepayActivity.f29534Y.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((RepayStampDutyView) value6).d(z8, stampDutyPromptInfo);
            }
            Object value7 = ocInstallmentRepayActivity.f29532Q.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            TextView textView = (TextView) value7;
            int i7 = Ya.g.cs_oc_ins_bill_date;
            Long billBeginDateStamp = ocInsRepaymentPlanData.getBillBeginDateStamp();
            String strX1 = r0.X1(Long.valueOf(billBeginDateStamp != null ? billBeginDateStamp.longValue() : 0L), "dd MMM");
            Long billEndDateStamp = ocInsRepaymentPlanData.getBillEndDateStamp();
            textView.setText(ocInstallmentRepayActivity.getString(i7, strX1, r0.X1(Long.valueOf(billEndDateStamp != null ? billEndDateStamp.longValue() : 0L), "dd MMM")));
            int i10 = ocInstallmentRepayActivity.f29546q0;
            if (i10 >= 0 && i10 < arrayList.size() && (spreadRepaymentPlanList2 = ((SpreadInfoDto) arrayList.get(ocInstallmentRepayActivity.f29546q0)).getSpreadRepaymentPlanList()) != null && !spreadRepaymentPlanList2.isEmpty()) {
                Object obj = arrayList.get(ocInstallmentRepayActivity.f29546q0);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj;
                TextView textViewP = ocInstallmentRepayActivity.p();
                int i11 = Ya.g.cs_oc_ins_pay_in;
                Integer id2 = spreadInfoDto.getId();
                textViewP.setText(ocInstallmentRepayActivity.getString(i11, Integer.valueOf(id2 != null ? id2.intValue() : 0)));
                List<SpreadRepaymentPlan> spreadRepaymentPlanList3 = spreadInfoDto.getSpreadRepaymentPlanList();
                SpreadRepaymentPlan spreadRepaymentPlan = spreadRepaymentPlanList3 != null ? spreadRepaymentPlanList3.get(0) : null;
                Object value8 = ocInstallmentRepayActivity.t.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                ((TextView) value8).setText(ocInstallmentRepayActivity.getString(Ya.g.cs_cl_first_repayment_amount, r0.B((spreadRepaymentPlan == null || (currentAmountSum = spreadRepaymentPlan.getCurrentAmountSum()) == null) ? 0L : currentAmountSum.longValue(), false)));
                Object value9 = ocInstallmentRepayActivity.f29544p.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                ((TextView) value9).setText(ocInstallmentRepayActivity.getString(Ya.g.cs_cl_first_repayment_interest, r0.B((spreadRepaymentPlan == null || (currentServiceFee = spreadRepaymentPlan.getCurrentServiceFee()) == null) ? 0L : currentServiceFee.longValue(), false)));
                Object value10 = ocInstallmentRepayActivity.f29527B.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                ((LinearLayout) value10).setVisibility(0);
                Object value11 = ocInstallmentRepayActivity.f29540i.getValue();
                Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                TextView textView2 = (TextView) value11;
                Long unpaidPenalty = ocInsRepaymentPlanData.getUnpaidPenalty();
                textView2.setText(r0.B(unpaidPenalty != null ? unpaidPenalty.longValue() : 0L, false));
                Object value12 = ocInstallmentRepayActivity.f29539g.getValue();
                Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                TextView textView3 = (TextView) value12;
                Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                textView3.setText(r0.B(miniRepayAmount != null ? miniRepayAmount.longValue() : 0L, false));
                Button buttonO = ocInstallmentRepayActivity.o();
                int i12 = Ya.g.cs_confirm_spread;
                Long miniRepayAmount2 = spreadInfoDto.getMiniRepayAmount();
                buttonO.setText(ocInstallmentRepayActivity.getString(i12, r0.B(miniRepayAmount2 != null ? miniRepayAmount2.longValue() : 0L, true)));
            }
        }
        Button buttonO2 = ocInstallmentRepayActivity.o();
        int i13 = ocInstallmentRepayActivity.f29546q0;
        if (i13 >= 0 && i13 < arrayList.size() && (spreadRepaymentPlanList = ((SpreadInfoDto) arrayList.get(ocInstallmentRepayActivity.f29546q0)).getSpreadRepaymentPlanList()) != null && !spreadRepaymentPlanList.isEmpty()) {
            Object value13 = ocInstallmentRepayActivity.f29538f.getValue();
            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
            z3 = ((CheckBox) value13).isChecked();
        }
        buttonO2.setEnabled(z3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_installment_repay_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    public final RecyclerView n() {
        Object value = this.f29550w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final Button o() {
        Object value = this.f29536d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case MessageEvent.EVENT_OC_REPAY_SUCCESS /* 327 */:
            case MessageEvent.EVENT_OC_REPAY_PENDING /* 328 */:
            case MessageEvent.EVENT_OC_REPAY_FAILED /* 329 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        o().setClickable(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        o().setClickable(true);
    }

    public final TextView p() {
        Object value = this.f29526A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).getOcInsRepaymentData(Long.valueOf(this.f29542k0), this.f29535Z).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 15));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        BarUtils.setStatusBarLightMode((Activity) this, true);
        org.greenrobot.eventbus.c.b().j(this);
        this.f29535Z = getIntent().getStringExtra(RepayRemindDialog.OC_REPAY_CARD_NO);
        this.f29542k0 = getIntent().getLongExtra("oc_repay_bill_id", 0L);
        Object value = this.f29529H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(BaseApplication.getCurrencySymbol());
        ArrayList data = this.f29547r0;
        int i7 = this.f29546q0;
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        D d2 = new D(this, data);
        d2.f44158d = i7;
        this.f29548s0 = d2;
        int length = 0;
        n().setLayoutManager(new LinearLayoutManager(this, 0, false));
        n().setAdapter(this.f29548s0);
        ArrayList arrayList = new ArrayList();
        ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and consented\n");
        ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, "Installment Repayment Terms & conditions");
        ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, "Privacy Policy");
        arrayList.add(applyProtoContent);
        arrayList.add(applyProtoContent2);
        arrayList.add(applyProtoContent3);
        arrayList.add(applyProtoContent4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ApplyProtoContent applyProtoContent5 = (ApplyProtoContent) next;
            spannableStringBuilder.append((CharSequence) applyProtoContent5.content);
            Integer num = applyProtoContent5.clickType;
            if (num == null || num.intValue() != 0) {
                spannableStringBuilder.setSpan(new C0155w(4, this, applyProtoContent5), length, spannableStringBuilder.length(), 33);
            }
            length = spannableStringBuilder.length() - 1;
        }
        t tVar = this.f29537e;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(spannableStringBuilder);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setHighlightColor(getColor(p.transparent));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setMovementMethod(LinkMovementMethod.getInstance());
        Object value5 = this.f29531M.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        p220oa.h.l(new A(25), (ImageView) value5);
        Object value6 = this.f29549v.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i10 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42837b;

            {
                this.f42837b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42837b;
                switch (i10) {
                    case 0:
                        int i11 = ocInstallmentRepayActivity.f29546q0;
                        if (i11 >= 0) {
                            ArrayList arrayList2 = ocInstallmentRepayActivity.f29547r0;
                            if (i11 < arrayList2.size()) {
                                Object obj = arrayList2.get(ocInstallmentRepayActivity.f29546q0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                new OcRepaymentPlanDialog(ocInstallmentRepayActivity, (SpreadInfoDto) obj).show();
                            }
                        }
                        break;
                    case 1:
                        int i12 = OcInstallmentRepayActivity.f29525t0;
                        if (ocInstallmentRepayActivity.n().getVisibility() != 8) {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_down_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(8);
                        } else {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_up_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(0);
                        }
                        break;
                    case 2:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        ocInstallmentRepayActivity.finish();
                        break;
                    case 3:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        c cVar = new c(ocInstallmentRepayActivity);
                        cVar.f6596b = O6.d.f(ocInstallmentRepayActivity.getString(g.cs_spread_dialog_title));
                        cVar.f6605k = false;
                        cVar.f6606l = 8388611;
                        cVar.f6598d = ocInstallmentRepayActivity.getString(g.cs_spread_dialog_content);
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    default:
                        if (ocInstallmentRepayActivity.f29546q0 >= 0) {
                            ocInstallmentRepayActivity.showLoadingDialog(true);
                            Object obj2 = ocInstallmentRepayActivity.f29547r0.get(ocInstallmentRepayActivity.f29546q0);
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj2;
                            Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                            OcOrderReq ocOrderReq = new OcOrderReq(miniRepayAmount, ocInstallmentRepayActivity.f29535Z, String.valueOf(ocInstallmentRepayActivity.f29542k0), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)), ((Gson) C0525w.f().f7166b).toJson(new OcInstallmentRepayExtensionBean(spreadInfoDto)), null, 64, null);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(14, ocInstallmentRepayActivity, miniRepayAmount));
                            break;
                        }
                        break;
                }
            }
        }, (ConstraintLayout) value6);
        D d10 = this.f29548s0;
        if (d10 != null) {
            p045d3.k itemClickListener = new p045d3.k(this, 28);
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            d10.f4993c = itemClickListener;
        }
        final int i11 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42837b;

            {
                this.f42837b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42837b;
                switch (i11) {
                    case 0:
                        int i12 = ocInstallmentRepayActivity.f29546q0;
                        if (i12 >= 0) {
                            ArrayList arrayList2 = ocInstallmentRepayActivity.f29547r0;
                            if (i12 < arrayList2.size()) {
                                Object obj = arrayList2.get(ocInstallmentRepayActivity.f29546q0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                new OcRepaymentPlanDialog(ocInstallmentRepayActivity, (SpreadInfoDto) obj).show();
                            }
                        }
                        break;
                    case 1:
                        int i13 = OcInstallmentRepayActivity.f29525t0;
                        if (ocInstallmentRepayActivity.n().getVisibility() != 8) {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_down_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(8);
                        } else {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_up_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(0);
                        }
                        break;
                    case 2:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        ocInstallmentRepayActivity.finish();
                        break;
                    case 3:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        c cVar = new c(ocInstallmentRepayActivity);
                        cVar.f6596b = O6.d.f(ocInstallmentRepayActivity.getString(g.cs_spread_dialog_title));
                        cVar.f6605k = false;
                        cVar.f6606l = 8388611;
                        cVar.f6598d = ocInstallmentRepayActivity.getString(g.cs_spread_dialog_content);
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    default:
                        if (ocInstallmentRepayActivity.f29546q0 >= 0) {
                            ocInstallmentRepayActivity.showLoadingDialog(true);
                            Object obj2 = ocInstallmentRepayActivity.f29547r0.get(ocInstallmentRepayActivity.f29546q0);
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj2;
                            Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                            OcOrderReq ocOrderReq = new OcOrderReq(miniRepayAmount, ocInstallmentRepayActivity.f29535Z, String.valueOf(ocInstallmentRepayActivity.f29542k0), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)), ((Gson) C0525w.f().f7166b).toJson(new OcInstallmentRepayExtensionBean(spreadInfoDto)), null, 64, null);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(14, ocInstallmentRepayActivity, miniRepayAmount));
                            break;
                        }
                        break;
                }
            }
        }, p());
        Object value7 = this.f29533X.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i12 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42837b;

            {
                this.f42837b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42837b;
                switch (i12) {
                    case 0:
                        int i13 = ocInstallmentRepayActivity.f29546q0;
                        if (i13 >= 0) {
                            ArrayList arrayList2 = ocInstallmentRepayActivity.f29547r0;
                            if (i13 < arrayList2.size()) {
                                Object obj = arrayList2.get(ocInstallmentRepayActivity.f29546q0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                new OcRepaymentPlanDialog(ocInstallmentRepayActivity, (SpreadInfoDto) obj).show();
                            }
                        }
                        break;
                    case 1:
                        int i14 = OcInstallmentRepayActivity.f29525t0;
                        if (ocInstallmentRepayActivity.n().getVisibility() != 8) {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_down_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(8);
                        } else {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_up_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(0);
                        }
                        break;
                    case 2:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        ocInstallmentRepayActivity.finish();
                        break;
                    case 3:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        c cVar = new c(ocInstallmentRepayActivity);
                        cVar.f6596b = O6.d.f(ocInstallmentRepayActivity.getString(g.cs_spread_dialog_title));
                        cVar.f6605k = false;
                        cVar.f6606l = 8388611;
                        cVar.f6598d = ocInstallmentRepayActivity.getString(g.cs_spread_dialog_content);
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    default:
                        if (ocInstallmentRepayActivity.f29546q0 >= 0) {
                            ocInstallmentRepayActivity.showLoadingDialog(true);
                            Object obj2 = ocInstallmentRepayActivity.f29547r0.get(ocInstallmentRepayActivity.f29546q0);
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj2;
                            Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                            OcOrderReq ocOrderReq = new OcOrderReq(miniRepayAmount, ocInstallmentRepayActivity.f29535Z, String.valueOf(ocInstallmentRepayActivity.f29542k0), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)), ((Gson) C0525w.f().f7166b).toJson(new OcInstallmentRepayExtensionBean(spreadInfoDto)), null, 64, null);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(14, ocInstallmentRepayActivity, miniRepayAmount));
                            break;
                        }
                        break;
                }
            }
        }, (ImageView) value7);
        Object value8 = this.f29530L.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i13 = 3;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42837b;

            {
                this.f42837b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42837b;
                switch (i13) {
                    case 0:
                        int i14 = ocInstallmentRepayActivity.f29546q0;
                        if (i14 >= 0) {
                            ArrayList arrayList2 = ocInstallmentRepayActivity.f29547r0;
                            if (i14 < arrayList2.size()) {
                                Object obj = arrayList2.get(ocInstallmentRepayActivity.f29546q0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                new OcRepaymentPlanDialog(ocInstallmentRepayActivity, (SpreadInfoDto) obj).show();
                            }
                        }
                        break;
                    case 1:
                        int i15 = OcInstallmentRepayActivity.f29525t0;
                        if (ocInstallmentRepayActivity.n().getVisibility() != 8) {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_down_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(8);
                        } else {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_up_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(0);
                        }
                        break;
                    case 2:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        ocInstallmentRepayActivity.finish();
                        break;
                    case 3:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        c cVar = new c(ocInstallmentRepayActivity);
                        cVar.f6596b = O6.d.f(ocInstallmentRepayActivity.getString(g.cs_spread_dialog_title));
                        cVar.f6605k = false;
                        cVar.f6606l = 8388611;
                        cVar.f6598d = ocInstallmentRepayActivity.getString(g.cs_spread_dialog_content);
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    default:
                        if (ocInstallmentRepayActivity.f29546q0 >= 0) {
                            ocInstallmentRepayActivity.showLoadingDialog(true);
                            Object obj2 = ocInstallmentRepayActivity.f29547r0.get(ocInstallmentRepayActivity.f29546q0);
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj2;
                            Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                            OcOrderReq ocOrderReq = new OcOrderReq(miniRepayAmount, ocInstallmentRepayActivity.f29535Z, String.valueOf(ocInstallmentRepayActivity.f29542k0), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)), ((Gson) C0525w.f().f7166b).toJson(new OcInstallmentRepayExtensionBean(spreadInfoDto)), null, 64, null);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(14, ocInstallmentRepayActivity, miniRepayAmount));
                            break;
                        }
                        break;
                }
            }
        }, (TextView) value8);
        Object value9 = this.f29538f.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((CheckBox) value9).setOnCheckedChangeListener(new A8.g(this, 16));
        final int i14 = 4;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.d0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcInstallmentRepayActivity f42837b;

            {
                this.f42837b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInstallmentRepayActivity ocInstallmentRepayActivity = this.f42837b;
                switch (i14) {
                    case 0:
                        int i15 = ocInstallmentRepayActivity.f29546q0;
                        if (i15 >= 0) {
                            ArrayList arrayList2 = ocInstallmentRepayActivity.f29547r0;
                            if (i15 < arrayList2.size()) {
                                Object obj = arrayList2.get(ocInstallmentRepayActivity.f29546q0);
                                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                                new OcRepaymentPlanDialog(ocInstallmentRepayActivity, (SpreadInfoDto) obj).show();
                            }
                        }
                        break;
                    case 1:
                        int i16 = OcInstallmentRepayActivity.f29525t0;
                        if (ocInstallmentRepayActivity.n().getVisibility() != 8) {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_down_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(8);
                        } else {
                            ocInstallmentRepayActivity.p().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_ins_up_arrow, 0);
                            ocInstallmentRepayActivity.n().setVisibility(0);
                        }
                        break;
                    case 2:
                        int i17 = OcInstallmentRepayActivity.f29525t0;
                        ocInstallmentRepayActivity.finish();
                        break;
                    case 3:
                        int i18 = OcInstallmentRepayActivity.f29525t0;
                        c cVar = new c(ocInstallmentRepayActivity);
                        cVar.f6596b = O6.d.f(ocInstallmentRepayActivity.getString(g.cs_spread_dialog_title));
                        cVar.f6605k = false;
                        cVar.f6606l = 8388611;
                        cVar.f6598d = ocInstallmentRepayActivity.getString(g.cs_spread_dialog_content);
                        cVar.d(k.core_got_it, null);
                        cVar.a().show();
                        break;
                    default:
                        if (ocInstallmentRepayActivity.f29546q0 >= 0) {
                            ocInstallmentRepayActivity.showLoadingDialog(true);
                            Object obj2 = ocInstallmentRepayActivity.f29547r0.get(ocInstallmentRepayActivity.f29546q0);
                            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                            SpreadInfoDto spreadInfoDto = (SpreadInfoDto) obj2;
                            Long miniRepayAmount = spreadInfoDto.getMiniRepayAmount();
                            OcOrderReq ocOrderReq = new OcOrderReq(miniRepayAmount, ocInstallmentRepayActivity.f29535Z, String.valueOf(ocInstallmentRepayActivity.f29542k0), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt(TransType.TRANS_TYPE_REPAY_AIRTIME_LOAN)), ((Gson) C0525w.f().f7166b).toJson(new OcInstallmentRepayExtensionBean(spreadInfoDto)), null, 64, null);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new r(14, ocInstallmentRepayActivity, miniRepayAmount));
                            break;
                        }
                        break;
                }
            }
        }, o());
    }
}
