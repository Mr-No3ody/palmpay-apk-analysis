package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class CircleView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23264c;

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        double dRelativeOnWidth = relativeOnWidth(this.f23262a);
        double dRelativeOnHeight = relativeOnHeight(this.f23263b);
        double dRelativeOnOther = relativeOnOther(this.f23264c);
        path.addCircle((float) dRelativeOnWidth, (float) dRelativeOnHeight, (float) dRelativeOnOther, Path.Direction.CW);
        ArrayList<C1415l> arrayList = new ArrayList<>();
        this.elements = arrayList;
        double d2 = dRelativeOnHeight - dRelativeOnOther;
        arrayList.add(new C1415l(3, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d2)}));
        double d10 = dRelativeOnWidth + dRelativeOnOther;
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d2), new com.abedelazizshe.lightcompressorlibrary.config.b(d10, dRelativeOnHeight)}));
        double d11 = dRelativeOnHeight + dRelativeOnOther;
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d10, dRelativeOnHeight), new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d11)}));
        double d12 = dRelativeOnWidth - dRelativeOnOther;
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d11), new com.abedelazizshe.lightcompressorlibrary.config.b(d12, dRelativeOnHeight)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d12, dRelativeOnHeight), new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth, d2)}));
        return path;
    }
}
