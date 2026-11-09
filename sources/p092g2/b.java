package p092g2;

import android.os.Handler;
import android.os.Looper;
import com.didiglobal.booster.instrument.NamedThreadFactory;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f36837a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f36838b = new a(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), NamedThreadFactory.newInstance("\u200bcom.didi.drouter.utils.RouterExecutor$RouterThreadExecutor"));
}
