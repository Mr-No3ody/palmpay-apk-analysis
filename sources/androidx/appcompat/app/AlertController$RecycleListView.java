package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12077b;

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p241q.j.RecycleListView);
        this.f12077b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p241q.j.RecycleListView_paddingBottomNoButtons, -1);
        this.f12076a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(p241q.j.RecycleListView_paddingTopNoTitle, -1);
    }
}
