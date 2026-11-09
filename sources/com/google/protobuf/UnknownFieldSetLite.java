package com.google.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldSetLite {
    private static final UnknownFieldSetLite DEFAULT_INSTANCE = new UnknownFieldSetLite(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private UnknownFieldSetLite() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int minCapacity) {
        int[] iArr = this.tags;
        if (minCapacity > iArr.length) {
            int i7 = this.count;
            int i10 = (i7 / 2) + i7;
            if (i10 >= minCapacity) {
                minCapacity = i10;
            }
            if (minCapacity < 8) {
                minCapacity = 8;
            }
            this.tags = Arrays.copyOf(iArr, minCapacity);
            this.objects = Arrays.copyOf(this.objects, minCapacity);
        }
    }

    public static UnknownFieldSetLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] tags, int count) {
        int i7 = 17;
        for (int i10 = 0; i10 < count; i10++) {
            i7 = (i7 * 31) + tags[i10];
        }
        return i7;
    }

    private UnknownFieldSetLite mergeFrom(final CodedInputStream input) throws IOException {
        int tag;
        do {
            tag = input.readTag();
            if (tag == 0) {
                break;
            }
        } while (mergeFieldFrom(tag, input));
        return this;
    }

    public static UnknownFieldSetLite mutableCopyOf(UnknownFieldSetLite first, UnknownFieldSetLite second) {
        int i7 = first.count + second.count;
        int[] iArrCopyOf = Arrays.copyOf(first.tags, i7);
        System.arraycopy(second.tags, 0, iArrCopyOf, first.count, second.count);
        Object[] objArrCopyOf = Arrays.copyOf(first.objects, i7);
        System.arraycopy(second.objects, 0, objArrCopyOf, first.count, second.count);
        return new UnknownFieldSetLite(i7, iArrCopyOf, objArrCopyOf, true);
    }

    public static UnknownFieldSetLite newInstance() {
        return new UnknownFieldSetLite();
    }

    private static boolean objectsEquals(Object[] objects1, Object[] objects2, int count) {
        for (int i7 = 0; i7 < count; i7++) {
            if (!objects1[i7].equals(objects2[i7])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] tags1, int[] tags2, int count) {
        for (int i7 = 0; i7 < count; i7++) {
            if (tags1[i7] != tags2[i7]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int tag, Object object, Writer writer) throws IOException {
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            writer.writeInt64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 1) {
            writer.writeFixed64(tagFieldNumber, ((Long) object).longValue());
            return;
        }
        if (tagWireType == 2) {
            writer.writeBytes(tagFieldNumber, (ByteString) object);
            return;
        }
        if (tagWireType != 3) {
            if (tagWireType != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.invalidWireType());
            }
            writer.writeFixed32(tagFieldNumber, ((Integer) object).intValue());
        } else if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            writer.writeStartGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeEndGroup(tagFieldNumber);
        } else {
            writer.writeEndGroup(tagFieldNumber);
            ((UnknownFieldSetLite) object).writeTo(writer);
            writer.writeStartGroup(tagFieldNumber);
        }
    }

    public void checkMutable() {
        if (!this.isMutable) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UnknownFieldSetLite)) {
            return false;
        }
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        int i7 = this.count;
        return i7 == unknownFieldSetLite.count && tagsEquals(this.tags, unknownFieldSetLite.tags, i7) && objectsEquals(this.objects, unknownFieldSetLite.objects, this.count);
    }

    public int getSerializedSize() {
        int iComputeUInt64Size;
        int i7 = this.memoizedSerializedSize;
        if (i7 != -1) {
            return i7;
        }
        int serializedSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            int i11 = this.tags[i10];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i11);
            int tagWireType = WireFormat.getTagWireType(i11);
            if (tagWireType == 0) {
                iComputeUInt64Size = CodedOutputStream.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType == 1) {
                iComputeUInt64Size = CodedOutputStream.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i10]).longValue());
            } else if (tagWireType != 2) {
                if (tagWireType == 3) {
                    serializedSize = ((UnknownFieldSetLite) this.objects[i10]).getSerializedSize() + (CodedOutputStream.computeTagSize(tagFieldNumber) * 2) + serializedSize;
                } else {
                    if (tagWireType != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.invalidWireType());
                    }
                    iComputeUInt64Size = CodedOutputStream.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i10]).intValue());
                }
            } else {
                iComputeUInt64Size = CodedOutputStream.computeBytesSize(tagFieldNumber, (ByteString) this.objects[i10]);
            }
            serializedSize = iComputeUInt64Size + serializedSize;
        }
        this.memoizedSerializedSize = serializedSize;
        return serializedSize;
    }

    public int getSerializedSizeAsMessageSet() {
        int i7 = this.memoizedSerializedSize;
        if (i7 != -1) {
            return i7;
        }
        int iComputeRawMessageSetExtensionSize = 0;
        for (int i10 = 0; i10 < this.count; i10++) {
            iComputeRawMessageSetExtensionSize += CodedOutputStream.computeRawMessageSetExtensionSize(WireFormat.getTagFieldNumber(this.tags[i10]), (ByteString) this.objects[i10]);
        }
        this.memoizedSerializedSize = iComputeRawMessageSetExtensionSize;
        return iComputeRawMessageSetExtensionSize;
    }

    public void makeImmutable() {
        if (this.isMutable) {
            this.isMutable = false;
        }
    }

    public boolean mergeFieldFrom(final int tag, final CodedInputStream input) throws IOException {
        checkMutable();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            storeField(tag, Long.valueOf(input.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            storeField(tag, Long.valueOf(input.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            storeField(tag, input.readBytes());
            return true;
        }
        if (tagWireType == 3) {
            UnknownFieldSetLite unknownFieldSetLite = new UnknownFieldSetLite();
            unknownFieldSetLite.mergeFrom(input);
            input.checkLastTagWas(WireFormat.makeTag(tagFieldNumber, 4));
            storeField(tag, unknownFieldSetLite);
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        storeField(tag, Integer.valueOf(input.readFixed32()));
        return true;
    }

    public UnknownFieldSetLite mergeLengthDelimitedField(final int fieldNumber, final ByteString value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 2), value);
        return this;
    }

    public UnknownFieldSetLite mergeVarintField(int fieldNumber, int value) {
        checkMutable();
        if (fieldNumber == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        storeField(WireFormat.makeTag(fieldNumber, 0), Long.valueOf(value));
        return this;
    }

    public final void printWithIndent(StringBuilder buffer, int indent) {
        for (int i7 = 0; i7 < this.count; i7++) {
            MessageLiteToString.printField(buffer, indent, String.valueOf(WireFormat.getTagFieldNumber(this.tags[i7])), this.objects[i7]);
        }
    }

    public void storeField(int tag, Object value) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i7 = this.count;
        iArr[i7] = tag;
        this.objects[i7] = value;
        this.count = i7 + 1;
    }

    public void writeAsMessageSetTo(CodedOutputStream output) throws IOException {
        for (int i7 = 0; i7 < this.count; i7++) {
            output.writeRawMessageSetExtension(WireFormat.getTagFieldNumber(this.tags[i7]), (ByteString) this.objects[i7]);
        }
    }

    public void writeTo(CodedOutputStream output) throws IOException {
        for (int i7 = 0; i7 < this.count; i7++) {
            int i10 = this.tags[i7];
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            int tagWireType = WireFormat.getTagWireType(i10);
            if (tagWireType == 0) {
                output.writeUInt64(tagFieldNumber, ((Long) this.objects[i7]).longValue());
            } else if (tagWireType == 1) {
                output.writeFixed64(tagFieldNumber, ((Long) this.objects[i7]).longValue());
            } else if (tagWireType == 2) {
                output.writeBytes(tagFieldNumber, (ByteString) this.objects[i7]);
            } else if (tagWireType == 3) {
                output.writeTag(tagFieldNumber, 3);
                ((UnknownFieldSetLite) this.objects[i7]).writeTo(output);
                output.writeTag(tagFieldNumber, 4);
            } else {
                if (tagWireType != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                output.writeFixed32(tagFieldNumber, ((Integer) this.objects[i7]).intValue());
            }
        }
    }

    private UnknownFieldSetLite(int count, int[] tags, Object[] objects, boolean isMutable) {
        this.memoizedSerializedSize = -1;
        this.count = count;
        this.tags = tags;
        this.objects = objects;
        this.isMutable = isMutable;
    }

    private static int hashCode(Object[] objects, int count) {
        int iHashCode = 17;
        for (int i7 = 0; i7 < count; i7++) {
            iHashCode = (iHashCode * 31) + objects[i7].hashCode();
        }
        return iHashCode;
    }

    public int hashCode() {
        int i7 = this.count;
        return ((((527 + i7) * 31) + hashCode(this.tags, i7)) * 31) + hashCode(this.objects, this.count);
    }

    @CanIgnoreReturnValue
    public UnknownFieldSetLite mergeFrom(UnknownFieldSetLite other) {
        if (other.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i7 = this.count + other.count;
        ensureCapacity(i7);
        System.arraycopy(other.tags, 0, this.tags, this.count, other.count);
        System.arraycopy(other.objects, 0, this.objects, this.count, other.count);
        this.count = i7;
        return this;
    }

    public void writeAsMessageSetTo(Writer writer) throws IOException {
        if (writer.fieldOrder() == Writer.FieldOrder.DESCENDING) {
            for (int i7 = this.count - 1; i7 >= 0; i7--) {
                writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i7]), this.objects[i7]);
            }
            return;
        }
        for (int i10 = 0; i10 < this.count; i10++) {
            writer.writeMessageSetItem(WireFormat.getTagFieldNumber(this.tags[i10]), this.objects[i10]);
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (writer.fieldOrder() == Writer.FieldOrder.ASCENDING) {
            for (int i7 = 0; i7 < this.count; i7++) {
                writeField(this.tags[i7], this.objects[i7], writer);
            }
            return;
        }
        for (int i10 = this.count - 1; i10 >= 0; i10--) {
            writeField(this.tags[i10], this.objects[i10], writer);
        }
    }
}
