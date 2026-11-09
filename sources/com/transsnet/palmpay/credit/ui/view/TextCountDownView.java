package com.transsnet.palmpay.credit.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/TextCountDownView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CountDownListener", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextCountDownView extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f30659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f30660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f30661e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/TextCountDownView$CountDownListener;", "", "onFinish", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CountDownListener {
        void onFinish();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextCountDownView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(g.core_count_down_text_view, (ViewGroup) this, false);
        View viewInflate2 = LayoutInflater.from(context).inflate(g.core_count_down_text_view, (ViewGroup) this, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        this.f30660d = (TextView) viewInflate2.findViewById(e.tv_pre_prompt);
        this.f30659c = (TextView) viewInflate2.findViewById(e.tv_time);
        addView(viewInflate2);
        Intrinsics.e(viewInflate);
        return viewInflate;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f30661e;
        if (aVar != null) {
            aVar.cancel();
            this.f30661e = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextCountDownView(@NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TextCountDownView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TextCountDownView(@NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
