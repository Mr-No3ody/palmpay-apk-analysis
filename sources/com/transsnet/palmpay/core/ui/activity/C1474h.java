package com.transsnet.palmpay.core.ui.activity;

import Pa.i0;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1474h implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddNewCardWithPaymentActivity f27773b;

    public /* synthetic */ C1474h(AddNewCardWithPaymentActivity addNewCardWithPaymentActivity, int i7) {
        this.f27772a = i7;
        this.f27773b = addNewCardWithPaymentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0105 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x010b A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0111 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x011d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0127 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x012d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0133 A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0139 A[Catch: Exception -> 0x013f, TRY_LEAVE, TryCatch #0 {Exception -> 0x013f, blocks: (B:60:0x00f9, B:62:0x00ff, B:64:0x0105, B:65:0x010b, B:67:0x0111, B:69:0x0117, B:70:0x011d, B:72:0x0127, B:74:0x012d, B:75:0x0133, B:77:0x0139), top: B:95:0x00f9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0158  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable s3) {
        String string;
        String strK;
        EditText editTextR;
        String strS;
        La.l lVar;
        EditText editTextQ;
        StringBuilder sb2;
        int length;
        int i7;
        String string2;
        EditText editTextQ2;
        EditText editTextQ3;
        int length2;
        EditText editTextQ4;
        EditText editTextQ5;
        EditText editTextQ6;
        EditText editTextQ7;
        AddNewCardWithPaymentActivity addNewCardWithPaymentActivity = this.f27773b;
        int i10 = this.f27772a;
        Intrinsics.checkNotNullParameter(s3, "s");
        switch (i10) {
            case 0:
                int i11 = AddNewCardWithPaymentActivity.f27421r0;
                TextView textView = (TextView) addNewCardWithPaymentActivity.f27441o.getValue();
                Intrinsics.checkNotNullExpressionValue(textView, "access$getTvError1(...)");
                p220oa.h.s(textView, false);
                EditText editTextQ8 = addNewCardWithPaymentActivity.q();
                int selectionEnd = editTextQ8 != null ? editTextQ8.getSelectionEnd() : 0;
                String string3 = s3.toString();
                int length3 = string3.length() - 1;
                int i12 = 0;
                boolean z3 = false;
                while (i12 <= length3) {
                    boolean z8 = Intrinsics.h(string3.charAt(!z3 ? i12 : length3), 32) <= 0;
                    if (z3) {
                        if (!z8) {
                            string = string3.subSequence(i12, length3 + 1).toString();
                            if (string == null) {
                                strK = "";
                            } else {
                                if (TextUtils.isEmpty(string)) {
                                    strK = "";
                                } else {
                                    strK = kotlin.text.y.k(string, " ", "");
                                }
                                if (strK == null) {
                                    strK = "";
                                }
                            }
                            if (s3.length() >= 4) {
                                editTextQ = addNewCardWithPaymentActivity.q();
                                if (editTextQ != null) {
                                    editTextQ.removeTextChangedListener(this);
                                }
                                sb2 = new StringBuilder();
                                length = strK.length();
                                i7 = 0;
                                while (i7 < length) {
                                    sb2.append(strK.charAt(i7));
                                    i7++;
                                    if (i7 % 4 == 0) {
                                        sb2.append(" ");
                                    }
                                }
                                string2 = sb2.toString();
                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                if (kotlin.text.y.g(string2, " ", false)) {
                                    string2 = string2.substring(0, string2.length() - 1);
                                    Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
                                }
                                editTextQ2 = addNewCardWithPaymentActivity.q();
                                if (editTextQ2 != null) {
                                    editTextQ2.setText(string2);
                                }
                                editTextQ3 = addNewCardWithPaymentActivity.q();
                                if (editTextQ3 != null) {
                                    editTextQ3.addTextChangedListener(this);
                                }
                                length2 = string2.length();
                                if (selectionEnd >= length2) {
                                    selectionEnd = length2;
                                }
                                try {
                                    if (AddNewCardWithPaymentActivity.m(addNewCardWithPaymentActivity, null, string2)) {
                                        editTextQ7 = addNewCardWithPaymentActivity.q();
                                        if (editTextQ7 != null) {
                                            editTextQ7.setSelection(selectionEnd);
                                            Unit unit = Unit.f38893a;
                                        }
                                    } else if (AddNewCardWithPaymentActivity.m(addNewCardWithPaymentActivity, "", strK)) {
                                        editTextQ6 = addNewCardWithPaymentActivity.q();
                                        if (editTextQ6 != null) {
                                            editTextQ6.setSelection(selectionEnd);
                                            Unit unit2 = Unit.f38893a;
                                        }
                                    } else if (strK.length() < "".length()) {
                                        editTextQ5 = addNewCardWithPaymentActivity.q();
                                        if (editTextQ5 != null) {
                                            editTextQ5.setSelection(selectionEnd);
                                            Unit unit3 = Unit.f38893a;
                                        }
                                    } else {
                                        editTextQ4 = addNewCardWithPaymentActivity.q();
                                        if (editTextQ4 != null) {
                                            editTextQ4.setSelection(length2);
                                            Unit unit4 = Unit.f38893a;
                                        }
                                    }
                                } catch (Exception unused) {
                                    EditText editTextQ9 = addNewCardWithPaymentActivity.q();
                                    if (editTextQ9 != null) {
                                        if (length2 > 19) {
                                            length2 = 19;
                                        }
                                        editTextQ9.setSelection(length2);
                                        Unit unit5 = Unit.f38893a;
                                    }
                                }
                            }
                            addNewCardWithPaymentActivity.v();
                            editTextR = addNewCardWithPaymentActivity.r();
                            if (editTextR != null) {
                                editTextR.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i0.s(addNewCardWithPaymentActivity.s()))});
                            }
                            strS = addNewCardWithPaymentActivity.s();
                            if (strS.length() != 10 && (lVar = (La.l) addNewCardWithPaymentActivity.f27350a) != null) {
                                lVar.getBankInfoByCardNo(strS);
                                break;
                            }
                        } else {
                            length3--;
                        }
                        break;
                    } else if (z8) {
                        i12++;
                    } else {
                        z3 = true;
                    }
                }
                string = string3.subSequence(i12, length3 + 1).toString();
                if (string == null) {
                    strK = "";
                } else {
                    if (TextUtils.isEmpty(string)) {
                        strK = "";
                    } else {
                        strK = kotlin.text.y.k(string, " ", "");
                    }
                    if (strK == null) {
                        strK = "";
                    }
                }
                if (s3.length() >= 4) {
                    editTextQ = addNewCardWithPaymentActivity.q();
                    if (editTextQ != null) {
                        editTextQ.removeTextChangedListener(this);
                    }
                    sb2 = new StringBuilder();
                    length = strK.length();
                    i7 = 0;
                    while (i7 < length) {
                        sb2.append(strK.charAt(i7));
                        i7++;
                        if (i7 % 4 == 0) {
                            sb2.append(" ");
                        }
                    }
                    string2 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    if (kotlin.text.y.g(string2, " ", false)) {
                        string2 = string2.substring(0, string2.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
                    }
                    editTextQ2 = addNewCardWithPaymentActivity.q();
                    if (editTextQ2 != null) {
                        editTextQ2.setText(string2);
                    }
                    editTextQ3 = addNewCardWithPaymentActivity.q();
                    if (editTextQ3 != null) {
                        editTextQ3.addTextChangedListener(this);
                    }
                    length2 = string2.length();
                    if (selectionEnd >= length2) {
                        selectionEnd = length2;
                    }
                    if (AddNewCardWithPaymentActivity.m(addNewCardWithPaymentActivity, null, string2)) {
                        editTextQ7 = addNewCardWithPaymentActivity.q();
                        if (editTextQ7 != null) {
                            editTextQ7.setSelection(selectionEnd);
                            Unit unit6 = Unit.f38893a;
                        }
                    } else if (AddNewCardWithPaymentActivity.m(addNewCardWithPaymentActivity, "", strK)) {
                        editTextQ6 = addNewCardWithPaymentActivity.q();
                        if (editTextQ6 != null) {
                            editTextQ6.setSelection(selectionEnd);
                            Unit unit7 = Unit.f38893a;
                        }
                    } else if (strK.length() < "".length()) {
                        editTextQ5 = addNewCardWithPaymentActivity.q();
                        if (editTextQ5 != null) {
                            editTextQ5.setSelection(selectionEnd);
                            Unit unit8 = Unit.f38893a;
                        }
                    } else {
                        editTextQ4 = addNewCardWithPaymentActivity.q();
                        if (editTextQ4 != null) {
                            editTextQ4.setSelection(length2);
                            Unit unit9 = Unit.f38893a;
                        }
                    }
                }
                addNewCardWithPaymentActivity.v();
                editTextR = addNewCardWithPaymentActivity.r();
                if (editTextR != null) {
                    editTextR.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i0.s(addNewCardWithPaymentActivity.s()))});
                }
                strS = addNewCardWithPaymentActivity.s();
                if (strS.length() != 10) {
                }
                break;
            case 1:
                int i13 = AddNewCardWithPaymentActivity.f27421r0;
                addNewCardWithPaymentActivity.v();
                TextView textView2 = (TextView) addNewCardWithPaymentActivity.f27434d.getValue();
                Intrinsics.checkNotNullExpressionValue(textView2, "access$getTvError3(...)");
                p220oa.h.s(textView2, false);
                break;
            default:
                int i14 = AddNewCardWithPaymentActivity.f27421r0;
                addNewCardWithPaymentActivity.v();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f27772a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s3, int i7, int i10, int i11) {
        switch (this.f27772a) {
            case 0:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
            default:
                Intrinsics.checkNotNullParameter(s3, "s");
                break;
        }
    }
}
