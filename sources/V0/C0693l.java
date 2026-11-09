package V0;

import androidx.annotation.RestrictTo;
import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C1858h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: V0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0693l {
    public /* synthetic */ C0693l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private static final boolean fromByteArray$isObjectStream(ByteArrayInputStream byteArrayInputStream) throws IOException {
        byte[] bArr = new byte[2];
        byteArrayInputStream.read(bArr);
        byte b7 = (byte) (-21267);
        boolean z3 = false;
        if (bArr[0] == ((byte) 16777132) && bArr[1] == b7) {
            z3 = true;
        }
        byteArrayInputStream.reset();
        return z3;
    }

    private static final void fromByteArray$readHeader(DataInputStream dataInputStream) throws IOException {
        short s3 = dataInputStream.readShort();
        if (s3 != -21521) {
            throw new IllegalStateException(C0.G.m(s3, "Magic number doesn't match: ").toString());
        }
        short s8 = dataInputStream.readShort();
        if (s8 != 1) {
            throw new IllegalStateException(C0.G.m(s8, "Unsupported version number: ").toString());
        }
    }

    private static final Object fromByteArray$readValue(DataInputStream dataInputStream, byte b7) throws IOException {
        if (b7 == 0) {
            return null;
        }
        if (b7 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b7 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b7 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b7 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b7 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b7 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b7 == 7) {
            return dataInputStream.readUTF();
        }
        int i7 = 0;
        if (b7 == 8) {
            int i10 = dataInputStream.readInt();
            Boolean[] boolArr = new Boolean[i10];
            while (i7 < i10) {
                boolArr[i7] = Boolean.valueOf(dataInputStream.readBoolean());
                i7++;
            }
            return boolArr;
        }
        if (b7 == 9) {
            int i11 = dataInputStream.readInt();
            Byte[] bArr = new Byte[i11];
            while (i7 < i11) {
                bArr[i7] = Byte.valueOf(dataInputStream.readByte());
                i7++;
            }
            return bArr;
        }
        if (b7 == 10) {
            int i12 = dataInputStream.readInt();
            Integer[] numArr = new Integer[i12];
            while (i7 < i12) {
                numArr[i7] = Integer.valueOf(dataInputStream.readInt());
                i7++;
            }
            return numArr;
        }
        if (b7 == 11) {
            int i13 = dataInputStream.readInt();
            Long[] lArr = new Long[i13];
            while (i7 < i13) {
                lArr[i7] = Long.valueOf(dataInputStream.readLong());
                i7++;
            }
            return lArr;
        }
        if (b7 == 12) {
            int i14 = dataInputStream.readInt();
            Float[] fArr = new Float[i14];
            while (i7 < i14) {
                fArr[i7] = Float.valueOf(dataInputStream.readFloat());
                i7++;
            }
            return fArr;
        }
        if (b7 == 13) {
            int i15 = dataInputStream.readInt();
            Double[] dArr = new Double[i15];
            while (i7 < i15) {
                dArr[i7] = Double.valueOf(dataInputStream.readDouble());
                i7++;
            }
            return dArr;
        }
        if (b7 != 14) {
            throw new IllegalStateException(C0.G.m(b7, "Unsupported type "));
        }
        int i16 = dataInputStream.readInt();
        String[] strArr = new String[i16];
        while (i7 < i16) {
            String utf = dataInputStream.readUTF();
            if (Intrinsics.c(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            strArr[i7] = utf;
            i7++;
        }
        return strArr;
    }

    private static final void toByteArrayInternalV1$writeArray(DataOutputStream dataOutputStream, Object[] objArr) throws IOException {
        int i7;
        C1858h c1858hA = kotlin.jvm.internal.G.a(objArr.getClass());
        if (c1858hA.equals(kotlin.jvm.internal.G.a(Boolean[].class))) {
            i7 = 8;
        } else if (c1858hA.equals(kotlin.jvm.internal.G.a(Byte[].class))) {
            i7 = 9;
        } else if (c1858hA.equals(kotlin.jvm.internal.G.a(Integer[].class))) {
            i7 = 10;
        } else if (c1858hA.equals(kotlin.jvm.internal.G.a(Long[].class))) {
            i7 = 11;
        } else if (c1858hA.equals(kotlin.jvm.internal.G.a(Float[].class))) {
            i7 = 12;
        } else if (c1858hA.equals(kotlin.jvm.internal.G.a(Double[].class))) {
            i7 = 13;
        } else {
            if (!c1858hA.equals(kotlin.jvm.internal.G.a(String[].class))) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.G.a(objArr.getClass()).getQualifiedName());
            }
            i7 = 14;
        }
        dataOutputStream.writeByte(i7);
        dataOutputStream.writeInt(objArr.length);
        for (Object obj : objArr) {
            if (i7 == 8) {
                Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
            } else if (i7 == 9) {
                Byte b7 = obj instanceof Byte ? (Byte) obj : null;
                dataOutputStream.writeByte(b7 != null ? b7.byteValue() : (byte) 0);
            } else if (i7 == 10) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                dataOutputStream.writeInt(num != null ? num.intValue() : 0);
            } else if (i7 == 11) {
                Long l5 = obj instanceof Long ? (Long) obj : null;
                dataOutputStream.writeLong(l5 != null ? l5.longValue() : 0L);
            } else if (i7 == 12) {
                Float f10 = obj instanceof Float ? (Float) obj : null;
                dataOutputStream.writeFloat(f10 != null ? f10.floatValue() : 0.0f);
            } else if (i7 == 13) {
                Double d2 = obj instanceof Double ? (Double) obj : null;
                dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
            } else if (i7 == 14) {
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    str = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                }
                dataOutputStream.writeUTF(str);
            }
        }
    }

    private static final void toByteArrayInternalV1$writeEntry(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + kotlin.jvm.internal.G.a(obj.getClass()).getSimpleName());
            }
            toByteArrayInternalV1$writeArray(dataOutputStream, (Object[]) obj);
        }
        dataOutputStream.writeUTF(str);
    }

    private static final void toByteArrayInternalV1$writeHeader(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(-21521);
        dataOutputStream.writeShort(1);
    }

    @JvmStatic
    @TypeConverter
    @NotNull
    public final C0695n fromByteArray(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return C0695n.f9957c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            int i7 = 0;
            if (fromByteArray$isObjectStream(byteArrayInputStream)) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    while (i7 < i10) {
                        String utf = objectInputStream.readUTF();
                        Intrinsics.checkNotNullExpressionValue(utf, "readUTF()");
                        linkedHashMap.put(utf, objectInputStream.readObject());
                        i7++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    fromByteArray$readHeader(dataInputStream);
                    int i11 = dataInputStream.readInt();
                    while (i7 < i11) {
                        Object objFromByteArray$readValue = fromByteArray$readValue(dataInputStream, dataInputStream.readByte());
                        String key = dataInputStream.readUTF();
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        linkedHashMap.put(key, objFromByteArray$readValue);
                        i7++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        org.chromium.support_lib_boundary.util.b.o(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e10) {
            C.c().b(AbstractC0696o.f9959a, "Error in Data#fromByteArray: ", e10);
        } catch (ClassNotFoundException e11) {
            C.c().b(AbstractC0696o.f9959a, "Error in Data#fromByteArray: ", e11);
        }
        return new C0695n(linkedHashMap);
    }

    @JvmStatic
    @NotNull
    @Deprecated(message = "This is kept for testing migration", replaceWith = @ReplaceWith(expression = "toByteArrayInternalV1", imports = {}))
    @RestrictTo({p192n.c.f39801b})
    public final byte[] toByteArrayInternalV0(@NotNull C0695n data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(data.f9958a.size());
                    for (Map.Entry entry : data.f9958a.entrySet()) {
                        String str = (String) entry.getKey();
                        Object value = entry.getValue();
                        objectOutputStream.writeUTF(str);
                        objectOutputStream.writeObject(value);
                    }
                    Unit unit = Unit.f38893a;
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    if (byteArrayOutputStream.size() > 10240) {
                        throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "{\n                val st…ByteArray()\n            }");
                    return byteArray;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    org.chromium.support_lib_boundary.util.b.o(byteArrayOutputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e10) {
            C.c().b(AbstractC0696o.f9959a, "Error in Data#toByteArray: ", e10);
            return new byte[0];
        }
    }

    @JvmStatic
    @NotNull
    @TypeConverter
    @RestrictTo({p192n.c.f39801b})
    public final byte[] toByteArrayInternalV1(@NotNull C0695n data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                toByteArrayInternalV1$writeHeader(dataOutputStream);
                dataOutputStream.writeInt(data.f9958a.size());
                for (Map.Entry entry : data.f9958a.entrySet()) {
                    toByteArrayInternalV1$writeEntry(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                Intrinsics.checkNotNullExpressionValue(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e10) {
            C.c().b(AbstractC0696o.f9959a, "Error in Data#toByteArray: ", e10);
            return new byte[0];
        }
    }

    private C0693l() {
    }
}
