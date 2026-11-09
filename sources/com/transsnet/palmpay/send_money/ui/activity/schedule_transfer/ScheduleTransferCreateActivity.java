package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import Ad.O;
import Ad.f0;
import C0.G;
import Jd.b;
import Kd.C0374f0;
import Kd.C0377g0;
import Kd.C0383i0;
import Pa.i0;
import Pa.r0;
import X6.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p159kd.d;
import p159kd.e;
import p173ld.f;
import p220oa.h;
import p270rd.C1976t;
import p284sb.C2023v;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_create")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferCreateActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,817:1\n562#2,10:818\n171#3,12:828\n215#3:840\n171#3,12:841\n215#3:853\n171#3,12:854\n215#3:866\n1#4:867\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferCreateActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateActivity\n*L\n191#1:818,10\n278#1:828,12\n278#1:840\n293#1:841,12\n293#1:853\n302#1:854,12\n302#1:866\n*E\n"})
public final class ScheduleTransferCreateActivity extends BaseMvvmActivity<ScheduleTransferViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static final int f33322O0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f33323A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f33324A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f33326B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ConstraintLayout f33328C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public TextView f33329D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public TextView f33330E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public TextView f33331F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public ConstraintLayout f33332G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f33333H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public TextView f33334H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public TextView f33335I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public TextView f33336J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public ConstraintLayout f33337K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f33338L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public TextView f33339L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f33340M;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ConfirmScheduleTransferDialog f33342N0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f33343Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33344X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public MemberDetailResp f33345Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public BankInfo f33346Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33351g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33353j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33356p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33363v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Integer f33364v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f33365w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Integer f33366w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ScheduleTransferCreateReq f33367x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ConstraintLayout f33368y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f33369z0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f33325B = 2;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Double f33327C = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public f0 f33354k0 = new f0();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Jd.a f33357p0 = (Jd.a) b.h(2).get(0);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public O f33358q0 = new O();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Jd.a f33359r0 = (Jd.a) b.d(1).get(0);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Long f33360s0 = Long.valueOf(b.f());

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Long f33361t0 = Long.valueOf(b.f());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Long f33362u0 = Long.valueOf(b.f());

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final t f33341M0 = C2131j.b(new C1976t(19));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getREQUEST_CODE_AUTH_BY_PIN() {
            return ScheduleTransferCreateActivity.f33322O0;
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33322O0 = 1000;
    }

    public ScheduleTransferCreateActivity() {
        final int i7 = 0;
        this.f33347c = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i7) {
                    case 0:
                        int i10 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i11 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i12 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i13 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i14 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i10 = 8;
        this.f33348d = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i10) {
                    case 0:
                        int i11 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i12 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i13 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i14 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i11 = 9;
        this.f33349e = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i11) {
                    case 0:
                        int i12 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i13 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i14 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i12 = 10;
        this.f33350f = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i12) {
                    case 0:
                        int i13 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i14 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i13 = 11;
        this.f33351g = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i13) {
                    case 0:
                        int i14 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i14 = 12;
        this.f33352i = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i14) {
                    case 0:
                        int i15 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i15 = 1;
        this.f33353j = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i15) {
                    case 0:
                        int i16 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i16 = 2;
        this.f33355o = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i16) {
                    case 0:
                        int i17 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i17 = 3;
        this.f33356p = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i17) {
                    case 0:
                        int i18 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i117 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i18 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i18) {
                    case 0:
                        int i19 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i117 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i118 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i19 = 5;
        this.f33363v = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i19) {
                    case 0:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i117 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i118 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i119 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i20 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i20 = 6;
        this.f33365w = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i20) {
                    case 0:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i117 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i118 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i119 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i21 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i23 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
        final int i21 = 7;
        this.f33323A = C2131j.b(new Function0(this) { // from class: ud.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferCreateActivity f42961b;

            {
                this.f42961b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42961b;
                switch (i21) {
                    case 0:
                        int i110 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_create_order);
                    case 1:
                        int i111 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpFormVertical) scheduleTransferCreateActivity.findViewById(e.et_note);
                    case 2:
                        int i112 = ScheduleTransferCreateActivity.f33322O0;
                        return (PpAmountEditText) scheduleTransferCreateActivity.findViewById(e.et_transfer_money);
                    case 3:
                        int i113 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_nont_verified);
                    case 4:
                        int i114 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_info);
                    case 5:
                        int i115 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_relationship);
                    case 6:
                        int i116 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_name);
                    case 7:
                        int i117 = ScheduleTransferCreateActivity.f33322O0;
                        return (ImageView) scheduleTransferCreateActivity.findViewById(e.iv_avatar);
                    case 8:
                        int i118 = ScheduleTransferCreateActivity.f33322O0;
                        return (TextView) scheduleTransferCreateActivity.findViewById(e.tv_agreement);
                    case 9:
                        int i119 = ScheduleTransferCreateActivity.f33322O0;
                        return (IconicsCheckBox) scheduleTransferCreateActivity.findViewById(e.cb_agreement);
                    case 10:
                        int i22 = ScheduleTransferCreateActivity.f33322O0;
                        return (RecyclerView) scheduleTransferCreateActivity.findViewById(e.rv_payment_method);
                    case 11:
                        int i23 = ScheduleTransferCreateActivity.f33322O0;
                        return (RadioGroup) scheduleTransferCreateActivity.findViewById(e.rg_period);
                    default:
                        int i24 = ScheduleTransferCreateActivity.f33322O0;
                        return (Button) scheduleTransferCreateActivity.findViewById(e.btn_add_note);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    public static final void m(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        boolean z3;
        Object value = scheduleTransferCreateActivity.f33347c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        if (textView != null) {
            PpAmountEditText ppAmountEditTextS = scheduleTransferCreateActivity.s();
            if ((ppAmountEditTextS != null ? ppAmountEditTextS.getDoubleAmount() : 0.0d) > 0.0d) {
                Object value2 = scheduleTransferCreateActivity.f33349e.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) value2;
                if (iconicsCheckBox != null) {
                    z3 = iconicsCheckBox.isChecked();
                }
            }
            textView.setEnabled(z3);
        }
    }

    public static final f n(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        return (f) scheduleTransferCreateActivity.f33341M0.getValue();
    }

    public static final void o(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        TextView textViewT = scheduleTransferCreateActivity.t();
        if (textViewT != null) {
            textViewT.setText(scheduleTransferCreateActivity.f33343Q);
        }
        BankInfo bankInfo = scheduleTransferCreateActivity.f33346Z;
        if (bankInfo != null) {
            Object value = scheduleTransferCreateActivity.t.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            TextView textView = (TextView) value;
            if (textView != null) {
                String str = bankInfo.bankName;
                if (str == null) {
                    str = "";
                }
                textView.setText(r0.H(str) + "(" + i0.o(scheduleTransferCreateActivity.f33340M) + ")");
            }
            String str2 = bankInfo.bankUrl;
            Object value2 = scheduleTransferCreateActivity.f33323A.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            p002a.a.r(str2, (ImageView) value2);
            Object value3 = scheduleTransferCreateActivity.f33363v.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            r0.k1((ImageView) value3, bankInfo.relationshipPic, bankInfo.relationshipDarkPic);
        }
    }

    public static final void p(ScheduleTransferCreateActivity scheduleTransferCreateActivity) {
        MemberDetailResp memberDetailResp = scheduleTransferCreateActivity.f33345Y;
        if (memberDetailResp != null) {
            Object value = scheduleTransferCreateActivity.f33323A.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            r0.m1(memberDetailResp.getHeadPortrait(), (ImageView) value);
            boolean zIsEmpty = TextUtils.isEmpty(memberDetailResp.getMemberId());
            t tVar = scheduleTransferCreateActivity.t;
            String strW = null;
            if (!zIsEmpty) {
                if (!TextUtils.isEmpty(memberDetailResp.getFullName())) {
                    TextView textViewT = scheduleTransferCreateActivity.t();
                    if (textViewT != null) {
                        textViewT.setText(memberDetailResp.getFullName());
                    }
                    TextView textViewT2 = scheduleTransferCreateActivity.t();
                    if (textViewT2 != null) {
                        h.C(textViewT2);
                    }
                }
                Object value2 = scheduleTransferCreateActivity.f33363v.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                r0.k1((ImageView) value2, memberDetailResp.getRelationshipPic(), memberDetailResp.getRelationshipDarkPic());
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView = (TextView) value3;
                if (textView != null) {
                    if (TextUtils.isEmpty(memberDetailResp.getPpAccountNo())) {
                        String phone = memberDetailResp.getPhone();
                        if (phone != null) {
                            strW = r0.w(phone);
                        }
                    } else {
                        String ppAccountNo = memberDetailResp.getPpAccountNo();
                        if (ppAccountNo != null) {
                            strW = r0.w(ppAccountNo);
                        }
                    }
                    textView.setText(strW);
                    return;
                }
                return;
            }
            TextView textViewT3 = scheduleTransferCreateActivity.t();
            if (textViewT3 != null) {
                h.C(textViewT3);
            }
            TextView textViewT4 = scheduleTransferCreateActivity.t();
            if (textViewT4 != null) {
                textViewT4.setText("Not registered");
            }
            if (!TextUtils.isEmpty(memberDetailResp.getPhone())) {
                Object value4 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                TextView textView2 = (TextView) value4;
                if (textView2 != null) {
                    String phone2 = memberDetailResp.getPhone();
                    textView2.setText(phone2 != null ? r0.w(phone2) : null);
                }
            }
            t tVar2 = scheduleTransferCreateActivity.f33356p;
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            TextView textView3 = (TextView) value5;
            if (textView3 != null) {
                h.C(textView3);
            }
            Object value6 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            TextView textView4 = (TextView) value6;
            if (textView4 != null) {
                textView4.setText(new SpanUtils().appendImage(d.sm_ic_none_verified).append(" ").append("This number is not a PalmPay member").create());
            }
        }
    }

    public static int u(long j6) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Long.valueOf(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Integer.parseInt(str);
    }

    public final void A(boolean z3) {
        if (!z3) {
            ConstraintLayout constraintLayout = this.f33337K0;
            if (constraintLayout != null) {
                h.c(constraintLayout);
                return;
            }
            return;
        }
        if (this.f33337K0 == null) {
            ViewStub viewStub = (ViewStub) findViewById(e.vst_once);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            this.f33337K0 = viewInflate != null ? (ConstraintLayout) viewInflate.findViewById(e.cl_only_once) : null;
            TextView textView = viewInflate != null ? (TextView) viewInflate.findViewById(e.tv_only_once_end_time) : null;
            this.f33339L0 = textView;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            TextView textView2 = this.f33339L0;
            if (textView2 != null) {
                SimpleDateFormat simpleDateFormat = b.f4773a;
                textView2.setText(b.b(this.f33362u0));
            }
        }
        ConstraintLayout constraintLayout2 = this.f33337K0;
        if (constraintLayout2 != null) {
            h.C(constraintLayout2);
        }
        this.f33366w0 = 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return p159kd.f.sm_activity_schedule_transfer_create;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferViewModel) l()).f34013f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new p312ud.d(this, this, 0), 10));
        }
        l lVar2 = ((ScheduleTransferViewModel) l()).f34012e;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new p312ud.d(this, this, 1), 10));
        }
        l lVar3 = ((ScheduleTransferViewModel) l()).f34014g;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new p312ud.d(this, this, 2), 10));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this), !isDarkMode());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String stringExtra;
        super.onActivityResult(i7, i10, intent);
        if (i7 != f33322O0 || i10 != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_token")) == null) {
            return;
        }
        if ((!TextUtils.isEmpty(stringExtra) ? stringExtra : null) != null) {
            ScheduleTransferCreateReq scheduleTransferCreateReq = this.f33367x0;
            if (scheduleTransferCreateReq != null) {
                scheduleTransferCreateReq.setToken(stringExtra);
            }
            ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) l();
            ScheduleTransferCreateReq scheduleTransferCreateReq2 = this.f33367x0;
            scheduleTransferViewModel.getClass();
            p140j8.f.s(scheduleTransferViewModel, new C0374f0(scheduleTransferCreateReq2, null), scheduleTransferViewModel.f34014g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer num;
        Integer num2;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        String ppAccountNo;
        int i7 = 3;
        int i10 = 4;
        final int i11 = 2;
        final int i12 = 0;
        final int iIntValue = 1;
        Long lValueOf = null;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i13 = e.tv_create_order;
        if (numValueOf == null || numValueOf.intValue() != i13) {
            int i14 = e.btn_add_note;
            if (numValueOf != null && numValueOf.intValue() == i14) {
                Button buttonQ = q();
                if (buttonQ != null) {
                    h.c(buttonQ);
                }
                PpFormVertical ppFormVerticalR = r();
                if (ppFormVerticalR != null) {
                    h.C(ppFormVerticalR);
                    return;
                }
                return;
            }
            int i15 = e.tv_weekly_day;
            if (numValueOf != null && numValueOf.intValue() == i15) {
                new WeekDayPickerDialog(this).setCurrentWeekDay(this.f33354k0).setOnWeekDaySelectedListener(new p312ud.b(this, iIntValue)).show();
                return;
            }
            int i16 = e.tv_weekly_end_time;
            if (numValueOf != null && numValueOf.intValue() == i16) {
                FrequencyPickerDialog frequencyPickerDialog = new FrequencyPickerDialog(this);
                SimpleDateFormat simpleDateFormat = b.f4773a;
                f0 f0Var = this.f33354k0;
                if (f0Var != null && (num2 = f0Var.f219b) != null) {
                    iIntValue = num2.intValue();
                }
                frequencyPickerDialog.setDate(b.h(iIntValue)).setCurrentDate(this.f33357p0).setOnFrequencySelectedListener(new p312ud.b(this, i11)).show();
                return;
            }
            int i17 = e.tv_monthly_day;
            if (numValueOf != null && numValueOf.intValue() == i17) {
                new MonthDayPickerDialog(this).setCurrentMonthDay(this.f33358q0).setOnMonthDaySelectedListener(new p312ud.b(this, i7)).show();
                return;
            }
            int i18 = e.tv_monthly_end_time;
            if (numValueOf != null && numValueOf.intValue() == i18) {
                FrequencyPickerDialog frequencyPickerDialog2 = new FrequencyPickerDialog(this);
                SimpleDateFormat simpleDateFormat2 = b.f4773a;
                O o10 = this.f33358q0;
                if (o10 != null && (num = o10.f183b) != null) {
                    iIntValue = num.intValue();
                }
                frequencyPickerDialog2.setDate(b.d(iIntValue)).setCurrentDate(this.f33359r0).setOnFrequencySelectedListener(new p312ud.b(this, i10)).show();
                return;
            }
            int i19 = e.tv_daily_start_time;
            if (numValueOf != null && numValueOf.intValue() == i19) {
                m mVar = new m(this);
                mVar.f11028c = 1;
                mVar.f11027b = "Start Date";
                mVar.f11030e = this.f33360s0;
                long jF = b.f();
                mVar.f11029d = Long.valueOf(jF);
                mVar.f11031f = Long.valueOf(jF + 31536000000L);
                mVar.f11032g = new Function2(this) { // from class: ud.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateActivity f42965b;

                    {
                        this.f42965b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l5 = (Long) obj;
                        switch (i12) {
                            case 0:
                                l5.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42965b;
                                scheduleTransferCreateActivity.f33360s0 = l5;
                                String strB = b.b(l5);
                                TextView textView = scheduleTransferCreateActivity.f33334H0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateActivity.f33361t0 = 0L;
                                TextView textView2 = scheduleTransferCreateActivity.f33335I0;
                                if (textView2 != null) {
                                    textView2.setText("");
                                }
                                TextView textView3 = scheduleTransferCreateActivity.f33336J0;
                                if (textView3 != null) {
                                    h.c(textView3);
                                }
                                break;
                            case 1:
                                l5.longValue();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity2 = this.f42965b;
                                scheduleTransferCreateActivity2.f33361t0 = l5;
                                scheduleTransferCreateActivity2.v();
                                break;
                            default:
                                l5.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity3 = this.f42965b;
                                scheduleTransferCreateActivity3.f33362u0 = l5;
                                TextView textView4 = scheduleTransferCreateActivity3.f33339L0;
                                if (textView4 != null) {
                                    textView4.setText(b.b(l5));
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                mVar.a().show();
                return;
            }
            int i20 = e.tv_daily_end_time;
            if (numValueOf != null && numValueOf.intValue() == i20) {
                m mVar2 = new m(this);
                mVar2.f11028c = 1;
                mVar2.f11027b = "End Date";
                Long l5 = this.f33360s0;
                mVar2.f11030e = l5;
                mVar2.f11029d = l5;
                mVar2.f11031f = Long.valueOf((l5 != null ? l5.longValue() : 0L) + 31536000000L);
                mVar2.f11032g = new Function2(this) { // from class: ud.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateActivity f42965b;

                    {
                        this.f42965b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l6 = (Long) obj;
                        switch (iIntValue) {
                            case 0:
                                l6.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42965b;
                                scheduleTransferCreateActivity.f33360s0 = l6;
                                String strB = b.b(l6);
                                TextView textView = scheduleTransferCreateActivity.f33334H0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateActivity.f33361t0 = 0L;
                                TextView textView2 = scheduleTransferCreateActivity.f33335I0;
                                if (textView2 != null) {
                                    textView2.setText("");
                                }
                                TextView textView3 = scheduleTransferCreateActivity.f33336J0;
                                if (textView3 != null) {
                                    h.c(textView3);
                                }
                                break;
                            case 1:
                                l6.longValue();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity2 = this.f42965b;
                                scheduleTransferCreateActivity2.f33361t0 = l6;
                                scheduleTransferCreateActivity2.v();
                                break;
                            default:
                                l6.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity3 = this.f42965b;
                                scheduleTransferCreateActivity3.f33362u0 = l6;
                                TextView textView4 = scheduleTransferCreateActivity3.f33339L0;
                                if (textView4 != null) {
                                    textView4.setText(b.b(l6));
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                mVar2.a().show();
                return;
            }
            int i21 = e.tv_only_once_end_time;
            if (numValueOf != null && numValueOf.intValue() == i21) {
                m mVar3 = new m(this);
                mVar3.f11028c = 1;
                mVar3.f11027b = "Transfer Date";
                mVar3.f11030e = this.f33362u0;
                mVar3.f11032g = new Function2(this) { // from class: ud.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateActivity f42965b;

                    {
                        this.f42965b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l6 = (Long) obj;
                        switch (i11) {
                            case 0:
                                l6.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity = this.f42965b;
                                scheduleTransferCreateActivity.f33360s0 = l6;
                                String strB = b.b(l6);
                                TextView textView = scheduleTransferCreateActivity.f33334H0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateActivity.f33361t0 = 0L;
                                TextView textView2 = scheduleTransferCreateActivity.f33335I0;
                                if (textView2 != null) {
                                    textView2.setText("");
                                }
                                TextView textView3 = scheduleTransferCreateActivity.f33336J0;
                                if (textView3 != null) {
                                    h.c(textView3);
                                }
                                break;
                            case 1:
                                l6.longValue();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity2 = this.f42965b;
                                scheduleTransferCreateActivity2.f33361t0 = l6;
                                scheduleTransferCreateActivity2.v();
                                break;
                            default:
                                l6.getClass();
                                ScheduleTransferCreateActivity scheduleTransferCreateActivity3 = this.f42965b;
                                scheduleTransferCreateActivity3.f33362u0 = l6;
                                TextView textView4 = scheduleTransferCreateActivity3.f33339L0;
                                if (textView4 != null) {
                                    textView4.setText(b.b(l6));
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                long jF2 = b.f();
                mVar3.f11029d = Long.valueOf(jF2);
                mVar3.f11031f = Long.valueOf(jF2 + 31536000000L);
                mVar3.a().show();
                return;
            }
            return;
        }
        if (this.f33344X == null) {
            return;
        }
        PpAmountEditText ppAmountEditTextS = s();
        long longAmount = ppAmountEditTextS != null ? ppAmountEditTextS.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33344X;
        if (longAmount < (balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L)) {
            String string = getString(p159kd.h.sm_amount_must_be_above_, r0.B(balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ToastUtils.showLong(string, new Object[0]);
            return;
        }
        PpAmountEditText ppAmountEditTextS2 = s();
        long longAmount2 = ppAmountEditTextS2 != null ? ppAmountEditTextS2.getLongAmount() : 0L;
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33344X;
        if (longAmount2 > (balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L)) {
            String string2 = getString(p159kd.h.sm_amount_must_be_below_, r0.B(balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L, false));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            ToastUtils.showLong(string2, new Object[0]);
            return;
        }
        Integer num3 = this.f33366w0;
        if (num3 != null && num3.intValue() == 2) {
            Long l6 = this.f33361t0;
            if ((l6 != null ? l6.longValue() : 0L) <= 0) {
                h.x(this, "Please select End Date");
                return;
            }
        } else if (num3 != null && num3.intValue() == 3) {
            if (this.f33357p0 == null) {
                h.x(this, "Please select End Date");
                return;
            }
        } else if (num3 != null && num3.intValue() == 4 && this.f33359r0 == null) {
            h.x(this, "Please select End Date");
            return;
        }
        ScheduleTransferCreateReq scheduleTransferCreateReq = new ScheduleTransferCreateReq();
        scheduleTransferCreateReq.setPayType(this.f33364v0);
        PpAmountEditText ppAmountEditTextS3 = s();
        scheduleTransferCreateReq.setBusinessAmount(Long.valueOf((long) ((ppAmountEditTextS3 != null ? ppAmountEditTextS3.getDoubleAmount() : 0.0d) * ((double) 100))));
        if (this.f33325B == 2) {
            scheduleTransferCreateReq.setType(1);
            MemberDetailResp memberDetailResp = this.f33345Y;
            if (TextUtils.isEmpty(memberDetailResp != null ? memberDetailResp.getPpAccountNo() : null)) {
                MemberDetailResp memberDetailResp2 = this.f33345Y;
                if (memberDetailResp2 != null) {
                    ppAccountNo = memberDetailResp2.getPhone();
                } else {
                    ppAccountNo = null;
                }
            } else {
                MemberDetailResp memberDetailResp3 = this.f33345Y;
                if (memberDetailResp3 != null) {
                    ppAccountNo = memberDetailResp3.getPpAccountNo();
                } else {
                    ppAccountNo = null;
                }
            }
            scheduleTransferCreateReq.setPayeePhone(ppAccountNo);
            MemberDetailResp memberDetailResp4 = this.f33345Y;
            scheduleTransferCreateReq.setPayeeMemberId(memberDetailResp4 != null ? memberDetailResp4.getMemberId() : null);
            MemberDetailResp memberDetailResp5 = this.f33345Y;
            scheduleTransferCreateReq.setPayeeName(memberDetailResp5 != null ? memberDetailResp5.getMemberName() : null);
            MemberDetailResp memberDetailResp6 = this.f33345Y;
            scheduleTransferCreateReq.setPayeeIcon(memberDetailResp6 != null ? memberDetailResp6.getHeadPortrait() : null);
        } else {
            scheduleTransferCreateReq.setPayeeName(this.f33343Q);
            scheduleTransferCreateReq.setPayeeBankNo(this.f33340M);
            BankInfo bankInfo = this.f33346Z;
            if (bankInfo != null) {
                scheduleTransferCreateReq.setPayeeBankCode(bankInfo.bankCode);
                scheduleTransferCreateReq.setPayeeBankName(bankInfo.bankName);
                scheduleTransferCreateReq.setPayeeIcon(bankInfo.bankUrl);
            }
            if (this.f33325B == 9) {
                scheduleTransferCreateReq.setType(3);
            } else {
                scheduleTransferCreateReq.setType(2);
            }
        }
        PpFormVertical ppFormVerticalR2 = r();
        scheduleTransferCreateReq.setScheduleTransferNotes(ppFormVerticalR2 != null ? ppFormVerticalR2.getEditContent() : null);
        scheduleTransferCreateReq.setTaskType(this.f33366w0);
        Integer taskType = scheduleTransferCreateReq.getTaskType();
        if (taskType != null && taskType.intValue() == 1) {
            scheduleTransferCreateReq.setTransferNum(1);
            scheduleTransferCreateReq.setTaskStartDate(this.f33362u0);
            scheduleTransferCreateReq.setTaskEndDate(this.f33362u0);
            Long taskStartDate = scheduleTransferCreateReq.getTaskStartDate();
            scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(u(taskStartDate != null ? taskStartDate.longValue() : 0L)));
            Long taskEndDate = scheduleTransferCreateReq.getTaskEndDate();
            scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(u(taskEndDate != null ? taskEndDate.longValue() : 0L)));
        } else if (taskType != null && taskType.intValue() == 2) {
            SimpleDateFormat simpleDateFormat3 = b.f4773a;
            scheduleTransferCreateReq.setTransferNum(Integer.valueOf(b.c(this.f33360s0, this.f33361t0)));
            scheduleTransferCreateReq.setTaskStartDate(this.f33360s0);
            scheduleTransferCreateReq.setTaskEndDate(this.f33361t0);
            Long taskStartDate2 = scheduleTransferCreateReq.getTaskStartDate();
            scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(u(taskStartDate2 != null ? taskStartDate2.longValue() : 0L)));
            Long taskEndDate2 = scheduleTransferCreateReq.getTaskEndDate();
            scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(u(taskEndDate2 != null ? taskEndDate2.longValue() : 0L)));
        } else if (taskType != null && taskType.intValue() == 3) {
            f0 f0Var2 = this.f33354k0;
            scheduleTransferCreateReq.setTransferTime(f0Var2 != null ? f0Var2.f219b : null);
            Jd.a aVar = this.f33357p0;
            scheduleTransferCreateReq.setTaskStartDate((aVar == null || (date4 = aVar.f4772d) == null) ? null : Long.valueOf(date4.getTime()));
            Long taskStartDate3 = scheduleTransferCreateReq.getTaskStartDate();
            scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(u(taskStartDate3 != null ? taskStartDate3.longValue() : 0L)));
            Jd.a aVar2 = this.f33357p0;
            if ((aVar2 != null ? aVar2.f4769a : 0) > 0) {
                scheduleTransferCreateReq.setTransferNum(aVar2 != null ? Integer.valueOf(aVar2.f4769a) : null);
                Jd.a aVar3 = this.f33357p0;
                if (aVar3 != null && (date3 = aVar3.f4771c) != null) {
                    lValueOf = Long.valueOf(date3.getTime());
                }
                scheduleTransferCreateReq.setTaskEndDate(lValueOf);
                Long taskEndDate3 = scheduleTransferCreateReq.getTaskEndDate();
                scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(u(taskEndDate3 != null ? taskEndDate3.longValue() : 0L)));
            } else {
                scheduleTransferCreateReq.setTransferNum(-1);
            }
        } else if (taskType != null && taskType.intValue() == 4) {
            O o11 = this.f33358q0;
            scheduleTransferCreateReq.setTransferTime(o11 != null ? o11.f183b : null);
            Jd.a aVar4 = this.f33359r0;
            scheduleTransferCreateReq.setTaskStartDate((aVar4 == null || (date2 = aVar4.f4772d) == null) ? null : Long.valueOf(date2.getTime()));
            Long taskStartDate4 = scheduleTransferCreateReq.getTaskStartDate();
            scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(u(taskStartDate4 != null ? taskStartDate4.longValue() : 0L)));
            Jd.a aVar5 = this.f33359r0;
            if ((aVar5 != null ? aVar5.f4769a : 0) > 0) {
                scheduleTransferCreateReq.setTransferNum(aVar5 != null ? Integer.valueOf(aVar5.f4769a) : null);
                Jd.a aVar6 = this.f33359r0;
                if (aVar6 != null && (date = aVar6.f4771c) != null) {
                    lValueOf = Long.valueOf(date.getTime());
                }
                scheduleTransferCreateReq.setTaskEndDate(lValueOf);
                Long taskEndDate4 = scheduleTransferCreateReq.getTaskEndDate();
                scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(u(taskEndDate4 != null ? taskEndDate4.longValue() : 0L)));
            } else {
                scheduleTransferCreateReq.setTransferNum(-1);
            }
        }
        this.f33367x0 = scheduleTransferCreateReq;
        if (this.f33342N0 == null) {
            this.f33342N0 = new ConfirmScheduleTransferDialog(this);
        }
        ConfirmScheduleTransferDialog confirmScheduleTransferDialog = this.f33342N0;
        if (((confirmScheduleTransferDialog == null || !confirmScheduleTransferDialog.isShowing()) ? 0 : 1) != 0) {
            return;
        }
        ConfirmScheduleTransferDialog confirmScheduleTransferDialog2 = this.f33342N0;
        if (confirmScheduleTransferDialog2 != null) {
            confirmScheduleTransferDialog2.show();
        }
        ConfirmScheduleTransferDialog confirmScheduleTransferDialog3 = this.f33342N0;
        if (confirmScheduleTransferDialog3 != null) {
            confirmScheduleTransferDialog3.setData(this.f33367x0);
        }
        ConfirmScheduleTransferDialog confirmScheduleTransferDialog4 = this.f33342N0;
        if (confirmScheduleTransferDialog4 != null) {
            confirmScheduleTransferDialog4.setOnConfirmTransferInfoListener(new p312ud.b(this, i12));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) l();
        scheduleTransferViewModel.getClass();
        p140j8.f.s(scheduleTransferViewModel, new C0383i0(1, null), scheduleTransferViewModel.f34013f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        ConfigReq req = new ConfigReq();
        if (this.f33325B == 2) {
            MemberDetailResp memberDetailResp = this.f33345Y;
            if (memberDetailResp != null) {
                req.setPayeeAccountType(1);
                req.setPhone(memberDetailResp.getPhone());
                req.setRecipientMemberId(memberDetailResp.getMemberId());
            }
        } else {
            req.setPayeeAccountType(6);
        }
        ScheduleTransferViewModel scheduleTransferViewModel2 = (ScheduleTransferViewModel) l();
        scheduleTransferViewModel2.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(scheduleTransferViewModel2, new C0377g0(req, null), scheduleTransferViewModel2.f34012e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final Button q() {
        Object value = this.f33352i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    public final PpFormVertical r() {
        Object value = this.f33353j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpFormVertical) value;
    }

    public final PpAmountEditText s() {
        Object value = this.f33355o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpAmountEditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 11, this, false));
    }

    public final TextView t() {
        Object value = this.f33365w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void v() {
        SimpleDateFormat simpleDateFormat = b.f4773a;
        int iC = b.c(this.f33360s0, this.f33361t0);
        TextView textView = this.f33336J0;
        if (textView != null) {
            h.C(textView);
        }
        TextView textView2 = this.f33336J0;
        if (textView2 != null) {
            textView2.setText("Total Number of Transfer: " + iC);
        }
        String strB = b.b(this.f33361t0);
        TextView textView3 = this.f33335I0;
        if (textView3 != null) {
            textView3.setText(strB);
        }
    }

    public final void w() {
        TextView textView = this.f33369z0;
        if (textView != null) {
            O o10 = this.f33358q0;
            textView.setText((o10 != null ? o10.f182a : null) + " of Every Month");
        }
        TextView textView2 = this.f33324A0;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f33326B0;
        if (textView3 != null) {
            h.c(textView3);
        }
    }

    public final void x() {
        Jd.a aVar = this.f33359r0;
        if (aVar != null) {
            Date date = aVar.f4772d;
            Locale locale = Locale.ENGLISH;
            String strDate2String = TimeUtils.date2String(date, new SimpleDateFormat("yyyy/MM/dd", locale));
            if (aVar.f4769a <= 0) {
                TextView textView = this.f33324A0;
                if (textView != null) {
                    textView.setText("No End");
                }
                TextView textView2 = this.f33326B0;
                if (textView2 != null) {
                    h.C(textView2);
                }
                TextView textView3 = this.f33326B0;
                if (textView3 != null) {
                    G.x("Time of the first transfer: ", strDate2String, textView3);
                    return;
                }
                return;
            }
            String strDate2String2 = TimeUtils.date2String(aVar.f4771c, new SimpleDateFormat("yyyy/MM/dd", locale));
            TextView textView4 = this.f33324A0;
            if (textView4 != null) {
                textView4.setText(strDate2String2);
            }
            TextView textView5 = this.f33326B0;
            if (textView5 != null) {
                h.C(textView5);
            }
            TextView textView6 = this.f33326B0;
            if (textView6 != null) {
                textView6.setText("Total Number of Transfer: " + aVar.f4769a + "\nTime of the first transfer: " + strDate2String);
            }
        }
    }

    public final void y() {
        TextView textView = this.f33329D0;
        if (textView != null) {
            f0 f0Var = this.f33354k0;
            G.x("Every ", f0Var != null ? f0Var.f218a : null, textView);
        }
        TextView textView2 = this.f33330E0;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f33331F0;
        if (textView3 != null) {
            h.c(textView3);
        }
    }

    public final void z() {
        Jd.a aVar = this.f33357p0;
        if (aVar != null) {
            Date date = aVar.f4772d;
            Locale locale = Locale.ENGLISH;
            String strDate2String = TimeUtils.date2String(date, new SimpleDateFormat("yyyy/MM/dd", locale));
            if (aVar.f4769a <= 0) {
                TextView textView = this.f33330E0;
                if (textView != null) {
                    textView.setText("No End");
                }
                TextView textView2 = this.f33331F0;
                if (textView2 != null) {
                    h.C(textView2);
                }
                TextView textView3 = this.f33331F0;
                if (textView3 != null) {
                    G.x("Time of the first transfer: ", strDate2String, textView3);
                    return;
                }
                return;
            }
            String strDate2String2 = TimeUtils.date2String(aVar.f4771c, new SimpleDateFormat("yyyy/MM/dd", locale));
            TextView textView4 = this.f33330E0;
            if (textView4 != null) {
                textView4.setText(strDate2String2);
            }
            TextView textView5 = this.f33331F0;
            if (textView5 != null) {
                h.C(textView5);
            }
            TextView textView6 = this.f33331F0;
            if (textView6 != null) {
                textView6.setText("Total Number of Transfer: " + aVar.f4769a + "\nTime of the first transfer: " + strDate2String);
            }
        }
    }
}
