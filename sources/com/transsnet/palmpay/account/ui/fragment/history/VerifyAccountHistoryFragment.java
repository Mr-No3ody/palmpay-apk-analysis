package com.transsnet.palmpay.account.ui.fragment.history;

import Bc.C0107d;
import Bc.i;
import F8.e;
import Fd.G;
import U8.c;
import U8.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.account.bean.AccountHistoryListRsp;
import com.transsnet.palmpay.account.bean.req.VerifyAccountHistoryReq;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.fragment.history.VerifyAccountHistoryFragment;
import com.transsnet.palmpay.account.ui.viewmodel.VerifyAccountHistoryViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097g9.Z;
import p140j8.f;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/history/VerifyAccountHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/VerifyAccountHistoryViewModel;", "<init>", "()V", "a", "U8/c", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifyAccountHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyAccountHistoryFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/history/VerifyAccountHistoryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n171#2,12:256\n215#2:268\n171#2,12:269\n215#2:281\n1869#3,2:282\n1869#3,2:284\n1869#3,2:286\n*S KotlinDebug\n*F\n+ 1 VerifyAccountHistoryFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/history/VerifyAccountHistoryFragment\n*L\n80#1:256,12\n80#1:268\n104#1:269,12\n104#1:281\n208#1:282,2\n236#1:284,2\n153#1:286,2\n*E\n"})
public final class VerifyAccountHistoryFragment extends BaseMvvmFragment<VerifyAccountHistoryViewModel> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f26150v = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f26151j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AccountHistoryListRsp f26152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public GetSecurityFlowRsp f26153p;
    public i t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VerifyAccountHistoryFragment newInstance(@Nullable AccountHistoryListRsp accountHistoryListRsp, @Nullable GetSecurityFlowRsp getSecurityFlowRsp) {
            VerifyAccountHistoryFragment verifyAccountHistoryFragment = new VerifyAccountHistoryFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_data", accountHistoryListRsp);
            bundle.putParcelable("_security_flow_info", getSecurityFlowRsp);
            verifyAccountHistoryFragment.setArguments(bundle);
            return verifyAccountHistoryFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        i iVar = this.t;
        if (iVar != null) {
            final int i7 = 0;
            ((IconicsImageView) ((C0107d) iVar.f727e).f681c).setOnClickListener(new View.OnClickListener(this) { // from class: U8.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifyAccountHistoryFragment f9285b;

                {
                    this.f9285b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<Object> data;
                    VerifyAccountHistoryFragment verifyAccountHistoryFragment = this.f9285b;
                    switch (i7) {
                        case 0:
                            VerifyAccountHistoryFragment.a aVar = VerifyAccountHistoryFragment.f26150v;
                            E activity = verifyAccountHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        default:
                            VerifyAccountHistoryFragment.a aVar2 = VerifyAccountHistoryFragment.f26150v;
                            VerifyAccountHistoryReq req = new VerifyAccountHistoryReq();
                            GetSecurityFlowRsp getSecurityFlowRsp = verifyAccountHistoryFragment.f26153p;
                            req.flowId = getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null;
                            req.mobileNo = getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null;
                            AccountHistoryListRsp accountHistoryListRsp = verifyAccountHistoryFragment.f26152o;
                            req.questionId = accountHistoryListRsp != null ? accountHistoryListRsp.questionId : null;
                            req.answerIds = new ArrayList();
                            c cVar = verifyAccountHistoryFragment.f26151j;
                            if (cVar != null && (data = cVar.getData()) != null) {
                                Iterator<T> it = data.iterator();
                                while (it.hasNext()) {
                                    AccountHistoryListRsp.ItemListBean itemListBean = (AccountHistoryListRsp.ItemListBean) it.next();
                                    if (itemListBean.check) {
                                        req.answerIds.add(Long.valueOf(itemListBean.itemId));
                                    }
                                }
                            }
                            VerifyAccountHistoryViewModel verifyAccountHistoryViewModel = (VerifyAccountHistoryViewModel) verifyAccountHistoryFragment.f27333i;
                            if (verifyAccountHistoryViewModel != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                f.s(verifyAccountHistoryViewModel, new Z(req, null), verifyAccountHistoryViewModel.f26444f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                    }
                }
            });
        }
        VerifyAccountHistoryViewModel verifyAccountHistoryViewModel = (VerifyAccountHistoryViewModel) this.f27333i;
        l lVar = verifyAccountHistoryViewModel != null ? verifyAccountHistoryViewModel.f26443e : null;
        if (lVar != null) {
            lVar.e(this, new G(new d(this, this, 0), 16));
        }
        VerifyAccountHistoryViewModel verifyAccountHistoryViewModel2 = (VerifyAccountHistoryViewModel) this.f27333i;
        l lVar2 = verifyAccountHistoryViewModel2 != null ? verifyAccountHistoryViewModel2.f26444f : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new d(this, this, 1), 16));
        }
        i iVar2 = this.t;
        if (iVar2 != null) {
            final int i10 = 1;
            ((TextView) iVar2.f729g).setOnClickListener(new View.OnClickListener(this) { // from class: U8.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ VerifyAccountHistoryFragment f9285b;

                {
                    this.f9285b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<Object> data;
                    VerifyAccountHistoryFragment verifyAccountHistoryFragment = this.f9285b;
                    switch (i10) {
                        case 0:
                            VerifyAccountHistoryFragment.a aVar = VerifyAccountHistoryFragment.f26150v;
                            E activity = verifyAccountHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        default:
                            VerifyAccountHistoryFragment.a aVar2 = VerifyAccountHistoryFragment.f26150v;
                            VerifyAccountHistoryReq req = new VerifyAccountHistoryReq();
                            GetSecurityFlowRsp getSecurityFlowRsp = verifyAccountHistoryFragment.f26153p;
                            req.flowId = getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null;
                            req.mobileNo = getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null;
                            AccountHistoryListRsp accountHistoryListRsp = verifyAccountHistoryFragment.f26152o;
                            req.questionId = accountHistoryListRsp != null ? accountHistoryListRsp.questionId : null;
                            req.answerIds = new ArrayList();
                            c cVar = verifyAccountHistoryFragment.f26151j;
                            if (cVar != null && (data = cVar.getData()) != null) {
                                Iterator<T> it = data.iterator();
                                while (it.hasNext()) {
                                    AccountHistoryListRsp.ItemListBean itemListBean = (AccountHistoryListRsp.ItemListBean) it.next();
                                    if (itemListBean.check) {
                                        req.answerIds.add(Long.valueOf(itemListBean.itemId));
                                    }
                                }
                            }
                            VerifyAccountHistoryViewModel verifyAccountHistoryViewModel3 = (VerifyAccountHistoryViewModel) verifyAccountHistoryFragment.f27333i;
                            if (verifyAccountHistoryViewModel3 != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                f.s(verifyAccountHistoryViewModel3, new Z(req, null), verifyAccountHistoryViewModel3.f26444f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
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
        View viewInflate = inflater.inflate(e.ac_fragment_verify_account_history, viewGroup, false);
        int i7 = F8.d.itemList;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
        if (recyclerView != null && (viewM = p059e1.a.m((i7 = F8.d.layoutHeader), viewInflate)) != null) {
            C0107d c0107dC = C0107d.c(viewM);
            i7 = F8.d.tvError;
            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView != null) {
                i7 = F8.d.tvNext;
                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView2 != null) {
                    i7 = F8.d.tvSuccess;
                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView3 != null) {
                        i7 = F8.d.tvTitleMsg;
                        TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView4 != null) {
                            i iVar = new i((LinearLayout) viewInflate, recyclerView, c0107dC, textView, textView2, textView3, textView4, 13);
                            this.t = iVar;
                            return iVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AccountHistoryListRsp accountHistoryListRsp = this.f26152o;
        if (accountHistoryListRsp == null) {
            VerifyAccountHistoryViewModel verifyAccountHistoryViewModel = (VerifyAccountHistoryViewModel) this.f27333i;
            if (verifyAccountHistoryViewModel != null) {
                GetSecurityFlowRsp getSecurityFlowRsp = this.f26153p;
                verifyAccountHistoryViewModel.d(getSecurityFlowRsp != null ? getSecurityFlowRsp.flowId : null, getSecurityFlowRsp != null ? getSecurityFlowRsp.mobile : null);
            }
        } else {
            t(accountHistoryListRsp);
        }
        u();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f26152o = (AccountHistoryListRsp) arguments.getParcelable("extra_data");
            this.f26153p = (GetSecurityFlowRsp) arguments.getParcelable("_security_flow_info");
        }
        i iVar = this.t;
        if (iVar != null) {
            h.s((IconicsImageView) ((C0107d) iVar.f727e).f682d, false);
        }
        super.o();
        return 0;
    }

    public final void t(AccountHistoryListRsp accountHistoryListRsp) {
        i iVar = this.t;
        if (iVar != null) {
            ((TextView) iVar.f730i).setText(accountHistoryListRsp.question);
        }
        if (this.f26151j == null) {
            this.f26151j = new c(!accountHistoryListRsp.multiSelect ? e.ac_layout_verify_account_single_select_item : e.ac_layout_verify_account_multi_select_item, null);
            i iVar2 = this.t;
            if (iVar2 != null) {
                ((RecyclerView) iVar2.f726d).setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            i iVar3 = this.t;
            if (iVar3 != null) {
                ((RecyclerView) iVar3.f726d).setAdapter(this.f26151j);
            }
            c cVar = this.f26151j;
            if (cVar != null) {
                cVar.setOnItemClickListener(new U8.a(0, accountHistoryListRsp, this));
            }
        }
        c cVar2 = this.f26151j;
        if (cVar2 != null) {
            cVar2.setList(accountHistoryListRsp.itemList);
        }
    }

    public final void u() {
        TextView textView;
        List<Object> data;
        TextView textView2;
        c cVar = this.f26151j;
        if (cVar != null && (data = cVar.getData()) != null) {
            Iterator<T> it = data.iterator();
            while (it.hasNext()) {
                if (((AccountHistoryListRsp.ItemListBean) it.next()).check) {
                    i iVar = this.t;
                    if (iVar == null || (textView2 = (TextView) iVar.f729g) == null) {
                        return;
                    }
                    textView2.setEnabled(true);
                    return;
                }
            }
        }
        i iVar2 = this.t;
        if (iVar2 == null || (textView = (TextView) iVar2.f729g) == null) {
            return;
        }
        textView.setEnabled(false);
    }
}
