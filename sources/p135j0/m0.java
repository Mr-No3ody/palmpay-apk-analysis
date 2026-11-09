package p135j0;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends FileObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l0 f38101b = new l0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f38102c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f38103d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f38104a;

    public m0(String str) {
        super(str, 128);
        this.f38104a = new CopyOnWriteArrayList();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        Iterator it = this.f38104a.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(str);
        }
    }
}
