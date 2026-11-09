package Ca;

import android.content.Context;
import android.util.Log;
import com.facebook.react.soloader.OpenSourceMergedSoMapping;
import com.facebook.soloader.SoLoader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1345a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f1346b;

    public static final void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (f1346b) {
            return;
        }
        synchronized (f1345a) {
            if (f1346b) {
                return;
            }
            try {
                Context applicationContext = context.getApplicationContext();
                OpenSourceMergedSoMapping openSourceMergedSoMapping = OpenSourceMergedSoMapping.INSTANCE;
                boolean z3 = SoLoader.f21853a;
                synchronized (SoLoader.class) {
                    SoLoader.f21867o = openSourceMergedSoMapping;
                }
                SoLoader.init(applicationContext, 0);
            } catch (Throwable th) {
                try {
                    Log.e("ReactSoLoaderInit", "SoLoader.init failed", th);
                } catch (Throwable th2) {
                    f1346b = true;
                    throw th2;
                }
            }
            f1346b = true;
        }
    }
}
