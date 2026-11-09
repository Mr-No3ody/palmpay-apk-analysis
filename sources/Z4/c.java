package Z4;

import android.app.Application;
import android.content.Context;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.WeakHashMap;
import p198n5.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.growingio.android.sdk.c {
    public c(Application application) {
        this.f23194a = false;
        if (application == null) {
            this.f23194a = false;
            h.c("GrowingIO Track SDK", "GrowingIO Track SDK is UNINITIALIZED, please initialized before use API", new Object[0]);
            return;
        }
        super.b(application);
        WeakHashMap weakHashMap = p021b5.d.f18781a;
        p021b5.d dVar = p021b5.c.f18780a;
        dVar.getClass();
        p279s5.b bVar = p279s5.a.f42018a;
        bVar.r(dVar);
        a5.a aVar = new a5.a();
        bVar.r(aVar);
        p305u5.c.f42706a.r(aVar);
        b bVar2 = (b) ((HashMap) p279s5.d.b().f42026c).get(b.class);
        if (bVar2 != null) {
            e5.c.f36164a.w(new d(bVar2.f11510a));
        }
        p152k5.f fVar = p152k5.e.f38687a;
        fVar.getClass();
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar3 = new com.transsnet.adsdk.widgets.banner.bannerview.b(fVar, 14);
        E2.a aVar2 = fVar.f38689b;
        if (((FileLock) aVar2.f2187f) == null) {
            try {
                if (((FileOutputStream) aVar2.f2185d) == null || ((FileChannel) aVar2.f2186e) == null) {
                    FileOutputStream fileOutputStreamOpenFileOutput = ((Context) aVar2.f2183b).openFileOutput((String) aVar2.f2184c, 0);
                    aVar2.f2185d = fileOutputStreamOpenFileOutput;
                    aVar2.f2186e = fileOutputStreamOpenFileOutput.getChannel();
                }
                aVar2.f2187f = ((FileChannel) aVar2.f2186e).lock();
                bVar3.run();
            } catch (Exception unused) {
            } finally {
                aVar2.release();
            }
        }
        com.growingio.android.sdk.d.f23196c = true;
        this.f23194a = true;
    }
}
