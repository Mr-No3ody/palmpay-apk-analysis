package org.sufficientlysecure.htmltextview;

import E.C0201f;
import E.e0;
import U2.B;
import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Operation;
import androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback;
import com.bumptech.glide.load.Option$CacheKeyUpdater;
import com.didi.drouter.store.IRouterProxy;
import com.hjq.toast.config.IToastStyle;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.palmpay.lib.bridgewrapper.storage.StorageSaveBridge;
import com.transsnet.palmpay.core.rnbridge.bridge.OrderDetailBridge;
import com.transsnet.palmpay.credit.businessLoan.rnbridge.AppSettingsBridge;
import io.reactivex.functions.Consumer;
import java.security.MessageDigest;
import java.util.logging.Level;
import org.greenrobot.eventbus.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements ProfileInstaller$DiagnosticsCallback, Consumer, Operation, Option$CacheKeyUpdater, ObjectConstructor, IRouterProxy, IToastStyle, Logger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41128a;

    public /* synthetic */ g(int i7) {
        this.f41128a = i7;
    }

    @Override // io.reactivex.functions.Consumer
    public /* bridge */ /* synthetic */ void accept(Object obj) {
    }

    @Override // androidx.camera.core.processing.Operation
    public Object apply(Object obj) {
        androidx.camera.core.processing.b bVar = (androidx.camera.core.processing.b) obj;
        ImageProxy imageProxy = (ImageProxy) bVar.f14371a;
        e0 e0Var = new e0(imageProxy, bVar.f14374d, new C0201f(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), bVar.f14376f, bVar.f14377g));
        e0Var.setCropRect(bVar.f14375e);
        return e0Var;
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object callMethod(Object obj, String str, Object[] objArr) throws B {
        switch (this.f41128a) {
            case 6:
                throw new B(11);
            case 7:
                throw new B(11);
            default:
                throw new B(11);
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
    public Object construct() {
        return new com.nimbusds.jose.shaded.gson.internal.l(true);
    }

    @Override // com.hjq.toast.config.IToastStyle
    public View createView(Context context) {
        TextView textView = new TextView(context);
        textView.setId(R.id.message);
        textView.setGravity(17);
        textView.setTextColor(context.getColor(L6.b.ppColorButtonTextWhite));
        textView.setTextSize(0, context.getResources().getDimensionPixelSize(L6.c.ppToastTextSize));
        textView.setMaxWidth(context.getResources().getDimensionPixelSize(L6.c.ppToastBgMaxWidth));
        textView.setMinWidth(context.getResources().getDimensionPixelSize(L6.c.ppToastBgMinWidth));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(L6.c.ppToastHorizontalMargin);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(L6.c.ppToastVerticalMargin);
        textView.setPaddingRelative(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(context.getColor(L6.b.ppColorMask));
        gradientDrawable.setCornerRadius(TypedValue.applyDimension(0, context.getResources().getDimensionPixelSize(L6.c.ppToastBgCornerRadius), context.getResources().getDisplayMetrics()));
        textView.setBackground(gradientDrawable);
        textView.setZ(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        return textView;
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str) {
        System.out.println("[" + level + "] " + str);
    }

    @Override // com.didi.drouter.store.IRouterProxy
    public Object newInstance(Context context) {
        switch (this.f41128a) {
            case 6:
                return new StorageSaveBridge();
            case 7:
                return new OrderDetailBridge();
            default:
                return new AppSettingsBridge();
        }
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onResultReceived(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str, Throwable th) {
        System.out.println("[" + level + "] " + str);
        th.printStackTrace(System.out);
    }

    @Override // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
    public void onDiagnosticReceived(int i7, Object obj) {
    }

    @Override // com.bumptech.glide.load.Option$CacheKeyUpdater
    public void update(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
