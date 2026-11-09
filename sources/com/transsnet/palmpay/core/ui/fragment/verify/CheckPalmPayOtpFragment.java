package com.transsnet.palmpay.core.ui.fragment.verify;

import Ha.d;
import Ja.o;
import L6.b;
import M7.s;
import Pa.r0;
import Ua.l0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckPalmPayOtpFragment;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeView;
import com.transsnet.palmpay.core.viewmodel.c;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckPalmPayOtpFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckPalmPayOtpFragment extends BaseFragment {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f27988o = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f27989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27990j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckPalmPayOtpFragment newInstance() {
            CheckPalmPayOtpFragment checkPalmPayOtpFragment = new CheckPalmPayOtpFragment();
            checkPalmPayOtpFragment.setArguments(new Bundle());
            return checkPalmPayOtpFragment;
        }

        private a() {
        }
    }

    public CheckPalmPayOtpFragment() {
        final int i7 = 0;
        this.f27989i = C2131j.b(new Function0(this) { // from class: Ja.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckPalmPayOtpFragment f4671b;

            {
                this.f4671b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = this.f4671b;
                switch (i7) {
                    case 0:
                        CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
                        View view = checkPalmPayOtpFragment.f27318b;
                        if (view != null) {
                            return (OneTimeCodeView) view.findViewById(p025ba.e.viewOtc);
                        }
                        return null;
                    default:
                        CheckPalmPayOtpFragment.a aVar2 = CheckPalmPayOtpFragment.f27988o;
                        View view2 = checkPalmPayOtpFragment.f27318b;
                        if (view2 != null) {
                            return (PpTitleBar) view2.findViewById(p025ba.e.titleBar);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27990j = C2131j.b(new Function0(this) { // from class: Ja.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckPalmPayOtpFragment f4671b;

            {
                this.f4671b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckPalmPayOtpFragment checkPalmPayOtpFragment = this.f4671b;
                switch (i10) {
                    case 0:
                        CheckPalmPayOtpFragment.a aVar = CheckPalmPayOtpFragment.f27988o;
                        View view = checkPalmPayOtpFragment.f27318b;
                        if (view != null) {
                            return (OneTimeCodeView) view.findViewById(p025ba.e.viewOtc);
                        }
                        return null;
                    default:
                        CheckPalmPayOtpFragment.a aVar2 = CheckPalmPayOtpFragment.f27988o;
                        View view2 = checkPalmPayOtpFragment.f27318b;
                        if (view2 != null) {
                            return (PpTitleBar) view2.findViewById(p025ba.e.titleBar);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return g.core_fragment_check_palm_pay_otp;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        OneTimeCodeView oneTimeCodeViewT = t();
        if (oneTimeCodeViewT != null) {
            oneTimeCodeViewT.c();
        }
        try {
            Intrinsics.e(SmsRetriever.getClient(requireContext()).startSmsRetriever());
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        View viewFindViewById;
        OneTimeCodeView oneTimeCodeViewT;
        t tVar = this.f27990j;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.c(S6.a.pay_Close, CommonViewExtKt.colorInt(b.ppColorPrimary, requireContext()));
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar2 != null) {
            ppTitleBar2.setBackButtonClickListener(new d(this, 26));
        }
        OneTimeCodeView oneTimeCodeViewT2 = t();
        if (oneTimeCodeViewT2 != null) {
            oneTimeCodeViewT2.setMobileNumber(BaseApplication.get().getUser().getPhoneNumber());
        }
        OneTimeCodeView oneTimeCodeViewT3 = t();
        if (oneTimeCodeViewT3 != null) {
            oneTimeCodeViewT3.setSendCodeListener(new o(this));
        }
        OneTimeCodeView oneTimeCodeViewT4 = t();
        if (oneTimeCodeViewT4 != null) {
            oneTimeCodeViewT4.setCodeEnteredListener(new o(this));
        }
        View view = this.f27318b;
        if (view == null || (viewFindViewById = view.findViewById(e.securityKeyBoard)) == null || (oneTimeCodeViewT = t()) == null) {
            return 0;
        }
        PinEntryView pinEntryView = oneTimeCodeViewT.f28509c;
        if (pinEntryView != null) {
            pinEntryView.setUseCustomKeyboard(true);
        }
        c cVar = oneTimeCodeViewT.f28517p;
        if (cVar != null) {
            cVar.e();
        }
        c cVar2 = new c(viewFindViewById);
        EditText codeEditText = oneTimeCodeViewT.getCodeEditText();
        l0 inputMode = l0.f9427a;
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        cVar2.a(C1849p.c(codeEditText), 6, inputMode);
        oneTimeCodeViewT.f28517p = cVar2;
        PinEntryView pinEntryView2 = oneTimeCodeViewT.f28509c;
        if (pinEntryView2 == null) {
            return 0;
        }
        pinEntryView2.setOnShowCustomKeyboardListener(new s(oneTimeCodeViewT, 17));
        if (oneTimeCodeViewT.f28509c.getEditText() == null) {
            return 0;
        }
        oneTimeCodeViewT.f28509c.getEditText().requestFocus();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getArguments();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        OneTimeCodeView oneTimeCodeViewT = t();
        if (oneTimeCodeViewT != null) {
            PinEntryView pinEntryView = oneTimeCodeViewT.f28509c;
            if (pinEntryView != null) {
                pinEntryView.setOnShowCustomKeyboardListener(null);
                oneTimeCodeViewT.f28509c.setUseCustomKeyboard(false);
            }
            c cVar = oneTimeCodeViewT.f28517p;
            if (cVar != null) {
                cVar.e();
                oneTimeCodeViewT.f28517p = null;
            }
        }
        super.onDestroyView();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        OneTimeCodeView oneTimeCodeViewT;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 515) {
            String strZ1 = r0.z1(6, event.getEventContent());
            if (!TextUtils.isDigitsOnly(strZ1) || (oneTimeCodeViewT = t()) == null) {
                return;
            }
            oneTimeCodeViewT.setCode(strZ1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        org.greenrobot.eventbus.c.b().j(this);
    }

    public final OneTimeCodeView t() {
        return (OneTimeCodeView) this.f27989i.getValue();
    }
}
