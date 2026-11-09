package com.transsnet.palmpay.credit.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TicketView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f30880a = SizeUtils.dp2px(3.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30881b = SizeUtils.dp2px(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30882c = SizeUtils.dp2px(1.0f);

    public TicketView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(getPaint().getColor());
        int i7 = f30882c;
        paint.setStrokeWidth(i7);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        int i10 = f30880a;
        float f10 = (i7 / 2.0f) + i10;
        float f11 = (i7 / 2.0f) + i10;
        path.arcTo(new RectF(f10 - i10, f11 - i10, f10 + i10, f11 + i10), 180.0f, 90.0f, true);
        float width = (getWidth() - (i7 / 2.0f)) - i10;
        float f12 = (i7 / 2.0f) + i10;
        path.arcTo(new RectF(width - i10, f12 - i10, width + i10, f12 + i10), -90.0f, 90.0f, false);
        float width2 = getWidth() - (i7 / 2.0f);
        float height = getHeight() / 2.0f;
        int i11 = f30881b;
        path.arcTo(new RectF((width2 - i10) + i11, height - i10, (width2 + i10) - i11, height + i10), -90.0f, -180.0f, false);
        float width3 = (getWidth() - (i7 / 2.0f)) - i10;
        float height2 = (getHeight() - (i7 / 2.0f)) - i10;
        path.arcTo(new RectF(width3 - i10, height2 - i10, width3 + i10, height2 + i10), 0.0f, 90.0f, false);
        float f13 = (i7 / 2.0f) + i10;
        float height3 = (getHeight() - (i7 / 2.0f)) - i10;
        path.arcTo(new RectF(f13 - i10, height3 - i10, f13 + i10, height3 + i10), 90.0f, 90.0f, false);
        float f14 = i7 / 2.0f;
        float height4 = getHeight() / 2.0f;
        path.arcTo(new RectF((f14 - i10) + i11, height4 - i10, (f14 + i10) - i11, height4 + i10), 90.0f, -180.0f, false);
        path.close();
        canvas.drawPath(path, paint);
    }

    public TicketView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TicketView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setPadding(SizeUtils.dp2px(6.0f), SizeUtils.dp2px(2.0f), SizeUtils.dp2px(6.0f), SizeUtils.dp2px(2.0f));
    }
}
