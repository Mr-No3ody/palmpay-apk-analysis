package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15834e;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.PropertySet);
        this.f15830a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == p.PropertySet_android_alpha) {
                this.f15833d = typedArrayObtainStyledAttributes.getFloat(index, this.f15833d);
            } else if (index == p.PropertySet_android_visibility) {
                int i10 = typedArrayObtainStyledAttributes.getInt(index, this.f15831b);
                this.f15831b = i10;
                this.f15831b = m.f15850g[i10];
            } else if (index == p.PropertySet_visibilityMode) {
                this.f15832c = typedArrayObtainStyledAttributes.getInt(index, this.f15832c);
            } else if (index == p.PropertySet_motionProgress) {
                this.f15834e = typedArrayObtainStyledAttributes.getFloat(index, this.f15834e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
