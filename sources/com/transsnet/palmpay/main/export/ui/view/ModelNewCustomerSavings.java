package com.transsnet.palmpay.main.export.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.main.export.bean.rsp.SavingProduct;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/main/export/ui/view/ModelNewCustomerSavings;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/transsnet/palmpay/main/export/ui/view/ModelNewCustomerSavings$OnInvestBtnClickListener;", "investBtnClickListener", "", "setOnInvestBtnClickListener", "(Lcom/transsnet/palmpay/main/export/ui/view/ModelNewCustomerSavings$OnInvestBtnClickListener;)V", "d", "I", "getMBottomLayoutBackgroundResId", "()I", "setMBottomLayoutBackgroundResId", "(I)V", "mBottomLayoutBackgroundResId", "com/transsnet/palmpay/main/export/ui/view/a", "OnInvestBtnClickListener", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelNewCustomerSavings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelNewCustomerSavings.kt\ncom/transsnet/palmpay/main/export/ui/view/ModelNewCustomerSavings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1#2:167\n*E\n"})
public final class ModelNewCustomerSavings extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f31996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int mBottomLayoutBackgroundResId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/main/export/ui/view/ModelNewCustomerSavings$OnInvestBtnClickListener;", "", "onInvestBtnClick", "", "savingProduct", "Lcom/transsnet/palmpay/main/export/bean/rsp/SavingProduct;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnInvestBtnClickListener {
        void onInvestBtnClick(@Nullable SavingProduct savingProduct);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNewCustomerSavings(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void a(Context context) {
        super.a(context);
        View viewFindViewById = findViewById(s.rvExclusiveList);
        Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        a aVar = new a();
        this.f31996c = aVar;
        recyclerView.setAdapter(aVar);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(t.cv_layout_new_customer_savings, this);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final int getMBottomLayoutBackgroundResId() {
        return this.mBottomLayoutBackgroundResId;
    }

    public final void setMBottomLayoutBackgroundResId(int i7) {
        this.mBottomLayoutBackgroundResId = i7;
    }

    public final void setOnInvestBtnClickListener(@NotNull OnInvestBtnClickListener investBtnClickListener) {
        Intrinsics.checkNotNullParameter(investBtnClickListener, "investBtnClickListener");
        a aVar = this.f31996c;
        if (aVar == null) {
            Intrinsics.n("mNewUserCustomerSavingsAdapter");
            throw null;
        }
        Intrinsics.checkNotNullParameter(investBtnClickListener, "investBtnClickListener");
        aVar.f31999b = investBtnClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNewCustomerSavings(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelNewCustomerSavings(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelNewCustomerSavings(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mBottomLayoutBackgroundResId = r.cv_rect_corner_12_bg_white;
    }
}
