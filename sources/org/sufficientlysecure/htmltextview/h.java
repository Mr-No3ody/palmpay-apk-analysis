package org.sufficientlysecure.htmltextview;

import Pa.r0;
import U2.B;
import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.text.Editable;
import android.text.Selection;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.EnumC1006u;
import androidx.camera.core.impl.EnumC1007v;
import androidx.camera.core.impl.EnumC1008w;
import androidx.camera.core.impl.EnumC1009x;
import androidx.camera.core.impl.EnumC1010y;
import androidx.camera.core.impl.EnumC1011z;
import androidx.camera.core.impl.O0;
import com.didi.drouter.store.IRouterProxy;
import com.palmpay.lib.bridgewrapper.version.VersionGetBridge;
import com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces;
import com.transsnet.palmpay.core.rnbridge.bridge.PPRouterBridge;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.DeviceInfoUploadBridge;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements Consumer, CameraCaptureResult, IRouterProxy, IAppDataInterfaces {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41129a;

    public /* synthetic */ h(int i7) {
        this.f41129a = i7;
    }

    public static boolean a(p228p0.b bVar, Editable editable, int i7, int i10, boolean z3) {
        int iMin;
        if (editable != null && i7 >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int iMax = Math.max(i7, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z8 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z8) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z8) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z8 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i10, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z10) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z10) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z10 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i7, 0);
                    iMin = Math.min(selectionEnd + i10, editable.length());
                }
                androidx.emoji2.text.q[] qVarArr = (androidx.emoji2.text.q[]) editable.getSpans(selectionStart, iMin, androidx.emoji2.text.q.class);
                if (qVarArr != null && qVarArr.length > 0) {
                    for (androidx.emoji2.text.q qVar : qVarArr) {
                        int spanStart = editable.getSpanStart(qVar);
                        int spanEnd = editable.getSpanEnd(qVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.reactivex.functions.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41129a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1006u getAeMode() {
        return EnumC1006u.f14132a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1007v getAeState() {
        return EnumC1007v.f14264a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1008w getAfMode() {
        return EnumC1008w.f14274a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1009x getAfState() {
        return EnumC1009x.f14279a;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces
    public String getAppInfo() {
        return r0.R0(null, null);
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1010y getAwbMode() {
        return EnumC1010y.f14287a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public EnumC1011z getAwbState() {
        return EnumC1011z.f14299a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public CaptureResult getCaptureResult() {
        return null;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public A getFlashState() {
        return A.f13828a;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public O0 getTagBundle() {
        return O0.f13940b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public long getTimestamp() {
        return -1L;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41129a) {
            case 6:
                return new VersionGetBridge();
            case 7:
                return new PPRouterBridge();
            default:
                return new DeviceInfoUploadBridge();
        }
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.IAppDataInterfaces
    public String getAppInfo(String str) {
        return r0.R0(null, str);
    }
}
