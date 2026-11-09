package com.flexibank.sdk.cashier.ui.fragment.verify;

import Ab.i;
import Ja.ViewOnTouchListenerC0333f;
import Nc.x;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x4.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankCheckBankPinFragment;", "Lcom/flexibank/sdk/cashier/ui/fragment/verify/FlexiBankBaseVerifyFragment;", "Lx4/b;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCheckBankPinFragment extends FlexiBankBaseVerifyFragment<b> {
    public static final a t = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f22009p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlexiBankCheckBankPinFragment newInstance() {
            return new FlexiBankCheckBankPinFragment();
        }

        private a() {
        }
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final ViewBinding i(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(q.fb_check_bank_pin_fragment, viewGroup, false);
        int i7 = p.fb_buttonNext;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = p.fb_editCardPin;
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
                                b bVar = new b((LinearLayout) viewInflate, ppButton, appCompatEditText, imageView, iconicsImageView, textView, textView2);
                                Intrinsics.checkNotNullExpressionValue(bVar, "inflate(...)");
                                return bVar;
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
        b bVar = (b) this.f21944f;
        q(bVar != null ? bVar.f43578d : null, bVar != null ? bVar.f43580f : null);
        b bVar2 = (b) this.f21944f;
        p(bVar2 != null ? bVar2.f43579e : null);
        r(this.f22009p);
        int iDp2px = SizeUtils.dp2px(2.0f);
        b bVar3 = (b) this.f21944f;
        if (bVar3 == null) {
            return 0;
        }
        bVar3.f43577c.setOnTouchListener(new ViewOnTouchListenerC0333f(this, iDp2px, 1));
        return 0;
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final void k() {
    }

    @Override // com.flexibank.sdk.base.FlexiBankBaseFragment
    public final int l() {
        b bVar = (b) this.f21944f;
        if (bVar != null) {
            bVar.f43577c.addTextChangedListener(new i(this, 26));
        }
        b bVar2 = (b) this.f21944f;
        if (bVar2 != null) {
            bVar2.f43576b.setEnabled(false);
        }
        b bVar3 = (b) this.f21944f;
        if (bVar3 != null) {
            bVar3.f43576b.setOnClickListener(new x(this, 23));
        }
        return 0;
    }

    public final void r(boolean z3) {
        AppCompatEditText appCompatEditText;
        AppCompatEditText appCompatEditText2;
        AppCompatEditText appCompatEditText3;
        AppCompatEditText appCompatEditText4;
        Editable editableText;
        AppCompatEditText appCompatEditText5;
        AppCompatEditText appCompatEditText6;
        int length = 0;
        if (z3) {
            b bVar = (b) this.f21944f;
            if (bVar != null && (appCompatEditText6 = bVar.f43577c) != null) {
                appCompatEditText6.setCompoundDrawablesWithIntrinsicBounds(0, 0, o.fb_show_psw, 0);
            }
            b bVar2 = (b) this.f21944f;
            if (bVar2 != null && (appCompatEditText5 = bVar2.f43577c) != null) {
                appCompatEditText5.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        } else {
            b bVar3 = (b) this.f21944f;
            if (bVar3 != null && (appCompatEditText2 = bVar3.f43577c) != null) {
                appCompatEditText2.setCompoundDrawablesWithIntrinsicBounds(0, 0, o.fb_hide_psw, 0);
            }
            b bVar4 = (b) this.f21944f;
            if (bVar4 != null && (appCompatEditText = bVar4.f43577c) != null) {
                appCompatEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        ViewBinding viewBinding = this.f21944f;
        b bVar5 = (b) viewBinding;
        if (bVar5 == null || (appCompatEditText3 = bVar5.f43577c) == null) {
            return;
        }
        b bVar6 = (b) viewBinding;
        if (bVar6 != null && (appCompatEditText4 = bVar6.f43577c) != null && (editableText = appCompatEditText4.getEditableText()) != null) {
            length = editableText.length();
        }
        appCompatEditText3.setSelection(length);
    }
}
