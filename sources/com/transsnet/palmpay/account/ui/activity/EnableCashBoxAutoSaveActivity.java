package com.transsnet.palmpay.account.ui.activity;

import Ab.C;
import Bc.D;
import F8.c;
import F8.d;
import F8.e;
import Fd.G;
import N8.C0460d;
import N8.C0461e;
import N8.C0462f;
import N8.ViewOnClickListenerC0458b;
import Pa.F;
import Pa.i0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.uimanager.ViewProps;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.EnableCashBoxAutoSaveActivity;
import com.transsnet.palmpay.account.ui.viewmodel.CashBoxAutoSaveViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import p071ef.b;
import p097g9.C1711i;
import p097g9.C1712j;
import p140j8.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/enableAutoSave")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/EnableCashBoxAutoSaveActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/CashBoxAutoSaveViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnableCashBoxAutoSaveActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnableCashBoxAutoSaveActivity.kt\ncom/transsnet/palmpay/account/ui/activity/EnableCashBoxAutoSaveActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,331:1\n115#2,8:332\n145#2:340\n115#2,8:341\n145#2:349\n115#2,8:350\n145#2:358\n*S KotlinDebug\n*F\n+ 1 EnableCashBoxAutoSaveActivity.kt\ncom/transsnet/palmpay/account/ui/activity/EnableCashBoxAutoSaveActivity\n*L\n172#1:332,8\n172#1:340\n188#1:341,8\n188#1:349\n201#1:350,8\n201#1:358\n*E\n"})
public final class EnableCashBoxAutoSaveActivity extends BaseMvvmActivity<CashBoxAutoSaveViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f25851j = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D f25852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25855f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f25856g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f25857i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @Nullable String str, @Nullable String str2) {
            try {
                Intent intent = new Intent(context, (Class<?>) EnableCashBoxAutoSaveActivity.class);
                intent.putExtra("extra_path", str);
                intent.putExtra("extra_data", str2);
                if (context != null) {
                    context.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }

        private a() {
        }
    }

    public EnableCashBoxAutoSaveActivity() {
        final int i7 = 0;
        this.f25856g = C2131j.b(new Function0(this) { // from class: N8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableCashBoxAutoSaveActivity f6199b;

            {
                this.f6199b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = this.f6199b;
                switch (i7) {
                    case 0:
                        EnableCashBoxAutoSaveActivity.a aVar = EnableCashBoxAutoSaveActivity.f25851j;
                        return new C0461e(F8.d.ac_view_tag1, enableCashBoxAutoSaveActivity);
                    default:
                        EnableCashBoxAutoSaveActivity.a aVar2 = EnableCashBoxAutoSaveActivity.f25851j;
                        return new C0462f(F8.d.ac_view_tag2, enableCashBoxAutoSaveActivity);
                }
            }
        });
        final int i10 = 1;
        this.f25857i = C2131j.b(new Function0(this) { // from class: N8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnableCashBoxAutoSaveActivity f6199b;

            {
                this.f6199b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EnableCashBoxAutoSaveActivity enableCashBoxAutoSaveActivity = this.f6199b;
                switch (i10) {
                    case 0:
                        EnableCashBoxAutoSaveActivity.a aVar = EnableCashBoxAutoSaveActivity.f25851j;
                        return new C0461e(F8.d.ac_view_tag1, enableCashBoxAutoSaveActivity);
                    default:
                        EnableCashBoxAutoSaveActivity.a aVar2 = EnableCashBoxAutoSaveActivity.f25851j;
                        return new C0462f(F8.d.ac_view_tag2, enableCashBoxAutoSaveActivity);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        D d2 = this.f25852c;
        if (d2 != null) {
            ((TextView) d2.f627w).setOnClickListener(new ViewOnClickListenerC0458b(this, 0));
        }
        D d10 = this.f25852c;
        if (d10 != null) {
            ((PpButton) d10.f625p).setOnClickListener(new ViewOnClickListenerC0458b(this, 1));
        }
        u.a(getOnBackPressedDispatcher(), this, new C(this, 29));
        BaseApplication.get().getUserDataSource().a().i(b.a()).subscribe(new Ab.D(this, 19));
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this);
        D d11 = this.f25852c;
        if (d11 != null) {
            d11.f621g.setMovementMethod(LinkMovementMethod.getInstance());
        }
        D d12 = this.f25852c;
        if (d12 != null) {
            d12.f621g.setText(new SpanUtils().append("By clicking 'Continue', you confirm you've read and agree to the ").append("Terms & Conditions").setForegroundColor(iColorInt).setBackgroundColor(0).setClickSpan((C0461e) this.f25856g.getValue()).appendSpace(SizeUtils.dp2px(2.0f)).append("and").appendSpace(SizeUtils.dp2px(2.0f)).append("Privacy Policy").setForegroundColor(iColorInt).setBackgroundColor(0).setClickSpan((C0462f) this.f25857i.getValue()).create());
        }
        CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel = (CashBoxAutoSaveViewModel) l();
        l lVar = cashBoxAutoSaveViewModel != null ? cashBoxAutoSaveViewModel.f26414e : null;
        if (lVar != null) {
            lVar.e(this, new G(new C0460d(this, 0), 7));
        }
        CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel2 = (CashBoxAutoSaveViewModel) l();
        l lVar2 = cashBoxAutoSaveViewModel2 != null ? cashBoxAutoSaveViewModel2.f26415f : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0460d(this, 1), 7));
        }
        CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel3 = (CashBoxAutoSaveViewModel) l();
        l lVar3 = cashBoxAutoSaveViewModel3 != null ? cashBoxAutoSaveViewModel3.f26416g : null;
        if (lVar3 != null) {
            lVar3.e(this, new G(new C0460d(this, 2), 7));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_enable_cashbox_autosave, (ViewGroup) null, false);
        int i7 = d.btnConfirm;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = d.cslEarn;
            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
            if (constraintLayout != null) {
                i7 = d.ivChooseNo;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = d.ivChooseYes;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView2 != null) {
                        i7 = d.layoutEstimatedInterestReturnList;
                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout != null) {
                            i7 = d.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = d.tv1;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = d.tv2;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = d.tvAgreement;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = d.tvCashbox;
                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = d.tvEarnTitle;
                                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = d.tv_left;
                                                    if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = d.tv_middle;
                                                        if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                            i7 = d.tv_right;
                                                            if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = d.tvSkip;
                                                                TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView6 != null) {
                                                                    i7 = d.tvTitle;
                                                                    TextView textView7 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView7 != null && (viewM = p059e1.a.m((i7 = d.viewBottom), viewInflate)) != null) {
                                                                        Pb.a.bind(viewM);
                                                                        D d2 = new D((ConstraintLayout) viewInflate, ppButton, constraintLayout, imageView, imageView2, linearLayout, ppTitleBar, textView, textView2, textView3, textView4, textView5, textView6, textView7);
                                                                        this.f25852c = d2;
                                                                        return d2;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m(TextView textView) {
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorPrimary, this);
        int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, this);
        D d2 = this.f25852c;
        if (d2 != null) {
            TextView textView2 = d2.f619e;
            textView2.setBackgroundResource(r.cv_rect_corner_8_bg_f6f6fa);
            D d10 = this.f25852c;
            if (d10 != null) {
                d10.f620f.setBackgroundResource(r.cv_rect_corner_8_bg_f6f6fa);
            }
            D d11 = this.f25852c;
            if (d11 != null) {
                d11.f619e.setTextColor(iColorInt2);
            }
            D d12 = this.f25852c;
            if (d12 != null) {
                d12.f620f.setTextColor(iColorInt2);
            }
            D d13 = this.f25852c;
            if (d13 != null) {
                ((ImageView) d13.f617c).setVisibility(8);
            }
            D d14 = this.f25852c;
            if (d14 != null) {
                ((ImageView) d14.f616b).setVisibility(8);
            }
            if (textView.equals(textView2)) {
                textView2.setBackgroundResource(c.ac_rect_corner_8_6534f9_foecfc);
                ((ImageView) d2.f617c).setVisibility(0);
                textView2.setTextColor(iColorInt);
            } else {
                TextView textView3 = d2.f620f;
                if (textView.equals(textView3)) {
                    textView3.setBackgroundResource(c.ac_rect_corner_8_6534f9_foecfc);
                    ((ImageView) d2.f616b).setVisibility(0);
                    textView3.setTextColor(iColorInt);
                }
            }
        }
    }

