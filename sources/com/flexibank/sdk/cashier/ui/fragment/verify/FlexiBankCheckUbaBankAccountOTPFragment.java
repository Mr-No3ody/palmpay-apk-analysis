package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.i;
import Ab.y;
import Fe.h0;
import Gb.L;
import N8.C0463g;
import Z3.j;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.cashier.callback.FlexiBankPayVerificationCallback;
import com.flexibank.sdk.cashier.ui.fragment.verify.FlexiBankCheckUbaBankAccountOTPFragment;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierVerifyViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377z5.l;
import x4.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckUbaBankAccountOTPFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/g;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckUbaBankAccountOTPFragment extends FlexiBankBaseVerifyFragment<g> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f22030w = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f22031p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public L f22032v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckUbaBankAccountOTPFragment newInstance(@Nullable String str, @Nullable String str2) {
            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment = new FlexiBankCheckUbaBankAccountOTPFragment();
            Bundle bundle = new Bundle();
            bundle.putString("otp_reference", str);
            bundle.putString("extra_message", str2);
            flexiBankCheckUbaBankAccountOTPFragment.setArguments(bundle);
            return flexiBankCheckUbaBankAccountOTPFragment;
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        g gVarA = g.a(inflater, viewGroup);
        Intrinsics.checkNotNullExpressionValue(gVarA, "inflate(...)");
        return gVarA;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        ViewBinding viewBinding = this.f21944f;
        g gVar = (g) viewBinding;
        g gVar2 = (g) viewBinding;
        q(gVar != null ? gVar.f43603d : null, gVar2 != null ? gVar2.f43605f : null);
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        g gVar;
        if (!TextUtils.isEmpty(this.t) && (gVar = (g) this.f21944f) != null) {
            gVar.f43607i.setText(this.t);
        }
        g gVar2 = (g) this.f21944f;
        if (gVar2 != null) {
            gVar2.f43606g.setVisibility(0);
        }
        g gVar3 = (g) this.f21944f;
        p(gVar3 != null ? gVar3.f43604e : null);
        g gVar4 = (g) this.f21944f;
        if (gVar4 != null) {
            p062e4.a.c(gVar4.f43602c, new i(this, 29));
        }
        g gVar5 = (g) this.f21944f;
        if (gVar5 != null) {
            gVar5.f43601b.setEnabled(false);
        }
        g gVar6 = (g) this.f21944f;
        if (gVar6 != null) {
            final int i7 = 0;
            gVar6.f43601b.setOnClickListener(new View.OnClickListener(this) { // from class: R3.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlexiBankCheckUbaBankAccountOTPFragment f7919b;

                {
                    this.f7919b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppCompatEditText appCompatEditText;
                    Editable editableText;
                    String string = null;
                    switch (i7) {
                        case 0:
                            FlexiBankCheckUbaBankAccountOTPFragment.a aVar = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment = this.f7919b;
                            FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackO = flexiBankCheckUbaBankAccountOTPFragment.o();
                            if (flexiBankPayVerificationCallbackO != null) {
                                g gVar7 = (g) flexiBankCheckUbaBankAccountOTPFragment.f21944f;
                                if (gVar7 != null && (appCompatEditText = gVar7.f43602c) != null && (editableText = appCompatEditText.getEditableText()) != null) {
                                    string = editableText.toString();
                                }
                                flexiBankPayVerificationCallbackO.verifyPayMethod(string, 13);
                            }
                            break;
                        default:
                            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment2 = this.f7919b;
                            j jVar = new j(flexiBankCheckUbaBankAccountOTPFragment2.f22031p);
                            l.q(flexiBankCheckUbaBankAccountOTPFragment2, ((FlexiBankCashierVerifyViewModel) flexiBankCheckUbaBankAccountOTPFragment2.h()).f22086o, flexiBankCheckUbaBankAccountOTPFragment2, new y(5), new h0(20), 240);
                            FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) flexiBankCheckUbaBankAccountOTPFragment2.h();
                            C0463g function = new C0463g(flexiBankCheckUbaBankAccountOTPFragment2, 11);
                            Intrinsics.checkNotNullParameter(function, "function");
                            U3.g gVar8 = new U3.g(jVar, null);
                            K3.j jVar2 = flexiBankCashierVerifyViewModel.f22086o;
                            jVar2.f4932m = function;
                            Unit unit = Unit.f38893a;
                            p118hf.a.B(flexiBankCashierVerifyViewModel, gVar8, jVar2);
                            break;
                    }
                }
            });
        }
        g gVar7 = (g) this.f21944f;
        if (gVar7 != null) {
            final int i10 = 1;
            gVar7.f43606g.setOnClickListener(new View.OnClickListener(this) { // from class: R3.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlexiBankCheckUbaBankAccountOTPFragment f7919b;

                {
                    this.f7919b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AppCompatEditText appCompatEditText;
                    Editable editableText;
                    String string = null;
                    switch (i10) {
                        case 0:
                            FlexiBankCheckUbaBankAccountOTPFragment.a aVar = FlexiBankCheckUbaBankAccountOTPFragment.f22030w;
                            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment = this.f7919b;
                            FlexiBankPayVerificationCallback flexiBankPayVerificationCallbackO = flexiBankCheckUbaBankAccountOTPFragment.o();
                            if (flexiBankPayVerificationCallbackO != null) {
                                g gVar8 = (g) flexiBankCheckUbaBankAccountOTPFragment.f21944f;
                                if (gVar8 != null && (appCompatEditText = gVar8.f43602c) != null && (editableText = appCompatEditText.getEditableText()) != null) {
                                    string = editableText.toString();
                                }
                                flexiBankPayVerificationCallbackO.verifyPayMethod(string, 13);
                            }
                            break;
                        default:
                            FlexiBankCheckUbaBankAccountOTPFragment flexiBankCheckUbaBankAccountOTPFragment2 = this.f7919b;
                            j jVar = new j(flexiBankCheckUbaBankAccountOTPFragment2.f22031p);
                            l.q(flexiBankCheckUbaBankAccountOTPFragment2, ((FlexiBankCashierVerifyViewModel) flexiBankCheckUbaBankAccountOTPFragment2.h()).f22086o, flexiBankCheckUbaBankAccountOTPFragment2, new y(5), new h0(20), 240);
                            FlexiBankCashierVerifyViewModel flexiBankCashierVerifyViewModel = (FlexiBankCashierVerifyViewModel) flexiBankCheckUbaBankAccountOTPFragment2.h();
                            C0463g function = new C0463g(flexiBankCheckUbaBankAccountOTPFragment2, 11);
                            Intrinsics.checkNotNullParameter(function, "function");
                            U3.g gVar9 = new U3.g(jVar, null);
                            K3.j jVar2 = flexiBankCashierVerifyViewModel.f22086o;
                            jVar2.f4932m = function;
                            Unit unit = Unit.f38893a;
                            p118hf.a.B(flexiBankCashierVerifyViewModel, gVar9, jVar2);
                            break;
                    }
                }
            });
        }
        g gVar8 = (g) this.f21944f;
        if (gVar8 != null) {
            gVar8.f43606g.setEnabled(false);
        }
        L l5 = new L(this, 6);
        this.f22032v = l5;
        l5.start();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f22031p = arguments != null ? arguments.getString("otp_reference") : null;
        Bundle arguments2 = getArguments();
        this.t = arguments2 != null ? arguments2.getString("extra_message") : null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        L l5 = this.f22032v;
        if (l5 != null) {
            l5.cancel();
        }
        this.f22032v = null;
    }
}
