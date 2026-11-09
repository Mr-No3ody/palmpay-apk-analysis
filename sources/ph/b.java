package ph;

import java.io.InputStream;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import top.zibin.luban.InputStreamProvider;
import top.zibin.luban.io.f;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b implements InputStreamProvider {
    public abstract InputStream a();

    @Override // top.zibin.luban.InputStreamProvider
    public final void close() {
        top.zibin.luban.io.a aVarF = top.zibin.luban.io.a.f();
        HashSet<String> hashSet = (HashSet) aVarF.f42645b;
        for (String str : hashSet) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVarF.f42646c;
            top.zibin.luban.io.b bVar = (top.zibin.luban.io.b) concurrentHashMap.get(str);
            if (bVar != null) {
                try {
                    bVar.close();
                } catch (Exception unused) {
                }
            }
            concurrentHashMap.remove(str);
        }
        hashSet.clear();
        ((f) aVarF.f42647d).clearMemory();
    }

    @Override // top.zibin.luban.InputStreamProvider
    public final InputStream open() {
        return a();
    }
}
