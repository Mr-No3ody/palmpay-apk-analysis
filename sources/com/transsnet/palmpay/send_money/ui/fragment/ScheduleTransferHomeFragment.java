package com.transsnet.palmpay.send_money.ui.fragment;

import Ab.C;
import C9.C0144k;
import Cd.o;
import Cd.q;
import Kd.C0386j0;
import L6.b;
import M1.j;
import S1.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.custom_view.PpSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.ui.fragment.ScheduleTransferHomeFragment;
import com.transsnet.palmpay.send_money.viewmodel.ScheduleTransferViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p052da.K;
import p159kd.e;
import p159kd.f;
import p173ld.i;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferHomeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/ScheduleTransferViewModel;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScheduleTransferHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduleTransferHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferHomeFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,263:1\n115#2,8:264\n145#2:272\n115#2,8:273\n145#2:281\n*S KotlinDebug\n*F\n+ 1 ScheduleTransferHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/ScheduleTransferHomeFragment\n*L\n125#1:264,8\n125#1:272\n136#1:273,8\n136#1:281\n*E\n"})
public final class ScheduleTransferHomeFragment extends BaseMvvmFragment<ScheduleTransferViewModel> {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final a f33695k0 = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f33696A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RecyclerView f33697B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f33698C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Group f33699H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View f33700L;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f33702Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public List f33703X;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33706j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33707o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33708p;
    public Integer t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f33709v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33710w = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f33701M = true;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f33704Y = C2131j.b(new Aa.a(7));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f33705Z = C2131j.b(new Aa.a(8));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleTransferHomeFragment newInstance(int i7) {
            ScheduleTransferHomeFragment scheduleTransferHomeFragment = new ScheduleTransferHomeFragment();
            scheduleTransferHomeFragment.setArguments(p002a.a.e(new Pair("extra_flag", Integer.valueOf(i7))));
            return scheduleTransferHomeFragment;
        }

