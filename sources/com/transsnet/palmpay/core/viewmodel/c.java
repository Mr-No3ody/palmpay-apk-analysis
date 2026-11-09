package com.transsnet.palmpay.core.viewmodel;

import B6.RunnableC0085g;
import Oc.j;
import R8.d;
import Ua.j0;
import Ua.k0;
import Ua.l0;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements KeyboardGridLayout.NumKeyboardClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f28577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final KeyboardGridLayout f28578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f28579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f28580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l0 f28581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f28582g;

    static {
        new k0(null);
    }

    public c(View keyboardRoot) {
        Intrinsics.checkNotNullParameter(keyboardRoot, "keyboardRoot");
        this.f28576a = keyboardRoot;
        View viewFindViewById = keyboardRoot.findViewById(e.tvDone);
        this.f28577b = viewFindViewById;
        KeyboardGridLayout keyboardGridLayout = keyboardRoot instanceof KeyboardGridLayout ? (KeyboardGridLayout) keyboardRoot : null;
        if (keyboardGridLayout == null && (keyboardGridLayout = (KeyboardGridLayout) keyboardRoot.findViewById(e.number_keyboard_content)) == null) {
            throw new IllegalArgumentException("number_keyboard_content not found in keyboardRoot");
        }
        this.f28578c = keyboardGridLayout;
        this.f28581f = l0.f9427a;
        this.f28582g = new ArrayList();
        c(keyboardGridLayout);
        keyboardGridLayout.setNumKeyboardClickListener(this);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new d(this, 22));
        }
    }

    public static void c(View view) {
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                c(childAt);
            }
        }
    }

    public static Pair f(EditText editText, int i7) {
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (selectionStart < 0 || selectionStart > i7) {
            selectionStart = i7;
        }
        if (selectionEnd >= 0 && selectionEnd <= i7) {
            i7 = selectionEnd;
        }
        if (selectionStart > i7) {
            int i10 = selectionStart;
            selectionStart = i7;
            i7 = i10;
        }
        return new Pair(Integer.valueOf(selectionStart), Integer.valueOf(i7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [Ua.i0, android.view.View$OnFocusChangeListener] */
    public final void a(List editTexts, Integer num, l0 inputMode) {
        Object next;
        Intrinsics.checkNotNullParameter(editTexts, "editTexts");
        Intrinsics.checkNotNullParameter(inputMode, "inputMode");
        final ArrayList<EditText> arrayListD = CollectionsKt.D(editTexts);
        if (arrayListD.isEmpty()) {
            return;
        }
        b();
        this.f28580e = num;
        this.f28581f = inputMode;
        View view = this.f28577b;
        if (view != null) {
            view.setVisibility(0);
        }
        for (final EditText editText : arrayListD) {
            editText.setShowSoftInputOnFocus(false);
            KeyboardUtils.hideSoftInput(editText);
            final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
            ?? r3 = new View.OnFocusChangeListener() { // from class: Ua.i0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z3) {
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    if (onFocusChangeListener2 != null) {
                        onFocusChangeListener2.onFocusChange(view2, z3);
                    }
                    EditText editText2 = editText;
                    com.transsnet.palmpay.core.viewmodel.c cVar = this;
                    if (!z3) {
                        editText2.post(new RunnableC0085g(21, arrayListD, cVar));
                    } else {
                        cVar.f28579d = editText2;
                        cVar.g();
                    }
                }
            };
            j jVar = new j(12, editText, this);
            editText.setOnFocusChangeListener(r3);
            editText.setOnClickListener(jVar);
            this.f28582g.add(new j0(editText, onFocusChangeListener, r3, jVar));
        }
        Iterator it = arrayListD.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((EditText) next).hasFocus());
        EditText editText2 = (EditText) next;
        if (editText2 == null) {
            editText2 = (EditText) CollectionsKt.F(arrayListD);
        }
        this.f28579d = editText2;
        if (editText2 == null || !editText2.hasFocus()) {
            return;
        }
        g();
    }

    public final void b() {
        ArrayList<j0> arrayList = this.f28582g;
        for (j0 j0Var : arrayList) {
            View.OnFocusChangeListener onFocusChangeListener = j0Var.f9419a.getOnFocusChangeListener();
            EditText editText = j0Var.f9419a;
            if (onFocusChangeListener == j0Var.f9421c) {
                editText.setOnFocusChangeListener(j0Var.f9420b);
            }
            if (j0Var.f9422d != null) {
                editText.setOnClickListener(null);
            }
        }
        arrayList.clear();
    }

    public final void d() {
        View view = this.f28576a;
        view.setVisibility(8);
        view.setEnabled(false);
    }

    public final void e() {
        b();
        this.f28579d = null;
        this.f28580e = null;
        this.f28581f = l0.f9427a;
    }

    public final void g() {
        KeyboardUtils.hideSoftInput(this.f28579d);
        View view = this.f28576a;
        view.setVisibility(0);
        view.setEnabled(true);
        this.f28578c.setVisibility(0);
        View view2 = this.f28577b;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onDeleteClick() {
        Editable text;
        EditText editText = this.f28579d;
        if (editText == null || (text = editText.getText()) == null) {
            return;
        }
        Pair pairF = f(editText, text.length());
        int iIntValue = ((Number) pairF.f38891a).intValue();
        int iIntValue2 = ((Number) pairF.f38892b).intValue();
        if (iIntValue != iIntValue2) {
            text.delete(iIntValue, iIntValue2);
            if (this.f28581f == l0.f9428b) {
                return;
            }
            editText.setSelection(iIntValue);
            return;
        }
        if (iIntValue <= 0) {
            return;
        }
        int i7 = iIntValue - 1;
        l0 l0Var = this.f28581f;
        l0 l0Var2 = l0.f9428b;
        if (l0Var == l0Var2 && text.charAt(i7) == ' ' && i7 > 0) {
            i7 = iIntValue - 2;
        }
        text.delete(i7, iIntValue);
        if (this.f28581f == l0Var2) {
            return;
        }
        editText.setSelection(i7);
    }

    @Override // com.transsnet.palmpay.core.viewmodel.KeyboardGridLayout.NumKeyboardClickListener
    public final void onNumClick(String str) {
        EditText editText;
        Editable text;
        if (str == null || str.length() == 0 || (editText = this.f28579d) == null || (text = editText.getText()) == null) {
            return;
        }
        Pair pairF = f(editText, text.length());
        int iIntValue = ((Number) pairF.f38891a).intValue();
        int iIntValue2 = ((Number) pairF.f38892b).intValue();
        if (this.f28581f != l0.f9428b) {
            Integer num = this.f28580e;
            if (num == null || text.length() < num.intValue()) {
                if (num != null) {
                    if (str.length() + (text.length() - (iIntValue2 - iIntValue)) > num.intValue()) {
                        return;
                    }
                }
                text.replace(iIntValue, iIntValue2, str);
                int length = str.length() + iIntValue;
                int length2 = text.length();
                if (length > length2) {
                    length = length2;
                }
                editText.setSelection(length);
                return;
            }
            return;
        }
        int length3 = text.length();
        if (iIntValue2 <= length3) {
            length3 = iIntValue2;
        }
        int i7 = 0;
        for (int i10 = iIntValue < 0 ? 0 : iIntValue; i10 < length3; i10++) {
            if (Character.isDigit(text.charAt(i10))) {
                i7++;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < text.length(); i11++) {
            char cCharAt = text.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        if (sb2.toString().length() - i7 >= 11) {
            return;
        }
        text.replace(iIntValue, iIntValue2, str);
    }
}
