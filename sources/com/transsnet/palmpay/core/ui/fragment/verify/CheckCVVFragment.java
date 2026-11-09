package com.transsnet.palmpay.core.ui.fragment.verify;

import Ab.i;
import Ha.d;
import Ja.ViewOnClickListenerC0338k;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckCVVFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import com.transsnet.palmpay.custom_view.dialog.b;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckCVVFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "CheckCvvDialog", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckCVVFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f27973A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27974j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27975o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27976p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27977v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27978w;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckCVVFragment$CheckCvvDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckCvvDialog extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckCvvDialog(@NotNull Context context) {
            super(context, g.core_layout_how_to_get_cvv);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // com.transsnet.palmpay.custom_view.dialog.b
        public void initViews() {
            findViewById(e.tvOk).setOnClickListener(new d(this, 25));
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckCVVFragment newInstance() {
            return new CheckCVVFragment();
        }

        private a() {
        }
    }

    public CheckCVVFragment() {
        final int i7 = 0;
        this.f27974j = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i7) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f27975o = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i10) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f27976p = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i11) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i12) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i13 = 4;
        this.f27977v = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i13) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
                        if (view6 != null) {
                            return (ImageView) view6.findViewById(p025ba.e.ivClose);
                        }
                        return null;
                }
            }
        });
        final int i14 = 5;
        this.f27978w = C2131j.b(new Function0(this) { // from class: Ja.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckCVVFragment f4663b;

            {
                this.f4663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckCVVFragment checkCVVFragment = this.f4663b;
                switch (i14) {
                    case 0:
                        CheckCVVFragment.a aVar = CheckCVVFragment.f27973A;
                        View view = checkCVVFragment.f27318b;
                        if (view != null) {
                            return (Button) view.findViewById(p025ba.e.buttonNext);
                        }
                        return null;
                    case 1:
                        CheckCVVFragment.a aVar2 = CheckCVVFragment.f27973A;
                        View view2 = checkCVVFragment.f27318b;
                        if (view2 != null) {
                            return (AppCompatEditText) view2.findViewById(p025ba.e.editCvv);
                        }
                        return null;
                    case 2:
                        CheckCVVFragment.a aVar3 = CheckCVVFragment.f27973A;
                        View view3 = checkCVVFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(p025ba.e.tvTitle);
                        }
                        return null;
                    case 3:
                        CheckCVVFragment.a aVar4 = CheckCVVFragment.f27973A;
                        View view4 = checkCVVFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(p025ba.e.tvBankName);
                        }
                        return null;
                    case 4:
                        CheckCVVFragment.a aVar5 = CheckCVVFragment.f27973A;
                        View view5 = checkCVVFragment.f27318b;
                        if (view5 != null) {
                            return (ImageView) view5.findViewById(p025ba.e.ivBank);
                        }
                        return null;
                    default:
                        CheckCVVFragment.a aVar6 = CheckCVVFragment.f27973A;
                        View view6 = checkCVVFragment.f27318b;
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
        return g.core_check_cvv_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        y((ImageView) this.f27977v.getValue(), (TextView) this.t.getValue());
        TextView textView = (TextView) this.f27976p.getValue();
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC0338k(this, 0));
        }
        x((ImageView) this.f27978w.getValue());
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f27975o.getValue();
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(new i(this, 20));
        }
        t tVar = this.f27974j;
        Button button = (Button) tVar.getValue();
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = (Button) tVar.getValue();
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC0338k(this, 1));
        }
        return 0;
    }
}
