package com.transsnet.palmpay.databundle.ui.fragment;

import M1.j;
import Pa.C0525w;
import Pa.n0;
import Pd.d;
import Rd.h0;
import T8.f;
import Xd.v;
import Zd.C0803h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.fragment.DataBundleWalletFragment;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.bean.BaseDataBundleItemBean;
import com.transsnet.palmpay.teller.bean.DataBundleExtraItemInfo;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.ui.dialog.DataBundleWalletDialog;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p002a.a;
import p010a9.m;
import p052da.ViewOnClickListenerC1649v;
import p100gc.b;
import p100gc.c;
import p130ic.C;
import p130ic.C1747b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/fragment/DataBundleWalletFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "LRd/h0;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleWalletFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleWalletFragment.kt\ncom/transsnet/palmpay/databundle/ui/fragment/DataBundleWalletFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n172#2,9:346\n172#2,9:355\n172#2,9:364\n1878#3,3:373\n1#4:376\n*S KotlinDebug\n*F\n+ 1 DataBundleWalletFragment.kt\ncom/transsnet/palmpay/databundle/ui/fragment/DataBundleWalletFragment\n*L\n65#1:346,9\n66#1:355,9\n67#1:364,9\n92#1:373,3\n*E\n"})
public final class DataBundleWalletFragment extends BaseMvvmVBFragment<BaseViewModel, h0> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f31771A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f31772B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean f31773C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public DataBundleWalletDialog f31775L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31776o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f31779w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f31777p = a.h(this, G.a(C.class), new c(this, 0), new c(this, 1), new c(this, 2));
    public final b0 t = a.h(this, G.a(C1747b.class), new c(this, 3), new c(this, 4), new c(this, 5));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f31778v = a.h(this, G.a(DataBundleHomeViewModel.class), new c(this, 6), new c(this, 7), new c(this, 8));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f31774H = C2131j.b(new com.transsnet.palmpay.managemoney.ui.view.c(8));

    public DataBundleWalletFragment() {
        final int i7 = 0;
        this.f31776o = C2131j.b(new Function0(this) { // from class: gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataBundleWalletFragment f37175b;

            {
                this.f37175b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i7) {
                    case 0:
                        return new GridLayoutManager(this.f37175b.getContext(), 2, 1, false);
                    case 1:
                        Bundle arguments = this.f37175b.getArguments();
                        return (arguments == null || (string = arguments.getString("operatorCode")) == null) ? "" : string;
                    case 2:
                        Bundle arguments2 = this.f37175b.getArguments();
                        String string2 = arguments2 != null ? arguments2.getString("tabDetail") : null;
                        return string2 == null ? "" : string2;
                    default:
                        Bundle arguments3 = this.f37175b.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt(FirebaseAnalytics.Param.INDEX) : 0);
                }
            }
        });
        final int i10 = 1;
        this.f31779w = C2131j.b(new Function0(this) { // from class: gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataBundleWalletFragment f37175b;

            {
                this.f37175b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i10) {
                    case 0:
                        return new GridLayoutManager(this.f37175b.getContext(), 2, 1, false);
                    case 1:
                        Bundle arguments = this.f37175b.getArguments();
                        return (arguments == null || (string = arguments.getString("operatorCode")) == null) ? "" : string;
                    case 2:
                        Bundle arguments2 = this.f37175b.getArguments();
                        String string2 = arguments2 != null ? arguments2.getString("tabDetail") : null;
                        return string2 == null ? "" : string2;
                    default:
                        Bundle arguments3 = this.f37175b.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt(FirebaseAnalytics.Param.INDEX) : 0);
                }
            }
        });
        final int i11 = 2;
        this.f31771A = C2131j.b(new Function0(this) { // from class: gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataBundleWalletFragment f37175b;

            {
                this.f37175b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i11) {
                    case 0:
                        return new GridLayoutManager(this.f37175b.getContext(), 2, 1, false);
                    case 1:
                        Bundle arguments = this.f37175b.getArguments();
                        return (arguments == null || (string = arguments.getString("operatorCode")) == null) ? "" : string;
                    case 2:
                        Bundle arguments2 = this.f37175b.getArguments();
                        String string2 = arguments2 != null ? arguments2.getString("tabDetail") : null;
                        return string2 == null ? "" : string2;
                    default:
                        Bundle arguments3 = this.f37175b.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt(FirebaseAnalytics.Param.INDEX) : 0);
                }
            }
        });
        final int i12 = 3;
        this.f31772B = C2131j.b(new Function0(this) { // from class: gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DataBundleWalletFragment f37175b;

            {
                this.f37175b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String string;
                switch (i12) {
                    case 0:
                        return new GridLayoutManager(this.f37175b.getContext(), 2, 1, false);
                    case 1:
                        Bundle arguments = this.f37175b.getArguments();
                        return (arguments == null || (string = arguments.getString("operatorCode")) == null) ? "" : string;
                    case 2:
                        Bundle arguments2 = this.f37175b.getArguments();
                        String string2 = arguments2 != null ? arguments2.getString("tabDetail") : null;
                        return string2 == null ? "" : string2;
                    default:
                        Bundle arguments3 = this.f37175b.getArguments();
                        return Integer.valueOf(arguments3 != null ? arguments3.getInt(FirebaseAnalytics.Param.INDEX) : 0);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ArrayList<DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean> arrayList;
        String bundleCategoryName;
        v vVarU = u();
        b0 b0Var = this.t;
        Integer num = (Integer) ((C1747b) b0Var.getValue()).f37496d.d();
        int iIntValue = num != null ? num.intValue() : 1;
        if (vVarU.f11176c != iIntValue) {
            vVarU.f11176c = iIntValue;
            vVarU.notifyDataSetChanged();
        }
        DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean = this.f31773C;
        if (dataBundleWalletCategoryBean == null || (arrayList = dataBundleWalletCategoryBean.getItemList()) == null) {
            arrayList = new ArrayList<>();
        }
        u().f(arrayList, null);
        int i7 = 0;
        for (Object obj : u().getData()) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            BaseDataBundleItemBean baseDataBundleItemBean = (BaseDataBundleItemBean) obj;
            DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = baseDataBundleItemBean instanceof DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean ? (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) baseDataBundleItemBean : null;
            if (dataBundleWalletItemChildBean != null) {
                String itemId = dataBundleWalletItemChildBean.getItemId();
                if (itemId == null) {
                    itemId = "";
                }
                Pair pair = new Pair("ItemID", itemId);
                String itemName = dataBundleWalletItemChildBean.getItemName();
                if (itemName == null) {
                    itemName = "";
                }
                Pair pair2 = new Pair("ItemName", itemName);
                DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean2 = this.f31773C;
                String bundleCategoryName2 = dataBundleWalletCategoryBean2 != null ? dataBundleWalletCategoryBean2.getBundleCategoryName() : null;
                if (bundleCategoryName2 == null) {
                    bundleCategoryName2 = "";
                }
                LinkedHashMap linkedHashMapF = kotlin.collections.G.f(pair, pair2, new Pair("ItemTab", bundleCategoryName2), new Pair("ItemOrder", Integer.valueOf(i10)));
                n0 n0VarG = n0.g();
                DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean3 = this.f31773C;
                if (dataBundleWalletCategoryBean3 == null || (bundleCategoryName = dataBundleWalletCategoryBean3.getBundleCategoryName()) == null) {
                    bundleCategoryName = "";
                }
                ViewEvent viewEventAfEvt = new ViewEvent("data_package_slot_show_" + bundleCategoryName + "_" + i10).afEvt(false);
                DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean dataBundleWalletCategoryBean4 = this.f31773C;
                String billerName = dataBundleWalletCategoryBean4 != null ? dataBundleWalletCategoryBean4.getBillerName() : null;
                n0VarG.u(viewEventAfEvt.add("Biller", billerName != null ? billerName : "").add("TabDetail", (String) this.f31771A.getValue()).add("ItemDetail", ((Gson) C0525w.f().f7166b).toJson(linkedHashMapF)));
            }
            i7 = i10;
        }
        ((C1747b) b0Var.getValue()).f37496d.e(getViewLifecycleOwner(), new f(new m(this, 25), (byte) 0));
        b0 b0Var2 = this.f31777p;
        DataBundleExtraItemInfo dataBundleExtraItemInfoD = ((C) b0Var2.getValue()).d((String) this.f31779w.getValue());
        if (dataBundleExtraItemInfoD != null) {
            u().g(dataBundleExtraItemInfoD.getBundleTips());
            DataBundleWalletDialog dataBundleWalletDialog = this.f31775L;
            if (dataBundleWalletDialog != null) {
                dataBundleWalletDialog.updateTipsInfo(dataBundleExtraItemInfoD.getBundleTips());
            }
        }
        ((C) b0Var2.getValue()).f37494d.e(getViewLifecycleOwner(), new C0803h(this, 3));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        super.o();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("listJson")) == null) {
            string = "";
        }
        this.f31773C = string.length() > 0 ? (DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean) d0.l(DataBundleListByCategoryIdResp.DataBundleWalletCategoryBean.class, string) : null;
        if (getContext() != null) {
            h0 h0Var = (h0) this.f27335j;
            if (h0Var != null) {
                h0Var.f8330b.setLayoutManager((GridLayoutManager) this.f31776o.getValue());
            }
            h0 h0Var2 = (h0) this.f27335j;
            if (h0Var2 != null) {
                h0Var2.f8330b.addItemDecoration(new Qb.a(2, CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(0)));
            }
            h0 h0Var3 = (h0) this.f27335j;
            if (h0Var3 != null) {
                h0Var3.f8330b.setAdapter(u());
            }
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            int i7 = d.qt_item_data_bundle_wallet_foot;
            h0 h0Var4 = (h0) this.f27335j;
            View viewInflate = layoutInflaterFrom.inflate(i7, (ViewGroup) (h0Var4 != null ? h0Var4.f8330b : null), false);
            viewInflate.setOnClickListener(new ViewOnClickListenerC1649v(this, 2));
            u().f11177d = new m(viewInflate, 26);
            u().setEmptyView(d.qt_fragment_data_bundle_wallet_empty);
            j.addFooterView$default(u(), viewInflate, 0, 0, 6, null);
            u().f11178e = new b(this);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DataBundleWalletDialog dataBundleWalletDialog = this.f31775L;
        if (dataBundleWalletDialog != null) {
            dataBundleWalletDialog.dismiss();
        }
        this.f31775L = null;
        u().f11178e = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        String string;
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString("operatorCode", (String) this.f31779w.getValue());
        outState.putInt(FirebaseAnalytics.Param.INDEX, ((Number) this.f31772B.getValue()).intValue());
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("listJson")) == null || string.length() <= 0) {
            return;
        }
        outState.putString("listJson", string);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle arguments;
        super.onViewStateRestored(bundle);
        if (bundle == null || (arguments = getArguments()) == null) {
            return;
        }
        String string = bundle.getString("operatorCode");
        if (string != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                arguments.putString("operatorCode", string);
            }
        }
        String string2 = bundle.getString("listJson");
        if (string2 != null) {
            String str = string2.length() > 0 ? string2 : null;
            if (str != null) {
                arguments.putString("listJson", str);
            }
        }
        arguments.putInt(FirebaseAnalytics.Param.INDEX, bundle.getInt(FirebaseAnalytics.Param.INDEX, arguments.getInt(FirebaseAnalytics.Param.INDEX)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(d.qt_fragment_data_bundle_wallet, viewGroup, false);
        int i7 = Pd.c.data_bundle_wallet_ry;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
        }
        h0 h0Var = new h0((LinearLayout) viewInflate, recyclerView);
        Intrinsics.checkNotNullExpressionValue(h0Var, "inflate(...)");
        return h0Var;
    }

    public final v u() {
        return (v) this.f31774H.getValue();
    }
}
