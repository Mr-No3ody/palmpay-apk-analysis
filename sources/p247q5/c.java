package p247q5;

import F1.f;
import com.growingio.android.sdk.track.modelloader.ModelLoader;
import com.growingio.android.sdk.track.modelloader.ModelLoaderFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f41459a = new f(2);

    public final ModelLoader a(Class cls) {
        f fVar = this.f41459a;
        synchronized (fVar) {
            ModelLoader modelLoaderBuild = (ModelLoader) fVar.f2525b.get(cls);
            if (modelLoaderBuild == null) {
                synchronized (fVar) {
                    try {
                        Iterator it = fVar.f2526c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                modelLoaderBuild = null;
                                break;
                            }
                            b bVar = (b) it.next();
                            if (bVar.f41456a.isAssignableFrom(cls)) {
                                modelLoaderBuild = bVar.f41458c.build();
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (modelLoaderBuild == null) {
                return null;
            }
            fVar.f2525b.put(cls, modelLoaderBuild);
            return modelLoaderBuild;
        }
    }

    public final void b(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        f fVar = this.f41459a;
        synchronized (fVar) {
            ArrayList arrayList = fVar.f2526c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.f41456a.isAssignableFrom(cls) && bVar.f41457b.isAssignableFrom(cls2)) {
                    it.remove();
                }
            }
            arrayList.add(new b(cls, cls2, modelLoaderFactory));
            fVar.f2525b.clear();
        }
    }
}
