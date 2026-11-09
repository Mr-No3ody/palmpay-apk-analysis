package com.transsnet.palmpay.core.viewmodel;

import M1.j;
import Pa.F;
import Pa.b0;
import Pa.n0;
import Ua.C;
import Ua.D;
import Ua.G;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BillQuickAccessBean;
import com.transsnet.palmpay.core.bean.BillerAccessItem;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.model.BaseLinearLayout;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p025ba.m;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelBillQuickAccessItem;", "Lcom/transsnet/palmpay/custom_view/model/BaseLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "getRv_bill_list", "()Landroidx/recyclerview/widget/RecyclerView;", "rv_bill_list", "LUa/C;", "e", "getAdapter", "()LUa/C;", "adapter", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelBillQuickAccessItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelBillQuickAccessItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelBillQuickAccessItem\n+ 2 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,179:1\n116#2:180\n*S KotlinDebug\n*F\n+ 1 ModelBillQuickAccessItem.kt\ncom/transsnet/palmpay/core/viewmodel/ModelBillQuickAccessItem\n*L\n118#1:180\n*E\n"})
public final class ModelBillQuickAccessItem extends BaseLinearLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f28279f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28282e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillQuickAccessItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(ModelBillQuickAccessItem modelBillQuickAccessItem, Context context, j jVar, View view, int i7) {
        BillerAccessItem billerAccessItem;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        C adapter = modelBillQuickAccessItem.getAdapter();
        String str = (adapter == null || (billerAccessItem = (BillerAccessItem) adapter.getItem(i7)) == null) ? null : billerAccessItem.androidLink;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Intent intentA = F.a(context, str);
        n0.g().k(new ClickEvent("PalmPay_BillQuickAccess").add("element_name", modelBillQuickAccessItem.f28281d).add("element_details", str));
        ActivityUtils.startActivity(intentA);
    }

    private final C getAdapter() {
        return (C) this.f28282e.getValue();
    }

    private final RecyclerView getRv_bill_list() {
        return (RecyclerView) this.f28280c.getValue();
    }

    public final void b(String str, boolean z3) {
        this.f28281d = str;
        getAdapter().f9306a = z3;
        if (BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            f fVar = I.f10809a;
            addJob(AbstractC0780y.m(lifecycleCoroutineScopeImplF, e.f19009c, null, new G(null, this), 2));
        }
    }

    public final void c(BillQuickAccessBean billQuickAccessBean) {
        List<BillerAccessItem> list;
        if (((billQuickAccessBean == null || (list = billQuickAccessBean.list) == null) ? 0 : list.size()) <= 0) {
            h.s(this, false);
        } else {
            getAdapter().setList(billQuickAccessBean != null ? billQuickAccessBean.list : null);
            h.s(this, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillQuickAccessItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelBillQuickAccessItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelBillQuickAccessItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28280c = C2131j.b(new M3.f(this, 19));
        this.f28282e = C2131j.b(new b0(11));
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, m.CoreModelBillQuickAccessItems, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28281d = typedArrayObtainStyledAttributes.getString(m.CoreModelBillQuickAccessItems_coreBillTransType);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.core_layout_bill_qucik_access_model, this);
        RecyclerView rv_bill_list = getRv_bill_list();
        if (rv_bill_list != null) {
            rv_bill_list.setLayoutManager(new LinearLayoutManager(context, 0, false));
        }
        RecyclerView rv_bill_list2 = getRv_bill_list();
        if (rv_bill_list2 != null) {
            rv_bill_list2.addItemDecoration(new D());
        }
        RecyclerView rv_bill_list3 = getRv_bill_list();
        if (rv_bill_list3 != null) {
            rv_bill_list3.setAdapter(getAdapter());
        }
        C adapter = getAdapter();
        if (adapter != null) {
            adapter.setOnItemClickListener(new U8.a(1, this, context));
        }
        setVisibility(8);
    }
}
