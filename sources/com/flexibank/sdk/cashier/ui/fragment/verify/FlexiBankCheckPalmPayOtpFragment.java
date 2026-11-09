package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.y;
import K3.g;
import N8.C0457a;
import N8.C0463g;
import Nc.x;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import com.flexibank.sdk.core.viewmodel.FlexiBankOneTimeCodeView;
import com.flexibank.sdk.k;
import com.flexibank.sdk.m;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p377z5.l;
import x4.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckPalmPayOtpFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/i;", "<init>", "()V", "LY3/a;", "event", "", "onMessageEvent", "(LY3/a;)V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckPalmPayOtpFragment extends FlexiBankBaseVerifyFragment<i> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f22023p = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckPalmPayOtpFragment newInstance() {
            FlexiBankCheckPalmPayOtpFragment flexiBankCheckPalmPayOtpFragment = new FlexiBankCheckPalmPayOtpFragment();
            flexiBankCheckPalmPayOtpFragment.setArguments(new Bundle());
            return flexiBankCheckPalmPayOtpFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_fragment_check_palm_pay_otp, viewGroup, false);
        int i7 = p.fb_titleBar;
        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
        if (ppTitleBar != null) {
            i7 = p.fb_viewOtc;
            FlexiBankOneTimeCodeView flexiBankOneTimeCodeView = (FlexiBankOneTimeCodeView) p059e1.a.m(i7, viewInflate);
            if (flexiBankOneTimeCodeView != null) {
                i iVar = new i((LinearLayout) viewInflate, ppTitleBar, flexiBankOneTimeCodeView);
                Intrinsics.checkNotNullExpressionValue(iVar, "inflate(...)");
                return iVar;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) h();
        l.q(this, flexiBankCashierVerifyViewModel.f22083g, this, new y(4), new C0463g(this, 10), 240);
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
        i iVar = (i) this.f21944f;
        if (iVar != null) {
            iVar.f43616c.b();
        }
        try {
            Intrinsics.e(SmsRetriever.getClient(requireContext()).startSmsRetriever());
        } catch (Exception unused) {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        i iVar = (i) this.f21944f;
        if (iVar != null) {
            PpTitleBar ppTitleBar = iVar.f43615b;
            S6.a aVar = S6.a.pay_Close;
            int i7 = m.fb_base_colorPrimary;
            Context contextRequireContext = requireContext();
            if (contextRequireContext == null && (contextRequireContext = g.f4925c.getContext()) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ppTitleBar.c(aVar, contextRequireContext.getColor(i7));
        }
        i iVar2 = (i) this.f21944f;
        if (iVar2 != null) {
            iVar2.f43615b.setBackButtonClickListener(new x(this, 27));
        }
        i iVar3 = (i) this.f21944f;
        if (iVar3 != null) {
            iVar3.f43616c.setMobileNumber(k.f22317a.i().f18771b);
        }
        i iVar4 = (i) this.f21944f;
        if (iVar4 != null) {
            iVar4.f43616c.setSendCodeListener(new p045d3.k(this, 8));
        }
        i iVar5 = (i) this.f21944f;
        if (iVar5 == null) {
            return 0;
        }
        iVar5.f43616c.setCodeEnteredListener(new C0457a(this, 13));
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull Y3.a event) {
        String strGroup;
        i iVar;
        FlexiBankOneTimeCodeView flexiBankOneTimeCodeView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String input = event.getEventContent();
            if (input == null) {
                input = "";
            }
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                Matcher matcher = Pattern.compile("(?<![0-9])([0-9]{6})(?![0-9])").matcher(input);
                strGroup = matcher.find() ? matcher.group() : null;
            } catch (Exception unused) {
            }
            if (!TextUtils.isDigitsOnly(strGroup) || (iVar = (i) this.f21944f) == null || (flexiBankOneTimeCodeView = iVar.f43616c) == null) {
                return;
            }
            flexiBankOneTimeCodeView.setCode(strGroup != null ? strGroup : "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        c.b().l(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        c.b().j(this);
    }
}
