package p280s6;

import android.content.Context;
import com.palmpay.lib.liveness.lang.LanguageManager$Companion;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import p232p6.p;
import p292t6.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f42050b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CountDownLatch f42049a = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f42051c = new AtomicReference(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f42052d = new Object();

    public static void a() {
        p pVar = p.f41234a;
        if (p.f41246m) {
            Context contextF = p.f();
            if (f42050b) {
                String str = (String) f42051c.getAndSet(null);
                if (str != null) {
                    int i7 = a.f42345a;
                    a.a("LazyLoad.init: Already initialized. Applying recently set target locale '" + str + "'.");
                    a.f42044a.setLocale$lib_liveness_release(contextF, str);
                    return;
                }
                return;
            }
            synchronized (f42052d) {
                if (f42050b) {
                    String str2 = (String) f42051c.getAndSet(null);
                    if (str2 != null) {
                        int i10 = a.f42345a;
                        a.a("LazyLoad.init (sync): Manager was initialized by another thread. Applying pending target locale '" + str2 + "'.");
                        a.f42044a.setLocale$lib_liveness_release(contextF, str2);
                    }
                    return;
                }
                a.a("LazyLoad: Initializing LanguageManager with default settings...");
                LanguageManager$Companion languageManager$Companion = a.f42044a;
                LanguageManager$Companion.init$lib_liveness_release$default(languageManager$Companion, contextF, null, 2, null);
                f42050b = true;
                f42049a.countDown();
                a.a("LazyLoad: LanguageManager initialized with default. Latch counted down.");
                String str3 = (String) f42051c.getAndSet(null);
                if (str3 != null) {
                    a.a("LazyLoad.init (sync): Applying pending target locale '" + str3 + "' after default initialization.");
                    languageManager$Companion.setLocale$lib_liveness_release(contextF, str3);
                }
                Unit unit = Unit.f38893a;
            }
        }
    }
}
