package p136j2;

import android.content.Context;
import androidx.camera.video.internal.c;
import org.sufficientlysecure.htmltextview.m;
import p121i2.d;
import p121i2.e;
import p166l2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f38181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f38182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f38183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f38184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f38185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f38186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f38187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f38188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f38189k;

    public b(c cVar) {
        d dVar;
        e eVar;
        a aVar;
        Context context = (Context) cVar.f14622c;
        this.f38189k = context;
        a aVar2 = (a) cVar.f14621b;
        if (!((aVar2 == null && context == null) ? false : true)) {
            throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
        }
        if (aVar2 == null && context != null) {
            cVar.f14621b = new a(this);
        }
        this.f38179a = 1;
        this.f38180b = "image_cache";
        a aVar3 = (a) cVar.f14621b;
        aVar3.getClass();
        this.f38181c = aVar3;
        this.f38182d = 41943040L;
        this.f38183e = 10485760L;
        this.f38184f = 2097152L;
        this.f38185g = (m) cVar.f14623d;
        synchronized (d.class) {
            try {
                if (d.f37413b == null) {
                    d.f37413b = new d((byte) 0, 0);
                }
                dVar = d.f37413b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f38186h = dVar;
        synchronized (e.class) {
            try {
                if (e.f37415b == null) {
                    e.f37415b = new e(0);
                }
                eVar = e.f37415b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f38187i = eVar;
        synchronized (a.class) {
            try {
                if (a.f39265b == null) {
                    a.f39265b = new a(0);
                }
                aVar = a.f39265b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f38188j = aVar;
    }
}
