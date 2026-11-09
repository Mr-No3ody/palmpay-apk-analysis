package p135j0;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class S extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f37981a = new S(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File file = (File) obj;
        Intrinsics.checkNotNullParameter(file, "it");
        Intrinsics.checkNotNullParameter(file, "file");
        String filePath = file.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new v0(filePath);
    }
}
