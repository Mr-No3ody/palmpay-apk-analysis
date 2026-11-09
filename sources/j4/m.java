package j4;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class m {
    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final n invoke() {
        n nVar;
        n nVar2 = n.f38301b;
        if (nVar2 != null) {
            return nVar2;
        }
        synchronized (n.f38302c) {
            nVar = n.f38301b;
            if (nVar == null) {
                nVar = new n();
                n.f38301b = nVar;
            }
        }
        return nVar;
    }

    private m() {
    }
}
