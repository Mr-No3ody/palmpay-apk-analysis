package X2;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedImage f10995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CloseableReference f10996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f10997c;

    public b(top.zibin.luban.io.a aVar) {
        ArrayList arrayList;
        AnimatedImage animatedImage = (AnimatedImage) aVar.f42645b;
        animatedImage.getClass();
        this.f10995a = animatedImage;
        this.f10996b = CloseableReference.c((CloseableReference) aVar.f42646c);
        ArrayList arrayList2 = (ArrayList) aVar.f42647d;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(CloseableReference.c((CloseableReference) it.next()));
            }
            arrayList = arrayList3;
        }
        this.f10997c = arrayList;
    }
}
