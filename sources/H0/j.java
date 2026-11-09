package H0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3572d;

    public j(int i7, int i10, long j6, long j10) {
        this.f3569a = i7;
        this.f3570b = i10;
        this.f3571c = j6;
        this.f3572d = j10;
    }

    public static j a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3569a);
            dataOutputStream.writeInt(this.f3570b);
            dataOutputStream.writeLong(this.f3571c);
            dataOutputStream.writeLong(this.f3572d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f3570b == jVar.f3570b && this.f3571c == jVar.f3571c && this.f3569a == jVar.f3569a && this.f3572d == jVar.f3572d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3570b), Long.valueOf(this.f3571c), Integer.valueOf(this.f3569a), Long.valueOf(this.f3572d));
    }
}
