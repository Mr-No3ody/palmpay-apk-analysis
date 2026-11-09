package com.transsnet.palmpay.airtime.ui;

import Ba.a;
import C0.G;
import G7.q;
import L6.b;
import N8.q0;
import Oc.C0500c;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0589e;
import Rd.k0;
import T8.f;
import T8.o;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.u;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.airtime.bean.req.AddScheduleTopUpTaskReq;
import com.transsnet.palmpay.airtime.bean.rsp.AirtimeScheduleTopUpBean;
import com.transsnet.palmpay.airtime.ui.AutoTopupOverlayActivity;
import com.transsnet.palmpay.airtime.viewmodel.ScheduleTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.T;
import p051d9.C1624v;
import p068ec.s;
import p141j9.C1798f;
import p141j9.C1801i;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/airtime/auto_topup_overlay", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/AutoTopupOverlayActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/ScheduleTopUpViewModel;", "LRd/e;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutoTopupOverlayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoTopupOverlayActivity.kt\ncom/transsnet/palmpay/airtime/ui/AutoTopupOverlayActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,333:1\n171#2,12:334\n215#2:346\n*S KotlinDebug\n*F\n+ 1 AutoTopupOverlayActivity.kt\ncom/transsnet/palmpay/airtime/ui/AutoTopupOverlayActivity\n*L\n235#1:334,12\n235#1:346\n*E\n"})
public final class AutoTopupOverlayActivity extends BaseMvvmVBActivity<ScheduleTopUpViewModel, C0589e> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26463f = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26464d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AirtimeScheduleTopUpBean f26465e;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) l();
        l lVar = scheduleTopUpViewModel != null ? scheduleTopUpViewModel.f26640X : null;
        if (lVar != null) {
            lVar.e(this, new f(new o(28, this, this), 0, false));
        }
        ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) l();
        n.B(this, scheduleTopUpViewModel2 != null ? scheduleTopUpViewModel2.f26633A : null, this, new a(this, 29), new C1624v(this, 22), false, null, 240);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(p.transparent_54, this), false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_auto_topup_overlay, (ViewGroup) null, false);
        int i7 = c.bottomContainer;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            k0 k0VarA = k0.a(viewM);
            int i10 = c.overlay_background;
            View viewM2 = p059e1.a.m(i10, viewInflate);
            if (viewM2 != null) {
                C0589e c0589e = new C0589e((MotionLayout) viewInflate, k0VarA, viewM2);
                Intrinsics.checkNotNullExpressionValue(c0589e, "inflate(...)");
                return c0589e;
            }
            i7 = i10;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n() {
        MotionLayout motionLayout;
        C0589e c0589e = (C0589e) this.f27334c;
        if (c0589e == null || (motionLayout = c0589e.f8261a) == null) {
            return;
        }
        motionLayout.y();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        MotionLayout motionLayout;
        AirtimeScheduleTopUpBean airtimeScheduleTopUpBean = this.f26465e;
        if (airtimeScheduleTopUpBean == null) {
            finish();
            return;
        }
        Long amount = airtimeScheduleTopUpBean.getAmount();
        long jLongValue = amount != null ? amount.longValue() : 0L;
        Long discountAmount = airtimeScheduleTopUpBean.getDiscountAmount();
        long jLongValue2 = discountAmount != null ? discountAmount.longValue() : 0L;
        boolean z3 = discountAmount != null;
        long j6 = jLongValue - jLongValue2;
        String strF = r0.F(jLongValue);
        C0589e c0589e = (C0589e) this.f27334c;
        if (c0589e != null) {
            ((TextView) c0589e.f8262b.f8380w).setText(z3 ? q0.y(r0.F(j6), " ", getString(Pd.f.qt_betting_auto_renew_offer_suffix)) : q0.y(getString(Pd.f.qt_auto_top_up_airtime), " ", strF));
        }
        C0589e c0589e2 = (C0589e) this.f27334c;
        if (c0589e2 != null) {
            TextView textView = (TextView) c0589e2.f8262b.t;
            SpanUtils foregroundColor = G.i(strF).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, this));
            String timeText = airtimeScheduleTopUpBean.getTimeText();
            if (timeText == null) {
                timeText = "";
            }
            textView.setText(foregroundColor.append("/".concat(timeText)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this)).create());
        }
        C0589e c0589e3 = (C0589e) this.f27334c;
        if (c0589e3 != null) {
            c0589e3.f8262b.f8369b.setVisibility(z3 ? 0 : 8);
        }
        if (z3) {
            C0589e c0589e4 = (C0589e) this.f27334c;
            if (c0589e4 != null) {
                ((TextView) c0589e4.f8262b.f8378p).setText(r0.F(jLongValue));
            }
            C0589e c0589e5 = (C0589e) this.f27334c;
            if (c0589e5 != null) {
                c0589e5.f8262b.f8373f.setText(r0.F(jLongValue2));
            }
        }
        C0589e c0589e6 = (C0589e) this.f27334c;
        if (c0589e6 == null || (motionLayout = c0589e6.f8261a) == null) {
            return;
        }
        motionLayout.x();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        MotionLayout motionLayout;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 1));
        ARouter.getInstance().inject(this);
        C0589e c0589e = (C0589e) this.f27334c;
        if (c0589e != null) {
            c0589e.f8262b.f8370c.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C0589e c0589e2 = (C0589e) this.f27334c;
        if (c0589e2 != null) {
            c0589e2.f8262b.f8370c.setText(G.i("I confirm and accept ").setForegroundColor(getColor(b.ppColorTextPrimary)).append("Schedule top up airtime agreement").setForegroundColor(getColor(b.ppColorPrimary)).setClickSpan(new C0500c(this, 15)).create());
        }
        C0589e c0589e3 = (C0589e) this.f27334c;
        if (c0589e3 != null) {
            k0 k0Var = c0589e3.f8262b;
            k0Var.f8370c.setOnClickListener(new s(k0Var, 1));
            ((IconicsCheckBox) k0Var.f8376j).setChecked(true);
            TextView textView = (TextView) k0Var.f8378p;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        C0589e c0589e4 = (C0589e) this.f27334c;
        if (c0589e4 != null) {
            k0 k0Var2 = c0589e4.f8262b;
            final int i7 = 0;
            k0Var2.f8371d.setOnClickListener(new View.OnClickListener(this) { // from class: j9.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoTopupOverlayActivity f38406b;

                {
                    this.f38406b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long amount;
                    k0 k0Var3;
                    IconicsCheckBox iconicsCheckBox;
                    k0 k0Var4;
                    IconicsCheckBox iconicsCheckBox2;
                    AutoTopupOverlayActivity autoTopupOverlayActivity = this.f38406b;
                    switch (i7) {
                        case 0:
                            int i10 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_close");
                                autoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i11 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                AutoTopupOverlayActivity autoTopupOverlayActivity2 = this.f38406b;
                                C0589e c0589e5 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                if (c0589e5 == null || (k0Var3 = c0589e5.f8262b) == null || (iconicsCheckBox = (IconicsCheckBox) k0Var3.f8376j) == null || iconicsCheckBox.isChecked()) {
                                    AddScheduleTopUpTaskReq addScheduleTopUpTaskReq = new AddScheduleTopUpTaskReq();
                                    addScheduleTopUpTaskReq.setMemberId(BaseApplication.get().getUser().getMemberId());
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setPhone(airtimeScheduleTopUpBean != null ? airtimeScheduleTopUpBean.getPhone() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean2 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerId(airtimeScheduleTopUpBean2 != null ? airtimeScheduleTopUpBean2.getBillerId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean3 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerLogo(airtimeScheduleTopUpBean3 != null ? airtimeScheduleTopUpBean3.getBillerLogo() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean4 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setItemId(airtimeScheduleTopUpBean4 != null ? airtimeScheduleTopUpBean4.getItemId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean5 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeType(airtimeScheduleTopUpBean5 != null ? airtimeScheduleTopUpBean5.getTimeType() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean6 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeValue(airtimeScheduleTopUpBean6 != null ? airtimeScheduleTopUpBean6.getTimeValue() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean7 = autoTopupOverlayActivity2.f26465e;
                                    if (airtimeScheduleTopUpBean7 == null || (amount = airtimeScheduleTopUpBean7.getAmount()) == null) {
                                        amount = 0L;
                                    }
                                    addScheduleTopUpTaskReq.setRechargeAmount(amount);
                                    addScheduleTopUpTaskReq.setVerifyNetwork(Boolean.FALSE);
                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) autoTopupOverlayActivity2.l();
                                    if (scheduleTopUpViewModel != null) {
                                        scheduleTopUpViewModel.d(addScheduleTopUpTaskReq);
                                    }
                                } else {
                                    C0589e c0589e6 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                    if (c0589e6 != null && (k0Var4 = c0589e6.f8262b) != null && (iconicsCheckBox2 = (IconicsCheckBox) k0Var4.f8376j) != null) {
                                        String string = autoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, autoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("TransResultAutoTopAirtime_turnon");
                                break;
                            }
                            break;
                        default:
                            int i12 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_dontRemind");
                                ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) autoTopupOverlayActivity.l();
                                if (scheduleTopUpViewModel2 != null) {
                                    p140j8.f.s(scheduleTopUpViewModel2, new T(1, null), scheduleTopUpViewModel2.f26640X, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            ((PpButton) k0Var2.f8375i).setOnClickListener(new View.OnClickListener(this) { // from class: j9.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoTopupOverlayActivity f38406b;

                {
                    this.f38406b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long amount;
                    k0 k0Var3;
                    IconicsCheckBox iconicsCheckBox;
                    k0 k0Var4;
                    IconicsCheckBox iconicsCheckBox2;
                    AutoTopupOverlayActivity autoTopupOverlayActivity = this.f38406b;
                    switch (i10) {
                        case 0:
                            int i11 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_close");
                                autoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i12 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                AutoTopupOverlayActivity autoTopupOverlayActivity2 = this.f38406b;
                                C0589e c0589e5 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                if (c0589e5 == null || (k0Var3 = c0589e5.f8262b) == null || (iconicsCheckBox = (IconicsCheckBox) k0Var3.f8376j) == null || iconicsCheckBox.isChecked()) {
                                    AddScheduleTopUpTaskReq addScheduleTopUpTaskReq = new AddScheduleTopUpTaskReq();
                                    addScheduleTopUpTaskReq.setMemberId(BaseApplication.get().getUser().getMemberId());
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setPhone(airtimeScheduleTopUpBean != null ? airtimeScheduleTopUpBean.getPhone() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean2 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerId(airtimeScheduleTopUpBean2 != null ? airtimeScheduleTopUpBean2.getBillerId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean3 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerLogo(airtimeScheduleTopUpBean3 != null ? airtimeScheduleTopUpBean3.getBillerLogo() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean4 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setItemId(airtimeScheduleTopUpBean4 != null ? airtimeScheduleTopUpBean4.getItemId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean5 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeType(airtimeScheduleTopUpBean5 != null ? airtimeScheduleTopUpBean5.getTimeType() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean6 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeValue(airtimeScheduleTopUpBean6 != null ? airtimeScheduleTopUpBean6.getTimeValue() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean7 = autoTopupOverlayActivity2.f26465e;
                                    if (airtimeScheduleTopUpBean7 == null || (amount = airtimeScheduleTopUpBean7.getAmount()) == null) {
                                        amount = 0L;
                                    }
                                    addScheduleTopUpTaskReq.setRechargeAmount(amount);
                                    addScheduleTopUpTaskReq.setVerifyNetwork(Boolean.FALSE);
                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) autoTopupOverlayActivity2.l();
                                    if (scheduleTopUpViewModel != null) {
                                        scheduleTopUpViewModel.d(addScheduleTopUpTaskReq);
                                    }
                                } else {
                                    C0589e c0589e6 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                    if (c0589e6 != null && (k0Var4 = c0589e6.f8262b) != null && (iconicsCheckBox2 = (IconicsCheckBox) k0Var4.f8376j) != null) {
                                        String string = autoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, autoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("TransResultAutoTopAirtime_turnon");
                                break;
                            }
                            break;
                        default:
                            int i13 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_dontRemind");
                                ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) autoTopupOverlayActivity.l();
                                if (scheduleTopUpViewModel2 != null) {
                                    p140j8.f.s(scheduleTopUpViewModel2, new T(1, null), scheduleTopUpViewModel2.f26640X, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 2;
            k0Var2.f8372e.setOnClickListener(new View.OnClickListener(this) { // from class: j9.h

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoTopupOverlayActivity f38406b;

                {
                    this.f38406b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    long amount;
                    k0 k0Var3;
                    IconicsCheckBox iconicsCheckBox;
                    k0 k0Var4;
                    IconicsCheckBox iconicsCheckBox2;
                    AutoTopupOverlayActivity autoTopupOverlayActivity = this.f38406b;
                    switch (i11) {
                        case 0:
                            int i12 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_close");
                                autoTopupOverlayActivity.n();
                                break;
                            }
                            break;
                        case 1:
                            int i13 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                AutoTopupOverlayActivity autoTopupOverlayActivity2 = this.f38406b;
                                C0589e c0589e5 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                if (c0589e5 == null || (k0Var3 = c0589e5.f8262b) == null || (iconicsCheckBox = (IconicsCheckBox) k0Var3.f8376j) == null || iconicsCheckBox.isChecked()) {
                                    AddScheduleTopUpTaskReq addScheduleTopUpTaskReq = new AddScheduleTopUpTaskReq();
                                    addScheduleTopUpTaskReq.setMemberId(BaseApplication.get().getUser().getMemberId());
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setPhone(airtimeScheduleTopUpBean != null ? airtimeScheduleTopUpBean.getPhone() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean2 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerId(airtimeScheduleTopUpBean2 != null ? airtimeScheduleTopUpBean2.getBillerId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean3 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setBillerLogo(airtimeScheduleTopUpBean3 != null ? airtimeScheduleTopUpBean3.getBillerLogo() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean4 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setItemId(airtimeScheduleTopUpBean4 != null ? airtimeScheduleTopUpBean4.getItemId() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean5 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeType(airtimeScheduleTopUpBean5 != null ? airtimeScheduleTopUpBean5.getTimeType() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean6 = autoTopupOverlayActivity2.f26465e;
                                    addScheduleTopUpTaskReq.setTimeValue(airtimeScheduleTopUpBean6 != null ? airtimeScheduleTopUpBean6.getTimeValue() : null);
                                    AirtimeScheduleTopUpBean airtimeScheduleTopUpBean7 = autoTopupOverlayActivity2.f26465e;
                                    if (airtimeScheduleTopUpBean7 == null || (amount = airtimeScheduleTopUpBean7.getAmount()) == null) {
                                        amount = 0L;
                                    }
                                    addScheduleTopUpTaskReq.setRechargeAmount(amount);
                                    addScheduleTopUpTaskReq.setVerifyNetwork(Boolean.FALSE);
                                    ScheduleTopUpViewModel scheduleTopUpViewModel = (ScheduleTopUpViewModel) autoTopupOverlayActivity2.l();
                                    if (scheduleTopUpViewModel != null) {
                                        scheduleTopUpViewModel.d(addScheduleTopUpTaskReq);
                                    }
                                } else {
                                    C0589e c0589e6 = (C0589e) autoTopupOverlayActivity2.f27334c;
                                    if (c0589e6 != null && (k0Var4 = c0589e6.f8262b) != null && (iconicsCheckBox2 = (IconicsCheckBox) k0Var4.f8376j) != null) {
                                        String string = autoTopupOverlayActivity2.getString(Pd.f.qt_please_agree_agreement);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, autoTopupOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? q.f3135a : null);
                                    }
                                }
                                n0.g().l("TransResultAutoTopAirtime_turnon");
                                break;
                            }
                            break;
                        default:
                            int i14 = AutoTopupOverlayActivity.f26463f;
                            if (!r0.U0()) {
                                n0.g().l("TransResultAutoTopAirtime_dontRemind");
                                ScheduleTopUpViewModel scheduleTopUpViewModel2 = (ScheduleTopUpViewModel) autoTopupOverlayActivity.l();
                                if (scheduleTopUpViewModel2 != null) {
                                    p140j8.f.s(scheduleTopUpViewModel2, new T(1, null), scheduleTopUpViewModel2.f26640X, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0589e c0589e5 = (C0589e) this.f27334c;
        if (c0589e5 != null && (motionLayout = c0589e5.f8261a) != null) {
            motionLayout.setTransitionListener(new C1801i(this));
        }
        n0.g().v("TransResultAutoTopAirtime");
    }
}
