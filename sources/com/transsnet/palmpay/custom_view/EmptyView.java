package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\n \u0015*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/custom_view/EmptyView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "tips", "", "setTips", "(Ljava/lang/String;)V", "icon", "setIcon", "(I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTvTips", "()Landroid/widget/TextView;", "tvTips", "Landroidx/appcompat/widget/AppCompatImageView;", "b", "getIvIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "ivIcon", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyView extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31015c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p355xf.t f31016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p355xf.t f31017b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31016a = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmptyView f31345b;

            {
                this.f31345b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EmptyView emptyView = this.f31345b;
                switch (i10) {
                    case 0:
                        int i11 = EmptyView.f31015c;
                        return (TextView) emptyView.findViewById(s.tvTips);
                    default:
                        int i12 = EmptyView.f31015c;
                        return (AppCompatImageView) emptyView.findViewById(s.ivIcon);
                }
            }
        });
        final int i11 = 1;
        this.f31017b = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.custom_view.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmptyView f31345b;

            {
                this.f31345b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                EmptyView emptyView = this.f31345b;
                switch (i11) {
                    case 0:
                        int i12 = EmptyView.f31015c;
                        return (TextView) emptyView.findViewById(s.tvTips);
                    default:
                        int i13 = EmptyView.f31015c;
                        return (AppCompatImageView) emptyView.findViewById(s.ivIcon);
                }
            }
        });
        LayoutInflater.from(context).inflate(t.cv_empty_list_view, this);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.CvNewEmptyView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(x.CvNewEmptyView_cv_ev_tips);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.CvNewEmptyView_cv_ev_icon_res, r.cv_empty_no_transaction_history);
        setTips(string);
        setIcon(resourceId);
    }

    private final AppCompatImageView getIvIcon() {
        return (AppCompatImageView) this.f31017b.getValue();
    }

    private final TextView getTvTips() {
        return (TextView) this.f31016a.getValue();
    }

    public final void setIcon(@DrawableRes int icon) {
        getIvIcon().setImageResource(icon);
    }

    public final void setTips(@Nullable String tips) {
        getTvTips().setText(tips);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
