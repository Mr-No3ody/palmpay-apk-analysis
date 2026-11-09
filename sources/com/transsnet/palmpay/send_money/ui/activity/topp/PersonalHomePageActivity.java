package com.transsnet.palmpay.send_money.ui.activity.topp;

import C0.G;
import Kd.A;
import L6.b;
import Pa.C0525w;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.bean.req.ExtendField;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.topp.PersonalHomePageActivity;
import com.transsnet.palmpay.send_money.viewmodel.PersonalHomePageViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p159kd.e;
import p159kd.f;
import p220oa.h;
import p327vd.c;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/send/personnal_home_page")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/topp/PersonalHomePageActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/PersonalHomePageViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPersonalHomePageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersonalHomePageActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/PersonalHomePageActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,231:1\n171#2,12:232\n215#2:244\n*S KotlinDebug\n*F\n+ 1 PersonalHomePageActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/topp/PersonalHomePageActivity\n*L\n159#1:232,12\n159#1:244\n*E\n"})
public final class PersonalHomePageActivity extends BaseMvvmActivity<PersonalHomePageViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f33557L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f33558A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f33560C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33566g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33568j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33570p;
    public MemberDetailResp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f33571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33572w;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f33559B = 2;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final c f33561H = new c(this, 12);

    public PersonalHomePageActivity() {
        final int i7 = 0;
        this.f33562c = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i7) {
                    case 0:
                        int i10 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i11 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i12 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i13 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i14 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i10 = 1;
        this.f33563d = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i10) {
                    case 0:
                        int i11 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i12 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i13 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i14 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i11 = 2;
        this.f33564e = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i11) {
                    case 0:
                        int i12 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i13 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i14 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i12 = 3;
        this.f33565f = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i12) {
                    case 0:
                        int i13 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i14 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i13 = 4;
        this.f33566g = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i13) {
                    case 0:
                        int i14 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i112 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i14 = 5;
        this.f33567i = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i14) {
                    case 0:
                        int i15 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i112 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i113 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i15 = 6;
        this.f33568j = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i15) {
                    case 0:
                        int i16 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i112 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i113 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i114 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i16 = 7;
        this.f33569o = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i16) {
                    case 0:
                        int i17 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i112 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i113 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i114 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i115 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
        final int i17 = 8;
        this.f33570p = C2131j.b(new Function0(this) { // from class: yd.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PersonalHomePageActivity f44286b;

            {
                this.f44286b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PersonalHomePageActivity personalHomePageActivity = this.f44286b;
                switch (i17) {
                    case 0:
                        int i18 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvRequest);
                    case 1:
                        int i19 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvSend);
                    case 2:
                        int i110 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.llMoneyAction);
                    case 3:
                        int i111 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvMobile);
                    case 4:
                        int i112 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvTag);
                    case 5:
                        int i113 = PersonalHomePageActivity.f33557L;
                        return (LinearLayout) personalHomePageActivity.findViewById(e.ll_tag);
                    case 6:
                        int i114 = PersonalHomePageActivity.f33557L;
                        return personalHomePageActivity.findViewById(e.v_divider_verify);
                    case 7:
                        int i115 = PersonalHomePageActivity.f33557L;
                        return (TextView) personalHomePageActivity.findViewById(e.tvName);
                    default:
                        int i116 = PersonalHomePageActivity.f33557L;
                        return (ImageView) personalHomePageActivity.findViewById(e.ivHead);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_personal_home_page_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PersonalHomePageViewModel) l()).f33992e;
        if (lVar != null) {
            lVar.e(this, new p369yd.e(new p141j9.t(this, this, 29)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 4) {
            processLogic(null);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Object value = this.f33564e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).setVisibility(Intrinsics.c(G.k(), this.f33571v) ? 8 : 0);
        PersonalHomePageViewModel personalHomePageViewModel = (PersonalHomePageViewModel) l();
        int i7 = this.f33559B;
        String str = (i7 == 2 || i7 == 4) ? this.f33571v : this.f33560C;
        Integer numValueOf = Integer.valueOf(i7);
        C0525w c0525wF = C0525w.f();
        ExtendField extendField = new ExtendField(null, 1, null);
        extendField.setNeedShowAccountNo(this.f33560C);
        Unit unit = Unit.f38893a;
        MemberDetailReq req = new MemberDetailReq(str, numValueOf, ((Gson) c0525wF.f7166b).toJson(extendField), null, 8, null);
        personalHomePageViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(personalHomePageViewModel, new A(req, null), personalHomePageViewModel.f33992e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        org.greenrobot.eventbus.c.b().j(this);
        Object value = this.f33563d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Object value2 = this.f33562c.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.q(this.f33561H, (TextView) value, (TextView) value2);
    }
}
