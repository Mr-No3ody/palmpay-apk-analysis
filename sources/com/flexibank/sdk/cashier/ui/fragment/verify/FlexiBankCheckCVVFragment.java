package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.i;
import R3.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x4.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckCVVFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/c;", "<init>", "()V", "a", "R3/c", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckCVVFragment extends FlexiBankBaseVerifyFragment<c> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f22017p = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckCVVFragment newInstance() {
            return new FlexiBankCheckCVVFragment();
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_check_cvv_fragment, viewGroup, false);
        int i7 = p.fb_buttonNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = p.fb_editCvv;
            AppCompatEditText appCompatEditText = (AppCompatEditText) p059e1.a.m(i7, viewInflate);
            if (appCompatEditText != null) {
                i7 = p.fb_ivBank;
                ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = p.fb_ivClose;
                    IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                    if (iconicsImageView != null) {
                        i7 = p.fb_tvBankName;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = p.fb_tvTitle;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null) {
                                c cVar = new c((LinearLayout) viewInflate, ppButton, appCompatEditText, imageView, iconicsImageView, textView, textView2);
                                Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                                return cVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int j() {
        c cVar = (c) this.f21944f;
        q(cVar != null ? cVar.f43585d : null, cVar != null ? cVar.f43587f : null);
        c cVar2 = (c) this.f21944f;
        if (cVar2 != null) {
            cVar2.f43588g.setOnClickListener(new b(this, 0));
        }
        c cVar3 = (c) this.f21944f;
        if (cVar3 == null) {
            return 0;
        }
        p(cVar3.f43586e);
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        c cVar = (c) this.f21944f;
        if (cVar != null) {
            cVar.f43584c.addTextChangedListener(new i(this, 27));
        }
        c cVar2 = (c) this.f21944f;
        if (cVar2 != null) {
            cVar2.f43583b.setEnabled(false);
        }
        c cVar3 = (c) this.f21944f;
        if (cVar3 != null) {
            cVar3.f43583b.setOnClickListener(new b(this, 1));
        }
        return 0;
    }
}
