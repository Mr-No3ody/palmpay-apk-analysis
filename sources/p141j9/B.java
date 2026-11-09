package p141j9;

import Bc.p;
import C9.C0145l;
import Fe.f0;
import Kd.D;
import L6.b;
import N8.m0;
import Oc.C0500c;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import Rd.H;
import Rd.r;
import S6.a;
import Wf.C0759d0;
import android.app.Application;
import android.graphics.Color;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.scheduler.TimerCycle;
import com.adjust.sdk.scheduler.TimerOnce;
import com.alibaba.android.arouter.facade.Postcard;
import com.didiglobal.booster.instrument.ShadowToast;
import com.flexibank.sdk.customview.FlexiBankTitleEditView;
import com.google.api.Service;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeTopupViewModel;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRaceScheduleView;
import com.transsnet.palmpay.betting.ui.view.ModelQuickBettingView;
import com.transsnet.palmpay.betting.viewmodel.BettingDepositViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.QrcodeGenerateReq;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentResultActivity;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMTNLoginActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcOneLoopActivity;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.TransferData;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.QrcodeScanActivity;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.TransferResultActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferCreateV2Activity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.schedule_transfer.ScheduleTransferPaymentSelectActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableDetailActivity;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableOrderListActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankAccountActivity;
import com.transsnet.palmpay.send_money.ui.fragment.QrcodeScanFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToBankFragment;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferPaymentToPalmPayFragment;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferForBankUnstableViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TradeRecordViewModel;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelBillerMoreService;
import com.transsnet.palmpay.ui.activity.coupon.CouponPackageResultActivity;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import com.transsnet.palmpay.ui.activity.qr.QrCodePayMoneyFragment;
import com.transsnet.palmpay.ui.activity.settings.PersonalActivityV2;
import com.transsnet.palmpay.ui.activity.settings.SettingsActivity;
import com.transsnet.palmpay.ui.activity.welcome.WelcomeNewUserActivity;
import com.transsnet.palmpay.ui.fragment.MessageListFragment;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o9.C1918x;
import o9.J;
import p159kd.d;
import p173ld.f;
import p220oa.h;
import p223od.c;
import p279s5.m;
import p284sb.Y;
import p312ud.e;
import p312ud.g;
import p312ud.k;
import p341wd.i;
import p341wd.j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38365b;

    public /* synthetic */ B(Object obj, int i7) {
        this.f38364a = i7;
        this.f38365b = obj;
    }

    private final void a() {
        PpAmountEditText ppAmountEditTextS;
        AppCompatEditText editText;
        ScheduleTransferCreateActivity scheduleTransferCreateActivity = (ScheduleTransferCreateActivity) this.f38365b;
        t tVar = scheduleTransferCreateActivity.f33350f;
        t tVar2 = scheduleTransferCreateActivity.f33348d;
        Trace.beginSection("delayInit");
        try {
            Object value = scheduleTransferCreateActivity.f33351g.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            RadioGroup radioGroup = (RadioGroup) value;
            if (radioGroup != null) {
                radioGroup.setOnCheckedChangeListener(new e(scheduleTransferCreateActivity, 0));
            }
            Object value2 = scheduleTransferCreateActivity.f33349e.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) value2;
            if (iconicsCheckBox != null) {
                iconicsCheckBox.setOnCheckedChangeListener(new C0145l(scheduleTransferCreateActivity, 7));
            }
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            TextView textView = (TextView) value3;
            if (textView != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            Object value4 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            TextView textView2 = (TextView) value4;
            if (textView2 != null) {
                textView2.setText(new SpanUtils().append("Agree with the ").append("Terms & Conditions").setClickSpan(new C0500c(scheduleTransferCreateActivity, 20)).append(" of Recurring Transfer").create());
            }
            Object value5 = scheduleTransferCreateActivity.f33347c.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            TextView textView3 = (TextView) value5;
            if (textView3 != null) {
                textView3.setOnClickListener(scheduleTransferCreateActivity);
            }
            Button buttonQ = scheduleTransferCreateActivity.q();
            if (buttonQ != null) {
                buttonQ.setOnClickListener(scheduleTransferCreateActivity);
            }
            scheduleTransferCreateActivity.A(true);
            Object value6 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            RecyclerView recyclerView = (RecyclerView) value6;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(scheduleTransferCreateActivity));
            }
            Object value7 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            RecyclerView recyclerView2 = (RecyclerView) value7;
            t tVar3 = scheduleTransferCreateActivity.f33341M0;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter((f) tVar3.getValue());
            }
            ((f) tVar3.getValue()).setOnItemClickListener(new p312ud.f(scheduleTransferCreateActivity));
            PpAmountEditText ppAmountEditTextS2 = scheduleTransferCreateActivity.s();
            if (ppAmountEditTextS2 != null) {
                ppAmountEditTextS2.setTextInputListener(new g(scheduleTransferCreateActivity));
            }
            PpFormVertical ppFormVerticalR = scheduleTransferCreateActivity.r();
            if (ppFormVerticalR != null && (editText = ppFormVerticalR.getEditText()) != null) {
                editText.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, scheduleTransferCreateActivity));
            }
            Double d2 = scheduleTransferCreateActivity.f33327C;
            if (d2 != null) {
                if (d2.doubleValue() <= 0.0d) {
                    d2 = null;
                }
                if (d2 != null && (ppAmountEditTextS = scheduleTransferCreateActivity.s()) != null) {
                    ppAmountEditTextS.setAmount(String.valueOf(scheduleTransferCreateActivity.f33327C));
                }
            }
            String str = scheduleTransferCreateActivity.f33333H;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                if (str != null) {
                    PpFormVertical ppFormVerticalR2 = scheduleTransferCreateActivity.r();
                    if (ppFormVerticalR2 != null) {
                        ppFormVerticalR2.setEditContent(str);
                    }
                    PpFormVertical ppFormVerticalR3 = scheduleTransferCreateActivity.r();
                    if (ppFormVerticalR3 != null) {
                        h.C(ppFormVerticalR3);
                    }
                    Button buttonQ2 = scheduleTransferCreateActivity.q();
                    if (buttonQ2 != null) {
                        h.c(buttonQ2);
                    }
                }
            }
            String str2 = scheduleTransferCreateActivity.f33338L;
            if (str2 != null) {
                String str3 = TextUtils.isEmpty(str2) ? null : str2;
                if (str3 != null) {
                    int i7 = scheduleTransferCreateActivity.f33325B;
                    if (i7 == 2) {
                        C0525w.f().getClass();
                        MemberDetailResp memberDetailResp = (MemberDetailResp) C0525w.d(str3, MemberDetailResp.class);
                        scheduleTransferCreateActivity.f33345Y = memberDetailResp;
                        if (memberDetailResp != null) {
                            ScheduleTransferCreateActivity.p(scheduleTransferCreateActivity);
                        }
                    } else if (i7 == 3 || i7 == 9) {
                        C0525w.f().getClass();
                        BankInfo bankInfo = (BankInfo) C0525w.d(str3, BankInfo.class);
                        scheduleTransferCreateActivity.f33346Z = bankInfo;
                        if (bankInfo != null) {
                            ScheduleTransferCreateActivity.o(scheduleTransferCreateActivity);
                        }
                    }
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    private final void b() {
        c cVar;
        ScheduleTransferCreateV2Activity scheduleTransferCreateV2Activity = (ScheduleTransferCreateV2Activity) this.f38365b;
        Trace.beginSection("delayInit");
        try {
            String str = scheduleTransferCreateV2Activity.f33389g;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                if (str != null) {
                    int i7 = scheduleTransferCreateV2Activity.f33386d;
                    if (i7 == 2) {
                        C0525w.f().getClass();
                        MemberDetailResp memberDetailResp = (MemberDetailResp) C0525w.d(str, MemberDetailResp.class);
                        scheduleTransferCreateV2Activity.f33393o = memberDetailResp;
                        if (memberDetailResp != null) {
                            ScheduleTransferCreateV2Activity.p(scheduleTransferCreateV2Activity);
                        }
                    } else if (i7 == 3 || i7 == 9) {
                        C0525w.f().getClass();
                        BankInfo bankInfo = (BankInfo) C0525w.d(str, BankInfo.class);
                        scheduleTransferCreateV2Activity.f33394p = bankInfo;
                        if (bankInfo != null) {
                            ScheduleTransferCreateV2Activity.o(scheduleTransferCreateV2Activity);
                        }
                    }
                }
            }
            c cVar2 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar2 != null) {
                cVar2.f40313e.setOnCheckedChangeListener(new e(scheduleTransferCreateV2Activity, 1));
            }
            c cVar3 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar3 != null) {
                cVar3.f40310b.setOnCheckedChangeListener(new C0145l(scheduleTransferCreateV2Activity, 8));
            }
            c cVar4 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar4 != null) {
                cVar4.f40315g.setMovementMethod(LinkMovementMethod.getInstance());
            }
            c cVar5 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar5 != null) {
                cVar5.f40315g.setText(new SpanUtils().append("Agree with the ").append("Terms & Conditions").setClickSpan(new C0500c(scheduleTransferCreateV2Activity, 21)).append(" of Recurring Transfer").create());
            }
            c cVar6 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar6 != null) {
                cVar6.f40317j.setOnClickListener(scheduleTransferCreateV2Activity);
            }
            scheduleTransferCreateV2Activity.y(true);
            c cVar7 = (c) scheduleTransferCreateV2Activity.f27334c;
            if (cVar7 != null) {
                cVar7.f40314f.setLayoutManager(new LinearLayoutManager(scheduleTransferCreateV2Activity));
            }
            c cVar8 = (c) scheduleTransferCreateV2Activity.f27334c;
            t tVar = scheduleTransferCreateV2Activity.f33375A0;
            if (cVar8 != null) {
                cVar8.f40314f.setAdapter((f) tVar.getValue());
            }
            ((f) tVar.getValue()).setOnItemClickListener(new k(scheduleTransferCreateV2Activity));
            Double d2 = scheduleTransferCreateV2Activity.f33387e;
            if (d2 != null) {
                if ((d2.doubleValue() > 0.0d ? d2 : null) != null && (cVar = (c) scheduleTransferCreateV2Activity.f27334c) != null) {
                    cVar.f40316i.setText(BaseApplication.getCurrencySymbol() + scheduleTransferCreateV2Activity.f33387e);
                }
            }
            scheduleTransferCreateV2Activity.z();
        } finally {
            Trace.endSection();
        }
    }

    private final void c() {
        ScheduleTransferForBankUnstableDetailActivity scheduleTransferForBankUnstableDetailActivity = (ScheduleTransferForBankUnstableDetailActivity) this.f38365b;
        t tVar = scheduleTransferForBankUnstableDetailActivity.f33438g;
        Trace.beginSection("delayInit");
        try {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((PpTitleBar) value).setRightImageView1Icon(a.pay_CustomerService);
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((PpTitleBar) value2).setRightImageView1ClickListener(i.f43420a);
            Object value3 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((PpTitleBar) value3).setBackButtonClickListener(new j(scheduleTransferForBankUnstableDetailActivity, 0));
            scheduleTransferForBankUnstableDetailActivity.n().getReceiptImageView().setImageResource(d.sm_ic_cancel_schedule_order);
            scheduleTransferForBankUnstableDetailActivity.n().setText("Cancel Booked Transfer");
            scheduleTransferForBankUnstableDetailActivity.n().setOnClickListener(new j(scheduleTransferForBankUnstableDetailActivity, 2));
            if (!TextUtils.isEmpty(scheduleTransferForBankUnstableDetailActivity.f33439i)) {
                scheduleTransferForBankUnstableDetailActivity.showLoadingDialog(true);
                ScheduleTransferForBankUnstableViewModel scheduleTransferForBankUnstableViewModel = (ScheduleTransferForBankUnstableViewModel) scheduleTransferForBankUnstableDetailActivity.l();
                String str = scheduleTransferForBankUnstableDetailActivity.f33439i;
                scheduleTransferForBankUnstableViewModel.getClass();
                p140j8.f.s(scheduleTransferForBankUnstableViewModel, new D(str, null), scheduleTransferForBankUnstableViewModel.f33996i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        } finally {
            Trace.endSection();
        }
    }

    private final void d() {
        Trace.beginSection("delayInit");
        try {
            SelectBankForToBankActivity.n((SelectBankForToBankActivity) this.f38365b);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Code duplicated, block: B:281:0x0638  */
    @Override // java.lang.Runnable
    public final void run() {
        TopupAirtimeActivity topupAirtimeActivity;
        ImageView backImageView;
        LinearLayout linearLayout;
        int i7 = 2;
        int i10 = 0;
        SingleAdView singleAdView = null;
        int i11 = 1;
        Object obj = this.f38365b;
        switch (this.f38364a) {
            case 0:
                TopupAirtimeActivity topupAirtimeActivity2 = (TopupAirtimeActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    int i12 = TopupAirtimeActivity.f26495x0;
                    H h7 = (H) topupAirtimeActivity2.f27334c;
                    if (h7 != null) {
                        h7.f8065f.b(false, new w(topupAirtimeActivity2, 3));
                    }
                    H h10 = (H) topupAirtimeActivity2.f27334c;
                    if (h10 != null) {
                        SingleAdView singleAdView2 = h10.f8071v;
                        org.chromium.support_lib_boundary.util.b.c(singleAdView2);
                        singleAdView2.setSlotId(topupAirtimeActivity2.getString(p025ba.k.ad_airtime_homepage_pocker_banner_slot_id));
                    }
                    AirTimeTopupViewModel airTimeTopupViewModel = (AirTimeTopupViewModel) topupAirtimeActivity2.l();
                    if (airTimeTopupViewModel != null) {
                        C function = new C(topupAirtimeActivity2, i10);
                        Intrinsics.checkNotNullParameter(function, "function");
                        J j6 = new J(1, null);
                        l lVar = airTimeTopupViewModel.f26621X;
                        lVar.f27356m = function;
                        Unit unit = Unit.f38893a;
                        p140j8.f.v(airTimeTopupViewModel, j6, lVar, 0L);
                    }
                    AirTimeTopupViewModel airTimeTopupViewModel2 = (AirTimeTopupViewModel) topupAirtimeActivity2.l();
                    if (airTimeTopupViewModel2 != null) {
                        airTimeTopupViewModel2.d();
                    }
                    AirTimeTopupViewModel airTimeTopupViewModel3 = (AirTimeTopupViewModel) topupAirtimeActivity2.l();
                    if (airTimeTopupViewModel3 != null) {
                        Intrinsics.checkNotNullParameter("04", "transType");
                        p140j8.f.s(airTimeTopupViewModel3, new C1918x(1, null), airTimeTopupViewModel3.f26629o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    }
                    String string = topupAirtimeActivity2.getString(p025ba.k.ad_airtime_homepage_pop_slot_id);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    InterstitialAdView.show$default(new InterstitialAdView(string, 0, new Ab.k(25), new org.sufficientlysecure.htmltextview.h(9)), topupAirtimeActivity2, null, 2, null);
                    if (topupAirtimeActivity2.f26498C != null) {
                        topupAirtimeActivity = topupAirtimeActivity2;
                    } else {
                        H h11 = (H) topupAirtimeActivity2.f27334c;
                        View viewInflate = h11 != null ? h11.f8069o.inflate() : null;
                        ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = viewInflate != null ? (ModelActivityBannerWithCoupon) viewInflate.findViewById(Pd.c.modelBannerWithCoupon) : null;
                        topupAirtimeActivity2.f26498C = modelActivityBannerWithCoupon;
                        if (modelActivityBannerWithCoupon != null) {
                            topupAirtimeActivity = topupAirtimeActivity2;
                            modelActivityBannerWithCoupon.e("04", topupAirtimeActivity2.isDarkMode(), new m0(topupAirtimeActivity2, 7), new C0759d0(1, topupAirtimeActivity2, TopupAirtimeActivity.class, "showLoadingDialog", "showLoadingDialog(Z)V", 0, 2), new org.greenrobot.eventbus.f(topupAirtimeActivity, 16));
                        } else {
                            topupAirtimeActivity = topupAirtimeActivity2;
                        }
                    }
                    H h12 = (H) topupAirtimeActivity.f27334c;
                    if (h12 != null) {
                        h12.f8064e.b(false, new C(topupAirtimeActivity, i11));
                    }
                    H h13 = (H) topupAirtimeActivity.f27334c;
                    org.chromium.support_lib_boundary.util.b.c(h13 != null ? h13.f8061b : null);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
                CouponPackageResultActivity couponPackageResultActivity = (CouponPackageResultActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    Bc.f fVar = couponPackageResultActivity.f34670j;
                    if (fVar != null && (backImageView = ((PpTitleBar) fVar.f703j).getBackImageView()) != null) {
                        h.c(backImageView);
                    }
                    Bc.f fVar2 = couponPackageResultActivity.f34670j;
                    if (fVar2 != null) {
                        ((PpTitleBar) fVar2.f703j).setRightImageView1Icon(a.pay_CustomerService);
                    }
                    Bc.f fVar3 = couponPackageResultActivity.f34670j;
                    if (fVar3 != null) {
                        ((PpTitleBar) fVar3.f703j).setRightImageView1ClickListener(new p146je.a(couponPackageResultActivity, i7));
                    }
                    CouponPackageResultActivity.m(couponPackageResultActivity);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 2:
                TimerCycle timerCycle = (TimerCycle) obj;
                timerCycle.logger.verbose("%s fired", timerCycle.name);
                timerCycle.command.run();
                return;
            case 3:
                TimerOnce timerOnce = (TimerOnce) obj;
                timerOnce.logger.verbose("%s fired", timerOnce.name);
                timerOnce.command.run();
                timerOnce.waitingTask = null;
                return;
            case 4:
                ((FlexiBankTitleEditView) obj).f22197B = "";
                return;
            case 5:
                p180m2.b bVar = (p180m2.b) obj;
                try {
                    Runnable runnable = (Runnable) bVar.f39466d.poll();
                    String str = bVar.f39463a;
                    if (runnable != null) {
                        runnable.run();
                    } else {
                        int i13 = p180m2.b.f39462i;
                        p229p2.a.o(p180m2.b.class, "%s: Worker has nothing to run", str);
                    }
                    int iDecrementAndGet = bVar.f39468f.decrementAndGet();
                    if (bVar.f39466d.isEmpty()) {
                        int i14 = p180m2.b.f39462i;
                        Integer numValueOf = Integer.valueOf(iDecrementAndGet);
                        return;
                    }
                    return;
                } finally {
                    int iDecrementAndGet2 = bVar.f39468f.decrementAndGet();
                    if (bVar.f39466d.isEmpty()) {
                        int i15 = p180m2.b.f39462i;
                        p229p2.a.p(p180m2.b.class, "%s: worker finished; %d workers left", bVar.f39463a, Integer.valueOf(iDecrementAndGet2));
                    } else {
                        bVar.b();
                    }
                }
            case 6:
                Trace.beginSection("delayInit");
                try {
                    h.i((NotificationListV2Activity) obj, Ac.e.fragmentContainer, new MessageListFragment(singleAdView));
                    return;
                } finally {
                    Trace.endSection();
                }
            case 7:
                Application application = p261r1.c.f41546i;
                StringBuilder sb2 = new StringBuilder("There's no route matched!\n Path = [");
                Postcard postcard = (Postcard) obj;
                sb2.append(postcard.getPath());
                sb2.append("]\n Group = [");
                sb2.append(postcard.getGroup());
                sb2.append("]");
                ShadowToast.show(Toast.makeText(application, sb2.toString(), 1));
                return;
            case 8:
                QrcodeScanActivity qrcodeScanActivity = (QrcodeScanActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    QrcodeScanFragment qrcodeScanFragment = new QrcodeScanFragment();
                    qrcodeScanFragment.v(qrcodeScanActivity.f33184a);
                    qrcodeScanFragment.f33689X = qrcodeScanActivity.f33185b;
                    h.i(qrcodeScanActivity, p159kd.e.fl_container, qrcodeScanFragment);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 9:
                TradeRecordDetailActivity tradeRecordDetailActivity = (TradeRecordDetailActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    if (!TextUtils.isEmpty(tradeRecordDetailActivity.f33216e)) {
                        ((TradeRecordViewModel) tradeRecordDetailActivity.l()).d(tradeRecordDetailActivity.f33216e);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 10:
                TransferResultActivity transferResultActivity = (TransferResultActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    TransferResultActivity.n(transferResultActivity);
                    PayByOrderResp.DataBean dataBean = transferResultActivity.f33248d;
                    if (dataBean != null) {
                        C0525w c0525wF = C0525w.f();
                        String str2 = dataBean.businessData;
                        c0525wF.getClass();
                        C0525w c0525wF2 = C0525w.f();
                        String str3 = dataBean.orderData;
                        c0525wF2.getClass();
                        transferResultActivity.f33249e = (TransferData) C0525w.d(str3, TransferData.class);
                        TransferResultActivity.o(transferResultActivity);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 11:
                QrCodePayMoneyFragment qrCodePayMoneyFragment = (QrCodePayMoneyFragment) obj;
                if (qrCodePayMoneyFragment.f34888Q == null) {
                    ((f0) qrCodePayMoneyFragment.f27328i).generateQrcodeData(new QrcodeGenerateReq("1", String.valueOf(1)), false);
                } else {
                    qrCodePayMoneyFragment.u();
                }
                qrCodePayMoneyFragment.f34882A.postDelayed(qrCodePayMoneyFragment.f34897q0, qrCodePayMoneyFragment.f34893k0);
                return;
            case 12:
                if (System.currentTimeMillis() - p152k5.e.f38687a.f38692e >= ((m) obj).f42042b) {
                    m.b();
                    m.a();
                    return;
                }
                return;
            case 13:
                BettingHomeActivity bettingHomeActivity = (BettingHomeActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    if (i0.W(bettingHomeActivity)) {
                        KProperty[] kPropertyArr = BettingHomeActivity.f26660w0;
                        r rVar = (r) bettingHomeActivity.f27334c;
                        if (rVar != null && (linearLayout = rVar.f8460a) != null) {
                            ViewStub viewStub = bettingHomeActivity.f26662A;
                            if (viewStub != null) {
                                viewStub.inflate();
                                bettingHomeActivity.t = (ModelQuickBettingView) linearLayout.findViewById(Pd.c.modelBannerQuickBet);
                                BettingDepositViewModel bettingDepositViewModel = (BettingDepositViewModel) bettingHomeActivity.l();
                                if (bettingDepositViewModel != null) {
                                    p282s9.j jVar = new p282s9.j(bettingHomeActivity, 4);
                                    x9.m mVar = new x9.m(1, null);
                                    l lVar2 = bettingDepositViewModel.f26770B;
                                    lVar2.f27356m = jVar;
                                    Unit unit2 = Unit.f38893a;
                                    p140j8.f.v(bettingDepositViewModel, mVar, lVar2, 0L);
                                }
                            }
                            bettingHomeActivity.f26662A = null;
                            InterstitialAdView interstitialAdViewJ = org.chromium.support_lib_boundary.util.b.j(bettingHomeActivity.getString(p025ba.k.betting_home_page_pop_slot_id));
                            if (interstitialAdViewJ != null) {
                                InterstitialAdView.show$default(interstitialAdViewJ, bettingHomeActivity, null, 2, null);
                            }
                            ViewStub viewStub2 = bettingHomeActivity.f26663B;
                            if (viewStub2 != null) {
                                viewStub2.inflate();
                                ModelActivityBannerWithCoupon modelActivityBannerWithCoupon2 = (ModelActivityBannerWithCoupon) linearLayout.findViewById(Pd.c.modelBannerWithCoupon);
                                bettingHomeActivity.f26683v = modelActivityBannerWithCoupon2;
                                if (modelActivityBannerWithCoupon2 != null) {
                                    modelActivityBannerWithCoupon2.e(TransType.TRANS_TYPE_BILLER_BETTING, bettingHomeActivity.isDarkMode(), p282s9.k.f42086a, new C0759d0(1, bettingHomeActivity, BettingHomeActivity.class, "showLoadingDialog", "showLoadingDialog(Z)V", 0, 3), new Ab.r(bettingHomeActivity, 23));
                                }
                            }
                            bettingHomeActivity.f26663B = null;
                            ViewStub viewStub3 = bettingHomeActivity.f26664C;
                            if (viewStub3 != null) {
                                viewStub3.inflate();
                                bettingHomeActivity.f26685w = (ModelBettingRaceScheduleView) linearLayout.findViewById(Pd.c.bettingRaceSchedule);
                            }
                            bettingHomeActivity.f26664C = null;
                            ViewStub viewStub4 = bettingHomeActivity.f26665H;
                            if (viewStub4 != null) {
                                viewStub4.inflate();
                                ModelBillerMoreService modelBillerMoreService = (ModelBillerMoreService) linearLayout.findViewById(Pd.c.moreServiceLayout);
                                if (modelBillerMoreService != null) {
                                    modelBillerMoreService.b(TransType.TRANS_TYPE_BILLER_BETTING, true);
                                }
                            }
                            bettingHomeActivity.f26665H = null;
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 14:
                PayShopPaymentResultActivity payShopPaymentResultActivity = (PayShopPaymentResultActivity) obj;
                t tVar = payShopPaymentResultActivity.f28747j;
                Trace.beginSection("delayInit");
                try {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    SingleAdView singleAdView3 = (SingleAdView) value;
                    singleAdView3.setSlotId(payShopPaymentResultActivity.getString(p025ba.k.ad_send_money_result_cash_back2));
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    singleAdView3.setAdListener(new com.chuanyi.ad.a((SingleAdView) value2, ""));
                    payShopPaymentResultActivity.r(false);
                    String str4 = payShopPaymentResultActivity.f28751w;
                    String str5 = TextUtils.isEmpty(str4) ? null : str4;
                    if (str5 != null) {
                        C0525w.f().getClass();
                        PayByOrderResp.DataBean dataBean2 = (PayByOrderResp.DataBean) C0525w.d(str5, PayByOrderResp.DataBean.class);
                        payShopPaymentResultActivity.f28738A = dataBean2;
                        if (dataBean2 != null) {
                            C0525w c0525wF3 = C0525w.f();
                            String str6 = dataBean2.businessData;
                            c0525wF3.getClass();
                            C0525w c0525wF4 = C0525w.f();
                            String str7 = dataBean2.orderData;
                            c0525wF4.getClass();
                            payShopPaymentResultActivity.f28739B = (QueryOrderDetailRsp) C0525w.d(str7, QueryOrderDetailRsp.class);
                            PayShopPaymentResultActivity.n(payShopPaymentResultActivity);
                        }
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 15:
                SearchMIDActivity searchMIDActivity = (SearchMIDActivity) obj;
                if (h.e(SearchMIDActivity.m(searchMIDActivity))) {
                    h.c(SearchMIDActivity.m(searchMIDActivity));
                } else {
                    TextView textViewM = SearchMIDActivity.m(searchMIDActivity);
                    Intrinsics.checkNotNullParameter(textViewM, "<this>");
                    if (textViewM.getVisibility() == 8) {
                        h.C(SearchMIDActivity.m(searchMIDActivity));
                    }
                }
                ((Handler) searchMIDActivity.f28784B.getValue()).postDelayed(this, 500L);
                return;
            case 16:
                ((Y) obj).invoke();
                return;
            case 17:
                Trace.beginSection("delayInit");
                try {
                    PersonalActivityV2 personalActivityV2 = (PersonalActivityV2) obj;
                    personalActivityV2.o(personalActivityV2.f34954B);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 18:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    int i16 = SettingsActivity.f34971d;
                    settingsActivity.m();
                    p pVar = settingsActivity.f34972b;
                    if (pVar != null) {
                        h.s((PpButton) pVar.f813d, true);
                    }
                    p pVar2 = settingsActivity.f34972b;
                    if (pVar2 != null) {
                        ((PpButton) pVar2.f813d).setOnClickListener(new p185ma.e(settingsActivity, 12));
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 19:
                androidx.camera.core.streamsharing.i iVar = (androidx.camera.core.streamsharing.i) obj;
                long jElapsedRealtime = iVar.f14502a - SystemClock.elapsedRealtime();
                OcMTNLoginActivity ocMTNLoginActivity = (OcMTNLoginActivity) iVar.f14504c;
                if (jElapsedRealtime < 1000) {
                    ((OcMTNLoginActivity) ocMTNLoginActivity.f29570v0.f42878b).f29573y0 = true;
                    ocMTNLoginActivity.f29566r0.setText(ocMTNLoginActivity.getString(Ya.g.cs_str_resend_code));
                    ocMTNLoginActivity.f29566r0.setTextColor(BaseApplication.getContext().getColor(Ya.b.cs_main_color));
                    return;
                } else {
                    ocMTNLoginActivity.f29566r0.setText(ocMTNLoginActivity.getString(Ya.g.cs_str_resend_code_, Integer.valueOf((int) (jElapsedRealtime / 1000))));
                    ocMTNLoginActivity.f29566r0.setTextColor(Color.parseColor("#858A8F"));
                    ((Handler) iVar.f14503b).postDelayed(this, 500L);
                    return;
                }
            case 20:
                androidx.camera.core.streamsharing.i iVar2 = (androidx.camera.core.streamsharing.i) obj;
                long jElapsedRealtime2 = iVar2.f14502a - SystemClock.elapsedRealtime();
                OcOneLoopActivity ocOneLoopActivity = (OcOneLoopActivity) iVar2.f14504c;
                if (jElapsedRealtime2 < 1000) {
                    ocOneLoopActivity.f29618u0.f42934a.f29621x0 = true;
                    ocOneLoopActivity.f29614q0.setText(ocOneLoopActivity.getString(Ya.g.cs_str_resend_code));
                    ocOneLoopActivity.f29614q0.setTextColor(BaseApplication.getContext().getColor(com.transsnet.palmpay.custom_view.p.cv_flexi_cash_base_color));
                    return;
                } else {
                    ocOneLoopActivity.f29614q0.setText(String.valueOf((int) (jElapsedRealtime2 / 1000)));
                    ocOneLoopActivity.f29614q0.setTextColor(Color.parseColor("#858A8F"));
                    ((Handler) iVar2.f14503b).postDelayed(this, 500L);
                    return;
                }
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                Trace.beginSection("delayInit");
                try {
                    ScheduleTransferHomeActivity scheduleTransferHomeActivity = (ScheduleTransferHomeActivity) obj;
                    ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                    Integer num = scheduleTransferHomeActivity.f33408c;
                    ScheduleTransferHomeFragment scheduleTransferHomeFragmentNewInstance = aVar.newInstance(num != null ? num.intValue() : 0);
                    Z supportFragmentManager = scheduleTransferHomeActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    C1161a c1161a = new C1161a(supportFragmentManager);
                    c1161a.e(p159kd.e.fl_container, scheduleTransferHomeFragmentNewInstance, null);
                    c1161a.h(true);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 24:
                Trace.beginSection("delayInit");
                try {
                    ScheduleTransferPaymentSelectActivity scheduleTransferPaymentSelectActivity = (ScheduleTransferPaymentSelectActivity) obj;
                    Integer num2 = scheduleTransferPaymentSelectActivity.f33417c;
                    Fragment fragmentNewInstance = (num2 != null && num2.intValue() == 1) ? ScheduleTransferPaymentToPalmPayFragment.f33719H.newInstance() : ScheduleTransferPaymentToBankFragment.f33711H.newInstance();
                    Z supportFragmentManager2 = scheduleTransferPaymentSelectActivity.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    C1161a c1161a2 = new C1161a(supportFragmentManager2);
                    c1161a2.e(p159kd.e.flContainer, fragmentNewInstance, null);
                    c1161a2.h(true);
                    return;
                } finally {
                    Trace.endSection();
                }
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                WelcomeNewUserActivity welcomeNewUserActivity = (WelcomeNewUserActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    Bc.k kVar = welcomeNewUserActivity.f35046f;
                    r0.r1(welcomeNewUserActivity.f35045e, kVar != null ? (AppCompatImageView) kVar.f752f : null);
                    p185ma.e eVar = new p185ma.e(welcomeNewUserActivity, 17);
                    Bc.k kVar2 = welcomeNewUserActivity.f35046f;
                    h.q(eVar, kVar2 != null ? (PpButton) kVar2.f749c : null, kVar2 != null ? (PpButton) kVar2.f748b : null);
                    u.a(welcomeNewUserActivity.getOnBackPressedDispatcher(), welcomeNewUserActivity, new C1798f(welcomeNewUserActivity, 22));
                    return;
                } finally {
                    Trace.endSection();
                }
            case 26:
                c();
                return;
            case 27:
                Trace.beginSection("delayInit");
                try {
                    ScheduleTransferForBankUnstableOrderListActivity.m((ScheduleTransferForBankUnstableOrderListActivity) obj);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 28:
                d();
                return;
            default:
                Trace.beginSection("delayInit");
                try {
                    TransferToBankAccountActivity.l((TransferToBankAccountActivity) obj);
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }

    public B(Y function) {
        this.f38364a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f38365b = function;
    }
}
