package p318v1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f43058a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i7) {
        super(i7);
        this.f43058a = eVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i7 = ((ByteArrayOutputStream) this).count;
        if (i7 > 0 && ((ByteArrayOutputStream) this).buf[i7 - 1] == 13) {
            i7--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i7, this.f43058a.f43060b.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
