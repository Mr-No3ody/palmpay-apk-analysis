package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import Ha.d;
import Ja.ViewOnTouchListenerC0333f;
import android.text.Editable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankPinFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p025ba.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckBankPinFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBankPinFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f27954A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27955j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27957p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f27959w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckBankPinFragment newInstance() {
            return new CheckBankPinFragment();
        }

        private a() {
        }
    }

    public CheckBankPinFragment() {
        final int i7 = 0;
        this.f27955j = C2131j.b(new Function0(this) { // from class: Ja.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankPinFragment f4653b;

            {
                this.f4653b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankPinFragment checkBankPinFragment = this.f4653b;
                switch (i7) {
                    case 0:
                        CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                        View view = checkBankPinFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankPinFragment.a aVar2 = CheckBankPinFragment.f27954A;
                        View view2 = checkBankPinFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardPin);
                        }
                        return null;
                    case 2:
                        CheckBankPinFragment.a aVar3 = CheckBankPinFragment.f27954A;
                        View view3 = checkBankPinFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 3:
                        CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                        View view4 = checkBankPinFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                        View view5 = checkBankPinFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27956o = C2131j.b(new Function0(this) { // from class: Ja.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankPinFragment f4653b;

            {
                this.f4653b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankPinFragment checkBankPinFragment = this.f4653b;
                switch (i10) {
                    case 0:
                        CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                        View view = checkBankPinFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankPinFragment.a aVar2 = CheckBankPinFragment.f27954A;
                        View view2 = checkBankPinFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardPin);
                        }
                        return null;
                    case 2:
                        CheckBankPinFragment.a aVar3 = CheckBankPinFragment.f27954A;
                        View view3 = checkBankPinFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 3:
                        CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                        View view4 = checkBankPinFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                        View view5 = checkBankPinFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27957p = C2131j.b(new Function0(this) { // from class: Ja.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankPinFragment f4653b;

            {
                this.f4653b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankPinFragment checkBankPinFragment = this.f4653b;
                switch (i11) {
                    case 0:
                        CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                        View view = checkBankPinFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankPinFragment.a aVar2 = CheckBankPinFragment.f27954A;
                        View view2 = checkBankPinFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardPin);
                        }
                        return null;
                    case 2:
                        CheckBankPinFragment.a aVar3 = CheckBankPinFragment.f27954A;
                        View view3 = checkBankPinFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 3:
                        CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                        View view4 = checkBankPinFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                        View view5 = checkBankPinFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankPinFragment f4653b;

            {
                this.f4653b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankPinFragment checkBankPinFragment = this.f4653b;
                switch (i12) {
                    case 0:
                        CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                        View view = checkBankPinFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankPinFragment.a aVar2 = CheckBankPinFragment.f27954A;
                        View view2 = checkBankPinFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardPin);
                        }
                        return null;
                    case 2:
                        CheckBankPinFragment.a aVar3 = CheckBankPinFragment.f27954A;
                        View view3 = checkBankPinFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 3:
                        CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                        View view4 = checkBankPinFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                        View view5 = checkBankPinFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27958v = C2131j.b(new Function0(this) { // from class: Ja.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankPinFragment f4653b;

            {
                this.f4653b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankPinFragment checkBankPinFragment = this.f4653b;
                switch (i13) {
                    case 0:
                        CheckBankPinFragment.a aVar = CheckBankPinFragment.f27954A;
                        View view = checkBankPinFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankPinFragment.a aVar2 = CheckBankPinFragment.f27954A;
                        View view2 = checkBankPinFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardPin);
                        }
                        return null;
                    case 2:
                        CheckBankPinFragment.a aVar3 = CheckBankPinFragment.f27954A;
                        View view3 = checkBankPinFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 3:
                        CheckBankPinFragment.a aVar4 = CheckBankPinFragment.f27954A;
                        View view4 = checkBankPinFragment.f27318b;
                        if (view4 != null) {
                            return (ImageView) view4.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankPinFragment.a aVar5 = CheckBankPinFragment.f27954A;
                        View view5 = checkBankPinFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
    }

    public final void A(boolean z3) {
        Editable editableText;
        int length = 0;
        if (z3) {
            AppCompatEditText appCompatEditTextZ = z();
            if (appCompatEditTextZ != null) {
                appCompatEditTextZ.setCompoundDrawablesWithIntrinsicBounds(0, 0, r.cv_show_psw, 0);
            }
            AppCompatEditText appCompatEditTextZ2 = z();
            if (appCompatEditTextZ2 != null) {
                appCompatEditTextZ2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        } else {
            AppCompatEditText appCompatEditTextZ3 = z();
            if (appCompatEditTextZ3 != null) {
                appCompatEditTextZ3.setCompoundDrawablesWithIntrinsicBounds(0, 0, r.cv_hide_psw, 0);
            }
            AppCompatEditText appCompatEditTextZ4 = z();
            if (appCompatEditTextZ4 != null) {
                appCompatEditTextZ4.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
        AppCompatEditText appCompatEditTextZ5 = z();
        if (appCompatEditTextZ5 != null) {
            AppCompatEditText appCompatEditTextZ6 = z();
            if (appCompatEditTextZ6 != null && (editableText = appCompatEditTextZ6.getEditableText()) != null) {
                length = editableText.length();
            }
            appCompatEditTextZ5.setSelection(length);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_check_bank_pin_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        y((ImageView) this.t.getValue(), (TextView) this.f27957p.getValue());
        x((ImageView) this.f27958v.getValue());
        A(this.f27959w);
        int iDp2px = SizeUtils.dp2px(2.0f);
        AppCompatEditText appCompatEditTextZ = z();
        if (appCompatEditTextZ == null) {
            return 0;
        }
        appCompatEditTextZ.setOnTouchListener(new ViewOnTouchListenerC0333f(this, iDp2px, 0));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        AppCompatEditText appCompatEditTextZ = z();
        if (appCompatEditTextZ != null) {
            appCompatEditTextZ.addTextChangedListener(new i(this, 18));
        }
        t tVar = this.f27955j;
        Button button = (Button) tVar.getValue();
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = (Button) tVar.getValue();
        if (button2 != null) {
            button2.setOnClickListener(new d(this, 24));
        }
        return 0;
    }

    public final AppCompatEditText z() {
        return (AppCompatEditText) this.f27956o.getValue();
    }
}
