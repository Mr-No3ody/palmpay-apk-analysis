package androidx.webkit.internal;

import androidx.webkit.StartUpLocation;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public final class s implements StartUpLocation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f18329a;

    public s(Throwable th) {
        this.f18329a = th;
    }

    @Override // androidx.webkit.StartUpLocation
    public final String getStackInformation() {
        StringWriter stringWriter = new StringWriter();
        this.f18329a.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
