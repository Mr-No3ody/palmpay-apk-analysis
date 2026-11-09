package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class EllipseView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23268d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f23265a);
        double dRelativeOnHeight = relativeOnHeight(this.f23266b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f23267c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f23268d);
        double d2 = dRelativeOnWidth - dRelativeOnWidth2;
        double d10 = dRelativeOnHeight - dRelativeOnHeight2;
        double d11 = dRelativeOnWidth + dRelativeOnWidth2;
        double d12 = dRelativeOnHeight + dRelativeOnHeight2;
        path.addOval(new RectF((float) d2, (float) d10, (float) d11, (float) d12), Path.Direction.CW);
        ArrayList<C1415l> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C1415l(3, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d10)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d10), new com.abedelazizshe.lightcompressorlibrary.config.b(d11, dRelativeOnHeight)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d11, dRelativeOnHeight), new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d12)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d12), new com.abedelazizshe.lightcompressorlibrary.config.b(d2, dRelativeOnHeight)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d2, dRelativeOnHeight), new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d10)}));
        return path;
    }
}
