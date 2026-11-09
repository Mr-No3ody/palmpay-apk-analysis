package com.transsnet.palmpay.core.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.model.ModelPreviewItem;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.viewholder.CollapseLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010 \u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\"\u0010$\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\"\u0010(\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\"\u0010,\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010\u0013\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\"\u00100\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\"\u00104\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u0010\u0013\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017R\"\u00108\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\u0015\"\u0004\b7\u0010\u0017R\"\u0010<\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010\u0013\u001a\u0004\b:\u0010\u0015\"\u0004\b;\u0010\u0017R\"\u0010@\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010\u0013\u001a\u0004\b>\u0010\u0015\"\u0004\b?\u0010\u0017R\"\u0010D\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bA\u0010\u0013\u001a\u0004\bB\u0010\u0015\"\u0004\bC\u0010\u0017R\"\u0010H\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bE\u0010\u0013\u001a\u0004\bF\u0010\u0015\"\u0004\bG\u0010\u0017R\"\u0010L\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010\u0013\u001a\u0004\bJ\u0010\u0015\"\u0004\bK\u0010\u0017R\"\u0010T\u001a\u00020M8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/ModelResultAmountList;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "amount", "", "setBusinessAmount", "(J)V", "setFeeAmount", "setPointUsed", "Lcom/transsnet/palmpay/custom_view/model/ModelPreviewItem;", "c", "Lcom/transsnet/palmpay/custom_view/model/ModelPreviewItem;", "getMBusinessAmountPreviewItem", "()Lcom/transsnet/palmpay/custom_view/model/ModelPreviewItem;", "setMBusinessAmountPreviewItem", "(Lcom/transsnet/palmpay/custom_view/model/ModelPreviewItem;)V", "mBusinessAmountPreviewItem", "d", "getMAccountItem", "setMAccountItem", "mAccountItem", "e", "getMPaymentMethodItem", "setMPaymentMethodItem", "mPaymentMethodItem", "f", "getMFeeAmountPreviewItem", "setMFeeAmountPreviewItem", "mFeeAmountPreviewItem", "g", "getMPointUsedPreviewItem", "setMPointUsedPreviewItem", "mPointUsedPreviewItem", "i", "getMDataBonusUsedPreviewItem", "setMDataBonusUsedPreviewItem", "mDataBonusUsedPreviewItem", "j", "getMCouponAmountPreviewItem", "setMCouponAmountPreviewItem", "mCouponAmountPreviewItem", "o", "getMDiscountUsedPreviewItem", "setMDiscountUsedPreviewItem", "mDiscountUsedPreviewItem", "p", "getMTransactionIdPreviewItem", "setMTransactionIdPreviewItem", "mTransactionIdPreviewItem", "t", "getMTransTypePreviewItem", "setMTransTypePreviewItem", "mTransTypePreviewItem", "v", "getMPointEarnedPreviewItem", "setMPointEarnedPreviewItem", "mPointEarnedPreviewItem", "w", "getMDataBonusEarnedPreviewItem", "setMDataBonusEarnedPreviewItem", "mDataBonusEarnedPreviewItem", "A", "getMCommissionEarnedPreviewItem", "setMCommissionEarnedPreviewItem", "mCommissionEarnedPreviewItem", "B", "getMSaveForYouPreviewItem", "setMSaveForYouPreviewItem", "mSaveForYouPreviewItem", "Lcom/transsnet/palmpay/custom_view/viewholder/CollapseLayout;", "C", "Lcom/transsnet/palmpay/custom_view/viewholder/CollapseLayout;", "getMCollapseLayout", "()Lcom/transsnet/palmpay/custom_view/viewholder/CollapseLayout;", "setMCollapseLayout", "(Lcom/transsnet/palmpay/custom_view/viewholder/CollapseLayout;)V", "mCollapseLayout", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelResultAmountList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelResultAmountList.kt\ncom/transsnet/palmpay/core/ui/widget/ModelResultAmountList\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,234:1\n35#2:235\n*S KotlinDebug\n*F\n+ 1 ModelResultAmountList.kt\ncom/transsnet/palmpay/core/ui/widget/ModelResultAmountList\n*L\n196#1:235\n*E\n"})
public final class ModelResultAmountList extends BaseModel {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f28146H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mCommissionEarnedPreviewItem;

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mSaveForYouPreviewItem;

