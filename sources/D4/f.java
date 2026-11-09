package D4;

import A8.g;
import Ce.ViewOnClickListenerC0159a;
import J1.o;
import android.app.Activity;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.appcompat.app.AbstractActivityC0837o;
import androidx.core.app.H;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.highlight.IHighlighter;
import com.transsnet.palmpay.credit.view.FeeCalculateView;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import p198n5.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements IHighlighter, AnimatableValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1592b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f1591a = i7;
        this.f1592b = obj;
    }

    public static void d(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
    }

    public static f p(Activity activity) {
        return activity instanceof AbstractActivityC0837o ? new pub.devrel.easypermissions.helper.a((AbstractActivityC0837o) activity, 1) : new pub.devrel.easypermissions.helper.a(activity, 0);
    }

    public Object a(String str) {
        List listI = i(str);
        if (listI == null || listI.size() <= 0) {
            return null;
        }
        return listI.get(0);
    }

    public abstract String b();

    public ArrayList c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder("SELECT * FROM ");
        sb2.append(b());
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        if (!TextUtils.isEmpty(null)) {
            sb2.append(" ORDER BY null");
        }
        if (!TextUtils.isEmpty(str2)) {
            sb2.append(" LIMIT ");
            sb2.append(str2);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(null)) {
            sb2.append(" OFFSET null");
        }
        return h(sb2.toString());
    }

    public void e(Object obj, String str) {
        AbstractMap abstractMap = (AbstractMap) this.f1592b;
        if (!abstractMap.containsKey(str)) {
            abstractMap.put(str, new ArrayList(1));
        }
        i(str).add(obj);
    }

    public boolean f(String str) {
        SQLiteDatabase writableDatabase = ((Ye.c) this.f1592b).getWritableDatabase();
        String str2 = "DELETE FROM " + b() + " WHERE " + str;
        writableDatabase.beginTransaction();
        try {
            writableDatabase.execSQL(str2);
            writableDatabase.setTransactionSuccessful();
            return true;
        } catch (SQLException unused) {
            return false;
        } finally {
            writableDatabase.endTransaction();
            d(writableDatabase);
        }
    }

    public abstract void g(H h7);

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public c getHighlight(float f10, float f11) {
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) this.f1592b;
        G4.d centerOffsets = pieRadarChartBase.getCenterOffsets();
        float f12 = centerOffsets.f2987b;
        float f13 = f10 > f12 ? f10 - f12 : f12 - f10;
        float f14 = centerOffsets.f2988c;
        float fSqrt = (float) Math.sqrt(Math.pow(f11 > f14 ? f11 - f14 : f14 - f11, 2.0d) + Math.pow(f13, 2.0d));
        G4.d.c(centerOffsets);
        if (fSqrt <= pieRadarChartBase.getRadius()) {
            float fE = pieRadarChartBase.e(f10, f11);
            if (pieRadarChartBase instanceof PieChart) {
                pieRadarChartBase.getAnimator().getClass();
                fE /= 1.0f;
            }
            if (pieRadarChartBase.f(fE) >= 0) {
                pieRadarChartBase.getData();
                throw null;
            }
        }
        return null;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List getKeyframes() {
        return (List) this.f1592b;
    }

    public abstract ArrayList h(String str);

    public List i(String str) {
        return (List) ((AbstractMap) this.f1592b).get(str);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        List list = (List) this.f1592b;
        return list.isEmpty() || (list.size() == 1 && ((p243q1.a) list.get(0)).c());
    }

    public void j(String str) {
    }

    public abstract void k(int i7, String... strArr);

    public void l(Object obj) {
        synchronized (((ArrayList) this.f1592b)) {
            try {
                Iterator it = ((ArrayList) this.f1592b).iterator();
                while (it.hasNext()) {
                    try {
                        Object next = it.next();
                        if (next == null) {
                            it.remove();
                        } else {
                            u(next, obj);
                        }
                    } catch (ConcurrentModificationException e10) {
                        h.c("ListenerContainer", "Please avoid call register method in dispatchActions", new Object[0]);
                        throw e10;
                    } catch (Exception e11) {
                        h.b("ListenerContainer", e11);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void m(String str, W4.b bVar);

    public abstract String n();

    public abstract Context o();

    public void q(Poolable poolable) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1592b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(poolable);
        }
    }

    public void r(Object obj) {
        synchronized (((ArrayList) this.f1592b)) {
            Iterator it = ((ArrayList) this.f1592b).iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                try {
                    Object next = it.next();
                    if (next == null) {
                        it.remove();
                    } else if (next == obj) {
                        z3 = false;
                    }
                } catch (ConcurrentModificationException e10) {
                    h.c("ListenerContainer", "Please avoid call register method in dispatchActions", new Object[0]);
                    throw e10;
                }
            }
            if (z3) {
                ((ArrayList) this.f1592b).add(obj);
            }
        }
    }

    public abstract boolean s(String str);

    public abstract void t(String str, String str2, String str3, int i7, int i10, String... strArr);

    public String toString() {
        switch (this.f1591a) {
            case 5:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.f1592b;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public abstract void u(Object obj, Object obj2);

    public void v(Object obj) {
        synchronized (((ArrayList) this.f1592b)) {
            try {
                Iterator it = ((ArrayList) this.f1592b).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        it.remove();
                    } else if (next == obj) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public f(PieRadarChartBase pieRadarChartBase) {
        this.f1591a = 0;
        new ArrayList();
        this.f1592b = pieRadarChartBase;
    }

    public f(int i7) {
        this.f1591a = i7;
        switch (i7) {
            case 6:
                char[] cArr = o.f4478a;
                this.f1592b = new ArrayDeque(20);
                break;
            case 7:
                this.f1592b = new ArrayList();
                break;
        }
    }

    public f(FeeCalculateView feeCalculateView) {
        this.f1591a = 1;
        this.f1592b = feeCalculateView;
        feeCalculateView.f30742c.setVisibility(8);
        feeCalculateView.f30743d.setVisibility(8);
        feeCalculateView.f30744e.setVisibility(8);
        feeCalculateView.f30745f.setVisibility(8);
        feeCalculateView.f30746g.setVisibility(8);
        feeCalculateView.f30747i.setVisibility(8);
        feeCalculateView.setOnClickListener(new ViewOnClickListenerC0159a(this, 19));
        feeCalculateView.f30742c.setOnCheckedChangeListener(new g(this, 2));
    }
}
