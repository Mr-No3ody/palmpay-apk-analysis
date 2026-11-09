package p178m0;

import androidx.datastore.preferences.protobuf.C1160z1;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p135j0.C1767a;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final f readFrom(@NotNull InputStream input) throws C1767a {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            f fVarP = f.p(input);
            Intrinsics.checkNotNullExpressionValue(fVarP, "{\n                Prefer…From(input)\n            }");
            return fVarP;
        } catch (C1160z1 e10) {
            Intrinsics.checkNotNullParameter("Unable to parse preferences proto.", "message");
            throw new C1767a("Unable to parse preferences proto.", e10);
        }
    }

    private b() {
    }
}
