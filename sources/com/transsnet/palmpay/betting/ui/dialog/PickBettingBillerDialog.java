package com.transsnet.palmpay.betting.ui.dialog;

import Bc.p;
import Gb.Q;
import M1.j;
import N3.c;
import Pd.f;
import Rd.n0;
import Rd.o0;
import Wd.C0742p;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p055de.h;
import p270rd.C1976t;
import p308u9.a;
import p355xf.C2131j;
import t9.d;
import t9.g;
import t9.i;
import t9.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001RB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u0019\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b \u0010\u0013J\u000f\u0010!\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u000f\u0010#\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010\nJ\u000f\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b$\u0010\nJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010\u001dJ\u001d\u0010(\u001a\u00020\b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b(\u0010\u000fJ\u001b\u0010*\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b\u0005\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R*\u00106\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u000104j\n\u0012\u0004\u0012\u00020\f\u0018\u0001`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR+\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\f04j\b\u0012\u0004\u0012\u00020\f`58BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001a0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\"\u0010M\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\u001d¨\u0006S"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "isDarkMode", "<init>", "(Landroid/content/Context;Z)V", "", "initViews", "()V", "", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "list", "setBillers", "(Ljava/util/List;)V", "setHistoryBillers", "biller", "setSelectBiller", "(Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;)V", "updateEmptyUI", "Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;)V", "initSearch", "", "s", "updateLayoutVisible", "(Ljava/lang/String;)V", "initBillerList", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "clickBillerItem", "initHistory", "changeDialogHeight", "initSideBar", "updateSideBarSelection", "letter", "scrollToSection", "sectionList", "updateIndexLetters", "name", "getFirstLetter", "(Ljava/lang/String;)Ljava/lang/String;", "Z", "()Z", "LRd/o0;", "headerBinding", "LRd/o0;", "LRd/n0;", "binding", "LRd/n0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSearchBillerResult", "Ljava/util/ArrayList;", "mCallBack", "Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;", "mSelectBiller", "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "Lt9/i;", "mAdapter", "Lt9/i;", "Lt9/d;", "mHistoryAdapter", "Lt9/d;", "datas$delegate", "Lkotlin/Lazy;", "getDatas", "()Ljava/util/ArrayList;", "datas", "Lcom/transsnet/palmpay/teller/ui/view/SideBarView;", "sideBar", "Lcom/transsnet/palmpay/teller/ui/view/SideBarView;", "", "indexLetters", "Ljava/util/List;", "businessName", "Ljava/lang/String;", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "CallBack", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickBettingBillerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickBettingBillerDialog.kt\ncom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,396:1\n360#2,7:397\n774#2:404\n865#2,2:405\n1617#2,9:407\n1869#2:416\n1870#2:418\n1626#2:419\n1#3:417\n37#4:420\n36#4,3:421\n*S KotlinDebug\n*F\n+ 1 PickBettingBillerDialog.kt\ncom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog\n*L\n341#1:397,7\n362#1:404\n362#1:405,2\n363#1:407,9\n363#1:416\n363#1:418\n363#1:419\n363#1:417\n373#1:420\n373#1:421,3\n*E\n"})
public final class PickBettingBillerDialog extends b {

    @Nullable
    private n0 binding;

    @NotNull
    private String businessName;

