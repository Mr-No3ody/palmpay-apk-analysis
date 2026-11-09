package com.swmansion.rnscreens.stack.views;

import M7.y;
import com.google.firebase.perf.util.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/ChildrenDrawingOrderStrategy;", "", "", "LM7/y;", "Lcom/swmansion/rnscreens/ScreenStack;", "drawingOperations", "", "apply", "(Ljava/util/List;)V", "enable", "()V", "disable", "", Constants.ENABLE_DISABLE, "()Z", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChildrenDrawingOrderStrategy {
    void apply(@NotNull List<y> drawingOperations);

    void disable();

    void enable();

    boolean isEnabled();
}
