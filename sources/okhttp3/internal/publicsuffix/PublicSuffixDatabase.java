package okhttp3.internal.publicsuffix;

import Dg.c;
import Jg.t;
import Pg.AbstractC0555b;
import Pg.q;
import Pg.x;
import androidx.camera.camera2.internal.F;
import com.alibaba.android.arouter.utils.Consts;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.DropTakeSequence;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.chromium.support_lib_boundary.util.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicSuffixDatabase {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f40915e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f40916f = {42};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f40917g = C1849p.c("*");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PublicSuffixDatabase f40918h = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f40919a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CountDownLatch f40920b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f40921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f40922d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:30:0x0061  */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i7) {
            int i10;
            boolean z3;
            int i11;
            int i12;
            int i13 = -1;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > i13 && bArr[i15] != 10) {
                    i15 += i13;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i10 = i16 + i17;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i10 - i16;
                int i19 = i7;
                boolean z8 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z8) {
                        i11 = 46;
                        z3 = false;
                    } else {
                        byte b7 = bArr2[i19][i20];
                        byte[] bArr3 = c.f1879a;
                        int i22 = b7 & UnsignedBytes.MAX_VALUE;
                        z3 = z8;
                        i11 = i22;
                    }
                    byte b10 = bArr[i16 + i21];
                    byte[] bArr4 = c.f1879a;
                    i12 = i11 - (b10 & UnsignedBytes.MAX_VALUE);
                    if (i12 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z8 = z3;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        z8 = true;
                        i20 = -1;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 < i23) {
                            length = i15;
                        } else if (length2 <= i23) {
                            Charset UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                            return new String(bArr, i16, i18, UTF_8);
                        }
                    }
                    i14 = i10 + 1;
                } else {
                    length = i15;
                }
                i13 = -1;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.f40918h;
        }

        private a() {
        }
    }

    public static List c(String str) {
        List listM = StringsKt.M(str, new char[]{'.'}, 6);
        return Intrinsics.c(CollectionsKt.K(listM), "") ? CollectionsKt.C(1, listM) : listM;
    }

    public final String a(String domain) {
        a aVar;
        String strBinarySearch;
        String strBinarySearch2;
        String strBinarySearch3;
        List listM;
        List listM2;
        int size;
        int size2;
        int i7 = 0;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        AtomicBoolean atomicBoolean = this.f40919a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                this.f40920b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z3 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (Throwable th) {
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z3 = true;
                } catch (IOException e10) {
                    t.f4869a.get().getClass();
                    t.i(5, "Failed to read public suffix list", e10);
                    if (z3) {
                    }
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f40921c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i10 = 0; i10 < size3; i10++) {
            String str = (String) listC.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            aVar = f40915e;
            if (i11 >= size3) {
                strBinarySearch = null;
                break;
            }
            byte[] bArr2 = this.f40921c;
            if (bArr2 == null) {
                Intrinsics.n("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch = aVar.binarySearch(bArr2, bArr, i11);
            if (strBinarySearch != null) {
                break;
            }
            i11++;
        }
        if (size3 <= 1) {
            strBinarySearch2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                strBinarySearch2 = null;
                break;
            }
            bArr3[i12] = f40916f;
            byte[] bArr4 = this.f40921c;
            if (bArr4 == null) {
                Intrinsics.n("publicSuffixListBytes");
                throw null;
            }
            strBinarySearch2 = aVar.binarySearch(bArr4, bArr3, i12);
            if (strBinarySearch2 != null) {
                break;
            }
            i12++;
        }
        if (strBinarySearch2 == null) {
            strBinarySearch3 = null;
            break;
        }
        int i13 = size3 - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                strBinarySearch3 = null;
                break;
            }
            byte[] bArr5 = this.f40922d;
            if (bArr5 == null) {
                Intrinsics.n("publicSuffixExceptionListBytes");
                throw null;
            }
            strBinarySearch3 = aVar.binarySearch(bArr5, bArr, i14);
            if (strBinarySearch3 != null) {
                break;
            }
            i14++;
        }
        if (strBinarySearch3 != null) {
            listM2 = StringsKt.M("!".concat(strBinarySearch3), new char[]{'.'}, 6);
        } else if (strBinarySearch == null && strBinarySearch2 == null) {
            listM2 = f40917g;
        } else {
            if (strBinarySearch == null || (listM = StringsKt.M(strBinarySearch, new char[]{'.'}, 6)) == null) {
                listM = z.f38935a;
            }
            if (strBinarySearch2 == null || (listM2 = StringsKt.M(strBinarySearch2, new char[]{'.'}, 6)) == null) {
                listM2 = z.f38935a;
            }
            if (listM.size() > listM2.size()) {
                listM2 = listM;
            }
        }
        if (listC.size() == listM2.size() && ((String) listM2.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listM2.get(0)).charAt(0) == '!') {
            size = listC.size();
            size2 = listM2.size();
        } else {
            size = listC.size();
            size2 = listM2.size() + 1;
        }
        int i15 = size - size2;
        Sequence sequenceY = CollectionsKt.y(c(domain));
        Intrinsics.checkNotNullParameter(sequenceY, "<this>");
        if (i15 < 0) {
            throw new IllegalArgumentException(F.c(i15, "Requested element count ", " is less than zero.").toString());
        }
        if (i15 != 0) {
            sequenceY = sequenceY instanceof DropTakeSequence ? ((DropTakeSequence) sequenceY).drop(i15) : new Sf.c(sequenceY, i15);
        }
        Intrinsics.checkNotNullParameter(sequenceY, "<this>");
        Intrinsics.checkNotNullParameter(Consts.DOT, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder buffer = new StringBuilder();
        Intrinsics.checkNotNullParameter(sequenceY, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(Consts.DOT, "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        buffer.append((CharSequence) "");
        for (Object obj : sequenceY) {
            i7++;
            if (i7 > 1) {
                buffer.append((CharSequence) Consts.DOT);
            }
            r.a(buffer, obj, null);
        }
        buffer.append((CharSequence) "");
        return buffer.toString();
    }

    public final void b() {
        try {
            kotlin.jvm.internal.F f10 = new kotlin.jvm.internal.F();
            kotlin.jvm.internal.F f11 = new kotlin.jvm.internal.F();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                x xVarC = AbstractC0555b.c(new q(AbstractC0555b.l(resourceAsStream)));
                try {
                    f10.f38951a = xVarC.readByteArray(xVarC.readInt());
                    f11.f38951a = xVarC.readByteArray(xVarC.readInt());
                    Unit unit = Unit.f38893a;
                    xVarC.close();
                    synchronized (this) {
                        Object obj = f10.f38951a;
                        Intrinsics.e(obj);
                        this.f40921c = (byte[]) obj;
                        Object obj2 = f11.f38951a;
                        Intrinsics.e(obj2);
                        this.f40922d = (byte[]) obj2;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        b.o(xVarC, th);
                        throw th2;
                    }
                }
            }
            this.f40920b.countDown();
        } catch (Throwable th3) {
            this.f40920b.countDown();
            throw th3;
        }
    }
}
