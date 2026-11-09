package Pa;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class V {
    public /* synthetic */ V(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @Nullable
    public final Boolean convertToBoolean(@Nullable Object obj) {
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return obj instanceof String ? Boolean.valueOf(Boolean.parseBoolean((String) obj)) : Boolean.FALSE;
    }

    @JvmStatic
    public final boolean isInWhiteList(@Nullable String str) {
        Set set = W.f7053b;
        if (str == null || str.length() <= 0) {
            str = null;
        }
        return CollectionsKt.A(set, str);
    }

    private V() {
    }
}
