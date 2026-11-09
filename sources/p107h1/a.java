package p107h1;

import Ff.h;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p310ub.C2085k0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f37251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f37252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f37253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.abedelazizshe.lightcompressorlibrary.config.a f37255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f37256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f37257g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C2085k0 f37258i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Uri uri, int i7, com.abedelazizshe.lightcompressorlibrary.config.a aVar, String str, String str2, C2085k0 c2085k0, Continuation continuation) {
        super(2, continuation);
        this.f37252b = context;
        this.f37253c = uri;
        this.f37254d = i7;
        this.f37255e = aVar;
        this.f37256f = str;
        this.f37257g = str2;
        this.f37258i = c2085k0;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C2085k0 c2085k0 = this.f37258i;
        a aVar = new a(this.f37252b, this.f37253c, this.f37254d, this.f37255e, this.f37256f, this.f37257g, c2085k0, continuation);
        aVar.f37251a = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x038d  */
    /* JADX WARN: Code duplicated, block: B:148:0x039a  */
    /* JADX WARN: Code duplicated, block: B:150:0x039d A[Catch: Exception -> 0x032b, TRY_ENTER, TryCatch #2 {Exception -> 0x032b, blocks: (B:98:0x028a, B:99:0x0291, B:105:0x02a1, B:106:0x02b1, B:111:0x02c1, B:113:0x02c7, B:117:0x02fa, B:119:0x0300, B:121:0x030a, B:123:0x0318, B:194:0x045a, B:150:0x039d, B:152:0x03a9, B:157:0x03c3, B:159:0x03c9, B:161:0x03ce, B:163:0x03d6, B:165:0x03dd, B:170:0x03ed, B:172:0x03f4, B:173:0x040f, B:174:0x0410, B:175:0x0427, B:127:0x0332, B:131:0x034f, B:133:0x0357), top: B:320:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:152:0x03a9 A[Catch: Exception -> 0x032b, TryCatch #2 {Exception -> 0x032b, blocks: (B:98:0x028a, B:99:0x0291, B:105:0x02a1, B:106:0x02b1, B:111:0x02c1, B:113:0x02c7, B:117:0x02fa, B:119:0x0300, B:121:0x030a, B:123:0x0318, B:194:0x045a, B:150:0x039d, B:152:0x03a9, B:157:0x03c3, B:159:0x03c9, B:161:0x03ce, B:163:0x03d6, B:165:0x03dd, B:170:0x03ed, B:172:0x03f4, B:173:0x040f, B:174:0x0410, B:175:0x0427, B:127:0x0332, B:131:0x034f, B:133:0x0357), top: B:320:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:154:0x03be  */
    /* JADX WARN: Code duplicated, block: B:156:0x03c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x03c3 A[Catch: Exception -> 0x032b, TryCatch #2 {Exception -> 0x032b, blocks: (B:98:0x028a, B:99:0x0291, B:105:0x02a1, B:106:0x02b1, B:111:0x02c1, B:113:0x02c7, B:117:0x02fa, B:119:0x0300, B:121:0x030a, B:123:0x0318, B:194:0x045a, B:150:0x039d, B:152:0x03a9, B:157:0x03c3, B:159:0x03c9, B:161:0x03ce, B:163:0x03d6, B:165:0x03dd, B:170:0x03ed, B:172:0x03f4, B:173:0x040f, B:174:0x0410, B:175:0x0427, B:127:0x0332, B:131:0x034f, B:133:0x0357), top: B:320:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:159:0x03c9 A[Catch: Exception -> 0x032b, TryCatch #2 {Exception -> 0x032b, blocks: (B:98:0x028a, B:99:0x0291, B:105:0x02a1, B:106:0x02b1, B:111:0x02c1, B:113:0x02c7, B:117:0x02fa, B:119:0x0300, B:121:0x030a, B:123:0x0318, B:194:0x045a, B:150:0x039d, B:152:0x03a9, B:157:0x03c3, B:159:0x03c9, B:161:0x03ce, B:163:0x03d6, B:165:0x03dd, B:170:0x03ed, B:172:0x03f4, B:173:0x040f, B:174:0x0410, B:175:0x0427, B:127:0x0332, B:131:0x034f, B:133:0x0357), top: B:320:0x028a }] */
    /* JADX WARN: Code duplicated, block: B:167:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:169:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:178:0x042d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0442  */
    /* JADX WARN: Code duplicated, block: B:277:0x05da  */
    /* JADX WARN: Code duplicated, block: B:287:0x05fb A[Catch: Exception -> 0x05ff, TRY_LEAVE, TryCatch #10 {Exception -> 0x05ff, blocks: (B:285:0x05f5, B:287:0x05fb), top: B:335:0x05f5 }] */
    /* JADX WARN: Code duplicated, block: B:298:0x0614  */
    /* JADX WARN: Code duplicated, block: B:299:0x0616  */
    /* JADX WARN: Code duplicated, block: B:301:0x061c  */
    /* JADX WARN: Code duplicated, block: B:335:0x05f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x05e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0410 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x04c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:365:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0187, code lost:
    
        if (r2 != 270) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r28v4, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r28v5, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.media.MediaFormat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r37v0, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r37v1 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v7, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v40, types: [k1.c] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19, types: [android.media.MediaCodec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [android.media.MediaCodec] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v30 */
    @Override // Ff.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p107h1.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
