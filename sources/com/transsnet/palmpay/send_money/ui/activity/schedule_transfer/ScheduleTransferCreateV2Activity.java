package com.transsnet.palmpay.send_money.ui.activity.schedule_transfer;

import Ad.O;
import Ad.f0;
import C0.G;
import Jd.b;
import Kd.C0374f0;
import Kd.C0383i0;
import Pa.i0;
import Pa.r0;
import X6.m;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.req.ScheduleTransferCreateReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmScheduleTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.FrequencyPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.MonthDayPickerDialog;
import com.transsnet.palmpay.send_money.ui.dialog.WeekDayPickerDialog;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p159kd.d;
import p159kd.e;
import p173ld.f;
import p220oa.h;
import p223od.c;
import p270rd.C1976t;
import p284sb.C2023v;
import p312ud.j;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/schedule_transfer_create_v2")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateV2Activity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferViewModel;", "Lod/c;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferCreateV2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferCreateV2Activity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateV2Activity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,783:1\n562#2,10:784\n171#3,12:794\n215#3:806\n171#3,12:807\n215#3:819\n1#4:820\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferCreateV2Activity.kt\ncom/transsnet/palmpay/send_money/ui/activity/schedule_transfer/ScheduleTransferCreateV2Activity\n*L\n167#1:784,10\n252#1:794,12\n252#1:806\n267#1:807,12\n267#1:819\n*E\n"})
public final class ScheduleTransferCreateV2Activity extends BaseMvvmVBActivity<ScheduleTransferViewModel, c> implements View.OnClickListener {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final int f33373C0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Jd.a f33374A;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public ConfirmScheduleTransferDialog f33377B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Long f33378C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Integer f33380L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Integer f33381M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ScheduleTransferCreateReq f33382Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ConstraintLayout f33383X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f33384Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f33385Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f33388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f33389g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33391j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public TextView f33392k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MemberDetailResp f33393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BankInfo f33394p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ConstraintLayout f33395p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextView f33396q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f33397r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f33398s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ConstraintLayout f33399t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextView f33400u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Jd.a f33401v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public TextView f33402v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public TextView f33404w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ConstraintLayout f33405x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public TextView f33406y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public TextView f33407z0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f33386d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f33387e = Double.valueOf(0.0d);
    public f0 t = new f0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public O f33403w = new O();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Long f33376B = Long.valueOf(b.f());

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Long f33379H = Long.valueOf(b.f());

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f33375A0 = C2131j.b(new C1976t(20));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getREQUEST_CODE_AUTH_BY_PIN() {
            return ScheduleTransferCreateV2Activity.f33373C0;
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33373C0 = 1000;
    }

    public static final f n(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity) {
        return (f) scheduleTransferCreateV2Activity.f33375A0.getValue();
    }

