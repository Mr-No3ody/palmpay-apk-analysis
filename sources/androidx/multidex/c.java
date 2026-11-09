package androidx.multidex;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: loaded from: classes.dex */
public final class c implements FileFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17489a;

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        switch (this.f17489a) {
            case 0:
                return !file.getName().equals("MultiDex.lock");
            default:
                return file != null && file.getName().startsWith("drawable") && file.isDirectory();
        }
    }
}
