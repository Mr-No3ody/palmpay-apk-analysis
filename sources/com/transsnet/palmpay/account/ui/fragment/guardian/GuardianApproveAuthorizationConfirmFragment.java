package com.transsnet.palmpay.account.ui.fragment.guardian;

import A8.g;
import Bc.C0108e;
import F8.e;
import F8.h;
import L6.b;
import M3.f;
import P8.a;
import R8.d;
import T8.o;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.QueryGuardianInfoRsp;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonKeyValueItem;
import com.transsnet.palmpay.core.util.statistic.IAutoTrackPageEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import io.fastkv.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveAuthorizationConfirmFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "Lcom/transsnet/palmpay/core/util/statistic/IAutoTrackPageEvent;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuardianApproveAuthorizationConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianApproveAuthorizationConfirmFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveAuthorizationConfirmFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,269:1\n171#2,12:270\n215#2:282\n257#3,2:283\n257#3,2:285\n*S KotlinDebug\n*F\n+ 1 GuardianApproveAuthorizationConfirmFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveAuthorizationConfirmFragment\n*L\n100#1:270,12\n100#1:282\n132#1:283,2\n135#1:285,2\n*E\n"})
public final class GuardianApproveAuthorizationConfirmFragment extends BaseAddGuardianFragment implements IAutoTrackPageEvent {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0108e f26146p;
    public final a t = new a(0);

    @Override // com.transsnet.palmpay.core.util.statistic.IAutoTrackPageEvent
    public final String getPageViewEventName() {
        return "Popup_Minor_InfoConfirm_Exposure";
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26141j) {
            return false;
        }
        f fVar = new f(this, 18);
        Context context = getContext();
        if (context == null) {
            return true;
        }
        String string = getString(h.ac_guardian_exit_dialog_title);
        String string2 = getString(h.ac_guardian_exit_dialog_message);
        int i7 = h.ac_quit;
        int i10 = h.ac_continue;
        n.O(context, 0, null, string, null, null, null, string2, Integer.valueOf(i10), null, null, Integer.valueOf(i7), null, new d(fVar, 10), null, false, 0, 8377979);
        return true;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        String str;
        String str2;
        C0108e c0108e = this.f26146p;
        y(c0108e != null ? (PpTitleBar) c0108e.f693o : null);
        C0108e c0108e2 = this.f26146p;
        if (c0108e2 != null) {
            ((RecyclerView) c0108e2.f692j).setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C0108e c0108e3 = this.f26146p;
        a aVar = this.t;
        if (c0108e3 != null) {
            ((RecyclerView) c0108e3.f692j).setAdapter(aVar);
        }
        String string = getString(h.ac_guardian_auth_agree_prefix);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(h.ac_terms_conditions_amp);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String str3 = string + " " + string2;
        SpannableString spannableString = new SpannableString(str3);
        int iE = StringsKt.E(str3, string2, 0, false, 6);
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorTextNormal, requireContext());
        int iColorInt2 = CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext());
        if (iE >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(iColorInt), 0, iE, 33);
        }
        if (iE >= 0) {
            spannableString.setSpan(new Dd.d(iColorInt2, 12), iE, str3.length(), 33);
        }
        C0108e c0108e4 = this.f26146p;
        if (c0108e4 != null) {
            c0108e4.f685b.setText(spannableString);
        }
        C0108e c0108e5 = this.f26146p;
        if (c0108e5 != null) {
            c0108e5.f685b.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C0108e c0108e6 = this.f26146p;
        if (c0108e6 != null) {
            c0108e6.f685b.setHighlightColor(0);
        }
        GuardianApproveActivity guardianApproveActivityW = w();
        QueryGuardianInfoRsp queryGuardianInfoRsp = guardianApproveActivityW != null ? guardianApproveActivityW.f25860d : null;
        C0108e c0108e7 = this.f26146p;
        String str4 = "";
        if (c0108e7 != null) {
            TextView textView = (TextView) c0108e7.f694p;
            if (queryGuardianInfoRsp == null || (str2 = queryGuardianInfoRsp.title) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        C0108e c0108e8 = this.f26146p;
        if (c0108e8 != null) {
            TextView textView2 = c0108e8.f686c;
            if (queryGuardianInfoRsp != null && (str = queryGuardianInfoRsp.subTitle) != null) {
                str4 = str;
            }
            textView2.setText(str4);
        }
        List<CommonKeyValueItem> list = queryGuardianInfoRsp != null ? queryGuardianInfoRsp.contentList : null;
        if (list == null || list.isEmpty()) {
            aVar.setList(z.f38935a);
            C0108e c0108e9 = this.f26146p;
            if (c0108e9 != null) {
                ((FrameLayout) c0108e9.f691i).setVisibility(8);
            }
        } else {
            aVar.setList(list);
            C0108e c0108e10 = this.f26146p;
            if (c0108e10 != null) {
                ((FrameLayout) c0108e10.f691i).setVisibility(0);
            }
        }
        C0108e c0108e11 = this.f26146p;
        if (c0108e11 != null) {
            ((IconicsCheckBox) c0108e11.f690g).setOnCheckedChangeListener(new g(this, 3));
        }
        C0108e c0108e12 = this.f26146p;
        if (c0108e12 != null) {
            ((PpButton) c0108e12.f689f).setOnClickListener(new d(this, 9));
        }
        C0108e c0108e13 = this.f26146p;
        if (c0108e13 != null) {
            ((PpButton) c0108e13.f689f).setEnabled(((IconicsCheckBox) c0108e13.f690g).isChecked());
        }
        super.k();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_add_guardian_authorization_confirm, viewGroup, false);
        int i7 = F8.d.bottomViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = F8.d.btnAuthorize;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = F8.d.checkAgreement;
                IconicsCheckBox iconicsCheckBox = (IconicsCheckBox) p059e1.a.m(i7, viewInflate);
                if (iconicsCheckBox != null) {
                    i7 = F8.d.layoutMinorCard;
                    FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                    if (frameLayout != null) {
                        i7 = F8.d.recyclerKeyValue;
                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                        if (recyclerView != null) {
                            i7 = F8.d.titleBar;
                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                            if (ppTitleBar != null) {
                                i7 = F8.d.tvAgreement;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = F8.d.tvMsg;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        i7 = F8.d.tvTitle;
                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView3 != null) {
                                            C0108e c0108e = new C0108e((LinearLayout) viewInflate, viewStub, ppButton, iconicsCheckBox, frameLayout, recyclerView, ppTitleBar, textView, textView2, textView3, 1);
                                            this.f26146p = c0108e;
                                            return c0108e;
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
        l lVar = addGuardianViewModel != null ? addGuardianViewModel.f26411j : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new o(0, this, this)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        GuardianApproveActivity guardianApproveActivityW = w();
        if (guardianApproveActivityW != null) {
            guardianApproveActivityW.n();
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        C0108e c0108e = this.f26146p;
        if (c0108e != null) {
            return (ViewStub) c0108e.f688e;
        }
        return null;
    }
}
