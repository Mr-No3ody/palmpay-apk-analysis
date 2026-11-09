package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import Ha.d;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckBankOtpFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckBankOtpFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBankOtpFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final a f27947B = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27948A;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27949j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27950o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27951p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27952v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27953w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckBankOtpFragment newInstance(@Nullable String str) {
            CheckBankOtpFragment checkBankOtpFragment = new CheckBankOtpFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_message", str);
            checkBankOtpFragment.setArguments(bundle);
            return checkBankOtpFragment;
        }

        private a() {
        }
    }

    public CheckBankOtpFragment() {
        final int i7 = 0;
        this.f27949j = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i7) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27950o = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i10) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27951p = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i11) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i12) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27952v = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i13) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f27953w = C2131j.b(new Function0(this) { // from class: Ja.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckBankOtpFragment f4648b;

            {
                this.f4648b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckBankOtpFragment checkBankOtpFragment = this.f4648b;
                switch (i14) {
                    case 0:
                        CheckBankOtpFragment.a aVar = CheckBankOtpFragment.f27947B;
                        View view = checkBankOtpFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckBankOtpFragment.a aVar2 = CheckBankOtpFragment.f27947B;
                        View view2 = checkBankOtpFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 2:
                        CheckBankOtpFragment.a aVar3 = CheckBankOtpFragment.f27947B;
                        View view3 = checkBankOtpFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 3:
                        CheckBankOtpFragment.a aVar4 = CheckBankOtpFragment.f27947B;
                        View view4 = checkBankOtpFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckBankOtpFragment.a aVar5 = CheckBankOtpFragment.f27947B;
                        View view5 = checkBankOtpFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckBankOtpFragment.a aVar6 = CheckBankOtpFragment.f27947B;
                        View view6 = checkBankOtpFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_bank_otp;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        y((ImageView) this.f27952v.getValue(), (TextView) this.t.getValue());
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TextView textView;
        super.o();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_message") : null;
        this.f27948A = string;
        if (!TextUtils.isEmpty(string) && (textView = (TextView) this.f27951p.getValue()) != null) {
            textView.setText(this.f27948A);
        }
        x((ImageView) this.f27953w.getValue());
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f27950o.getValue();
        if (appCompatEditText != null) {
            h.r(appCompatEditText, new i(this, 17), null);
        }
        t tVar = this.f27949j;
        View view = (View) tVar.getValue();
        if (view != null) {
            view.setEnabled(false);
        }
        View view2 = (View) tVar.getValue();
        if (view2 != null) {
            view2.setOnClickListener(new d(this, 23));
        }
        return 0;
    }
}
