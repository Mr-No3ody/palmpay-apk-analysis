package com.transsnet.palmpay.core.dialog;

import C0.G;
import Pa.i0;
import Pa.n0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.custom_view.model.ModelEmptyView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ToastUtils;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p052da.C1643o;
import p141j9.C1794b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u00012\u00020\u0002:\u0001EB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u001d\u0010\u001b\u001a\u00020\f2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00109\u001a\u0004\b=\u0010>\"\u0004\b?\u0010!R\u0018\u0010@\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0011\u0010D\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "layoutId", "(Landroid/content/Context;I)V", "styleId", "(Landroid/content/Context;II)V", "", "setEmptyView", "()V", "Lcom/transsnet/palmpay/core/bean/cashier/CashierCouponItem;", "item", "checkCoupon", "(Lcom/transsnet/palmpay/core/bean/cashier/CashierCouponItem;)V", "Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog$CallBack;", "callBack", "setCallBack", "(Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog$CallBack;)V", "initViews", "show", "", "coupons", "setCoupons", "(Ljava/util/List;)V", "updateCoupons", "", "titleText", "setDialogTitle", "(Ljava/lang/String;)V", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "", "couponId", "setDefaultCouponId", "(J)V", "Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;", "req", "setPreviewPayReq", "(Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;)V", "Lja/b;", "binding", "Lja/b;", "Lda/o;", "mCouponListAdapter", "Lda/o;", "mCoupons", "Ljava/util/List;", "defaultCouponId", "J", "mTitleText", "Ljava/lang/String;", "mCallBack", "Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog$CallBack;", "transType", "getTransType", "()Ljava/lang/String;", "setTransType", "mPreviewPayReq", "Lcom/transsnet/palmpay/core/bean/req/PreviewCalcPayInfoReq;", "getDefaultCouponPosition", "()I", "defaultCouponPosition", "CallBack", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashierCouponListDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashierCouponListDialog.kt\ncom/transsnet/palmpay/core/dialog/CashierCouponListDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n360#2,7:232\n*S KotlinDebug\n*F\n+ 1 CashierCouponListDialog.kt\ncom/transsnet/palmpay/core/dialog/CashierCouponListDialog\n*L\n43#1:232,7\n*E\n"})
public final class CashierCouponListDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {

    @Nullable
    private p142ja.b binding;
    private long defaultCouponId;

    @Nullable
    private CallBack mCallBack;

    @Nullable
    private C1643o mCouponListAdapter;

    @Nullable
    private List<CashierCouponItem> mCoupons;

    @Nullable
    private PreviewCalcPayInfoReq mPreviewPayReq;

    @Nullable
    private String mTitleText;

    @Nullable
    private String transType;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog$CallBack;", "", "onCouponClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/cashier/CashierCouponItem;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CallBack {
        void onCouponClick(@Nullable CashierCouponItem data);
    }

    public CashierCouponListDialog(@Nullable Context context) {
        super(context);
        this.defaultCouponId = -1L;
    }

