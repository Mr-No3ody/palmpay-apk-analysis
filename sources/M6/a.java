package M6;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.C;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.SharedPreferencesManager;
import com.adjust.sdk.Util;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5775e;

    public /* synthetic */ a() {
        this.f5771a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5771a) {
            case 0:
                WeakReference weakReference = (WeakReference) this.f5773c;
                TextView textView = weakReference != null ? (TextView) weakReference.get() : null;
                if (textView != null) {
                    Long l5 = (Long) textView.getTag();
                    if (l5 != null) {
                        long jLongValue = (l5.longValue() + this.f5772b) - SystemClock.elapsedRealtime();
                        CharSequence charSequence = (CharSequence) this.f5775e;
                        if (jLongValue <= 0) {
                            textView.setEnabled(true);
                            WeakReference weakReference2 = (WeakReference) this.f5774d;
                            if (weakReference2 != null) {
                                View.OnClickListener onClickListener = (View.OnClickListener) weakReference2.get();
                                if (onClickListener != null) {
                                    onClickListener.onClick(textView);
                                }
                                this.f5774d = null;
                            }
                            textView.setText(charSequence);
                        } else {
                            textView.setEnabled(false);
                            textView.setText(((Object) charSequence) + "(" + String.valueOf(jLongValue / 1000) + "s)");
                            textView.postDelayed(this, 1000L);
                        }
                    } else {
                        textView.removeCallbacks(this);
                    }
                }
                break;
            case 1:
                Context context = (Context) this.f5773c;
                AdjustThirdPartySharingResult thirdPartySharingResult = SharedPreferencesManager.getDefaultInstance(context).getThirdPartySharingResult();
                if (thirdPartySharingResult == null) {
                    ActivityHandler.queueGetThirdPartySharingSettingsWithTimeout(this.f5772b, (OnThirdPartySharingSettingsReadListener) this.f5774d, ((AdjustInstance) this.f5775e).cachedThirdPartySharingTimeoutCallbacks, context);
                } else {
                    new Handler(context.getMainLooper()).post(new C(11, this, thirdPartySharingResult));
                }
                break;
            case 2:
                Context context2 = (Context) this.f5773c;
                String adidFromActivityStateFile = Util.getAdidFromActivityStateFile(context2);
                if (adidFromActivityStateFile == null) {
                    ActivityHandler.queueGetAdidWithTimeout(this.f5772b, (OnAdidReadListener) this.f5774d, ((AdjustInstance) this.f5775e).cachedAdidReadTimeoutCallbacks, context2);
                } else {
                    new Handler(context2.getMainLooper()).post(new C(12, this, adidFromActivityStateFile));
                }
                break;
            default:
                Context context3 = (Context) this.f5773c;
                AdjustAttribution attributionFromAttributionFile = Util.getAttributionFromAttributionFile(context3);
                if (attributionFromAttributionFile == null) {
                    ActivityHandler.queueGetAttributionWithTimeout(this.f5772b, (OnAttributionReadListener) this.f5774d, ((AdjustInstance) this.f5775e).cachedAttributionReadTimeoutCallbacks, context3);
                } else {
                    new Handler(context3.getMainLooper()).post(new C(13, this, attributionFromAttributionFile));
                }
                break;
        }
    }

    public /* synthetic */ a(AdjustInstance adjustInstance, Context context, Object obj, long j6, int i7) {
        this.f5771a = i7;
        this.f5775e = adjustInstance;
        this.f5773c = context;
        this.f5774d = obj;
        this.f5772b = j6;
    }
}
