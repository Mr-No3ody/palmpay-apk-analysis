package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
class MultiReader extends Reader {

    @CheckForNull
    private Reader current;
    private final Iterator<? extends CharSource> it;

    public MultiReader(Iterator<? extends CharSource> it) throws IOException {
        this.it = it;
        advance();
    }

    private void advance() throws IOException {
        close();
        if (this.it.hasNext()) {
            this.current = this.it.next().openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.current;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.current = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i7, int i10) throws IOException {
        Preconditions.checkNotNull(cArr);
        Reader reader = this.current;
        if (reader == null) {
            return -1;
        }
        int i11 = reader.read(cArr, i7, i10);
        if (i11 != -1) {
            return i11;
        }
        advance();
        return read(cArr, i7, i10);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.current;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j6) throws IOException {
        Preconditions.checkArgument(j6 >= 0, "n is negative");
        if (j6 > 0) {
            while (true) {
                Reader reader = this.current;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j6);
                if (jSkip > 0) {
                    return jSkip;
                }
                advance();
            }
        }
        return 0L;
    }
}
