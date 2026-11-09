package com.transsnet.palmpay.credit.ui.fragment;

import B6.ViewOnClickListenerC0087i;
import C0.G;
import N8.d0;
import N8.q0;
import Pa.C0525w;
import Pa.r0;
import Ua.n0;
import Ya.d;
import Ya.e;
import Ya.g;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.material.appbar.AppBarLayout;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.req.OcRepaidRecordListReq;
import com.transsnet.palmpay.credit.bean.resp.IntervalRule;
import com.transsnet.palmpay.credit.bean.resp.OcInterestRulesData;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p298tf.f;
import p355xf.C2131j;
import p355xf.t;
import p368yb.C2144l;
import p368yb.H;
import p382zb.F;
import p382zb.I;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcBillFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBillFragment extends BaseFragment implements AppBarLayout.OnOffsetChangedListener {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final /* synthetic */ int f30371L0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30372A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public OcCurBillData f30373A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30374B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public OcInterestRulesData f30375B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30376C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ArrayList f30377C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public ArrayList f30378D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public C2144l f30379E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public C2144l f30380F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f30381G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30382H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f30383H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f30384I0 = 1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public long f30385J0 = -1;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public String f30386K0 = "1,2,3,4,8,9,12,13,14,99,21,24";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30387L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30388M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30389Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30390X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30391Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30392Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30394j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30395k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30397p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30398p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30399q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30400r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f30401s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f30402t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f30403u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30404v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f30405v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30406w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f30407w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public String f30408x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public long f30409y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public long f30410z0;

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

    public OcBillFragment() {
        final int i7 = 0;
        this.f30393i = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i7) {
                    case 0:
                        int i10 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i11 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i12 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i13 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i14 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i15 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i16 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i17 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i10 = 11;
        this.f30394j = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i12 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i13 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i14 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i15 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i16 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i17 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i11 = 18;
        this.f30396o = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i11) {
                    case 0:
                        int i12 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i13 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i14 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i15 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i16 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i17 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i18 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i12 = 19;
        this.f30397p = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i12) {
                    case 0:
                        int i13 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i14 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i15 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i16 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i17 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i18 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i19 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i13 = 20;
        this.t = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i13) {
                    case 0:
                        int i14 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i15 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i16 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i17 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i19 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i110 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i14 = 21;
        this.f30404v = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i14) {
                    case 0:
                        int i15 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i16 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i17 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i110 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i111 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i15 = 22;
        this.f30406w = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i15) {
                    case 0:
                        int i16 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i17 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i111 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i112 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i115 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i16 = 23;
        this.f30372A = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i16) {
                    case 0:
                        int i17 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i18 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i112 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i113 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i115 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i116 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i17 = 24;
        this.f30374B = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i17) {
                    case 0:
                        int i18 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i19 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i113 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i114 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i115 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i116 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i18 = 25;
        this.f30376C = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i18) {
                    case 0:
                        int i19 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i110 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i114 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i115 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i116 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i19 = 1;
        this.f30382H = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i19) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i20 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i21 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i27 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i20 = 2;
        this.f30387L = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i20) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i21 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i22 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i28 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i29 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i21 = 3;
        this.f30388M = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i21) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i29 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i210 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i22 = 4;
        this.f30389Q = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i22) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i23 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i24 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i210 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i23 = 5;
        this.f30390X = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i23) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i24 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i25 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i211 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i212 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i24 = 6;
        this.f30391Y = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i24) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i25 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i26 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i212 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i213 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i25 = 7;
        this.f30392Z = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i25) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i26 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i27 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i213 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i214 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i26 = 8;
        this.f30395k0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i26) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i27 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i28 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i214 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i215 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i27 = 9;
        this.f30398p0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i27) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i28 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i29 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i215 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i216 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i217 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i28 = 10;
        this.f30399q0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i28) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i29 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i210 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i211 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i216 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i217 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i218 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i29 = 12;
        this.f30400r0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i29) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i30 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i35 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i30 = 13;
        this.f30401s0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i30) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i31 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i35 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i36 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i31 = 14;
        this.f30402t0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i31) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i32 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i35 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i36 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i37 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i32 = 15;
        this.f30403u0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i32) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i33 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i35 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i36 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i37 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i38 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i33 = 16;
        this.f30405v0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i33) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i34 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i35 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i36 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i37 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i38 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i39 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
        final int i34 = 17;
        this.f30407w0 = C2131j.b(new Function0(this) { // from class: zb.E

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44523b;

            {
                this.f44523b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcBillFragment ocBillFragment = this.f44523b;
                switch (i34) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        return (Button) ocBillFragment.f27318b.findViewById(e.oc_bill_pay_bt);
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.repaid_tv);
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.refund_tv);
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.instalment_tv);
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_tv);
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        return (ImageView) ocBillFragment.f27318b.findViewById(e.bill_more_img);
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        return (Group) ocBillFragment.f27318b.findViewById(e.detail_group);
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.interest_amount_tv);
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_penalty_interest_tv);
                    case 9:
                        int i119 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_repaid_amount_tv);
                    case 10:
                        int i210 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_amount_tv);
                    case 11:
                        int i211 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_instalment_bill_rv);
                    case 12:
                        int i212 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_repaid_title_tv);
                    case 13:
                        int i213 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_overdue_top_tv);
                    case 14:
                        int i214 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_outstanding_amount_tv);
                    case 15:
                        int i215 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.all_active_tv);
                    case 16:
                        int i216 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.oc_bill_tips_tv);
                    case 17:
                        int i217 = OcBillFragment.f30371L0;
                        return (AppBarLayout) ocBillFragment.f27318b.findViewById(e.bill_detail_abl);
                    case 18:
                        int i218 = OcBillFragment.f30371L0;
                        return (RecyclerView) ocBillFragment.f27318b.findViewById(e.oc_bill_rv);
                    case 19:
                        int i219 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_repaid_tv);
                    case 20:
                        int i35 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_refund_tv);
                    case 21:
                        int i36 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_instalment_tv);
                    case 22:
                        int i37 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_all_tv);
                    case 23:
                        int i38 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_overdue_tv);
                    case 24:
                        int i39 = OcBillFragment.f30371L0;
                        return (TextView) ocBillFragment.f27318b.findViewById(e.float_outstanding_amount_tv);
                    default:
                        int i310 = OcBillFragment.f30371L0;
                        return (Toolbar) ocBillFragment.f27318b.findViewById(e.bill_detail_float_collapse_view);
                }
            }
        });
    }

    public static final void t(OcBillFragment ocBillFragment) {
        ocBillFragment.getClass();
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
        iApiCreditServiceH.queryInterestRules(ocCurBillData != null ? ocCurBillData.getPenaltyRuleNo() : null).k(f.f42629b).i(b.a()).subscribe(new F(ocBillFragment, 2));
    }

    /* JADX WARN: Code duplicated, block: B:67:0x013f  */
    public static final void u(OcBillFragment ocBillFragment) {
        Long repaymentDateStamp;
        Long repaymentDateStamp2;
        Integer stauts;
        Long repaymentDateStamp3;
        Long paidPenalty;
        OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
        long jLongValue = 0;
        if (ocCurBillData != null) {
            Object value = ocBillFragment.f30402t0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            TextView textView = (TextView) value;
            Long outstandingAmount = ocCurBillData.getOutstandingAmount();
            textView.setText(r0.B(outstandingAmount != null ? outstandingAmount.longValue() : 0L, true));
            Object value2 = ocBillFragment.f30374B.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            TextView textView2 = (TextView) value2;
            Long outstandingAmount2 = ocCurBillData.getOutstandingAmount();
            textView2.setText(r0.B(outstandingAmount2 != null ? outstandingAmount2.longValue() : 0L, true));
            Object value3 = ocBillFragment.f30399q0.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            TextView textView3 = (TextView) value3;
            Long usedAmount = ocCurBillData.getUsedAmount();
            textView3.setText(r0.B(usedAmount != null ? usedAmount.longValue() : 0L, true));
            Object value4 = ocBillFragment.f30392Z.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            TextView textView4 = (TextView) value4;
            OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
            long jLongValue2 = (ocCurBillData2 == null || (paidPenalty = ocCurBillData2.getPaidPenalty()) == null) ? 0L : paidPenalty.longValue();
            Long unpaidPenalty = ocCurBillData.getUnpaidPenalty();
            long jLongValue3 = jLongValue2 + (unpaidPenalty != null ? unpaidPenalty.longValue() : 0L);
            Long unpaidInstallmentServiceFee = ocCurBillData.getUnpaidInstallmentServiceFee();
            long jLongValue4 = jLongValue3 + (unpaidInstallmentServiceFee != null ? unpaidInstallmentServiceFee.longValue() : 0L);
            Long paidInstallmentServiceFee = ocCurBillData.getPaidInstallmentServiceFee();
            long jLongValue5 = jLongValue4 + (paidInstallmentServiceFee != null ? paidInstallmentServiceFee.longValue() : 0L);
            Long unpaidSpreadServiceFee = ocCurBillData.getUnpaidSpreadServiceFee();
            long jLongValue6 = jLongValue5 + (unpaidSpreadServiceFee != null ? unpaidSpreadServiceFee.longValue() : 0L);
            Long paidSpreadServiceFee = ocCurBillData.getPaidSpreadServiceFee();
            textView4.setText(r0.B(jLongValue6 + (paidSpreadServiceFee != null ? paidSpreadServiceFee.longValue() : 0L), true));
            Object value5 = ocBillFragment.f30398p0.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            TextView textView5 = (TextView) value5;
            Long paidInterest = ocCurBillData.getPaidInterest();
            long jLongValue7 = paidInterest != null ? paidInterest.longValue() : 0L;
            Long paidPenalty2 = ocCurBillData.getPaidPenalty();
            long jLongValue8 = jLongValue7 + (paidPenalty2 != null ? paidPenalty2.longValue() : 0L);
            Long paidPrincipal = ocCurBillData.getPaidPrincipal();
            long jLongValue9 = jLongValue8 + (paidPrincipal != null ? paidPrincipal.longValue() : 0L);
            Long paidInstallmentServiceFee2 = ocCurBillData.getPaidInstallmentServiceFee();
            textView5.setText(r0.B(jLongValue9 + (paidInstallmentServiceFee2 != null ? paidInstallmentServiceFee2.longValue() : 0L), true));
            long j6 = ocBillFragment.f30409y0;
            t tVar = ocBillFragment.f30393i;
            if (j6 <= 0) {
                ocBillFragment.D().setVisibility(8);
                ocBillFragment.A().setVisibility(8);
                Object value6 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((Button) value6).setVisibility(8);
            } else {
                Long outstandingAmount3 = ocCurBillData.getOutstandingAmount();
                if ((outstandingAmount3 != null ? outstandingAmount3.longValue() : 0L) > 0) {
                    ocBillFragment.D().setVisibility(0);
                    ocBillFragment.A().setVisibility(0);
                    Object value7 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((Button) value7).setVisibility(0);
                } else {
                    ocBillFragment.D().setVisibility(8);
                    ocBillFragment.A().setVisibility(8);
                    Object value8 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                    ((Button) value8).setVisibility(8);
                }
            }
        }
        E activity = ocBillFragment.getActivity();
        if (activity != null) {
            Object value9 = ocBillFragment.f30405v0.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            TextView textView6 = (TextView) value9;
            int i7 = g.cs_oc_left_overdue_days;
            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
            textView6.setText(ocBillFragment.getString(i7, r0.X1(ocCurBillData3 != null ? ocCurBillData3.getRepaymentDateStamp() : null, "dd MMM")));
            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
            if (ocCurBillData4 != null && (stauts = ocCurBillData4.getStauts()) != null && 2 == stauts.intValue()) {
                OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                if (ocCurBillData5 != null && (repaymentDateStamp3 = ocCurBillData5.getRepaymentDateStamp()) != null) {
                    jLongValue = repaymentDateStamp3.longValue();
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(jLongValue));
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                long jC = (q0.c(calendar2, 13, 0, 14, 0) - calendar.getTimeInMillis()) / ((long) 86400000);
                ocBillFragment.D().setText(ocBillFragment.getString(g.cs_oc_overdue_day, Long.valueOf(jC)));
                ocBillFragment.D().setTextColor(activity.getColor(Ya.b.cs_oc_overdue_txt_color));
                ocBillFragment.D().setBackgroundResource(d.cs_overdue_txt_bg);
                ocBillFragment.A().setText(ocBillFragment.getString(g.cs_oc_overdue_day, Long.valueOf(jC)));
                ocBillFragment.A().setTextColor(activity.getColor(Ya.b.cs_oc_overdue_txt_color));
                ocBillFragment.A().setBackgroundResource(d.cs_overdue_txt_bg);
                return;
            }
            ocBillFragment.D().setTextColor(activity.getColor(Ya.b.cs_due_in_txt_color));
            ocBillFragment.D().setBackgroundResource(d.cs_due_in_bg);
            ocBillFragment.A().setTextColor(activity.getColor(Ya.b.cs_due_in_txt_color));
            ocBillFragment.A().setBackgroundResource(d.cs_due_in_bg);
            OcCurBillData ocCurBillData6 = ocBillFragment.f30373A0;
            if (DateUtils.isToday((ocCurBillData6 == null || (repaymentDateStamp2 = ocCurBillData6.getRepaymentDateStamp()) == null) ? 0L : repaymentDateStamp2.longValue())) {
                ocBillFragment.D().setText(ocBillFragment.getString(g.cs_due_today));
                ocBillFragment.A().setText(ocBillFragment.getString(g.cs_due_today));
                return;
            }
            OcCurBillData ocCurBillData7 = ocBillFragment.f30373A0;
            if (ocCurBillData7 != null && (repaymentDateStamp = ocCurBillData7.getRepaymentDateStamp()) != null) {
                jLongValue = repaymentDateStamp.longValue();
            }
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(new Date(jLongValue));
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            Calendar calendar4 = Calendar.getInstance();
            calendar4.set(11, 0);
            calendar4.set(12, 0);
            calendar4.set(13, 0);
            calendar4.set(14, 0);
            long jFloor = (long) Math.floor((calendar3.getTimeInMillis() - calendar4.getTimeInMillis()) / ((double) 86400000));
            ocBillFragment.D().setText(ocBillFragment.getString(g.cs_due_in, Long.valueOf(jFloor)));
            ocBillFragment.A().setText(ocBillFragment.getString(g.cs_due_in, Long.valueOf(jFloor)));
        }
    }

    public final TextView A() {
        Object value = this.f30372A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView B() {
        Object value = this.f30396o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final RecyclerView C() {
        Object value = this.f30394j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView D() {
        Object value = this.f30401s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void E(String str, TextView textView, TextView textView2) {
        this.f30386K0 = str;
        E activity = getActivity();
        if (activity != null) {
            TextView textView3 = this.f30381G0;
            if (textView3 != null) {
                textView3.setTextColor(activity.getColor(L6.b.ppColorTextPrimary));
            }
            TextView textView4 = this.f30381G0;
            if (textView4 != null) {
                textView4.setBackgroundResource(d.cs_oc_bill_type_unselected);
            }
            TextView textView5 = this.f30383H0;
            if (textView5 != null) {
                textView5.setTextColor(activity.getColor(L6.b.ppColorTextPrimary));
            }
            TextView textView6 = this.f30383H0;
            if (textView6 != null) {
                textView6.setBackgroundResource(d.cs_oc_bill_type_unselected);
            }
            textView.setTextColor(activity.getColor(Ya.b.cs_main_color));
            textView.setBackgroundResource(d.cs_oc_bill_type_selected);
            textView2.setTextColor(activity.getColor(Ya.b.cs_main_color));
            textView2.setBackgroundResource(d.cs_oc_bill_type_selected);
            this.f30381G0 = textView;
            this.f30383H0 = textView2;
            w(true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Ya.f.cs_oc_bill_fg_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f30408x0 = arguments.getString("oc_card_no");
            this.f30409y0 = arguments.getLong("oc_bill_id", 0L);
            this.f30410z0 = arguments.getLong("oc_future_repayment_date", 0L);
        }
        E activity = getActivity();
        if (activity != null) {
            v().setTextColor(activity.getColor(Ya.b.cs_main_color));
            v().setBackgroundResource(d.cs_oc_bill_type_selected);
            this.f30381G0 = v();
            z().setTextColor(activity.getColor(Ya.b.cs_main_color));
            z().setBackgroundResource(d.cs_oc_bill_type_selected);
            this.f30383H0 = z();
            this.f30377C0 = new ArrayList();
            this.f30378D0 = new ArrayList();
            B().setLayoutManager(new LinearLayoutManager(activity, 1, false));
            ArrayList arrayList = this.f30377C0;
            if (arrayList == null) {
                Intrinsics.n("mListData");
                throw null;
            }
            this.f30379E0 = new C2144l(activity, arrayList, 0);
            B().setAdapter(this.f30379E0);
            C().setLayoutManager(new LinearLayoutManager(activity, 1, false));
            ArrayList arrayList2 = this.f30378D0;
            if (arrayList2 == null) {
                Intrinsics.n("mInstalmentListData");
                throw null;
            }
            this.f30380F0 = new C2144l(activity, arrayList2, 0);
            C().setAdapter(this.f30380F0);
            Object value = this.f30407w0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((AppBarLayout) value).addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
        }
        Object value2 = this.f30403u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i7) {
                    case 0:
                        int i10 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i11 = OcBillFragment.f30371L0;
                        Object value3 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        Object value4 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value3, (TextView) value4);
                        break;
                    case 2:
                        int i12 = OcBillFragment.f30371L0;
                        Object value5 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        Object value6 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value5, (TextView) value6);
                        break;
                    case 3:
                        int i13 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i14 = OcBillFragment.f30371L0;
                        Object value7 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        Object value8 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value7, (TextView) value8);
                        break;
                    case 5:
                        int i15 = OcBillFragment.f30371L0;
                        Object value9 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value9, (TextView) value10);
                        break;
                    case 6:
                        int i16 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value11, (TextView) value12);
                        break;
                    case 7:
                        int i17 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i18 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i19 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i19, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value13 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                            TextView view2 = (TextView) value13;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value14 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                            ((ImageView) value14).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value15 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                            ((ImageView) value15).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value16 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        Object value17 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value16, (TextView) value17);
                        break;
                }
            }
        }, (TextView) value2);
        Object value3 = this.f30400r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i10 = 7;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i10) {
                    case 0:
                        int i11 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i12 = OcBillFragment.f30371L0;
                        Object value4 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        Object value5 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value4, (TextView) value5);
                        break;
                    case 2:
                        int i13 = OcBillFragment.f30371L0;
                        Object value6 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        Object value7 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value6, (TextView) value7);
                        break;
                    case 3:
                        int i14 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i15 = OcBillFragment.f30371L0;
                        Object value8 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        Object value9 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value8, (TextView) value9);
                        break;
                    case 5:
                        int i16 = OcBillFragment.f30371L0;
                        Object value10 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        Object value11 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value10, (TextView) value11);
                        break;
                    case 6:
                        int i17 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value12, (TextView) value13);
                        break;
                    case 7:
                        int i18 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i19 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i110 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i110, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value14 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                            TextView view2 = (TextView) value14;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value15 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                            ((ImageView) value15).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value16 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                            ((ImageView) value16).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value17 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        Object value18 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value17, (TextView) value18);
                        break;
                }
            }
        }, (TextView) value3);
        Object value4 = this.f30395k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i11 = 8;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i11) {
                    case 0:
                        int i12 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i13 = OcBillFragment.f30371L0;
                        Object value5 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        Object value6 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value5, (TextView) value6);
                        break;
                    case 2:
                        int i14 = OcBillFragment.f30371L0;
                        Object value7 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        Object value8 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value7, (TextView) value8);
                        break;
                    case 3:
                        int i15 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i16 = OcBillFragment.f30371L0;
                        Object value9 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value9, (TextView) value10);
                        break;
                    case 5:
                        int i17 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value11, (TextView) value12);
                        break;
                    case 6:
                        int i18 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value13, (TextView) value14);
                        break;
                    case 7:
                        int i19 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i110 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i111 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i111, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value15 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                            TextView view2 = (TextView) value15;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value16 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                            ((ImageView) value16).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value17 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            ((ImageView) value17).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value18 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        Object value19 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value18, (TextView) value19);
                        break;
                }
            }
        }, (TextView) value4);
        Object value5 = this.f30393i.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i12 = 9;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i12) {
                    case 0:
                        int i13 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i14 = OcBillFragment.f30371L0;
                        Object value6 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        Object value7 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value6, (TextView) value7);
                        break;
                    case 2:
                        int i15 = OcBillFragment.f30371L0;
                        Object value8 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        Object value9 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value8, (TextView) value9);
                        break;
                    case 3:
                        int i16 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i17 = OcBillFragment.f30371L0;
                        Object value10 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        Object value11 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value10, (TextView) value11);
                        break;
                    case 5:
                        int i18 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value12, (TextView) value13);
                        break;
                    case 6:
                        int i19 = OcBillFragment.f30371L0;
                        Object value14 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        Object value15 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value14, (TextView) value15);
                        break;
                    case 7:
                        int i110 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i111 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i112 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i112, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value16 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                            TextView view2 = (TextView) value16;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value17 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            ((ImageView) value17).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value18 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                            ((ImageView) value18).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value19 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        Object value110 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value19, (TextView) value110);
                        break;
                }
            }
        }, (Button) value5);
        Object value6 = this.f30390X.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i13 = 10;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i13) {
                    case 0:
                        int i14 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i15 = OcBillFragment.f30371L0;
                        Object value7 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        Object value8 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value7, (TextView) value8);
                        break;
                    case 2:
                        int i16 = OcBillFragment.f30371L0;
                        Object value9 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value9, (TextView) value10);
                        break;
                    case 3:
                        int i17 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i18 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value11, (TextView) value12);
                        break;
                    case 5:
                        int i19 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value13, (TextView) value14);
                        break;
                    case 6:
                        int i110 = OcBillFragment.f30371L0;
                        Object value15 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        Object value16 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value15, (TextView) value16);
                        break;
                    case 7:
                        int i111 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i112 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i113 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i113, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value17 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            TextView view2 = (TextView) value17;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value18 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                            ((ImageView) value18).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value19 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                            ((ImageView) value19).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value110 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        Object value111 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value110, (TextView) value111);
                        break;
                }
            }
        }, (ImageView) value6);
        final int i14 = 11;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i14) {
                    case 0:
                        int i15 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i16 = OcBillFragment.f30371L0;
                        Object value7 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        Object value8 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value7, (TextView) value8);
                        break;
                    case 2:
                        int i17 = OcBillFragment.f30371L0;
                        Object value9 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value9, (TextView) value10);
                        break;
                    case 3:
                        int i18 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i19 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value11, (TextView) value12);
                        break;
                    case 5:
                        int i110 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value13, (TextView) value14);
                        break;
                    case 6:
                        int i111 = OcBillFragment.f30371L0;
                        Object value15 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        Object value16 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value15, (TextView) value16);
                        break;
                    case 7:
                        int i112 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i113 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i114 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i114, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value17 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                            TextView view2 = (TextView) value17;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value18 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                            ((ImageView) value18).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value19 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                            ((ImageView) value19).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value110 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        Object value111 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value110, (TextView) value111);
                        break;
                }
            }
        }, v());
        Object value7 = this.f30388M.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i15 = 12;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i15) {
                    case 0:
                        int i16 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i17 = OcBillFragment.f30371L0;
                        Object value8 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        Object value9 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value8, (TextView) value9);
                        break;
                    case 2:
                        int i18 = OcBillFragment.f30371L0;
                        Object value10 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        Object value11 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value10, (TextView) value11);
                        break;
                    case 3:
                        int i19 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i110 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value12, (TextView) value13);
                        break;
                    case 5:
                        int i111 = OcBillFragment.f30371L0;
                        Object value14 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        Object value15 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value14, (TextView) value15);
                        break;
                    case 6:
                        int i112 = OcBillFragment.f30371L0;
                        Object value16 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        Object value17 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value16, (TextView) value17);
                        break;
                    case 7:
                        int i113 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i114 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i115 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i115, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value18 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                            TextView view2 = (TextView) value18;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value19 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                            ((ImageView) value19).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value110 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                            ((ImageView) value110).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value111 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                        Object value112 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value111, (TextView) value112);
                        break;
                }
            }
        }, (TextView) value7);
        Object value8 = this.f30387L.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i16 = 1;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i16) {
                    case 0:
                        int i17 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i18 = OcBillFragment.f30371L0;
                        Object value9 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        Object value10 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value9, (TextView) value10);
                        break;
                    case 2:
                        int i19 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value11, (TextView) value12);
                        break;
                    case 3:
                        int i110 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i111 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value13, (TextView) value14);
                        break;
                    case 5:
                        int i112 = OcBillFragment.f30371L0;
                        Object value15 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        Object value16 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value15, (TextView) value16);
                        break;
                    case 6:
                        int i113 = OcBillFragment.f30371L0;
                        Object value17 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        Object value18 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value17, (TextView) value18);
                        break;
                    case 7:
                        int i114 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i115 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i116 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i116, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value19 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                            TextView view2 = (TextView) value19;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value110 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                            ((ImageView) value110).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value111 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                            ((ImageView) value111).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value112 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                        Object value113 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value112, (TextView) value113);
                        break;
                }
            }
        }, (TextView) value8);
        Object value9 = this.f30382H.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        final int i17 = 2;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i17) {
                    case 0:
                        int i18 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i19 = OcBillFragment.f30371L0;
                        Object value10 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        Object value11 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value10, (TextView) value11);
                        break;
                    case 2:
                        int i110 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value12, (TextView) value13);
                        break;
                    case 3:
                        int i111 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i112 = OcBillFragment.f30371L0;
                        Object value14 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        Object value15 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value14, (TextView) value15);
                        break;
                    case 5:
                        int i113 = OcBillFragment.f30371L0;
                        Object value16 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        Object value17 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value16, (TextView) value17);
                        break;
                    case 6:
                        int i114 = OcBillFragment.f30371L0;
                        Object value18 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        Object value19 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value18, (TextView) value19);
                        break;
                    case 7:
                        int i115 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i116 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i117 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i117, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value110 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                            TextView view2 = (TextView) value110;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value111 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                            ((ImageView) value111).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value112 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                            ((ImageView) value112).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value113 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                        Object value114 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value114, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value113, (TextView) value114);
                        break;
                }
            }
        }, (TextView) value9);
        final int i18 = 3;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i18) {
                    case 0:
                        int i19 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i110 = OcBillFragment.f30371L0;
                        Object value10 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        Object value11 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value10, (TextView) value11);
                        break;
                    case 2:
                        int i111 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value12, (TextView) value13);
                        break;
                    case 3:
                        int i112 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i113 = OcBillFragment.f30371L0;
                        Object value14 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        Object value15 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value14, (TextView) value15);
                        break;
                    case 5:
                        int i114 = OcBillFragment.f30371L0;
                        Object value16 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        Object value17 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value16, (TextView) value17);
                        break;
                    case 6:
                        int i115 = OcBillFragment.f30371L0;
                        Object value18 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        Object value19 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value18, (TextView) value19);
                        break;
                    case 7:
                        int i116 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i117 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i118 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i118, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value110 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                            TextView view2 = (TextView) value110;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value111 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                            ((ImageView) value111).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value112 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                            ((ImageView) value112).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value113 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                        Object value114 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value114, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value113, (TextView) value114);
                        break;
                }
            }
        }, z());
        Object value10 = this.f30404v.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        final int i19 = 4;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i19) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        Object value11 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                        Object value12 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value11, (TextView) value12);
                        break;
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value13, (TextView) value14);
                        break;
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        Object value15 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        Object value16 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value15, (TextView) value16);
                        break;
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        Object value17 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        Object value18 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value17, (TextView) value18);
                        break;
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        Object value19 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        Object value110 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value19, (TextView) value110);
                        break;
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i119 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i119, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i20 = 0;
                            final int i21 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i20) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value111 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                            TextView view2 = (TextView) value111;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i22 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value112 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                            ((ImageView) value112).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value113 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                            ((ImageView) value113).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i23 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i24 = OcBillFragment.f30371L0;
                        Object value114 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value114, "getValue(...)");
                        Object value115 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value115, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value114, (TextView) value115);
                        break;
                }
            }
        }, (TextView) value10);
        Object value11 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        final int i20 = 5;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i20) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        Object value12 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                        Object value13 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value12, (TextView) value13);
                        break;
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        Object value14 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        Object value15 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value14, (TextView) value15);
                        break;
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        Object value16 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        Object value17 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value16, (TextView) value17);
                        break;
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        Object value18 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        Object value19 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value18, (TextView) value19);
                        break;
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        Object value110 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        Object value111 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value110, (TextView) value111);
                        break;
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i119 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i119, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i21 = 0;
                            final int i22 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i21) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i22) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value112 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                            TextView view2 = (TextView) value112;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i23 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value113 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                            ((ImageView) value113).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value114 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value114, "getValue(...)");
                            ((ImageView) value114).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i24 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i25 = OcBillFragment.f30371L0;
                        Object value115 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value115, "getValue(...)");
                        Object value116 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value116, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value115, (TextView) value116);
                        break;
                }
            }
        }, (TextView) value11);
        Object value12 = this.f30397p.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        final int i21 = 6;
        h.l(new View.OnClickListener(this) { // from class: zb.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcBillFragment f44521b;

            {
                this.f44521b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcInterestRulesData ocInterestRulesData;
                Double penaltyRatio;
                List<IntervalRule> intervalRule;
                Integer calculateMethod;
                boolean z3;
                long j6;
                long jLongValue;
                Long id2;
                Long outstandingAmount;
                OcBillFragment ocBillFragment = this.f44521b;
                switch (i21) {
                    case 0:
                        int i110 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_all_bill_activity").withString("oc_card_no", ocBillFragment.f30408x0).withString("oc_bill_list_type", "oc_all_bill").navigation(ocBillFragment.getActivity());
                        break;
                    case 1:
                        int i111 = OcBillFragment.f30371L0;
                        Object value13 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                        Object value14 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value13, (TextView) value14);
                        break;
                    case 2:
                        int i112 = OcBillFragment.f30371L0;
                        Object value15 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
                        Object value16 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value15, (TextView) value16);
                        break;
                    case 3:
                        int i113 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    case 4:
                        int i114 = OcBillFragment.f30371L0;
                        Object value17 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
                        Object value18 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value18, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value17, (TextView) value18);
                        break;
                    case 5:
                        int i115 = OcBillFragment.f30371L0;
                        Object value19 = ocBillFragment.f30387L.getValue();
                        Intrinsics.checkNotNullExpressionValue(value19, "getValue(...)");
                        Object value110 = ocBillFragment.t.getValue();
                        Intrinsics.checkNotNullExpressionValue(value110, "getValue(...)");
                        ocBillFragment.E("3", (TextView) value19, (TextView) value110);
                        break;
                    case 6:
                        int i116 = OcBillFragment.f30371L0;
                        Object value111 = ocBillFragment.f30382H.getValue();
                        Intrinsics.checkNotNullExpressionValue(value111, "getValue(...)");
                        Object value112 = ocBillFragment.f30397p.getValue();
                        Intrinsics.checkNotNullExpressionValue(value112, "getValue(...)");
                        ocBillFragment.E("2,4,21,24", (TextView) value111, (TextView) value112);
                        break;
                    case 7:
                        int i117 = OcBillFragment.f30371L0;
                        ARouter.getInstance().build("/credit_score/oc_repaid_activity").withString("oc_repaid_bill_data", ((Gson) C0525w.f().f7166b).toJson(ocBillFragment.f30373A0)).navigation(ocBillFragment.getActivity());
                        break;
                    case 8:
                        int i118 = OcBillFragment.f30371L0;
                        E activity2 = ocBillFragment.getActivity();
                        if (activity2 != null && ocBillFragment.f30375B0 != null) {
                            OcCurBillData ocCurBillData = ocBillFragment.f30373A0;
                            Long unpaidPrincipal = ocCurBillData != null ? ocCurBillData.getUnpaidPrincipal() : null;
                            OcInterestRulesData ocInterestRulesData2 = ocBillFragment.f30375B0;
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            final Gb.E e10 = new Gb.E();
                            e10.f3228a = activity2;
                            View viewInflate = LayoutInflater.from(activity2).inflate(Ya.f.cs_oc_interest_pop_layout, (ViewGroup) null);
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                            e10.setWidth(-1);
                            e10.setHeight(-2);
                            e10.setOutsideTouchable(true);
                            e10.setTouchable(true);
                            e10.setFocusable(true);
                            e10.setContentView(viewInflate);
                            e10.setAnimationStyle(0);
                            View viewFindViewById = viewInflate.findViewById(e.item_one_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                            TextView textView = (TextView) viewFindViewById;
                            View viewFindViewById2 = viewInflate.findViewById(e.more_tv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                            TextView textView2 = (TextView) viewFindViewById2;
                            View viewFindViewById3 = viewInflate.findViewById(e.interest_ll);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                            LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
                            View viewFindViewById4 = viewInflate.findViewById(e.ivClose);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
                            ImageView imageView = (ImageView) viewFindViewById4;
                            View viewFindViewById5 = viewInflate.findViewById(e.interest_pop_ok_bt);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
                            Button button = (Button) viewFindViewById5;
                            if (ocInterestRulesData2 == null || (calculateMethod = ocInterestRulesData2.getCalculateMethod()) == null || calculateMethod.intValue() != 2) {
                                ocInterestRulesData = ocInterestRulesData2;
                                textView.setText(activity2.getString(g.cs_overdue_rules, com.airbnb.lottie.model.layer.d.n(new Object[]{Double.valueOf(((double) 100) * ((ocInterestRulesData2 == null || (penaltyRatio = ocInterestRulesData2.getPenaltyRatio()) == null) ? 0.0d : penaltyRatio.doubleValue()))}, 1, "%.2f", "format(...)")));
                                textView2.setVisibility(8);
                            } else {
                                int i119 = g.cs_overdue_rules_two;
                                List<IntervalRule> intervalRule2 = ocInterestRulesData2.getIntervalRule();
                                if (intervalRule2 != null) {
                                    Iterator<IntervalRule> it = intervalRule2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            IntervalRule next = it.next();
                                            long jLongValue2 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                            Long minAmount = next.getMinAmount();
                                            if (jLongValue2 >= (minAmount != null ? minAmount.longValue() : 0L)) {
                                                if (next.getMaxAmount() == null) {
                                                    Long penaltyAmount = next.getPenaltyAmount();
                                                    if (penaltyAmount != null) {
                                                        jLongValue = penaltyAmount.longValue();
                                                        j6 = jLongValue;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    long jLongValue3 = unpaidPrincipal != null ? unpaidPrincipal.longValue() : 0L;
                                                    Long maxAmount = next.getMaxAmount();
                                                    if (jLongValue3 <= (maxAmount != null ? maxAmount.longValue() : 0L)) {
                                                        Long penaltyAmount2 = next.getPenaltyAmount();
                                                        if (penaltyAmount2 != null) {
                                                            jLongValue = penaltyAmount2.longValue();
                                                            j6 = jLongValue;
                                                            z3 = true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                        j6 = 0;
                                    }
                                } else {
                                    z3 = true;
                                    j6 = 0;
                                }
                                textView.setText(activity2.getString(i119, r0.B(j6, z3)));
                                textView2.setVisibility(0);
                                ocInterestRulesData = ocInterestRulesData2;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            if (ocInterestRulesData != null && (intervalRule = ocInterestRulesData.getIntervalRule()) != null) {
                                arrayList3.addAll(intervalRule);
                            }
                            H h7 = new H(e10.f3228a, arrayList3);
                            View viewFindViewById6 = viewInflate.findViewById(e.interest_rv);
                            Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
                            RecyclerView recyclerView = (RecyclerView) viewFindViewById6;
                            final int i22 = 0;
                            final int i23 = 1;
                            recyclerView.setLayoutManager(new LinearLayoutManager(e10.f3228a, 1, false));
                            recyclerView.setAdapter(h7);
                            h.l(new ViewOnClickListenerC0087i(linearLayout, 8, textView2, e10), textView2);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i22) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, imageView);
                            h.l(new View.OnClickListener() { // from class: Gb.D
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    switch (i23) {
                                        case 0:
                                            e10.dismiss();
                                            break;
                                        default:
                                            e10.dismiss();
                                            break;
                                    }
                                }
                            }, button);
                            e10.setOnDismissListener(new G7.f(e10, 1));
                            Object value113 = ocBillFragment.f30395k0.getValue();
                            Intrinsics.checkNotNullExpressionValue(value113, "getValue(...)");
                            TextView view2 = (TextView) value113;
                            Intrinsics.checkNotNullParameter(view2, "view");
                            E e11 = e10.f3228a;
                            e10.showAsDropDown(view2, e11.getResources().getDimensionPixelSize(Ya.c.cs_lock_pop_margin_start), e11.getResources().getDimensionPixelSize(Ya.c.cs_interest_pop_margin_top), 8388613);
                            WindowManager.LayoutParams attributes = e11.getWindow().getAttributes();
                            Intrinsics.checkNotNullExpressionValue(attributes, "getAttributes(...)");
                            attributes.alpha = 0.5f;
                            e11.getWindow().setAttributes(attributes);
                            break;
                        }
                        break;
                    case 9:
                        OcCurBillData ocCurBillData2 = ocBillFragment.f30373A0;
                        if (((ocCurBillData2 == null || (outstandingAmount = ocCurBillData2.getOutstandingAmount()) == null) ? 0L : outstandingAmount.longValue()) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                            OcCurBillData ocCurBillData3 = ocBillFragment.f30373A0;
                            if (ocCurBillData3 != null) {
                                OcOrderReq ocOrderReq = new OcOrderReq(ocCurBillData3.getOutstandingAmount(), ocCurBillData3.getCardNo(), String.valueOf(ocCurBillData3.getId()), TransType.TRANS_TYPE_OK_CARD, Integer.valueOf(Integer.parseInt("2")), null, null, 64, null);
                                ocBillFragment.showLoadingDialog(true);
                                c.f40268a.getInstance().getClass();
                                c.a().createOcOrderV2(ocOrderReq).k(f.f42629b).i(b.a()).subscribe(new d0(ocBillFragment, 4, ocOrderReq, ocCurBillData3));
                            }
                        } else {
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_repay_activity");
                            OcCurBillData ocCurBillData4 = ocBillFragment.f30373A0;
                            Postcard postcardWithString = postcardBuild.withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocCurBillData4 != null ? ocCurBillData4.getCardNo() : null);
                            OcCurBillData ocCurBillData5 = ocBillFragment.f30373A0;
                            postcardWithString.withLong("oc_repay_bill_id", (ocCurBillData5 == null || (id2 = ocCurBillData5.getId()) == null) ? 0L : id2.longValue()).withString("oc_repay_order_no", null).navigation(ocBillFragment.getActivity());
                        }
                        break;
                    case 10:
                        int i24 = OcBillFragment.f30371L0;
                        Group groupY = ocBillFragment.y();
                        if (groupY == null || groupY.getVisibility() != 0) {
                            Group groupY2 = ocBillFragment.y();
                            if (groupY2 != null) {
                                groupY2.setVisibility(0);
                            }
                        } else {
                            Group groupY3 = ocBillFragment.y();
                            if (groupY3 != null) {
                                groupY3.setVisibility(8);
                            }
                        }
                        Group groupY4 = ocBillFragment.y();
                        int visibility = groupY4 != null ? groupY4.getVisibility() : 8;
                        t tVar = ocBillFragment.f30390X;
                        if (visibility != 0) {
                            Object value114 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value114, "getValue(...)");
                            ((ImageView) value114).setImageResource(d.cs_oc_installment_down_icon);
                        } else {
                            Object value115 = tVar.getValue();
                            Intrinsics.checkNotNullExpressionValue(value115, "getValue(...)");
                            ((ImageView) value115).setImageResource(d.cs_oc_bill_less_icon);
                        }
                        break;
                    case 11:
                        int i25 = OcBillFragment.f30371L0;
                        ocBillFragment.E("1,2,3,4,8,9,12,13,14,99,21,24", ocBillFragment.v(), ocBillFragment.z());
                        break;
                    default:
                        int i26 = OcBillFragment.f30371L0;
                        Object value116 = ocBillFragment.f30388M.getValue();
                        Intrinsics.checkNotNullExpressionValue(value116, "getValue(...)");
                        Object value117 = ocBillFragment.f30404v.getValue();
                        Intrinsics.checkNotNullExpressionValue(value117, "getValue(...)");
                        ocBillFragment.E("99", (TextView) value116, (TextView) value117);
                        break;
                }
            }
        }, (TextView) value12);
        B().addOnScrollListener(new p382zb.G(this));
        C2144l c2144l = this.f30379E0;
        if (c2144l != null) {
            p382zb.H itemClickListener = new p382zb.H();
            itemClickListener.f44527a = this;
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            c2144l.f4993c = itemClickListener;
        }
        C2144l c2144l2 = this.f30380F0;
        if (c2144l2 != null) {
            I itemClickListener2 = new I(this);
            Intrinsics.checkNotNullParameter(itemClickListener2, "itemClickListener");
            c2144l2.f4993c = itemClickListener2;
        }
        return 0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i7) {
        int iAbs = Math.abs(i7);
        int totalScrollRange = (appBarLayout != null ? appBarLayout.getTotalScrollRange() : 0) / 2;
        t tVar = this.f30376C;
        if (iAbs <= totalScrollRange) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            Toolbar toolbar = (Toolbar) value;
            if (toolbar != null) {
                toolbar.setVisibility(8);
                return;
            }
            return;
        }
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        Toolbar toolbar2 = (Toolbar) value2;
        if (toolbar2 != null) {
            toolbar2.setVisibility(0);
        }
    }

    public final TextView v() {
        Object value = this.f30389Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void w(boolean z3) {
        Long id2;
        if (z3) {
            this.f30384I0 = 1;
        } else {
            this.f30384I0++;
        }
        OcCurBillData ocCurBillData = this.f30373A0;
        OcRepaidRecordListReq ocRepaidRecordListReq = new OcRepaidRecordListReq(Long.valueOf((ocCurBillData == null || (id2 = ocCurBillData.getId()) == null) ? 0L : id2.longValue()), this.f30386K0, Integer.valueOf(this.f30384I0), 200, Long.valueOf(this.f30410z0));
        c.f40268a.getInstance().getClass();
        c.a().getRepaidRecordList(ocRepaidRecordListReq).k(f.f42629b).i(b.a()).subscribe(new n0(this, z3, 7));
    }

    public final void x() {
        if (this.f30409y0 > 0) {
            G.h(c.f40268a).queryBillDetailById(Long.valueOf(this.f30409y0)).k(f.f42629b).i(b.a()).subscribe(new F(this, 0));
        } else {
            G.h(c.f40268a).queryFutureDetailById(this.f30408x0, Long.valueOf(this.f30410z0)).k(f.f42629b).i(b.a()).subscribe(new F(this, 1));
        }
    }

    public final Group y() {
        Object value = this.f30391Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Group) value;
    }

    public final TextView z() {
        Object value = this.f30406w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }
}
