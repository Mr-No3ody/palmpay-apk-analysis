package H1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3581a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f3582b;

    public d(e eVar) {
        this.f3582b = new WeakReference(eVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f3581a) {
            case 0:
                e eVar = (e) this.f3582b.get();
                if (eVar != null) {
                    ArrayList arrayList = eVar.f3585b;
                    if (!arrayList.isEmpty()) {
                        View view = eVar.f3584a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = eVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = eVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((SizeReadyCallback) it.next()).onSizeReady(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(eVar.f3586c);
                                }
                                eVar.f3586c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                l lVar = (l) this.f3582b.get();
                if (lVar != null) {
                    ArrayList arrayList2 = lVar.f3601b;
                    if (!arrayList2.isEmpty()) {
                        ImageView imageView = lVar.f3600a;
                        int paddingRight2 = imageView.getPaddingRight() + imageView.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                        int iA3 = lVar.a(imageView.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = imageView.getPaddingBottom() + imageView.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
                        int iA4 = lVar.a(imageView.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iA3 > 0 || iA3 == Integer.MIN_VALUE) {
                            if (iA4 > 0 || iA4 == Integer.MIN_VALUE) {
                                Iterator it2 = new ArrayList(arrayList2).iterator();
                                while (it2.hasNext()) {
                                    ((SizeReadyCallback) it2.next()).onSizeReady(iA3, iA4);
                                }
                                ViewTreeObserver viewTreeObserver2 = imageView.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(lVar.f3602c);
                                }
                                lVar.f3602c = null;
                                arrayList2.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public d(l lVar) {
        this.f3582b = new WeakReference(lVar);
    }
}
