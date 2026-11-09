package Pa;

import android.content.Intent;
import com.transsnet.palmpay.core.base.BaseActivity;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Pa.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0526x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f7167a = new ConcurrentHashMap();

    public static final void a(BaseActivity from, Intent intent) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        f7167a.put(string, new WeakReference(from));
        intent.putExtra("pp_launch_finish_token", string);
        from.startActivity(intent);
    }
}
