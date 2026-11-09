package p104gg;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class d extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public d(int i7) {
        super(G.m(i7, "An unknown field for index "));
    }
}
