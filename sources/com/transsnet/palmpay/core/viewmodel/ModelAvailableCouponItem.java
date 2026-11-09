package com.transsnet.palmpay.core.viewmodel;

import N8.C0457a;
import Pa.b0;
import Pa.i0;
import Ua.C0633n;
import Ua.C0636q;
import Ua.C0638t;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.camera2.internal.F;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.req.QueryCouponStatisticsReq;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimBodyData;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimData;
import com.transsnet.palmpay.core.dialog.CouponListDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p025ba.g;
import p025ba.m;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelAvailableCouponItem;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "transType", "", "setTransType", "(Ljava/lang/String;)V", "", "transTypes", "setTransTypes", "(Ljava/util/List;)V", "Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponListItemView;", "a", "Lkotlin/Lazy;", "getMCouponClaimView", "()Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponListItemView;", "mCouponClaimView", "Lcom/transsnet/palmpay/core/viewmodel/ModelCouponListItemView;", "b", "getMCouponAvailable", "()Lcom/transsnet/palmpay/core/viewmodel/ModelCouponListItemView;", "mCouponAvailable", "Landroidx/lifecycle/o;", "getLifecycle", "()Landroidx/lifecycle/o;", "lifecycle", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelAvailableCouponItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelAvailableCouponItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelAvailableCouponItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,273:1\n1869#2,2:274\n176#3,9:276\n138#3,6:285\n*S KotlinDebug\n*F\n+ 1 ModelAvailableCouponItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelAvailableCouponItem\n*L\n107#1:274,2\n148#1:276,9\n239#1:285,6\n*E\n"})
public final class ModelAvailableCouponItem extends FrameLayout implements LifecycleOwner, ClaimCouponListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f28246o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f28251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f28252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f28253g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CouponListDialog f28254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1212w f28255j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(ModelAvailableCouponItem modelAvailableCouponItem) {
        h.s(modelAvailableCouponItem.getMCouponClaimView(), false);
        h.s(modelAvailableCouponItem.getMCouponAvailable(), true);
        return Unit.f38893a;
    }

    public static final void c(ModelAvailableCouponItem modelAvailableCouponItem, QueryCouponClaimBodyData queryCouponClaimBodyData) {
        List<QueryCouponClaimData> tidyBillClaimCoupons;
        ArrayList arrayList = modelAvailableCouponItem.f28253g;
        if (queryCouponClaimBodyData != null && (tidyBillClaimCoupons = queryCouponClaimBodyData.getTidyBillClaimCoupons()) != null) {
            arrayList.clear();
            arrayList.addAll(tidyBillClaimCoupons);
        }
        ModelClaimCouponListItemView mCouponClaimView = modelAvailableCouponItem.getMCouponClaimView();
        String str = modelAvailableCouponItem.f28250d;
        if (str == null) {
            str = "";
        }
        mCouponClaimView.a(arrayList, modelAvailableCouponItem, str);
        if (arrayList != null && !arrayList.isEmpty()) {
            modelAvailableCouponItem.setVisibility(0);
            h.s(modelAvailableCouponItem.getMCouponClaimView(), true);
            h.s(modelAvailableCouponItem.getMCouponAvailable(), false);
            return;
        }
        List<CouponItem> tidyCouponDetailInfos = queryCouponClaimBodyData != null ? queryCouponClaimBodyData.getTidyCouponDetailInfos() : null;
        if (tidyCouponDetailInfos == null || tidyCouponDetailInfos.isEmpty()) {
            modelAvailableCouponItem.setVisibility(8);
            return;
        }
        modelAvailableCouponItem.setVisibility(0);
        h.s(modelAvailableCouponItem.getMCouponClaimView(), false);
        modelAvailableCouponItem.getMCouponAvailable().d(queryCouponClaimBodyData != null ? queryCouponClaimBodyData.getTidyCouponDetailInfos() : null);
        h.s(modelAvailableCouponItem.getMCouponAvailable(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModelCouponListItemView getMCouponAvailable() {
        return (ModelCouponListItemView) this.f28248b.getValue();
    }

    private final ModelClaimCouponListItemView getMCouponClaimView() {
        return (ModelClaimCouponListItemView) this.f28247a.getValue();
    }

    public final void d(Function0 function0) {
        if (BaseApplication.hasLogin()) {
            getMCouponAvailable().c(true);
            QueryCouponStatisticsReq queryCouponStatisticsReq = new QueryCouponStatisticsReq();
            if (!TextUtils.isEmpty(this.f28250d)) {
                queryCouponStatisticsReq.transType = String.valueOf(this.f28250d);
            }
            List<String> list = this.f28251e;
            queryCouponStatisticsReq.transTypes = list;
            String strI = p367ya.a.d().i();
            String countryLocale = BaseApplication.getCountryLocale();
            StringBuilder sbF = F.f("Pref_", strI, "_", "AvailableCouponItem_" + list, "_");
            sbF.append(countryLocale);
            String string = sbF.toString();
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new C0638t(string, null, queryCouponStatisticsReq, this, function0), 2);
        }
    }

    public final void e() {
        if (TextUtils.isEmpty(this.f28250d) && this.f28251e == null) {
            h.s(this, false);
        } else if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            this.f28249c.add(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new C0636q(null, this), 2));
        }
    }

    public final void f() {
        ArrayList arrayList;
        Context context = getContext();
        if (!(context instanceof Activity) || !i0.W((Activity) context) || (arrayList = this.f28252f) == null || arrayList.isEmpty()) {
            return;
        }
        CouponListDialog couponListDialog = this.f28254i;
        if (couponListDialog != null && couponListDialog.isShowing()) {
            CouponListDialog couponListDialog2 = this.f28254i;
            if (couponListDialog2 != null) {
                couponListDialog2.setCouponItems(arrayList);
            }
            CouponListDialog couponListDialog3 = this.f28254i;
            if (couponListDialog3 != null) {
                couponListDialog3.refresh();
                return;
            }
            return;
        }
        CouponListDialog couponListDialog4 = new CouponListDialog(context);
        this.f28254i = couponListDialog4;
        couponListDialog4.setItemClickListener(new C0457a(this, 25));
        CouponListDialog couponListDialog5 = this.f28254i;
        if (couponListDialog5 != null) {
            couponListDialog5.show();
        }
        CouponListDialog couponListDialog6 = this.f28254i;
        if (couponListDialog6 != null) {
            couponListDialog6.setCouponItems(arrayList);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        return this.f28255j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1212w c1212w = this.f28255j;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17463d);
        }
        e();
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ClaimCouponListener
    public final void onClaimCouponDone() {
        this.f28253g.clear();
        d(new C0633n(this, 2));
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ClaimCouponListener
    public final void onClaimCouponSuccess() {
        d(new b0(10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1212w c1212w = this.f28255j;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17462c);
        }
        for (Job job : this.f28249c) {
            if (job != null && job.isActive()) {
                job.cancel((CancellationException) null);
            }
        }
    }

    public final void setTransType(@Nullable String transType) {
        this.f28250d = transType;
        e();
    }

    public final void setTransTypes(@Nullable List<String> transTypes) {
        this.f28251e = transTypes;
        e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelAvailableCouponItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelAvailableCouponItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28247a = C2131j.b(new C0633n(this, 0));
        this.f28248b = C2131j.b(new C0633n(this, 1));
        this.f28249c = new ArrayList();
        this.f28252f = new ArrayList();
        this.f28253g = new ArrayList();
        C1212w c1212w = new C1212w(this);
        c1212w.g(EnumC1204n.f17462c);
        this.f28255j = c1212w;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.CoreModelAvailCouponItems, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28250d = typedArrayObtainStyledAttributes.getString(m.CoreModelAvailCouponItems_coreTransType);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.core_layout_available_coupon_item, this);
        setVisibility(8);
    }
}
