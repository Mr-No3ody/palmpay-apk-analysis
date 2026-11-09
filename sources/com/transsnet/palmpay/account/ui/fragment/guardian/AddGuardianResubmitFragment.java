package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.D;
import C0.AbstractC0130w;
import C9.C0139f;
import C9.Q;
import F8.d;
import F8.e;
import Fd.G;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.TeenAuthRecord;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.AddGuardianResubmitFragment;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p097g9.C1708f;
import p097g9.C1709g;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResubmitFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddGuardianResubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGuardianResubmitFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResubmitFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,199:1\n115#2,8:200\n145#2:208\n71#2,8:209\n112#2:217\n1869#3,2:218\n*S KotlinDebug\n*F\n+ 1 AddGuardianResubmitFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianResubmitFragment\n*L\n92#1:200,8\n92#1:208\n111#1:209,8\n111#1:217\n184#1:218,2\n*E\n"})
public final class AddGuardianResubmitFragment extends BaseAddGuardianFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public D f26139p;
    public TeenAuthRecord t;

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        String str;
        D d2 = this.f26139p;
        y(d2 != null ? (PpTitleBar) d2.f626v : null);
        D d10 = this.f26139p;
        if (d10 != null) {
            TextView textView = d10.f623j;
            AddGuardianActivity addGuardianActivityV = v();
            if (TextUtils.isEmpty(addGuardianActivityV != null ? addGuardianActivityV.f25815d : null)) {
                AddGuardianActivity addGuardianActivityV2 = v();
                Integer numValueOf = addGuardianActivityV2 != null ? Integer.valueOf(addGuardianActivityV2.f25814c) : null;
                if (numValueOf != null && numValueOf.intValue() == 4) {
                    str = "Authorization Failed";
                } else if (numValueOf != null && numValueOf.intValue() == 5) {
                    str = "Authorization Time Out";
                } else if (numValueOf != null && numValueOf.intValue() == 6) {
                    str = "Authorization Revoked";
                } else {
                    str = (numValueOf != null && numValueOf.intValue() == 7) ? "Authorization Expired" : "Authorization in Progress";
                }
            } else {
                AddGuardianActivity addGuardianActivityV3 = v();
                str = addGuardianActivityV3 != null ? addGuardianActivityV3.f25815d : null;
            }
            textView.setText(str);
        }
        D d11 = this.f26139p;
        if (d11 != null) {
            TextView textView2 = d11.f622i;
            AddGuardianActivity addGuardianActivityV4 = v();
            textView2.setText(addGuardianActivityV4 != null ? addGuardianActivityV4.f25816e : null);
        }
        AddGuardianActivity addGuardianActivityV5 = v();
        if (addGuardianActivityV5 == null || addGuardianActivityV5.f25814c != 4) {
            D d12 = this.f26139p;
            if (d12 != null) {
                final int i7 = 1;
                ((PpButton) d12.t).setOnClickListener(new View.OnClickListener(this) { // from class: T8.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AddGuardianResubmitFragment f9054b;

                    {
                        this.f9054b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.f9054b.z();
                                break;
                            case 1:
                                AddGuardianResubmitFragment addGuardianResubmitFragment = this.f9054b;
                                AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) addGuardianResubmitFragment.f27333i;
                                if (addGuardianViewModel != null) {
                                    AddGuardianActivity addGuardianActivityV6 = addGuardianResubmitFragment.v();
                                    String str2 = addGuardianActivityV6 != null ? addGuardianActivityV6.f25813b : null;
                                    TeenAuthRecord teenAuthRecord = addGuardianResubmitFragment.t;
                                    p140j8.f.s(addGuardianViewModel, new C1709g(str2, teenAuthRecord != null ? teenAuthRecord.guardianMemberId : null, null), addGuardianViewModel.f26409g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            default:
                                this.f9054b.z();
                                break;
                        }
                    }
                });
            }
            D d13 = this.f26139p;
            if (d13 != null) {
                final int i10 = 2;
                ((PpButton) d13.f617c).setOnClickListener(new View.OnClickListener(this) { // from class: T8.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AddGuardianResubmitFragment f9054b;

                    {
                        this.f9054b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.f9054b.z();
                                break;
                            case 1:
                                AddGuardianResubmitFragment addGuardianResubmitFragment = this.f9054b;
                                AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) addGuardianResubmitFragment.f27333i;
                                if (addGuardianViewModel != null) {
                                    AddGuardianActivity addGuardianActivityV6 = addGuardianResubmitFragment.v();
                                    String str2 = addGuardianActivityV6 != null ? addGuardianActivityV6.f25813b : null;
                                    TeenAuthRecord teenAuthRecord = addGuardianResubmitFragment.t;
                                    p140j8.f.s(addGuardianViewModel, new C1709g(str2, teenAuthRecord != null ? teenAuthRecord.guardianMemberId : null, null), addGuardianViewModel.f26409g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            default:
                                this.f9054b.z();
                                break;
                        }
                    }
                });
            }
        } else {
            D d14 = this.f26139p;
            if (d14 != null) {
                h.c((PpButton) d14.f617c);
            }
            D d15 = this.f26139p;
            if (d15 != null) {
                ((PpButton) d15.t).setText(CommonViewExtKt.string(F8.h.ac_resubmit, getContext()));
            }
            D d16 = this.f26139p;
            if (d16 != null) {
                final int i11 = 0;
                ((PpButton) d16.t).setOnClickListener(new View.OnClickListener(this) { // from class: T8.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AddGuardianResubmitFragment f9054b;

                    {
                        this.f9054b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.f9054b.z();
                                break;
                            case 1:
                                AddGuardianResubmitFragment addGuardianResubmitFragment = this.f9054b;
                                AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) addGuardianResubmitFragment.f27333i;
                                if (addGuardianViewModel != null) {
                                    AddGuardianActivity addGuardianActivityV6 = addGuardianResubmitFragment.v();
                                    String str2 = addGuardianActivityV6 != null ? addGuardianActivityV6.f25813b : null;
                                    TeenAuthRecord teenAuthRecord = addGuardianResubmitFragment.t;
                                    p140j8.f.s(addGuardianViewModel, new C1709g(str2, teenAuthRecord != null ? teenAuthRecord.guardianMemberId : null, null), addGuardianViewModel.f26409g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            default:
                                this.f9054b.z();
                                break;
                        }
                    }
                });
            }
        }
        super.k();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_add_guardian_resubmit, viewGroup, false);
        int i7 = d.bottomViewStub;
        ViewStub viewStub = (ViewStub) a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = d.btnChange;
            PpButton ppButton = (PpButton) a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = d.btnContinue;
                PpButton ppButton2 = (PpButton) a.m(i7, viewInflate);
                if (ppButton2 != null) {
                    i7 = d.ivIcon;
                    if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                        i7 = d.ivIcon1;
                        ImageView imageView = (ImageView) a.m(i7, viewInflate);
                        if (imageView != null) {
                            i7 = d.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = d.tv11;
                                TextView textView = (TextView) a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = d.tv12;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = d.tv13;
                                        TextView textView3 = (TextView) a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            i7 = d.tvMsg;
                                            TextView textView4 = (TextView) a.m(i7, viewInflate);
                                            if (textView4 != null) {
                                                i7 = d.tvTitle;
                                                TextView textView5 = (TextView) a.m(i7, viewInflate);
                                                if (textView5 != null) {
                                                    i7 = d.viewContainer;
                                                    LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                                                    if (linearLayout != null) {
                                                        i7 = d.viewGuardianInfo;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
                                                        if (constraintLayout != null) {
                                                            i7 = d.viewInstruction;
                                                            LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                                                            if (linearLayout2 != null) {
                                                                D d2 = new D((ConstraintLayout) viewInflate, viewStub, ppButton, ppButton2, imageView, ppTitleBar, textView, textView2, textView3, textView4, textView5, linearLayout, constraintLayout, linearLayout2);
                                                                this.f26139p = d2;
                                                                return d2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        if (addGuardianViewModel != null) {
            AddGuardianActivity addGuardianActivityV = v();
            f.s(addGuardianViewModel, new C1708f(addGuardianActivityV != null ? addGuardianActivityV.f25813b : null, null), addGuardianViewModel.f26408f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AddGuardianViewModel addGuardianViewModel2 = (AddGuardianViewModel) this.f27333i;
        l lVar = addGuardianViewModel2 != null ? addGuardianViewModel2.f26408f : null;
        if (lVar != null) {
            lVar.e(this, new G(new C0139f(this, 27), 14));
        }
        AddGuardianViewModel addGuardianViewModel3 = (AddGuardianViewModel) this.f27333i;
        l lVar2 = addGuardianViewModel3 != null ? addGuardianViewModel3.f26409g : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new Q(29, this, this), 14));
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        D d2 = this.f26139p;
        if (d2 != null) {
            return (ViewStub) d2.f625p;
        }
        return null;
    }

    public final void z() {
        AbstractC0130w abstractC0130w = this.f26142o;
        if (abstractC0130w != null) {
            abstractC0130w.h(d.fragment_add_guardian_step_info, null, BaseAddGuardianFragment.u(Integer.valueOf(d.fragment_add_guardian_step_resubmit), true));
        }
    }
}
