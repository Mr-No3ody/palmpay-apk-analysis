package com.transsnet.palmpay.airtime.ui;

import C0.G;
import L6.b;
import Pa.j0;
import Pa.n0;
import Pa.r0;
import Pd.d;
import Pd.f;
import Rd.C0587c;
import S6.a;
import V8.w;
import Wf.AbstractC0780y;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.ui.USSDTopUpHomeActivity;
import com.transsnet.palmpay.airtime.viewmodel.USSDTopUpViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.m0;
import p141j9.C1794b;
import p141j9.C1798f;
import p141j9.s;
import p155k9.i;
import p155k9.r;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/airtime/ussd_top_up_route_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/USSDTopUpHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/USSDTopUpViewModel;", "LRd/c;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUSSDTopUpHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USSDTopUpHomeActivity.kt\ncom/transsnet/palmpay/airtime/ui/USSDTopUpHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,271:1\n115#2,8:272\n145#2:280\n*S KotlinDebug\n*F\n+ 1 USSDTopUpHomeActivity.kt\ncom/transsnet/palmpay/airtime/ui/USSDTopUpHomeActivity\n*L\n247#1:272,8\n247#1:280\n*E\n"})
public final class USSDTopUpHomeActivity extends BaseMvvmVBActivity<USSDTopUpViewModel, C0587c> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f26542o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26543d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f26544e = C1850q.e(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT), 50000L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26545f = C2131j.b(new c(23));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26546g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26547i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26548j;

    public USSDTopUpHomeActivity() {
        final int i7 = 0;
        this.f26547i = C2131j.b(new Function0(this) { // from class: j9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDTopUpHomeActivity f38389b;

            {
                this.f38389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i10 = USSDTopUpHomeActivity.f26542o;
                        a aVar = a.pay_SelectedFill;
                        int i11 = b.ppColorPrimary;
                        USSDTopUpHomeActivity uSSDTopUpHomeActivity = this.f38389b;
                        return G8.a.x(uSSDTopUpHomeActivity, aVar, Integer.valueOf(CommonViewExtKt.colorInt(i11, uSSDTopUpHomeActivity)), null, 20.0f, 116);
                    default:
                        int i12 = USSDTopUpHomeActivity.f26542o;
                        a aVar2 = a.pay_CircleOutline;
                        int i13 = b.ppColorTextAssist;
                        USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38389b;
                        return G8.a.x(uSSDTopUpHomeActivity2, aVar2, Integer.valueOf(CommonViewExtKt.colorInt(i13, uSSDTopUpHomeActivity2)), null, 20.0f, 116);
                }
            }
        });
        final int i10 = 1;
        this.f26548j = C2131j.b(new Function0(this) { // from class: j9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ USSDTopUpHomeActivity f38389b;

            {
                this.f38389b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i11 = USSDTopUpHomeActivity.f26542o;
                        a aVar = a.pay_SelectedFill;
                        int i12 = b.ppColorPrimary;
                        USSDTopUpHomeActivity uSSDTopUpHomeActivity = this.f38389b;
                        return G8.a.x(uSSDTopUpHomeActivity, aVar, Integer.valueOf(CommonViewExtKt.colorInt(i12, uSSDTopUpHomeActivity)), null, 20.0f, 116);
                    default:
                        int i13 = USSDTopUpHomeActivity.f26542o;
                        a aVar2 = a.pay_CircleOutline;
                        int i14 = b.ppColorTextAssist;
                        USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38389b;
                        return G8.a.x(uSSDTopUpHomeActivity2, aVar2, Integer.valueOf(CommonViewExtKt.colorInt(i14, uSSDTopUpHomeActivity2)), null, 20.0f, 116);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        USSDTopUpViewModel uSSDTopUpViewModel = (USSDTopUpViewModel) l();
        String transType = this.f26546g;
        if (transType == null) {
            transType = "";
        }
        uSSDTopUpViewModel.getClass();
        Intrinsics.checkNotNullParameter(transType, "transType");
        AbstractC0780y.m(V.h(uSSDTopUpViewModel), null, null, new m0(uSSDTopUpViewModel.f26650e, G.p("Pref_", "queryBillerUSSDInfo_".concat(transType), "_", BaseApplication.getCountryLocale()), null, transType), 3);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_airtime_ussd_top_up, (ViewGroup) null, false);
        int i7 = Pd.c.amountLayout;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = Pd.c.amountRy;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
            if (recyclerView != null) {
                i7 = Pd.c.dialTv;
                PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton != null) {
                    i7 = Pd.c.etMobileNumber;
                    ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) p059e1.a.m(i7, viewInflate);
                    if (modelMobileWithIconInputLayout != null) {
                        i7 = Pd.c.inputAmount;
                        PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                        if (ppAmountEditText != null) {
                            i7 = Pd.c.inputLayout;
                            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout2 != null) {
                                i7 = Pd.c.otherNumberIv;
                                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                if (imageView != null) {
                                    i7 = Pd.c.otherNumberLayout;
                                    LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout3 != null) {
                                        i7 = Pd.c.selfNumberIv;
                                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                        if (imageView2 != null) {
                                            i7 = Pd.c.selfNumberLayout;
                                            LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout4 != null) {
                                                i7 = Pd.c.tipsTv;
                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView != null) {
                                                    i7 = Pd.c.titleBar;
                                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                    if (ppTitleBar != null) {
                                                        i7 = Pd.c.tv_airtime_pocker_banner_title;
                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView2 != null) {
                                                            C0587c c0587c = new C0587c((LinearLayout) viewInflate, linearLayout, recyclerView, ppButton, modelMobileWithIconInputLayout, ppAmountEditText, linearLayout2, imageView, linearLayout3, imageView2, linearLayout4, textView, ppTitleBar, textView2);
                                                            Intrinsics.checkNotNullExpressionValue(c0587c, "inflate(...)");
                                                            return c0587c;
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

    public final r n() {
        return (r) this.f26545f.getValue();
    }

    public final void o(int i7) {
        if (this.f26543d == i7) {
            return;
        }
        this.f26543d = i7;
        t tVar = this.f26548j;
        t tVar2 = this.f26547i;
        if (i7 == 0) {
            C0587c c0587c = (C0587c) this.f27334c;
            if (c0587c != null) {
                c0587c.f8222o.setImageDrawable((Drawable) tVar2.getValue());
            }
            C0587c c0587c2 = (C0587c) this.f27334c;
            if (c0587c2 != null) {
                c0587c2.f8220i.setImageDrawable((Drawable) tVar.getValue());
            }
        } else {
            C0587c c0587c3 = (C0587c) this.f27334c;
            if (c0587c3 != null) {
                c0587c3.f8220i.setImageDrawable((Drawable) tVar2.getValue());
            }
            C0587c c0587c4 = (C0587c) this.f27334c;
            if (c0587c4 != null) {
                c0587c4.f8222o.setImageDrawable((Drawable) tVar.getValue());
            }
        }
        C0587c c0587c5 = (C0587c) this.f27334c;
        if (c0587c5 != null) {
            h.s(c0587c5.f8219g, i7 == 1);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((USSDTopUpViewModel) l()).f26650e;
        if (lVar != null) {
            lVar.e(this, new s(new w(this, 15)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        String string;
        USSDTopUpHomeActivity uSSDTopUpHomeActivity;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 4));
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), !isDarkMode());
        if ("04".equals(this.f26546g)) {
            string = getString(f.qt_top_up_airtime_via_ussd);
        } else {
            string = TransType.TRANS_TYPE_BUNDLE.equals(this.f26546g) ? getString(f.qt_buy_data_via_ussd) : "";
        }
        Intrinsics.e(string);
        C0587c c0587c = (C0587c) this.f27334c;
        if (c0587c != null) {
            c0587c.f8224v.setTitle(string);
        }
        if ("04".equals(this.f26546g)) {
            C0587c c0587c2 = (C0587c) this.f27334c;
            if (c0587c2 != null) {
                h.s(c0587c2.f8214b, true);
            }
            C0587c c0587c3 = (C0587c) this.f27334c;
            if (c0587c3 != null) {
                c0587c3.f8215c.setLayoutManager(new GridLayoutManager(this, 3));
            }
            C0587c c0587c4 = (C0587c) this.f27334c;
            if (c0587c4 != null) {
                c0587c4.f8215c.addItemDecoration(new i());
            }
            C0587c c0587c5 = (C0587c) this.f27334c;
            if (c0587c5 != null) {
                c0587c5.f8215c.setAdapter(n());
            }
            n().setList(this.f26544e);
            n().setOnItemClickListener(new C1794b(this, 4));
        } else {
            C0587c c0587c6 = (C0587c) this.f27334c;
            if (c0587c6 != null) {
                h.s(c0587c6.f8214b, false);
            }
        }
        C0587c c0587c7 = (C0587c) this.f27334c;
        if (c0587c7 != null) {
            uSSDTopUpHomeActivity = this;
            ModelMobileWithIconInputLayout.initModelMobileInputLayout$default(c0587c7.f8217e, uSSDTopUpHomeActivity, null, null, BaseApplication.getCountryLocale(), null, null, null, isDarkMode(), 118, null);
        } else {
            uSSDTopUpHomeActivity = this;
        }
        C0587c c0587c8 = (C0587c) uSSDTopUpHomeActivity.f27334c;
        if (c0587c8 != null && (phoneNumberEdit = c0587c8.f8217e.getPhoneNumberEdit()) != null) {
            phoneNumberEdit.setTextSize(16.0f);
        }
        C0587c c0587c9 = (C0587c) uSSDTopUpHomeActivity.f27334c;
        if (c0587c9 != null) {
            final int i7 = 2;
            c0587c9.f8223p.setOnClickListener(new View.OnClickListener(this) { // from class: j9.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ USSDTopUpHomeActivity f38387b;

                {
                    this.f38387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38387b;
                    switch (i7) {
                        case 0:
                            int i10 = USSDTopUpHomeActivity.f26542o;
                            uSSDTopUpHomeActivity2.getOnBackPressedDispatcher().d();
                            break;
                        case 1:
                            boolean zC = Intrinsics.c(uSSDTopUpHomeActivity2.f26546g, "04");
                            long longAmount = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                            if (zC) {
                                C0587c c0587c10 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                if ((c0587c10 != null ? c0587c10.f8218f.getLongAmount() : 0L) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                                    C0587c c0587c11 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c11 != null) {
                                        c0587c11.f8218f.setError(uSSDTopUpHomeActivity2.getString(f.qt_msg_enter_amount_tip));
                                    }
                                }
                            }
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                C0587c c0587c12 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String phoneNumber = c0587c12 != null ? c0587c12.f8217e.getPhoneNumber() : null;
                                if (phoneNumber == null || phoneNumber.length() == 0) {
                                    C0587c c0587c13 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c13 != null) {
                                        c0587c13.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                    }
                                } else {
                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                    C0587c c0587c14 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (!phoneBaseNumberUtils.isValidMobileNumber(c0587c14 != null ? c0587c14.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale(), true)) {
                                        C0587c c0587c15 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                        if (c0587c15 != null) {
                                            c0587c15.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                        }
                                    }
                                }
                            }
                            Intent intent = new Intent("android.intent.action.DIAL");
                            String str = "";
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                PhoneBaseNumberUtils phoneBaseNumberUtils2 = PhoneBaseNumberUtils.INSTANCE;
                                C0587c c0587c16 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String validMobileNumber = phoneBaseNumberUtils2.getValidMobileNumber(c0587c16 != null ? c0587c16.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale());
                                if (validMobileNumber != null) {
                                    str = validMobileNumber;
                                }
                            }
                            C0587c c0587c17 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                            if (c0587c17 != null) {
                                longAmount = c0587c17.f8218f.getLongAmount();
                            }
                            intent.setData(Uri.parse("tel:" + Uri.encode(j0.a(longAmount / ((long) 100), uSSDTopUpHomeActivity2.f26546g, str))));
                            ActivityUtils.startActivity(intent);
                            n0.g().l("04".equals(uSSDTopUpHomeActivity2.f26546g) ? "Airtime_USSD_Page_Dail_Button" : "Data_USSD_Page_Dail_Button");
                            break;
                        case 2:
                            int i11 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(0);
                                break;
                            }
                            break;
                        default:
                            int i12 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0587c c0587c10 = (C0587c) uSSDTopUpHomeActivity.f27334c;
        if (c0587c10 != null) {
            final int i10 = 3;
            c0587c10.f8221j.setOnClickListener(new View.OnClickListener(this) { // from class: j9.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ USSDTopUpHomeActivity f38387b;

                {
                    this.f38387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38387b;
                    switch (i10) {
                        case 0:
                            int i11 = USSDTopUpHomeActivity.f26542o;
                            uSSDTopUpHomeActivity2.getOnBackPressedDispatcher().d();
                            break;
                        case 1:
                            boolean zC = Intrinsics.c(uSSDTopUpHomeActivity2.f26546g, "04");
                            long longAmount = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                            if (zC) {
                                C0587c c0587c11 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                if ((c0587c11 != null ? c0587c11.f8218f.getLongAmount() : 0L) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                                    C0587c c0587c12 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c12 != null) {
                                        c0587c12.f8218f.setError(uSSDTopUpHomeActivity2.getString(f.qt_msg_enter_amount_tip));
                                    }
                                }
                            }
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                C0587c c0587c13 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String phoneNumber = c0587c13 != null ? c0587c13.f8217e.getPhoneNumber() : null;
                                if (phoneNumber == null || phoneNumber.length() == 0) {
                                    C0587c c0587c14 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c14 != null) {
                                        c0587c14.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                    }
                                } else {
                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                    C0587c c0587c15 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (!phoneBaseNumberUtils.isValidMobileNumber(c0587c15 != null ? c0587c15.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale(), true)) {
                                        C0587c c0587c16 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                        if (c0587c16 != null) {
                                            c0587c16.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                        }
                                    }
                                }
                            }
                            Intent intent = new Intent("android.intent.action.DIAL");
                            String str = "";
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                PhoneBaseNumberUtils phoneBaseNumberUtils2 = PhoneBaseNumberUtils.INSTANCE;
                                C0587c c0587c17 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String validMobileNumber = phoneBaseNumberUtils2.getValidMobileNumber(c0587c17 != null ? c0587c17.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale());
                                if (validMobileNumber != null) {
                                    str = validMobileNumber;
                                }
                            }
                            C0587c c0587c18 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                            if (c0587c18 != null) {
                                longAmount = c0587c18.f8218f.getLongAmount();
                            }
                            intent.setData(Uri.parse("tel:" + Uri.encode(j0.a(longAmount / ((long) 100), uSSDTopUpHomeActivity2.f26546g, str))));
                            ActivityUtils.startActivity(intent);
                            n0.g().l("04".equals(uSSDTopUpHomeActivity2.f26546g) ? "Airtime_USSD_Page_Dail_Button" : "Data_USSD_Page_Dail_Button");
                            break;
                        case 2:
                            int i12 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(0);
                                break;
                            }
                            break;
                        default:
                            int i13 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        o(0);
        C0587c c0587c11 = (C0587c) uSSDTopUpHomeActivity.f27334c;
        if (c0587c11 != null) {
            final int i11 = 0;
            c0587c11.f8224v.setBackButtonClickListener(new View.OnClickListener(this) { // from class: j9.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ USSDTopUpHomeActivity f38387b;

                {
                    this.f38387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38387b;
                    switch (i11) {
                        case 0:
                            int i12 = USSDTopUpHomeActivity.f26542o;
                            uSSDTopUpHomeActivity2.getOnBackPressedDispatcher().d();
                            break;
                        case 1:
                            boolean zC = Intrinsics.c(uSSDTopUpHomeActivity2.f26546g, "04");
                            long longAmount = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                            if (zC) {
                                C0587c c0587c12 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                if ((c0587c12 != null ? c0587c12.f8218f.getLongAmount() : 0L) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                                    C0587c c0587c13 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c13 != null) {
                                        c0587c13.f8218f.setError(uSSDTopUpHomeActivity2.getString(f.qt_msg_enter_amount_tip));
                                    }
                                }
                            }
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                C0587c c0587c14 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String phoneNumber = c0587c14 != null ? c0587c14.f8217e.getPhoneNumber() : null;
                                if (phoneNumber == null || phoneNumber.length() == 0) {
                                    C0587c c0587c15 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c15 != null) {
                                        c0587c15.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                    }
                                } else {
                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                    C0587c c0587c16 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (!phoneBaseNumberUtils.isValidMobileNumber(c0587c16 != null ? c0587c16.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale(), true)) {
                                        C0587c c0587c17 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                        if (c0587c17 != null) {
                                            c0587c17.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                        }
                                    }
                                }
                            }
                            Intent intent = new Intent("android.intent.action.DIAL");
                            String str = "";
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                PhoneBaseNumberUtils phoneBaseNumberUtils2 = PhoneBaseNumberUtils.INSTANCE;
                                C0587c c0587c18 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String validMobileNumber = phoneBaseNumberUtils2.getValidMobileNumber(c0587c18 != null ? c0587c18.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale());
                                if (validMobileNumber != null) {
                                    str = validMobileNumber;
                                }
                            }
                            C0587c c0587c19 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                            if (c0587c19 != null) {
                                longAmount = c0587c19.f8218f.getLongAmount();
                            }
                            intent.setData(Uri.parse("tel:" + Uri.encode(j0.a(longAmount / ((long) 100), uSSDTopUpHomeActivity2.f26546g, str))));
                            ActivityUtils.startActivity(intent);
                            n0.g().l("04".equals(uSSDTopUpHomeActivity2.f26546g) ? "Airtime_USSD_Page_Dail_Button" : "Data_USSD_Page_Dail_Button");
                            break;
                        case 2:
                            int i13 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(0);
                                break;
                            }
                            break;
                        default:
                            int i14 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        C0587c c0587c12 = (C0587c) uSSDTopUpHomeActivity.f27334c;
        if (c0587c12 != null) {
            final int i12 = 1;
            c0587c12.f8216d.setOnClickListener(new View.OnClickListener(this) { // from class: j9.O

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ USSDTopUpHomeActivity f38387b;

                {
                    this.f38387b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    USSDTopUpHomeActivity uSSDTopUpHomeActivity2 = this.f38387b;
                    switch (i12) {
                        case 0:
                            int i13 = USSDTopUpHomeActivity.f26542o;
                            uSSDTopUpHomeActivity2.getOnBackPressedDispatcher().d();
                            break;
                        case 1:
                            boolean zC = Intrinsics.c(uSSDTopUpHomeActivity2.f26546g, "04");
                            long longAmount = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                            if (zC) {
                                C0587c c0587c13 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                if ((c0587c13 != null ? c0587c13.f8218f.getLongAmount() : 0L) < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                                    C0587c c0587c14 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c14 != null) {
                                        c0587c14.f8218f.setError(uSSDTopUpHomeActivity2.getString(f.qt_msg_enter_amount_tip));
                                    }
                                }
                            }
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                C0587c c0587c15 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String phoneNumber = c0587c15 != null ? c0587c15.f8217e.getPhoneNumber() : null;
                                if (phoneNumber == null || phoneNumber.length() == 0) {
                                    C0587c c0587c16 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (c0587c16 != null) {
                                        c0587c16.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                    }
                                } else {
                                    PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                    C0587c c0587c17 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                    if (!phoneBaseNumberUtils.isValidMobileNumber(c0587c17 != null ? c0587c17.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale(), true)) {
                                        C0587c c0587c18 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                        if (c0587c18 != null) {
                                            c0587c18.f8217e.setError(uSSDTopUpHomeActivity2.getString(v.cv_msg_enter_recipient_mobile_number));
                                        }
                                    }
                                }
                            }
                            Intent intent = new Intent("android.intent.action.DIAL");
                            String str = "";
                            if (uSSDTopUpHomeActivity2.f26543d != 0) {
                                PhoneBaseNumberUtils phoneBaseNumberUtils2 = PhoneBaseNumberUtils.INSTANCE;
                                C0587c c0587c19 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                                String validMobileNumber = phoneBaseNumberUtils2.getValidMobileNumber(c0587c19 != null ? c0587c19.f8217e.getPhoneNumber() : null, BaseApplication.getCountryLocale());
                                if (validMobileNumber != null) {
                                    str = validMobileNumber;
                                }
                            }
                            C0587c c0587c110 = (C0587c) uSSDTopUpHomeActivity2.f27334c;
                            if (c0587c110 != null) {
                                longAmount = c0587c110.f8218f.getLongAmount();
                            }
                            intent.setData(Uri.parse("tel:" + Uri.encode(j0.a(longAmount / ((long) 100), uSSDTopUpHomeActivity2.f26546g, str))));
                            ActivityUtils.startActivity(intent);
                            n0.g().l("04".equals(uSSDTopUpHomeActivity2.f26546g) ? "Airtime_USSD_Page_Dail_Button" : "Data_USSD_Page_Dail_Button");
                            break;
                        case 2:
                            int i14 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(0);
                                break;
                            }
                            break;
                        default:
                            int i15 = USSDTopUpHomeActivity.f26542o;
                            if (!r0.U0()) {
                                uSSDTopUpHomeActivity2.o(1);
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
