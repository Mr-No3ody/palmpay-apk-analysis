package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.B;
import F8.d;
import F8.e;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.QueryGuardianInfoRsp;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveActivationSuccessFragment;
import com.transsnet.palmpay.core.bean.CommonKeyValueItem;
import com.transsnet.palmpay.util.ClipboardUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveActivationSuccessFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGuardianApproveActivationSuccessFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuardianApproveActivationSuccessFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveActivationSuccessFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,157:1\n1#2:158\n257#3,2:159\n257#3,2:161\n*S KotlinDebug\n*F\n+ 1 GuardianApproveActivationSuccessFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/GuardianApproveActivationSuccessFragment\n*L\n95#1:159,2\n98#1:161,2\n*E\n"})
public final class GuardianApproveActivationSuccessFragment extends BaseAddGuardianFragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f26143w = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public B f26144p;
    public SubmitGuardianRsp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final P8.a f26145v = new P8.a(0);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        List<CommonKeyValueItem> list;
        B b7;
        B b10;
        super.k();
        B b11 = this.f26144p;
        y(b11 != null ? (PpTitleBar) b11.f589B : null);
        B b12 = this.f26144p;
        if (b12 != null) {
            h.d((PpTitleBar) b12.f589B);
        }
        GuardianApproveActivity guardianApproveActivityW = w();
        if (guardianApproveActivityW != null) {
            guardianApproveActivityW.n();
        }
        C0525w c0525wF = C0525w.f();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("extra_data") : null;
        c0525wF.getClass();
        this.t = (SubmitGuardianRsp) C0525w.d(string, SubmitGuardianRsp.class);
        B b13 = this.f26144p;
        if (b13 != null) {
            ((RecyclerView) b13.f600p).setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        B b14 = this.f26144p;
        P8.a aVar = this.f26145v;
        if (b14 != null) {
            ((RecyclerView) b14.f600p).setAdapter(aVar);
        }
        GuardianApproveActivity guardianApproveActivityW2 = w();
        QueryGuardianInfoRsp queryGuardianInfoRsp = guardianApproveActivityW2 != null ? guardianApproveActivityW2.f25860d : null;
        String string2 = getString(F8.h.ac_minor_info_placeholder);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        Bundle arguments2 = getArguments();
        String string3 = arguments2 != null ? arguments2.getString("arg_teen_account_no") : null;
        B b15 = this.f26144p;
        if (b15 != null) {
            TextView textView = (TextView) b15.t;
            if (string3 != null) {
                if (TextUtils.isEmpty(string3)) {
                    string3 = null;
                }
                if (string3 != null) {
                    string2 = string3;
                }
            }
            textView.setText(string2);
        }
        SubmitGuardianRsp submitGuardianRsp = this.t;
        if (submitGuardianRsp != null && (list = submitGuardianRsp.contentList) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list == null) {
                if (queryGuardianInfoRsp != null) {
                    list = queryGuardianInfoRsp.contentList;
                } else {
                    list = null;
                }
            }
        } else if (queryGuardianInfoRsp != null) {
            list = queryGuardianInfoRsp.contentList;
        } else {
            list = null;
        }
        List<CommonKeyValueItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            aVar.setList(z.f38935a);
            B b16 = this.f26144p;
            if (b16 != null) {
                ((FrameLayout) b16.f599o).setVisibility(8);
            }
        } else {
            aVar.setList(list2);
            B b17 = this.f26144p;
            if (b17 != null) {
                ((FrameLayout) b17.f599o).setVisibility(0);
            }
        }
        B b18 = this.f26144p;
        if (b18 != null) {
            TextView textView2 = b18.f594e;
            SubmitGuardianRsp submitGuardianRsp2 = this.t;
            textView2.setText(submitGuardianRsp2 != null ? submitGuardianRsp2.middleTitle : null);
        }
        B b19 = this.f26144p;
        if (b19 != null) {
            TextView textView3 = (TextView) b19.t;
            SubmitGuardianRsp submitGuardianRsp3 = this.t;
            textView3.setText(submitGuardianRsp3 != null ? submitGuardianRsp3.middleContent : null);
        }
        SubmitGuardianRsp submitGuardianRsp4 = this.t;
        if (!TextUtils.isEmpty(submitGuardianRsp4 != null ? submitGuardianRsp4.title : null) && (b10 = this.f26144p) != null) {
            TextView textView4 = (TextView) b10.f602w;
            SubmitGuardianRsp submitGuardianRsp5 = this.t;
            textView4.setText(submitGuardianRsp5 != null ? submitGuardianRsp5.title : null);
        }
        SubmitGuardianRsp submitGuardianRsp6 = this.t;
        if (!TextUtils.isEmpty(submitGuardianRsp6 != null ? submitGuardianRsp6.statusDescribe : null) && (b7 = this.f26144p) != null) {
            TextView textView5 = (TextView) b7.f601v;
            SubmitGuardianRsp submitGuardianRsp7 = this.t;
            textView5.setText(submitGuardianRsp7 != null ? submitGuardianRsp7.statusDescribe : null);
        }
        B b20 = this.f26144p;
        if (b20 != null) {
            final int i7 = 0;
            ((IconicsImageView) b20.f598j).setOnClickListener(new View.OnClickListener(this) { // from class: T8.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GuardianApproveActivationSuccessFragment f9058b;

                {
                    this.f9058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView6;
                    CharSequence text;
                    String string4 = null;
                    GuardianApproveActivationSuccessFragment guardianApproveActivationSuccessFragment = this.f9058b;
                    switch (i7) {
                        case 0:
                            int i10 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                B b21 = guardianApproveActivationSuccessFragment.f26144p;
                                if (b21 != null && (textView6 = (TextView) b21.t) != null && (text = textView6.getText()) != null) {
                                    string4 = text.toString();
                                }
                                if (string4 == null) {
                                    string4 = "";
                                }
                                if (TextUtils.isEmpty(string4) || string4.equals(guardianApproveActivationSuccessFragment.getString(F8.h.ac_minor_info_placeholder))) {
                                    Context context = guardianApproveActivationSuccessFragment.getContext();
                                    if (context != null) {
                                        p220oa.h.x(context, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_nothing));
                                    }
                                } else {
                                    ClipboardUtils.copyText(string4);
                                    Context context2 = guardianApproveActivationSuccessFragment.getContext();
                                    if (context2 != null) {
                                        p220oa.h.x(context2, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_success));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            int i11 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                i0.H(null);
                                E activity = guardianApproveActivationSuccessFragment.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                break;
                            }
                            break;
                        case 2:
                            int i12 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                guardianApproveActivationSuccessFragment.getClass();
                                ARouter.getInstance().build("/main/minor_account_list").navigation();
                                break;
                            }
                            break;
                        default:
                            int i13 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                Bundle arguments3 = guardianApproveActivationSuccessFragment.getArguments();
                                string4 = arguments3 != null ? arguments3.getString("arg_teen_member_id") : null;
                                if (string4 == null || string4.length() == 0) {
                                    q0.u("/main/minor_account_list");
                                } else {
                                    q0.v("/main/minor_account_detail", "teenMemberId", string4);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        B b21 = this.f26144p;
        if (b21 != null) {
            final int i10 = 1;
            ((PpButton) b21.f596g).setOnClickListener(new View.OnClickListener(this) { // from class: T8.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GuardianApproveActivationSuccessFragment f9058b;

                {
                    this.f9058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView6;
                    CharSequence text;
                    String string4 = null;
                    GuardianApproveActivationSuccessFragment guardianApproveActivationSuccessFragment = this.f9058b;
                    switch (i10) {
                        case 0:
                            int i11 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                B b22 = guardianApproveActivationSuccessFragment.f26144p;
                                if (b22 != null && (textView6 = (TextView) b22.t) != null && (text = textView6.getText()) != null) {
                                    string4 = text.toString();
                                }
                                if (string4 == null) {
                                    string4 = "";
                                }
                                if (TextUtils.isEmpty(string4) || string4.equals(guardianApproveActivationSuccessFragment.getString(F8.h.ac_minor_info_placeholder))) {
                                    Context context = guardianApproveActivationSuccessFragment.getContext();
                                    if (context != null) {
                                        p220oa.h.x(context, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_nothing));
                                    }
                                } else {
                                    ClipboardUtils.copyText(string4);
                                    Context context2 = guardianApproveActivationSuccessFragment.getContext();
                                    if (context2 != null) {
                                        p220oa.h.x(context2, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_success));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            int i12 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                i0.H(null);
                                E activity = guardianApproveActivationSuccessFragment.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                break;
                            }
                            break;
                        case 2:
                            int i13 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                guardianApproveActivationSuccessFragment.getClass();
                                ARouter.getInstance().build("/main/minor_account_list").navigation();
                                break;
                            }
                            break;
                        default:
                            int i14 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                Bundle arguments3 = guardianApproveActivationSuccessFragment.getArguments();
                                string4 = arguments3 != null ? arguments3.getString("arg_teen_member_id") : null;
                                if (string4 == null || string4.length() == 0) {
                                    q0.u("/main/minor_account_list");
                                } else {
                                    q0.v("/main/minor_account_detail", "teenMemberId", string4);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        B b22 = this.f26144p;
        if (b22 != null) {
            final int i11 = 2;
            ((LinearLayout) b22.f591b).setOnClickListener(new View.OnClickListener(this) { // from class: T8.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GuardianApproveActivationSuccessFragment f9058b;

                {
                    this.f9058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView6;
                    CharSequence text;
                    String string4 = null;
                    GuardianApproveActivationSuccessFragment guardianApproveActivationSuccessFragment = this.f9058b;
                    switch (i11) {
                        case 0:
                            int i12 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                B b23 = guardianApproveActivationSuccessFragment.f26144p;
                                if (b23 != null && (textView6 = (TextView) b23.t) != null && (text = textView6.getText()) != null) {
                                    string4 = text.toString();
                                }
                                if (string4 == null) {
                                    string4 = "";
                                }
                                if (TextUtils.isEmpty(string4) || string4.equals(guardianApproveActivationSuccessFragment.getString(F8.h.ac_minor_info_placeholder))) {
                                    Context context = guardianApproveActivationSuccessFragment.getContext();
                                    if (context != null) {
                                        p220oa.h.x(context, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_nothing));
                                    }
                                } else {
                                    ClipboardUtils.copyText(string4);
                                    Context context2 = guardianApproveActivationSuccessFragment.getContext();
                                    if (context2 != null) {
                                        p220oa.h.x(context2, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_success));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            int i13 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                i0.H(null);
                                E activity = guardianApproveActivationSuccessFragment.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                break;
                            }
                            break;
                        case 2:
                            int i14 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                guardianApproveActivationSuccessFragment.getClass();
                                ARouter.getInstance().build("/main/minor_account_list").navigation();
                                break;
                            }
                            break;
                        default:
                            int i15 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                Bundle arguments3 = guardianApproveActivationSuccessFragment.getArguments();
                                string4 = arguments3 != null ? arguments3.getString("arg_teen_member_id") : null;
                                if (string4 == null || string4.length() == 0) {
                                    q0.u("/main/minor_account_list");
                                } else {
                                    q0.v("/main/minor_account_detail", "teenMemberId", string4);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        B b23 = this.f26144p;
        if (b23 != null) {
            final int i12 = 3;
            ((LinearLayout) b23.f592c).setOnClickListener(new View.OnClickListener(this) { // from class: T8.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ GuardianApproveActivationSuccessFragment f9058b;

                {
                    this.f9058b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView6;
                    CharSequence text;
                    String string4 = null;
                    GuardianApproveActivationSuccessFragment guardianApproveActivationSuccessFragment = this.f9058b;
                    switch (i12) {
                        case 0:
                            int i13 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                B b24 = guardianApproveActivationSuccessFragment.f26144p;
                                if (b24 != null && (textView6 = (TextView) b24.t) != null && (text = textView6.getText()) != null) {
                                    string4 = text.toString();
                                }
                                if (string4 == null) {
                                    string4 = "";
                                }
                                if (TextUtils.isEmpty(string4) || string4.equals(guardianApproveActivationSuccessFragment.getString(F8.h.ac_minor_info_placeholder))) {
                                    Context context = guardianApproveActivationSuccessFragment.getContext();
                                    if (context != null) {
                                        p220oa.h.x(context, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_nothing));
                                    }
                                } else {
                                    ClipboardUtils.copyText(string4);
                                    Context context2 = guardianApproveActivationSuccessFragment.getContext();
                                    if (context2 != null) {
                                        p220oa.h.x(context2, guardianApproveActivationSuccessFragment.getString(F8.h.ac_guardian_copy_success));
                                    }
                                }
                                break;
                            }
                            break;
                        case 1:
                            int i14 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                i0.H(null);
                                E activity = guardianApproveActivationSuccessFragment.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                                break;
                            }
                            break;
                        case 2:
                            int i15 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                guardianApproveActivationSuccessFragment.getClass();
                                ARouter.getInstance().build("/main/minor_account_list").navigation();
                                break;
                            }
                            break;
                        default:
                            int i16 = GuardianApproveActivationSuccessFragment.f26143w;
                            if (!r0.U0()) {
                                Bundle arguments3 = guardianApproveActivationSuccessFragment.getArguments();
                                string4 = arguments3 != null ? arguments3.getString("arg_teen_member_id") : null;
                                if (string4 == null || string4.length() == 0) {
                                    q0.u("/main/minor_account_list");
                                } else {
                                    q0.v("/main/minor_account_detail", "teenMemberId", string4);
                                }
                                break;
                            }
                            break;
                    }
                }
            });
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_guardian_approve_activation_success, viewGroup, false);
        int i7 = d.bottomViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = d.btnStartPalmPay;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null && (viewM = p059e1.a.m((i7 = d.dividerList), viewInflate)) != null) {
                i7 = d.ivCopy;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = d.ivSuccessIcon;
                    if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = d.layoutAccountHighlight;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = d.layoutKeyValueList;
                            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                            if (frameLayout != null) {
                                i7 = d.recyclerKeyValue;
                                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                if (recyclerView != null) {
                                    i7 = d.rowMinorManagement;
                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout != null) {
                                        i7 = d.rowTransferToMinor;
                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout2 != null) {
                                            i7 = d.scrollContent;
                                            if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                                                i7 = d.titleBar;
                                                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                if (ppTitleBar != null) {
                                                    i7 = d.tvAccountLabel;
                                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView != null) {
                                                        i7 = d.tvAccountNo;
                                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView2 != null) {
                                                            i7 = d.tvSubtitle;
                                                            TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView3 != null) {
                                                                i7 = d.tvTitle;
                                                                TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                if (textView4 != null) {
                                                                    i7 = d.tvYouMayChoose;
                                                                    TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                    if (textView5 != null) {
                                                                        B b7 = new B((ConstraintLayout) viewInflate, viewStub, ppButton, viewM, iconicsImageView, frameLayout, recyclerView, linearLayout, linearLayout2, ppTitleBar, textView, textView2, textView3, textView4, textView5);
                                                                        this.f26144p = b7;
                                                                        return b7;
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        B b7 = this.f26144p;
        if (b7 != null) {
            return (ViewStub) b7.f595f;
        }
        return null;
    }
}
