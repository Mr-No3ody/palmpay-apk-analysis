package C0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class L {
    public /* synthetic */ L(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public final K findStartDestination(@NotNull N n10) {
        Intrinsics.checkNotNullParameter(n10, "<this>");
        Sequence sequenceB = Sf.m.b(n10.g(n10.f967v, true), C0111c.f1013o);
        Intrinsics.checkNotNullParameter(sequenceB, "<this>");
        Iterator it = sequenceB.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (K) next;
    }

    private L() {
    }
}
