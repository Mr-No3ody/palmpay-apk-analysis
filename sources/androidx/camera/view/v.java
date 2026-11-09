package androidx.camera.view;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.camera.video.internal.c f15015b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.camera.video.internal.c cVar, Context context) {
        super(context);
        this.f15015b = cVar;
        this.f15014a = -1;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i7) {
        int i10;
        ArrayList<w> arrayList;
        if (i7 == -1) {
            return;
        }
        if (i7 >= 315 || i7 < 45) {
            i10 = 0;
        } else if (i7 >= 225) {
            i10 = 1;
        } else {
            i10 = i7 >= 135 ? 2 : 3;
        }
        if (this.f15014a != i10) {
            this.f15014a = i10;
            synchronized (this.f15015b.f14621b) {
                arrayList = new ArrayList(((HashMap) this.f15015b.f14622c).values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            for (w wVar : arrayList) {
                wVar.getClass();
                wVar.f15017b.execute(new B3.a(wVar, i10, 10));
            }
        }
    }
}
