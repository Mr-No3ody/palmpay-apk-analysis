package p377z5;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.hjq.toast.config.IToast;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements IToast {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f44445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f44446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f44451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f44452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44453i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f44454j;

    public b(Activity activity) {
        i iVar = new i(activity, this);
        iVar.f44467e = false;
        m mVar = new m();
        mVar.f44486a = activity;
        iVar.f44464b = mVar;
        this.f44454j = iVar;
    }

    @Override // com.hjq.toast.config.IToast
    public final void cancel() {
        switch (this.f44453i) {
            case 0:
                this.f44454j.b();
                break;
            default:
                this.f44454j.b();
                break;
        }
    }

    @Override // com.hjq.toast.config.IToast
    public final int getDuration() {
        return this.f44448d;
    }

    @Override // com.hjq.toast.config.IToast
    public final int getGravity() {
        return this.f44447c;
    }

    @Override // com.hjq.toast.config.IToast
    public final float getHorizontalMargin() {
        return this.f44451g;
    }

    @Override // com.hjq.toast.config.IToast
    public final float getVerticalMargin() {
        return this.f44452h;
    }

    @Override // com.hjq.toast.config.IToast
    public final View getView() {
        return this.f44445a;
    }

    @Override // com.hjq.toast.config.IToast
    public final int getXOffset() {
        return this.f44449e;
    }

    @Override // com.hjq.toast.config.IToast
    public final int getYOffset() {
        return this.f44450f;
    }

    @Override // com.hjq.toast.config.IToast
    public final void setDuration(int i7) {
        this.f44448d = i7;
    }

    @Override // com.hjq.toast.config.IToast
    public final void setGravity(int i7, int i10, int i11) {
        this.f44447c = i7;
        this.f44449e = i10;
        this.f44450f = i11;
    }

    @Override // com.hjq.toast.config.IToast
    public final void setMargin(float f10, float f11) {
        this.f44451g = f10;
        this.f44452h = f11;
    }

    @Override // com.hjq.toast.config.IToast
    public final void setText(int i7) {
        View view = this.f44445a;
        if (view == null) {
            return;
        }
        setText(view.getResources().getString(i7));
    }

    @Override // com.hjq.toast.config.IToast
    public final void setView(View view) {
        this.f44445a = view;
        if (view == null) {
            this.f44446b = null;
        } else {
            this.f44446b = findMessageView(view);
        }
    }

    @Override // com.hjq.toast.config.IToast
    public final void show() {
        switch (this.f44453i) {
            case 0:
                i iVar = this.f44454j;
                if (!iVar.f44466d) {
                    boolean z3 = Looper.myLooper() == Looper.getMainLooper();
                    h hVar = iVar.f44468f;
                    if (!z3) {
                        Handler handler = i.f44462h;
                        handler.removeCallbacks(hVar);
                        handler.post(hVar);
                    } else {
                        hVar.run();
                    }
                    break;
                }
                break;
            default:
                i iVar2 = this.f44454j;
                if (!iVar2.f44466d) {
                    boolean z8 = Looper.myLooper() == Looper.getMainLooper();
                    h hVar2 = iVar2.f44468f;
                    if (!z8) {
                        Handler handler2 = i.f44462h;
                        handler2.removeCallbacks(hVar2);
                        handler2.post(hVar2);
                    } else {
                        hVar2.run();
                    }
                    break;
                }
                break;
        }
    }

    @Override // com.hjq.toast.config.IToast
    public final void setText(CharSequence charSequence) {
        TextView textView = this.f44446b;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public b(Application application) {
        i iVar = new i(application, this);
        iVar.f44467e = true;
        m mVar = new m();
        mVar.f44487b = application;
        iVar.f44464b = mVar;
        this.f44454j = iVar;
    }
}
