package Cg;

import N8.q0;
import Pg.k;
import Pg.m;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1568a = 0;

    static {
        Charset charset = StandardCharsets.US_ASCII;
    }

    public static ArrayList a(m byteString, String hostname) throws EOFException, UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.i(byteString);
        kVar.readShort();
        short s3 = kVar.readShort();
        if (((s3 & 65535) >> 15) == 0) {
            throw new IllegalArgumentException("not a response");
        }
        int i7 = s3 & 15;
        if (i7 == 2) {
            throw new UnknownHostException(q0.j(hostname, ": SERVFAIL"));
        }
        if (i7 == 3) {
            throw new UnknownHostException(q0.j(hostname, ": NXDOMAIN"));
        }
        int i10 = kVar.readShort() & 65535;
        int i11 = kVar.readShort() & 65535;
        kVar.readShort();
        kVar.readShort();
        for (int i12 = 0; i12 < i10; i12++) {
            byte b7 = kVar.readByte();
            if (b7 < 0) {
                kVar.skip(1L);
            } else {
                while (b7 > 0) {
                    kVar.skip(b7);
                    b7 = kVar.readByte();
                }
            }
            kVar.readShort();
            kVar.readShort();
        }
        for (int i13 = 0; i13 < i11; i13++) {
            byte b10 = kVar.readByte();
            if (b10 < 0) {
                kVar.skip(1L);
            } else {
                while (b10 > 0) {
                    kVar.skip(b10);
                    b10 = kVar.readByte();
                }
            }
            int i14 = kVar.readShort() & 65535;
            kVar.readShort();
            kVar.readInt();
            int i15 = kVar.readShort() & 65535;
            if (i14 == 1 || i14 == 28) {
                byte[] bArr = new byte[i15];
                kVar.read(bArr);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                Intrinsics.checkNotNullExpressionValue(byAddress, "getByAddress(bytes)");
                arrayList.add(byAddress);
            } else {
                kVar.skip(i15);
            }
        }
        return arrayList;
    }
}
