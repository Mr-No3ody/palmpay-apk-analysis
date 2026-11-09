package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f17216b;

    public u0(int i7) {
        this.f17215a = i7;
        switch (i7) {
            case 1:
                this.f17216b = new StringBuilder();
                break;
            default:
                this.f17216b = new StringBuilder(128);
                break;
        }
    }

    public final void a() {
        switch (this.f17215a) {
            case 0:
                StringBuilder sb2 = this.f17216b;
                if (sb2.length() > 0) {
                    sb2.toString();
                    sb2.delete(0, sb2.length());
                }
                break;
            default:
                StringBuilder sb3 = this.f17216b;
                if (sb3.length() > 0) {
                    sb3.toString();
                    sb3.delete(0, sb3.length());
                }
                break;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f17215a) {
            case 0:
                a();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f17215a) {
            case 0:
                a();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i7, int i10) {
        switch (this.f17215a) {
            case 0:
                for (int i11 = 0; i11 < i10; i11++) {
                    char c6 = cArr[i7 + i11];
                    if (c6 == '\n') {
                        a();
                    } else {
                        this.f17216b.append(c6);
                    }
                }
                break;
            default:
                for (int i12 = 0; i12 < i10; i12++) {
                    char c10 = cArr[i7 + i12];
                    if (c10 == '\n') {
                        a();
                    } else {
                        this.f17216b.append(c10);
                    }
                }
                break;
        }
    }
}
