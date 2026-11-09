package com.transsnet.palmpay.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelPaymentResult;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "amount", "", "setAmount", "(J)V", ViewProps.COLOR, "setAmountColor", "(I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPaymentResult extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f28397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f28398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28399e;

    public ModelPaymentResult(@Nullable Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, g.core_model_payment_result, this);
        this.f28397c = viewInflate != null ? (TextView) viewInflate.findViewById(e.cm_discount_tv) : null;
        this.f28398d = viewInflate != null ? (TextView) viewInflate.findViewById(e.cm_desc_tv) : null;
        this.f28399e = viewInflate != null ? (TextView) viewInflate.findViewById(e.cm_result_title) : null;
        if (viewInflate != null) {
        }
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    public final void setAmount(long amount) {
    }

    public final void setAmountColor(int color) {
    }

    public ModelPaymentResult(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModelPaymentResult(@Nullable Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
