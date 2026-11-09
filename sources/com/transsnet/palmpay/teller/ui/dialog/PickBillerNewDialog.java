package com.transsnet.palmpay.teller.ui.dialog;

import Bc.p;
import Fe.C0259g;
import M1.j;
import Pd.c;
import Pd.d;
import Pd.f;
import Rd.q0;
import V9.q;
import Xd.m;
import Yd.i;
import Yd.n;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.l;
import p055de.h;
import p059e1.a;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u00018B;\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\r2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R6\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u001aR\"\u00102\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "categoryId", "", "layoutId", "", "useSearch", "styleId", "<init>", "(Landroid/content/Context;Ljava/lang/String;IZI)V", "", "changeDialogHeight", "()V", "initViews", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;)V", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "Lkotlin/collections/ArrayList;", "list", "setBillers", "(Ljava/util/ArrayList;)V", "Z", "getUseSearch", "()Z", "LRd/q0;", "binding", "LRd/q0;", "", "titleStr", "Ljava/lang/CharSequence;", "mSearchBillerResult", "Ljava/util/ArrayList;", "mCallBack", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "LXd/m;", "mAdapter$delegate", "Lkotlin/Lazy;", "getMAdapter", "()LXd/m;", "mAdapter", "datas", "getDatas", "()Ljava/util/ArrayList;", "setDatas", "businessName", "Ljava/lang/String;", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "(Ljava/lang/String;)V", "CallBack", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PickBillerNewDialog extends b {

    @Nullable
    private q0 binding;

    @NotNull
    private String businessName;

    @Nullable
    private ArrayList<BillerListItemBean> datas;

    /* JADX INFO: renamed from: mAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter;

    @Nullable
    private CallBack mCallBack;

    @Nullable
    private ArrayList<BillerListItemBean> mSearchBillerResult;

    @Nullable
    private CharSequence titleStr;
    private final boolean useSearch;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "", "onBillerClick", "", ViewProps.POSITION, "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/BillerListItemBean;", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onBillerClick(int position, @Nullable BillerListItemBean data);
    }

    @JvmOverloads
    public PickBillerNewDialog(@Nullable Context context, @Nullable String str) {
        this(context, str, 0, false, 0, 28, null);
    }

    private final void changeDialogHeight() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getMAdapter() {
        return (m) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(PickBillerNewDialog pickBillerNewDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        BillerListItemBean billerListItemBean = (BillerListItemBean) pickBillerNewDialog.getMAdapter().getData().get(i7);
        if (billerListItemBean != null) {
            Integer status = billerListItemBean.getStatus();
            if (status == null || 1 != status.intValue()) {
                ToastUtils.showShort(pickBillerNewDialog.mContext.getString(f.qt_mobile_network_unavailable, billerListItemBean.getBillerName()), new Object[0]);
                return;
            }
            CallBack callBack = pickBillerNewDialog.mCallBack;
            if (callBack != null) {
                callBack.onBillerClick(i7, billerListItemBean);
            }
            pickBillerNewDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(EditText editText, View view) {
        if (editText != null) {
            editText.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m mAdapter_delegate$lambda$0(String str) {
        return new m(str);
    }

    @NotNull
    public final String getBusinessName() {
        return this.businessName;
    }

    @Nullable
    public final ArrayList<BillerListItemBean> getDatas() {
        return this.datas;
    }

    public final boolean getUseSearch() {
        return this.useSearch;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        q0 q0Var;
        changeDialogHeight();
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.iv_close;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = c.qp_rl;
            if (((RelativeLayout) a.m(i7, viewFindViewById)) != null && (viewM = a.m((i7 = c.qt_search_item), viewFindViewById)) != null) {
                p pVarB = p.b(viewM);
                i7 = c.ry_biller_list;
                RecyclerView recyclerView = (RecyclerView) a.m(i7, viewFindViewById);
                if (recyclerView != null) {
                    i7 = c.tv_title;
                    TextView textView = (TextView) a.m(i7, viewFindViewById);
                    if (textView != null) {
                        this.binding = new q0((ConstraintLayout) viewFindViewById, iconicsImageView, pVarB, recyclerView, textView);
                        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
                        q0 q0Var2 = this.binding;
                        if (q0Var2 != null) {
                            q0Var2.f8458d.setAdapter(getMAdapter());
                        }
                        getMAdapter().setOnItemClickListener(new q(this, 23));
                        q0 q0Var3 = this.binding;
                        if (q0Var3 != null) {
                            q0Var3.f8456b.setOnClickListener(new i(this, 2));
                        }
                        View viewInflate = LayoutInflater.from(getContext()).inflate(d.qt_layout_search_item_empty, (ViewGroup) null);
                        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                        h hVar = new h(viewInflate);
                        if (this.useSearch) {
                            q0 q0Var4 = this.binding;
                            if (q0Var4 != null) {
                                p220oa.h.s((LinearLayout) q0Var4.f8457c.f811b, true);
                            }
                            getMAdapter().setEmptyView(viewInflate);
                            q0 q0Var5 = this.binding;
                            EditText editText = q0Var5 != null ? (EditText) ((LinearLayout) q0Var5.f8457c.f811b).findViewById(c.ma_search_et) : null;
                            q0 q0Var6 = this.binding;
                            View viewFindViewById2 = q0Var6 != null ? ((LinearLayout) q0Var6.f8457c.f811b).findViewById(c.ma_clear_iv) : null;
                            if (viewFindViewById2 != null) {
                                viewFindViewById2.setOnClickListener(new Yd.m(editText, 1));
                            }
                            if (editText != null) {
                                editText.addTextChangedListener(new n(viewFindViewById2, this, hVar, 1));
                            }
                            String str = this.businessName;
                            Intrinsics.checkNotNullParameter(str, "<set-?>");
                            hVar.f35918b = str;
                        } else {
                            q0 q0Var7 = this.binding;
                            if (q0Var7 != null) {
                                p220oa.h.s((LinearLayout) q0Var7.f8457c.f811b, false);
                            }
                        }
                        if (TextUtils.isEmpty(this.titleStr) || (q0Var = this.binding) == null) {
                            return;
                        }
                        q0Var.f8459e.setText(this.titleStr);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setBillers(@Nullable ArrayList<BillerListItemBean> list) {
        p pVar;
        LinearLayout linearLayout;
        p pVar2;
        LinearLayout linearLayout2;
        if (list != null) {
            if (this.useSearch) {
                q0 q0Var = this.binding;
                if (q0Var != null && (pVar2 = q0Var.f8457c) != null && (linearLayout2 = (LinearLayout) pVar2.f811b) != null) {
                    p220oa.h.s(linearLayout2, list.size() >= 15);
                }
            } else {
                q0 q0Var2 = this.binding;
                if (q0Var2 != null && (pVar = q0Var2.f8457c) != null && (linearLayout = (LinearLayout) pVar.f811b) != null) {
                    p220oa.h.s(linearLayout, false);
                }
            }
            ArrayList<BillerListItemBean> arrayList = this.datas;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<BillerListItemBean> arrayList2 = this.datas;
            if (arrayList2 != null) {
                arrayList2.addAll(list);
            }
            getMAdapter().setList(this.datas);
        }
    }

    public final void setBusinessName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.businessName = str;
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setDatas(@Nullable ArrayList<BillerListItemBean> arrayList) {
        this.datas = arrayList;
    }

    @JvmOverloads
    public PickBillerNewDialog(@Nullable Context context, @Nullable String str, int i7) {
        this(context, str, i7, false, 0, 24, null);
    }

    @JvmOverloads
    public PickBillerNewDialog(@Nullable Context context, @Nullable String str, int i7, boolean z3) {
        this(context, str, i7, z3, 0, 16, null);
    }

    public /* synthetic */ PickBillerNewDialog(Context context, String str, int i7, boolean z3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? d.qt_pick_biller_new_dialog : i7, (i11 & 8) != 0 ? true : z3, (i11 & 16) != 0 ? 0 : i10);
    }

    @JvmOverloads
    public PickBillerNewDialog(@Nullable Context context, @Nullable String str, int i7, boolean z3, int i10) {
        super(context, i7, i10);
        this.useSearch = z3;
        this.mAdapter = C2131j.b(new C0259g(str, 2));
        this.datas = new ArrayList<>();
        this.businessName = "";
    }
}
