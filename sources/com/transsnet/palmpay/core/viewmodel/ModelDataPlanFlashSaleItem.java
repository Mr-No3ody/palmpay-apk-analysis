package com.transsnet.palmpay.core.viewmodel;

import F6.d;
import Hb.L;
import M1.j;
import N8.C0457a;
import Ua.O;
import Ua.Q;
import Ua.U;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.t0;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.FlashSaleDataBundleBeanV2;
import com.transsnet.palmpay.core.bean.FlashSaleItemBean;
import com.transsnet.palmpay.core.bean.RecommendedItem;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.custom_view.model.BaseConstraintLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p025ba.g;
import p042cg.e;
import p042cg.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJE\u0010\u0012\u001a\u00020\u001026\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelDataPlanFlashSaleItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", ViewProps.POSITION, "Lcom/transsnet/palmpay/core/bean/RecommendedItem;", "item", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Lkotlin/Lazy;", "getRv_data_bundles", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_data_bundles", "Lcom/mikepenz/iconics/view/IconicsImageView;", "d", "getIvInfo", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "ivInfo", "Landroid/widget/TextView;", "e", "getTv_sale_time_title", "()Landroid/widget/TextView;", "tv_sale_time_title", "LUa/O;", "i", "getAdapter", "()LUa/O;", "adapter", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelDataPlanFlashSaleItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelDataPlanFlashSaleItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelDataPlanFlashSaleItem\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,414:1\n176#2,2:415\n116#3:417\n*S KotlinDebug\n*F\n+ 1 ModelDataPlanFlashSaleItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelDataPlanFlashSaleItem\n*L\n77#1:415,2\n134#1:417\n*E\n"})
public final class ModelDataPlanFlashSaleItem extends BaseConstraintLayout {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f28316j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function2 f28320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f28321g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28322i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataPlanFlashSaleItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem, j jVar, View view, int i7) {
        Integer num;
        Function2 function2;
        RecommendedItem recommendedItem;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        O adapter = modelDataPlanFlashSaleItem.getAdapter();
        RecommendedItem recommendedItem2 = adapter != null ? (RecommendedItem) adapter.getItem(i7) : null;
        if (recommendedItem2 == null || (num = recommendedItem2.status) == null || num.intValue() != 1 || (function2 = modelDataPlanFlashSaleItem.f28320f) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i7);
        O adapter2 = modelDataPlanFlashSaleItem.getAdapter();
        if (adapter2 == null || (recommendedItem = (RecommendedItem) adapter2.getItem(i7)) == null) {
            return;
        }
        function2.invoke(numValueOf, recommendedItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final O getAdapter() {
        return (O) this.f28322i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconicsImageView getIvInfo() {
        Object value = this.f28318d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final RecyclerView getRv_data_bundles() {
        Object value = this.f28317c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTv_sale_time_title() {
        Object value = this.f28319e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00c0  */
    public final void g(FlashSaleDataBundleBeanV2 flashSaleDataBundleBeanV2) {
        long j6;
        t0 t0Var;
        Object next;
        long j10;
        long j11;
        long j12;
        List<RecommendedItem> list = flashSaleDataBundleBeanV2 != null ? flashSaleDataBundleBeanV2.items : null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    FlashSaleItemBean flashSaleItemBean = (FlashSaleItemBean) next;
                    Long l5 = flashSaleItemBean.startDownTime;
                    long jLongValue = l5 != null ? l5.longValue() : 0L;
                    Long l6 = flashSaleItemBean.endDownTime;
                    long jLongValue2 = l6 != null ? l6.longValue() : 0L;
                    if (jLongValue > jElapsedRealtime) {
                        j10 = jLongValue - jElapsedRealtime;
                    } else {
                        j10 = jLongValue2 > jElapsedRealtime ? jLongValue2 - jElapsedRealtime : 0L;
                    }
                    if (j10 <= 0) {
                        j10 = Long.MAX_VALUE;
                    }
                    do {
                        Object next2 = it.next();
                        FlashSaleItemBean flashSaleItemBean2 = (FlashSaleItemBean) next2;
                        Long l8 = flashSaleItemBean2.startDownTime;
                        long jLongValue3 = l8 != null ? l8.longValue() : 0L;
                        Long l10 = flashSaleItemBean2.endDownTime;
                        long jLongValue4 = l10 != null ? l10.longValue() : 0L;
                        if (jLongValue3 > jElapsedRealtime) {
                            j11 = jLongValue3 - jElapsedRealtime;
                        } else {
                            j11 = jLongValue4 > jElapsedRealtime ? jLongValue4 - jElapsedRealtime : 0L;
                        }
                        if (j11 <= 0) {
                            j11 = Long.MAX_VALUE;
                        }
                        if (j10 > j11) {
                            next = next2;
                            j10 = j11;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            FlashSaleItemBean flashSaleItemBean3 = (FlashSaleItemBean) next;
            if (flashSaleItemBean3 == null) {
                j6 = 0;
            } else {
                Long l11 = flashSaleItemBean3.startDownTime;
                long jLongValue5 = l11 != null ? l11.longValue() : 0L;
                Long l12 = flashSaleItemBean3.endDownTime;
                long jLongValue6 = l12 != null ? l12.longValue() : 0L;
                if (jLongValue5 > jElapsedRealtime) {
                    j12 = jLongValue5 - jElapsedRealtime;
                } else if (jLongValue6 > jElapsedRealtime) {
                    j12 = jLongValue6 - jElapsedRealtime;
                } else {
                    j6 = 0;
                }
                j6 = j12;
            }
        } else {
            j6 = 0;
        }
        t0 t0Var2 = this.f28321g;
        if (t0Var2 != null && t0Var2.isActive() && (t0Var = this.f28321g) != null) {
            t0Var.cancel((CancellationException) null);
        }
        d.h("ModelDataPlanFlashSaleItem", 3, u.i(j6, "refreshUIByNextTime time11="));
        if (j6 > 0) {
            d.h("ModelDataPlanFlashSaleItem", 3, u.i(j6, "refreshUIByNextTime time="));
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            this.f28321g = AbstractC0780y.m(lifecycleCoroutineScopeImplF, o.f11960a, null, new Ua.V(j6, this, flashSaleDataBundleBeanV2, null), 2);
        }
    }

    public final void h(String str) {
        if (str == null || str.length() == 0) {
            setVisibility(8);
        } else {
            if (!BaseApplication.hasLogin() || TextUtils.isEmpty(str)) {
                return;
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new U(null, str, this), 2));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        t0 t0Var;
        super.onDetachedFromWindow();
        t0 t0Var2 = this.f28321g;
        if (t0Var2 == null || !t0Var2.isActive() || (t0Var = this.f28321g) == null) {
            return;
        }
        t0Var.cancel((CancellationException) null);
    }

    public final void setOnItemClickListener(@NotNull Function2<? super Integer, ? super RecommendedItem, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f28320f = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataPlanFlashSaleItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelDataPlanFlashSaleItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelDataPlanFlashSaleItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28317c = C2131j.b(new Function0(this) { // from class: Ua.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataPlanFlashSaleItem f9363b;

            {
                this.f9363b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f9363b;
                switch (i10) {
                    case 0:
                        int i11 = ModelDataPlanFlashSaleItem.f28316j;
                        return (RecyclerView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.rv_data_bundles);
                    case 1:
                        int i12 = ModelDataPlanFlashSaleItem.f28316j;
                        return (IconicsImageView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.ivInfo);
                    default:
                        int i13 = ModelDataPlanFlashSaleItem.f28316j;
                        return (TextView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.tv_sale_time_title);
                }
            }
        });
        final int i11 = 1;
        this.f28318d = C2131j.b(new Function0(this) { // from class: Ua.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataPlanFlashSaleItem f9363b;

            {
                this.f9363b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f9363b;
                switch (i11) {
                    case 0:
                        int i12 = ModelDataPlanFlashSaleItem.f28316j;
                        return (RecyclerView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.rv_data_bundles);
                    case 1:
                        int i13 = ModelDataPlanFlashSaleItem.f28316j;
                        return (IconicsImageView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.ivInfo);
                    default:
                        int i14 = ModelDataPlanFlashSaleItem.f28316j;
                        return (TextView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.tv_sale_time_title);
                }
            }
        });
        final int i12 = 2;
        this.f28319e = C2131j.b(new Function0(this) { // from class: Ua.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelDataPlanFlashSaleItem f9363b;

            {
                this.f9363b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f9363b;
                switch (i12) {
                    case 0:
                        int i13 = ModelDataPlanFlashSaleItem.f28316j;
                        return (RecyclerView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.rv_data_bundles);
                    case 1:
                        int i14 = ModelDataPlanFlashSaleItem.f28316j;
                        return (IconicsImageView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.ivInfo);
                    default:
                        int i15 = ModelDataPlanFlashSaleItem.f28316j;
                        return (TextView) modelDataPlanFlashSaleItem.findViewById(p025ba.e.tv_sale_time_title);
                }
            }
        });
        this.f28322i = C2131j.b(new L(4, context, this));
        View.inflate(context, g.core_layout_flash_sale_databundle_item, this);
        setBackgroundResource(r.cv_rect_corner_12_bg_white);
        int dp = CommonViewExtKt.getDp(12);
        setPadding(dp, dp, dp, dp);
        RecyclerView rv_data_bundles = getRv_data_bundles();
        if (rv_data_bundles != null) {
            rv_data_bundles.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        RecyclerView rv_data_bundles2 = getRv_data_bundles();
        if (rv_data_bundles2 != null) {
            rv_data_bundles2.addItemDecoration(new Q());
        }
        RecyclerView rv_data_bundles3 = getRv_data_bundles();
        if (rv_data_bundles3 != null) {
            rv_data_bundles3.setAdapter(getAdapter());
        }
        O adapter = getAdapter();
        if (adapter != null) {
            adapter.setOnItemClickListener(new C0457a(this, 26));
        }
        setVisibility(8);
    }
}
