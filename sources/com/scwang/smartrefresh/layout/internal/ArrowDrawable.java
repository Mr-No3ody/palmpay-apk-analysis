package com.scwang.smartrefresh.layout.internal;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.facebook.imageutils.JfifUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ArrowDrawable extends PaintDrawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25168b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f25169c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f25170d = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int i7 = this.f25168b;
        Path path = this.f25170d;
        if (i7 != iWidth || this.f25169c != iHeight) {
            int i10 = (iWidth * 30) / JfifUtil.MARKER_APP1;
            path.reset();
            double d2 = i10;
            float fSin = (float) (Math.sin(0.7853981633974483d) * d2);
            float fSin2 = (float) (d2 / Math.sin(0.7853981633974483d));
            int i11 = iWidth / 2;
            float f10 = iHeight;
            path.moveTo(i11, f10);
            float f11 = iHeight / 2;
            path.lineTo(0.0f, f11);
            float f12 = f11 - fSin;
            path.lineTo(fSin, f12);
            int i12 = i10 / 2;
            float f13 = i11 - i12;
            float f14 = (f10 - fSin2) - i12;
            path.lineTo(f13, f14);
            path.lineTo(f13, 0.0f);
            float f15 = i11 + i12;
            path.lineTo(f15, 0.0f);
            path.lineTo(f15, f14);
            float f16 = iWidth;
            path.lineTo(f16 - fSin, f12);
            path.lineTo(f16, f11);
            path.close();
            this.f25168b = iWidth;
            this.f25169c = iHeight;
        }
        canvas.drawPath(path, this.f25185a);
    }
}
