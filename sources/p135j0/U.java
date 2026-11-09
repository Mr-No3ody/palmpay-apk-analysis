package p135j0;

import C0.C0127t;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class U implements Storage {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T f37982d = new T(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f37983e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f37984f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializer f37985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f37986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f37987c;

    public U(Serializer serializer, Function1 coordinatorProducer, Function0 produceFile) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(coordinatorProducer, "coordinatorProducer");
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        this.f37985a = serializer;
        this.f37986b = coordinatorProducer;
        this.f37987c = produceFile;
    }

    @Override // androidx.datastore.core.Storage
    public final StorageConnection createConnection() throws IOException {
        File file = ((File) this.f37987c.invoke()).getCanonicalFile();
        synchronized (f37984f) {
            String path = file.getAbsolutePath();
            LinkedHashSet linkedHashSet = f37983e;
            if (linkedHashSet.contains(path)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            Intrinsics.checkNotNullExpressionValue(path, "path");
            linkedHashSet.add(path);
        }
        Intrinsics.checkNotNullExpressionValue(file, "file");
        return new X(file, this.f37985a, (InterProcessCoordinator) this.f37986b.invoke(file), new C0127t(file, 15));
    }
}
