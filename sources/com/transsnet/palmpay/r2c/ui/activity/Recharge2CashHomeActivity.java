package com.transsnet.palmpay.r2c.ui.activity;

import C0.G;
import L6.b;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.d;
import Rd.C0607x;
import Wd.I;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.airtime.bean.R2CProductsResp;
import com.transsnet.palmpay.airtime.bean.req.R2CCreateOrderReq;
import com.transsnet.palmpay.airtime.bean.rsp.Recharge2CashProviderV2Rsp;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.r2c.ui.activity.Recharge2CashHomeActivity;
import com.transsnet.palmpay.r2c.viewmodel.Recharge2CashViewModel;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p010a9.m;
import p025ba.k;
import p054dd.e;
import p054dd.i;
import p140j8.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/airtime/recharge_2_cash")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/r2c/ui/activity/Recharge2CashHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/r2c/viewmodel/Recharge2CashViewModel;", "LRd/x;", "Lcom/transsnet/palmpay/custom_view/input/OnOperatorItemClickListener;", "Lcom/transsnet/palmpay/airtime/bean/rsp/Recharge2CashProviderV2Rsp;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecharge2CashHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recharge2CashHomeActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,608:1\n171#2,12:609\n215#2:621\n171#2,12:622\n215#2:634\n260#2,10:635\n296#2:645\n171#2,12:646\n215#2:658\n1#3:659\n1869#4,2:660\n*S KotlinDebug\n*F\n+ 1 Recharge2CashHomeActivity.kt\ncom/transsnet/palmpay/r2c/ui/activity/Recharge2CashHomeActivity\n*L\n166#1:609,12\n166#1:621\n174#1:622,12\n174#1:634\n223#1:635,10\n223#1:645\n234#1:646,12\n234#1:658\n586#1:660,2\n*E\n"})
public final class Recharge2CashHomeActivity extends BaseBillerActivity<Recharge2CashViewModel, C0607x> implements OnOperatorItemClickListener<Recharge2CashProviderV2Rsp> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ArrayList f33117v;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f33118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33119j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Recharge2CashProviderV2Rsp f33120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f33121p;
    public final t t = C2131j.b(new c(4));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f33117v = C1850q.e(TopupAirtimeActivity.class);
    }

    public static void r(Recharge2CashHomeActivity recharge2CashHomeActivity, R2CProductsResp r2CProductsResp, int i7) {
        String phoneNumber;
        Boolean bool = Boolean.FALSE;
        if ((i7 & 1) != 0) {
            r2CProductsResp = null;
        }
        if ((i7 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        try {
            C0607x c0607x = (C0607x) recharge2CashHomeActivity.f27334c;
            if (c0607x == null || (phoneNumber = c0607x.f8544d.getPhoneNumber()) == null) {
                phoneNumber = "";
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(phoneNumber)) {
            PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
            if (phoneBaseNumberUtils.isValidMobileNumber(phoneNumber, BaseApplication.getCountryLocale(), true)) {
                recharge2CashHomeActivity.f33119j = phoneBaseNumberUtils.getFullMobileNumber(phoneNumber, BaseApplication.getCountryLocale());
                C0607x c0607x2 = (C0607x) recharge2CashHomeActivity.f27334c;
                long longAmount = c0607x2 != null ? ((PpAmountEditText) c0607x2.f8543c.f700f).getLongAmount() : 0L;
                recharge2CashHomeActivity.f33118i = longAmount;
                Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = recharge2CashHomeActivity.f33120o;
                if (longAmount < (recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.minAmount : 0L)) {
                    String string = recharge2CashHomeActivity.getString(k.core_msg_amount_above_desc, r0.B(recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.minAmount : 0L, true));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    recharge2CashHomeActivity.s(string);
                    return;
                }
                if (longAmount > (recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.maxAmount : 0L)) {
                    String string2 = recharge2CashHomeActivity.getString(k.core_msg_amount_below_desc, r0.B(recharge2CashProviderV2Rsp != null ? recharge2CashProviderV2Rsp.maxAmount : 0L, true));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    recharge2CashHomeActivity.s(string2);
                    return;
                }
                recharge2CashHomeActivity.s("");
                Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp2 = recharge2CashHomeActivity.f33120o;
                if (recharge2CashProviderV2Rsp2 != null && recharge2CashProviderV2Rsp2.suspend) {
                    h.x(recharge2CashHomeActivity, "Many users selling airtime now, please try again later.");
                    return;
                }
                if (recharge2CashProviderV2Rsp2 != null) {
                    R2CCreateOrderReq req = new R2CCreateOrderReq();
                    Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp3 = recharge2CashHomeActivity.f33120o;
                    if (recharge2CashProviderV2Rsp3 != null) {
                        req.billerId = recharge2CashProviderV2Rsp3.billerId;
                        req.billerLogo = recharge2CashProviderV2Rsp3.billerIcon;
                        req.billerName = recharge2CashProviderV2Rsp3.billerName;
                    }
                    req.itemId = r2CProductsResp != null ? r2CProductsResp.itemId : null;
                    req.amount = recharge2CashHomeActivity.f33118i;
                    req.senderPhoneNo = recharge2CashHomeActivity.f33119j;
                    req.verifyNetwork = bool.booleanValue();
                    Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
                    recharge2CashViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    f.s(recharge2CashViewModel, new p085fd.f(req, null), recharge2CashViewModel.f33142f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                }
                return;
            }
        }
        C0607x c0607x3 = (C0607x) recharge2CashHomeActivity.f27334c;
        if (c0607x3 != null) {
            c0607x3.f8544d.setError("Please enter a 11 digit mobile number");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) l();
        l lVar = recharge2CashViewModel != null ? recharge2CashViewModel.f33144i : null;
        if (lVar != null) {
            lVar.e(this, new I(new e(this), 28));
        }
        l lVar2 = ((Recharge2CashViewModel) l()).f33142f;
        if (lVar2 != null) {
            lVar2.e(this, new I(new p054dd.f(this, this, 0), 28));
        }
        l lVar3 = ((Recharge2CashViewModel) l()).f33141e;
        if (lVar3 != null) {
            lVar3.e(this, new I(new p054dd.f(this, this, 1), 28));
        }
        l lVar4 = ((Recharge2CashViewModel) l()).f33143g;
        if (lVar4 != null) {
            lVar4.e(this, new I(new e(this, this), 28));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewM2;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_recharge_to_cash, (ViewGroup) null, false);
        int i7 = Pd.c.airtime_ad;
        if (((ModelBillNoticeItem) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = Pd.c.airtime_home_operator_msg;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null && (viewM = p059e1.a.m((i7 = Pd.c.amountListView), viewInflate)) != null) {
                int i10 = Pd.c.airtime_agree_tx;
                TextView textView2 = (TextView) p059e1.a.m(i10, viewM);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewM;
                    i10 = Pd.c.atuaPickAmountRcv;
                    RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewM);
                    if (recyclerView != null) {
                        i10 = Pd.c.barrier_pay;
                        if (((Barrier) p059e1.a.m(i10, viewM)) != null) {
                            i10 = Pd.c.inputAmount;
                            PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i10, viewM);
                            if (ppAmountEditText != null) {
                                i10 = Pd.c.sav_airtime_pocker_banner;
                                SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i10, viewM);
                                if (singleAdView != null) {
                                    i10 = Pd.c.space_ad_mid_bill;
                                    if (((Space) p059e1.a.m(i10, viewM)) != null) {
                                        i10 = Pd.c.tv_airtime_balance;
                                        TextView textView3 = (TextView) p059e1.a.m(i10, viewM);
                                        if (textView3 != null) {
                                            i10 = Pd.c.tv_airtime_pocker_banner_title;
                                            TextView textView4 = (TextView) p059e1.a.m(i10, viewM);
                                            if (textView4 != null && (viewM2 = p059e1.a.m((i10 = Pd.c.view_topup_bg), viewM)) != null) {
                                                Bc.f fVar = new Bc.f(constraintLayout, textView2, recyclerView, ppAmountEditText, singleAdView, textView3, textView4, viewM2, 13);
                                                i7 = Pd.c.atuaInputPhoneNumArea;
                                                ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) p059e1.a.m(i7, viewInflate);
                                                if (modelMobileWithIconInputLayout != null) {
                                                    i7 = Pd.c.clBody;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                                                    if (constraintLayout2 != null) {
                                                        i7 = Pd.c.ivR2CRules;
                                                        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                                        if (imageView != null) {
                                                            i7 = Pd.c.llAirtimeHomeOperator;
                                                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = Pd.c.titleBar;
                                                                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                if (ppTitleBar != null) {
                                                                    C0607x c0607x = new C0607x((LinearLayout) viewInflate, textView, fVar, modelMobileWithIconInputLayout, constraintLayout2, imageView, ppTitleBar);
                                                                    Intrinsics.checkNotNullExpressionValue(c0607x, "inflate(...)");
                                                                    return c0607x;
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
                throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        P0 p3 = new P0(this);
        C0607x c0607x = (C0607x) this.f27334c;
        p3.f13251f = c0607x != null ? c0607x.f8545e : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        X6.c listener = new X6.c(this, 29);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        AppCompatAutoCompleteTextView phoneNumberEdit2;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout3;
        AppCompatAutoCompleteTextView phoneNumberEdit3;
        super.onActivityResult(i7, i10, intent);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("PHONE_NUMBER");
        C0607x c0607x = (C0607x) this.f27334c;
        if (c0607x != null && (modelMobileWithIconInputLayout3 = c0607x.f8544d) != null && (phoneNumberEdit3 = modelMobileWithIconInputLayout3.getPhoneNumberEdit()) != null) {
            phoneNumberEdit3.setText(i0.j(stringExtra));
        }
        C0607x c0607x2 = (C0607x) this.f27334c;
        if (c0607x2 == null || (modelMobileWithIconInputLayout = c0607x2.f8544d) == null || (phoneNumberEdit = modelMobileWithIconInputLayout.getPhoneNumberEdit()) == null) {
            return;
        }
        C0607x c0607x3 = (C0607x) this.f27334c;
        phoneNumberEdit.setSelection(String.valueOf((c0607x3 == null || (modelMobileWithIconInputLayout2 = c0607x3.f8544d) == null || (phoneNumberEdit2 = modelMobileWithIconInputLayout2.getPhoneNumberEdit()) == null) ? null : phoneNumberEdit2.getText()).length());
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener
    public final void onOperatorItemClick(Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        Recharge2CashProviderV2Rsp t = recharge2CashProviderV2Rsp;
        Intrinsics.checkNotNullParameter(t, "t");
        this.f33120o = t;
        C0607x c0607x = (C0607x) this.f27334c;
        if (c0607x == null || (modelMobileWithIconInputLayout = c0607x.f8544d) == null) {
            return;
        }
        modelMobileWithIconInputLayout.updateSelectItem(t);
    }

    public final p069ed.a p() {
        return (p069ed.a) this.t.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) l();
        recharge2CashViewModel.getClass();
        f.s(recharge2CashViewModel, new p085fd.h(1, null), recharge2CashViewModel.f33141e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    public final void q(String str) {
        List list;
        Object next;
        String strY;
        C0607x c0607x;
        Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp = null;
        if (TextUtils.isEmpty(str)) {
            List list2 = this.f33121p;
            if (list2 != null) {
                recharge2CashProviderV2Rsp = (Recharge2CashProviderV2Rsp) list2.get(0);
            }
        } else {
            List list3 = this.f33121p;
            if (list3 != null) {
                Iterator it = list3.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.c(((Recharge2CashProviderV2Rsp) next).billerName, str));
                Recharge2CashProviderV2Rsp recharge2CashProviderV2Rsp2 = (Recharge2CashProviderV2Rsp) next;
                if (recharge2CashProviderV2Rsp2 == null) {
                    list = this.f33121p;
                    if (list != null) {
                        recharge2CashProviderV2Rsp = (Recharge2CashProviderV2Rsp) list.get(0);
                    }
                } else {
                    recharge2CashProviderV2Rsp = recharge2CashProviderV2Rsp2;
                }
            } else {
                list = this.f33121p;
                if (list != null) {
                    recharge2CashProviderV2Rsp = (Recharge2CashProviderV2Rsp) list.get(0);
                }
            }
        }
        this.f33120o = recharge2CashProviderV2Rsp;
        if (recharge2CashProviderV2Rsp != null) {
            C0607x c0607x2 = (C0607x) this.f27334c;
            if (c0607x2 != null) {
                c0607x2.f8544d.updateSelectItem(recharge2CashProviderV2Rsp);
            }
            String str2 = recharge2CashProviderV2Rsp.userIdTips;
            if (str2 != null && str2.length() > 0 && (c0607x = (C0607x) this.f27334c) != null) {
                c0607x.f8544d.setInputHint(str2);
            }
            String str3 = recharge2CashProviderV2Rsp.tips;
            if (TextUtils.isEmpty(str3)) {
                C0607x c0607x3 = (C0607x) this.f27334c;
                if (c0607x3 != null) {
                    c0607x3.f8542b.setVisibility(8);
                }
            } else {
                C0607x c0607x4 = (C0607x) this.f27334c;
                if (c0607x4 != null) {
                    c0607x4.f8542b.setText(str3);
                }
                C0607x c0607x5 = (C0607x) this.f27334c;
                if (c0607x5 != null) {
                    c0607x5.f8542b.setVisibility(0);
                }
            }
            C0607x c0607x6 = (C0607x) this.f27334c;
            if (c0607x6 != null) {
                PpAmountEditText ppAmountEditText = (PpAmountEditText) c0607x6.f8543c.f700f;
                if (TextUtils.isEmpty(recharge2CashProviderV2Rsp.amtTips)) {
                    strY = recharge2CashProviderV2Rsp.maxAmount > 0 ? q0.y(r0.B(recharge2CashProviderV2Rsp.minAmount, false), "-", r0.B(recharge2CashProviderV2Rsp.maxAmount, false)) : getString(Pd.f.qt_airtime_other_amount_ng);
                } else {
                    strY = recharge2CashProviderV2Rsp.amtTips;
                }
                ppAmountEditText.setHintText(strY);
            }
            p().setList(recharge2CashProviderV2Rsp.itemList);
        }
    }

    public final void s(String str) {
        Bc.f fVar;
        PpAmountEditText ppAmountEditText;
        if (!TextUtils.isEmpty(str)) {
            KeyboardUtils.hideSoftInput(this);
        }
        C0607x c0607x = (C0607x) this.f27334c;
        if (c0607x == null || (fVar = c0607x.f8543c) == null || (ppAmountEditText = (PpAmountEditText) fVar.f700f) == null) {
            return;
        }
        ppAmountEditText.setError(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView contactIv;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new m(this, 19));
        ARouter.getInstance().inject(this);
        C0607x c0607x = (C0607x) this.f27334c;
        if (c0607x != null) {
            c0607x.f8544d.setCanSuspend(true);
        }
        C0607x c0607x2 = (C0607x) this.f27334c;
        if (c0607x2 != null) {
            c0607x2.f8544d.setOperatorIconClickable(false);
        }
        C0607x c0607x3 = (C0607x) this.f27334c;
        if (c0607x3 != null && (contactIv = c0607x3.f8544d.getContactIv()) != null) {
            final int i7 = 3;
            contactIv.setOnClickListener(new View.OnClickListener(this) { // from class: dd.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashHomeActivity f35873b;

                {
                    this.f35873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35873b;
                    switch (i7) {
                        case 0:
                            Recharge2CashHomeActivity.r(recharge2CashHomeActivity, null, 3);
                            n0.g().l("RechargeToCashNewHomePage_SellButton");
                            break;
                        case 1:
                            ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                            recharge2CashHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
                                if (recharge2CashViewModel != null) {
                                    ArrayList transType = C1850q.e(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL);
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(recharge2CashViewModel), null, null, new p085fd.k(recharge2CashViewModel.f33144i, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("RechargeToCashNewHomePage_OrderIcon");
                            }
                            break;
                        default:
                            ArrayList arrayList3 = Recharge2CashHomeActivity.f33117v;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").navigation(recharge2CashHomeActivity, 1810);
                            n0.g().l("RechargeToCashNewHomePage_BeneficiariesIcon");
                            break;
                    }
                }
            });
        }
        C0607x c0607x4 = (C0607x) this.f27334c;
        if (c0607x4 != null) {
            c0607x4.f8544d.setOnNumberInputListener(new i(this));
        }
        C0607x c0607x5 = (C0607x) this.f27334c;
        if (c0607x5 != null) {
            ((PpAmountEditText) c0607x5.f8543c.f700f).setCurrencySymbol(BaseApplication.getCurrencySymbol());
        }
        C0607x c0607x6 = (C0607x) this.f27334c;
        if (c0607x6 != null) {
            ((PpAmountEditText) c0607x6.f8543c.f700f).setButtonText("Sell");
        }
        C0607x c0607x7 = (C0607x) this.f27334c;
        if (c0607x7 != null) {
            final int i10 = 0;
            ((PpAmountEditText) c0607x7.f8543c.f700f).setActionButtonListener(new View.OnClickListener(this) { // from class: dd.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashHomeActivity f35873b;

                {
                    this.f35873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35873b;
                    switch (i10) {
                        case 0:
                            Recharge2CashHomeActivity.r(recharge2CashHomeActivity, null, 3);
                            n0.g().l("RechargeToCashNewHomePage_SellButton");
                            break;
                        case 1:
                            ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                            recharge2CashHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
                                if (recharge2CashViewModel != null) {
                                    ArrayList transType = C1850q.e(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL);
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(recharge2CashViewModel), null, null, new p085fd.k(recharge2CashViewModel.f33144i, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("RechargeToCashNewHomePage_OrderIcon");
                            }
                            break;
                        default:
                            ArrayList arrayList3 = Recharge2CashHomeActivity.f33117v;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").navigation(recharge2CashHomeActivity, 1810);
                            n0.g().l("RechargeToCashNewHomePage_BeneficiariesIcon");
                            break;
                    }
                }
            });
        }
        C0607x c0607x8 = (C0607x) this.f27334c;
        if (c0607x8 != null) {
            ((PpAmountEditText) c0607x8.f8543c.f700f).setTextInputListener(new p054dd.c(this));
        }
        C0607x c0607x9 = (C0607x) this.f27334c;
        if (c0607x9 != null) {
            ((RecyclerView) c0607x9.f8543c.f699e).setLayoutManager(new GridLayoutManager(this, 3));
        }
        C0607x c0607x10 = (C0607x) this.f27334c;
        if (c0607x10 != null) {
            ((RecyclerView) c0607x10.f8543c.f699e).addItemDecoration(new p155k9.i());
        }
        C0607x c0607x11 = (C0607x) this.f27334c;
        if (c0607x11 != null) {
            ((RecyclerView) c0607x11.f8543c.f699e).setAdapter(p());
        }
        p().setOnItemClickListener(new p054dd.c(this));
        C0607x c0607x12 = (C0607x) this.f27334c;
        if (c0607x12 != null) {
            final int i11 = 1;
            c0607x12.f8547g.setBackButtonClickListener(new View.OnClickListener(this) { // from class: dd.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashHomeActivity f35873b;

                {
                    this.f35873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35873b;
                    switch (i11) {
                        case 0:
                            Recharge2CashHomeActivity.r(recharge2CashHomeActivity, null, 3);
                            n0.g().l("RechargeToCashNewHomePage_SellButton");
                            break;
                        case 1:
                            ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                            recharge2CashHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
                                if (recharge2CashViewModel != null) {
                                    ArrayList transType = C1850q.e(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL);
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(recharge2CashViewModel), null, null, new p085fd.k(recharge2CashViewModel.f33144i, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("RechargeToCashNewHomePage_OrderIcon");
                            }
                            break;
                        default:
                            ArrayList arrayList3 = Recharge2CashHomeActivity.f33117v;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").navigation(recharge2CashHomeActivity, 1810);
                            n0.g().l("RechargeToCashNewHomePage_BeneficiariesIcon");
                            break;
                    }
                }
            });
        }
        C0607x c0607x13 = (C0607x) this.f27334c;
        if (c0607x13 != null) {
            c0607x13.f8547g.setRightImageView2Icon(S6.a.pay_Question);
        }
        C0607x c0607x14 = (C0607x) this.f27334c;
        if (c0607x14 != null) {
            c0607x14.f8547g.setRightImageView2ClickListener(new p054dd.d(0));
        }
        C0607x c0607x15 = (C0607x) this.f27334c;
        if (c0607x15 != null) {
            c0607x15.f8547g.setRightImageView1Icon(S6.a.pay_TransactionHistory);
        }
        C0607x c0607x16 = (C0607x) this.f27334c;
        if (c0607x16 != null) {
            final int i12 = 2;
            c0607x16.f8547g.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: dd.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Recharge2CashHomeActivity f35873b;

                {
                    this.f35873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Recharge2CashHomeActivity recharge2CashHomeActivity = this.f35873b;
                    switch (i12) {
                        case 0:
                            Recharge2CashHomeActivity.r(recharge2CashHomeActivity, null, 3);
                            n0.g().l("RechargeToCashNewHomePage_SellButton");
                            break;
                        case 1:
                            ArrayList arrayList = Recharge2CashHomeActivity.f33117v;
                            recharge2CashHomeActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            ArrayList arrayList2 = Recharge2CashHomeActivity.f33117v;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                Recharge2CashViewModel recharge2CashViewModel = (Recharge2CashViewModel) recharge2CashHomeActivity.l();
                                if (recharge2CashViewModel != null) {
                                    ArrayList transType = C1850q.e(TransType.TRANS_TYPE_ONELOOP_AIRTIME_SELL);
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(recharge2CashViewModel), null, null, new p085fd.k(recharge2CashViewModel.f33144i, G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("RechargeToCashNewHomePage_OrderIcon");
                            }
                            break;
                        default:
                            ArrayList arrayList3 = Recharge2CashHomeActivity.f33117v;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").navigation(recharge2CashHomeActivity, 1810);
                            n0.g().l("RechargeToCashNewHomePage_BeneficiariesIcon");
                            break;
                    }
                }
            });
        }
        C0607x c0607x17 = (C0607x) this.f27334c;
        if (c0607x17 != null) {
            ((TextView) c0607x17.f8543c.f698d).setText(new SpanUtils().append(getString(Pd.f.qt_airtime_str_recharge2cash_agree1)).append(getString(Pd.f.qt_airtime_str_recharge2cash_agree2)).setForegroundColor(CommonViewExtKt.colorInt(b.ppColorPrimary, this)).append(getString(Pd.f.qt_airtime_str_recharge2cash_agree3)).create());
        }
        C0607x c0607x18 = (C0607x) this.f27334c;
        if (c0607x18 != null) {
            ((TextView) c0607x18.f8543c.f698d).setOnClickListener(new p054dd.d(1));
        }
        String string = getString(Pd.f.ad_r2c_home_pop_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView interstitialAdView = new InterstitialAdView(string, null);
        interstitialAdView.setInterstitialListener(new Ab.k(17));
        Intrinsics.checkNotNullParameter(this, "<this>");
        InterstitialAdView.show$default(interstitialAdView, this, null, 2, null);
        C0607x c0607x19 = (C0607x) this.f27334c;
        if (c0607x19 != null) {
            SingleAdView singleAdView = (SingleAdView) c0607x19.f8543c.f701g;
            singleAdView.setSlotId(getString(Pd.f.ad_r2c_home_banner_slot_id));
            singleAdView.setAdListener(new Ab.k(18));
        }
    }
}
