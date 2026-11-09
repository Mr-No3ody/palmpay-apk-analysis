package com.transsnet.palmpay.teller.ui.dialog;

import Pa.C0525w;
import Pa.b0;
import Pa.n0;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.V;
import Xd.v;
import Yd.i;
import Yd.j;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.DataBundleListByCategoryIdResp;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemTipsBean;
import com.transsnet.palmpay.teller.ui.adapter.DataBundleWalletAdapter$OnDataBundleItemClickListener;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ,2\u00020\u0001:\u0001-B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001c\u0010\u0015J\u001d\u0010\u001d\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/DataBundleWalletDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "Lcom/transsnet/palmpay/teller/bean/DataBundleListByCategoryIdResp$DataBundleWalletItemChildBean;", "items", "Lcom/transsnet/palmpay/teller/bean/DataBundleWalletItemTipsBean;", "tipsData", "", "categoryName", "billerName", "tabDetail", "", "displayMode", "Lcom/transsnet/palmpay/teller/ui/adapter/DataBundleWalletAdapter$OnDataBundleItemClickListener;", "itemClickListener", "<init>", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/transsnet/palmpay/teller/ui/adapter/DataBundleWalletAdapter$OnDataBundleItemClickListener;)V", "", "trackDataBundleItemsExposure", "()V", "createDialogItemClickListener", "()Lcom/transsnet/palmpay/teller/ui/adapter/DataBundleWalletAdapter$OnDataBundleItemClickListener;", "Landroid/view/View;", "rootView", "updateWindowHeight", "(Landroid/view/View;)V", "initViews", "updateTipsInfo", "(Ljava/util/List;)V", "Ljava/util/List;", "Ljava/lang/String;", "I", "Lcom/transsnet/palmpay/teller/ui/adapter/DataBundleWalletAdapter$OnDataBundleItemClickListener;", "LRd/V;", "binding", "LRd/V;", "LXd/v;", "adapter$delegate", "Lkotlin/Lazy;", "getAdapter", "()LXd/v;", "adapter", "Companion", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDataBundleWalletDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataBundleWalletDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/DataBundleWalletDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1#2:132\n1878#3,3:133\n*S KotlinDebug\n*F\n+ 1 DataBundleWalletDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/DataBundleWalletDialog\n*L\n71#1:133,3\n*E\n"})
public final class DataBundleWalletDialog extends b {
    private static final int COLUMN_COUNT = 2;
    private static final int ITEM_HORIZONTAL_SPACING = 12;
    private static final float MAX_HEIGHT_RATIO = 0.75f;

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Nullable
    private final String billerName;

    @Nullable
    private V binding;

    @Nullable
    private final String categoryName;
    private final int displayMode;

    @Nullable
    private final DataBundleWalletAdapter$OnDataBundleItemClickListener itemClickListener;

    @NotNull
    private final List<DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean> items;

    @Nullable
    private final String tabDetail;

