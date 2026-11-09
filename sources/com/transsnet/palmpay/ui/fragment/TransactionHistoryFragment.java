package com.transsnet.palmpay.ui.fragment;

import Ac.e;
import Ac.f;
import Ac.h;
import Ae.n;
import Bc.C0105b;
import Bc.x;
import C0.G;
import C9.C0144k;
import C9.C0158z;
import Ce.o0;
import Ce.p0;
import Ce.s0;
import Ce.t0;
import Ce.u0;
import Fe.C0262j;
import L6.b;
import O6.c;
import O6.d;
import Pa.r0;
import Pe.v0;
import Pe.y0;
import Wf.AbstractC0780y;
import X6.m;
import X6.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.F;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.timepicker.TimeModel;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.BillTotalCountResp;
import com.transsnet.palmpay.core.bean.bill.TransHistoryItemBean;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.ui.activity.TransactionHistoryDownloadFilterActivity;
import com.transsnet.palmpay.ui.dialog.MonthlyLimitDialog;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.ui.view.TransHistoryFilterLayout;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p052da.K;
import p328ve.w;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/TransactionHistoryFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/viewmodule/TransactionHistoryViewModel;", "LBc/x;", "Lcom/transsnet/palmpay/ui/view/TransHistoryFilterLayout$OnSelectListener;", "<init>", "()V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionHistoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionHistoryFragment.kt\ncom/transsnet/palmpay/ui/fragment/TransactionHistoryFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,827:1\n260#2,10:828\n296#2:838\n260#2,10:839\n296#2:849\n260#2,10:850\n296#2:860\n1869#3:861\n1869#3:862\n1869#3,2:863\n1870#3:865\n1869#3:866\n1869#3,2:867\n1870#3:869\n1869#3:870\n1869#3,2:871\n1870#3:873\n1870#3:874\n1869#3:875\n1869#3,2:876\n1870#3:878\n1869#3:879\n1869#3,2:880\n1870#3:882\n1869#3:883\n1869#3,2:884\n1870#3:886\n1869#3,2:887\n*S KotlinDebug\n*F\n+ 1 TransactionHistoryFragment.kt\ncom/transsnet/palmpay/ui/fragment/TransactionHistoryFragment\n*L\n397#1:828,10\n397#1:838\n410#1:839,10\n410#1:849\n421#1:850,10\n421#1:860\n445#1:861\n448#1:862\n454#1:863,2\n448#1:865\n466#1:866\n472#1:867,2\n466#1:869\n488#1:870\n495#1:871,2\n488#1:873\n445#1:874\n521#1:875\n523#1:876,2\n521#1:878\n533#1:879\n535#1:880,2\n533#1:882\n549#1:883\n550#1:884,2\n549#1:886\n771#1:887,2\n*E\n"})
public final class TransactionHistoryFragment extends BaseMvvmVBFragment<TransactionHistoryViewModel, x> implements TransHistoryFilterLayout.OnSelectListener {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f35248k0 = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f35250B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f35251C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public HashMap f35252H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f35253L;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f35256X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public d f35257Y;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0105b f35260p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f35261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o f35262w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Boolean f35259o = Boolean.FALSE;
    public final String t = "MonthlyOverviewHome";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f35249A = C2131j.b(new Aa.a(19));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f35254M = 5;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f35255Q = 2018;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public long f35258Z = System.currentTimeMillis();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TransactionHistoryFragment newInstance(int i7) {
            TransactionHistoryFragment transactionHistoryFragment = new TransactionHistoryFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("filter_type", i7);
            transactionHistoryFragment.setArguments(bundle);
            return transactionHistoryFragment;
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public TransactionHistoryFragment() {
        final int i7 = 0;
        this.f35261v = C2131j.b(new Function0(this) { // from class: Ce.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionHistoryFragment f1506b;

            {
                this.f1506b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionHistoryFragment transactionHistoryFragment = this.f1506b;
                switch (i7) {
                    case 0:
                        int i10 = TransactionHistoryFragment.f35248k0;
                        return transactionHistoryFragment.f27319c.getIntent().getStringExtra("extra_id");
                    default:
                        int i11 = TransactionHistoryFragment.f35248k0;
                        return new LinearLayoutManager(transactionHistoryFragment.requireContext());
                }
            }
        });
        final int i10 = 1;
        this.f35250B = C2131j.b(new Function0(this) { // from class: Ce.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionHistoryFragment f1506b;

            {
                this.f1506b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TransactionHistoryFragment transactionHistoryFragment = this.f1506b;
                switch (i10) {
                    case 0:
                        int i11 = TransactionHistoryFragment.f35248k0;
                        return transactionHistoryFragment.f27319c.getIntent().getStringExtra("extra_id");
                    default:
                        int i12 = TransactionHistoryFragment.f35248k0;
                        return new LinearLayoutManager(transactionHistoryFragment.requireContext());
                }
            }
        });
    }

    public static final void u(TransactionHistoryFragment transactionHistoryFragment, boolean z3, String str) {
        d dVar;
        if (z3) {
            transactionHistoryFragment.startActivity(new Intent(transactionHistoryFragment.f27319c, (Class<?>) TransactionHistoryDownloadFilterActivity.class));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (transactionHistoryFragment.f35257Y == null) {
            c cVar = new c(transactionHistoryFragment.f27319c);
            cVar.e(k.core_title_attention);
            cVar.d(k.core_confirm, null);
            cVar.f6598d = str;
            transactionHistoryFragment.f35257Y = cVar.a();
        }
        d dVar2 = transactionHistoryFragment.f35257Y;
        if ((dVar2 == null || !dVar2.isShowing()) && (dVar = transactionHistoryFragment.f35257Y) != null) {
            dVar.show();
        }
    }

    public final void A(int i7, int i10) {
        TextView textView;
        TextView textView2;
        if (i10 > 0) {
            C0105b c0105b = this.f35260p;
            if ((c0105b != null ? (TextView) c0105b.f665e : null) == null) {
                return;
            }
            int iN0 = r0.N0(System.currentTimeMillis());
            String str = new DateFormatSymbols(Locale.ENGLISH).getMonths()[i10 - 1];
            if (iN0 == i7) {
                C0105b c0105b2 = this.f35260p;
                if (c0105b2 != null && (textView2 = (TextView) c0105b2.f665e) != null) {
                    textView2.setText(str);
                }
            } else {
                C0105b c0105b3 = this.f35260p;
                if (c0105b3 != null && (textView = (TextView) c0105b3.f665e) != null) {
                    textView.setText(str + " " + i7);
                }
            }
            this.f35255Q = i7;
            this.f35254M = i10;
        }
    }

    public final void B(TransHistoryItemBean transHistoryItemBean) {
        if (transHistoryItemBean != null) {
            Long l5 = transHistoryItemBean.updateTime;
            int iN0 = r0.N0(l5 != null ? l5.longValue() : 0L);
            Long l6 = transHistoryItemBean.updateTime;
            A(iN0, r0.h0(l6 != null ? l6.longValue() : 0L));
            TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) this.f27333i;
            if (transactionHistoryViewModel != null) {
                Long l8 = transHistoryItemBean.updateTime;
                transactionHistoryViewModel.f(l8 != null ? l8.longValue() : 0L, this.f35251C, true);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) this.f27333i;
        if (transactionHistoryViewModel != null) {
            transactionHistoryViewModel.f35413w = this;
        }
        l lVar = transactionHistoryViewModel != null ? transactionHistoryViewModel.f35409j : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new Ce.r0(this, this, 0), 12));
        }
        TransactionHistoryViewModel transactionHistoryViewModel2 = (TransactionHistoryViewModel) this.f27333i;
        l lVar2 = transactionHistoryViewModel2 != null ? transactionHistoryViewModel2.f35407g : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new Ce.r0(this, this, 1), 12));
        }
        TransactionHistoryViewModel transactionHistoryViewModel3 = (TransactionHistoryViewModel) this.f27333i;
        l lVar3 = transactionHistoryViewModel3 != null ? transactionHistoryViewModel3.f35408i : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new Ce.r0(this, this, 2), 12));
        }
        x xVar = (x) this.f27335j;
        if (xVar != null) {
            xVar.f870b.setAdListener(new u0(this, 0));
        }
        x xVar2 = (x) this.f27335j;
        if (xVar2 == null) {
            return 0;
        }
        xVar2.f876i.setAdListener(new C0158z(this, 7));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) this.f27333i;
        if (transactionHistoryViewModel != null) {
            AbstractC0780y.m(V.h(transactionHistoryViewModel), null, null, new y0(transactionHistoryViewModel.f35409j, G.p("Pref_", p367ya.a.d().i(), "_getTransactionFilter_", BaseApplication.getCountryLocale()), null), 3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        TextView rightTextView;
        x xVar = (x) this.f27335j;
        this.f35260p = xVar != null ? xVar.f872d : null;
        if (TextUtils.isEmpty((String) this.f35261v.getValue())) {
            x xVar2 = (x) this.f27335j;
            if (xVar2 != null) {
                xVar2.f875g.setRightText(getString(k.core_download));
            }
            x xVar3 = (x) this.f27335j;
            if (xVar3 != null) {
                final int i7 = 0;
                xVar3.f875g.setRightTextViewClickListener(new View.OnClickListener(this) { // from class: Ce.q0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ TransactionHistoryFragment f1519b;

                    {
                        this.f1519b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TransactionHistoryFragment transactionHistoryFragment = this.f1519b;
                        switch (i7) {
                            case 0:
                                int i10 = TransactionHistoryFragment.f35248k0;
                                TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) transactionHistoryFragment.f27333i;
                                if (transactionHistoryViewModel != null) {
                                    p140j8.f.s(transactionHistoryViewModel, new v0(1, null), transactionHistoryViewModel.f35408i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                }
                                break;
                            case 1:
                                int i11 = TransactionHistoryFragment.f35248k0;
                                androidx.fragment.app.E activity = transactionHistoryFragment.getActivity();
                                if (activity != null) {
                                    activity.onBackPressed();
                                }
                                break;
                            case 2:
                                int i12 = TransactionHistoryFragment.f35248k0;
                                transactionHistoryFragment.z();
                                break;
                            default:
                                int i13 = TransactionHistoryFragment.f35248k0;
                                Pa.n0.g().l("transaction_history_click_monthly_overview");
                                int i14 = transactionHistoryFragment.f35255Q;
                                int i15 = transactionHistoryFragment.f35254M;
                                if (i15 >= 1 && i15 <= 12) {
                                    int i16 = (i14 * 12) + i15;
                                    int i17 = i16 - 24304;
                                    F6.d.h("history", 3, Integer.valueOf(i17), 24304, Integer.valueOf(i16));
                                    if (i17 <= 0) {
                                        Context context = transactionHistoryFragment.getContext();
                                        if (context == null) {
                                            Log.e("MonthSelect", "Context为空，无法显示弹窗");
                                        } else {
                                            new MonthlyLimitDialog(context).show();
                                        }
                                    }
                                }
                                com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("year", Integer.valueOf(transactionHistoryFragment.f35255Q)), new Pair("month", com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf(transactionHistoryFragment.f35254M)}, 1, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"))), transactionHistoryFragment.t);
                                break;
                        }
                    }
                });
            }
        } else {
            x xVar4 = (x) this.f27335j;
            if (xVar4 != null) {
                xVar4.f875g.setTitle("Minor Transaction History");
            }
            x xVar5 = (x) this.f27335j;
            if (xVar5 != null && (rightTextView = xVar5.f875g.getRightTextView()) != null) {
                rightTextView.setVisibility(8);
            }
        }
        x xVar6 = (x) this.f27335j;
        if (xVar6 != null) {
            final int i10 = 1;
            xVar6.f875g.setBackButtonClickListener(new View.OnClickListener(this) { // from class: Ce.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransactionHistoryFragment f1519b;

                {
                    this.f1519b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionHistoryFragment transactionHistoryFragment = this.f1519b;
                    switch (i10) {
                        case 0:
                            int i11 = TransactionHistoryFragment.f35248k0;
                            TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) transactionHistoryFragment.f27333i;
                            if (transactionHistoryViewModel != null) {
                                p140j8.f.s(transactionHistoryViewModel, new v0(1, null), transactionHistoryViewModel.f35408i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            int i12 = TransactionHistoryFragment.f35248k0;
                            androidx.fragment.app.E activity = transactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 2:
                            int i13 = TransactionHistoryFragment.f35248k0;
                            transactionHistoryFragment.z();
                            break;
                        default:
                            int i14 = TransactionHistoryFragment.f35248k0;
                            Pa.n0.g().l("transaction_history_click_monthly_overview");
                            int i15 = transactionHistoryFragment.f35255Q;
                            int i16 = transactionHistoryFragment.f35254M;
                            if (i16 >= 1 && i16 <= 12) {
                                int i17 = (i15 * 12) + i16;
                                int i18 = i17 - 24304;
                                F6.d.h("history", 3, Integer.valueOf(i18), 24304, Integer.valueOf(i17));
                                if (i18 <= 0) {
                                    Context context = transactionHistoryFragment.getContext();
                                    if (context == null) {
                                        Log.e("MonthSelect", "Context为空，无法显示弹窗");
                                    } else {
                                        new MonthlyLimitDialog(context).show();
                                    }
                                }
                            }
                            com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("year", Integer.valueOf(transactionHistoryFragment.f35255Q)), new Pair("month", com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf(transactionHistoryFragment.f35254M)}, 1, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"))), transactionHistoryFragment.t);
                            break;
                    }
                }
            });
        }
        x xVar7 = (x) this.f27335j;
        if (xVar7 != null) {
            xVar7.f871c.setOnSelectListener(this);
        }
        x xVar8 = (x) this.f27335j;
        if (xVar8 != null) {
            xVar8.f873e.setLayoutManager((LinearLayoutManager) this.f35250B.getValue());
        }
        x xVar9 = (x) this.f27335j;
        if (xVar9 != null) {
            xVar9.f873e.setItemViewCacheSize(4);
        }
        x xVar10 = (x) this.f27335j;
        if (xVar10 != null) {
            xVar10.f873e.addOnScrollListener(new s0(this));
        }
        x xVar11 = (x) this.f27335j;
        if (xVar11 != null) {
            xVar11.f873e.setOnTouchListener(new t0(this));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f35258Z = jCurrentTimeMillis;
        this.f35254M = r0.h0(jCurrentTimeMillis);
        int iN0 = r0.N0(this.f35258Z);
        this.f35255Q = iN0;
        A(iN0, this.f35254M);
        C0105b c0105b = this.f35260p;
        if (c0105b != null) {
            final int i11 = 2;
            ((TextView) c0105b.f665e).setOnClickListener(new View.OnClickListener(this) { // from class: Ce.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransactionHistoryFragment f1519b;

                {
                    this.f1519b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionHistoryFragment transactionHistoryFragment = this.f1519b;
                    switch (i11) {
                        case 0:
                            int i12 = TransactionHistoryFragment.f35248k0;
                            TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) transactionHistoryFragment.f27333i;
                            if (transactionHistoryViewModel != null) {
                                p140j8.f.s(transactionHistoryViewModel, new v0(1, null), transactionHistoryViewModel.f35408i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            int i13 = TransactionHistoryFragment.f35248k0;
                            androidx.fragment.app.E activity = transactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 2:
                            int i14 = TransactionHistoryFragment.f35248k0;
                            transactionHistoryFragment.z();
                            break;
                        default:
                            int i15 = TransactionHistoryFragment.f35248k0;
                            Pa.n0.g().l("transaction_history_click_monthly_overview");
                            int i16 = transactionHistoryFragment.f35255Q;
                            int i17 = transactionHistoryFragment.f35254M;
                            if (i17 >= 1 && i17 <= 12) {
                                int i18 = (i16 * 12) + i17;
                                int i19 = i18 - 24304;
                                F6.d.h("history", 3, Integer.valueOf(i19), 24304, Integer.valueOf(i18));
                                if (i19 <= 0) {
                                    Context context = transactionHistoryFragment.getContext();
                                    if (context == null) {
                                        Log.e("MonthSelect", "Context为空，无法显示弹窗");
                                    } else {
                                        new MonthlyLimitDialog(context).show();
                                    }
                                }
                            }
                            com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("year", Integer.valueOf(transactionHistoryFragment.f35255Q)), new Pair("month", com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf(transactionHistoryFragment.f35254M)}, 1, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"))), transactionHistoryFragment.t);
                            break;
                    }
                }
            });
        }
        C0105b c0105b2 = this.f35260p;
        if (c0105b2 != null) {
            ((LinearLayout) c0105b2.f667g).setVisibility(com.transsnet.palmpay.core.config.d.s() ? 0 : 8);
        }
        C0105b c0105b3 = this.f35260p;
        if (c0105b3 != null) {
            ((LinearLayout) c0105b3.f666f).setVisibility(com.transsnet.palmpay.core.config.d.s() ? 0 : 8);
        }
        C0105b c0105b4 = this.f35260p;
        if (c0105b4 != null) {
            final int i12 = 3;
            ((LinearLayout) c0105b4.f667g).setOnClickListener(new View.OnClickListener(this) { // from class: Ce.q0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransactionHistoryFragment f1519b;

                {
                    this.f1519b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TransactionHistoryFragment transactionHistoryFragment = this.f1519b;
                    switch (i12) {
                        case 0:
                            int i13 = TransactionHistoryFragment.f35248k0;
                            TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) transactionHistoryFragment.f27333i;
                            if (transactionHistoryViewModel != null) {
                                p140j8.f.s(transactionHistoryViewModel, new v0(1, null), transactionHistoryViewModel.f35408i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                            }
                            break;
                        case 1:
                            int i14 = TransactionHistoryFragment.f35248k0;
                            androidx.fragment.app.E activity = transactionHistoryFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 2:
                            int i15 = TransactionHistoryFragment.f35248k0;
                            transactionHistoryFragment.z();
                            break;
                        default:
                            int i16 = TransactionHistoryFragment.f35248k0;
                            Pa.n0.g().l("transaction_history_click_monthly_overview");
                            int i17 = transactionHistoryFragment.f35255Q;
                            int i18 = transactionHistoryFragment.f35254M;
                            if (i18 >= 1 && i18 <= 12) {
                                int i19 = (i17 * 12) + i18;
                                int i110 = i19 - 24304;
                                F6.d.h("history", 3, Integer.valueOf(i110), 24304, Integer.valueOf(i19));
                                if (i110 <= 0) {
                                    Context context = transactionHistoryFragment.getContext();
                                    if (context == null) {
                                        Log.e("MonthSelect", "Context为空，无法显示弹窗");
                                    } else {
                                        new MonthlyLimitDialog(context).show();
                                    }
                                }
                            }
                            com.palmpay.lib.apm.launchcounter.util.d.x(p002a.a.e(new Pair("year", Integer.valueOf(transactionHistoryFragment.f35255Q)), new Pair("month", com.airbnb.lottie.model.layer.d.n(new Object[]{Integer.valueOf(transactionHistoryFragment.f35254M)}, 1, TimeModel.ZERO_LEADING_NUMBER_FORMAT, "format(...)"))), transactionHistoryFragment.t);
                            break;
                    }
                }
            });
        }
        x xVar12 = (x) this.f27335j;
        if (xVar12 != null) {
            xVar12.f874f.setOnRefreshListener(new o0(this));
        }
        v().getLoadMoreModule().setOnLoadMoreListener(new o0(this));
        S1.c loadMoreModule = v().getLoadMoreModule();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        K k2 = new K(contextRequireContext, 14);
        loadMoreModule.getClass();
        Intrinsics.checkNotNullParameter(k2, "<set-?>");
        loadMoreModule.f8646e = k2;
        v().getLoadMoreModule().getClass();
        v().getLoadMoreModule().f8647f = false;
        v().setOnItemChildClickListener(new o0(this));
        v().setOnItemClickListener(new o0(this));
        ModelEmptyView modelEmptyView = new ModelEmptyView(getActivity());
        modelEmptyView.f31511b.setImageResource(r.cv_empty_no_transaction_history);
        modelEmptyView.f31512c.setText(h.main_no_transaction_record);
        modelEmptyView.f31512c.setTextColor(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext()));
        v().setEmptyView(modelEmptyView);
        x xVar13 = (x) this.f27335j;
        if (xVar13 != null) {
            xVar13.f873e.setAdapter(v());
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        o oVar = this.f35262w;
        if (oVar != null) {
            oVar.dismiss();
        }
        this.f35262w = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.ui.view.TransHistoryFilterLayout.OnSelectListener
    public final void onSelectBillType(HashMap map) {
        this.f35252H = map;
        x();
        w(false);
    }

    @Override // com.transsnet.palmpay.ui.view.TransHistoryFilterLayout.OnSelectListener
    public final void onSelectStatus(String str) {
        this.f35253L = str;
        x();
        w(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(f.main_fragment_transaction_history, viewGroup, false);
        int i7 = e.adView;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = e.filterFloatLayout;
            TransHistoryFilterLayout transHistoryFilterLayout = (TransHistoryFilterLayout) p059e1.a.m(i7, viewInflate);
            if (transHistoryFilterLayout != null && (viewM = p059e1.a.m((i7 = e.includeLayout), viewInflate)) != null) {
                LinearLayout linearLayout = (LinearLayout) viewM;
                int i10 = e.ll_monthly_overview;
                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i10, viewM);
                if (linearLayout2 != null) {
                    i10 = e.moneyInTextViewSummary;
                    TextView textView = (TextView) p059e1.a.m(i10, viewM);
                    if (textView != null) {
                        i10 = e.moneyOutTextViewSummary;
                        TextView textView2 = (TextView) p059e1.a.m(i10, viewM);
                        if (textView2 != null) {
                            i10 = e.tvMonth;
                            TextView textView3 = (TextView) p059e1.a.m(i10, viewM);
                            if (textView3 != null) {
                                C0105b c0105b = new C0105b((ViewGroup) linearLayout, (View) linearLayout, (View) linearLayout2, textView, textView2, textView3, 6);
                                i7 = e.rvBillList;
                                RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                if (recyclerView != null) {
                                    i7 = e.srlBillList;
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) p059e1.a.m(i7, viewInflate);
                                    if (swipeRefreshLayout != null) {
                                        i7 = e.titleBar;
                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                        if (ppTitleBar != null) {
                                            i7 = e.topTextAd;
                                            MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) p059e1.a.m(i7, viewInflate);
                                            if (marqueeViewV2 != null) {
                                                x xVar = new x((LinearLayout) viewInflate, singleAdView, transHistoryFilterLayout, c0105b, recyclerView, swipeRefreshLayout, ppTitleBar, marqueeViewV2);
                                                Intrinsics.checkNotNullExpressionValue(xVar, "inflate(...)");
                                                return xVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM.getResources().getResourceName(i10)));
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void updateTotalAmount(int i7, int i10, long j6, long j10, String key) {
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.c(i7 + "/" + i10 + "/" + this.f35251C, key)) {
            C0105b c0105b = this.f35260p;
            if (c0105b != null && (textView2 = (TextView) c0105b.f663c) != null) {
                textView2.setText(G.i("In  ").setForegroundColor(CommonViewExtKt.colorInt(Ac.b.main_color_858a8f, requireContext())).append(r0.B(j6, false)).create());
            }
            C0105b c0105b2 = this.f35260p;
            if (c0105b2 == null || (textView = (TextView) c0105b2.f664d) == null) {
                return;
            }
            textView.setText(G.i("Out  ").setForegroundColor(CommonViewExtKt.colorInt(Ac.b.main_color_858a8f, requireContext())).append(r0.B(Math.abs(j10), false)).create());
        }
    }

    public final w v() {
        return (w) this.f35249A.getValue();
    }

    public final void w(boolean z3) {
        TransHistoryReqV2 transHistoryReqV2;
        Integer num;
        String str;
        int i7 = 0;
        if (!z3) {
            this.f35256X = 0;
            if (SizeUtils.dp2px(20.0f) < 0) {
                C0105b c0105b = this.f35260p;
                if (c0105b != null) {
                    ((LinearLayout) c0105b.f666f).setVisibility(0);
                }
            } else {
                C0105b c0105b2 = this.f35260p;
                if (c0105b2 != null) {
                    ((LinearLayout) c0105b2.f666f).setVisibility(com.transsnet.palmpay.core.config.d.s() ? 0 : 8);
                }
            }
        }
        TransactionHistoryViewModel transactionHistoryViewModel = (TransactionHistoryViewModel) this.f27333i;
        if (transactionHistoryViewModel != null) {
            long j6 = this.f35258Z;
            ArrayList arrayList = this.f35251C;
            TransHistoryReqV2 transHistoryReqV3 = new TransHistoryReqV2();
            TransactionHistoryFragment transactionHistoryFragment = transactionHistoryViewModel.f35413w;
            if (transactionHistoryFragment != null && (str = (String) transactionHistoryFragment.f35261v.getValue()) != null) {
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    transHistoryReqV3.wardMemberId = str;
                }
            }
            if (!z3 || (transHistoryReqV2 = transactionHistoryViewModel.f35410o) == null) {
                transactionHistoryViewModel.f35411p.clear();
                transHistoryReqV3.endTime = Long.valueOf(j6);
                transHistoryReqV3.beginTime = Long.valueOf(TransactionHistoryViewModel.g(j6));
                transHistoryReqV3.pageNum = 1;
            } else {
                Long l5 = transHistoryReqV2.endTime;
                if (l5 == null) {
                    l5 = 0L;
                }
                transHistoryReqV3.endTime = l5;
                transHistoryReqV3.beginTime = Long.valueOf(TransactionHistoryViewModel.g(l5.longValue()));
                TransHistoryReqV2 transHistoryReqV4 = transactionHistoryViewModel.f35410o;
                transHistoryReqV3.pageNum = Integer.valueOf(((transHistoryReqV4 == null || (num = transHistoryReqV4.pageNum) == null) ? 0 : num.intValue()) + 1);
            }
            transHistoryReqV3.pageSize = 10;
            transHistoryReqV3.conditionCode = arrayList;
            Long l6 = transHistoryReqV3.beginTime;
            String strT = r0.T(l6 != null ? l6.longValue() : 0L);
            Long l8 = transHistoryReqV3.endTime;
            StringBuilder sbF = F.f("loadTransactionData: ", strT, " - ", r0.T(l8 != null ? l8.longValue() : 0L), " loadMore ");
            sbF.append(z3);
            F6.d.h("TransHistoryViewModel", 3, sbF.toString());
            p140j8.f.t(transactionHistoryViewModel, new Pe.t0(transHistoryReqV3, null), new Pe.r0(transactionHistoryViewModel, transHistoryReqV3, i7, z3), new C0262j(transactionHistoryViewModel, transHistoryReqV3, z3));
        }
    }

    public final void x() {
        ArrayList arrayList;
        Collection<ArrayList> collectionValues;
        ArrayList arrayList2 = this.f35251C;
        if (arrayList2 == null) {
            this.f35251C = new ArrayList();
        } else if (arrayList2 != null) {
            arrayList2.clear();
        }
        HashMap map = this.f35252H;
        if (map != null && (collectionValues = map.values()) != null) {
            for (ArrayList arrayList3 : collectionValues) {
                ArrayList arrayList4 = this.f35251C;
                if (arrayList4 != null) {
                    arrayList4.addAll(arrayList3);
                }
            }
        }
        String str = this.f35253L;
        if (str == null || str.length() <= 0 || (arrayList = this.f35251C) == null) {
            return;
        }
        String str2 = this.f35253L;
        if (str2 == null) {
            str2 = "";
        }
        arrayList.add(str2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    public final void y(int i7, int i10, BillTotalCountResp bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        List<Object> data = v().getData();
        int size = data.size();
        boolean z3 = false;
        for (int i11 = 0; i11 < size; i11++) {
            TransHistoryItemBean transHistoryItemBean = (TransHistoryItemBean) data.get(i11);
            if (transHistoryItemBean.getItemType() == 1) {
                Calendar calendar = Calendar.getInstance();
                Long l5 = transHistoryItemBean.updateTime;
                calendar.setTimeInMillis(l5 != null ? l5.longValue() : 0L);
                int i12 = calendar.get(1);
                Long l6 = transHistoryItemBean.updateTime;
                long jLongValue = l6 != null ? l6.longValue() : 0L;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(jLongValue);
                if (calendar2.get(2) + 1 == i10 && i12 == i7) {
                    Long l8 = transHistoryItemBean.inComeAmount;
                    long j6 = bean.inComeAmount;
                    if (l8 != null && l8.longValue() == j6) {
                        Long l10 = transHistoryItemBean.payOutAmount;
                        long j10 = bean.payOutAmount;
                        if (l10 == null || l10.longValue() != j10) {
                            transHistoryItemBean.inComeAmount = Long.valueOf(bean.inComeAmount);
                            transHistoryItemBean.payOutAmount = Long.valueOf(bean.payOutAmount);
                            z3 = true;
                        }
                    } else {
                        transHistoryItemBean.inComeAmount = Long.valueOf(bean.inComeAmount);
                        transHistoryItemBean.payOutAmount = Long.valueOf(bean.payOutAmount);
                        z3 = true;
                    }
                }
            }
        }
        if (z3) {
            x xVar = (x) this.f27335j;
            if (xVar == null || !xVar.f873e.isComputingLayout()) {
                v().notifyDataSetChanged();
                return;
            }
            x xVar2 = (x) this.f27335j;
            if (xVar2 != null) {
                xVar2.f873e.post(new n(this, 7));
            }
        }
    }

    public final void z() {
        o oVar = this.f35262w;
        if (oVar == null || !oVar.isShowing()) {
            Calendar calendar = Calendar.getInstance();
            long timeInMillis = calendar.getTimeInMillis();
            int i7 = calendar.get(1);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            m mVar = new m(contextRequireContext);
            mVar.f11028c = 3;
            calendar.clear();
            calendar.set(i7 - 20, 0, 1);
            mVar.f11029d = Long.valueOf(calendar.getTimeInMillis());
            mVar.f11031f = Long.valueOf(timeInMillis);
            calendar.clear();
            calendar.set(this.f35255Q, this.f35254M - 1, 1);
            mVar.f11030e = Long.valueOf(calendar.getTimeInMillis());
            mVar.f11032g = new Ba.a(this, 3);
            o oVarA = mVar.a();
            oVarA.setOnDismissListener(new p0(0, this, oVarA));
            oVarA.show();
            this.f35262w = oVarA;
        }
    }
}
