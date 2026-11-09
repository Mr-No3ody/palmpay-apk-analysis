package Y1;

import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.daimajia.swipe.SwipeLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeLayout f11271a;

    public a(SwipeLayout swipeLayout) {
        this.f11271a = swipeLayout;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        AdapterView<?> adapterView;
        int positionForView;
        int i7 = SwipeLayout.f21093u0;
        SwipeLayout swipeLayout = this.f11271a;
        if (swipeLayout.getOpenStatus() == d.f11282c) {
            ViewParent parent = swipeLayout.getParent();
            if ((parent instanceof AdapterView) && (positionForView = (adapterView = (AdapterView) parent).getPositionForView(swipeLayout)) != -1) {
                long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
                try {
                    Method declaredMethod = AbsListView.class.getDeclaredMethod("performLongPress", View.class, Integer.TYPE, Long.TYPE);
                    declaredMethod.setAccessible(true);
                    ((Boolean) declaredMethod.invoke(adapterView, swipeLayout, Integer.valueOf(positionForView), Long.valueOf(itemIdAtPosition))).getClass();
                    return true;
                } catch (Exception e10) {
                    F6.d.c("SwipeLayout", e10.getMessage());
                    if (adapterView.getOnItemLongClickListener() != null ? adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, swipeLayout, positionForView, itemIdAtPosition) : false) {
                        adapterView.performHapticFeedback(0);
                    }
                }
            }
        }
        return true;
    }
}
