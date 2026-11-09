package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import Gb.L;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.bean.req.UbaBankPaySendOtpReq;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUbaBankAccountOTPFragment;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckUbaBankAccountOTPFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckUbaBankAccountOTPFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final a f28025L = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28026A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f28027B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f28028C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public L f28029H;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28030j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28032p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28033v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28034w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckUbaBankAccountOTPFragment newInstance(@Nullable String str, @Nullable String str2) {
            CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = new CheckUbaBankAccountOTPFragment();
            Bundle bundle = new Bundle();
            bundle.putString("otp_reference", str);
            bundle.putString("extra_message", str2);
            checkUbaBankAccountOTPFragment.setArguments(bundle);
            return checkUbaBankAccountOTPFragment;
        }

        private a() {
        }
    }

    public CheckUbaBankAccountOTPFragment() {
        final int i7 = 0;
        this.f28030j = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i7) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f28031o = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i10) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f28032p = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i11) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i12) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f28033v = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i13) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f28034w = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i14) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i15 = 6;
        this.f28026A = C2131j.b(new Function0(this) { // from class: Ja.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckUbaBankAccountOTPFragment f4625b;

            {
                this.f4625b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4625b;
                switch (i15) {
                    case 0:
                        CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                        View view = checkUbaBankAccountOTPFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckUbaBankAccountOTPFragment.a aVar2 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view2 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvCountDown);
                        }
                        return null;
                    case 2:
                        CheckUbaBankAccountOTPFragment.a aVar3 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view3 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view3 != null) {
                            return (AppCompatEditText) view3.findViewById(p025ba.e.editCardOtp);
                        }
                        return null;
                    case 3:
                        CheckUbaBankAccountOTPFragment.a aVar4 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view4 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    case 4:
                        CheckUbaBankAccountOTPFragment.a aVar5 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view5 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 5:
                        CheckUbaBankAccountOTPFragment.a aVar6 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view6 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckUbaBankAccountOTPFragment.a aVar7 = CheckUbaBankAccountOTPFragment.f28025L;
                        View view7 = checkUbaBankAccountOTPFragment.f27318b;
                        if (view7 != null) {
                            return (ImageView) view7.findViewById(p025ba.e.ivClose);
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
        y((ImageView) this.f28034w.getValue(), (TextView) this.f28033v.getValue());
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TextView textView;
        super.o();
        if (!TextUtils.isEmpty(this.f28028C) && (textView = (TextView) this.t.getValue()) != null) {
            textView.setText(this.f28028C);
        }
        TextView textViewZ = z();
        if (textViewZ != null) {
            textViewZ.setVisibility(0);
        }
        x((ImageView) this.f28026A.getValue());
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f28032p.getValue();
        if (appCompatEditText != null) {
            h.r(appCompatEditText, new i(this, 22), null);
        }
        t tVar = this.f28030j;
        View view = (View) tVar.getValue();
        if (view != null) {
            view.setEnabled(false);
        }
        View view2 = (View) tVar.getValue();
        if (view2 != null) {
            final int i7 = 0;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckUbaBankAccountOTPFragment f4623b;

                {
                    this.f4623b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Editable editableText;
                    CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4623b;
                    switch (i7) {
                        case 0:
                            CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                            PayVerificationCallback payVerificationCallbackU = checkUbaBankAccountOTPFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) checkUbaBankAccountOTPFragment.f28032p.getValue();
                                payVerificationCallbackU.verifyPayMethod((appCompatEditText2 == null || (editableText = appCompatEditText2.getEditableText()) == null) ? null : editableText.toString(), 13);
                            }
                            break;
                        default:
                            UbaBankPaySendOtpReq ubaBankPaySendOtpReq = new UbaBankPaySendOtpReq(checkUbaBankAccountOTPFragment.f28027B);
                            checkUbaBankAccountOTPFragment.showLoadingDialog(true);
                            ((PayApiService) p324va.c.f43141a.f14621b).ubaBankAccPayResendOtp(ubaBankPaySendOtpReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkUbaBankAccountOTPFragment, 16));
                            break;
                    }
                }
            });
        }
        TextView textViewZ2 = z();
        if (textViewZ2 != null) {
            final int i10 = 1;
            textViewZ2.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.E

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckUbaBankAccountOTPFragment f4623b;

                {
                    this.f4623b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Editable editableText;
                    CheckUbaBankAccountOTPFragment checkUbaBankAccountOTPFragment = this.f4623b;
                    switch (i10) {
                        case 0:
                            CheckUbaBankAccountOTPFragment.a aVar = CheckUbaBankAccountOTPFragment.f28025L;
                            PayVerificationCallback payVerificationCallbackU = checkUbaBankAccountOTPFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) checkUbaBankAccountOTPFragment.f28032p.getValue();
                                payVerificationCallbackU.verifyPayMethod((appCompatEditText2 == null || (editableText = appCompatEditText2.getEditableText()) == null) ? null : editableText.toString(), 13);
                            }
                            break;
                        default:
                            UbaBankPaySendOtpReq ubaBankPaySendOtpReq = new UbaBankPaySendOtpReq(checkUbaBankAccountOTPFragment.f28027B);
                            checkUbaBankAccountOTPFragment.showLoadingDialog(true);
                            ((PayApiService) p324va.c.f43141a.f14621b).ubaBankAccPayResendOtp(ubaBankPaySendOtpReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkUbaBankAccountOTPFragment, 16));
                            break;
                    }
                }
            });
        }
        TextView textViewZ3 = z();
        if (textViewZ3 != null) {
            textViewZ3.setEnabled(false);
        }
        L l5 = new L(this, 4);
        this.f28029H = l5;
        l5.start();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f28027B = arguments != null ? arguments.getString("otp_reference") : null;
        Bundle arguments2 = getArguments();
        this.f28028C = arguments2 != null ? arguments2.getString("extra_message") : null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        L l5 = this.f28029H;
        if (l5 != null) {
            l5.cancel();
        }
        this.f28029H = null;
    }

    public final TextView z() {
        return (TextView) this.f28031o.getValue();
    }
}
