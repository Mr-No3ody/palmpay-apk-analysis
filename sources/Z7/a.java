package Z7;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Nullable
    public final b fromProp(@Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            return new b(readableMap.getBoolean(ViewProps.LEFT), readableMap.getBoolean(ViewProps.TOP), readableMap.getBoolean(ViewProps.RIGHT), readableMap.getBoolean(ViewProps.BOTTOM));
        }
        return null;
    }

    @NotNull
    public final b getZERO() {
        return b.f11565f;
    }

    private a() {
    }
}
