package p152k5;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38695c;

    public g(ByteBuffer byteBuffer, int i7) {
        this.f38693a = i7;
        byteBuffer.position(i7);
        int i10 = byteBuffer.getShort();
        if (i10 <= 0) {
            throw new IllegalArgumentException("This position is not valid");
        }
        byte[] bArr = new byte[i10];
        byteBuffer.get(bArr);
        this.f38694b = new String(bArr);
        this.f38695c = i7 + 2 + i10;
    }

    public final Serializable a(ByteBuffer byteBuffer) {
        byteBuffer.position(this.f38695c);
        byte b7 = byteBuffer.get();
        int i7 = byteBuffer.getShort();
        switch (b7) {
            case 1:
                if (i7 == 4) {
                    return Integer.valueOf(byteBuffer.getInt());
                }
                return null;
            case 2:
                if (i7 == 8) {
                    return Long.valueOf(byteBuffer.getLong());
                }
                return null;
            case 3:
                if (i7 == 4) {
                    return Float.valueOf(byteBuffer.getFloat());
                }
                return null;
            case 4:
                if (i7 == 1) {
                    return Boolean.valueOf(byteBuffer.get() == 1);
                }
                return null;
            case 5:
                if (i7 <= 0) {
                    return null;
                }
                byte[] bArr = new byte[i7];
                byteBuffer.get(bArr);
                return new String(bArr);
            case 6:
                if (i7 <= 0) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < i7; i10++) {
                    arrayList.add(Integer.valueOf(byteBuffer.getInt()));
                }
                return arrayList;
            default:
                return null;
        }
    }

    public final void b(int i7, ByteBuffer byteBuffer) {
        byteBuffer.position(this.f38695c);
        byteBuffer.put((byte) 1);
        byteBuffer.putShort((short) 4);
        byteBuffer.putInt(i7);
    }

    public final void c(ByteBuffer byteBuffer, int i7, Object obj) {
        int i10 = this.f38693a;
        int i11 = this.f38695c;
        switch (i7) {
            case 1:
                b(((Integer) obj).intValue(), byteBuffer);
                return;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                byteBuffer.position(i11);
                byteBuffer.put((byte) 2);
                byteBuffer.putShort((short) 8);
                byteBuffer.putLong(jLongValue);
                return;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                byteBuffer.position(i11);
                byteBuffer.put((byte) 3);
                byteBuffer.putShort((short) 4);
                byteBuffer.putFloat(fFloatValue);
                return;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                byteBuffer.position(i11);
                byteBuffer.put((byte) 4);
                byteBuffer.putShort((short) 1);
                byteBuffer.put(zBooleanValue ? (byte) 1 : (byte) 0);
                return;
            case 5:
                String str = (String) obj;
                byteBuffer.position(i11);
                byteBuffer.put((byte) 5);
                if (str == null) {
                    str = "";
                }
                byte[] bytes = str.getBytes();
                short length = bytes == null ? (short) 0 : (short) bytes.length;
                if (length > 1024 - (i11 - i10)) {
                    throw new IllegalArgumentException("value is too long, value.length() = " + str.length());
                }
                byteBuffer.putShort(length);
                if (length > 0) {
                    byteBuffer.put(bytes);
                    return;
                }
                return;
            case 6:
                List list = (List) obj;
                byteBuffer.position(i11);
                byteBuffer.put((byte) 6);
                if (list.size() * 4 > 1024 - (i11 - i10)) {
                    throw new IllegalArgumentException("value is too long, value.length() = " + list.size());
                }
                byteBuffer.putShort((short) list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    byteBuffer.putInt(((Integer) it.next()).intValue());
                }
                return;
            default:
                return;
        }
    }

    public g(ByteBuffer byteBuffer, int i7, String str) {
        this.f38693a = i7;
        this.f38694b = str;
        byteBuffer.position(i7);
        short length = (short) str.length();
        byteBuffer.putShort(length);
        byteBuffer.put(str.getBytes());
        this.f38695c = i7 + 2 + length;
    }
}
