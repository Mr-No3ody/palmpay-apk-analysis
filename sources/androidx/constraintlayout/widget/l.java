package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final SparseIntArray f15835o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f15837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f15846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f15847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f15849n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15835o = sparseIntArray;
        sparseIntArray.append(p.Transform_android_rotation, 1);
        sparseIntArray.append(p.Transform_android_rotationX, 2);
        sparseIntArray.append(p.Transform_android_rotationY, 3);
        sparseIntArray.append(p.Transform_android_scaleX, 4);
        sparseIntArray.append(p.Transform_android_scaleY, 5);
        sparseIntArray.append(p.Transform_android_transformPivotX, 6);
        sparseIntArray.append(p.Transform_android_transformPivotY, 7);
        sparseIntArray.append(p.Transform_android_translationX, 8);
        sparseIntArray.append(p.Transform_android_translationY, 9);
        sparseIntArray.append(p.Transform_android_translationZ, 10);
        sparseIntArray.append(p.Transform_android_elevation, 11);
        sparseIntArray.append(p.Transform_transformPivotTarget, 12);
    }

    public final void a(l lVar) {
        this.f15836a = lVar.f15836a;
        this.f15837b = lVar.f15837b;
        this.f15838c = lVar.f15838c;
        this.f15839d = lVar.f15839d;
        this.f15840e = lVar.f15840e;
        this.f15841f = lVar.f15841f;
        this.f15842g = lVar.f15842g;
        this.f15843h = lVar.f15843h;
        this.f15844i = lVar.f15844i;
        this.f15845j = lVar.f15845j;
        this.f15846k = lVar.f15846k;
        this.f15847l = lVar.f15847l;
        this.f15848m = lVar.f15848m;
        this.f15849n = lVar.f15849n;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.Transform);
        this.f15836a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            switch (f15835o.get(index)) {
                case 1:
                    this.f15837b = typedArrayObtainStyledAttributes.getFloat(index, this.f15837b);
                    break;
                case 2:
                    this.f15838c = typedArrayObtainStyledAttributes.getFloat(index, this.f15838c);
                    break;
                case 3:
                    this.f15839d = typedArrayObtainStyledAttributes.getFloat(index, this.f15839d);
                    break;
                case 4:
                    this.f15840e = typedArrayObtainStyledAttributes.getFloat(index, this.f15840e);
                    break;
                case 5:
                    this.f15841f = typedArrayObtainStyledAttributes.getFloat(index, this.f15841f);
                    break;
                case 6:
                    this.f15842g = typedArrayObtainStyledAttributes.getDimension(index, this.f15842g);
                    break;
                case 7:
                    this.f15843h = typedArrayObtainStyledAttributes.getDimension(index, this.f15843h);
                    break;
                case 8:
                    this.f15845j = typedArrayObtainStyledAttributes.getDimension(index, this.f15845j);
                    break;
                case 9:
                    this.f15846k = typedArrayObtainStyledAttributes.getDimension(index, this.f15846k);
                    break;
                case 10:
                    this.f15847l = typedArrayObtainStyledAttributes.getDimension(index, this.f15847l);
                    break;
                case 11:
                    this.f15848m = true;
                    this.f15849n = typedArrayObtainStyledAttributes.getDimension(index, this.f15849n);
                    break;
                case 12:
                    this.f15844i = m.o(typedArrayObtainStyledAttributes, index, this.f15844i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
