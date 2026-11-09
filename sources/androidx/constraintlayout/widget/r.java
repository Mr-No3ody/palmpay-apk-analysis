package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15862b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15863c;

    public r(Context context, XmlResourceParser xmlResourceParser) {
        this.f15863c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == p.State_android_id) {
                this.f15861a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15861a);
            } else if (index == p.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15863c);
                this.f15863c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
