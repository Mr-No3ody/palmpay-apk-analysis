package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import Ba.a;
import C9.C0139f;
import C9.C0144k;
import C9.Q;
import Fd.v;
import Kd.Z1;
import L6.b;
import N8.q0;
import Wf.AbstractC0780y;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.event.AddRecipientEvent;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFavoriteFragment;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.util.NetworkUtils;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p159kd.e;
import p159kd.f;
import p159kd.h;
import p173ld.A;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFavoriteFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;", "event", "", "onAddRecipientMessage", "(Lcom/transsnet/palmpay/send_money/bean/event/AddRecipientEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayHomeFavoriteFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayHomeFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFavoriteFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,272:1\n1#2:273\n152#3:274\n169#3:275\n171#3,12:276\n215#3:288\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayHomeFavoriteFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFavoriteFragment\n*L\n96#1:274\n96#1:275\n148#1:276,12\n148#1:288\n*E\n"})
public final class TransferToPalmPayHomeFavoriteFragment extends BaseMvvmFragment<TransferToPalmPayHomeViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33810j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33811o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33812p;
    public String t = "COMMON";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33813v;

    public TransferToPalmPayHomeFavoriteFragment() {
        final int i7 = 0;
        this.f33810j = C2131j.b(new Function0(this) { // from class: Fd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2709b;

            {
                this.f2709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f2709b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2709b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2709b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_favorite);
                        }
                        return null;
                    default:
                        return new p173ld.A(this.f2709b.m());
                }
            }
        });
        final int i10 = 1;
        this.f33811o = C2131j.b(new Function0(this) { // from class: Fd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2709b;

            {
                this.f2709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f2709b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2709b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2709b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_favorite);
                        }
                        return null;
                    default:
                        return new p173ld.A(this.f2709b.m());
                }
            }
        });
        final int i11 = 2;
        this.f33812p = C2131j.b(new Function0(this) { // from class: Fd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2709b;

            {
                this.f2709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f2709b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2709b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2709b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_favorite);
                        }
                        return null;
                    default:
                        return new p173ld.A(this.f2709b.m());
                }
            }
        });
        final int i12 = 3;
        this.f33813v = C2131j.b(new Function0(this) { // from class: Fd.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFavoriteFragment f2709b;

            {
                this.f2709b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f2709b.f27318b;
                        if (view != null) {
                            return (RecyclerView) view.findViewById(p159kd.e.recyclerView);
                        }
                        return null;
                    case 1:
                        View view2 = this.f2709b.f27318b;
                        if (view2 != null) {
                            return (PpSwipeRefreshLayout) view2.findViewById(p159kd.e.swipeRefreshLayout);
                        }
                        return null;
                    case 2:
                        View view3 = this.f2709b.f27318b;
                        if (view3 != null) {
                            return (SingleAdView) view3.findViewById(p159kd.e.ad_favorite);
                        }
                        return null;
                    default:
                        return new p173ld.A(this.f2709b.m());
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_transfer_to_palmpay_home_favorite;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar = transferToPalmPayHomeViewModel != null ? transferToPalmPayHomeViewModel.f34080g : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0139f(this, 13), 28));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = (TransferToPalmPayHomeViewModel) this.f27333i;
        n.B(this, transferToPalmPayHomeViewModel2 != null ? transferToPalmPayHomeViewModel2.f34084p : null, this, new a(this, 6), null, false, null, 248);
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel3 = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar2 = transferToPalmPayHomeViewModel3 != null ? transferToPalmPayHomeViewModel3.f34083o : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new C0144k(new Q(12, this, this), 28));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        super.o();
        c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("core_order_source_type", "")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                this.t = string;
            }
        }
        t tVar = this.f33810j;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        C1548f c1548f = new C1548f(CommonViewExtKt.colorInt(b.ppColorDividerLine, requireActivity()), 1);
        c1548f.f31336e = false;
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(c1548f);
        }
        t().setOnItemClickListener(new Fd.t(this));
        org.chromium.support_lib_boundary.util.b.d((SingleAdView) this.f33812p.getValue(), Boolean.TRUE);
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = u();
        if (ppSwipeRefreshLayoutU != null) {
            ppSwipeRefreshLayoutU.setOnRefreshListener(new Fd.t(this));
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU2 = u();
        if (ppSwipeRefreshLayoutU2 != null) {
            ppSwipeRefreshLayoutU2.setColorSchemeResources(b.ppColorPrimary);
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU3 = u();
        if (ppSwipeRefreshLayoutU3 != null) {
            ppSwipeRefreshLayoutU3.setRefreshing(true);
        }
        return 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onAddRecipientMessage(@NotNull AddRecipientEvent event) {
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getRecipientType() != 2 || (transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i) == null) {
            return;
        }
        transferToPalmPayHomeViewModel.f(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        v();
    }

    public final A t() {
        return (A) this.f33813v.getValue();
    }

    public final PpSwipeRefreshLayout u() {
        return (PpSwipeRefreshLayout) this.f33811o.getValue();
    }

    public final void v() {
        if (NetworkUtils.isConnected()) {
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                AbstractC0780y.m(V.h(transferToPalmPayHomeViewModel), null, null, new Z1(transferToPalmPayHomeViewModel.f34080g, q0.y(p367ya.a.d().i(), "_queryHomeFavorite_", BaseApplication.getCountryLocale()), null), 3);
                return;
            }
            return;
        }
        w();
        PpSwipeRefreshLayout ppSwipeRefreshLayoutU = u();
        if (ppSwipeRefreshLayoutU != null) {
            ppSwipeRefreshLayoutU.setRefreshing(false);
        }
    }

    public final void w() {
        String str;
        String string = getString(h.sm_no_favorite_yet);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i7 = r.cv_empty_no_palmpay_contacts;
        if (NetworkUtils.isConnected()) {
            str = "Add your frequent beneficiaries as favorites to enjoy free transfers.";
        } else {
            i7 = r.cv_empty_no_network;
            string = "No Network Connection";
            str = "Please check your network settings or refresh";
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_to_palmpay_empty_view_68, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(e.iv_empty_icon);
        TextView textView = (TextView) viewInflate.findViewById(e.tv_empty_title);
        TextView textView2 = (TextView) viewInflate.findViewById(e.tv_empty_tip);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(e.ll_empty_content);
        PpButton ppButton = (PpButton) viewInflate.findViewById(e.tv_empty_btn);
        Intrinsics.e(ppButton);
        p220oa.h.C(ppButton);
        ppButton.setText("Add Now");
        ppButton.setOnClickListener(new v(this, 0));
        imageView.setImageResource(i7);
        textView.setText(string);
        textView2.setText(str);
        linearLayout.setBackgroundResource(r.cv_rect_corner_bl_br_12_bg_white);
        t().setEmptyView(viewInflate);
    }
}