    /* JADX INFO: renamed from: C, reason: collision with root package name and from kotlin metadata */
    public CollapseLayout mCollapseLayout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mBusinessAmountPreviewItem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mAccountItem;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mPaymentMethodItem;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mFeeAmountPreviewItem;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mPointUsedPreviewItem;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mDataBonusUsedPreviewItem;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mCouponAmountPreviewItem;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mDiscountUsedPreviewItem;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mTransactionIdPreviewItem;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public ModelPreviewItem mTransTypePreviewItem;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mPointEarnedPreviewItem;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public ModelPreviewItem mDataBonusEarnedPreviewItem;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelResultAmountList(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, t.cv_model_result_amount_list, this);
        setMCollapseLayout((CollapseLayout) findViewById(s.collapse_layout));
        setMPaymentMethodItem((ModelPreviewItem) findViewById(s.payment_method_item));
        setMAccountItem((ModelPreviewItem) findViewById(s.account_item));
        setMBusinessAmountPreviewItem((ModelPreviewItem) findViewById(s.amount_list_business_amount_item));
        setMFeeAmountPreviewItem((ModelPreviewItem) findViewById(s.amount_list_fee_amount_item));
        setMPointUsedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_points_used_item));
        setMDataBonusUsedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_data_bonus_used_item));
        setMCouponAmountPreviewItem((ModelPreviewItem) findViewById(s.amount_list_coupon_amount_item));
        setMDiscountUsedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_discount_used_item));
        setMTransactionIdPreviewItem((ModelPreviewItem) findViewById(s.amount_list_transaction_id_item));
        setMTransTypePreviewItem((ModelPreviewItem) findViewById(s.amount_list_trans_type_item));
        setMPointEarnedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_points_earnd_item));
        setMDataBonusEarnedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_data_bonus_earnd_item));
        setMCommissionEarnedPreviewItem((ModelPreviewItem) findViewById(s.amount_list_commission_earnd_item));
        setMSaveForYouPreviewItem((ModelPreviewItem) findViewById(s.amount_list_save_for_you_item));
        getMPaymentMethodItem().f31567c.setText(k.core_payment_method);
        getMBusinessAmountPreviewItem().f31567c.setText(v.cv_amount);
        getMFeeAmountPreviewItem().f31567c.setText(v.cv_fee);
        getMDataBonusUsedPreviewItem().f31567c.setText(v.cv_all_data_bonus_used);
        getMPointUsedPreviewItem().f31567c.setText(v.cv_points_used);
        getMCouponAmountPreviewItem().f31567c.setText(v.cv_coupon_used);
        getMDiscountUsedPreviewItem().f31567c.setText(v.cv_discount_used);
        getMTransactionIdPreviewItem().f31567c.setText(v.cv_transaction_id);
        getMTransTypePreviewItem().f31567c.setText(v.cv_transaction_type);
        getMPointEarnedPreviewItem().f31567c.setText(v.cv_points_earned);
        getMDataBonusEarnedPreviewItem().f31567c.setText(v.cv_all_data_bonus_earned);
        getMCommissionEarnedPreviewItem().f31567c.setText(v.cv_commission_to_earn);
        getMSaveForYouPreviewItem().f31567c.setText(v.cv_save_for_you);
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @NotNull
    public final ModelPreviewItem getMAccountItem() {
        ModelPreviewItem modelPreviewItem = this.mAccountItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mAccountItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMBusinessAmountPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mBusinessAmountPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mBusinessAmountPreviewItem");
        throw null;
    }

    @NotNull
    public final CollapseLayout getMCollapseLayout() {
        CollapseLayout collapseLayout = this.mCollapseLayout;
        if (collapseLayout != null) {
            return collapseLayout;
        }
        Intrinsics.n("mCollapseLayout");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMCommissionEarnedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mCommissionEarnedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mCommissionEarnedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMCouponAmountPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mCouponAmountPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mCouponAmountPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMDataBonusEarnedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mDataBonusEarnedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mDataBonusEarnedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMDataBonusUsedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mDataBonusUsedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mDataBonusUsedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMDiscountUsedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mDiscountUsedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mDiscountUsedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMFeeAmountPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mFeeAmountPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mFeeAmountPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMPaymentMethodItem() {
        ModelPreviewItem modelPreviewItem = this.mPaymentMethodItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mPaymentMethodItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMPointEarnedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mPointEarnedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mPointEarnedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMPointUsedPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mPointUsedPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mPointUsedPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMSaveForYouPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mSaveForYouPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mSaveForYouPreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMTransTypePreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mTransTypePreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mTransTypePreviewItem");
        throw null;
    }

    @NotNull
    public final ModelPreviewItem getMTransactionIdPreviewItem() {
        ModelPreviewItem modelPreviewItem = this.mTransactionIdPreviewItem;
        if (modelPreviewItem != null) {
            return modelPreviewItem;
        }
        Intrinsics.n("mTransactionIdPreviewItem");
        throw null;
    }

    public final void setBusinessAmount(long amount) {
    }

    public final void setFeeAmount(long amount) {
    }

    public final void setMAccountItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mAccountItem = modelPreviewItem;
    }

    public final void setMBusinessAmountPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mBusinessAmountPreviewItem = modelPreviewItem;
    }

    public final void setMCollapseLayout(@NotNull CollapseLayout collapseLayout) {
        Intrinsics.checkNotNullParameter(collapseLayout, "<set-?>");
        this.mCollapseLayout = collapseLayout;
    }

    public final void setMCommissionEarnedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mCommissionEarnedPreviewItem = modelPreviewItem;
    }

    public final void setMCouponAmountPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mCouponAmountPreviewItem = modelPreviewItem;
    }

    public final void setMDataBonusEarnedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mDataBonusEarnedPreviewItem = modelPreviewItem;
    }

    public final void setMDataBonusUsedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mDataBonusUsedPreviewItem = modelPreviewItem;
    }

    public final void setMDiscountUsedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mDiscountUsedPreviewItem = modelPreviewItem;
    }

    public final void setMFeeAmountPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mFeeAmountPreviewItem = modelPreviewItem;
    }

    public final void setMPaymentMethodItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mPaymentMethodItem = modelPreviewItem;
    }

    public final void setMPointEarnedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mPointEarnedPreviewItem = modelPreviewItem;
    }

    public final void setMPointUsedPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mPointUsedPreviewItem = modelPreviewItem;
    }

    public final void setMSaveForYouPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mSaveForYouPreviewItem = modelPreviewItem;
    }

    public final void setMTransTypePreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mTransTypePreviewItem = modelPreviewItem;
    }

    public final void setMTransactionIdPreviewItem(@NotNull ModelPreviewItem modelPreviewItem) {
        Intrinsics.checkNotNullParameter(modelPreviewItem, "<set-?>");
        this.mTransactionIdPreviewItem = modelPreviewItem;
    }

    public final void setPointUsed(long amount) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelResultAmountList(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelResultAmountList(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelResultAmountList(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
