package okhttp3;

import java.io.IOException;
import okio.BufferedSource;
import okio.Source;
import retrofit2.C2000s;

/* JADX INFO: renamed from: okhttp3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1923c extends Pg.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40709a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f40710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1923c(C2000s c2000s, BufferedSource bufferedSource) {
        super(bufferedSource);
        this.f40710b = c2000s;
    }

    @Override // Pg.o, okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f40709a) {
            case 0:
                ((C1924d) this.f40710b).f40711a.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // Pg.o, okio.Source
    public long read(Pg.k kVar, long j6) throws IOException {
        switch (this.f40709a) {
            case 1:
                try {
                    return super.read(kVar, j6);
                } catch (IOException e10) {
                    ((C2000s) this.f40710b).f41952c = e10;
                    throw e10;
                }
            default:
                return super.read(kVar, j6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1923c(Source source, C1924d c1924d) {
        super(source);
        this.f40710b = c1924d;
    }
}
