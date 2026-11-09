package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.model.layer.d;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ProtobufDataEncoderContext implements ObjectEncoderContext {
    private final ObjectEncoder<Object> fallbackEncoder;
    private final Map<Class<?>, ObjectEncoder<?>> objectEncoders;
    private OutputStream output;
    private final ProtobufValueEncoderContext valueEncoderContext = new ProtobufValueEncoderContext(this);
    private final Map<Class<?>, ValueEncoder<?>> valueEncoders;
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private static final FieldDescriptor MAP_KEY_DESC = d.e(1, FieldDescriptor.builder("key"));
    private static final FieldDescriptor MAP_VALUE_DESC = d.e(2, FieldDescriptor.builder("value"));
    private static final ObjectEncoder<Map.Entry<Object, Object>> DEFAULT_MAP_ENCODER = new a(0);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.output = outputStream;
        this.objectEncoders = map;
        this.valueEncoders = map2;
        this.fallbackEncoder = objectEncoder;
    }

    private static ByteBuffer allocateBuffer(int i7) {
        return ByteBuffer.allocate(i7).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long determineSize(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.output;
            this.output = lengthCountingOutputStream;
            try {
                objectEncoder.encode(t, this);
                this.output = outputStream;
                long length = lengthCountingOutputStream.getLength();
                lengthCountingOutputStream.close();
                return length;
            } catch (Throwable th) {
                this.output = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> ProtobufDataEncoderContext doEncode(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z3) throws IOException {
        long jDetermineSize = determineSize(objectEncoder, t);
        if (z3 && jDetermineSize == 0) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
        writeVarInt64(jDetermineSize);
        objectEncoder.encode(t, this);
        return this;
    }

    private static Protobuf getProtobuf(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private static int getTag(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(MAP_KEY_DESC, entry.getKey());
        objectEncoderContext.add(MAP_VALUE_DESC, entry.getValue());
    }

    private void writeVarInt32(int i7) throws IOException {
        while ((i7 & (-128)) != 0) {
            this.output.write((i7 & 127) | 128);
            i7 >>>= 7;
        }
        this.output.write(i7 & 127);
    }

    private void writeVarInt64(long j6) throws IOException {
        while (((-128) & j6) != 0) {
            this.output.write((((int) j6) & 127) | 128);
            j6 >>>= 7;
        }
        this.output.write(((int) j6) & 127);
    }

    public ProtobufDataEncoderContext encode(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return encode(obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d2) throws IOException {
        return add(FieldDescriptor.of(str), d2);
    }

    private <T> ProtobufDataEncoderContext doEncode(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z3) throws IOException {
        this.valueEncoderContext.resetContext(fieldDescriptor, z3);
        valueEncoder.encode(t, this.valueEncoderContext);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i7) throws IOException {
        return add(FieldDescriptor.of(str), i7);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j6) throws IOException {
        return add(FieldDescriptor.of(str), j6);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z3) throws IOException {
        return add(FieldDescriptor.of(str), z3);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(fieldDescriptor, obj, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z3) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z3 || charSequence.length() != 0) {
                    writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(UTF_8);
                    writeVarInt32(bytes.length);
                    this.output.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    add(fieldDescriptor, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    doEncode((ObjectEncoder<Map.Entry>) DEFAULT_MAP_ENCODER, fieldDescriptor, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return add(fieldDescriptor, ((Double) obj).doubleValue(), z3);
                }
                if (obj instanceof Float) {
                    return add(fieldDescriptor, ((Float) obj).floatValue(), z3);
                }
                if (obj instanceof Number) {
                    return add(fieldDescriptor, ((Number) obj).longValue(), z3);
                }
                if (obj instanceof Boolean) {
                    return add(fieldDescriptor, ((Boolean) obj).booleanValue(), z3);
                }
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z3 || bArr.length != 0) {
                        writeVarInt32((getTag(fieldDescriptor) << 3) | 2);
                        writeVarInt32(bArr.length);
                        this.output.write(bArr);
                        return this;
                    }
                } else {
                    ObjectEncoder<?> objectEncoder = this.objectEncoders.get(obj.getClass());
                    if (objectEncoder != null) {
                        return doEncode(objectEncoder, fieldDescriptor, obj, z3);
                    }
                    ValueEncoder<?> valueEncoder = this.valueEncoders.get(obj.getClass());
                    if (valueEncoder != null) {
                        return doEncode(valueEncoder, fieldDescriptor, obj, z3);
                    }
                    if (obj instanceof ProtoEnum) {
                        return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
                    }
                    if (obj instanceof Enum) {
                        return add(fieldDescriptor, ((Enum) obj).ordinal());
                    }
                    return doEncode(this.fallbackEncoder, fieldDescriptor, obj, z3);
                }
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2) throws IOException {
        return add(fieldDescriptor, d2, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d2, boolean z3) throws IOException {
        if (z3 && d2 == 0.0d) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 1);
        this.output.write(allocateBuffer(8).putDouble(d2).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f10) throws IOException {
        return add(fieldDescriptor, f10, true);
    }

    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f10, boolean z3) throws IOException {
        if (z3 && f10 == 0.0f) {
            return this;
        }
        writeVarInt32((getTag(fieldDescriptor) << 3) | 5);
        this.output.write(allocateBuffer(4).putFloat(f10).array());
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i7) throws IOException {
        return add(fieldDescriptor, i7, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i7, boolean z3) throws IOException {
        if (!z3 || i7 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i10 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
            if (i10 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32(i7);
                return this;
            }
            if (i10 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt32((i7 << 1) ^ (i7 >> 31));
                return this;
            }
            if (i10 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 5);
                this.output.write(allocateBuffer(4).putInt(i7).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j6) throws IOException {
        return add(fieldDescriptor, j6, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j6, boolean z3) throws IOException {
        if (!z3 || j6 != 0) {
            Protobuf protobuf = getProtobuf(fieldDescriptor);
            int i7 = AnonymousClass1.$SwitchMap$com$google$firebase$encoders$proto$Protobuf$IntEncoding[protobuf.intEncoding().ordinal()];
            if (i7 == 1) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64(j6);
                return this;
            }
            if (i7 == 2) {
                writeVarInt32(protobuf.tag() << 3);
                writeVarInt64((j6 >> 63) ^ (j6 << 1));
                return this;
            }
            if (i7 == 3) {
                writeVarInt32((protobuf.tag() << 3) | 1);
                this.output.write(allocateBuffer(8).putLong(j6).array());
                return this;
            }
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z3) throws IOException {
        return add(fieldDescriptor, z3, true);
    }

    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z3, boolean z8) throws IOException {
        return add(fieldDescriptor, z3 ? 1 : 0, z8);
    }
}
