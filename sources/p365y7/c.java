package p365y7;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p379z7.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f44127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f44128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f44129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f44130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f44132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public double f44134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public double f44135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f44136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f44137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f44138l;

    public c(e manager, Paint textPaint, List changeCharList, b direction) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(changeCharList, "changeCharList");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f44127a = manager;
        this.f44128b = textPaint;
        this.f44129c = changeCharList;
        this.f44130d = direction;
        c();
    }

    public static void a(c cVar, Canvas canvas, int i7, float f10, float f11, int i10) {
        float f12 = (i10 & 8) != 0 ? 0.0f : f10;
        float f13 = (i10 & 16) != 0 ? 0.0f : f11;
        if (i7 < 0 || i7 >= cVar.f44129c.size() || ((Character) cVar.f44129c.get(i7)).charValue() == 0) {
            return;
        }
        canvas.drawText(new char[]{((Character) cVar.f44129c.get(i7)).charValue()}, 0, 1, f12, f13, cVar.f44128b);
    }

    public final char b() {
        if (this.f44129c.isEmpty()) {
            return (char) 0;
        }
        return ((Character) CollectionsKt.K(this.f44129c)).charValue();
    }

    public final void c() {
        Object obj;
        Object next;
        if (this.f44129c.size() < 2) {
            this.f44132f = b();
        }
        Iterator it = this.f44129c.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Character) next).charValue() == 0);
        Character ch2 = (Character) next;
        char cCharValue = ch2 == null ? (char) 0 : ch2.charValue();
        Paint paint = this.f44128b;
        e eVar = this.f44127a;
        this.f44137k = eVar.a(cCharValue, paint);
        List list = this.f44129c;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            if (((Character) objPrevious).charValue() != 0) {
                obj = objPrevious;
                break;
            }
        }
        Character ch3 = (Character) obj;
        this.f44138l = eVar.a(ch3 != null ? ch3.charValue() : (char) 0, paint);
        d();
    }

    public final void d() {
        char cCharValue = this.f44129c.size() < 2 ? (char) 0 : ((Character) CollectionsKt.F(this.f44129c)).charValue();
        e eVar = this.f44127a;
        Paint paint = this.f44128b;
        this.f44133g = eVar.a(cCharValue, paint);
        eVar.a(b(), paint);
        this.f44131e = Math.max(this.f44133g, this.f44137k);
    }
}
