package com.transsnet.palmpay.teller.ui.dialog;

import Bc.p;
import G9.j;
import N8.q0;
import Pd.c;
import Pd.d;
import Rd.p0;
import V9.q;
import Xd.l;
import Yd.i;
import Yd.m;
import Yd.n;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.ui.view.SideBarView;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p013ae.e;
import p055de.h;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00017B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001fj\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001` 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R2\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u001fj\b\u0012\u0004\u0012\u00020\u0014` 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "changeDialogHeight", "()V", "initViews", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;)V", "", "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "list", "setBillers", "(Ljava/util/List;)V", "updateEmptyUI", "Landroid/widget/LinearLayout;", "mlsSearchEmptyRoot", "Landroid/widget/LinearLayout;", "LRd/p0;", "binding", "LRd/p0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mSearchBillerResult", "Ljava/util/ArrayList;", "mCallBack", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "Landroidx/recyclerview/widget/RecyclerView;", "mList", "Landroidx/recyclerview/widget/RecyclerView;", "LXd/l;", "mAdapter", "LXd/l;", "datas", "getDatas", "()Ljava/util/ArrayList;", "setDatas", "(Ljava/util/ArrayList;)V", "", "businessName", "Ljava/lang/String;", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "(Ljava/lang/String;)V", "CallBack", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickBillerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickBillerDialog.kt\ncom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
public final class PickBillerDialog extends b {

    @Nullable
    private p0 binding;

    @NotNull
    private String businessName;

    @NotNull
    private ArrayList<BillerListItemBean> datas;
    private l mAdapter;

    @Nullable
    private CallBack mCallBack;
    private RecyclerView mList;

    @Nullable
    private ArrayList<BillerListItemBean> mSearchBillerResult;

