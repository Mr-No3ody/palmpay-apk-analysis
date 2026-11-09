package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f15721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f15725f;

    public e(Context context, XmlResourceParser xmlResourceParser) {
        this.f15720a = Float.NaN;
        this.f15721b = Float.NaN;
        this.f15722c = Float.NaN;
        this.f15723d = Float.NaN;
        this.f15724e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == p.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15724e);
                this.f15724e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f15725f = mVar;
                    mVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == p.Variant_region_heightLessThan) {
                this.f15723d = typedArrayObtainStyledAttributes.getDimension(index, this.f15723d);
            } else if (index == p.Variant_region_heightMoreThan) {
                this.f15721b = typedArrayObtainStyledAttributes.getDimension(index, this.f15721b);
            } else if (index == p.Variant_region_widthLessThan) {
                this.f15722c = typedArrayObtainStyledAttributes.getDimension(index, this.f15722c);
            } else if (index == p.Variant_region_widthMoreThan) {
                this.f15720a = typedArrayObtainStyledAttributes.getDimension(index, this.f15720a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean a(float f10, float f11) {
        float f12 = this.f15720a;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f15721b;
        if (!Float.isNaN(f13) && f11 < f13) {
            return false;
        }
        float f14 = this.f15722c;
        if (!Float.isNaN(f14) && f10 > f14) {
            return false;
        }
        float f15 = this.f15723d;
        return Float.isNaN(f15) || f11 <= f15;
    }
}
