package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {
    public static q2 a(Object obj) {
        AbstractC1145u1 abstractC1145u1 = (AbstractC1145u1) obj;
        q2 q2Var = abstractC1145u1.unknownFields;
        if (q2Var != q2.f16751f) {
            return q2Var;
        }
        q2 q2VarC = q2.c();
        abstractC1145u1.unknownFields = q2VarC;
        return q2VarC;
    }

    public static boolean b(int i7, Reader reader, Object obj) throws IOException {
        int tag = reader.getTag();
        int i10 = tag >>> 3;
        int i11 = tag & 7;
        if (i11 == 0) {
            ((q2) obj).d(i10 << 3, Long.valueOf(reader.readInt64()));
            return true;
        }
        if (i11 == 1) {
            ((q2) obj).d((i10 << 3) | 1, Long.valueOf(reader.readFixed64()));
            return true;
        }
        if (i11 == 2) {
            ((q2) obj).d((i10 << 3) | 2, reader.readBytes());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw C1160z1.c();
            }
            ((q2) obj).d(5 | (i10 << 3), Integer.valueOf(reader.readFixed32()));
            return true;
        }
        q2 q2VarC = q2.c();
        int i12 = i10 << 3;
        int i13 = i12 | 4;
        int i14 = i7 + 1;
        if (i14 >= 100) {
            throw new C1160z1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (reader.getFieldNumber() != Integer.MAX_VALUE && b(i14, reader, q2VarC)) {
        }
        if (i13 != reader.getTag()) {
            throw new C1160z1("Protocol message end-group tag did not match expected tag.");
        }
        if (q2VarC.f16756e) {
            q2VarC.f16756e = false;
        }
        ((q2) obj).d(i12 | 3, q2VarC);
        return true;
    }

    public static void c(Object obj, Object obj2) {
        ((AbstractC1145u1) obj).unknownFields = (q2) obj2;
    }
}
