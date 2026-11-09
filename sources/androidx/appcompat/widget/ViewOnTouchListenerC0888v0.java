package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: androidx.appcompat.widget.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0888v0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f13019a;

    public ViewOnTouchListenerC0888v0(ListPopupWindow listPopupWindow) {
        this.f13019a = listPopupWindow;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        ListPopupWindow listPopupWindow = this.f13019a;
        if (action == 0 && (popupWindow = listPopupWindow.f12724p0) != null && popupWindow.isShowing() && x3 >= 0 && x3 < listPopupWindow.f12724p0.getWidth() && y8 >= 0 && y8 < listPopupWindow.f12724p0.getHeight()) {
            listPopupWindow.f12709X.postDelayed(listPopupWindow.f12705H, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        listPopupWindow.f12709X.removeCallbacks(listPopupWindow.f12705H);
        return false;
    }
}
