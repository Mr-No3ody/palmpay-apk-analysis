package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15868e;

    public s(Context context, XmlResourceParser xmlResourceParser) {
        this.f15864a = Float.NaN;
        this.f15865b = Float.NaN;
        this.f15866c = Float.NaN;
        this.f15867d = Float.NaN;
        this.f15868e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == p.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15868e);
                this.f15868e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == p.Variant_region_heightLessThan) {
                this.f15867d = typedArrayObtainStyledAttributes.getDimension(index, this.f15867d);
            } else if (index == p.Variant_region_heightMoreThan) {
                this.f15865b = typedArrayObtainStyledAttributes.getDimension(index, this.f15865b);
            } else if (index == p.Variant_region_widthLessThan) {
                this.f15866c = typedArrayObtainStyledAttributes.getDimension(index, this.f15866c);
            } else if (index == p.Variant_region_widthMoreThan) {
                this.f15864a = typedArrayObtainStyledAttributes.getDimension(index, this.f15864a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f10, float f11) {
        float f12 = this.f15864a;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f15865b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f15866c;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        float f15 = this.f15867d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
