package Gb;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.preference.PreferenceFragmentCompat;
import com.palmpay.lib.ui.picker.wheel.view.WheelView;
import com.transsnet.palmpay.account.ui.view.KeyboardView;
import com.transsnet.palmpay.credit.view.CustomTextSwitcher;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Gb.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class HandlerC0283f extends Handler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3272c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3274b;

    public /* synthetic */ HandlerC0283f() {
        this.f3273a = 1;
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message msg) {
        switch (this.f3273a) {
            case 0:
                Intrinsics.checkNotNullParameter(msg, "msg");
                super.dispatchMessage(msg);
                CustomTextSwitcher customTextSwitcher = (CustomTextSwitcher) this.f3274b;
                int size = customTextSwitcher.f30733c % customTextSwitcher.getMData().size();
                customTextSwitcher.f30733c++;
                customTextSwitcher.setText(customTextSwitcher.getMData().get(size));
                sendEmptyMessageDelayed(0, customTextSwitcher.f30732b);
                break;
            default:
                super.dispatchMessage(msg);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [char, int] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v30, types: [boolean] */
    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i7;
        p066e9.b bVar;
        int i10;
        ?? r16;
        boolean z3;
        p066e9.d dVar;
        boolean z8;
        boolean z10 = true;
        switch (this.f3273a) {
            case 1:
                int i11 = message.what;
                if (i11 == -3 || i11 == -2 || i11 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f3274b).get(), message.what);
                    return;
                } else {
                    if (i11 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 2:
                if (message.what != 1) {
                    return;
                }
                ((PreferenceFragmentCompat) this.f3274b).f();
                return;
            case 3:
                int i12 = message.what;
                WheelView wheelView = (WheelView) this.f3274b;
                if (i12 == 1000) {
                    wheelView.invalidate();
                    return;
                } else if (i12 == 2000) {
                    wheelView.g(2);
                    return;
                } else {
                    if (i12 != 3000) {
                        return;
                    }
                    wheelView.d();
                    return;
                }
            case 4:
                if (message.what != 1) {
                    throw new IllegalStateException("Unexpected value: " + message.what);
                }
                e5.d dVar2 = (e5.d) this.f3274b;
                dVar2.f36166d.getClass();
                try {
                    p216o5.a aVar = new p216o5.a();
                    aVar.f40028a = 4;
                    p216o5.c.a(aVar);
                    break;
                } catch (Exception unused) {
                    p198n5.h.a("EventSender", "action: removeOverdueEvents,failed", new Object[0]);
                }
                dVar2.l(null);
                return;
            case 5:
                int i13 = message.what;
                KeyboardView keyboardView = (KeyboardView) this.f3274b;
                if (i13 == 1) {
                    int i14 = message.arg1;
                    int[] iArr = KeyboardView.f26329l1;
                    keyboardView.k(i14);
                    return;
                }
                if (i13 == 2) {
                    keyboardView.f26379j.setVisibility(4);
                    return;
                }
                if (i13 == 3) {
                    int[] iArr2 = KeyboardView.f26329l1;
                    p066e9.b bVar2 = keyboardView.f26384p0[keyboardView.f26352N0];
                    keyboardView.b(keyboardView.f26342G0, bVar2.f36200i, bVar2.f36201j, keyboardView.f26369c1);
                    sendMessageDelayed(Message.obtain(this, 3), 50L);
                    return;
                }
                if (i13 != 4) {
                    return;
                }
                int i15 = keyboardView.f26353O0;
                if (i15 != 0 && (i7 = keyboardView.f26342G0) >= 0) {
                    p066e9.b[] bVarArr = keyboardView.f26384p0;
                    if (i7 < bVarArr.length && (i10 = (bVar = bVarArr[i7]).f36208q) != 0) {
                        HashMap map = keyboardView.f26380k0;
                        View view = (View) map.get(bVar);
                        keyboardView.f26335B = view;
                        if (view == null) {
                            View viewInflate = ((LayoutInflater) keyboardView.getContext().getSystemService("layout_inflater")).inflate(i15, (ViewGroup) null);
                            keyboardView.f26335B = viewInflate;
                            keyboardView.f26337C = (KeyboardView) viewInflate.findViewById(F8.d.keyboardView);
                            View viewFindViewById = keyboardView.f26335B.findViewById(F8.d.closeButton);
                            if (viewFindViewById != null) {
                                viewFindViewById.setOnClickListener(keyboardView);
                            }
                            keyboardView.f26337C.setOnKeyboardActionListener(new com.transsnet.palmpay.account.ui.view.a(keyboardView));
                            CharSequence charSequence = bVar.f36205n;
                            if (charSequence != null) {
                                Context context = keyboardView.getContext();
                                int paddingRight = keyboardView.getPaddingRight() + keyboardView.getPaddingLeft();
                                dVar = new p066e9.d(context, i10);
                                dVar.f36226i = 0;
                                p066e9.c cVar = new p066e9.c();
                                cVar.f36214e = new ArrayList();
                                cVar.f36217h = dVar;
                                cVar.f36211b = dVar.f36220c;
                                cVar.f36210a = dVar.f36219b;
                                cVar.f36212c = dVar.f36218a;
                                cVar.f36213d = dVar.f36221d;
                                cVar.f36215f = 12;
                                int i16 = 0;
                                int i17 = 0;
                                int i18 = 0;
                                int i19 = 0;
                                while (i16 < charSequence.length()) {
                                    int iCharAt = charSequence.charAt(i16);
                                    if (i18 < Integer.MAX_VALUE) {
                                        z8 = z10;
                                        if (dVar.f36219b + i19 + paddingRight > dVar.f36229l) {
                                        }
                                        p066e9.b bVar3 = new p066e9.b(cVar);
                                        bVar3.f36200i = i19;
                                        bVar3.f36201j = i17;
                                        bVar3.f36193b = String.valueOf((char) iCharAt);
                                        bVar3.f36192a = new int[]{iCharAt};
                                        i18++;
                                        i19 += bVar3.f36196e + bVar3.f36198g;
                                        dVar.f36227j.add(bVar3);
                                        cVar.f36214e.add(bVar3);
                                        if (i19 > dVar.f36226i) {
                                            dVar.f36226i = i19;
                                        }
                                        i16++;
                                        z10 = z8;
                                    } else {
                                        z8 = z10;
                                    }
                                    i17 += dVar.f36221d + dVar.f36220c;
                                    i18 = 0;
                                    i19 = 0;
                                    p066e9.b bVar4 = new p066e9.b(cVar);
                                    bVar4.f36200i = i19;
                                    bVar4.f36201j = i17;
                                    bVar4.f36193b = String.valueOf((char) iCharAt);
                                    bVar4.f36192a = new int[]{iCharAt};
                                    i18++;
                                    i19 += bVar4.f36196e + bVar4.f36198g;
                                    dVar.f36227j.add(bVar4);
                                    cVar.f36214e.add(bVar4);
                                    if (i19 > dVar.f36226i) {
                                        dVar.f36226i = i19;
                                    }
                                    i16++;
                                    z10 = z8;
                                }
                                z3 = z10;
                                dVar.f36225h = i17 + dVar.f36220c;
                                dVar.f36235r.add(cVar);
                            } else {
                                z3 = true;
                                dVar = new p066e9.d(keyboardView.getContext(), i10);
                            }
                            keyboardView.f26337C.setKeyboard(dVar);
                            keyboardView.f26337C.setPopupParent(keyboardView);
                            keyboardView.f26335B.measure(View.MeasureSpec.makeMeasureSpec(keyboardView.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(keyboardView.getHeight(), Integer.MIN_VALUE));
                            map.put(bVar, keyboardView.f26335B);
                            r16 = z3;
                        } else {
                            r16 = 1;
                            keyboardView.f26337C = (KeyboardView) view.findViewById(F8.d.keyboardView);
                        }
                        int[] iArr3 = keyboardView.f26392w;
                        keyboardView.getLocationInWindow(iArr3);
                        keyboardView.f26349L0 = keyboardView.getPaddingLeft() + bVar.f36200i;
                        keyboardView.f26351M0 = keyboardView.getPaddingTop() + bVar.f36201j;
                        keyboardView.f26349L0 = (keyboardView.f26349L0 + bVar.f36196e) - keyboardView.f26335B.getMeasuredWidth();
                        keyboardView.f26351M0 -= keyboardView.f26335B.getMeasuredHeight();
                        int paddingRight2 = keyboardView.f26335B.getPaddingRight() + keyboardView.f26349L0 + iArr3[0];
                        int paddingBottom = keyboardView.f26335B.getPaddingBottom() + keyboardView.f26351M0 + iArr3[r16];
                        KeyboardView keyboardView2 = keyboardView.f26337C;
                        keyboardView2.f26350M = paddingRight2 < 0 ? 0 : paddingRight2;
                        keyboardView2.f26355Q = paddingBottom;
                        PopupWindow popupWindow = keyboardView2.f26382o;
                        if (popupWindow.isShowing()) {
                            popupWindow.dismiss();
                        }
                        KeyboardView keyboardView3 = keyboardView.f26337C;
                        p066e9.d dVar3 = keyboardView.f26364a;
                        boolean z11 = dVar3 != null ? dVar3.f36222e : false;
                        p066e9.d dVar4 = keyboardView3.f26364a;
                        if (dVar4 != null) {
                            for (p066e9.b bVar5 : dVar4.f36223f) {
                                if (bVar5 != null) {
                                    bVar5.f36203l = z11;
                                }
                            }
                            if (dVar4.f36222e != z11) {
                                dVar4.f36222e = z11;
                                keyboardView3.e();
                            }
                        }
                        PopupWindow popupWindow2 = keyboardView.f26333A;
                        popupWindow2.setContentView(keyboardView.f26335B);
                        popupWindow2.setWidth(keyboardView.f26335B.getMeasuredWidth());
                        popupWindow2.setHeight(keyboardView.f26335B.getMeasuredHeight());
                        popupWindow2.showAtLocation(keyboardView, 0, paddingRight2, paddingBottom);
                        ?? r3 = r16;
                        keyboardView.f26343H = r3;
                        keyboardView.e();
                        keyboardView.f26354P0 = r3;
                        keyboardView.l(-1);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                int i20 = message.what;
                p216o5.c cVar2 = (p216o5.c) this.f3274b;
                if (i20 == 1) {
                    cVar2.d(true);
                    return;
                }
                if (i20 != 2) {
                    p198n5.h.c("EventSender", "Unexpected value: " + message.what, new Object[0]);
                    return;
                }
                removeMessages(2);
                cVar2.d(false);
                long j6 = cVar2.f40045f;
                if (j6 > 0) {
                    sendEmptyMessageDelayed(2, j6);
                    return;
                }
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public /* synthetic */ HandlerC0283f(Object obj, int i7) {
        this.f3273a = i7;
        this.f3274b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0283f(Object obj, Looper looper, int i7) {
        super(looper);
        this.f3273a = i7;
        this.f3274b = obj;
    }

    public HandlerC0283f(WheelView wheelView) {
        this.f3273a = 3;
        this.f3274b = wheelView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0283f(p216o5.c cVar, Looper looper) {
        super(looper);
        this.f3273a = 6;
        this.f3274b = cVar;
        long j6 = cVar.f40045f;
        if (j6 > 0) {
            sendEmptyMessageDelayed(2, j6);
        }
    }
}
