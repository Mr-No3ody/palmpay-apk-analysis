package com.transsnet.palmpay.send_money.ui.activity;

import C0.G;
import Ed.ViewOnFocusChangeListenerC0235o;
import Kd.C0401o0;
import Kd.C0412s0;
import L6.b;
import M1.j;
import Pa.H;
import Pa.r0;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.custom_view.CompatStateEditText;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
import com.transsnet.palmpay.send_money.ui.view.SideBarView;
import com.transsnet.palmpay.send_money.viewmodel.SelectBankViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p159kd.e;
import p159kd.f;
import p171lb.d;
import p173ld.n;
import p173ld.q;
import p270rd.C1975s;
import p270rd.C1976t;
import p270rd.C1977u;
import p270rd.C1978v;
import p270rd.C1979w;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/select_bank_activity")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/SelectBankActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/SelectBankViewModel;", "<init>", "()V", "a", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectBankActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectBankActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/SelectBankActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,304:1\n171#2,12:305\n215#2:317\n171#2,12:318\n215#2:330\n*S KotlinDebug\n*F\n+ 1 SelectBankActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/SelectBankActivity\n*L\n190#1:305,12\n190#1:317\n211#1:318,12\n211#1:330\n*E\n"})
public final class SelectBankActivity extends BaseMvvmActivity<SelectBankViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f33187A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33190e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33191f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33192g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f33193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f33194j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f33195o = C2131j.b(new d(28));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33196p = C2131j.b(new d(29));
    public final t t = C2131j.b(new C1976t(0));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f33197v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f33198w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActForResult(@NotNull Activity activity, int i7) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.startActivityForResult(new Intent(activity, (Class<?>) SelectBankActivity.class), i7);
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public SelectBankActivity() {
        final int i7 = 0;
        this.f33188c = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i7) {
                    case 0:
                        int i10 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i11 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i12 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i13 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i14 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i15 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i16 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i10 = 1;
        this.f33189d = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i10) {
                    case 0:
                        int i11 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i12 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i13 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i14 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i15 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i16 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i17 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i11 = 2;
        this.f33190e = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i11) {
                    case 0:
                        int i12 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i13 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i14 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i15 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i16 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i17 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i18 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i12 = 3;
        this.f33191f = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i12) {
                    case 0:
                        int i13 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i14 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i15 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i16 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i17 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i18 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i19 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i13 = 4;
        this.f33192g = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i13) {
                    case 0:
                        int i14 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i15 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i16 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i17 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i18 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i19 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i110 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i14 = 5;
        this.f33193i = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i14) {
                    case 0:
                        int i15 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i16 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i17 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i18 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i19 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i110 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i111 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
        final int i15 = 6;
        this.f33194j = C2131j.b(new Function0(this) { // from class: rd.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectBankActivity f41771b;

            {
                this.f41771b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SelectBankActivity selectBankActivity = this.f41771b;
                switch (i15) {
                    case 0:
                        int i16 = SelectBankActivity.f33187A;
                        return (SideBarView) selectBankActivity.findViewById(e.side_bar);
                    case 1:
                        int i17 = SelectBankActivity.f33187A;
                        return (RecyclerView) selectBankActivity.findViewById(e.bank_rv);
                    case 2:
                        int i18 = SelectBankActivity.f33187A;
                        return (CompatStateEditText) selectBankActivity.findViewById(e.search_et);
                    case 3:
                        int i19 = SelectBankActivity.f33187A;
                        return (ImageView) selectBankActivity.findViewById(e.search_iv);
                    case 4:
                        int i110 = SelectBankActivity.f33187A;
                        return (PpTitleBar) selectBankActivity.findViewById(e.select_bank_title_bar);
                    case 5:
                        int i111 = SelectBankActivity.f33187A;
                        return new RecyclerView(selectBankActivity);
                    default:
                        int i112 = SelectBankActivity.f33187A;
                        return new q(selectBankActivity);
                }
            }
        });
    }

    public static final ArrayList m(SelectBankActivity selectBankActivity, List list, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BankInfo bankInfo = (BankInfo) it.next();
            if (z3) {
                if (!TextUtils.isEmpty(bankInfo.indexType)) {
                    arrayList.add(bankInfo);
                }
            } else if (TextUtils.isEmpty(bankInfo.indexType)) {
                arrayList.add(bankInfo);
            }
        }
        return arrayList;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_select_bank;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        n().setLayoutManager(new LinearLayoutManager(this));
        n().setAdapter(o());
        n().setNestedScrollingEnabled(false);
        o().setOnItemClickListener(new C1975s(this));
        q().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        q().setLayoutManager(new GridLayoutManager(this, 3));
        q().setNestedScrollingEnabled(false);
        q().addItemDecoration(new C1978v());
        q().setAdapter(p());
        p().f4986c = new C1975s(this);
        j.setHeaderView$default(o(), q(), 0, 0, 6, null);
        t tVar = this.f33188c;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((SideBarView) value).setLetters(getResources().getStringArray(p159kd.a.sm_select_bank_slide_bar_value_new));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((SideBarView) value2).setOnLetterChangeListener(new C1977u(this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final RecyclerView n() {
        Object value = this.f33189d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final n o() {
        return (n) this.f33195o.getValue();
    }

    public final q p() {
        return (q) this.f33194j.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((SelectBankViewModel) l()).f34019e;
        if (lVar != null) {
            lVar.e(this, new p054dd.q(new C1979w(this, this, 0), 18));
        }
        l lVar2 = ((SelectBankViewModel) l()).f34020f;
        if (lVar2 != null) {
            lVar2.e(this, new p054dd.q(new C1979w(this, this, 1), 18));
        }
        if (this.f33197v != -1) {
            SelectBankViewModel selectBankViewModel = (SelectBankViewModel) l();
            QueryBankListReq queryBankListReq = new QueryBankListReq(this.f33197v, this.f33198w);
            selectBankViewModel.getClass();
            String strB = H.b("queryBankList", queryBankListReq);
            Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
            AbstractC0780y.m(V.h(selectBankViewModel), null, null, new C0412s0(selectBankViewModel.f34020f, G.p("Pref_", strB, "_", BaseApplication.getCountryLocale()), null, queryBankListReq), 3);
            return;
        }
        SelectBankViewModel selectBankViewModel2 = (SelectBankViewModel) l();
        String code = BaseApplication.getCountryLocale();
        Intrinsics.checkNotNullExpressionValue(code, "getCountryLocale(...)");
        selectBankViewModel2.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        String strB2 = H.b("queryAllBankList", code);
        Intrinsics.checkNotNullExpressionValue(strB2, "createCacheKey(...)");
        AbstractC0780y.m(V.h(selectBankViewModel2), null, null, new C0401o0(selectBankViewModel2.f34019e, G.p("Pref_", strB2, "_", BaseApplication.getCountryLocale()), null, code), 3);
    }

    public final RecyclerView q() {
        return (RecyclerView) this.f33193i.getValue();
    }

    public final CompatStateEditText r() {
        Object value = this.f33190e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (CompatStateEditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        Object value = this.f33192g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setTitle(r0.H0(k.core_select_bank));
        r().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 20));
        r().addTextChangedListener(new R3.e(this, 18));
    }
}
