package com.transsnet.palmpay.betting.ui.activity;

import C0.G;
import L6.b;
import N8.q0;
import Oc.C0500c;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.C0590f;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.betting.ui.activity.BettingAutoRenewOverlayActivity;
import com.transsnet.palmpay.betting.viewmodel.BettingHomeViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.CreateBettingAutoRenewalReq;
import com.transsnet.palmpay.teller.bean.resp.BettingAutoRenewalRecommendRsp;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import kotlin.text.StringsKt;
import p059e1.a;
import p141j9.C1798f;
import p141j9.C1807o;
import p141j9.s;
import p141j9.t;
import p355xf.o;
import p355xf.p;
import p355xf.q;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "Betting 自动续费弹窗", path = "/betting/auto_renew_overlay", remark = "ignore")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/activity/BettingAutoRenewOverlayActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/betting/viewmodel/BettingHomeViewModel;", "LRd/f;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBettingAutoRenewOverlayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BettingAutoRenewOverlayActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingAutoRenewOverlayActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n171#2,12:300\n215#2:312\n1#3:313\n*S KotlinDebug\n*F\n+ 1 BettingAutoRenewOverlayActivity.kt\ncom/transsnet/palmpay/betting/ui/activity/BettingAutoRenewOverlayActivity\n*L\n208#1:300,12\n208#1:312\n*E\n"})
public final class BettingAutoRenewOverlayActivity extends BaseMvvmVBActivity<BettingHomeViewModel, C0590f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26654g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26655d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BettingAutoRenewalRecommendRsp f26657f;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        BettingHomeViewModel bettingHomeViewModel = (BettingHomeViewModel) l();
        n.B(this, bettingHomeViewModel != null ? bettingHomeViewModel.f26781e : null, this, new C1807o(this, 6), new D(17), false, null, 240);
        BettingHomeViewModel bettingHomeViewModel2 = (BettingHomeViewModel) l();
        l lVar = bettingHomeViewModel2 != null ? bettingHomeViewModel2.f26782f : null;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 14), (byte) 0, (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_betting_auto_renew_overlay, (ViewGroup) null, false);
        int i7 = c.bottom_sheet_container;
        if (((LinearLayout) a.m(i7, viewInflate)) != null) {
            i7 = c.btn_close;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = c.btnTurnOn;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = c.card_plan;
                    if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                        i7 = c.cbAgreement;
                        IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) a.m(i7, viewInflate);
                        if (iconicsCheckBox != null) {
                            i7 = c.confirmation_container;
                            if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                                i7 = c.ll_first_topup_row;
                                LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                                if (linearLayout != null && (viewM = a.m((i7 = c.overlay_background), viewInflate)) != null) {
                                    i7 = c.tvAgreement;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = c.tv_dont_remind;
                                        TextView textView3 = (TextView) a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = c.tv_first_topup_discount;
                                            TextView textView4 = (TextView) a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = c.tv_first_topup_label;
                                                TextView textView5 = (TextView) a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = c.tv_first_topup_original;
                                                    TextView textView6 = (TextView) a.m(i7, viewInflate);
                                                    if (textView6 != null) {
                                                        i7 = c.tv_plan_amount;
                                                        TextView textView7 = (TextView) a.m(i7, viewInflate);
                                                        if (textView7 != null) {
                                                            i7 = c.tv_plan_label;
                                                            TextView textView8 = (TextView) a.m(i7, viewInflate);
                                                            if (textView8 != null) {
                                                                i7 = c.tv_title;
                                                                TextView textView9 = (TextView) a.m(i7, viewInflate);
                                                                if (textView9 != null) {
                                                                    C0590f c0590f = new C0590f((MotionLayout) viewInflate, iconicsImageView, textView, iconicsCheckBox, linearLayout, viewM, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                    Intrinsics.checkNotNullExpressionValue(c0590f, "inflate(...)");
                                                                    return c0590f;
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

    public final void n() {
        MotionLayout motionLayout;
        C0590f c0590f = (C0590f) this.f27334c;
        if (c0590f == null || (motionLayout = c0590f.f8268a) == null) {
            return;
        }
        motionLayout.y();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Object objF;
        MotionLayout motionLayout;
        C0590f c0590f = (C0590f) this.f27334c;
        if (c0590f != null && (motionLayout = c0590f.f8268a) != null) {
            motionLayout.x();
        }
        String str = this.f26656e;
        BettingAutoRenewalRecommendRsp bettingAutoRenewalRecommendRsp = null;
        bettingAutoRenewalRecommendRsp = null;
        if (str != null) {
            if (StringsKt.F(str)) {
                str = null;
            }
            if (str != null) {
                try {
                    o oVar = q.f43977a;
                    C0525w.f().getClass();
                    objF = (BettingAutoRenewalRecommendRsp) C0525w.d(str, BettingAutoRenewalRecommendRsp.class);
                } catch (Throwable th) {
                    o oVar2 = q.f43977a;
                    objF = g.f(th);
                }
                bettingAutoRenewalRecommendRsp = (BettingAutoRenewalRecommendRsp) (objF instanceof p ? null : objF);
            }
        }
        if (bettingAutoRenewalRecommendRsp == null) {
            n();
            return;
        }
        this.f26657f = bettingAutoRenewalRecommendRsp;
        Long businessAmount = bettingAutoRenewalRecommendRsp.getBusinessAmount();
        long jLongValue = businessAmount != null ? businessAmount.longValue() : 0L;
        Long discountAmount = bettingAutoRenewalRecommendRsp.getDiscountAmount();
        long jLongValue2 = discountAmount != null ? discountAmount.longValue() : 0L;
        boolean z3 = discountAmount != null;
        long j6 = jLongValue - jLongValue2;
        C0590f c0590f2 = (C0590f) this.f27334c;
        if (c0590f2 != null) {
            c0590f2.f8280w.setText(z3 ? q0.y(r0.F(j6), " ", getString(f.qt_betting_auto_renew_offer_suffix)) : String.valueOf(getString(f.qt_betting_auto_renew_title)));
        }
        String strF = r0.F(jLongValue);
        String strO = !TextUtils.isEmpty(bettingAutoRenewalRecommendRsp.getTimeText()) ? G.o("/", bettingAutoRenewalRecommendRsp.getTimeText()) : "";
        C0590f c0590f3 = (C0590f) this.f27334c;
        if (c0590f3 != null) {
            c0590f3.t.setText(G.i(strF).setForegroundColor(CommonViewExtKt.colorInt(Pd.a.qt_betting_auto_renew_gold, this)).append(strO).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this)).create());
        }
        C0590f c0590f4 = (C0590f) this.f27334c;
        if (c0590f4 != null) {
            c0590f4.f8272e.setVisibility(z3 ? 0 : 8);
        }
        if (z3) {
            C0590f c0590f5 = (C0590f) this.f27334c;
            if (c0590f5 != null) {
                c0590f5.f8278p.setText(r0.F(jLongValue));
            }
            C0590f c0590f6 = (C0590f) this.f27334c;
            if (c0590f6 != null) {
                c0590f6.f8276j.setText(r0.F(jLongValue2));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        MotionLayout motionLayout;
        MotionLayout motionLayout2;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 12));
        initStatusBar(CommonViewExtKt.colorInt(com.transsnet.palmpay.custom_view.p.transparent_54, this), false);
        ARouter.getInstance().inject(this);
        C0590f c0590f = (C0590f) this.f27334c;
        if (c0590f != null) {
            c0590f.f8274g.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C0590f c0590f2 = (C0590f) this.f27334c;
        if (c0590f2 != null) {
            c0590f2.f8274g.setText(new SpanUtils().append(getString(f.qt_betting_auto_renew_agreement_prefix)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, this)).append(getString(f.qt_betting_auto_renew_agreement_link)).setForegroundColor(CommonViewExtKt.colorInt(Pd.a.qt_betting_auto_renew_gold, this)).setClickSpan(new C0500c(this, 16)).create());
        }
        C0590f c0590f3 = (C0590f) this.f27334c;
        if (c0590f3 != null) {
            final int i7 = 0;
            c0590f3.f8274g.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingAutoRenewOverlayActivity f42065b;

                {
                    this.f42065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IconicsCheckBox iconicsCheckBox;
                    BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = this.f42065b;
                    switch (i7) {
                        case 0:
                            int i10 = BettingAutoRenewOverlayActivity.f26654g;
                            C0590f c0590f4 = (C0590f) bettingAutoRenewOverlayActivity.f27334c;
                            if (c0590f4 != null && (iconicsCheckBox = c0590f4.f8271d) != null) {
                                iconicsCheckBox.setChecked(!iconicsCheckBox.isChecked());
                            }
                            n0.g().l("BettingResultPage_AutoNewPopUp_CheckboxButton");
                            break;
                        case 1:
                            int i11 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                n0.g().l("BettingResultPage_AutoNewPopUp_Close");
                                bettingAutoRenewOverlayActivity.n();
                                break;
                            }
                            break;
                        case 2:
                            int i12 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity2 = this.f42065b;
                                C0590f c0590f5 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                if (c0590f5 == null || c0590f5.f8271d.isChecked()) {
                                    BettingAutoRenewalRecommendRsp bettingAutoRenewalRecommendRsp = bettingAutoRenewOverlayActivity2.f26657f;
                                    if (bettingAutoRenewalRecommendRsp != null) {
                                        CreateBettingAutoRenewalReq req = new CreateBettingAutoRenewalReq();
                                        req.setCustomerId(bettingAutoRenewalRecommendRsp.getCustomerId());
                                        req.setBillerId(bettingAutoRenewalRecommendRsp.getBillerId());
                                        req.setBillerName(bettingAutoRenewalRecommendRsp.getBillerName());
                                        req.setBillerIcon(bettingAutoRenewalRecommendRsp.getBillerIcon());
                                        req.setItemId(bettingAutoRenewalRecommendRsp.getItemId());
                                        req.setAmount(bettingAutoRenewalRecommendRsp.getBusinessAmount());
                                        req.setTimeType(bettingAutoRenewalRecommendRsp.getTimeType());
                                        req.setTimeValue(bettingAutoRenewalRecommendRsp.getTimeValue());
                                        req.setTimeText(bettingAutoRenewalRecommendRsp.getTimeText());
                                        BettingHomeViewModel bettingHomeViewModel = (BettingHomeViewModel) bettingAutoRenewOverlayActivity2.l();
                                        if (bettingHomeViewModel != null) {
                                            Intrinsics.checkNotNullParameter(req, "req");
                                            if (BaseApplication.hasLogin()) {
                                                x9.s sVar = new x9.s(req, null);
                                                l lVar = bettingHomeViewModel.f26781e;
                                                lVar.f27356m = req;
                                                Unit unit = Unit.f38893a;
                                                p140j8.f.v(bettingHomeViewModel, sVar, lVar, 0L);
                                            }
                                        }
                                    }
                                } else {
                                    C0590f c0590f6 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                    if (c0590f6 != null) {
                                        IconicsCheckBox iconicsCheckBox2 = c0590f6.f8271d;
                                        String string = bettingAutoRenewOverlayActivity2.getString(f.qt_betting_please_agree_auto_renew);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, bettingAutoRenewOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    }
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i13 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingHomeViewModel bettingHomeViewModel2 = (BettingHomeViewModel) bettingAutoRenewOverlayActivity.l();
                                if (bettingHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(bettingHomeViewModel2, new x9.t(1, null), bettingHomeViewModel2.f26782f, 0L);
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0590f c0590f4 = (C0590f) this.f27334c;
        if (c0590f4 != null) {
            c0590f4.f8271d.setChecked(true);
        }
        C0590f c0590f5 = (C0590f) this.f27334c;
        if (c0590f5 != null) {
            TextView textView = c0590f5.f8278p;
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        }
        C0590f c0590f6 = (C0590f) this.f27334c;
        if (c0590f6 != null) {
            final int i10 = 1;
            c0590f6.f8269b.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingAutoRenewOverlayActivity f42065b;

                {
                    this.f42065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IconicsCheckBox iconicsCheckBox;
                    BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = this.f42065b;
                    switch (i10) {
                        case 0:
                            int i11 = BettingAutoRenewOverlayActivity.f26654g;
                            C0590f c0590f7 = (C0590f) bettingAutoRenewOverlayActivity.f27334c;
                            if (c0590f7 != null && (iconicsCheckBox = c0590f7.f8271d) != null) {
                                iconicsCheckBox.setChecked(!iconicsCheckBox.isChecked());
                            }
                            n0.g().l("BettingResultPage_AutoNewPopUp_CheckboxButton");
                            break;
                        case 1:
                            int i12 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                n0.g().l("BettingResultPage_AutoNewPopUp_Close");
                                bettingAutoRenewOverlayActivity.n();
                                break;
                            }
                            break;
                        case 2:
                            int i13 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity2 = this.f42065b;
                                C0590f c0590f8 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                if (c0590f8 == null || c0590f8.f8271d.isChecked()) {
                                    BettingAutoRenewalRecommendRsp bettingAutoRenewalRecommendRsp = bettingAutoRenewOverlayActivity2.f26657f;
                                    if (bettingAutoRenewalRecommendRsp != null) {
                                        CreateBettingAutoRenewalReq req = new CreateBettingAutoRenewalReq();
                                        req.setCustomerId(bettingAutoRenewalRecommendRsp.getCustomerId());
                                        req.setBillerId(bettingAutoRenewalRecommendRsp.getBillerId());
                                        req.setBillerName(bettingAutoRenewalRecommendRsp.getBillerName());
                                        req.setBillerIcon(bettingAutoRenewalRecommendRsp.getBillerIcon());
                                        req.setItemId(bettingAutoRenewalRecommendRsp.getItemId());
                                        req.setAmount(bettingAutoRenewalRecommendRsp.getBusinessAmount());
                                        req.setTimeType(bettingAutoRenewalRecommendRsp.getTimeType());
                                        req.setTimeValue(bettingAutoRenewalRecommendRsp.getTimeValue());
                                        req.setTimeText(bettingAutoRenewalRecommendRsp.getTimeText());
                                        BettingHomeViewModel bettingHomeViewModel = (BettingHomeViewModel) bettingAutoRenewOverlayActivity2.l();
                                        if (bettingHomeViewModel != null) {
                                            Intrinsics.checkNotNullParameter(req, "req");
                                            if (BaseApplication.hasLogin()) {
                                                x9.s sVar = new x9.s(req, null);
                                                l lVar = bettingHomeViewModel.f26781e;
                                                lVar.f27356m = req;
                                                Unit unit = Unit.f38893a;
                                                p140j8.f.v(bettingHomeViewModel, sVar, lVar, 0L);
                                            }
                                        }
                                    }
                                } else {
                                    C0590f c0590f9 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                    if (c0590f9 != null) {
                                        IconicsCheckBox iconicsCheckBox2 = c0590f9.f8271d;
                                        String string = bettingAutoRenewOverlayActivity2.getString(f.qt_betting_please_agree_auto_renew);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, bettingAutoRenewOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    }
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i14 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingHomeViewModel bettingHomeViewModel2 = (BettingHomeViewModel) bettingAutoRenewOverlayActivity.l();
                                if (bettingHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(bettingHomeViewModel2, new x9.t(1, null), bettingHomeViewModel2.f26782f, 0L);
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
            final int i11 = 2;
            c0590f6.f8270c.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingAutoRenewOverlayActivity f42065b;

                {
                    this.f42065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IconicsCheckBox iconicsCheckBox;
                    BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = this.f42065b;
                    switch (i11) {
                        case 0:
                            int i12 = BettingAutoRenewOverlayActivity.f26654g;
                            C0590f c0590f7 = (C0590f) bettingAutoRenewOverlayActivity.f27334c;
                            if (c0590f7 != null && (iconicsCheckBox = c0590f7.f8271d) != null) {
                                iconicsCheckBox.setChecked(!iconicsCheckBox.isChecked());
                            }
                            n0.g().l("BettingResultPage_AutoNewPopUp_CheckboxButton");
                            break;
                        case 1:
                            int i13 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                n0.g().l("BettingResultPage_AutoNewPopUp_Close");
                                bettingAutoRenewOverlayActivity.n();
                                break;
                            }
                            break;
                        case 2:
                            int i14 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity2 = this.f42065b;
                                C0590f c0590f8 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                if (c0590f8 == null || c0590f8.f8271d.isChecked()) {
                                    BettingAutoRenewalRecommendRsp bettingAutoRenewalRecommendRsp = bettingAutoRenewOverlayActivity2.f26657f;
                                    if (bettingAutoRenewalRecommendRsp != null) {
                                        CreateBettingAutoRenewalReq req = new CreateBettingAutoRenewalReq();
                                        req.setCustomerId(bettingAutoRenewalRecommendRsp.getCustomerId());
                                        req.setBillerId(bettingAutoRenewalRecommendRsp.getBillerId());
                                        req.setBillerName(bettingAutoRenewalRecommendRsp.getBillerName());
                                        req.setBillerIcon(bettingAutoRenewalRecommendRsp.getBillerIcon());
                                        req.setItemId(bettingAutoRenewalRecommendRsp.getItemId());
                                        req.setAmount(bettingAutoRenewalRecommendRsp.getBusinessAmount());
                                        req.setTimeType(bettingAutoRenewalRecommendRsp.getTimeType());
                                        req.setTimeValue(bettingAutoRenewalRecommendRsp.getTimeValue());
                                        req.setTimeText(bettingAutoRenewalRecommendRsp.getTimeText());
                                        BettingHomeViewModel bettingHomeViewModel = (BettingHomeViewModel) bettingAutoRenewOverlayActivity2.l();
                                        if (bettingHomeViewModel != null) {
                                            Intrinsics.checkNotNullParameter(req, "req");
                                            if (BaseApplication.hasLogin()) {
                                                x9.s sVar = new x9.s(req, null);
                                                l lVar = bettingHomeViewModel.f26781e;
                                                lVar.f27356m = req;
                                                Unit unit = Unit.f38893a;
                                                p140j8.f.v(bettingHomeViewModel, sVar, lVar, 0L);
                                            }
                                        }
                                    }
                                } else {
                                    C0590f c0590f9 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                    if (c0590f9 != null) {
                                        IconicsCheckBox iconicsCheckBox2 = c0590f9.f8271d;
                                        String string = bettingAutoRenewOverlayActivity2.getString(f.qt_betting_please_agree_auto_renew);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, bettingAutoRenewOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    }
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i15 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingHomeViewModel bettingHomeViewModel2 = (BettingHomeViewModel) bettingAutoRenewOverlayActivity.l();
                                if (bettingHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(bettingHomeViewModel2, new x9.t(1, null), bettingHomeViewModel2.f26782f, 0L);
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 3;
            c0590f6.f8275i.setOnClickListener(new View.OnClickListener(this) { // from class: s9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BettingAutoRenewOverlayActivity f42065b;

                {
                    this.f42065b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IconicsCheckBox iconicsCheckBox;
                    BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity = this.f42065b;
                    switch (i12) {
                        case 0:
                            int i13 = BettingAutoRenewOverlayActivity.f26654g;
                            C0590f c0590f7 = (C0590f) bettingAutoRenewOverlayActivity.f27334c;
                            if (c0590f7 != null && (iconicsCheckBox = c0590f7.f8271d) != null) {
                                iconicsCheckBox.setChecked(!iconicsCheckBox.isChecked());
                            }
                            n0.g().l("BettingResultPage_AutoNewPopUp_CheckboxButton");
                            break;
                        case 1:
                            int i14 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                n0.g().l("BettingResultPage_AutoNewPopUp_Close");
                                bettingAutoRenewOverlayActivity.n();
                                break;
                            }
                            break;
                        case 2:
                            int i15 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingAutoRenewOverlayActivity bettingAutoRenewOverlayActivity2 = this.f42065b;
                                C0590f c0590f8 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                if (c0590f8 == null || c0590f8.f8271d.isChecked()) {
                                    BettingAutoRenewalRecommendRsp bettingAutoRenewalRecommendRsp = bettingAutoRenewOverlayActivity2.f26657f;
                                    if (bettingAutoRenewalRecommendRsp != null) {
                                        CreateBettingAutoRenewalReq req = new CreateBettingAutoRenewalReq();
                                        req.setCustomerId(bettingAutoRenewalRecommendRsp.getCustomerId());
                                        req.setBillerId(bettingAutoRenewalRecommendRsp.getBillerId());
                                        req.setBillerName(bettingAutoRenewalRecommendRsp.getBillerName());
                                        req.setBillerIcon(bettingAutoRenewalRecommendRsp.getBillerIcon());
                                        req.setItemId(bettingAutoRenewalRecommendRsp.getItemId());
                                        req.setAmount(bettingAutoRenewalRecommendRsp.getBusinessAmount());
                                        req.setTimeType(bettingAutoRenewalRecommendRsp.getTimeType());
                                        req.setTimeValue(bettingAutoRenewalRecommendRsp.getTimeValue());
                                        req.setTimeText(bettingAutoRenewalRecommendRsp.getTimeText());
                                        BettingHomeViewModel bettingHomeViewModel = (BettingHomeViewModel) bettingAutoRenewOverlayActivity2.l();
                                        if (bettingHomeViewModel != null) {
                                            Intrinsics.checkNotNullParameter(req, "req");
                                            if (BaseApplication.hasLogin()) {
                                                x9.s sVar = new x9.s(req, null);
                                                l lVar = bettingHomeViewModel.f26781e;
                                                lVar.f27356m = req;
                                                Unit unit = Unit.f38893a;
                                                p140j8.f.v(bettingHomeViewModel, sVar, lVar, 0L);
                                            }
                                        }
                                    }
                                } else {
                                    C0590f c0590f9 = (C0590f) bettingAutoRenewOverlayActivity2.f27334c;
                                    if (c0590f9 != null) {
                                        IconicsCheckBox iconicsCheckBox2 = c0590f9.f8271d;
                                        String string = bettingAutoRenewOverlayActivity2.getString(f.qt_betting_please_agree_auto_renew);
                                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                                        CommonViewExtKt.showBalloon(iconicsCheckBox2, string, bettingAutoRenewOverlayActivity2, (2089452 & 4) != 0 ? iconicsCheckBox2 : null, (2089452 & 8) != 0 ? 80 : 48, (2089452 & 16) != 0, (2089452 & 32) != 0 ? 0.7f : 0.7f, (2089452 & 64) != 0 ? Integer.MIN_VALUE : 0, (2089452 & 128) != 0 ? Integer.MIN_VALUE : 0, (2089452 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? b.ppColorTextBase : 0, (2089452 & 512) != 0 ? 15.0f : 12.0f, (2089452 & 1024) != 0 ? G7.c.f3055b : null, (2089452 & 2048) != 0 ? 10 : 0, (2089452 & 4096) != 0 ? 0 : 0, (2089452 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 19 : 0, (2089452 & 16384) != 0, (32768 & 2089452) != 0 ? iconicsCheckBox2.getContext().getDrawable(r.cv_arrow_drop_up_black_12) : null, (65536 & 2089452) != 0 ? 5 : 0, (131072 & 2089452) != 0 ? 5 : 0, (262144 & 2089452) != 0 ? 8.0f : 0.0f, (524288 & 2089452) != 0 ? b.ppColorTextPrimary : b.ppColorTextPrimary, (2089452 & 1048576) != 0 ? G7.q.f3135a : null);
                                    }
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_TurnOnButton");
                                break;
                            }
                            break;
                        default:
                            int i16 = BettingAutoRenewOverlayActivity.f26654g;
                            if (!r0.U0()) {
                                BettingHomeViewModel bettingHomeViewModel2 = (BettingHomeViewModel) bettingAutoRenewOverlayActivity.l();
                                if (bettingHomeViewModel2 != null && BaseApplication.hasLogin()) {
                                    p140j8.f.v(bettingHomeViewModel2, new x9.t(1, null), bettingHomeViewModel2.f26782f, 0L);
                                }
                                n0.g().l("BettingResultPage_AutoNewPopUp_DontRemindMeButton");
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0590f c0590f7 = (C0590f) this.f27334c;
        if (c0590f7 != null && (motionLayout2 = c0590f7.f8268a) != null) {
            motionLayout2.setTransitionListener(new p282s9.b(this));
        }
        C0590f c0590f8 = (C0590f) this.f27334c;
        if (c0590f8 != null && (motionLayout = c0590f8.f8268a) != null) {
            motionLayout.setInteractionEnabled(false);
        }
        n0.g().v("BettingResultPage_AutoNewPopUp");
    }
}
