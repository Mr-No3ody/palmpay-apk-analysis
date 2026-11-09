package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15717b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f15719d;

    public d(Context context, XmlResourceParser xmlResourceParser) {
        this.f15718c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.State);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == p.State_android_id) {
                this.f15716a = typedArrayObtainStyledAttributes.getResourceId(index, this.f15716a);
            } else if (index == p.State_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f15718c);
                this.f15718c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f15719d = mVar;
                    mVar.e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