    @Nullable
    private LinearLayout mlsSearchEmptyRoot;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "", "onBillerClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onBillerClick(@Nullable BillerListItemBean data);
    }

    public PickBillerDialog(@Nullable Context context) {
        super(context);
        this.datas = new ArrayList<>();
        this.businessName = "";
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = SizeUtils.dp2px(476.0f);
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PickBillerDialog pickBillerDialog, View view, BillerListItemBean billerListItemBean, RecyclerView.ViewHolder viewHolder) {
        CallBack callBack = pickBillerDialog.mCallBack;
        if (callBack != null) {
            callBack.onBillerClick(billerListItemBean);
        }
        pickBillerDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(EditText editText, View view) {
        if (editText != null) {
            editText.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(View view) {
    }

    @NotNull
    public final String getBusinessName() {
        return this.businessName;
    }

    @NotNull
    public final ArrayList<BillerListItemBean> getDatas() {
        return this.datas;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        ConstraintLayout constraintLayout;
        setContentView(d.qt_pick_biller_dialog);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.billerList;
        if (((RecyclerView) a.m(i7, viewFindViewById)) != null) {
            i7 = c.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
            if (iconicsImageView != null) {
                i7 = c.ivTitle;
                TextView textView = (TextView) a.m(i7, viewFindViewById);
                if (textView != null) {
                    i7 = c.qp_rl;
                    if (((RelativeLayout) a.m(i7, viewFindViewById)) != null && (viewM = a.m((i7 = c.qp_search_item), viewFindViewById)) != null) {
                        p pVarB = p.b(viewM);
                        i7 = c.sideBar;
                        SideBarView sideBarView = (SideBarView) a.m(i7, viewFindViewById);
                        if (sideBarView != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById;
                            this.binding = new p0(constraintLayout2, iconicsImageView, textView, pVarB, sideBarView, constraintLayout2);
                            this.datas = new ArrayList<>();
                            RecyclerView recyclerView = (RecyclerView) findViewById(c.billerList);
                            this.mList = recyclerView;
                            if (recyclerView == null) {
                                Intrinsics.n("mList");
                                throw null;
                            }
                            recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
                            l lVar = new l(this.mContext, false);
                            this.mAdapter = lVar;
                            lVar.f4985b = this.datas;
                            RecyclerView recyclerView2 = this.mList;
                            if (recyclerView2 == null) {
                                Intrinsics.n("mList");
                                throw null;
                            }
                            recyclerView2.setAdapter(lVar);
                            p0 p0Var = this.binding;
                            if (p0Var != null) {
                                SideBarView sideBarView2 = p0Var.f8449e;
                                RecyclerView recyclerView3 = this.mList;
                                if (recyclerView3 == null) {
                                    Intrinsics.n("mList");
                                    throw null;
                                }
                                l lVar2 = this.mAdapter;
                                if (lVar2 == null) {
                                    Intrinsics.n("mAdapter");
                                    throw null;
                                }
                                new e(recyclerView3, sideBarView2, lVar2, new j(28));
                            }
                            l lVar3 = this.mAdapter;
                            if (lVar3 == null) {
                                Intrinsics.n("mAdapter");
                                throw null;
                            }
                            lVar3.f4986c = new q(this, 22);
                            p0 p0Var2 = this.binding;
                            if (p0Var2 != null) {
                                p0Var2.f8446b.setOnClickListener(new i(this, 1));
                            }
                            changeDialogHeight();
                            p0 p0Var3 = this.binding;
                            LinearLayout linearLayout = (p0Var3 == null || (constraintLayout = p0Var3.f8450f) == null) ? null : (LinearLayout) constraintLayout.findViewById(c.mls_search_empty_root);
                            this.mlsSearchEmptyRoot = linearLayout;
                            Intrinsics.e(linearLayout);
                            h hVar = new h(linearLayout);
                            p0 p0Var4 = this.binding;
                            ImageView imageView = p0Var4 != null ? (ImageView) ((LinearLayout) p0Var4.f8448d.f811b).findViewById(c.ma_clear_iv) : null;
                            p0 p0Var5 = this.binding;
                            EditText editText = p0Var5 != null ? (EditText) ((LinearLayout) p0Var5.f8448d.f811b).findViewById(c.ma_search_et) : null;
                            if (imageView != null) {
                                imageView.setOnClickListener(new m(editText, 0));
                            }
                            if (editText != null) {
                                editText.addTextChangedListener(new n(imageView, this, hVar, 0));
                            }
                            W8.d dVar = new W8.d(12);
                            p0 p0Var6 = this.binding;
                            if (p0Var6 != null) {
                                ((LinearLayout) p0Var6.f8448d.f811b).setOnClickListener(dVar);
                            }
                            String str = this.businessName;
                            Intrinsics.checkNotNullParameter(str, "<set-?>");
                            hVar.f35918b = str;
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setBillers(@NotNull List<? extends BillerListItemBean> list) {
        p pVar;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(list, "list");
        Iterator<? extends BillerListItemBean> it = list.iterator();
        String strY = "";
        while (it.hasNext()) {
            strY = q0.y(strY, it.next().getBillerName(), ", ");
        }
        F6.d.h("debug_tag", 3, strY);
        if (this.datas == null) {
            this.datas = new ArrayList<>();
        }
        p0 p0Var = this.binding;
        if (p0Var != null && (pVar = p0Var.f8448d) != null && (linearLayout = (LinearLayout) pVar.f811b) != null) {
            p220oa.h.s(linearLayout, list.size() >= 15);
        }
        this.datas.clear();
        this.datas.addAll(list);
        l lVar = this.mAdapter;
        if (lVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        lVar.f4985b = this.datas;
        if (lVar != null) {
            lVar.notifyDataSetChanged();
        } else {
            Intrinsics.n("mAdapter");
            throw null;
        }
    }

    public final void setBusinessName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessName = str;
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setDatas(@NotNull ArrayList<BillerListItemBean> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.datas = arrayList;
    }

    public final void updateEmptyUI() {
        l lVar = this.mAdapter;
        if (lVar == null) {
            Intrinsics.n("mAdapter");
            throw null;
        }
        if (lVar.f4985b.isEmpty()) {
            LinearLayout linearLayout = this.mlsSearchEmptyRoot;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.mlsSearchEmptyRoot;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    public PickBillerDialog(@Nullable Context context, int i7) {
        super(context, i7);
        this.datas = new ArrayList<>();
        this.businessName = "";
    }

    public PickBillerDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.datas = new ArrayList<>();
        this.businessName = "";
    }
}
