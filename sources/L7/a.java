package L7;

import android.os.Trace;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import androidx.core.os.j;
import androidx.emoji2.text.i;
import e5.c;
import e5.d;
import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p152k5.e;
import p190mf.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5557a;

    public /* synthetic */ a(int i7) {
        this.f5557a = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5557a) {
            case 0:
                System.exit(0);
                return;
            case 1:
                try {
                    WebStorage.getInstance().deleteAllData();
                    CookieManager.getInstance().removeAllCookies(null);
                    CookieManager.getInstance().flush();
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            case 2:
                try {
                    int i7 = j.f16100a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (i.d()) {
                        i.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i10 = j.f16100a;
                    Trace.endSection();
                }
            case 3:
                return;
            case 4:
                for (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor : new ArrayList(o.f39703d.keySet())) {
                    if (scheduledThreadPoolExecutor.isShutdown()) {
                        o.f39703d.remove(scheduledThreadPoolExecutor);
                    } else {
                        scheduledThreadPoolExecutor.purge();
                    }
                }
                return;
            default:
                e.f38687a.f38692e = System.currentTimeMillis();
                d dVar = c.f36164a;
                dVar.f36166d.b();
                dVar.y(new p094g5.a());
                dVar.f36166d.b();
                return;
        }
    }

    public String toString() {
        switch (this.f5557a) {
            case 3:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }

    private final void a() {
    }
}
