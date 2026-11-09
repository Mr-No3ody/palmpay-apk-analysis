package W7;

import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements NamingAwareEventType {
    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventName() {
        return "topWillDisappear";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventRegistrationName() {
        return "onWillDisappear";
    }

    private g() {
    }
}