    private final void checkCoupon(CashierCouponItem item) {
        p142ja.b bVar = this.binding;
        if (bVar != null) {
            bVar.f38453f.setVisibility(0);
        }
        PreviewCalcPayInfoReq previewCalcPayInfoReq = this.mPreviewPayReq;
        if (previewCalcPayInfoReq != null) {
            previewCalcPayInfoReq.couponId = item != null ? item.couponId : null;
        }
        if (previewCalcPayInfoReq != null) {
            previewCalcPayInfoReq.couponAmount = item != null ? item.nominaValue : null;
        }
        ((PayApiService) p324va.c.f43141a.f14621b).checkCouponByVM(previewCalcPayInfoReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new a(this, item));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(CashierCouponListDialog cashierCouponListDialog, View view, CashierCouponItem cashierCouponItem, RecyclerView.ViewHolder viewHolder) {
        Long l5;
        int id2 = view.getId();
        if (((cashierCouponItem == null || (l5 = cashierCouponItem.startTime) == null) ? 0L : l5.longValue()) > System.currentTimeMillis()) {
            return;
        }
        if (id2 != p025ba.e.imageViewCheck) {
            if (id2 == p025ba.e.llDetailArrow) {
                if (cashierCouponItem != null) {
                    Boolean bool = cashierCouponItem.layoutExpand;
                    cashierCouponItem.layoutExpand = Boolean.valueOf(!(bool != null ? bool.booleanValue() : false));
                }
                C1643o c1643o = cashierCouponListDialog.mCouponListAdapter;
                if (c1643o != null) {
                    c1643o.notifyItemChanged(viewHolder.getAdapterPosition());
                    return;
                }
                return;
            }
            return;
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        C1643o c1643o2 = cashierCouponListDialog.mCouponListAdapter;
        CashierCouponItem cashierCouponItem2 = c1643o2 != null ? (CashierCouponItem) c1643o2.getItem(adapterPosition) : null;
        if (cashierCouponItem2 == null || Intrinsics.c(cashierCouponItem2.available, Boolean.TRUE)) {
            C1643o c1643o3 = cashierCouponListDialog.mCouponListAdapter;
            if (c1643o3 != null && adapterPosition == c1643o3.f35800g) {
                c1643o3.f35800g = -1;
                c1643o3.notifyDataSetChanged();
            } else if (c1643o3 != null) {
                c1643o3.f35800g = viewHolder.getAdapterPosition();
                c1643o3.notifyDataSetChanged();
            }
        }
    }

    private final void setEmptyView() {
        SwipeRecyclerView swipeRecyclerView;
        SwipeRecyclerView swipeRecyclerView2;
        p142ja.b bVar = this.binding;
        if (((bVar == null || (swipeRecyclerView2 = bVar.f38451d) == null) ? null : swipeRecyclerView2.getEmptyView()) != null) {
            return;
        }
        ModelEmptyView modelEmptyView = new ModelEmptyView(this.mContext);
        modelEmptyView.f31511b.setImageResource(r.cv_no_coupon_icon);
        modelEmptyView.f31512c.setText(k.core_no_coupon_available);
        modelEmptyView.setBackgroundColor(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this.mContext));
        p142ja.b bVar2 = this.binding;
        if (bVar2 == null || (swipeRecyclerView = bVar2.f38451d) == null) {
            return;
        }
        swipeRecyclerView.setEmptyView(modelEmptyView);
    }

    public final int getDefaultCouponPosition() {
        List<CashierCouponItem> list = this.mCoupons;
        if (list != null) {
            Iterator<CashierCouponItem> it = list.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                Long l5 = it.next().couponId;
                long j6 = this.defaultCouponId;
                if (l5 != null && l5.longValue() == j6) {
                    return i7;
                }
                i7++;
            }
        }
        return -1;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        RelativeLayout relativeLayout;
        ViewTreeObserver viewTreeObserver;
        p142ja.b bVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        setContentView(p025ba.g.core_dialog_cashier_coupon_list);
        View viewFindViewById = findViewById(p025ba.e.viewRoot);
        int i7 = p025ba.e.cdsc_close_iv;
        IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = p025ba.e.cdsc_confirm;
            TextView textView = (TextView) p059e1.a.m(i7, viewFindViewById);
            if (textView != null) {
                i7 = p025ba.e.cdsc_rcv;
                SwipeRecyclerView swipeRecyclerView = (SwipeRecyclerView) p059e1.a.m(i7, viewFindViewById);
                if (swipeRecyclerView != null) {
                    i7 = p025ba.e.cdsc_title_tv;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewFindViewById);
                    if (textView2 != null) {
                        i7 = p025ba.e.loadingView;
                        AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) p059e1.a.m(i7, viewFindViewById);
                        if (aVLoadingIndicatorView != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) viewFindViewById;
                            this.binding = new p142ja.b(relativeLayout2, iconicsImageView, textView, swipeRecyclerView, textView2, aVLoadingIndicatorView, relativeLayout2);
                            RecyclerView recyclerView3 = swipeRecyclerView.getRecyclerView();
                            if (recyclerView3 != null) {
                                recyclerView3.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
                            }
                            p142ja.b bVar2 = this.binding;
                            if (bVar2 != null && (recyclerView2 = bVar2.f38451d.getRecyclerView()) != null) {
                                recyclerView2.setItemViewCacheSize(4);
                            }
                            p142ja.b bVar3 = this.binding;
                            if (bVar3 != null && (recyclerView = bVar3.f38451d.getRecyclerView()) != null) {
                                recyclerView.addItemDecoration(new Qb.c(15, 0, 20, 20));
                            }
                            Context context = this.mContext;
                            p142ja.b bVar4 = this.binding;
                            boolean zV = i0.V(bVar4 != null ? bVar4.f38451d.getRecyclerView() : null);
                            C1643o c1643o = new C1643o(context);
                            c1643o.f35800g = -1;
                            c1643o.f35798e = true;
                            c1643o.f35799f = zV;
                            this.mCouponListAdapter = c1643o;
                            p142ja.b bVar5 = this.binding;
                            if (bVar5 != null) {
                                bVar5.f38451d.setAdapter(c1643o);
                            }
                            p142ja.b bVar6 = this.binding;
                            if (bVar6 != null) {
                                bVar6.f38451d.setRefreshEnable(false);
                            }
                            p142ja.b bVar7 = this.binding;
                            if (bVar7 != null) {
                                bVar7.f38451d.setLoadMoreEnable(false);
                            }
                            if (!TextUtils.isEmpty(this.mTitleText) && (bVar = this.binding) != null) {
                                bVar.f38452e.setText(this.mTitleText);
                            }
                            updateCoupons();
                            C1643o c1643o2 = this.mCouponListAdapter;
                            if (c1643o2 != null) {
                                c1643o2.f4986c = new C1794b(this, 11);
                            }
                            setEmptyView();
                            showAtBottom(getWindow());
                            p142ja.b bVar8 = this.binding;
                            if (bVar8 != null) {
                                bVar8.f38449b.setOnClickListener(this);
                            }
                            p142ja.b bVar9 = this.binding;
                            if (bVar9 != null) {
                                bVar9.f38450c.setOnClickListener(this);
                            }
                            p142ja.b bVar10 = this.binding;
                            if (bVar10 == null || (relativeLayout = bVar10.f38454g) == null || (viewTreeObserver = relativeLayout.getViewTreeObserver()) == null) {
                                return;
                            }
                            viewTreeObserver.addOnGlobalLayoutListener(new Be.c(this, 13));
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        IconicsImageView iconicsImageView;
        TextView textView;
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        p142ja.b bVar = this.binding;
        int i7 = 0;
        if (bVar == null || (textView = bVar.f38450c) == null || id2 != textView.getId()) {
            p142ja.b bVar2 = this.binding;
            if (bVar2 != null && (iconicsImageView = bVar2.f38449b) != null && id2 == iconicsImageView.getId()) {
                i7 = 1;
            }
            if (i7 != 0) {
                n0.g().k(new ClickEvent("PPay_Btn_CouponClose").add("TransType", this.transType));
                dismiss();
                return;
            }
            return;
        }
        n0.g().k(new ClickEvent("PPay_Select_Coupon_Btn_Confirm").add("TransType", this.transType));
        CallBack callBack = this.mCallBack;
        if (callBack != null) {
            C1643o c1643o = this.mCouponListAdapter;
            CashierCouponItem cashierCouponItem = null;
            if ((c1643o != null ? c1643o.f35800g : 0) < 0) {
                if (callBack != null) {
                    callBack.onCouponClick(null);
                }
                dismiss();
                return;
            }
            if (c1643o != null) {
                cashierCouponItem = (CashierCouponItem) c1643o.getItem(c1643o != null ? c1643o.f35800g : 0);
            }
            if (cashierCouponItem != null && Intrinsics.c(cashierCouponItem.showOnlyMeErrors, Boolean.TRUE)) {
                ToastUtils.showLong(k.core_msg_coupons_myself_only);
            }
            if (this.mPreviewPayReq != null) {
                checkCoupon(cashierCouponItem);
                return;
            }
            CallBack callBack2 = this.mCallBack;
            if (callBack2 != null) {
                callBack2.onCouponClick(cashierCouponItem);
            }
            dismiss();
        }
    }

    public final void setCallBack(@Nullable CallBack callBack) {
        this.mCallBack = callBack;
    }

    public final void setCoupons(@Nullable List<CashierCouponItem> coupons) {
        this.mCoupons = coupons;
    }

    public final void setDefaultCouponId(long couponId) {
        this.defaultCouponId = couponId;
    }

    public final void setDialogTitle(@Nullable String titleText) {
        TextView textView;
        this.mTitleText = titleText;
        if (TextUtils.isEmpty(titleText)) {
            return;
        }
        p142ja.b bVar = this.binding;
        if ((bVar != null ? bVar.f38452e : null) == null || bVar == null || (textView = bVar.f38452e) == null) {
            return;
        }
        textView.setText(this.mTitleText);
    }

    public final void setPreviewPayReq(@Nullable PreviewCalcPayInfoReq req) {
        this.mPreviewPayReq = req;
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
        C1643o c1643o;
        List<CashierCouponItem> list = this.mCoupons;
        if (list == null || (c1643o = this.mCouponListAdapter) == null) {
            return;
        }
        c1643o.f4985b = list;
        c1643o.f35800g = getDefaultCouponPosition();
        c1643o.notifyDataSetChanged();
        C1643o c1643o2 = this.mCouponListAdapter;
        if (c1643o2 != null) {
            c1643o2.notifyDataSetChanged();
        }
    }

    public CashierCouponListDialog(@Nullable Context context, int i7) {
        super(context, i7);
        this.defaultCouponId = -1L;
    }

    public CashierCouponListDialog(@Nullable Context context, int i7, int i10) {
        super(context, i7, i10);
        this.defaultCouponId = -1L;
    }
}
