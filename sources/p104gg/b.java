package p104gg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37247a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList missingFields, String str, b bVar) {
        super(str, bVar);
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        this.f37247a = missingFields;
    }
}
