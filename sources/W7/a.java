package W7;

import com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements NamingAwareEventType {
    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventName() {
        return "topDidAppear";
    }

    @Override // com.swmansion.rnscreens.gamma.common.event.NamingAwareEventType
    @NotNull
    public String getEventRegistrationName() {
        return "onDidAppear";
    }

    private a() {
    }
}
