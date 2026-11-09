package W7;

import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements NamingAwareEventType {
    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventName() {
        return "topDidDisappear";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventRegistrationName() {
        return "onDidDisappear";
    }

    private c() {
    }
}
