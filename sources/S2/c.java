package S2;

import com.facebook.infer.annotation.PropagatesNullable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> copyMap(@PropagatesNullable Map<String, ? extends Object> map) {
        if (map != null) {
            return new ConcurrentHashMap(map);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public final d of(@Nullable Map<String, ? extends Object> map) {
        d dVar = new d();
        dVar.f8651a = map;
        return dVar;
    }

    private c() {
    }
}