    public static final void o(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity) {
        c cVar = (c) scheduleTransferCreateV2Activity.f27334c;
        if (cVar != null) {
            cVar.t.setText(scheduleTransferCreateV2Activity.f33391j);
        }
        BankInfo bankInfo = scheduleTransferCreateV2Activity.f33394p;
        if (bankInfo != null) {
            c cVar2 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar2 != null) {
                TextView textView = cVar2.f40319p;
                String str = bankInfo.bankName;
                if (str == null) {
                    str = "";
                }
                textView.setText(r0.H(str) + "(" + i0.o(scheduleTransferCreateV2Activity.f33390i) + ")");
            }
            String str2 = bankInfo.bankUrl;
            c cVar3 = (c) scheduleTransferCreateV2Activity.f27334c;
            p002a.a.r(str2, cVar3 != null ? cVar3.f40311c : null);
            c cVar4 = (c) scheduleTransferCreateV2Activity.f27334c;
            r0.k1(cVar4 != null ? cVar4.f40312d : null, bankInfo.relationshipPic, bankInfo.relationshipDarkPic);
        }
    }

    public static final void p(ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity) {
        c cVar;
        MemberDetailResp memberDetailResp = scheduleTransferCreateV2Activity.f33393o;
        if (memberDetailResp != null) {
            c cVar2 = (c) scheduleTransferCreateV2Activity.f27334c;
            String strW = null;
            r0.m1(memberDetailResp.getHeadPortrait(), cVar2 != null ? cVar2.f40311c : null);
            if (TextUtils.isEmpty(memberDetailResp.getMemberId())) {
                c cVar3 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar3 != null) {
                    h.C(cVar3.t);
                }
                c cVar4 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar4 != null) {
                    cVar4.t.setText("Not registered");
                }
                if (!TextUtils.isEmpty(memberDetailResp.getPhone()) && (cVar = (c) scheduleTransferCreateV2Activity.f27334c) != null) {
                    TextView textView = cVar.f40319p;
                    String phone = memberDetailResp.getPhone();
                    textView.setText(phone != null ? r0.w(phone) : null);
                }
                c cVar5 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar5 != null) {
                    h.C(cVar5.f40320v);
                }
                c cVar6 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar6 != null) {
                    cVar6.f40320v.setText(new SpanUtils().appendImage(d.sm_ic_none_verified).append(" ").append("This number is not a PalmPay member").create());
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(memberDetailResp.getFullName())) {
                c cVar7 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar7 != null) {
                    cVar7.t.setText(memberDetailResp.getFullName());
                }
                c cVar8 = (c) scheduleTransferCreateV2Activity.f27334c;
                if (cVar8 != null) {
                    h.C(cVar8.t);
                }
            }
            c cVar9 = (c) scheduleTransferCreateV2Activity.f27334c;
            r0.k1(cVar9 != null ? cVar9.f40312d : null, memberDetailResp.getRelationshipPic(), memberDetailResp.getRelationshipDarkPic());
            c cVar10 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar10 != null) {
                TextView textView2 = cVar10.f40319p;
                if (TextUtils.isEmpty(memberDetailResp.getPpAccountNo())) {
                    String phone2 = memberDetailResp.getPhone();
                    if (phone2 != null) {
                        strW = r0.w(phone2);
                    }
                } else {
                    String ppAccountNo = memberDetailResp.getPpAccountNo();
                    if (ppAccountNo != null) {
                        strW = r0.w(ppAccountNo);
                    }
                }
                textView2.setText(strW);
            }
        }
    }

    public static int q(long j6) {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(Long.valueOf(j6));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return Integer.parseInt(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((ScheduleTransferViewModel) l()).f34013f;
        if (lVar != null) {
            lVar.e(this, new C2023v(new j(this, this, 0), 11));
        }
        l lVar2 = ((ScheduleTransferViewModel) l()).f34014g;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new j(this, this, 1), 11));
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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(p159kd.f.sm_activity_schedule_transfer_create_v2, (ViewGroup) null, false);
        int i7 = e.barrier_date;
        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.cb_agreement;
            IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
            if (iconicsCheckBox != null) {
                i7 = e.cl_date;
                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.cl_input;
                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.iv_avatar;
                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                        if (imageView != null) {
                            i7 = e.iv_relationship;
                            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                            if (imageView2 != null) {
                                i7 = e.llBottom;
                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    i7 = e.marqueeView;
                                    if (((MarqueeView) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = e.rb_every_day;
                                        if (((RadioButton) p059e1.a.m(i7, viewInflate)) != null) {
                                            i7 = e.rb_monthly;
                                            if (((RadioButton) p059e1.a.m(i7, viewInflate)) != null) {
                                                i7 = e.rb_only_once;
                                                if (((RadioButton) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = e.rb_weekly;
                                                    if (((RadioButton) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = e.rg_period;
                                                        RadioGroup radioGroup = (RadioGroup) p059e1.a.m(i7, viewInflate);
                                                        if (radioGroup != null) {
                                                            i7 = e.rv_payment_method;
                                                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                            if (recyclerView != null) {
                                                                i7 = e.titleBar;
                                                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = e.tv_agreement;
                                                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView != null) {
                                                                        i7 = e.tvAmount;
                                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i7 = e.tv_create_order;
                                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView3 != null) {
                                                                                i7 = e.tv_frequency;
                                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                if (textView4 != null) {
                                                                                    i7 = e.tv_info;
                                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (textView5 != null) {
                                                                                        i7 = e.tv_name;
                                                                                        TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView6 != null) {
                                                                                            i7 = e.tv_nont_verified;
                                                                                            TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView7 != null && (viewM = p059e1.a.m((i7 = e.v_divider), viewInflate)) != null) {
                                                                                                i7 = e.vst_daily;
                                                                                                if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                    i7 = e.vst_monthly;
                                                                                                    if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                        i7 = e.vst_once;
                                                                                                        if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                            i7 = e.vst_weekly;
                                                                                                            if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                                c cVar = new c((ConstraintLayout) viewInflate, iconicsCheckBox, imageView, imageView2, radioGroup, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewM);
                                                                                                                Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                                                                                                                return cVar;
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        String stringExtra;
        super.onActivityResult(i7, i10, intent);
        if (i7 != f33373C0 || i10 != -1 || intent == null || (stringExtra = intent.getStringExtra("extra_token")) == null) {
            return;
        }
        if ((!TextUtils.isEmpty(stringExtra) ? stringExtra : null) != null) {
            ScheduleTransferCreateReq scheduleTransferCreateReq = this.f33382Q;
            if (scheduleTransferCreateReq != null) {
                scheduleTransferCreateReq.setToken(stringExtra);
            }
            ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) l();
            ScheduleTransferCreateReq scheduleTransferCreateReq2 = this.f33382Q;
            scheduleTransferViewModel.getClass();
            p140j8.f.s(scheduleTransferViewModel, new C0374f0(scheduleTransferCreateReq2, null), scheduleTransferViewModel.f34014g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer num;
        Integer num2;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        String ppAccountNo;
        int i7 = 4;
        int i10 = 3;
        final int i11 = 0;
        final int i12 = 2;
        final int iIntValue = 1;
        Long lValueOf = null;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i13 = e.tv_create_order;
        if (numValueOf == null || numValueOf.intValue() != i13) {
            int i14 = e.tv_weekly_day;
            if (numValueOf != null && numValueOf.intValue() == i14) {
                new WeekDayPickerDialog(this).setCurrentWeekDay(this.t).setOnWeekDaySelectedListener(new p312ud.h(this, iIntValue)).show();
                return;
            }
            int i15 = e.tv_weekly_end_time;
            if (numValueOf != null && numValueOf.intValue() == i15) {
                FrequencyPickerDialog frequencyPickerDialog = new FrequencyPickerDialog(this);
                SimpleDateFormat simpleDateFormat = b.f4773a;
                f0 f0Var = this.t;
                if (f0Var != null && (num2 = f0Var.f219b) != null) {
                    iIntValue = num2.intValue();
                }
                frequencyPickerDialog.setDate(b.h(iIntValue)).setCurrentDate(this.f33401v).setOnFrequencySelectedListener(new p312ud.h(this, i12)).show();
                return;
            }
            int i16 = e.tv_monthly_day;
            if (numValueOf != null && numValueOf.intValue() == i16) {
                new MonthDayPickerDialog(this).setCurrentMonthDay(this.f33403w).setOnMonthDaySelectedListener(new p312ud.h(this, i10)).show();
                return;
            }
            int i17 = e.tv_monthly_end_time;
            if (numValueOf != null && numValueOf.intValue() == i17) {
                FrequencyPickerDialog frequencyPickerDialog2 = new FrequencyPickerDialog(this);
                SimpleDateFormat simpleDateFormat2 = b.f4773a;
                O o10 = this.f33403w;
                if (o10 != null && (num = o10.f183b) != null) {
                    iIntValue = num.intValue();
                }
                frequencyPickerDialog2.setDate(b.d(iIntValue)).setCurrentDate(this.f33374A).setOnFrequencySelectedListener(new p312ud.h(this, i7)).show();
                return;
            }
            int i18 = e.tv_daily_start_time;
            if (numValueOf != null && numValueOf.intValue() == i18) {
                m mVar = new m(this);
                mVar.f11028c = 1;
                mVar.f11027b = "Start Date";
                mVar.f11030e = this.f33376B;
                long jF = b.f();
                mVar.f11029d = Long.valueOf(jF);
                mVar.f11031f = Long.valueOf(jF + 31536000000L);
                mVar.f11032g = new Function2(this) { // from class: ud.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateV2Activity f42976b;

                    {
                        this.f42976b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l5 = (Long) obj;
                        switch (i11) {
                            case 0:
                                l5.getClass();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42976b;
                                scheduleTransferCreateV2Activity.f33376B = l5;
                                String strB = b.b(l5);
                                TextView textView = scheduleTransferCreateV2Activity.f33400u0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateV2Activity.f33378C = null;
                                scheduleTransferCreateV2Activity.t();
                                break;
                            case 1:
                                l5.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2 = this.f42976b;
                                scheduleTransferCreateV2Activity2.f33378C = l5;
                                scheduleTransferCreateV2Activity2.t();
                                break;
                            default:
                                l5.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity3 = this.f42976b;
                                scheduleTransferCreateV2Activity3.f33379H = l5;
                                scheduleTransferCreateV2Activity3.s();
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                mVar.a().show();
                return;
            }
            int i19 = e.tv_daily_end_time;
            if (numValueOf != null && numValueOf.intValue() == i19) {
                m mVar2 = new m(this);
                mVar2.f11028c = 1;
                mVar2.f11027b = "End Date";
                Long l5 = this.f33376B;
                mVar2.f11030e = l5;
                mVar2.f11029d = l5;
                mVar2.f11031f = Long.valueOf((l5 != null ? l5.longValue() : 0L) + 31536000000L);
                mVar2.f11032g = new Function2(this) { // from class: ud.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateV2Activity f42976b;

                    {
                        this.f42976b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l6 = (Long) obj;
                        switch (iIntValue) {
                            case 0:
                                l6.getClass();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42976b;
                                scheduleTransferCreateV2Activity.f33376B = l6;
                                String strB = b.b(l6);
                                TextView textView = scheduleTransferCreateV2Activity.f33400u0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateV2Activity.f33378C = null;
                                scheduleTransferCreateV2Activity.t();
                                break;
                            case 1:
                                l6.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2 = this.f42976b;
                                scheduleTransferCreateV2Activity2.f33378C = l6;
                                scheduleTransferCreateV2Activity2.t();
                                break;
                            default:
                                l6.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity3 = this.f42976b;
                                scheduleTransferCreateV2Activity3.f33379H = l6;
                                scheduleTransferCreateV2Activity3.s();
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                mVar2.a().show();
                return;
            }
            int i20 = e.tv_only_once_end_time;
            if (numValueOf != null && numValueOf.intValue() == i20) {
                m mVar3 = new m(this);
                mVar3.f11028c = 1;
                mVar3.f11027b = "Transfer Date";
                mVar3.f11030e = this.f33379H;
                mVar3.f11032g = new Function2(this) { // from class: ud.i

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ScheduleTransferCreateV2Activity f42976b;

                    {
                        this.f42976b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Long l6 = (Long) obj;
                        switch (i12) {
                            case 0:
                                l6.getClass();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = this.f42976b;
                                scheduleTransferCreateV2Activity.f33376B = l6;
                                String strB = b.b(l6);
                                TextView textView = scheduleTransferCreateV2Activity.f33400u0;
                                if (textView != null) {
                                    textView.setText(strB);
                                }
                                scheduleTransferCreateV2Activity.f33378C = null;
                                scheduleTransferCreateV2Activity.t();
                                break;
                            case 1:
                                l6.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity2 = this.f42976b;
                                scheduleTransferCreateV2Activity2.f33378C = l6;
                                scheduleTransferCreateV2Activity2.t();
                                break;
                            default:
                                l6.longValue();
                                ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity3 = this.f42976b;
                                scheduleTransferCreateV2Activity3.f33379H = l6;
                                scheduleTransferCreateV2Activity3.s();
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
        if (!r()) {
            h.x(this, getString(p159kd.h.sm_schedule_select_end_date));
            return;
        }
        c cVar = (c) this.f27334c;
        if (cVar == null || !cVar.f40310b.isChecked()) {
            h.x(this, getString(p159kd.h.sm_schedule_agreement_required));
            return;
        }
        Double d2 = this.f33387e;
        if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d) {
            ScheduleTransferCreateReq scheduleTransferCreateReq = new ScheduleTransferCreateReq();
            scheduleTransferCreateReq.setPayType(this.f33380L);
            Double d10 = this.f33387e;
            scheduleTransferCreateReq.setBusinessAmount(Long.valueOf((long) ((d10 != null ? d10.doubleValue() : 0.0d) * ((double) 100))));
            if (this.f33386d == 2) {
                scheduleTransferCreateReq.setType(1);
                MemberDetailResp memberDetailResp = this.f33393o;
                if (TextUtils.isEmpty(memberDetailResp != null ? memberDetailResp.getPpAccountNo() : null)) {
                    MemberDetailResp memberDetailResp2 = this.f33393o;
                    if (memberDetailResp2 != null) {
                        ppAccountNo = memberDetailResp2.getPhone();
                    } else {
                        ppAccountNo = null;
                    }
                } else {
                    MemberDetailResp memberDetailResp3 = this.f33393o;
                    if (memberDetailResp3 != null) {
                        ppAccountNo = memberDetailResp3.getPpAccountNo();
                    } else {
                        ppAccountNo = null;
                    }
                }
                scheduleTransferCreateReq.setPayeePhone(ppAccountNo);
                MemberDetailResp memberDetailResp4 = this.f33393o;
                scheduleTransferCreateReq.setPayeeMemberId(memberDetailResp4 != null ? memberDetailResp4.getMemberId() : null);
                MemberDetailResp memberDetailResp5 = this.f33393o;
                scheduleTransferCreateReq.setPayeeName(memberDetailResp5 != null ? memberDetailResp5.getMemberName() : null);
                MemberDetailResp memberDetailResp6 = this.f33393o;
                scheduleTransferCreateReq.setPayeeIcon(memberDetailResp6 != null ? memberDetailResp6.getHeadPortrait() : null);
            } else {
                scheduleTransferCreateReq.setPayeeName(this.f33391j);
                scheduleTransferCreateReq.setPayeeBankNo(this.f33390i);
                BankInfo bankInfo = this.f33394p;
                if (bankInfo != null) {
                    scheduleTransferCreateReq.setPayeeBankCode(bankInfo.bankCode);
                    scheduleTransferCreateReq.setPayeeBankName(bankInfo.bankName);
                    scheduleTransferCreateReq.setPayeeIcon(bankInfo.bankUrl);
                }
                if (this.f33386d == 9) {
                    scheduleTransferCreateReq.setType(3);
                } else {
                    scheduleTransferCreateReq.setType(2);
                }
            }
            scheduleTransferCreateReq.setScheduleTransferNotes(this.f33388f);
            scheduleTransferCreateReq.setTaskType(this.f33381M);
            Integer taskType = scheduleTransferCreateReq.getTaskType();
            if (taskType != null && taskType.intValue() == 1) {
                scheduleTransferCreateReq.setTransferNum(1);
                scheduleTransferCreateReq.setTaskStartDate(this.f33379H);
                scheduleTransferCreateReq.setTaskEndDate(this.f33379H);
                Long taskStartDate = scheduleTransferCreateReq.getTaskStartDate();
                scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(q(taskStartDate != null ? taskStartDate.longValue() : 0L)));
                Long taskEndDate = scheduleTransferCreateReq.getTaskEndDate();
                scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(q(taskEndDate != null ? taskEndDate.longValue() : 0L)));
            } else if (taskType != null && taskType.intValue() == 2) {
                SimpleDateFormat simpleDateFormat3 = b.f4773a;
                scheduleTransferCreateReq.setTransferNum(Integer.valueOf(b.c(this.f33376B, this.f33378C)));
                scheduleTransferCreateReq.setTaskStartDate(this.f33376B);
                scheduleTransferCreateReq.setTaskEndDate(this.f33378C);
                Long taskStartDate2 = scheduleTransferCreateReq.getTaskStartDate();
                scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(q(taskStartDate2 != null ? taskStartDate2.longValue() : 0L)));
                Long taskEndDate2 = scheduleTransferCreateReq.getTaskEndDate();
                scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(q(taskEndDate2 != null ? taskEndDate2.longValue() : 0L)));
            } else if (taskType != null && taskType.intValue() == 3) {
                f0 f0Var2 = this.t;
                scheduleTransferCreateReq.setTransferTime(f0Var2 != null ? f0Var2.f219b : null);
                Jd.a aVar = this.f33401v;
                scheduleTransferCreateReq.setTaskStartDate((aVar == null || (date4 = aVar.f4772d) == null) ? null : Long.valueOf(date4.getTime()));
                Long taskStartDate3 = scheduleTransferCreateReq.getTaskStartDate();
                scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(q(taskStartDate3 != null ? taskStartDate3.longValue() : 0L)));
                Jd.a aVar2 = this.f33401v;
                if ((aVar2 != null ? aVar2.f4769a : 0) > 0) {
                    scheduleTransferCreateReq.setTransferNum(aVar2 != null ? Integer.valueOf(aVar2.f4769a) : null);
                    Jd.a aVar3 = this.f33401v;
                    if (aVar3 != null && (date3 = aVar3.f4771c) != null) {
                        lValueOf = Long.valueOf(date3.getTime());
                    }
                    scheduleTransferCreateReq.setTaskEndDate(lValueOf);
                    Long taskEndDate3 = scheduleTransferCreateReq.getTaskEndDate();
                    scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(q(taskEndDate3 != null ? taskEndDate3.longValue() : 0L)));
                } else {
                    scheduleTransferCreateReq.setTransferNum(-1);
                }
            } else if (taskType != null && taskType.intValue() == 4) {
                O o11 = this.f33403w;
                scheduleTransferCreateReq.setTransferTime(o11 != null ? o11.f183b : null);
                Jd.a aVar4 = this.f33374A;
                scheduleTransferCreateReq.setTaskStartDate((aVar4 == null || (date2 = aVar4.f4772d) == null) ? null : Long.valueOf(date2.getTime()));
                Long taskStartDate4 = scheduleTransferCreateReq.getTaskStartDate();
                scheduleTransferCreateReq.setTaskStartTime(Integer.valueOf(q(taskStartDate4 != null ? taskStartDate4.longValue() : 0L)));
                Jd.a aVar5 = this.f33374A;
                if ((aVar5 != null ? aVar5.f4769a : 0) > 0) {
                    scheduleTransferCreateReq.setTransferNum(aVar5 != null ? Integer.valueOf(aVar5.f4769a) : null);
                    Jd.a aVar6 = this.f33374A;
                    if (aVar6 != null && (date = aVar6.f4771c) != null) {
                        lValueOf = Long.valueOf(date.getTime());
                    }
                    scheduleTransferCreateReq.setTaskEndDate(lValueOf);
                    Long taskEndDate4 = scheduleTransferCreateReq.getTaskEndDate();
                    scheduleTransferCreateReq.setTaskEndTime(Integer.valueOf(q(taskEndDate4 != null ? taskEndDate4.longValue() : 0L)));
                } else {
                    scheduleTransferCreateReq.setTransferNum(-1);
                }
            }
            this.f33382Q = scheduleTransferCreateReq;
            if (this.f33377B0 == null) {
                this.f33377B0 = new ConfirmScheduleTransferDialog(this);
            }
            ConfirmScheduleTransferDialog confirmScheduleTransferDialog = this.f33377B0;
            if (((confirmScheduleTransferDialog == null || !confirmScheduleTransferDialog.isShowing()) ? 0 : 1) != 0) {
                return;
            }
            ConfirmScheduleTransferDialog confirmScheduleTransferDialog2 = this.f33377B0;
            if (confirmScheduleTransferDialog2 != null) {
                confirmScheduleTransferDialog2.show();
            }
            ConfirmScheduleTransferDialog confirmScheduleTransferDialog3 = this.f33377B0;
            if (confirmScheduleTransferDialog3 != null) {
                confirmScheduleTransferDialog3.setData(this.f33382Q);
            }
            ConfirmScheduleTransferDialog confirmScheduleTransferDialog4 = this.f33377B0;
            if (confirmScheduleTransferDialog4 != null) {
                confirmScheduleTransferDialog4.setOnConfirmTransferInfoListener(new p312ud.h(this, i11));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) l();
        scheduleTransferViewModel.getClass();
        p140j8.f.s(scheduleTransferViewModel, new C0383i0(1, null), scheduleTransferViewModel.f34013f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final boolean r() {
        Integer num = this.f33381M;
        if (num != null && num.intValue() == 1) {
            Long l5 = this.f33379H;
            return (l5 != null ? l5.longValue() : 0L) > 0;
        }
        if (num != null && num.intValue() == 2) {
            Long l6 = this.f33378C;
            return (l6 != null ? l6.longValue() : 0L) > 0;
        }
        if (num != null && num.intValue() == 3) {
            return this.f33401v != null;
        }
        return (num == null || num.intValue() != 4 || this.f33374A == null) ? false : true;
    }

    public final void s() {
        z();
        TextView textView = this.f33406y0;
        if (textView != null) {
            SimpleDateFormat simpleDateFormat = b.f4773a;
            textView.setText(b.b(this.f33379H));
        }
        TextView textView2 = this.f33407z0;
        if (textView2 != null) {
            h.C(textView2);
        }
        TextView textView3 = this.f33407z0;
        if (textView3 != null) {
            SpanUtils foregroundColor = G.i("You are sending ").append("₦" + this.f33387e + " ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this));
            c cVar = (c) this.f27334c;
            SpanUtils spanUtilsAppend = foregroundColor.append("to " + ((Object) (cVar != null ? cVar.t.getText() : null)) + " ");
            SimpleDateFormat simpleDateFormat2 = b.f4773a;
            textView3.setText(d0.k("on ", b.b(this.f33379H), ", ", spanUtilsAppend).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).append("for a one-time transfer.").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p7.h(uIHandler, 12, this, false));
    }

    public final void t() {
        z();
        Long l5 = this.f33378C;
        if ((l5 != null ? l5.longValue() : 0L) <= 0) {
            TextView textView = this.f33402v0;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f33404w0;
            if (textView2 != null) {
                h.c(textView2);
                return;
            }
            return;
        }
        SimpleDateFormat simpleDateFormat = b.f4773a;
        int iC = b.c(this.f33376B, this.f33378C);
        String strB = b.b(this.f33378C);
        String strB2 = b.b(this.f33376B);
        TextView textView3 = this.f33402v0;
        if (textView3 != null) {
            textView3.setText(strB);
        }
        TextView textView4 = this.f33404w0;
        if (textView4 != null) {
            h.C(textView4);
        }
        TextView textView5 = this.f33404w0;
        if (textView5 != null) {
            SpanUtils foregroundColor = G.i("You are sending ").append("₦" + this.f33387e + " ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this));
            c cVar = (c) this.f27334c;
            textView5.setText(foregroundColor.append("to " + ((Object) (cVar != null ? cVar.t.getText() : null)) + " ").append("every day ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).append(G.q("from ", strB2, " to ", strB, ", ")).append("totaling " + iC + " transfers").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
        }
    }

    public final void u() {
        z();
        TextView textView = this.f33384Y;
        if (textView != null) {
            O o10 = this.f33403w;
            textView.setText((o10 != null ? o10.f182a : null) + " of Every Month");
        }
        TextView textView2 = this.f33385Z;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f33392k0;
        if (textView3 != null) {
            h.c(textView3);
        }
    }

    public final void v() {
        TextView textView;
        z();
        Jd.a aVar = this.f33374A;
        if (aVar == null) {
            TextView textView2 = this.f33385Z;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.f33392k0;
            if (textView3 != null) {
                h.c(textView3);
                return;
            }
            return;
        }
        if (aVar != null) {
            Date date = aVar.f4772d;
            Locale locale = Locale.ENGLISH;
            String strDate2String = TimeUtils.date2String(date, new SimpleDateFormat("MMM dd,yyyy", locale));
            SpanUtils foregroundColor = G.i("You are sending ").append("₦" + this.f33387e + " ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this));
            c cVar = (c) this.f27334c;
            SpanUtils spanUtilsAppend = foregroundColor.append("to " + ((Object) ((cVar == null || (textView = cVar.t) == null) ? null : textView.getText())) + " ");
            O o10 = this.f33403w;
            SpanUtils spanUtilsK = d0.k("from ", strDate2String, " ", d0.k("every ", o10 != null ? o10.f182a : null, " ", spanUtilsAppend).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)));
            if (aVar.f4769a <= 0) {
                TextView textView4 = this.f33385Z;
                if (textView4 != null) {
                    textView4.setText("No End");
                }
                TextView textView5 = this.f33392k0;
                if (textView5 != null) {
                    h.C(textView5);
                }
                TextView textView6 = this.f33392k0;
                if (textView6 != null) {
                    textView6.setText(spanUtilsK.append(",").append("with no end date.").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
                    return;
                }
                return;
            }
            String strDate2String2 = TimeUtils.date2String(aVar.f4771c, new SimpleDateFormat("MMM dd,yyyy", locale));
            TextView textView7 = this.f33385Z;
            if (textView7 != null) {
                textView7.setText(strDate2String2);
            }
            TextView textView8 = this.f33392k0;
            if (textView8 != null) {
                h.C(textView8);
            }
            TextView textView9 = this.f33392k0;
            if (textView9 != null) {
                textView9.setText(d0.k("to ", strDate2String2, ", ", spanUtilsK).append("totaling " + aVar.f4769a + " transfers").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
            }
        }
    }

    public final void w() {
        z();
        TextView textView = this.f33396q0;
        if (textView != null) {
            f0 f0Var = this.t;
            G.x("Every ", f0Var != null ? f0Var.f218a : null, textView);
        }
        TextView textView2 = this.f33397r0;
        if (textView2 != null) {
            textView2.setText("");
        }
        TextView textView3 = this.f33398s0;
        if (textView3 != null) {
            h.c(textView3);
        }
    }

    public final void x() {
        TextView textView;
        z();
        Jd.a aVar = this.f33401v;
        if (aVar == null) {
            TextView textView2 = this.f33397r0;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.f33398s0;
            if (textView3 != null) {
                h.c(textView3);
                return;
            }
            return;
        }
        if (aVar != null) {
            Date date = aVar.f4772d;
            Locale locale = Locale.ENGLISH;
            String strDate2String = TimeUtils.date2String(date, new SimpleDateFormat("yyyy/MM/dd", locale));
            SpanUtils foregroundColor = G.i("You are sending ").append("₦" + this.f33387e + " ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this));
            c cVar = (c) this.f27334c;
            SpanUtils spanUtilsAppend = foregroundColor.append("to " + ((Object) ((cVar == null || (textView = cVar.t) == null) ? null : textView.getText())) + " ");
            f0 f0Var = this.t;
            SpanUtils spanUtilsK = d0.k("from ", strDate2String, " ", d0.k("every ", f0Var != null ? f0Var.f218a : null, " ", spanUtilsAppend).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)));
            if (aVar.f4769a <= 0) {
                TextView textView4 = this.f33397r0;
                if (textView4 != null) {
                    textView4.setText("No End");
                }
                TextView textView5 = this.f33398s0;
                if (textView5 != null) {
                    h.C(textView5);
                }
                TextView textView6 = this.f33398s0;
                if (textView6 != null) {
                    textView6.setText(spanUtilsK.append(",").append("with no end date.").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
                    return;
                }
                return;
            }
            String strDate2String2 = TimeUtils.date2String(aVar.f4771c, new SimpleDateFormat("yyyy/MM/dd", locale));
            TextView textView7 = this.f33397r0;
            if (textView7 != null) {
                textView7.setText(strDate2String2);
            }
            TextView textView8 = this.f33398s0;
            if (textView8 != null) {
                h.C(textView8);
            }
            TextView textView9 = this.f33398s0;
            if (textView9 != null) {
                textView9.setText(d0.k("to ", strDate2String2, ", ", spanUtilsK).append("totaling " + aVar.f4769a + " transfers").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorSuccess, this)).create());
            }
        }
    }

    public final void y(boolean z3) {
        if (!z3) {
            ConstraintLayout constraintLayout = this.f33405x0;
            if (constraintLayout != null) {
                h.c(constraintLayout);
                return;
            }
            return;
        }
        if (this.f33405x0 == null) {
            ViewStub viewStub = (ViewStub) findViewById(e.vst_once);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            this.f33405x0 = viewInflate != null ? (ConstraintLayout) viewInflate.findViewById(e.cl_only_once) : null;
            this.f33406y0 = viewInflate != null ? (TextView) viewInflate.findViewById(e.tv_only_once_end_time) : null;
            this.f33407z0 = viewInflate != null ? (TextView) viewInflate.findViewById(e.tv_once_tips) : null;
            TextView textView = this.f33406y0;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            s();
        }
        ConstraintLayout constraintLayout2 = this.f33405x0;
        if (constraintLayout2 != null) {
            h.C(constraintLayout2);
        }
        this.f33381M = 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0032  */
    public final void z() {
        TextView textView;
        boolean z3;
        c cVar;
        IconicsCheckBox iconicsCheckBox;
        c cVar2 = (c) this.f27334c;
        if (cVar2 == null || (textView = cVar2.f40317j) == null) {
            return;
        }
        Double d2 = this.f33387e;
        if ((d2 != null ? d2.doubleValue() : 0.0d) > 0.0d && (cVar = (c) this.f27334c) != null && (iconicsCheckBox = cVar.f40310b) != null) {
            z3 = iconicsCheckBox.isChecked() && r();
        }
        textView.setSelected(z3);
    }
}
