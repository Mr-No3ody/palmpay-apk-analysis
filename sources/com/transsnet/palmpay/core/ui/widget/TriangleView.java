package com.transsnet.palmpay.core.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/TriangleView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "triangleColor", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "I", "getTriangleColor", "()I", "setTriangleColor", "(I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAmountUnitLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmountUnitLayout.kt\ncom/transsnet/palmpay/core/ui/widget/TriangleView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,880:1\n1#2:881\n*E\n"})
public final class TriangleView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int triangleColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f28179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Path f28180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TriangleView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.triangleColor = i7;
        Paint paint = new Paint(1);
        paint.setColor(this.triangleColor);
        paint.setStyle(Paint.Style.FILL);
        this.f28179b = paint;
    }

    public final int getTriangleColor() {
        return this.triangleColor;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f28180c == null || getWidth() != this.f28181d || getHeight() != this.f28182e) {
            Path path = new Path();
            float height = getHeight() / 4.0f;
            path.moveTo(0.0f, 0.0f);
            path.lineTo(getWidth(), 0.0f);
            path.lineTo((getWidth() / 2.0f) + height, getHeight());
            path.quadTo(getWidth() / 2.0f, getHeight() + height, (getWidth() / 2.0f) - height, getHeight());
            path.close();
            this.f28180c = path;
            this.f28181d = getWidth();
            this.f28182e = getHeight();
        }
        Path path2 = this.f28180c;
        if (path2 != null) {
            canvas.drawPath(path2, this.f28179b);
        }
    }

    public final void setTriangleColor(int i7) {
        this.triangleColor = i7;
    }
}
