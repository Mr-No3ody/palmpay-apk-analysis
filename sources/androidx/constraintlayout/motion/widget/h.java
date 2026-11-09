package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1029b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15345e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15346f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15347g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15348h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f15349i = Float.NaN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15350j = Float.NaN;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15351k = Float.NaN;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15352l = Float.NaN;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15353m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15354n = Float.NaN;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f15355o = Float.NaN;

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC1029b clone() {
        h hVar = new h();
        hVar.f15322a = this.f15322a;
        hVar.f15323b = this.f15323b;
        hVar.f15324c = this.f15324c;
        hVar.f15325d = this.f15325d;
        hVar.f15346f = this.f15346f;
        hVar.f15347g = this.f15347g;
        hVar.f15348h = this.f15348h;
        hVar.f15349i = this.f15349i;
        hVar.f15350j = Float.NaN;
        hVar.f15351k = this.f15351k;
        hVar.f15352l = this.f15352l;
        hVar.f15354n = this.f15354n;
        hVar.f15355o = this.f15355o;
        return hVar;
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.p.KeyPosition);
        SparseIntArray sparseIntArray = g.f15344a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            SparseIntArray sparseIntArray2 = g.f15344a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15323b);
                        this.f15323b = resourceId;
                        if (resourceId == -1) {
                            this.f15324c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f15324c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f15323b = typedArrayObtainStyledAttributes.getResourceId(index, this.f15323b);
                    }
                    break;
                case 2:
                    this.f15322a = typedArrayObtainStyledAttributes.getInt(index, this.f15322a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f15346f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f15346f = O.e.f6488d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f15345e = typedArrayObtainStyledAttributes.getInteger(index, this.f15345e);
                    break;
                case 5:
                    this.f15348h = typedArrayObtainStyledAttributes.getInt(index, this.f15348h);
                    break;
                case 6:
                    this.f15351k = typedArrayObtainStyledAttributes.getFloat(index, this.f15351k);
                    break;
                case 7:
                    this.f15352l = typedArrayObtainStyledAttributes.getFloat(index, this.f15352l);
                    break;
                case 8:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f15350j);
                    this.f15349i = f10;
                    this.f15350j = f10;
                    break;
                case 9:
                    this.f15353m = typedArrayObtainStyledAttributes.getInt(index, this.f15353m);
                    break;
                case 10:
                    this.f15347g = typedArrayObtainStyledAttributes.getInt(index, this.f15347g);
                    break;
                case 11:
                    this.f15349i = typedArrayObtainStyledAttributes.getFloat(index, this.f15349i);
                    break;
                case 12:
                    this.f15350j = typedArrayObtainStyledAttributes.getFloat(index, this.f15350j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f15322a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }

    public final void f(Object obj, String str) {
        switch (str) {
            case "transitionEasing":
                this.f15346f = obj.toString();
                break;
            case "percentWidth":
                this.f15349i = AbstractC1029b.e((Number) obj);
                break;
            case "percentHeight":
                this.f15350j = AbstractC1029b.e((Number) obj);
                break;
            case "drawPath":
                Number number = (Number) obj;
                this.f15348h = number instanceof Integer ? ((Integer) number).intValue() : Integer.parseInt(number.toString());
                break;
            case "sizePercent":
                float fE = AbstractC1029b.e((Number) obj);
                this.f15349i = fE;
                this.f15350j = fE;
                break;
            case "percentX":
                this.f15351k = AbstractC1029b.e((Number) obj);
                break;
            case "percentY":
                this.f15352l = AbstractC1029b.e((Number) obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.AbstractC1029b
    public final void b(HashSet hashSet) {
    }
}
