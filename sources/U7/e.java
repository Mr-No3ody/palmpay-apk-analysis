package U7;

import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements NamingAwareEventType {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventName() {
        return "topDismiss";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventRegistrationName() {
        return "onDismiss";
    }

    private e() {
    }
}
