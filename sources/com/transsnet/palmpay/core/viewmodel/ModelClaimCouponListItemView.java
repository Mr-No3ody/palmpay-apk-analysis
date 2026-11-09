package com.transsnet.palmpay.core.viewmodel;

import Ce.C0181x;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimData;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponListItemView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0014\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponListItemView;", "Landroid/widget/LinearLayout;", "Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponItemListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponItemView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getModel_second_coupon", "()Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponItemView;", "model_second_coupon", "b", "getModel_first_coupon", "model_first_coupon", "Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponListener;", "d", "Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponListener;", "getMListener", "()Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponListener;", "setMListener", "(Lcom/transsnet/palmpay/core/viewmodel/ClaimCouponListener;)V", "mListener", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelClaimCouponListItemView extends LinearLayout implements ClaimCouponItemListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f28296e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ClaimCouponListener mListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponListItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ModelClaimCouponItemView getModel_first_coupon() {
        return (ModelClaimCouponItemView) this.f28298b.getValue();
    }

    private final ModelClaimCouponItemView getModel_second_coupon() {
        return (ModelClaimCouponItemView) this.f28297a.getValue();
    }

    public final void a(ArrayList arrayList, ModelAvailableCouponItem listener, String transType) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(transType, "transType");
        this.mListener = listener;
        if (arrayList != null) {
            ArrayList arrayList2 = this.f28299c;
            arrayList2.clear();
            if (arrayList.size() <= 1) {
                if (arrayList.size() == 1) {
                    arrayList2.add(arrayList.get(0));
                    QueryCouponClaimData queryCouponClaimData = (QueryCouponClaimData) arrayList.get(0);
                    ModelClaimCouponItemView itemView = getModel_first_coupon();
                    Intrinsics.checkNotNullExpressionValue(itemView, "<get-model_first_coupon>(...)");
                    Intrinsics.checkNotNullParameter(itemView, "itemView");
                    Intrinsics.checkNotNullParameter(transType, "transType");
                    if (queryCouponClaimData != null) {
                        itemView.c(queryCouponClaimData, true, this, transType);
                    }
                    ModelClaimCouponItemView model_second_coupon = getModel_second_coupon();
                    Intrinsics.checkNotNullExpressionValue(model_second_coupon, "<get-model_second_coupon>(...)");
                    h.s(model_second_coupon, false);
                    return;
                }
                return;
            }
            arrayList2.add(arrayList.get(0));
            arrayList2.add(arrayList.get(1));
            QueryCouponClaimData queryCouponClaimData2 = (QueryCouponClaimData) arrayList.get(0);
            ModelClaimCouponItemView itemView2 = getModel_first_coupon();
            Intrinsics.checkNotNullExpressionValue(itemView2, "<get-model_first_coupon>(...)");
            Intrinsics.checkNotNullParameter(itemView2, "itemView");
            Intrinsics.checkNotNullParameter(transType, "transType");
            if (queryCouponClaimData2 != null) {
                itemView2.c(queryCouponClaimData2, false, this, transType);
            }
            QueryCouponClaimData queryCouponClaimData3 = (QueryCouponClaimData) arrayList.get(1);
            ModelClaimCouponItemView itemView3 = getModel_second_coupon();
            Intrinsics.checkNotNullExpressionValue(itemView3, "<get-model_second_coupon>(...)");
            Intrinsics.checkNotNullParameter(itemView3, "itemView");
            Intrinsics.checkNotNullParameter(transType, "transType");
            if (queryCouponClaimData3 != null) {
                itemView3.c(queryCouponClaimData3, false, this, transType);
            }
        }
    }

    @Nullable
    public final ClaimCouponListener getMListener() {
        return this.mListener;
    }

    @Override // com.transsnet.palmpay.core.viewmodel.ClaimCouponItemListener
    public final void onClaimCouponSuccess(String str) {
        ArrayList arrayList = this.f28299c;
        v.r(arrayList, new C0181x(str, 2));
        if (arrayList.size() == 0) {
            ClaimCouponListener claimCouponListener = this.mListener;
            if (claimCouponListener != null) {
                claimCouponListener.onClaimCouponDone();
                return;
            }
            return;
        }
        ClaimCouponListener claimCouponListener2 = this.mListener;
        if (claimCouponListener2 != null) {
            claimCouponListener2.onClaimCouponSuccess();
        }
    }

    public final void setMListener(@Nullable ClaimCouponListener claimCouponListener) {
        this.mListener = claimCouponListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelClaimCouponListItemView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28297a = C2131j.b(new Function0(this) { // from class: Ua.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponListItemView f9353b;

            {
                this.f9353b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponListItemView modelClaimCouponListItemView = this.f9353b;
                switch (i10) {
                    case 0:
                        int i11 = ModelClaimCouponListItemView.f28296e;
                        return (ModelClaimCouponItemView) modelClaimCouponListItemView.findViewById(p025ba.e.model_second_coupon);
                    default:
                        int i12 = ModelClaimCouponListItemView.f28296e;
                        return (ModelClaimCouponItemView) modelClaimCouponListItemView.findViewById(p025ba.e.model_first_coupon);
                }
            }
        });
        final int i11 = 1;
        this.f28298b = C2131j.b(new Function0(this) { // from class: Ua.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponListItemView f9353b;

            {
                this.f9353b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponListItemView modelClaimCouponListItemView = this.f9353b;
                switch (i11) {
                    case 0:
                        int i12 = ModelClaimCouponListItemView.f28296e;
                        return (ModelClaimCouponItemView) modelClaimCouponListItemView.findViewById(p025ba.e.model_second_coupon);
                    default:
                        int i13 = ModelClaimCouponListItemView.f28296e;
                        return (ModelClaimCouponItemView) modelClaimCouponListItemView.findViewById(p025ba.e.model_first_coupon);
                }
            }
        });
        this.f28299c = new ArrayList();
        View.inflate(context, g.core_layout_claimable_coupon_list, this);
    }
}
