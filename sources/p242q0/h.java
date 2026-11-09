package p242q0;

import android.system.ErrnoException;
import android.system.Os;
import androidx.annotation.DoNotInline;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    @DoNotInline
    public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    @DoNotInline
    public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
        return Os.dup(fileDescriptor);
    }

    @DoNotInline
    public static long c(FileDescriptor fileDescriptor, long j6, int i7) throws ErrnoException {
        return Os.lseek(fileDescriptor, j6, i7);
    }
}
