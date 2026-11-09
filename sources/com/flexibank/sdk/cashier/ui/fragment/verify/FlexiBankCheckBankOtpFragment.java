package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.i;
import Nc.x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckBankOtpFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/g;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckBankOtpFragment extends FlexiBankBaseVerifyFragment<g> {
    public static final a t = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f22008p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckBankOtpFragment newInstance(@Nullable String str) {
            FlexiBankCheckBankOtpFragment flexiBankCheckBankOtpFragment = new FlexiBankCheckBankOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_message", str);
            flexiBankCheckBankOtpFragment.setArguments(bundle);
            return flexiBankCheckBankOtpFragment;
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
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_message") : null;
        this.f22008p = string;
        if (!TextUtils.isEmpty(string) && (gVar = (g) this.f21944f) != null) {
            gVar.f43607i.setText(this.f22008p);
        }
        g gVar2 = (g) this.f21944f;
        if (gVar2 != null) {
            p(gVar2.f43604e);
        }
        g gVar3 = (g) this.f21944f;
        if (gVar3 != null) {
            p062e4.a.c(gVar3.f43602c, new i(this, 25));
        }
        g gVar4 = (g) this.f21944f;
        if (gVar4 != null) {
            gVar4.f43601b.setEnabled(false);
        }
        g gVar5 = (g) this.f21944f;
        if (gVar5 != null) {
            gVar5.f43601b.setOnClickListener(new x(this, 22));
        }
        return 0;
    }
}
