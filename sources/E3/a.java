package E3;

import com.facebook.soloader.observer.Observer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f2210a = new AtomicReference();

    public static void a(Throwable th) {
        Observer[] observerArr = (Observer[]) f2210a.get();
        if (observerArr != null) {
            for (Observer observer : observerArr) {
                observer.onSoFileLoaderLoadEnd(th);
            }
        }
    }
}
