package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
class RectView extends RenderableView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1420q f23373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1420q f23374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1420q f23375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1420q f23376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1420q f23377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1420q f23378f;

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public final Path getPath(Canvas canvas, Paint paint) {
        double dRelativeOnWidth;
        double dRelativeOnHeight;
        double d2;
        double d10;
        Path path = new Path();
        double dRelativeOnWidth2 = relativeOnWidth(this.f23373a);
        double dRelativeOnHeight2 = relativeOnHeight(this.f23374b);
        double dRelativeOnWidth3 = relativeOnWidth(this.f23375c);
        double dRelativeOnHeight3 = relativeOnHeight(this.f23376d);
        C1420q c1420q = this.f23377e;
        if (c1420q == null && this.f23378f == null) {
            path.addRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), Path.Direction.CW);
            path.close();
        } else {
            if (c1420q == null) {
                dRelativeOnWidth = relativeOnHeight(this.f23378f);
            } else {
                if (this.f23378f == null) {
                    dRelativeOnWidth = relativeOnWidth(c1420q);
                } else {
                    dRelativeOnWidth = relativeOnWidth(c1420q);
                    dRelativeOnHeight = relativeOnHeight(this.f23378f);
                }
                d2 = dRelativeOnWidth3 / 2.0d;
                if (dRelativeOnWidth > d2) {
                    dRelativeOnWidth = d2;
                }
                d10 = dRelativeOnHeight3 / 2.0d;
                if (dRelativeOnHeight > d10) {
                    dRelativeOnHeight = d10;
                }
                path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
            }
            dRelativeOnHeight = dRelativeOnWidth;
            d2 = dRelativeOnWidth3 / 2.0d;
            if (dRelativeOnWidth > d2) {
                dRelativeOnWidth = d2;
            }
            d10 = dRelativeOnHeight3 / 2.0d;
            if (dRelativeOnHeight > d10) {
                dRelativeOnHeight = d10;
            }
            path.addRoundRect((float) dRelativeOnWidth2, (float) dRelativeOnHeight2, (float) (dRelativeOnWidth2 + dRelativeOnWidth3), (float) (dRelativeOnHeight2 + dRelativeOnHeight3), (float) dRelativeOnWidth, (float) dRelativeOnHeight, Path.Direction.CW);
        }
        ArrayList<C1415l> arrayList = new ArrayList<>();
        this.elements = arrayList;
        arrayList.add(new C1415l(3, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth2, dRelativeOnHeight2)}));
        double d11 = dRelativeOnWidth3 + dRelativeOnWidth2;
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d11, dRelativeOnHeight2)}));
        double d12 = dRelativeOnHeight2 + dRelativeOnHeight3;
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(d11, d12)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth2, d12)}));
        this.elements.add(new C1415l(4, new com.abedelazizshe.lightcompressorlibrary.config.b[]{new com.abedelazizshe.lightcompressorlibrary.config.b(dRelativeOnWidth2, dRelativeOnHeight2)}));
        return path;
    }
}