    @Nullable
    private final List<DataBundleWalletItemTipsBean> tipsData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBundleWalletDialog(@NotNull Context context, @NotNull List<DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean> items, @Nullable List<DataBundleWalletItemTipsBean> list, @Nullable String str, @Nullable String str2, @Nullable String str3, int i7, @Nullable DataBundleWalletAdapter$OnDataBundleItemClickListener dataBundleWalletAdapter$OnDataBundleItemClickListener) {
        super(context, d.qt_dialog_data_bundle_wallet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.tipsData = list;
        this.categoryName = str;
        this.billerName = str2;
        this.tabDetail = str3;
        this.displayMode = i7;
        this.itemClickListener = dataBundleWalletAdapter$OnDataBundleItemClickListener;
        this.adapter = C2131j.b(new b0(27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v adapter_delegate$lambda$0() {
        return new v(false);
    }

    private final DataBundleWalletAdapter$OnDataBundleItemClickListener createDialogItemClickListener() {
        return new j(this);
    }

    private final v getAdapter() {
        return (v) this.adapter.getValue();
    }

    private final void trackDataBundleItemsExposure() {
        int i7 = 0;
        for (Object obj : this.items) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean dataBundleWalletItemChildBean = (DataBundleListByCategoryIdResp.DataBundleWalletItemChildBean) obj;
            String itemId = dataBundleWalletItemChildBean.getItemId();
            String str = "";
            if (itemId == null) {
                itemId = "";
            }
            Pair pair = new Pair("ItemID", itemId);
            String itemName = dataBundleWalletItemChildBean.getItemName();
            if (itemName == null) {
                itemName = "";
            }
            Pair pair2 = new Pair("ItemName", itemName);
            String str2 = this.categoryName;
            if (str2 == null) {
                str2 = "";
            }
            LinkedHashMap linkedHashMapF = G.f(pair, pair2, new Pair("ItemTab", str2), new Pair("ItemOrder", Integer.valueOf(i10)));
            n0 n0VarG = n0.g();
            String str3 = this.categoryName;
            if (str3 == null) {
                str3 = "";
            }
            ViewEvent viewEventAfEvt = new ViewEvent("data_package_slot_show_" + str3 + "_" + i10).afEvt(false);
            String str4 = this.billerName;
            if (str4 == null) {
                str4 = "";
            }
            ViewEvent viewEventAdd = viewEventAfEvt.add("Biller", str4);
            String str5 = this.tabDetail;
            if (str5 != null) {
                str = str5;
            }
            n0VarG.u(viewEventAdd.add("TabDetail", str).add("ItemDetail", ((Gson) C0525w.f().f7166b).toJson(linkedHashMapF)));
            i7 = i10;
        }
    }

    private final void updateWindowHeight(View rootView) {
        WindowManager.LayoutParams attributes;
        if (rootView == null) {
            return;
        }
        rootView.measure(View.MeasureSpec.makeMeasureSpec(ScreenUtils.getScreenWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (ScreenUtils.getScreenHeight() * MAX_HEIGHT_RATIO), Integer.MIN_VALUE));
        Window window = getWindow();
        if (window != null) {
            Window window2 = getWindow();
            if (window2 == null || (attributes = window2.getAttributes()) == null) {
                attributes = null;
            } else {
                attributes.height = rootView.getMeasuredHeight();
            }
            window.setAttributes(attributes);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.closeIv;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = c.dataBundleWalletRy;
            RecyclerView recyclerView = (RecyclerView) a.m(i7, viewFindViewById);
            if (recyclerView != null) {
                i7 = c.titleTv;
                TextView textView = (TextView) a.m(i7, viewFindViewById);
                if (textView != null) {
                    this.binding = new V(textView, (ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView);
                    String string = this.categoryName;
                    if (string == null) {
                        string = getContext().getString(f.qt_data_plans);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        if (StringsKt.F(string)) {
                            string = null;
                        }
                        if (string == null) {
                            string = getContext().getString(f.qt_data_plans);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        }
                    }
                    textView.setText(string);
                    V v3 = this.binding;
                    if (v3 != null) {
                        v3.f8163c.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
                    }
                    V v4 = this.binding;
                    if (v4 != null) {
                        v4.f8163c.addItemDecoration(new Qb.a(2, CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(0)));
                    }
                    V v10 = this.binding;
                    if (v10 != null) {
                        v10.f8163c.setAdapter(getAdapter());
                    }
                    getAdapter().f11178e = createDialogItemClickListener();
                    v adapter = getAdapter();
                    int i10 = this.displayMode;
                    if (adapter.f11176c != i10) {
                        adapter.f11176c = i10;
                        adapter.notifyDataSetChanged();
                    }
                    getAdapter().f(this.items, this.tipsData);
                    trackDataBundleItemsExposure();
                    V v11 = this.binding;
                    if (v11 != null) {
                        v11.f8162b.setOnClickListener(new i(this, 0));
                    }
                    showAtBottom(getWindow());
                    V v12 = this.binding;
                    updateWindowHeight(v12 != null ? v12.f8161a : null);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void updateTipsInfo(@Nullable List<DataBundleWalletItemTipsBean> tipsData) {
        getAdapter().g(tipsData);
    }
}
