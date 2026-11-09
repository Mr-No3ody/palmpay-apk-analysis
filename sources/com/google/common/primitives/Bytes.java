package com.google.common.primitives;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Bytes {

    @GwtCompatible
    public static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        public ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Byte) && Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteArrayAsList)) {
                return super.equals(obj);
            }
            ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
            int size = size();
            if (byteArrayAsList.size() != size) {
                return false;
            }
            for (int i7 = 0; i7 < size; i7++) {
                if (this.array[this.start + i7] != byteArrayAsList.array[byteArrayAsList.start + i7]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i7 = this.start; i7 < this.end; i7++) {
                iHashCode = (iHashCode * 31) + Bytes.hashCode(this.array[i7]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(@CheckForNull Object obj) {
            int iIndexOf;
            if (!(obj instanceof Byte) || (iIndexOf = Bytes.indexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(@CheckForNull Object obj) {
            int iLastIndexOf;
            if (!(obj instanceof Byte) || (iLastIndexOf = Bytes.lastIndexOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i7, int i10) {
            Preconditions.checkPositionIndexes(i7, i10, size());
            if (i7 == i10) {
                return Collections.EMPTY_LIST;
            }
            byte[] bArr = this.array;
            int i11 = this.start;
            return new ByteArrayAsList(bArr, i7 + i11, i11 + i10);
        }

        public byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append((int) this.array[this.start]);
            int i7 = this.start;
            while (true) {
                i7++;
                if (i7 >= this.end) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append((int) this.array[i7]);
            }
        }

        public ByteArrayAsList(byte[] bArr, int i7, int i10) {
            this.array = bArr;
            this.start = i7;
            this.end = i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i7) {
            Preconditions.checkElementIndex(i7, size());
            return Byte.valueOf(this.array[this.start + i7]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i7, Byte b7) {
            Preconditions.checkElementIndex(i7, size());
            byte[] bArr = this.array;
            int i10 = this.start;
            byte b10 = bArr[i10 + i7];
            bArr[i10 + i7] = ((Byte) Preconditions.checkNotNull(b7)).byteValue();
            return Byte.valueOf(b10);
        }
    }

    private Bytes() {
    }

    public static List<Byte> asList(byte... bArr) {
        return bArr.length == 0 ? Collections.EMPTY_LIST : new ByteArrayAsList(bArr);
    }

    public static byte[] concat(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static boolean contains(byte[] bArr, byte b7) {
        for (byte b10 : bArr) {
            if (b10 == b7) {
                return true;
            }
        }
        return false;
    }

    public static byte[] ensureCapacity(byte[] bArr, int i7, int i10) {
        Preconditions.checkArgument(i7 >= 0, "Invalid minLength: %s", i7);
        Preconditions.checkArgument(i10 >= 0, "Invalid padding: %s", i10);
        return bArr.length < i7 ? Arrays.copyOf(bArr, i7 + i10) : bArr;
    }

    public static int hashCode(byte b7) {
        return b7;
    }

    public static int indexOf(byte[] bArr, byte b7) {
        return indexOf(bArr, b7, 0, bArr.length);
    }

    public static int lastIndexOf(byte[] bArr, byte b7) {
        return lastIndexOf(bArr, b7, 0, bArr.length);
    }

    public static void reverse(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        reverse(bArr, 0, bArr.length);
    }

    public static byte[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof ByteArrayAsList) {
            return ((ByteArrayAsList) collection).toByteArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        byte[] bArr = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr[i7] = ((Number) Preconditions.checkNotNull(array[i7])).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(byte[] bArr, byte b7, int i7, int i10) {
        while (i7 < i10) {
            if (bArr[i7] == b7) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(byte[] bArr, byte b7, int i7, int i10) {
        for (int i11 = i10 - 1; i11 >= i7; i11--) {
            if (bArr[i11] == b7) {
                return i11;
            }
        }
        return -1;
    }

    public static int indexOf(byte[] bArr, byte[] bArr2) {
        Preconditions.checkNotNull(bArr, "array");
        Preconditions.checkNotNull(bArr2, "target");
        if (bArr2.length == 0) {
            return 0;
        }
        for (int i7 = 0; i7 < (bArr.length - bArr2.length) + 1; i7++) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i7 + i10] != bArr2[i10]) {
                }
            }
            return i7;
        }
        return -1;
    }

    public static void reverse(byte[] bArr, int i7, int i10) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkPositionIndexes(i7, i10, bArr.length);
        for (int i11 = i10 - 1; i7 < i11; i11--) {
            byte b7 = bArr[i7];
            bArr[i7] = bArr[i11];
            bArr[i11] = b7;
            i7++;
        }
    }
}
