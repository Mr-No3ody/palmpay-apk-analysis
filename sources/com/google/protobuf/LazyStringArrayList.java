package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    @Deprecated
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List<Object> list;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteArrayListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, byte[] s3) {
            this.list.add(index, s3);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] get(int index) {
            return this.list.getByteArray(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] remove(int index) {
            String strRemove = this.list.remove(index);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public byte[] set(int index, byte[] s3) {
            Object andReturn = this.list.setAndReturn(index, s3);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(andReturn);
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteStringListView(LazyStringArrayList list) {
            this.list = list;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.list.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int index, ByteString s3) {
            this.list.add(index, s3);
            ((AbstractList) this).modCount++;
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString get(int index) {
            return this.list.getByteString(index);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString remove(int index) {
            String strRemove = this.list.remove(index);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(strRemove);
        }

        @Override // java.util.AbstractList, java.util.List
        public ByteString set(int index, ByteString s3) {
            Object andReturn = this.list.setAndReturn(index, s3);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(andReturn);
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] asByteArray(Object o10) {
        if (o10 instanceof byte[]) {
            return (byte[]) o10;
        }
        return o10 instanceof String ? Internal.toByteArray((String) o10) : ((ByteString) o10).toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ByteString asByteString(Object o10) {
        if (o10 instanceof ByteString) {
            return (ByteString) o10;
        }
        return o10 instanceof String ? ByteString.copyFromUtf8((String) o10) : ByteString.copyFrom((byte[]) o10);
    }

    private static String asString(Object o10) {
        if (o10 instanceof String) {
            return (String) o10;
        }
        return o10 instanceof ByteString ? ((ByteString) o10).toStringUtf8() : Internal.toStringUtf8((byte[]) o10);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, ByteString s3) {
        ensureIsMutable();
        return this.list.set(index, s3);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> c6) {
        return addAll(size(), c6);
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> c6) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(c6);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> values) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(values);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override // com.google.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object o10) {
        return super.equals(o10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.LazyStringList
    public byte[] getByteArray(int i7) {
        Object obj = this.list.get(i7);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i7, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override // com.google.protobuf.LazyStringList
    public ByteString getByteString(int index) {
        Object obj = this.list.get(index);
        ByteString byteStringAsByteString = asByteString(obj);
        if (byteStringAsByteString != obj) {
            this.list.set(index, byteStringAsByteString);
        }
        return byteStringAsByteString;
    }

    @Override // com.google.protobuf.LazyStringList
    public Object getRaw(int index) {
        return this.list.get(index);
    }

    @Override // com.google.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override // com.google.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractProtobufList, com.google.protobuf.Internal.ProtobufList
    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    @Override // com.google.protobuf.LazyStringList
    public void mergeFrom(LazyStringList other) {
        ensureIsMutable();
        for (Object obj : other.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection c6) {
        return super.removeAll(c6);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection c6) {
        return super.retainAll(c6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    private LazyStringArrayList(boolean isMutable) {
        super(isMutable);
        this.list = Collections.EMPTY_LIST;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object e10) {
        return super.add(e10);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends String> c6) {
        ensureIsMutable();
        if (c6 instanceof LazyStringList) {
            c6 = ((LazyStringList) c6).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(index, c6);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int index) {
        Object obj = this.list.get(index);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(index, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(index, stringUtf9);
        }
        return stringUtf9;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.BooleanList
    /* JADX INFO: renamed from: mutableCopyWithCapacity */
    public LazyStringArrayList mutableCopyWithCapacity2(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(capacity);
        arrayList.addAll(this.list);
        return new LazyStringArrayList((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object o10) {
        return super.remove(o10);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String set(int index, String s3) {
        ensureIsMutable();
        return asString(this.list.set(index, s3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object setAndReturn(int index, byte[] s3) {
        ensureIsMutable();
        return this.list.set(index, s3);
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public void add(int index, String element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public String remove(int index) {
        ensureIsMutable();
        Object objRemove = this.list.remove(index);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    public LazyStringArrayList(int initialCapacity) {
        this((ArrayList<Object>) new ArrayList(initialCapacity));
    }

    public LazyStringArrayList(LazyStringList from) {
        this.list = new ArrayList(from.size());
        addAll(from);
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, ByteString s3) {
        setAndReturn(index, s3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, ByteString element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void set(int index, byte[] s3) {
        setAndReturn(index, s3);
    }

    public LazyStringArrayList(List<String> from) {
        this((ArrayList<Object>) new ArrayList(from));
    }

    private LazyStringArrayList(ArrayList<Object> list) {
        this.list = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void add(int index, byte[] element) {
        ensureIsMutable();
        this.list.add(index, element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(ByteString element) {
        ensureIsMutable();
        this.list.add(element);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.LazyStringList
    public void add(byte[] element) {
        ensureIsMutable();
        this.list.add(element);
        ((AbstractList) this).modCount++;
    }
}
