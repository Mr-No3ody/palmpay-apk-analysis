package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final retrofit2.adapter.rxjava2.d f16913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O2.a f16914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f16915c;

    public p(O2.a aVar, retrofit2.adapter.rxjava2.d dVar, d dVar2, Set set) {
        this.f16913a = dVar;
        this.f16914b = aVar;
        this.f16915c = dVar2;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            c(str, 0, str.length(), 1, true, new n(str));
        }
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z3) {
        q[] qVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (qVarArr = (q[]) editable.getSpans(selectionStart, selectionEnd, q.class)) != null && qVarArr.length > 0) {
                for (q qVar : qVarArr) {
                    int spanStart = editable.getSpanStart(qVar);
                    int spanEnd = editable.getSpanEnd(qVar);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i7, int i10, w wVar) {
        if ((wVar.f16941c & 3) == 0) {
            d dVar = this.f16915c;
            androidx.emoji2.text.flatbuffer.a aVarB = wVar.b();
            int iA = aVarB.a(8);
            boolean zHasGlyph = dVar.hasGlyph(charSequence, i7, i10, iA != 0 ? ((ByteBuffer) aVarB.f348d).getShort(iA + aVarB.f345a) : (short) 0);
            int i11 = wVar.f16941c & 4;
            wVar.f16941c = zHasGlyph ? i11 | 2 : i11 | 1;
        }
        return (wVar.f16941c & 3) == 2;
    }

    public final Object c(CharSequence charSequence, int i7, int i10, int i11, boolean z3, EmojiProcessor$EmojiProcessCallback emojiProcessor$EmojiProcessCallback) {
        int i12;
        char c6;
        o oVar = new o((t) this.f16914b.f6555c);
        int iCodePointAt = Character.codePointAt(charSequence, i7);
        boolean zHandleEmoji = true;
        int i13 = 0;
        int iCharCount = i7;
        loop0: while (true) {
            i12 = iCharCount;
            while (true) {
                if (iCharCount < i10 && i13 < i11 && zHandleEmoji) {
                    SparseArray sparseArray = oVar.f16909c.f16932a;
                    t tVar = sparseArray == null ? null : (t) sparseArray.get(iCodePointAt);
                    if (oVar.f16907a == 2) {
                        if (tVar != null) {
                            oVar.f16909c = tVar;
                            oVar.f16912f++;
                        } else {
                            if (iCodePointAt == 65038) {
                                oVar.a();
                            } else if (iCodePointAt != 65039) {
                                t tVar2 = oVar.f16909c;
                                if (tVar2.f16933b != null) {
                                    if (oVar.f16912f != 1) {
                                        oVar.f16910d = tVar2;
                                        oVar.a();
                                    } else if (oVar.b()) {
                                        oVar.f16910d = oVar.f16909c;
                                        oVar.a();
                                    } else {
                                        oVar.a();
                                    }
                                    c6 = 3;
                                } else {
                                    oVar.a();
                                }
                            }
                            c6 = 1;
                        }
                        c6 = 2;
                    } else if (tVar == null) {
                        oVar.a();
                        c6 = 1;
                    } else {
                        oVar.f16907a = 2;
                        oVar.f16909c = tVar;
                        oVar.f16912f = 1;
                        c6 = 2;
                    }
                    oVar.f16911e = iCodePointAt;
                    if (c6 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                        if (iCharCount >= i10) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c6 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i10) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c6 == 3) {
                        if (!z3 && b(charSequence, i12, iCharCount, oVar.f16910d.f16933b)) {
                            break;
                        }
                        zHandleEmoji = emojiProcessor$EmojiProcessCallback.handleEmoji(charSequence, i12, iCharCount, oVar.f16910d.f16933b);
                        i13++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (oVar.f16907a == 2 && oVar.f16909c.f16933b != null && ((oVar.f16912f > 1 || oVar.b()) && i13 < i11 && zHandleEmoji && (z3 || !b(charSequence, i12, iCharCount, oVar.f16909c.f16933b)))) {
            emojiProcessor$EmojiProcessCallback.handleEmoji(charSequence, i12, iCharCount, oVar.f16909c.f16933b);
        }
        return emojiProcessor$EmojiProcessCallback.getResult();
    }
}
