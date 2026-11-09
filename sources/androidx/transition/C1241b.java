package androidx.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1241b extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1241b(String str, int i7, Class cls) {
        super(cls, str);
        this.f18017a = i7;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f18017a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return Float.valueOf(k0.f18070a.d((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f18017a) {
            case 0:
                C1245f c1245f = (C1245f) obj;
                PointF pointF = (PointF) obj2;
                c1245f.getClass();
                c1245f.f18038a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c1245f.f18039b = iRound;
                int i7 = c1245f.f18043f + 1;
                c1245f.f18043f = i7;
                if (i7 == c1245f.f18044g) {
                    k0.a(c1245f.f18042e, c1245f.f18038a, iRound, c1245f.f18040c, c1245f.f18041d);
                    c1245f.f18043f = 0;
                    c1245f.f18044g = 0;
                }
                break;
            case 1:
                C1245f c1245f2 = (C1245f) obj;
                PointF pointF2 = (PointF) obj2;
                c1245f2.getClass();
                c1245f2.f18040c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c1245f2.f18041d = iRound2;
                int i10 = c1245f2.f18044g + 1;
                c1245f2.f18044g = i10;
                if (c1245f2.f18043f == i10) {
                    k0.a(c1245f2.f18042e, c1245f2.f18038a, c1245f2.f18039b, c1245f2.f18040c, iRound2);
                    c1245f2.f18043f = 0;
                    c1245f2.f18044g = 0;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                k0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                k0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                k0.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                K.b((ImageView) obj, (Matrix) obj2);
                break;
            case 6:
                C1252m c1252m = (C1252m) obj;
                float[] fArr = (float[]) obj2;
                c1252m.getClass();
                System.arraycopy(fArr, 0, c1252m.f18083c, 0, fArr.length);
                c1252m.a();
                break;
            case 7:
                C1252m c1252m2 = (C1252m) obj;
                PointF pointF6 = (PointF) obj2;
                c1252m2.getClass();
                c1252m2.f18084d = pointF6.x;
                c1252m2.f18085e = pointF6.y;
                c1252m2.a();
                break;
            case 8:
                k0.b((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