    public final void n(String str) {
        if (!TextUtils.isEmpty(str) && i0.W(this)) {
            AccountActivateSuccessActivity.f25810a.launch(this, this.f25853d, str);
            return;
        }
        if (TextUtils.isEmpty(this.f25853d)) {
            i0.H(null);
            finish();
            return;
        }
        Intent intentA = F.a(this, this.f25853d);
        if (intentA == null) {
            i0.H(null);
        } else {
            ActivityUtils.startActivity(intentA);
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        if (v3 != null && v3.getId() == d.ac_view_tag1) {
            i0.b0("/#/protocol/partner/agreement?version=cashbox-terms-and-conditions&title=CashBox%20Terms%20%26%20Conditions&ignoreRouter");
        } else {
            if (v3 == null || v3.getId() != d.ac_view_tag2) {
                return;
            }
            i0.b0("/#/protocol/partner/agreement?version=BMFB-Privacy-Policy&title=Privacy%20Policy&ignoreRouter");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel = (CashBoxAutoSaveViewModel) l();
        if (cashBoxAutoSaveViewModel != null) {
            f.s(cashBoxAutoSaveViewModel, new C1712j(1, null), cashBoxAutoSaveViewModel.f26414e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CashBoxAutoSaveViewModel cashBoxAutoSaveViewModel2 = (CashBoxAutoSaveViewModel) l();
        if (cashBoxAutoSaveViewModel2 != null) {
            f.s(cashBoxAutoSaveViewModel2, new C1711i(1, null), cashBoxAutoSaveViewModel2.f26415f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f25853d = getQueryParameter("extra_path");
        this.f25854e = getQueryParameter("extra_data");
        D d2 = this.f25852c;
        if (d2 != null) {
            ((PpTitleBar) d2.f626v).setRightImageView2Icon(S6.a.pay_CustomerService);
        }
        D d10 = this.f25852c;
        if (d10 != null) {
            ((PpTitleBar) d10.f626v).setRightImageView2ClickListener(new K8.a(8));
        }
        D d11 = this.f25852c;
        if (d11 != null) {
            ((PpTitleBar) d11.f626v).setBackButtonClickListener(new ViewOnClickListenerC0458b(this, 2));
        }
        D d12 = this.f25852c;
        if (d12 != null) {
            d12.f619e.setOnClickListener(new ViewOnClickListenerC0458b(this, 3));
        }
        D d13 = this.f25852c;
        if (d13 != null) {
            d13.f620f.setOnClickListener(new ViewOnClickListenerC0458b(this, 4));
        }
    }
}
