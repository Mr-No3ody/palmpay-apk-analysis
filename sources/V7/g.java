package V7;

import M7.s;
import android.view.Menu;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.swmansion.rnscreens.gamma.tabs.TabScreenFragment;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import java.util.ArrayDeque;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10099d;

    public g(boolean z3, boolean z8, boolean z10, String str) {
        this.f10096a = z3;
        this.f10097b = z8;
        this.f10098c = z10;
        this.f10099d = str;
    }

    public synchronized void a(GL10 gl10) {
        if (!this.f10097b) {
            if (!this.f10096a) {
                this.f10096a = true;
            }
            this.f10098c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
            notifyAll();
            this.f10097b = true;
        }
    }

    public void b() {
        if (this.f10098c) {
            return;
        }
        try {
            this.f10098c = true;
            while (true) {
                ArrayDeque arrayDeque = (ArrayDeque) this.f10099d;
                if (arrayDeque.isEmpty()) {
                    break;
                }
                if (!(this.f10097b || !this.f10096a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f10098c = false;
        }
    }

    public void c() {
        this.f10097b = true;
        this.f10098c = true;
    }

    public void d() {
        if (this.f10096a) {
            return;
        }
        this.f10096a = true;
        ((TabsHost) this.f10099d).post(new s(this, 24));
    }

    public void e() {
        int i7 = 0;
        this.f10096a = false;
        boolean z3 = this.f10097b;
        TabsHost tabsHost = (TabsHost) this.f10099d;
        if (z3) {
            this.f10097b = false;
            TabsHost.d(tabsHost);
        }
        if (this.f10098c) {
            this.f10098c = false;
            TabsHost.b(tabsHost);
            p1.d dVar = tabsHost.f25466w;
            for (Object obj : (ArrayList) dVar.f41179c) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    C1850q.k();
                    throw null;
                }
                Menu menu = ((BottomNavigationView) dVar.f41178b).getMenu();
                Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
                dVar.j(menu.getItem(i7), ((TabScreenFragment) obj).f25437a);
                i7 = i10;
            }
        }
    }

    public synchronized void f(com.palmpay.image.webp.f fVar) {
        try {
            fVar.f23775b = true;
            if (((com.palmpay.image.webp.f) this.f10099d) == fVar) {
                this.f10099d = null;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }
}
