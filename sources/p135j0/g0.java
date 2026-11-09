package p135j0;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f38044b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(j0 j0Var, int i7) {
        super(0);
        this.f38043a = i7;
        this.f38044b = j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorOpen;
        switch (this.f38043a) {
            case 0:
                j0 j0Var = this.f38044b;
                File file = new File(j0Var.f38068b.getAbsolutePath() + j0Var.f38071e);
                j0.a(j0Var, file);
                return file;
            case 1:
                System.loadLibrary("datastore_shared_counter");
                g0 produceFile = new g0(this.f38044b, 0);
                Intrinsics.checkNotNullParameter(produceFile, "produceFile");
                try {
                    parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) produceFile.invoke(), 939524096);
                    try {
                        int fd2 = parcelFileDescriptorOpen.getFd();
                        NativeSharedCounter nativeSharedCounter = p0.f38116b;
                        if (nativeSharedCounter.nativeTruncateFile(fd2) != 0) {
                            throw new IOException("Failed to truncate counter file");
                        }
                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd2);
                        if (jNativeCreateSharedCounter < 0) {
                            throw new IOException("Failed to mmap counter file");
                        }
                        p0 p0Var = new p0(jNativeCreateSharedCounter);
                        parcelFileDescriptorOpen.close();
                        return p0Var;
                    } catch (Throwable th) {
                        th = th;
                        if (parcelFileDescriptorOpen != null) {
                            parcelFileDescriptorOpen.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    parcelFileDescriptorOpen = null;
                }
                break;
            default:
                j0 j0Var2 = this.f38044b;
                File file2 = new File(j0Var2.f38068b.getAbsolutePath() + j0Var2.f38070d);
                j0.a(j0Var2, file2);
                return file2;
        }
    }
}
