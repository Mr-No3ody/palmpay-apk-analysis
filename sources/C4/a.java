package C4;

import Ef.d;
import Ef.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.media.SoundPool;
import android.util.SparseArray;
import android.util.Xml;
import androidx.camera.core.impl.utils.executor.g;
import androidx.constraintlayout.widget.r;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.recovery.RecoveryStrategy;
import com.facebook.soloader.x;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.google.maps.android.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlinx.serialization.json.internal.InternalJsonWriter;
import org.xmlpull.v1.XmlPullParserException;
import p176lg.j;
import p176lg.p;
import p176lg.s;
import p176lg.w;
import p185ma.t;
import p191mg.b;
import p191mg.k;
import p191mg.m;
import p191mg.n;
import p262r2.c;
import p355xf.AbstractC2122a;
import p355xf.AbstractC2123b;
import p355xf.C2124c;
import p355xf.o;
import p355xf.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements IAxisValueFormatter, ResourceTranscoder, RecoveryStrategy, InternalJsonWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1156c;

    public /* synthetic */ a(int i7, boolean z3) {
        this.f1154a = i7;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(a aVar, AbstractC2123b abstractC2123b, Ff.a aVar2) {
        n frame;
        byte bG;
        LinkedHashMap linkedHashMap;
        a aVar3;
        byte bF;
        LinkedHashMap linkedHashMap2;
        t tVar;
        if (aVar2 instanceof n) {
            frame = (n) aVar2;
            int i7 = frame.f39742g;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f39742g = i7 - Integer.MIN_VALUE;
            } else {
                frame = new n(aVar, aVar2);
            }
        } else {
            frame = new n(aVar, aVar2);
        }
        Object obj = frame.f39740e;
        Ef.a aVar4 = Ef.a.f2423a;
        int i10 = frame.f39742g;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = frame.f39739d;
            linkedHashMap2 = frame.f39738c;
            aVar3 = frame.f39737b;
            AbstractC2123b abstractC2123b2 = frame.f39736a;
            g.M(obj);
            linkedHashMap2.put(str, (j) obj);
            bF = ((t) aVar3.f1156c).f();
            if (bF == 4) {
                bG = bF;
                aVar = aVar3;
                linkedHashMap = linkedHashMap2;
                abstractC2123b = abstractC2123b2;
            } else if (bF != 7) {
                t.n((t) aVar3.f1156c, "Expected end of the object or comma", 0, 6);
                throw null;
            }
            tVar = (t) aVar3.f1156c;
            if (bF == 6) {
                tVar.g((byte) 7);
            } else if (bF == 4) {
                k.g(tVar, "object");
                throw null;
            }
            return new s(linkedHashMap2);
        }
        g.M(obj);
        t tVar2 = (t) aVar.f1156c;
        bG = tVar2.g((byte) 6);
        if (tVar2.q() == 4) {
            t.n(tVar2, "Unexpected leading comma", 0, 6);
            throw null;
        }
        linkedHashMap = new LinkedHashMap();
        t tVar3 = (t) aVar.f1156c;
        if (!tVar3.b()) {
            byte b7 = bG;
            aVar3 = aVar;
            bF = b7;
            linkedHashMap2 = linkedHashMap;
            tVar = (t) aVar3.f1156c;
            if (bF == 6) {
                tVar.g((byte) 7);
            } else if (bF == 4) {
                k.g(tVar, "object");
                throw null;
            }
            return new s(linkedHashMap2);
        }
        String strJ = tVar3.j();
        tVar3.g((byte) 5);
        Unit unit = Unit.f38893a;
        frame.f39736a = abstractC2123b;
        frame.f39737b = aVar;
        frame.f39738c = linkedHashMap;
        frame.f39739d = strJ;
        frame.f39742g = 1;
        C2124c c2124c = (C2124c) abstractC2123b;
        c2124c.getClass();
        c2124c.f43960c = frame;
        c2124c.f43959b = unit;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar4;
    }

    public void b(int i7, int i10) {
        int i11 = i10 + i7;
        char[] cArr = (char[]) this.f1156c;
        if (cArr.length <= i11) {
            int i12 = i7 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i11);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f1156c = cArrCopyOf;
        }
    }

    public boolean c() {
        return this.f1155b < ((ArrayList) this.f1156c).size();
    }

    public boolean d() {
        return ((com.airbnb.lottie.utils.a) this.f1156c) != null;
    }

    public void e() {
        int i7 = this.f1155b;
        if (i7 == -1) {
            return;
        }
        ((SoundPool) this.f1156c).play(i7, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public j f() {
        j sVar;
        Object obj;
        Object objInvoke;
        t tVar = (t) this.f1156c;
        byte bQ = tVar.q();
        if (bQ == 1) {
            return h(true);
        }
        if (bQ == 0) {
            return h(false);
        }
        if (bQ != 6) {
            if (bQ == 8) {
                return g();
            }
            t.n(tVar, "Cannot read Json element because of unexpected ".concat(k.l(bQ)), 0, 6);
            throw null;
        }
        int i7 = this.f1155b + 1;
        this.f1155b = i7;
        if (i7 == 200) {
            m block = new m(this, null);
            c cVar = new c(block);
            Unit unit = Unit.f38893a;
            Ef.a aVar = AbstractC2122a.f43957a;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            Intrinsics.checkNotNullParameter(block, "block");
            C2124c c2124c = new C2124c(null);
            c2124c.f43958a = block;
            c2124c.f43959b = unit;
            c2124c.f43960c = c2124c;
            Ef.a aVar2 = AbstractC2122a.f43957a;
            c2124c.f43961d = aVar2;
            while (true) {
                obj = c2124c.f43961d;
                Continuation completion = c2124c.f43960c;
                if (completion == null) {
                    break;
                }
                o oVar = q.f43977a;
                if (Intrinsics.c(aVar2, obj)) {
                    try {
                        m mVar = c2124c.f43958a;
                        Unit unit2 = c2124c.f43959b;
                        if (mVar == null) {
                            Intrinsics.checkNotNullParameter(mVar, "<this>");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            Intrinsics.checkNotNullParameter(completion, "completion");
                            CoroutineContext context = completion.getContext();
                            Object dVar = context == f.f38943a ? new d(completion) : new e(completion, context);
                            K.d(3, mVar);
                            objInvoke = mVar.invoke(c2124c, unit2, dVar);
                        } else {
                            K.d(3, mVar);
                            objInvoke = mVar.invoke(c2124c, unit2, completion);
                        }
                        if (objInvoke != Ef.a.f2423a) {
                            completion.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        o oVar2 = q.f43977a;
                        completion.resumeWith(g.f(th));
                    }
                } else {
                    c2124c.f43961d = aVar2;
                    completion.resumeWith(obj);
                }
            }
            g.M(obj);
            sVar = (j) obj;
        } else {
            byte bG = tVar.g((byte) 6);
            if (tVar.q() == 4) {
                t.n(tVar, "Unexpected leading comma", 0, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (tVar.b()) {
                String strJ = tVar.j();
                tVar.g((byte) 5);
                linkedHashMap.put(strJ, f());
                bG = tVar.f();
                if (bG != 4) {
                    if (bG == 7) {
                        break;
                    }
                    t.n(tVar, "Expected end of the object or comma", 0, 6);
                    throw null;
                }
            }
            if (bG == 6) {
                tVar.g((byte) 7);
            } else if (bG == 4) {
                k.g(tVar, "object");
                throw null;
            }
            sVar = new s(linkedHashMap);
        }
        this.f1155b--;
        return sVar;
    }

    public p176lg.e g() {
        t tVar = (t) this.f1156c;
        byte bF = tVar.f();
        if (tVar.q() == 4) {
            t.n(tVar, "Unexpected leading comma", 0, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (tVar.b()) {
            arrayList.add(f());
            bF = tVar.f();
            if (bF != 4) {
                boolean z3 = bF == 9;
                int i7 = tVar.f39626b;
                if (!z3) {
                    t.n(tVar, "Expected end of the array or comma", i7, 4);
                    throw null;
                }
            }
        }
        if (bF == 8) {
            tVar.g((byte) 9);
        } else if (bF == 4) {
            k.g(tVar, "array");
            throw null;
        }
        return new p176lg.e(arrayList);
    }

    @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
    public String getFormattedValue(float f10, A4.a aVar) {
        return ((DecimalFormat) this.f1156c).format(f10);
    }

    public w h(boolean z3) {
        t tVar = (t) this.f1156c;
        String strK = !z3 ? tVar.k() : tVar.j();
        return (z3 || !Intrinsics.c(strK, BuildConfig.TRAVIS)) ? new p176lg.n(strK, z3) : p.INSTANCE;
    }

    public synchronized boolean i(String str) {
        for (String str2 : (String[]) this.f1156c) {
            if (str.equals(str2)) {
                return false;
            }
        }
        StringBuilder sb2 = new StringBuilder("Recording new base apk path: ");
        sb2.append(str);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        j(sb2);
        String[] strArr = (String[]) this.f1156c;
        int i7 = this.f1155b;
        strArr[i7 % strArr.length] = str;
        this.f1155b = i7 + 1;
        return true;
    }

    public synchronized void j(StringBuilder sb2) {
        try {
            sb2.append("Previously recorded ");
            sb2.append(this.f1155b);
            sb2.append(" base apk paths.");
            if (this.f1155b > 0) {
                sb2.append(" Most recent ones:");
            }
            int i7 = 0;
            while (true) {
                String[] strArr = (String[]) this.f1156c;
                if (i7 < strArr.length) {
                    int i10 = (this.f1155b - i7) - 1;
                    if (i10 >= 0) {
                        String str = strArr[i10 % strArr.length];
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                        sb2.append(str);
                        sb2.append(" (");
                        sb2.append(new File(str).exists() ? "exists" : "does not exist");
                        sb2.append(")");
                    }
                    i7++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int k(int i7) {
        float f10 = -1;
        SparseArray sparseArray = (SparseArray) this.f1156c;
        int i10 = 0;
        if (-1 == i7) {
            r rVar = i7 == -1 ? (r) sparseArray.valueAt(0) : (r) sparseArray.get(-1);
            if (rVar != null) {
                while (true) {
                    ArrayList arrayList = rVar.f15862b;
                    if (i10 >= arrayList.size()) {
                        i10 = -1;
                        break;
                    }
                    if (((androidx.constraintlayout.widget.s) arrayList.get(i10)).a(f10, f10)) {
                        break;
                    }
                    i10++;
                }
                if (-1 != i10) {
                    return i10 == -1 ? rVar.f15863c : ((androidx.constraintlayout.widget.s) rVar.f15862b.get(i10)).f15868e;
                }
            }
        } else {
            r rVar2 = (r) sparseArray.get(i7);
            if (rVar2 != null) {
                while (true) {
                    ArrayList arrayList2 = rVar2.f15862b;
                    if (i10 >= arrayList2.size()) {
                        i10 = -1;
                        break;
                    }
                    if (((androidx.constraintlayout.widget.s) arrayList2.get(i10)).a(f10, f10)) {
                        break;
                    }
                    i10++;
                }
                return i10 == -1 ? rVar2.f15863c : ((androidx.constraintlayout.widget.s) rVar2.f15862b.get(i10)).f15868e;
            }
        }
        return -1;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, x[] xVarArr) {
        int i7;
        RecoveryStrategy[] recoveryStrategyArr;
        do {
            i7 = this.f1155b;
            recoveryStrategyArr = (RecoveryStrategy[]) this.f1156c;
            if (i7 >= recoveryStrategyArr.length) {
                return false;
            }
            this.f1155b = i7 + 1;
        } while (!recoveryStrategyArr[i7].recover(unsatisfiedLinkError, xVarArr));
        return true;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        b bVar = b.f39720c;
        char[] array = (char[]) this.f1156c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(array, "array");
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (bVar) {
            try {
                int i7 = bVar.f39722b;
                if (array.length + i7 < p191mg.a.f39719a) {
                    bVar.f39722b = i7 + array.length;
                    bVar.f39721a.addLast(array);
                }
                Unit unit = Unit.f38893a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f1154a) {
            case 9:
                return new String((char[]) this.f1156c, 0, this.f1155b);
            default:
                return super.toString();
        }
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource transcode(Resource resource, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) resource.get()).compress((Bitmap.CompressFormat) this.f1156c, this.f1155b, byteArrayOutputStream);
        resource.recycle();
        return new B1.b(byteArrayOutputStream.toByteArray());
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        b(this.f1155b, length);
        text.getChars(0, text.length(), (char[]) this.f1156c, this.f1155b);
        this.f1155b += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c6) {
        b(this.f1155b, 1);
        char[] cArr = (char[]) this.f1156c;
        int i7 = this.f1155b;
        this.f1155b = i7 + 1;
        cArr[i7] = c6;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long j6) {
        write(String.valueOf(j6));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(String text) {
        byte b7;
        Intrinsics.checkNotNullParameter(text, "text");
        b(this.f1155b, text.length() + 2);
        char[] cArr = (char[]) this.f1156c;
        int i7 = this.f1155b;
        int i10 = i7 + 1;
        cArr[i7] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i10);
        int i11 = length + i10;
        int i12 = i10;
        while (i12 < i11) {
            char c6 = cArr[i12];
            byte[] bArr = p191mg.r.f39759b;
            if (c6 < bArr.length && bArr[c6] != 0) {
                int length2 = text.length();
                for (int i13 = i12 - i10; i13 < length2; i13++) {
                    b(i12, 2);
                    char cCharAt = text.charAt(i13);
                    byte[] bArr2 = p191mg.r.f39759b;
                    if (cCharAt >= bArr2.length || (b7 = bArr2[cCharAt]) == 0) {
                        int i14 = i12 + 1;
                        ((char[]) this.f1156c)[i12] = cCharAt;
                        i12 = i14;
                    } else if (b7 == 1) {
                        String str = p191mg.r.f39758a[cCharAt];
                        Intrinsics.e(str);
                        b(i12, str.length());
                        str.getChars(0, str.length(), (char[]) this.f1156c, i12);
                        int length3 = str.length() + i12;
                        this.f1155b = length3;
                        i12 = length3;
                    } else {
                        char[] cArr2 = (char[]) this.f1156c;
                        cArr2[i12] = '\\';
                        cArr2[i12 + 1] = (char) b7;
                        i12 += 2;
                        this.f1155b = i12;
                    }
                }
                b(i12, 1);
                ((char[]) this.f1156c)[i12] = '\"';
                this.f1155b = i12 + 1;
                return;
            }
            i12++;
        }
        cArr[i11] = '\"';
        this.f1155b = i11 + 1;
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.f1154a = i7;
        this.f1156c = obj;
        this.f1155b = 0;
    }

    public a(p176lg.h configuration, t lexer) {
        this.f1154a = 10;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        this.f1156c = lexer;
    }

    public a(int i7) {
        this.f1154a = i7;
        switch (i7) {
            case 2:
                this.f1156c = new String[5];
                this.f1155b = 0;
                break;
            case 7:
                this.f1155b = 1;
                this.f1156c = Collections.singletonList(null);
                break;
            case 8:
                this.f1155b = 255;
                this.f1156c = null;
                break;
            default:
                this.f1156c = Bitmap.CompressFormat.JPEG;
                this.f1155b = 100;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0094  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public a(Context context, XmlResourceParser xmlResourceParser) {
        this.f1154a = 6;
        this.f1155b = -1;
        this.f1156c = new SparseArray();
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.p.StateSet);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == androidx.constraintlayout.widget.p.StateSet_defaultState) {
                this.f1155b = typedArrayObtainStyledAttributes.getResourceId(index, this.f1155b);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            r rVar = null;
            while (true) {
                byte b7 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType != 2) {
                    if (eventType == 3 && "StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                b7 = 2;
                            } else {
                                b7 = -1;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                b7 = 0;
                            } else {
                                b7 = -1;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b7 = -1;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b7 = 3;
                            } else {
                                b7 = -1;
                            }
                            break;
                        default:
                            b7 = -1;
                            break;
                    }
                    if (b7 == 2) {
                        rVar = new r(context, xmlResourceParser);
                        ((SparseArray) this.f1156c).put(rVar.f15861a, rVar);
                    } else if (b7 == 3) {
                        androidx.constraintlayout.widget.s sVar = new androidx.constraintlayout.widget.s(context, xmlResourceParser);
                        if (rVar != null) {
                            rVar.f15862b.add(sVar);
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public a(ArrayList routes) {
        this.f1154a = 4;
        Intrinsics.checkNotNullParameter(routes, "routes");
        this.f1156c = routes;
    }
}
