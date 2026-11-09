package E;

import android.app.Dialog;
import android.database.Cursor;
import android.hardware.camera2.CaptureRequest;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;
import androidx.camera.camera2.internal.compat.quirk.StillCaptureFlashStopRepeatingQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.AbstractC0970b0;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.y0;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import com.transsnet.adsdk.widgets.interfaces.AdShowCallback;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import com.transsnet.palmpay.util.CloseUtils;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class N implements ObservableOnSubscribe, AdShowCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1938b;

    public /* synthetic */ N(int i7, boolean z3) {
        this.f1937a = i7;
    }

    public static androidx.camera.core.impl.T a(androidx.camera.core.impl.T t) {
        androidx.camera.core.impl.S s3 = new androidx.camera.core.impl.S();
        s3.f13957c = t.f13968c;
        Iterator it = Collections.unmodifiableList(t.f13966a).iterator();
        while (it.hasNext()) {
            s3.f13955a.add((AbstractC0970b0) it.next());
        }
        s3.c(t.f13967b);
        C0992m0 c0992m0B = C0992m0.b();
        c0992m0B.insertOption(androidx.camera.camera2.impl.b.k(CaptureRequest.FLASH_MODE), 0);
        s3.c(new androidx.camera.camera2.impl.b(C1000q0.a(c0992m0B), 2));
        return s3.d();
    }

    public boolean b(ArrayList arrayList, boolean z3) {
        if (!this.f1938b || !z3) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean c(ArrayList arrayList, boolean z3) {
        if (!this.f1938b || !z3) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) ((CaptureRequest) it.next()).get(CaptureRequest.CONTROL_AE_MODE)).intValue();
            if (iIntValue == 2 || iIntValue == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // com.transsnet.adsdk.widgets.interfaces.AdShowCallback
    public void showCallback(Dialog dialog) {
        switch (this.f1937a) {
            case 7:
                super.showCallback(dialog);
                if (this.f1938b && dialog != null) {
                    dialog.show();
                    break;
                }
                break;
            default:
                super.showCallback(dialog);
                if (this.f1938b && dialog != null) {
                    dialog.show();
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) throws Throwable {
        Cursor cursor;
        String str = "+";
        Cursor cursorQuery = null;
        int i7 = 1;
        switch (this.f1937a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        cursorQuery = BaseApplication.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("data1");
                            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("display_name");
                            int i10 = 0;
                            while (cursorQuery.moveToNext()) {
                                String string = cursorQuery.getString(columnIndexOrThrow);
                                String string2 = cursorQuery.getString(columnIndexOrThrow2);
                                if (!TextUtils.isEmpty(string)) {
                                    i10++;
                                    arrayList.add(new PalmPayContact(String.valueOf(i10), string2, this.f1938b ? Z4.e.k(string) : string.trim().replace(" ", "").replace("-", "").replace(str, ""), 0));
                                }
                                str = str;
                            }
                        }
                        CloseUtils.closeIO(cursorQuery);
                        break;
                    } catch (Exception e10) {
                        F6.d.c("d", "subscribe2: ", e10);
                        CloseUtils.closeIO(cursorQuery);
                    }
                    Collections.sort(arrayList, new Gb.Q(5));
                    observableEmitter.onNext(arrayList);
                    observableEmitter.onComplete();
                    return;
                } catch (Throwable th) {
                    CloseUtils.closeIO(cursorQuery);
                    throw th;
                }
            default:
                ArrayList arrayList2 = new ArrayList();
                try {
                    try {
                        cursorQuery = BaseApplication.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"data1", "display_name"}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("data1");
                                int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("display_name");
                                int i11 = 0;
                                while (cursorQuery.moveToNext()) {
                                    String string3 = cursorQuery.getString(columnIndexOrThrow3);
                                    String string4 = cursorQuery.getString(columnIndexOrThrow4);
                                    if (TextUtils.isEmpty(string3)) {
                                        cursor = cursorQuery;
                                    } else {
                                        i11 += i7;
                                        cursor = cursorQuery;
                                        try {
                                            arrayList2.add(new PalmPayContact(String.valueOf(i11), string4, this.f1938b ? p059e1.a.s(string3) : string3.trim().replace(" ", "").replace("-", "").replace("+", ""), 0));
                                        } catch (Exception e11) {
                                            e = e11;
                                            cursorQuery = cursor;
                                            F6.d.c("h", "subscribe2: ", e);
                                            CloseUtils.closeIO(cursorQuery);
                                            Collections.sort(arrayList2, new Fb.e());
                                            observableEmitter.onNext(arrayList2);
                                            observableEmitter.onComplete();
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursorQuery = cursor;
                                            CloseUtils.closeIO(cursorQuery);
                                            throw th;
                                        }
                                    }
                                    cursorQuery = cursor;
                                    i7 = 1;
                                }
                            } catch (Exception e12) {
                                e = e12;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        Closeable[] closeableArr = new Closeable[i7];
                        closeableArr[0] = cursorQuery;
                        CloseUtils.closeIO(closeableArr);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    break;
                } catch (Exception e13) {
                    e = e13;
                }
                Collections.sort(arrayList2, new Fb.e());
                observableEmitter.onNext(arrayList2);
                observableEmitter.onComplete();
                return;
        }
    }

    public String toString() {
        switch (this.f1937a) {
            case 0:
                return "Metadata{mIsReversedHorizontal=" + this.f1938b + ", mIsReversedVertical=false, mLocation=null}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ N(boolean z3, int i7) {
        this.f1937a = i7;
        this.f1938b = z3;
    }

    public N(y0 y0Var, int i7) {
        this.f1937a = i7;
        switch (i7) {
            case 5:
                this.f1938b = y0Var.a(UseTorchAsFlashQuirk.class);
                break;
            default:
                this.f1938b = y0Var.a(Preview3AThreadCrashQuirk.class);
                break;
        }
    }

    public N(int i7) {
        this.f1937a = i7;
        switch (i7) {
            case 4:
                this.f1938b = androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
                break;
            case 5:
            default:
                this.f1938b = ((StillCaptureFlashStopRepeatingQuirk) androidx.camera.camera2.internal.compat.quirk.a.f13477a.b(StillCaptureFlashStopRepeatingQuirk.class)) != null;
                break;
            case 6:
                this.f1938b = androidx.camera.core.internal.compat.quirk.a.f14321a.b(SurfaceOrderQuirk.class) != null;
                break;
        }
    }
}
