package com.transsnet.palmpay.teller.ui.dialog;

import C0.G;
import Ie.i;
import M1.j;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.T;
import Uc.I0;
import V9.q;
import Xd.C0787f;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001,B'\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u001d\u0010\u0015\u001a\u00020\t2\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010%\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001b¨\u0006-"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "layoutId", "styleId", "<init>", "(Landroid/content/Context;II)V", "", "setEmptyView", "()V", "Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog$CallBack;)V", "initViews", "show", "", "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "coupons", "setCoupons", "(Ljava/util/List;)V", "updateCoupons", "", "titleText", "setDialogTitle", "(Ljava/lang/String;)V", "LRd/T;", "binding", "LRd/T;", "LXd/f;", "mCouponListAdapter", "LXd/f;", "mCoupons", "Ljava/util/List;", "mTitleText", "Ljava/lang/String;", "mCallBack", "Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog$CallBack;", "transType", "getTransType", "()Ljava/lang/String;", "setTransType", "CallBack", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerCouponListDialog extends b {

    @Nullable
    private T binding;

    @Nullable
    private CallBack mCallBack;

    @Nullable
    private C0787f mCouponListAdapter;

    @Nullable
    private List<BillerCouponItemBean> mCoupons;

    @Nullable
    private String mTitleText;

    @Nullable
    private String transType;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052#\u0010\u0006\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog$CallBack;", "", "onCouponClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/teller/bean/resp/BillerCouponItemBean;", "function", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onCouponClick(@Nullable BillerCouponItemBean data, @NotNull Function1<? super BillerCouponItemBean, Unit> function);
    }

    @JvmOverloads
    public BillerCouponListDialog(@Nullable Context context) {
        this(context, 0, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(BillerCouponListDialog billerCouponListDialog, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "view");
        if (r0.U0()) {
            return;
        }
        C0787f c0787f = billerCouponListDialog.mCouponListAdapter;
        BillerCouponItemBean billerCouponItemBean = c0787f != null ? (BillerCouponItemBean) c0787f.getItem(i7) : null;
        int id2 = view.getId();
        if (id2 == c.icilUseTv) {
            CallBack callBack = billerCouponListDialog.mCallBack;
            if (callBack != null) {
                callBack.onCouponClick(billerCouponItemBean, new i(billerCouponListDialog, i7, 2));
                return;
            }
            return;
        }
        if (id2 == c.llDetailArrow) {
            if (billerCouponItemBean != null) {
                Boolean layoutExpand = billerCouponItemBean.getLayoutExpand();
                billerCouponItemBean.setLayoutExpand(Boolean.valueOf(!(layoutExpand != null ? layoutExpand.booleanValue() : false)));
            }
            C0787f c0787f2 = billerCouponListDialog.mCouponListAdapter;
            if (c0787f2 != null) {
                c0787f2.notifyItemChanged(i7);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initViews$lambda$2$lambda$1(BillerCouponListDialog billerCouponListDialog, int i7, BillerCouponItemBean billerCouponItemBean) {
        C0787f c0787f;
        if (billerCouponItemBean != null && (c0787f = billerCouponListDialog.mCouponListAdapter) != null) {
            c0787f.setData(i7, billerCouponItemBean);
        }
        return Unit.f38893a;
    }

    private final void setEmptyView() {
        ModelEmptyView modelEmptyView = new ModelEmptyView(this.mContext);
        modelEmptyView.f31511b.setImageResource(r.cv_no_coupon_icon);
        modelEmptyView.f31512c.setText(k.core_no_coupon_available);
        modelEmptyView.setBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this.mContext));
        C0787f c0787f = this.mCouponListAdapter;
        if (c0787f != null) {
            c0787f.setEmptyView(modelEmptyView);
        }
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ConstraintLayout constraintLayout;
        ViewTreeObserver viewTreeObserver;
        T t;
        setContentView(d.qt_dialog_biller_coupon_list);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.ivClose;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = c.ryCoupon;
            RecyclerView recyclerView = (RecyclerView) a.m(i7, viewFindViewById);
            if (recyclerView != null) {
                i7 = c.tvTitle;
                TextView textView = (TextView) a.m(i7, viewFindViewById);
                if (textView != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById;
                    this.binding = new T(constraintLayout2, iconicsImageView, recyclerView, textView, constraintLayout2);
                    recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
                    T t3 = this.binding;
                    if (t3 != null) {
                        t3.f8151c.setItemViewCacheSize(4);
                    }
                    T t8 = this.binding;
                    if (t8 != null) {
                        t8.f8151c.addItemDecoration(new Qb.c(12, 0, 16, 16));
                    }
                    T t10 = this.binding;
                    C0787f c0787f = new C0787f(i0.V(t10 != null ? t10.f8153e : null));
                    this.mCouponListAdapter = c0787f;
                    T t11 = this.binding;
                    if (t11 != null) {
                        t11.f8151c.setAdapter(c0787f);
                    }
                    if (!TextUtils.isEmpty(this.mTitleText) && (t = this.binding) != null) {
                        t.f8152d.setText(this.mTitleText);
                    }
                    updateCoupons();
                    C0787f c0787f2 = this.mCouponListAdapter;
                    if (c0787f2 != null) {
                        c0787f2.setOnItemChildClickListener(new q(this, 20));
                    }
                    T t12 = this.binding;
                    if (t12 != null) {
                        t12.f8150b.setOnClickListener(new I0(this, 28));
                    }
                    setEmptyView();
                    showAtBottom(getWindow());
                    T t13 = this.binding;
                    if (t13 == null || (constraintLayout = t13.f8153e) == null || (viewTreeObserver = constraintLayout.getViewTreeObserver()) == null) {
                        return;
                    }
                    viewTreeObserver.addOnGlobalLayoutListener(new Be.c(this, 5));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setCoupons(@Nullable List<BillerCouponItemBean> coupons) {
        this.mCoupons = coupons;
    }

    public final void setDialogTitle(@Nullable String titleText) {
        this.mTitleText = titleText;
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        updateCoupons();
        super.show();
        n0.g().u(((ViewEvent) G.g("PPay_Select_Coupon", true)).add("TransType", this.transType));
    }

    public final void updateCoupons() {
        C0787f c0787f;
        List<BillerCouponItemBean> list = this.mCoupons;
        if (list == null || (c0787f = this.mCouponListAdapter) == null) {
            return;
        }
        c0787f.setList(list);
    }

    @JvmOverloads
    public BillerCouponListDialog(@Nullable Context context, int i7) {
        this(context, i7, 0, 4, null);
    }

    public /* synthetic */ BillerCouponListDialog(Context context, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i7, (i11 & 4) != 0 ? 0 : i10);
    }

    @JvmOverloads
    public BillerCouponListDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
    }
}
