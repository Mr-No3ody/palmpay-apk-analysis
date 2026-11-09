package com.skydoves.balloon.vectortext;

import E.AbstractC0198c;
import K7.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p234p9.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LK7/a;", "value", "a", "LK7/a;", "getDrawableTextViewParams", "()LK7/a;", "setDrawableTextViewParams", "(LK7/a;)V", "drawableTextViewParams", "lib_ballon_debug"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VectorTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a drawableTextViewParams;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final a getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(@Nullable a aVar) {
        if (aVar == null) {
            aVar = null;
        } else {
            b.e(this, aVar);
        }
        this.drawableTextViewParams = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.VectorTextView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new a(AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableStart, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableEnd, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableBottom, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableTop, Integer.MIN_VALUE)), null, null, null, null, AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawablePadding, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getColor(e.VectorTextView_balloon_drawableTintColor, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableWidth, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableHeight, Integer.MIN_VALUE)), AbstractC0198c.e0(typedArrayObtainStyledAttributes.getResourceId(e.VectorTextView_balloon_drawableSquareSize, Integer.MIN_VALUE)), 8176));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
