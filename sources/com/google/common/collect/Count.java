package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class Count implements Serializable {
    private int value;

    public Count(int i7) {
        this.value = i7;
    }

    public void add(int i7) {
        this.value += i7;
    }

    public int addAndGet(int i7) {
        int i10 = this.value + i7;
        this.value = i10;
        return i10;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof Count) && ((Count) obj).value == this.value;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int i7) {
        int i10 = this.value;
        this.value = i7;
        return i10;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int i7) {
        this.value = i7;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}
