package okhttp3.internal.http2;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.C1846m;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f40909d = new x(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f40910e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pg.x f40911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f40912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1935f f40913c;

    static {
        Logger logger = Logger.getLogger(AbstractC1938i.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(Http2::class.java.name)");
        f40910e = logger;
    }

    public z(Pg.x source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f40911a = source;
        y yVar = new y(source);
        this.f40912b = yVar;
        this.f40913c = new C1935f(yVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean a(boolean z3, V8.p handler) throws IOException {
        Pg.x xVar = this.f40911a;
        Intrinsics.checkNotNullParameter(handler, "handler");
        try {
            xVar.require(9L);
            int iU = Dg.c.u(xVar);
            if (iU > 16384) {
                throw new IOException(C0.G.m(iU, "FRAME_SIZE_ERROR: "));
            }
            int i7 = xVar.readByte() & UnsignedBytes.MAX_VALUE;
            byte b7 = xVar.readByte();
            int i10 = b7 & UnsignedBytes.MAX_VALUE;
            int i11 = xVar.readInt() & Integer.MAX_VALUE;
            Level level = Level.FINE;
            Logger logger = f40910e;
            if (logger.isLoggable(level)) {
                logger.fine(AbstractC1938i.a(true, i11, iU, i7, i10));
            }
            if (z3 && i7 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                String[] strArr = AbstractC1938i.f40839b;
                sb2.append(i7 < strArr.length ? strArr[i7] : Dg.c.i("0x%02x", Integer.valueOf(i7)));
                throw new IOException(sb2.toString());
            }
            x xVar2 = f40909d;
            switch (i7) {
                case 0:
                    if (i11 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z8 = (b7 & 1) != 0;
                    if ((b7 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    int i12 = (8 & b7) != 0 ? xVar.readByte() & UnsignedBytes.MAX_VALUE : 0;
                    handler.data(z8, i11, xVar, xVar2.lengthWithoutPadding(iU, i10, i12));
                    xVar.skip(i12);
                    return true;
                case 1:
                    if (i11 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z10 = (b7 & 1) != 0;
                    int i13 = (8 & b7) != 0 ? xVar.readByte() & UnsignedBytes.MAX_VALUE : 0;
                    if ((b7 & 32) != 0) {
                        c(handler, i11);
                        iU -= 5;
                    }
                    handler.headers(z10, i11, -1, b(xVar2.lengthWithoutPadding(iU, i10, i13), i13, i10, i11));
                    return true;
                case 2:
                    if (iU != 5) {
                        throw new IOException(androidx.camera.camera2.internal.F.c(iU, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i11 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    c(handler, i11);
                    return true;
                case 3:
                    if (iU != 4) {
                        throw new IOException(androidx.camera.camera2.internal.F.c(iU, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i11 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i14 = xVar.readInt();
                    EnumC1932c enumC1932cFromHttp2 = EnumC1932c.f40803b.fromHttp2(i14);
                    if (enumC1932cFromHttp2 == null) {
                        throw new IOException(C0.G.m(i14, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    handler.rstStream(i11, enumC1932cFromHttp2);
                    return true;
                case 4:
                    if (i11 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b7 & 1) != 0) {
                        if (iU == 0) {
                            return true;
                        }
                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                    }
                    if (iU % 6 != 0) {
                        throw new IOException(C0.G.m(iU, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    K k2 = new K();
                    kotlin.ranges.a aVarE = kotlin.ranges.b.e(kotlin.ranges.b.f(0, iU), 6);
                    int i15 = aVarE.f38977a;
                    int i16 = aVarE.f38978b;
                    int i17 = aVarE.f38979c;
                    if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                        while (true) {
                            int i18 = xVar.readShort();
                            byte[] bArr = Dg.c.f1879a;
                            int i19 = i18 & 65535;
                            int i20 = xVar.readInt();
                            if (i19 != 2) {
                                if (i19 == 3) {
                                    i19 = 4;
                                } else if (i19 != 4) {
                                    if (i19 == 5 && (i20 < 16384 || i20 > 16777215)) {
                                        throw new IOException(C0.G.m(i20, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                    }
                                } else {
                                    if (i20 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i19 = 7;
                                }
                            } else if (i20 != 0 && i20 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            k2.c(i19, i20);
                            if (i15 != i16) {
                                i15 += i17;
                            }
                        }
                    }
                    handler.settings(false, k2);
                    return true;
                case 5:
                    if (i11 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int i21 = (b7 & 8) != 0 ? xVar.readByte() & UnsignedBytes.MAX_VALUE : 0;
                    handler.pushPromise(i11, xVar.readInt() & Integer.MAX_VALUE, b(xVar2.lengthWithoutPadding(iU - 4, i10, i21), i21, i10, i11));
                    return true;
                case 6:
                    if (iU != 8) {
                        throw new IOException(C0.G.m(iU, "TYPE_PING length != 8: "));
                    }
                    if (i11 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    handler.ping((b7 & 1) != 0, xVar.readInt(), xVar.readInt());
                    return true;
                case 7:
                    if (iU < 8) {
                        throw new IOException(C0.G.m(iU, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i11 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i22 = xVar.readInt();
                    int i23 = xVar.readInt();
                    int i24 = iU - 8;
                    EnumC1932c enumC1932cFromHttp3 = EnumC1932c.f40803b.fromHttp2(i23);
                    if (enumC1932cFromHttp3 == null) {
                        throw new IOException(C0.G.m(i23, "TYPE_GOAWAY unexpected error code: "));
                    }
                    Pg.m byteString = Pg.m.f7360e;
                    if (i24 > 0) {
                        byteString = xVar.readByteString(i24);
                    }
                    handler.goAway(i22, enumC1932cFromHttp3, byteString);
                    return true;
                case 8:
                    if (iU != 4) {
                        throw new IOException(C0.G.m(iU, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j6 = ((long) xVar.readInt()) & 2147483647L;
                    if (j6 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    handler.windowUpdate(i11, j6);
                    return true;
                default:
                    xVar.skip(iU);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final List b(int i7, int i10, int i11, int i12) throws IOException {
        y yVar = this.f40912b;
        yVar.f40907e = i7;
        yVar.f40904b = i7;
        yVar.f40908f = i10;
        yVar.f40905c = i11;
        yVar.f40906d = i12;
        while (true) {
            C1935f c1935f = this.f40913c;
            Pg.x xVar = c1935f.f40823c;
            boolean zExhausted = xVar.exhausted();
            ArrayList arrayList = c1935f.f40822b;
            if (zExhausted) {
                List listY = CollectionsKt.Y(arrayList);
                arrayList.clear();
                return listY;
            }
            byte b7 = xVar.readByte();
            byte[] bArr = Dg.c.f1879a;
            int i13 = b7 & UnsignedBytes.MAX_VALUE;
            if (i13 == 128) {
                throw new IOException("index == 0");
            }
            if ((b7 & UnsignedBytes.MAX_POWER_OF_TWO) == 128) {
                int iE = c1935f.e(i13, 127);
                int i14 = iE - 1;
                if (i14 >= 0) {
                    C1934e[] c1934eArr = AbstractC1937h.f40836a;
                    if (i14 <= c1934eArr.length - 1) {
                        arrayList.add(c1934eArr[i14]);
                    }
                }
                int length = c1935f.f40825e + 1 + (i14 - AbstractC1937h.f40836a.length);
                if (length >= 0) {
                    C1934e[] c1934eArr2 = c1935f.f40824d;
                    if (length < c1934eArr2.length) {
                        C1934e c1934e = c1934eArr2[length];
                        Intrinsics.e(c1934e);
                        arrayList.add(c1934e);
                    }
                }
                throw new IOException(C0.G.m(iE, "Header index too large "));
            }
            if (i13 == 64) {
                C1934e[] c1934eArr3 = AbstractC1937h.f40836a;
                Pg.m mVarD = c1935f.d();
                AbstractC1937h.a(mVarD);
                c1935f.c(new C1934e(mVarD, c1935f.d()));
            } else if ((b7 & SignedBytes.MAX_POWER_OF_TWO) == 64) {
                c1935f.c(new C1934e(c1935f.b(c1935f.e(i13, 63) - 1), c1935f.d()));
            } else if ((b7 & 32) == 32) {
                int iE2 = c1935f.e(i13, 31);
                c1935f.f40821a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + c1935f.f40821a);
                }
                int i15 = c1935f.f40827g;
                if (iE2 < i15) {
                    if (iE2 == 0) {
                        C1934e[] c1934eArr4 = c1935f.f40824d;
                        C1846m.i(c1934eArr4, null, 0, c1934eArr4.length);
                        c1935f.f40825e = c1935f.f40824d.length - 1;
                        c1935f.f40826f = 0;
                        c1935f.f40827g = 0;
                    } else {
                        c1935f.a(i15 - iE2);
                    }
                }
            } else if (i13 == 16 || i13 == 0) {
                C1934e[] c1934eArr5 = AbstractC1937h.f40836a;
                Pg.m mVarD2 = c1935f.d();
                AbstractC1937h.a(mVarD2);
                arrayList.add(new C1934e(mVarD2, c1935f.d()));
            } else {
                arrayList.add(new C1934e(c1935f.b(c1935f.e(i13, 15) - 1), c1935f.d()));
            }
        }
    }

    public final void c(V8.p pVar, int i7) throws EOFException {
        Pg.x xVar = this.f40911a;
        xVar.readInt();
        xVar.readByte();
        byte[] bArr = Dg.c.f1879a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40911a.close();
    }
}
