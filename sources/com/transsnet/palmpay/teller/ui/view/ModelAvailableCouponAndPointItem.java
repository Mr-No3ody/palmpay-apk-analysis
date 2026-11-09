package com.transsnet.palmpay.teller.ui.view;

import Ad.C0058e;
import Bc.C0106c;
import C0.G;
import Pa.n0;
import Pd.g;
import Wf.AbstractC0780y;
import Wf.I;
import Xd.C0788g;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010a9.m;
import p041ce.C1281c;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelAvailableCouponAndPointItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Lcom/transsnet/palmpay/teller/ui/dialog/BillerCouponListDialog$CallBack;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LXd/g;", "g", "Lkotlin/Lazy;", "getMCouponAdapter", "()LXd/g;", "mCouponAdapter", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelAvailableCouponAndPointItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelAvailableCouponAndPointItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelAvailableCouponAndPointItem\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,353:1\n116#2:354\n116#2:363\n1669#3,8:355\n*S KotlinDebug\n*F\n+ 1 ModelAvailableCouponAndPointItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelAvailableCouponAndPointItem\n*L\n110#1:354\n249#1:363\n228#1:355,8\n*E\n"})
public final class ModelAvailableCouponAndPointItem extends BaseConstraintLayout implements BillerCouponListDialog.CallBack {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f34329i = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0106c f34330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BillerCouponListDialog f34331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f34332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f34334g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponAndPointItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final C0788g getMCouponAdapter() {
        return (C0788g) this.f34334g.getValue();
    }

    public final void c(boolean z3) {
        C0106c c0106c = this.f34330c;
        if (c0106c != null) {
            h.s((AVLoadingIndicatorView) c0106c.t, z3);
        }
        if (c0106c != null) {
            h.s((ConstraintLayout) c0106c.f673f, !z3);
        }
    }

    public final void d(int i7, List list) {
        TextView textView;
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((BillerCouponItemBean) obj).getNominaValue())) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
        }
        getMCouponAdapter().setList(arrayList);
        C0106c c0106c = this.f34330c;
        if (c0106c == null || (textView = c0106c.f669b) == null) {
            return;
        }
        textView.setText("(" + i7 + ")");
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.BillerCouponListDialog.CallBack
    public final void onCouponClick(BillerCouponItemBean billerCouponItemBean, Function1 function) {
        String couponCode;
        Long claimId;
        String string;
        int i7 = 2;
        Intrinsics.checkNotNullParameter(function, "function");
        boolean zIsEmpty = TextUtils.isEmpty(billerCouponItemBean != null ? billerCouponItemBean.getStatus() : null);
        String str = this.f34332e;
        String str2 = "";
        if (!zIsEmpty) {
            n0 n0VarG = n0.g();
            ClickEvent clickEventAdd = ((ClickEvent) G.f("PalmPay_ModelActivityBannerWithCouponUse", "transType", str)).add("element_details", "Use");
            if (billerCouponItemBean != null && (couponCode = billerCouponItemBean.getCouponCode()) != null) {
                str2 = couponCode;
            }
            n0VarG.k(clickEventAdd.add("couponCode", str2));
            BillerCouponListDialog billerCouponListDialog = this.f34331d;
            if (billerCouponListDialog != null) {
                billerCouponListDialog.dismiss();
                return;
            }
            return;
        }
        n0 n0VarG2 = n0.g();
        ClickEvent clickEventAdd2 = ((ClickEvent) G.f("PalmPay_ModelActivityBannerWithCoupon", "transType", str)).add("element_details", "Claim");
        if (billerCouponItemBean != null && (claimId = billerCouponItemBean.getClaimId()) != null && (string = claimId.toString()) != null) {
            str2 = string;
        }
        n0VarG2.k(clickEventAdd2.add("claimId", str2));
        Long claimId2 = billerCouponItemBean != null ? billerCouponItemBean.getClaimId() : null;
        C0058e onSuccess = new C0058e(21, this, function);
        m onError = new m(this, i7);
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        String memberId = BaseApplication.get().getUser().getMemberId();
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
        f fVar = I.f10809a;
        addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C1281c(null, claimId2, memberId, onSuccess, onError), 2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponAndPointItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelAvailableCouponAndPointItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponAndPointItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34333f = 3;
        this.f34334g = C2131j.b(new X6.c(this, 11));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.QtModelAvailCouponAndPointItems, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f34332e = typedArrayObtainStyledAttributes.getString(g.QtModelAvailCouponAndPointItems_pointTransType);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = View.inflate(context, Pd.d.qt_layout_available_coupon_point_item, this);
        int i10 = Pd.c.clEnd;
        ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i10, viewInflate);
        if (constraintLayout != null) {
            i10 = Pd.c.iivArrowRight;
            if (((IconicsImageView) p059e1.a.m(i10, viewInflate)) != null) {
                i10 = Pd.c.ivCoupon;
                ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
                if (imageView != null) {
                    i10 = Pd.c.ivCouponDot;
                    ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewInflate);
                    if (imageView2 != null) {
                        i10 = Pd.c.ivPointDot;
                        ImageView imageView3 = (ImageView) p059e1.a.m(i10, viewInflate);
                        if (imageView3 != null) {
                            i10 = Pd.c.llCoupon;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i10, viewInflate);
                            if (constraintLayout2 != null) {
                                i10 = Pd.c.llPoint;
                                LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i10, viewInflate);
                                if (linearLayout != null) {
                                    i10 = Pd.c.lottieView;
                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) p059e1.a.m(i10, viewInflate);
                                    if (lottieAnimationView != null) {
                                        i10 = Pd.c.ryCoupon;
                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
                                        if (recyclerView != null) {
                                            i10 = Pd.c.tvNumber;
                                            TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                                            if (textView != null) {
                                                i10 = Pd.c.tvPoint;
                                                TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                                                if (textView2 != null) {
                                                    i10 = Pd.c.viewLoadingIndicator;
                                                    AVLoadingIndicatorView aVLoadingIndicatorView = (AVLoadingIndicatorView) p059e1.a.m(i10, viewInflate);
                                                    if (aVLoadingIndicatorView != null) {
                                                        this.f34330c = new C0106c(viewInflate, constraintLayout, imageView, imageView2, imageView3, constraintLayout2, linearLayout, lottieAnimationView, recyclerView, textView, textView2, aVLoadingIndicatorView);
                                                        setLayoutParams(new ConstraintLayout.LayoutParams(-1, CommonViewExtKt.getDp(20)));
                                                        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                                                        recyclerView.setAdapter(getMCouponAdapter());
                                                        C1548f c1548f = new C1548f(getContext().getColor(p.transparent), CommonViewExtKt.getDp(6), 0, 0);
                                                        c1548f.f31336e = false;
                                                        recyclerView.addItemDecoration(c1548f);
                                                        setVisibility(8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
