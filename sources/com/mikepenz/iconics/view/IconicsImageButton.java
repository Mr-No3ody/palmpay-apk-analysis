package com.mikepenz.iconics.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mikepenz/iconics/view/IconicsImageButton;", "Lcom/mikepenz/iconics/view/IconicsImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "iconics-views"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class IconicsImageButton extends IconicsImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = ImageButton.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ImageButton::class.java.name");
        return name;
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i7) {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ IconicsImageButton(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IconicsImageButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        setFocusable(true);
    }
}