    /* JADX INFO: renamed from: datas$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy datas;

    @Nullable
    private o0 headerBinding;

    @NotNull
    private final List<String> indexLetters;
    private final boolean isDarkMode;

    @Nullable
    private i mAdapter;

    @Nullable
    private CallBack mCallBack;

    @Nullable
    private d mHistoryAdapter;

    @Nullable
    private ArrayList<BettingBillerListItemBean> mSearchBillerResult;

    @Nullable
    private BettingBillerListItemBean mSelectBiller;

    @Nullable
    private SideBarView sideBar;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/betting/ui/dialog/PickBettingBillerDialog$CallBack;", "", "onDialogBillerClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/betting/bean/BettingBillerListItemBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onDialogBillerClick(@Nullable BettingBillerListItemBean data);
    }

    public /* synthetic */ PickBettingBillerDialog(Context context, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? false : z3);
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = (int) (ScreenUtils.getScreenHeight() * 0.8f);
        window.setAttributes(attributes);
    }

    private final void clickBillerItem(BettingBillerListItemBean data) {
        Integer status;
        if (data == null || (status = data.getStatus()) == null || 1 != status.intValue()) {
            ToastUtils.showShort(this.mContext.getString(f.qt_mobile_network_unavailable, data != null ? data.getBillerName() : null), new Object[0]);
            return;
        }
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            callBack.onDialogBillerClick(data);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayList datas_delegate$lambda$0() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<BettingBillerListItemBean> getDatas() {
        return (ArrayList) this.datas.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    public final String getFirstLetter(String name) {
        String strL;
        if (TextUtils.isEmpty(name)) {
            return "#";
        }
        if (name != null) {
            String strSubstring = name.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (strSubstring != null) {
                strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", strSubstring, "toUpperCase(...)");
            } else {
                strL = null;
            }
        } else {
            strL = null;
        }
        return (strL == null || new Regex("[A-Z]").b(strL)) ? strL : "#";
    }

    private final void initBillerList() {
        LinearLayout linearLayout;
        n0 n0Var = this.binding;
        if (n0Var != null) {
            n0Var.f8417b.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        boolean z3 = this.isDarkMode;
        i iVar = new i();
        iVar.a(new g(z3));
        iVar.a(new c(9));
        this.mAdapter = iVar;
        o0 o0Var = this.headerBinding;
        if (o0Var != null && (linearLayout = o0Var.f8439a) != null) {
            j.addHeaderView$default(iVar, linearLayout, 0, 0, 6, null);
        }
        n0 n0Var2 = this.binding;
        if (n0Var2 != null) {
            n0Var2.f8417b.setAdapter(this.mAdapter);
        }
        i iVar2 = this.mAdapter;
        if (iVar2 != null) {
            iVar2.setOnItemClickListener(new a(this, 1));
        }
        n0 n0Var3 = this.binding;
        if (n0Var3 != null) {
            n0Var3.f8417b.addOnScrollListener(new p308u9.c(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBillerList$lambda$5(PickBettingBillerDialog pickBettingBillerDialog, j jVar, View view, int i7) {
        String billerName;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        i iVar = pickBettingBillerDialog.mAdapter;
        BettingBillerListItemBean bettingBillerListItemBean = iVar != null ? (BettingBillerListItemBean) iVar.getItem(i7) : null;
        pickBettingBillerDialog.clickBillerItem(bettingBillerListItemBean);
        Pa.n0 n0VarG = Pa.n0.g();
        ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_Billers");
        if (bettingBillerListItemBean == null || (billerName = bettingBillerListItemBean.getBillerName()) == null) {
            billerName = "";
        }
        n0VarG.k(clickEvent.add("element_name", billerName));
    }

    private final void initHistory() {
        d dVar = new d(this.isDarkMode);
        this.mHistoryAdapter = dVar;
        o0 o0Var = this.headerBinding;
        if (o0Var != null) {
            RecyclerView recyclerView = o0Var.f8441c;
            recyclerView.setAdapter(dVar);
            recyclerView.setLayoutManager(new GridLayoutManager(this.mContext, 3, 1, false));
            recyclerView.addItemDecoration(new k(CommonViewExtKt.getDp(12)));
        }
        d dVar2 = this.mHistoryAdapter;
        if (dVar2 != null) {
            dVar2.setOnItemClickListener(new a(this, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initHistory$lambda$7(PickBettingBillerDialog pickBettingBillerDialog, j jVar, View view, int i7) {
        String billerName;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        d dVar = pickBettingBillerDialog.mHistoryAdapter;
        BettingBillerListItemBean bettingBillerListItemBean = dVar != null ? (BettingBillerListItemBean) dVar.getItem(i7) : null;
        pickBettingBillerDialog.clickBillerItem(bettingBillerListItemBean);
        Pa.n0 n0VarG = Pa.n0.g();
        ClickEvent clickEvent = new ClickEvent("PPay_Betting_Btn_History");
        if (bettingBillerListItemBean == null || (billerName = bettingBillerListItemBean.getBillerName()) == null) {
            billerName = "";
        }
        n0VarG.k(clickEvent.add("element_name", billerName));
    }

    private final void initSearch() {
        n0 n0Var = this.binding;
        h hVar = n0Var != null ? new h((LinearLayout) n0Var.f8421f.f751e) : null;
        n0 n0Var2 = this.binding;
        if (n0Var2 != null) {
            ((ImageView) n0Var2.f8420e.f812c).setOnClickListener(new p308u9.b(this, 0));
        }
        n0 n0Var3 = this.binding;
        if (n0Var3 != null) {
            ((EditText) n0Var3.f8420e.f813d).setHint(getContext().getString(f.qt_search_betting_sites));
        }
        n0 n0Var4 = this.binding;
        if (n0Var4 != null) {
            ((EditText) n0Var4.f8420e.f813d).addTextChangedListener(new C0742p(4, this, hVar));
        }
        if (hVar != null) {
            String str = this.businessName;
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            hVar.f35918b = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSearch$lambda$3(PickBettingBillerDialog pickBettingBillerDialog, View view) {
        p pVar;
        EditText editText;
        n0 n0Var = pickBettingBillerDialog.binding;
        if (n0Var == null || (pVar = n0Var.f8420e) == null || (editText = (EditText) pVar.f813d) == null) {
            return;
        }
        editText.setText("");
    }

    private final void initSideBar() {
        n0 n0Var = this.binding;
        SideBarView sideBarView = n0Var != null ? n0Var.f8422g : null;
        this.sideBar = sideBarView;
        if (sideBarView != null) {
            sideBarView.setOnLetterChangeListener(new p308u9.d(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToSection(String letter) {
        RecyclerView recyclerView;
        List<Object> data;
        RecyclerView recyclerView2;
        if (Intrinsics.c(letter, "*")) {
            n0 n0Var = this.binding;
            if (n0Var != null && (recyclerView2 = n0Var.f8417b) != null) {
                recyclerView2.scrollToPosition(0);
            }
            SideBarView sideBarView = this.sideBar;
            if (sideBarView != null) {
                sideBarView.setCurrentLetter("*");
                return;
            }
            return;
        }
        i iVar = this.mAdapter;
        int i7 = -1;
        if (iVar != null && (data = iVar.getData()) != null) {
            Iterator<Object> it = data.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) it.next();
                if (bettingBillerListItemBean.getItemType() == 2 && Intrinsics.c(bettingBillerListItemBean.getHeader(), letter)) {
                    i7 = i10;
                    break;
                }
                i10++;
            }
        }
        if (i7 >= 0) {
            n0 n0Var2 = this.binding;
            RecyclerView.LayoutManager layoutManager = (n0Var2 == null || (recyclerView = n0Var2.f8417b) == null) ? null : recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.scrollToPositionWithOffset(i7, 0);
            }
        }
    }

    private final void updateIndexLetters(List<BettingBillerListItemBean> sectionList) {
        this.indexLetters.clear();
        this.indexLetters.add("*");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sectionList) {
            if (((BettingBillerListItemBean) obj).getItemType() == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String header = ((BettingBillerListItemBean) it.next()).getHeader();
            if (header != null) {
                arrayList2.add(header);
            }
        }
        this.indexLetters.addAll(CollectionsKt.T(CollectionsKt.B(arrayList2), new Q(15)));
        SideBarView sideBarView = this.sideBar;
        if (sideBarView != null) {
            sideBarView.setLetters((String[]) this.indexLetters.toArray(new String[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLayoutVisible(String s3) {
        LinearLayout linearLayout;
        p pVar;
        ImageView imageView;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        p pVar2;
        ImageView imageView2;
        if (!TextUtils.isEmpty(s3)) {
            n0 n0Var = this.binding;
            if (n0Var != null && (pVar = n0Var.f8420e) != null && (imageView = (ImageView) pVar.f812c) != null) {
                p220oa.h.s(imageView, true);
            }
            SideBarView sideBarView = this.sideBar;
            if (sideBarView != null) {
                p220oa.h.s(sideBarView, false);
            }
            o0 o0Var = this.headerBinding;
            if (o0Var == null || (linearLayout = o0Var.f8440b) == null) {
                return;
            }
            p220oa.h.s(linearLayout, false);
            return;
        }
        n0 n0Var2 = this.binding;
        if (n0Var2 != null && (pVar2 = n0Var2.f8420e) != null && (imageView2 = (ImageView) pVar2.f812c) != null) {
            p220oa.h.s(imageView2, false);
        }
        SideBarView sideBarView2 = this.sideBar;
        if (sideBarView2 != null) {
            p220oa.h.s(sideBarView2, true);
        }
        d dVar = this.mHistoryAdapter;
        List<Object> data = dVar != null ? dVar.getData() : null;
        if (data == null || data.isEmpty()) {
            o0 o0Var2 = this.headerBinding;
            if (o0Var2 == null || (linearLayout2 = o0Var2.f8440b) == null) {
                return;
            }
            p220oa.h.s(linearLayout2, false);
            return;
        }
        o0 o0Var3 = this.headerBinding;
        if (o0Var3 == null || (linearLayout3 = o0Var3.f8440b) == null) {
            return;
        }
        p220oa.h.s(linearLayout3, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSideBarSelection() {
        int iFindFirstVisibleItemPosition;
        i iVar;
        List<Object> data;
        SideBarView sideBarView;
        RecyclerView recyclerView;
        n0 n0Var = this.binding;
        String header = null;
        RecyclerView.LayoutManager layoutManager = (n0Var == null || (recyclerView = n0Var.f8417b) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) < 0 || (iVar = this.mAdapter) == null || (data = iVar.getData()) == null) {
            return;
        }
        for (int i7 = iFindFirstVisibleItemPosition; -1 < i7; i7--) {
            if (i7 < data.size()) {
                BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) data.get(i7);
                if (bettingBillerListItemBean.getItemType() == 2) {
                    header = bettingBillerListItemBean.getHeader();
                    break;
                }
            }
        }
        if (header != null) {
            SideBarView sideBarView2 = this.sideBar;
            if (sideBarView2 != null) {
                sideBarView2.setCurrentLetter(header);
                return;
            }
            return;
        }
        if (iFindFirstVisibleItemPosition != 0 || (sideBarView = this.sideBar) == null) {
            return;
        }
        sideBarView.setCurrentLetter("*");
    }

    @NotNull
    public final String getBusinessName() {
        return this.businessName;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        View viewFindViewById = findViewById(Pd.c.viewRoot);
        int i7 = Pd.c.billerList;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewFindViewById);
        if (recyclerView != null) {
            i7 = Pd.c.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = Pd.c.ivTitle;
                TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
                if (textView != null && (viewM = p059e1.a.m((i7 = Pd.c.qpSearchItem), viewFindViewById)) != null) {
                    p pVarB = p.b(viewM);
                    i7 = Pd.c.qpSearchItemEmpty;
                    View viewM2 = p059e1.a.m(i7, viewFindViewById);
                    if (viewM2 != null) {
                        Bc.k kVarB = Bc.k.b(viewM2);
                        i7 = Pd.c.sideBar;
                        SideBarView sideBarView = (SideBarView) p059e1.a.m(i7, viewFindViewById);
                        if (sideBarView != null) {
                            i7 = Pd.c.titleLayout;
                            if (((RelativeLayout) p059e1.a.m(i7, viewFindViewById)) != null) {
                                this.binding = new n0((ConstraintLayout) viewFindViewById, recyclerView, iconicsImageView, textView, pVarB, kVarB, sideBarView);
                                View viewInflate = getLayoutInflater().inflate(Pd.d.qt_pick_betting_list_header, (ViewGroup) null, false);
                                int i10 = Pd.c.historyLayout;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                if (linearLayout != null) {
                                    i10 = Pd.c.historyRy;
                                    RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                    if (recyclerView2 != null) {
                                        this.headerBinding = new o0((LinearLayout) viewInflate, linearLayout, recyclerView2);
                                        n0 n0Var = this.binding;
                                        if (n0Var != null) {
                                            n0Var.f8418c.setOnClickListener(new p308u9.b(this, 1));
                                        }
                                        changeDialogHeight();
                                        initBillerList();
                                        initHistory();
                                        initSearch();
                                        initSideBar();
                                        Pa.n0.g().v("PPay_Betting_BettingSites");
                                        return;
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    /* JADX INFO: renamed from: isDarkMode, reason: from getter */
    public final boolean getIsDarkMode() {
        return this.isDarkMode;
    }

    public final void setBillers(@Nullable List<BettingBillerListItemBean> list) {
        getDatas().clear();
        List<BettingBillerListItemBean> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            i iVar = this.mAdapter;
            if (iVar != null) {
                iVar.setList(z.f38935a);
            }
            SideBarView sideBarView = this.sideBar;
            if (sideBarView != null) {
                p220oa.h.s(sideBarView, false);
                return;
            }
            return;
        }
        List<BettingBillerListItemBean> listT = CollectionsKt.T(list, new androidx.camera.core.streamsharing.a(this, 1));
        ArrayList arrayList = new ArrayList();
        String str = "";
        for (BettingBillerListItemBean bettingBillerListItemBean : listT) {
            String firstLetter = getFirstLetter(bettingBillerListItemBean.getBillerName());
            if (firstLetter == null) {
                firstLetter = "#";
            }
            if (!Intrinsics.c(str, firstLetter)) {
                BettingBillerListItemBean bettingBillerListItemBean2 = new BettingBillerListItemBean();
                bettingBillerListItemBean2.setItemType(2);
                bettingBillerListItemBean2.setHeader(firstLetter);
                arrayList.add(bettingBillerListItemBean2);
                str = firstLetter;
            }
            bettingBillerListItemBean.setItemType(1);
            arrayList.add(bettingBillerListItemBean);
        }
        getDatas().addAll(listT);
        i iVar2 = this.mAdapter;
        if (iVar2 != null) {
            iVar2.setList(arrayList);
        }
        updateIndexLetters(arrayList);
        SideBarView sideBarView2 = this.sideBar;
        if (sideBarView2 != null) {
            p220oa.h.s(sideBarView2, true);
        }
        SideBarView sideBarView3 = this.sideBar;
        if (sideBarView3 != null) {
            sideBarView3.setCurrentLetter("*");
        }
    }

    public final void setBusinessName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessName = str;
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setHistoryBillers(@Nullable List<BettingBillerListItemBean> list) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        d dVar = this.mHistoryAdapter;
        if (dVar != null) {
            dVar.setList(list);
        }
        List<BettingBillerListItemBean> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            o0 o0Var = this.headerBinding;
            if (o0Var == null || (linearLayout = o0Var.f8440b) == null) {
                return;
            }
            p220oa.h.s(linearLayout, false);
            return;
        }
        o0 o0Var2 = this.headerBinding;
        if (o0Var2 == null || (linearLayout2 = o0Var2.f8440b) == null) {
            return;
        }
        p220oa.h.s(linearLayout2, true);
    }

    public final void setSelectBiller(@NotNull BettingBillerListItemBean biller) {
        i iVar;
        Intrinsics.checkNotNullParameter(biller, "biller");
        this.mSelectBiller = biller;
        if (biller == null || (iVar = this.mAdapter) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(biller, "biller");
        iVar.f42363b = biller;
        iVar.notifyDataSetChanged();
    }

    public final void updateEmptyUI() {
        Bc.k kVar;
        LinearLayout linearLayout;
        Bc.k kVar2;
        LinearLayout linearLayout2;
        i iVar = this.mAdapter;
        List<Object> data = iVar != null ? iVar.getData() : null;
        if (data == null || data.isEmpty()) {
            n0 n0Var = this.binding;
            if (n0Var == null || (kVar = n0Var.f8421f) == null || (linearLayout = (LinearLayout) kVar.f751e) == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        n0 n0Var2 = this.binding;
        if (n0Var2 == null || (kVar2 = n0Var2.f8421f) == null || (linearLayout2 = (LinearLayout) kVar2.f751e) == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public PickBettingBillerDialog(@Nullable Context context, boolean z3) {
        super(context, Pd.d.qt_pick_betting_biller_dialog);
        this.isDarkMode = z3;
        this.datas = C2131j.b(new C1976t(18));
        this.indexLetters = new ArrayList();
        this.businessName = "";
    }
}
