package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import C0.G;
import O6.c;
import Pa.n0;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.E;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.callback.PayVerificationCallback;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckAirtimeSharePinFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.g;
import p025ba.k;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckAirtimeSharePinFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckAirtimeSharePinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckAirtimeSharePinFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckAirtimeSharePinFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,200:1\n694#2,50:201\n*S KotlinDebug\n*F\n+ 1 CheckAirtimeSharePinFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckAirtimeSharePinFragment\n*L\n75#1:201,50\n*E\n"})
public final class CheckAirtimeSharePinFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f27934C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f27935A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f27936B;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27937j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27939p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27940v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27941w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckAirtimeSharePinFragment newInstance(@NotNull PayByOrderResp.DataBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = new CheckAirtimeSharePinFragment();
            Bundle bundle = new Bundle();
            bundle.putString("extra_message", bean.promptMessage);
            bundle.putString("extra_data", bean.orderData);
            bundle.putString("extra_data_1", bean.errorMsg);
            checkAirtimeSharePinFragment.setArguments(bundle);
            return checkAirtimeSharePinFragment;
        }

        private a() {
        }
    }

    public CheckAirtimeSharePinFragment() {
        final int i7 = 0;
        this.f27937j = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i7) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27938o = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i10) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27939p = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i11) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i12) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27940v = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i13) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f27941w = C2131j.b(new Function0(this) { // from class: Ja.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckAirtimeSharePinFragment f4642b;

            {
                this.f4642b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4642b;
                switch (i14) {
                    case 0:
                        CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                        View view = checkAirtimeSharePinFragment.f27318b;
                        if (view != null) {
                            return (PpButton) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                        View view2 = checkAirtimeSharePinFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(p025ba.e.tvSetPin);
                        }
                        return null;
                    case 2:
                        CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                        View view3 = checkAirtimeSharePinFragment.f27318b;
                        if (view3 != null) {
                            return (ImageView) view3.findViewById(p025ba.e.ivHide);
                        }
                        return null;
                    case 3:
                        CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                        View view4 = checkAirtimeSharePinFragment.f27318b;
                        if (view4 != null) {
                            return (AppCompatEditText) view4.findViewById(p025ba.e.editSharePin);
                        }
                        return null;
                    case 4:
                        CheckAirtimeSharePinFragment.a aVar5 = CheckAirtimeSharePinFragment.f27934C;
                        View view5 = checkAirtimeSharePinFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(p025ba.e.tvMsg);
                        }
                        return null;
                    default:
                        CheckAirtimeSharePinFragment.a aVar6 = CheckAirtimeSharePinFragment.f27934C;
                        View view6 = checkAirtimeSharePinFragment.f27318b;
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
        return g.core_fragment_check_airtime_share_pin;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        Window window;
        super.o();
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(5);
        }
        Bundle arguments = getArguments();
        this.f27935A = arguments != null ? arguments.getString("extra_message") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("extra_data");
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f27935A);
        t tVar = this.f27940v;
        if (zIsEmpty) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(Html.fromHtml(getString(k.core_confirm_airtime_share_pin), 0));
            }
        } else {
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                textView2.setText(this.f27935A);
            }
        }
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("extra_data_1")) == null) {
            string = "";
        }
        if (!TextUtils.isEmpty(string)) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            int i7 = r.cv_icon_dialog_warning;
            int i10 = k.core_try_again1;
            int i11 = k.core_opps;
            c cVar = new c(contextRequireContext);
            cVar.f6614u = 3;
            cVar.e(i11);
            cVar.f("");
            cVar.f6607m = i7;
            cVar.f6598d = string;
            cVar.d(i10, null);
            cVar.f6605k = true;
            cVar.f6606l = 1;
            G.v(cVar, false, false);
        }
        x((ImageView) this.f27941w.getValue());
        AppCompatEditText appCompatEditTextZ = z();
        if (appCompatEditTextZ != null) {
            appCompatEditTextZ.requestFocus();
        }
        AppCompatEditText appCompatEditTextZ2 = z();
        if (appCompatEditTextZ2 != null) {
            h.r(appCompatEditTextZ2, new i(this, 16), null);
        }
        t tVar2 = this.f27937j;
        PpButton ppButton = (PpButton) tVar2.getValue();
        if (ppButton != null) {
            ppButton.setEnabled(false);
        }
        PpButton ppButton2 = (PpButton) tVar2.getValue();
        if (ppButton2 != null) {
            final int i12 = 0;
            ppButton2.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckAirtimeSharePinFragment f4646b;

                {
                    this.f4646b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable editableText;
                    Editable text;
                    final int length = 0;
                    final int i13 = 1;
                    final CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4646b;
                    switch (i12) {
                        case 0:
                            CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                            PayVerificationCallback payVerificationCallbackU = checkAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextZ3 = checkAirtimeSharePinFragment.z();
                                payVerificationCallbackU.verifyPayMethod((appCompatEditTextZ3 == null || (editableText = appCompatEditTextZ3.getEditableText()) == null) ? null : editableText.toString(), 23);
                            }
                            n0.g().l("RechargeToCashSharePinPage_ConfirmButton");
                            break;
                        case 1:
                            CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                            checkAirtimeSharePinFragment.showLoadingDialog(true);
                            ((PayApiService) p324va.c.f43141a.f14621b).getUSSDDialNo().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkAirtimeSharePinFragment, 12));
                            n0.g().l("RechargeToCashSharePinPage_SetSharePinButton");
                            break;
                        default:
                            boolean z3 = checkAirtimeSharePinFragment.f27936B;
                            checkAirtimeSharePinFragment.f27936B = !z3;
                            p355xf.t tVar3 = checkAirtimeSharePinFragment.f27939p;
                            if (z3) {
                                AppCompatEditText appCompatEditTextZ4 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ4 != null) {
                                    appCompatEditTextZ4.setInputType(18);
                                }
                                ImageView imageView = (ImageView) tVar3.getValue();
                                if (imageView != null) {
                                    Context contextRequireContext2 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext2, S6.a.pay_Hide);
                                    iconicsDrawable.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (length) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView.setImageDrawable(iconicsDrawable);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextZ5 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ5 != null) {
                                    appCompatEditTextZ5.setInputType(2);
                                }
                                ImageView imageView2 = (ImageView) tVar3.getValue();
                                if (imageView2 != null) {
                                    Context contextRequireContext3 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext3, S6.a.pay_Show);
                                    iconicsDrawable2.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (i13) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView2.setImageDrawable(iconicsDrawable2);
                                }
                            }
                            AppCompatEditText appCompatEditTextZ6 = checkAirtimeSharePinFragment.z();
                            if (appCompatEditTextZ6 != null) {
                                AppCompatEditText appCompatEditTextZ7 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ7 != null && (text = appCompatEditTextZ7.getText()) != null) {
                                    length = text.length();
                                }
                                appCompatEditTextZ6.setSelection(length);
                            }
                            break;
                    }
                }
            });
        }
        TextView textView3 = (TextView) this.f27938o.getValue();
        if (textView3 != null) {
            final int i13 = 1;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckAirtimeSharePinFragment f4646b;

                {
                    this.f4646b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable editableText;
                    Editable text;
                    final int length = 0;
                    final int i14 = 1;
                    final CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4646b;
                    switch (i13) {
                        case 0:
                            CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                            PayVerificationCallback payVerificationCallbackU = checkAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextZ3 = checkAirtimeSharePinFragment.z();
                                payVerificationCallbackU.verifyPayMethod((appCompatEditTextZ3 == null || (editableText = appCompatEditTextZ3.getEditableText()) == null) ? null : editableText.toString(), 23);
                            }
                            n0.g().l("RechargeToCashSharePinPage_ConfirmButton");
                            break;
                        case 1:
                            CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                            checkAirtimeSharePinFragment.showLoadingDialog(true);
                            ((PayApiService) p324va.c.f43141a.f14621b).getUSSDDialNo().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkAirtimeSharePinFragment, 12));
                            n0.g().l("RechargeToCashSharePinPage_SetSharePinButton");
                            break;
                        default:
                            boolean z3 = checkAirtimeSharePinFragment.f27936B;
                            checkAirtimeSharePinFragment.f27936B = !z3;
                            p355xf.t tVar3 = checkAirtimeSharePinFragment.f27939p;
                            if (z3) {
                                AppCompatEditText appCompatEditTextZ4 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ4 != null) {
                                    appCompatEditTextZ4.setInputType(18);
                                }
                                ImageView imageView = (ImageView) tVar3.getValue();
                                if (imageView != null) {
                                    Context contextRequireContext2 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext2, S6.a.pay_Hide);
                                    iconicsDrawable.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (length) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView.setImageDrawable(iconicsDrawable);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextZ5 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ5 != null) {
                                    appCompatEditTextZ5.setInputType(2);
                                }
                                ImageView imageView2 = (ImageView) tVar3.getValue();
                                if (imageView2 != null) {
                                    Context contextRequireContext3 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext3, S6.a.pay_Show);
                                    iconicsDrawable2.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (i14) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView2.setImageDrawable(iconicsDrawable2);
                                }
                            }
                            AppCompatEditText appCompatEditTextZ6 = checkAirtimeSharePinFragment.z();
                            if (appCompatEditTextZ6 != null) {
                                AppCompatEditText appCompatEditTextZ7 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ7 != null && (text = appCompatEditTextZ7.getText()) != null) {
                                    length = text.length();
                                }
                                appCompatEditTextZ6.setSelection(length);
                            }
                            break;
                    }
                }
            });
        }
        AppCompatEditText appCompatEditTextZ3 = z();
        if (appCompatEditTextZ3 != null) {
            appCompatEditTextZ3.setHint(G.i("").append(getString(k.core_enter_share_pin)).setFontFamily("sans-serif").create());
        }
        ImageView imageView = (ImageView) this.f27939p.getValue();
        if (imageView != null) {
            final int i14 = 2;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckAirtimeSharePinFragment f4646b;

                {
                    this.f4646b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Editable editableText;
                    Editable text;
                    final int length = 0;
                    final int i15 = 1;
                    final CheckAirtimeSharePinFragment checkAirtimeSharePinFragment = this.f4646b;
                    switch (i14) {
                        case 0:
                            CheckAirtimeSharePinFragment.a aVar = CheckAirtimeSharePinFragment.f27934C;
                            PayVerificationCallback payVerificationCallbackU = checkAirtimeSharePinFragment.u();
                            if (payVerificationCallbackU != null) {
                                AppCompatEditText appCompatEditTextZ4 = checkAirtimeSharePinFragment.z();
                                payVerificationCallbackU.verifyPayMethod((appCompatEditTextZ4 == null || (editableText = appCompatEditTextZ4.getEditableText()) == null) ? null : editableText.toString(), 23);
                            }
                            n0.g().l("RechargeToCashSharePinPage_ConfirmButton");
                            break;
                        case 1:
                            CheckAirtimeSharePinFragment.a aVar2 = CheckAirtimeSharePinFragment.f27934C;
                            checkAirtimeSharePinFragment.showLoadingDialog(true);
                            ((PayApiService) p324va.c.f43141a.f14621b).getUSSDDialNo().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new Ab.D(checkAirtimeSharePinFragment, 12));
                            n0.g().l("RechargeToCashSharePinPage_SetSharePinButton");
                            break;
                        default:
                            boolean z3 = checkAirtimeSharePinFragment.f27936B;
                            checkAirtimeSharePinFragment.f27936B = !z3;
                            p355xf.t tVar3 = checkAirtimeSharePinFragment.f27939p;
                            if (z3) {
                                AppCompatEditText appCompatEditTextZ5 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ5 != null) {
                                    appCompatEditTextZ5.setInputType(18);
                                }
                                ImageView imageView2 = (ImageView) tVar3.getValue();
                                if (imageView2 != null) {
                                    Context contextRequireContext2 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext2, S6.a.pay_Hide);
                                    iconicsDrawable.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (length) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView2.setImageDrawable(iconicsDrawable);
                                }
                            } else {
                                AppCompatEditText appCompatEditTextZ6 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ6 != null) {
                                    appCompatEditTextZ6.setInputType(2);
                                }
                                ImageView imageView3 = (ImageView) tVar3.getValue();
                                if (imageView3 != null) {
                                    Context contextRequireContext3 = checkAirtimeSharePinFragment.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                                    IconicsDrawable iconicsDrawable2 = new IconicsDrawable(contextRequireContext3, S6.a.pay_Show);
                                    iconicsDrawable2.a(new Function1() { // from class: Ja.c
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            CheckAirtimeSharePinFragment checkAirtimeSharePinFragment2 = checkAirtimeSharePinFragment;
                                            IconicsDrawable apply = (IconicsDrawable) obj;
                                            switch (i15) {
                                                case 0:
                                                    CheckAirtimeSharePinFragment.a aVar3 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                                default:
                                                    CheckAirtimeSharePinFragment.a aVar4 = CheckAirtimeSharePinFragment.f27934C;
                                                    Intrinsics.checkNotNullParameter(apply, "$this$apply");
                                                    p118hf.a.I(apply, 24);
                                                    D3.a.F(apply, CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, checkAirtimeSharePinFragment2.requireContext()));
                                                    break;
                                            }
                                            return Unit.f38893a;
                                        }
                                    });
                                    imageView3.setImageDrawable(iconicsDrawable2);
                                }
                            }
                            AppCompatEditText appCompatEditTextZ7 = checkAirtimeSharePinFragment.z();
                            if (appCompatEditTextZ7 != null) {
                                AppCompatEditText appCompatEditTextZ8 = checkAirtimeSharePinFragment.z();
                                if (appCompatEditTextZ8 != null && (text = appCompatEditTextZ8.getText()) != null) {
                                    length = text.length();
                                }
                                appCompatEditTextZ7.setSelection(length);
                            }
                            break;
                    }
                }
            });
        }
        return 0;
    }

    public final AppCompatEditText z() {
        return (AppCompatEditText) this.t.getValue();
    }
}
