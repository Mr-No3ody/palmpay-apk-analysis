package okhttp3.internal.io;

import Pg.AbstractC0555b;
import Pg.C0558e;
import Pg.F;
import Pg.s;
import androidx.camera.video.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements FileSystem {
    @Override // okhttp3.internal.io.FileSystem
    public final Sink appendingSink(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Logger logger = s.f7375a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            return AbstractC0555b.h(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = s.f7375a;
            Intrinsics.checkNotNullParameter(file, "<this>");
            return AbstractC0555b.h(new FileOutputStream(file, true));
        }
    }

    @Override // okhttp3.internal.io.FileSystem
    public final void delete(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException(u.k(file, "failed to delete "));
        }
    }

    @Override // okhttp3.internal.io.FileSystem
    public final void deleteContents(File directory) throws IOException {
        Intrinsics.checkNotNullParameter(directory, "directory");
        File[] fileArrListFiles = directory.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException(u.k(directory, "not a readable directory: "));
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                Intrinsics.checkNotNullExpressionValue(file, "file");
                deleteContents(file);
            }
            if (!file.delete()) {
                throw new IOException(u.k(file, "failed to delete "));
            }
        }
    }

    @Override // okhttp3.internal.io.FileSystem
    public final boolean exists(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.exists();
    }

    @Override // okhttp3.internal.io.FileSystem
    public final void rename(File from, File to) throws IOException {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        delete(to);
        if (from.renameTo(to)) {
            return;
        }
        throw new IOException("failed to rename " + from + " to " + to);
    }

    @Override // okhttp3.internal.io.FileSystem
    public final Sink sink(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return AbstractC0555b.j(file);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return AbstractC0555b.j(file);
        }
    }

    @Override // okhttp3.internal.io.FileSystem
    public final long size(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.length();
    }

    @Override // okhttp3.internal.io.FileSystem
    public final Source source(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        Logger logger = s.f7375a;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C0558e(new FileInputStream(file), F.NONE);
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
