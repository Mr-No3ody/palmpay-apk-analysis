package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelCouponListItemView;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.q;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p052da.J;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelCouponListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTv_arrow_right", "()Landroid/widget/TextView;", "tv_arrow_right", "Lcom/wang/avi/AVLoadingIndicatorView;", "b", "getView_loading_indicator", "()Lcom/wang/avi/AVLoadingIndicatorView;", "view_loading_indicator", "Landroidx/recyclerview/widget/RecyclerView;", "c", "getRv_coupons", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_coupons", "Lda/J;", "e", "getMAdapter", "()Lda/J;", "mAdapter", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelCouponListItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelCouponListItemView.kt\ncom/transsnet/palmpay/core/viewmodel/ModelCouponListItemView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1669#2,8:72\n*S KotlinDebug\n*F\n+ 1 ModelCouponListItemView.kt\ncom/transsnet/palmpay/core/viewmodel/ModelCouponListItemView\n*L\n60#1:72,8\n*E\n"})
public final class ModelCouponListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f28310f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28315e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelCouponListItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RecyclerView getRv_coupons() {
        return (RecyclerView) this.f28313c.getValue();
    }

    private final TextView getTv_arrow_right() {
        Object value = this.f28311a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final AVLoadingIndicatorView getView_loading_indicator() {
        Object value = this.f28312b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AVLoadingIndicatorView) value;
    }

    public final void c(boolean z3) {
        AVLoadingIndicatorView view_loading_indicator = getView_loading_indicator();
        if (view_loading_indicator != null) {
            h.s(view_loading_indicator, z3);
        }
        TextView tv_arrow_right = getTv_arrow_right();
        if (tv_arrow_right != null) {
            h.s(tv_arrow_right, !z3);
        }
    }

    public final void d(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(Long.valueOf(((CouponItem) obj).nominaValue))) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        getMAdapter().setList(arrayList);
    }

    @NotNull
    public final J getMAdapter() {
        return (J) this.f28315e.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelCouponListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelCouponListItemView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelCouponListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28311a = C2131j.b(new Function0(this) { // from class: Ua.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelCouponListItemView f9355b;

            {
                this.f9355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelCouponListItemView modelCouponListItemView = this.f9355b;
                switch (i10) {
                    case 0:
                        int i11 = ModelCouponListItemView.f28310f;
                        return (TextView) modelCouponListItemView.findViewById(p025ba.e.tv_arrow_right);
                    case 1:
                        int i12 = ModelCouponListItemView.f28310f;
                        return (AVLoadingIndicatorView) modelCouponListItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i13 = ModelCouponListItemView.f28310f;
                        return (RecyclerView) modelCouponListItemView.findViewById(p025ba.e.rv_coupons);
                    default:
                        int i14 = ModelCouponListItemView.f28310f;
                        return new p052da.J(modelCouponListItemView.f28314d);
                }
            }
        });
        final int i11 = 1;
        this.f28312b = C2131j.b(new Function0(this) { // from class: Ua.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelCouponListItemView f9355b;

            {
                this.f9355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelCouponListItemView modelCouponListItemView = this.f9355b;
                switch (i11) {
                    case 0:
                        int i12 = ModelCouponListItemView.f28310f;
                        return (TextView) modelCouponListItemView.findViewById(p025ba.e.tv_arrow_right);
                    case 1:
                        int i13 = ModelCouponListItemView.f28310f;
                        return (AVLoadingIndicatorView) modelCouponListItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i14 = ModelCouponListItemView.f28310f;
                        return (RecyclerView) modelCouponListItemView.findViewById(p025ba.e.rv_coupons);
                    default:
                        int i15 = ModelCouponListItemView.f28310f;
                        return new p052da.J(modelCouponListItemView.f28314d);
                }
            }
        });
        final int i12 = 2;
        this.f28313c = C2131j.b(new Function0(this) { // from class: Ua.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelCouponListItemView f9355b;

            {
                this.f9355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelCouponListItemView modelCouponListItemView = this.f9355b;
                switch (i12) {
                    case 0:
                        int i13 = ModelCouponListItemView.f28310f;
                        return (TextView) modelCouponListItemView.findViewById(p025ba.e.tv_arrow_right);
                    case 1:
                        int i14 = ModelCouponListItemView.f28310f;
                        return (AVLoadingIndicatorView) modelCouponListItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i15 = ModelCouponListItemView.f28310f;
                        return (RecyclerView) modelCouponListItemView.findViewById(p025ba.e.rv_coupons);
                    default:
                        int i16 = ModelCouponListItemView.f28310f;
                        return new p052da.J(modelCouponListItemView.f28314d);
                }
            }
        });
        this.f28314d = 4;
        final int i13 = 3;
        this.f28315e = C2131j.b(new Function0(this) { // from class: Ua.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelCouponListItemView f9355b;

            {
                this.f9355b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelCouponListItemView modelCouponListItemView = this.f9355b;
                switch (i13) {
                    case 0:
                        int i14 = ModelCouponListItemView.f28310f;
                        return (TextView) modelCouponListItemView.findViewById(p025ba.e.tv_arrow_right);
                    case 1:
                        int i15 = ModelCouponListItemView.f28310f;
                        return (AVLoadingIndicatorView) modelCouponListItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i16 = ModelCouponListItemView.f28310f;
                        return (RecyclerView) modelCouponListItemView.findViewById(p025ba.e.rv_coupons);
                    default:
                        int i17 = ModelCouponListItemView.f28310f;
                        return new p052da.J(modelCouponListItemView.f28314d);
                }
            }
        });
        View.inflate(context, g.core_layout_available_coupon_list, this);
        RecyclerView rv_coupons = getRv_coupons();
        if (rv_coupons != null) {
            rv_coupons.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        RecyclerView rv_coupons2 = getRv_coupons();
        if (rv_coupons2 != null) {
            rv_coupons2.setAdapter(getMAdapter());
        }
        RecyclerView rv_coupons3 = getRv_coupons();
        if (rv_coupons3 != null) {
            C1548f c1548f = new C1548f(context.getColor(p.transparent), context.getResources().getDimensionPixelOffset(q.dp6), 0, 0);
            c1548f.f31336e = false;
            rv_coupons3.addItemDecoration(c1548f);
        }
    }
}
