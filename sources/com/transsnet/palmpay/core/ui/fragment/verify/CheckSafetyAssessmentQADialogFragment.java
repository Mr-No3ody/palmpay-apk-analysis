package com.transsnet.palmpay.core.ui.fragment.verify;

import G9.j;
import Ma.v;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQADialogFragment;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckSafetyAssessmentQAFragment;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p142ja.i;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQADialogFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lja/i;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckSafetyAssessmentQADialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckSafetyAssessmentQADialogFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQADialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,54:1\n172#2,9:55\n*S KotlinDebug\n*F\n+ 1 CheckSafetyAssessmentQADialogFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQADialogFragment\n*L\n17#1:55,9\n*E\n"})
public final class CheckSafetyAssessmentQADialogFragment extends BaseMvvmVBFragment<BaseViewModel, i> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f28012p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CheckSafetyAssessmentQAFragment f28013o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final CheckSafetyAssessmentQADialogFragment getINSTANCE() {
            return (CheckSafetyAssessmentQADialogFragment) CheckSafetyAssessmentQADialogFragment.f28012p.getValue();
        }

        private a() {
        }
    }

    static {
        new a(null);
        f28012p = C2131j.a(EnumC2132k.f43969a, new j(24));
    }

    public CheckSafetyAssessmentQADialogFragment() {
        p002a.a.h(this, G.a(v.class), new Ja.v(this, 0), new Ja.v(this, 1), new Ja.v(this, 2));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        i iVar = (i) this.f27335j;
        if (iVar != null) {
            final int i7 = 0;
            iVar.f38485c.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckSafetyAssessmentQADialogFragment f4682b;

                {
                    this.f4682b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckSafetyAssessmentQADialogFragment checkSafetyAssessmentQADialogFragment = this.f4682b;
                    switch (i7) {
                        case 0:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment != null && (payVerifyViewModel = (PayVerifyViewModel) checkSafetyAssessmentQAFragment.f27333i) != null) {
                                String token = checkSafetyAssessmentQAFragment.f28017p;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                Ma.t tVar = new Ma.t(token, null);
                                com.transsnet.palmpay.core.base.l lVar = payVerifyViewModel.f28070e;
                                lVar.f27356m = token;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(payVerifyViewModel, tVar, lVar, 0L);
                                break;
                            }
                            break;
                        case 1:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment2 != null) {
                                checkSafetyAssessmentQAFragment2.z();
                            }
                            break;
                        default:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment3 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment3 != null) {
                                checkSafetyAssessmentQAFragment3.z();
                            }
                            break;
                    }
                }
            });
        }
        i iVar2 = (i) this.f27335j;
        if (iVar2 != null) {
            final int i10 = 1;
            iVar2.f38484b.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckSafetyAssessmentQADialogFragment f4682b;

                {
                    this.f4682b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckSafetyAssessmentQADialogFragment checkSafetyAssessmentQADialogFragment = this.f4682b;
                    switch (i10) {
                        case 0:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment != null && (payVerifyViewModel = (PayVerifyViewModel) checkSafetyAssessmentQAFragment.f27333i) != null) {
                                String token = checkSafetyAssessmentQAFragment.f28017p;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                Ma.t tVar = new Ma.t(token, null);
                                com.transsnet.palmpay.core.base.l lVar = payVerifyViewModel.f28070e;
                                lVar.f27356m = token;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(payVerifyViewModel, tVar, lVar, 0L);
                                break;
                            }
                            break;
                        case 1:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment2 != null) {
                                checkSafetyAssessmentQAFragment2.z();
                            }
                            break;
                        default:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment3 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment3 != null) {
                                checkSafetyAssessmentQAFragment3.z();
                            }
                            break;
                    }
                }
            });
        }
        i iVar3 = (i) this.f27335j;
        if (iVar3 != null) {
            final int i11 = 2;
            iVar3.f38488f.setOnClickListener(new View.OnClickListener(this) { // from class: Ja.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CheckSafetyAssessmentQADialogFragment f4682b;

                {
                    this.f4682b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PayVerifyViewModel payVerifyViewModel;
                    CheckSafetyAssessmentQADialogFragment checkSafetyAssessmentQADialogFragment = this.f4682b;
                    switch (i11) {
                        case 0:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment != null && (payVerifyViewModel = (PayVerifyViewModel) checkSafetyAssessmentQAFragment.f27333i) != null) {
                                String token = checkSafetyAssessmentQAFragment.f28017p;
                                if (token == null) {
                                    token = "";
                                }
                                Intrinsics.checkNotNullParameter(token, "token");
                                Ma.t tVar = new Ma.t(token, null);
                                com.transsnet.palmpay.core.base.l lVar = payVerifyViewModel.f28070e;
                                lVar.f27356m = token;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(payVerifyViewModel, tVar, lVar, 0L);
                                break;
                            }
                            break;
                        case 1:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment2 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment2 != null) {
                                checkSafetyAssessmentQAFragment2.z();
                            }
                            break;
                        default:
                            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment3 = checkSafetyAssessmentQADialogFragment.f28013o;
                            if (checkSafetyAssessmentQAFragment3 != null) {
                                checkSafetyAssessmentQAFragment3.z();
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Fragment parentFragment = getParentFragment();
        Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
        this.f28013o = parentFragment2 instanceof CheckSafetyAssessmentQAFragment ? (CheckSafetyAssessmentQAFragment) parentFragment2 : null;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("desc") : null;
        i iVar = (i) this.f27335j;
        if (iVar == null) {
            return 0;
        }
        TextView textView = iVar.f38486d;
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_safety_assessment_qa_dialog_fragment, viewGroup, false);
        int i7 = e.cancelBtn;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
        if (ppButton != null) {
            i7 = e.ivIcon;
            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.submitBtn;
                PpButton ppButton2 = (PpButton) p059e1.a.m(i7, viewInflate);
                if (ppButton2 != null) {
                    i7 = e.tvContent;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = e.tvTitle;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = e.vClose;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                            if (iconicsImageView != null) {
                                i7 = e.viewContainer;
                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    i iVar = new i((ConstraintLayout) viewInflate, ppButton, ppButton2, textView, textView2, iconicsImageView);
                                    Intrinsics.checkNotNullExpressionValue(iVar, "inflate(...)");
                                    return iVar;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
