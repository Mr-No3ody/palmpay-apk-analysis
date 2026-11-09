package p198n5;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractCollection implements Queue, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object[] f39840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f39841b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f39842c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient boolean f39843d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f39844e;

    public d(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        this.f39840a = new Object[i7];
        this.f39844e = i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Attempted to add null object to queue");
        }
        int size = size();
        int i7 = this.f39844e;
        if (size == i7) {
            remove();
        }
        int i10 = this.f39842c;
        int i11 = i10 + 1;
        this.f39842c = i11;
        this.f39840a[i10] = obj;
        if (i11 >= i7) {
            this.f39842c = 0;
        }
        if (this.f39842c == this.f39841b) {
            this.f39843d = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f39843d = false;
        this.f39841b = 0;
        this.f39842c = 0;
        Arrays.fill(this.f39840a, (Object) null);
    }

    @Override // java.util.Queue
    public final Object element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f39840a[this.f39841b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        int i7 = this.f39841b;
        Object[] objArr = this.f39840a;
        Object obj = objArr[i7];
        if (obj != null) {
            int i10 = i7 + 1;
            this.f39841b = i10;
            objArr[i7] = null;
            if (i10 >= this.f39844e) {
                this.f39841b = 0;
            }
            this.f39843d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i7 = this.f39842c;
        int i10 = this.f39841b;
        int i11 = this.f39844e;
        if (i7 < i10) {
            return (i11 - i10) + i7;
        }
        if (i7 != i10) {
            return i7 - i10;
        }
        if (this.f39843d) {
            return i11;
        }
        return 0;
    }
}
