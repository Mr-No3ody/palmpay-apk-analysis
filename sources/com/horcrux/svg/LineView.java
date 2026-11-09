package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class LineView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23322d;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f23319a);
        double dRelativeOnHeight = relativeOnHeight(this.f23320b);
        double dRelativeOnWidth2 = relativeOnWidth(this.f23321c);
        double dRelativeOnHeight2 = relativeOnHeight(this.f23322d);
        path.moveTo((float) dRelativeOnWidth, (float) dRelativeOnHeight);
        path.lineTo((float) dRelativeOnWidth2, (float) dRelativeOnHeight2);
        ArrayList<C1415l> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C1415l(3, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, dRelativeOnHeight)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
