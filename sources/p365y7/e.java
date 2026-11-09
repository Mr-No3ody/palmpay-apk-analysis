package p365y7;

import android.graphics.Paint;
import com.rollingtextview.strategy.CharOrderStrategy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import p039cb.c;
import p379z7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f44139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f44140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f44141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f44142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f44143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44146h;

    static {
        new d(null);
    }

    public e(Paint textPaint, c charOrderManager) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(charOrderManager, "charOrderManager");
        this.f44139a = textPaint;
        this.f44140b = charOrderManager;
        this.f44141c = new LinkedHashMap(36);
        this.f44142d = new ArrayList();
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(list, "emptyList()");
        this.f44143e = list;
        f();
    }

    public final float a(char c6, Paint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        if (c6 == 0) {
            return 0.0f;
        }
        Character chValueOf = Character.valueOf(c6);
        LinkedHashMap linkedHashMap = this.f44141c;
        Float f10 = (Float) linkedHashMap.get(chValueOf);
        if (f10 != null) {
            return f10.floatValue();
        }
        float fMeasureText = textPaint.measureText(String.valueOf(c6));
        linkedHashMap.put(Character.valueOf(c6), Float.valueOf(fMeasureText));
        return fMeasureText;
    }

    public final char[] b() {
        ArrayList arrayList = this.f44142d;
        int size = arrayList.size();
        char[] cArr = new char[size];
        for (int i7 = 0; i7 < size; i7++) {
            cArr[i7] = ((c) arrayList.get(i7)).f44132f;
        }
        return cArr;
    }

    public final float c() {
        int i7 = this.f44144f;
        ArrayList arrayList = this.f44142d;
        int iMax = Math.max(0, arrayList.size() - 1) * i7;
        ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((c) it.next()).f44131e));
        }
        Iterator it2 = arrayList2.iterator();
        float fFloatValue = 0.0f;
        while (it2.hasNext()) {
            fFloatValue += ((Number) it2.next()).floatValue();
        }
        return fFloatValue + iMax;
    }

    public final void d() {
        for (c cVar : this.f44142d) {
            cVar.f44132f = cVar.b();
            cVar.f44135i = 0.0d;
            cVar.f44134h = 0.0d;
        }
        ((CharOrderStrategy) this.f44140b.f18901b).afterCompute();
    }

    public final void e(CharSequence targetText) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        String sourceText = new String(b());
        int iMax = Math.max(sourceText.length(), targetText.length());
        c cVar = this.f44140b;
        Intrinsics.checkNotNullParameter(sourceText, "sourceText");
        Intrinsics.checkNotNullParameter(targetText, "targetText");
        CharOrderStrategy charOrderStrategy = (CharOrderStrategy) cVar.f18901b;
        ArrayList arrayList2 = (ArrayList) cVar.f18902c;
        charOrderStrategy.beforeCompute(sourceText, targetText, arrayList2);
        int i7 = 0;
        while (true) {
            arrayList = this.f44142d;
            if (i7 >= iMax) {
                break;
            }
            int i10 = i7 + 1;
            Intrinsics.checkNotNullParameter(sourceText, "sourceText");
            Intrinsics.checkNotNullParameter(targetText, "targetText");
            Pair<List<Character>, b> pairFindCharOrder = ((CharOrderStrategy) cVar.f18901b).findCharOrder(sourceText, targetText, i7, arrayList2);
            List charList = (List) pairFindCharOrder.f38891a;
            b dir = (b) pairFindCharOrder.f38892b;
            if (i7 >= iMax - sourceText.length()) {
                c cVar2 = (c) arrayList.get(i7);
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(charList, "charList");
                Intrinsics.checkNotNullParameter(dir, "dir");
                cVar2.f44129c = charList;
                cVar2.f44130d = dir;
                cVar2.c();
                cVar2.f44136j = 0;
                cVar2.f44134h = cVar2.f44135i;
                cVar2.f44135i = 0.0d;
            } else {
                arrayList.add(i7, new c(this, this.f44139a, charList, dir));
            }
            i7 = i10;
        }
        ArrayList arrayList3 = new ArrayList(r.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((c) it.next()).f44129c);
        }
        this.f44143e = arrayList3;
    }

    public final void f() {
        this.f44141c.clear();
        Paint.FontMetrics fontMetrics = this.f44139a.getFontMetrics();
        float f10 = fontMetrics.bottom;
        float f11 = fontMetrics.top;
        this.f44145g = f10 - f11;
        this.f44146h = -f11;
        Iterator it = this.f44142d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).d();
        }
    }
}
