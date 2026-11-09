package p045d3;

import android.app.ActivityManager;
import com.facebook.common.internal.Supplier;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Supplier {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f35505b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityManager f35506a;

    public f(ActivityManager activityManager) {
        this.f35506a = activityManager;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        int i7;
        int iMin = Math.min(this.f35506a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            i7 = 4194304;
        } else {
            i7 = iMin < 67108864 ? 6291456 : iMin / 4;
        }
        return new i(i7, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, Integer.MAX_VALUE, Integer.MAX_VALUE, f35505b);
    }
}