        private a() {
        }
    }

    public ScheduleTransferHomeFragment() {
        final int i7 = 0;
        this.f33706j = C2131j.b(new Function0(this) { // from class: Cd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferHomeFragment f1381b;

            {
                this.f1381b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1381b;
                switch (i7) {
                    case 0:
                        ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                        View view = scheduleTransferHomeFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.btn_add_schedule_payment);
                        }
                        return null;
                    case 1:
                        ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                        View view2 = scheduleTransferHomeFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.rv_schedule_transfer);
                        }
                        return null;
                    default:
                        ScheduleTransferHomeFragment.a aVar3 = ScheduleTransferHomeFragment.f33695k0;
                        View view3 = scheduleTransferHomeFragment.f27318b;
                        if (view3 != null) {
                            return (PpSwipeRefreshLayout) view3.findViewById(p159kd.e.srl_refresh);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f33707o = C2131j.b(new Function0(this) { // from class: Cd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferHomeFragment f1381b;

            {
                this.f1381b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1381b;
                switch (i10) {
                    case 0:
                        ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                        View view = scheduleTransferHomeFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.btn_add_schedule_payment);
                        }
                        return null;
                    case 1:
                        ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                        View view2 = scheduleTransferHomeFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.rv_schedule_transfer);
                        }
                        return null;
                    default:
                        ScheduleTransferHomeFragment.a aVar3 = ScheduleTransferHomeFragment.f33695k0;
                        View view3 = scheduleTransferHomeFragment.f27318b;
                        if (view3 != null) {
                            return (PpSwipeRefreshLayout) view3.findViewById(p159kd.e.srl_refresh);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f33708p = C2131j.b(new Function0(this) { // from class: Cd.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScheduleTransferHomeFragment f1381b;

            {
                this.f1381b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1381b;
                switch (i11) {
                    case 0:
                        ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                        View view = scheduleTransferHomeFragment.f27318b;
                        if (view != null) {
                            return view.findViewById(p159kd.e.btn_add_schedule_payment);
                        }
                        return null;
                    case 1:
                        ScheduleTransferHomeFragment.a aVar2 = ScheduleTransferHomeFragment.f33695k0;
                        View view2 = scheduleTransferHomeFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(p159kd.e.rv_schedule_transfer);
                        }
                        return null;
                    default:
                        ScheduleTransferHomeFragment.a aVar3 = ScheduleTransferHomeFragment.f33695k0;
                        View view3 = scheduleTransferHomeFragment.f27318b;
                        if (view3 != null) {
                            return (PpSwipeRefreshLayout) view3.findViewById(p159kd.e.srl_refresh);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.sm_fragment_schedule_transfer_home;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) this.f27333i;
        l lVar = scheduleTransferViewModel != null ? scheduleTransferViewModel.f34015i : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new q(this, 0), 4));
        }
        ScheduleTransferViewModel scheduleTransferViewModel2 = (ScheduleTransferViewModel) this.f27333i;
        l lVar2 = scheduleTransferViewModel2 != null ? scheduleTransferViewModel2.f34016j : null;
        if (lVar2 == null) {
            return 0;
        }
        lVar2.e(this, new C0144k(new q(this, 1), 4));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        PpSwipeRefreshLayout ppSwipeRefreshLayoutV = v();
        if (ppSwipeRefreshLayoutV != null) {
            ppSwipeRefreshLayoutV.setRefreshing(true);
            SwipeRefreshLayout.OnRefreshListener onRefreshListener = ppSwipeRefreshLayoutV.f31095a;
            if (onRefreshListener != null) {
                onRefreshListener.onRefresh();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ARouter.getInstance().inject(this);
        PpSwipeRefreshLayout ppSwipeRefreshLayoutV = v();
        if (ppSwipeRefreshLayoutV != null) {
            ppSwipeRefreshLayoutV.setOnRefreshListener(new o(this, 1));
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutV2 = v();
        if (ppSwipeRefreshLayoutV2 != null) {
            ppSwipeRefreshLayoutV2.setColorSchemeResources(b.ppColorPrimary);
        }
        PpSwipeRefreshLayout ppSwipeRefreshLayoutV3 = v();
        if (ppSwipeRefreshLayoutV3 != null) {
            ppSwipeRefreshLayoutV3.setProgressBackgroundColorSchemeResource(b.ppColorBackgroundLight);
        }
        t tVar = this.f33707o;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setAdapter(t());
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        View viewInflate = getLayoutInflater().inflate(f.sm_layout_schedule_transfer_home_empty, (ViewGroup) null);
        this.f33700L = viewInflate;
        if (viewInflate != null) {
            t().setEmptyView(viewInflate);
        }
        t().setOnItemClickListener(new o(this, 2));
        t().getLoadMoreModule().setOnLoadMoreListener(new o(this, 3));
        c loadMoreModule = t().getLoadMoreModule();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        K k2 = new K(contextRequireContext, 30);
        loadMoreModule.getClass();
        Intrinsics.checkNotNullParameter(k2, "<set-?>");
        loadMoreModule.f8646e = k2;
        t().getLoadMoreModule().getClass();
        t().getLoadMoreModule().f8647f = false;
        View viewInflate2 = getLayoutInflater().inflate(f.sm_layout_schedule_transfer_home_header, (ViewGroup) null);
        this.f33696A = (TextView) viewInflate2.findViewById(e.tvActiveBooking);
        this.f33697B = (RecyclerView) viewInflate2.findViewById(e.rvScheduleTransferRunning);
        this.f33698C = (TextView) viewInflate2.findViewById(e.tvCompletedBooking);
        this.f33699H = (Group) viewInflate2.findViewById(e.groupTitle);
        TextView textView = this.f33698C;
        if (textView != null) {
            final int i7 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: Cd.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTransferHomeFragment f1377b;

                {
                    this.f1377b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1377b;
                    switch (i7) {
                        case 0:
                            scheduleTransferHomeFragment.f33702Q = !scheduleTransferHomeFragment.f33702Q;
                            scheduleTransferHomeFragment.w();
                            break;
                        default:
                            ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                            Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_payment_select");
                            Integer num = scheduleTransferHomeFragment.t;
                            postcardBuild.withInt("extra_flag", num != null ? num.intValue() : 0).navigation();
                            break;
                    }
                }
            });
        }
        RecyclerView recyclerView3 = this.f33697B;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(u());
        }
        RecyclerView recyclerView4 = this.f33697B;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(new LinearLayoutManager(requireContext()));
        }
        TextView textView2 = new TextView(requireContext());
        textView2.setLayoutParams(new RecyclerView.LayoutParams(-1, CommonViewExtKt.getDp(129)));
        textView2.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextAssist, requireContext()));
        textView2.setBackground(requireContext().getDrawable(r.cv_shape_rect_corner_12_bg_white));
        textView2.setGravity(17);
        textView2.setTextSize(1, 14.0f);
        textView2.setText("No record for now");
        u().setEmptyView(textView2);
        u().getLoadMoreModule().j(false);
        u().setOnItemClickListener(new o(this, 0));
        j.setHeaderView$default(t(), viewInflate2, 0, 0, 6, null);
        t().setHeaderWithEmptyEnable(true);
        View view = (View) this.f33706j.getValue();
        if (view != null) {
            final int i10 = 1;
            view.setOnClickListener(new View.OnClickListener(this) { // from class: Cd.n

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ScheduleTransferHomeFragment f1377b;

                {
                    this.f1377b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ScheduleTransferHomeFragment scheduleTransferHomeFragment = this.f1377b;
                    switch (i10) {
                        case 0:
                            scheduleTransferHomeFragment.f33702Q = !scheduleTransferHomeFragment.f33702Q;
                            scheduleTransferHomeFragment.w();
                            break;
                        default:
                            ScheduleTransferHomeFragment.a aVar = ScheduleTransferHomeFragment.f33695k0;
                            Postcard postcardBuild = ARouter.getInstance().build("/sm/schedule_transfer_payment_select");
                            Integer num = scheduleTransferHomeFragment.t;
                            postcardBuild.withInt("extra_flag", num != null ? num.intValue() : 0).navigation();
                            break;
                    }
                }
            });
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f33710w) {
            this.f33710w = false;
            return;
        }
        this.f33709v = 1;
        ScheduleTransferViewModel scheduleTransferViewModel = (ScheduleTransferViewModel) this.f27333i;
        if (scheduleTransferViewModel != null) {
            p140j8.f.s(scheduleTransferViewModel, new C0386j0(1, null), scheduleTransferViewModel.f34016j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final i t() {
        return (i) this.f33705Z.getValue();
    }

    public final i u() {
        return (i) this.f33704Y.getValue();
    }

    public final PpSwipeRefreshLayout v() {
        return (PpSwipeRefreshLayout) this.f33708p.getValue();
    }

    public final void w() {
        TextView textView;
        if (this.f33702Q) {
            t().setList(this.f33703X);
        } else {
            t().setList(new ArrayList());
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext, this.f33702Q ? S6.a.pay_ArrowUp : S6.a.pay_Arrowdown);
        iconicsDrawable.a(new C(this, 2));
        TextView textView2 = this.f33698C;
        if (textView2 == null || !textView2.isShown() || (textView = this.f33698C) == null) {
            return;
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, iconicsDrawable, (Drawable) null);
    }
}
